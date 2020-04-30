package org.reaction.build.simsg;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import org.moflon.core.utilities.LogUtils;
import org.reaction.dsl.ReactionLanguageStandaloneSetup;
import org.reaction.dsl.reactionLanguage.ReactionModel;
import org.reaction.ibex.patternCreation.GTCreator;
import org.reaction.ibex.patternCreation.IBeXCreator;
import org.reaction.intermTrafo.transformation.IntermTransformation;
import org.reaction.reactionmodel.generator.ContainerEMF;
import org.reaction.reactionmodel.generator.ContainerGenerator;
import org.simsg.ui.build.ModelBuilderExtension;
import org.simsg.ui.build.SimSGBuilder;

import GTLanguage.GTRuleSet;
import IntermediateModel.IntermediateModelContainer;

public class ReactionModelBuilder implements ModelBuilderExtension {
	
	public static final Logger logger = Logger.getLogger(ReactionModelBuilder.class);

	@Override
	public void run(final IProject project, final IProgressMonitor monitor) {
		logger.log(Priority.INFO, "Running SimSGModelBuilder for Re.action:");
		double tic = System.currentTimeMillis();
		ReactionLanguageStandaloneSetup.doSetup();
		
		logger.log(Priority.INFO, "Creating metamodels from specifications..");
		List<IFile> reactFiles = null;
		try {
			reactFiles = getFiles(project);
		} catch (Exception e) {
			logger.error("Could not gather necessary .react-files. Error: \n" + e.getMessage());
			return;
		}
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Map<IFile, ReactionModel> editorModels = new HashMap<>();
		
		reactFiles.forEach(reactFile -> {
			URI uri = URI.createPlatformResourceURI(reactFile.getFullPath().toString(), true);
			Resource file = resourceSet.getResource(uri, true);
			try {
				EcoreUtil2.resolveLazyCrossReferences(file, () -> false);
			} catch (WrappedException e) {
				logger.log(Priority.INFO, String.format("Error resolving cross references in file %s.", reactFile.getName()));
				return;
			}

			ReactionModel editorModel = (ReactionModel) file.getContents().get(0);
			editorModels.put(reactFile, editorModel);
		});
		EcoreUtil.resolveAll(resourceSet);
		
		Map<ReactionModel, IntermediateModelContainer> intermediateModels = new HashMap<>();
		editorModels.values().forEach(editorModel -> {
			IntermTransformation trafo = new IntermTransformation(editorModel);
			intermediateModels.put(editorModel, trafo.generateIntermediateModel());
		});
		
		IFolder folder = project.getFolder(SimSGBuilder.DEFAULT_METAMODEL_LOCATION);
		IFolder instancesFolder = project.getFolder(SimSGBuilder.DEFAULT_MODEL_LOCATION);
		intermediateModels.values().forEach(iModel -> {
			saveResource(iModel, folder.getFullPath().toPortableString()+"/"+iModel.getName()+"_intermediate.xmi");
		});
		
		Map<ReactionModel, EPackage> metaModels = new HashMap<>();
		intermediateModels.forEach((editorModel, intermediateModel) -> {
			ContainerGenerator gen = new ContainerEMF(intermediateModel);
			try {
				gen.doGenerate(instancesFolder.getFullPath().toPortableString()+"/"+intermediateModel.getName()+"_container.xmi", folder.getFullPath().toPortableString()+"/"+intermediateModel.getName()+".ecore");
				metaModels.put(editorModel, gen.getMetamodel());
				org.eclipse.emf.ecore.EPackage.Registry reg = EPackage.Registry.INSTANCE;
				reg.put(gen.getMetamodel().getNsURI(), gen.getMetamodel());
			} catch (Exception e) {
				logger.error("Could not generate metamodels. Error: \n" + e.getMessage());
				return;
			}
		});
		
		Map<ReactionModel, IBeXPatternSet> ibexPatterns = new HashMap<>();
		intermediateModels.forEach((editorModel, intermediateModel) -> {
			IBeXCreator creator = new IBeXCreator(intermediateModel, metaModels.get(editorModel));
			ibexPatterns.put(editorModel, creator.getIBeXPatternSet());
			creator.savePatternSet(folder.getFullPath().toPortableString()+"/"+intermediateModel.getName()+"_ibexpatterns.xmi");
		});
		
		Map<ReactionModel, GTRuleSet> gtRules = new HashMap<>();
		intermediateModels.forEach((editorModel, intermediateModel) -> {
			GTCreator creator = new GTCreator(ibexPatterns.get(editorModel));
			gtRules.put(editorModel, creator.getGTRuleSet());
			creator.saveRuleSet(folder.getFullPath().toPortableString()+"/"+intermediateModel.getName()+"_gtrules.xmi");
		});
		
		//cleanup
		intermediateModels.values().forEach(x -> x.eResource().unload());
		metaModels.values().forEach(x -> x.eResource().unload());
		ibexPatterns.values().forEach(x -> x.eResource().unload());
		gtRules.values().forEach(x -> x.eResource().unload());
		
		double toc = System.currentTimeMillis();
		logger.log(Priority.INFO, "Creating metamodels from specifications.. Done! ("+ (toc-tic)/1000.0 + " seconds.)");
	}
	
	public static void saveResource(EObject model, String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		URI uri = URI.createFileURI(path);
		Resource modelResource = rs.createResource(uri);
		modelResource.getContents().add(model);
		
		Map<Object, Object> saveOptions = ((XMIResource)modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		try {
			((XMIResource)modelResource).save(saveOptions);
		} catch (IOException e) {
			LogUtils.error(logger, "Couldn't save resource: \n "+e.getMessage());
		}
//		modelResource.unload();
	}
	
	/**
	 * Returns the list of .react files.
	 * 
	 * @return the list of files
	 */
	private List<IFile> getFiles(final IProject project) throws Exception {
		List<IFile> files = new LinkedList<>();
		crawlSubfolders(project.getFolder(SimSGBuilder.DEFAULT_SRC_LOCATION), files); 
		return files.stream() //
				.filter(f -> "react".equals(f.getFileExtension()) && f.exists()) //
				.collect(Collectors.toList());
	}
	
	private void crawlSubfolders(final IFolder root, final List<IFile> files) throws CoreException {
		if(!root.exists())
			return;
		IResource[] members = root.members();
		for(int i=0; i<members.length; i++) {
			IResource current = members[i];
			if(current.getType() == IResource.FILE) {
				files.add((IFile) current);
			}else if (current.getType() == IResource.FOLDER) {
				crawlSubfolders((IFolder) current, files);
			}
		}
		
	}

}
