package org.reaction.build.simsg;

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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.reaction.dsl.ReactionLanguageStandaloneSetup;
import org.reaction.dsl.reactionLanguage.ReactionModel;
import org.simsg.ui.build.ModelBuilderExtension;
import org.simsg.ui.build.SimSGBuilder;

public class ReactionModelBuilder implements ModelBuilderExtension {
	
	public static final Logger logger = Logger.getLogger(ReactionModelBuilder.class);

	@Override
	public void run(final IProject project, final IProgressMonitor monitor) {
		logger.log(Priority.INFO, "Running SimSGModelBuilder for Re.action:");
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
		
		
		
		IFolder folder = project.getFolder(SimSGBuilder.DEFAULT_METAMODEL_LOCATION);
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
