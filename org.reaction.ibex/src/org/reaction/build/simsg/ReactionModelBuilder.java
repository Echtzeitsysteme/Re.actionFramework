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
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import org.moflon.core.utilities.LogUtils;
import org.reaction.dsl.ReactionLanguageStandaloneSetup;
import org.reaction.dsl.reactionLanguage.ReactionModel;
import org.reaction.ibex.patternCreation.GTCreator;
import org.reaction.ibex.patternCreation.IBeXCreator;
import org.reaction.intermTrafo.transformation.IntermTransformation;
import org.reaction.reactionmodel.generator.ContainerEMF;
import org.reaction.reactionmodel.generator.ContainerGenerator;
import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;
import org.simsg.ui.build.ModelBuilderExtension;
import org.simsg.ui.build.SimSGBuilder;

import GTLanguage.GTRule;
import GTLanguage.GTRuleSet;
import IntermediateModel.IntermCommand;
import IntermediateModel.IntermObservable;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermediateModelContainer;
import ReactionModel.ReactionContainer;
import SimulationDefinition.PatternObservation;
import SimulationDefinition.PatternTerminationCondition;
import SimulationDefinition.SimDefinition;
import SimulationDefinition.SimpleTerminationCondition;
import SimulationDefinition.SimulationDefinitionFactory;
import SimulationDefinition.StochasticRate;

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
		Map<ReactionModel, ReactionContainer> containerModels = new HashMap<>();
		intermediateModels.forEach((editorModel, intermediateModel) -> {
			ContainerGenerator gen = new ContainerEMF(intermediateModel);
			try {
				gen.doGenerate(instancesFolder.getFullPath().toPortableString()+"/"+intermediateModel.getName()+"_container.xmi", folder.getFullPath().toPortableString()+"/"+intermediateModel.getName()+".ecore");
				metaModels.put(editorModel, gen.getMetamodel());
				org.eclipse.emf.ecore.EPackage.Registry reg = EPackage.Registry.INSTANCE;
				reg.put(gen.getMetamodel().getNsURI(), gen.getMetamodel());
				containerModels.put(editorModel, gen.getContainerModel());
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
		
		IFolder definitionsFolder = project.getFolder(SimSGBuilder.DEFAULT_DEFINITION_LOCATION);
		Map<ReactionModel, SimDefinition> definitions = new HashMap<>();
		metaModels.forEach((editorModel, metamodel) -> {
			GTRuleSet gtRulesSet = gtRules.get(editorModel);
			IBeXPatternSet ibexPatternSet = ibexPatterns.get(editorModel);
			IntermediateModelContainer intermediateModel = intermediateModels.get(editorModel);
			
			SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator(metamodel.getName());
			gen.addMetaModel(metamodel);
			gen.setGtRules(gtRulesSet);
			gen.setIBeXPatterns(ibexPatternSet);
			gen.setModelURI(instancesFolder.getLocation()+"/"+intermediateModel.getName()+"_container.xmi");
//			gen.setModelURI(containerModels.get(editorModel).eResource().getURI().);
			
			addComponentsToDefinition(gen.getDefinition(), gtRulesSet, ibexPatternSet, intermediateModel);
			gen.saveDefinition(definitionsFolder.getFullPath().toPortableString()+"/"+intermediateModel.getName()+"_definition.xmi");
			definitions.put(editorModel, gen.getDefinition());
		});
		
		//cleanup
		intermediateModels.values().stream().filter(x -> x.eResource() != null).forEach(x -> x.eResource().unload());
		metaModels.values().stream().filter(x -> x.eResource() != null).forEach(x -> x.eResource().unload());
		ibexPatterns.values().stream().filter(x -> x.eResource() != null).forEach(x -> x.eResource().unload());
		gtRules.values().stream().filter(x -> x.eResource() != null).forEach(x -> x.eResource().unload());
		definitions.values().stream().filter(x -> x.eResource() != null).forEach(x -> x.eResource().unload());
		containerModels.values().stream().filter(x -> x.eResource() != null).forEach(x -> x.eResource().unload());
		
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
	
	public static void addComponentsToDefinition(SimDefinition definition, GTRuleSet rules, IBeXPatternSet patterns, IntermediateModelContainer intermediateModel) {
		
		intermediateModel.getComponents().stream()
			.filter(component -> (component instanceof IntermRule))
			.map(rule -> (IntermRule)rule).forEach(rule -> {
				addRuleRateAnnotation(definition, rules, rule.getName(), rule.getRate());
			});
		
		intermediateModel.getComponents().stream()
			.filter(component -> (component instanceof IntermObservable))
			.map(obs -> (IntermObservable)obs).forEach(obs -> {
				addPatternObservation(definition, "obs_"+obs.getName(), patterns);
			});
		
		intermediateModel.getComponents().stream()
			.filter(component -> (component instanceof IntermCommand))
			.map(comm -> (IntermCommand)comm).forEach(comm -> {
				switch (comm.getType()) {
				case TIME:
					addTerminationConditionTime(definition, comm.getCnt());
					break;
				case ITERATIONS:
					addTerminationConditionIterations(definition, (int)comm.getCnt());
					break;
				case MATCHES:
					addTerminationConditionPattern(definition, comm.getPatternToMatch().getName(), (int)comm.getCnt());	//TODO: deliver correct pattern name parameter
				}
			});
		
	}
	
	public static void addRuleRateAnnotation(SimDefinition definition, GTRuleSet rules, String ruleName, double rate) {
		GTRule rule = null;
		for (GTRule r : rules.getRules()) {
			if (r.getName().equals(ruleName)) {
				rule = r;
				break;
			}
		}
		if (rule == null) {
			System.err.println("Rule with name: <" + ruleName + "> not found!");
			return;
		}
		StochasticRate annotation = SimulationDefinitionFactory.eINSTANCE.createStochasticRate();
		annotation.setGTRule(rule);
		annotation.setRate(rate);
		definition.getRuleAnnotations().add(annotation);
	}
	
	public static void addPatternObservation(SimDefinition definition, String patternName, IBeXPatternSet patterns) {
		IBeXContextPattern pattern = null;
		for (IBeXContext p : patterns.getContextPatterns()) {
			if (p.getName().equals(patternName)) {
				pattern = (IBeXContextPattern) p;
				break;
			}
		}
		if (pattern == null) {
			System.err.println("Pattern with name: <" + patternName + "> not found!");
			return;
		}
		PatternObservation obs = SimulationDefinitionFactory.eINSTANCE.createPatternObservation();
		obs.setPattern(pattern);
		obs.setName(patternName);
		definition.getObservations().add(obs);
	}
	
	public static void addTerminationConditionIterations(SimDefinition definition, int iterations) {
		SimpleTerminationCondition term = SimulationDefinitionFactory.eINSTANCE.createSimpleTerminationCondition();
		term.setMaxIterations(iterations);
		definition.getTerminationConditions().add(term);
	}

	public static void addTerminationConditionTime(SimDefinition definition, double time) {
		SimpleTerminationCondition term = SimulationDefinitionFactory.eINSTANCE.createSimpleTerminationCondition();
		term.setMaxSimulationTime(time);
		definition.getTerminationConditions().add(term);
	}

	public static void addTerminationConditionPattern(SimDefinition definition, String patternName, int threshold) {
		IBeXContextPattern pattern = null;
		for (IBeXContext p : definition.getIbexPatternSet().getContextPatterns()) {
			if (p.getName().equals(patternName)) {
				pattern = (IBeXContextPattern) p;
				break;
			}
		}
		if (pattern == null) {
			System.err.println("Pattern with name: <" + patternName + "> not found!");
			return;
		}

		PatternTerminationCondition term = SimulationDefinitionFactory.eINSTANCE.createPatternTerminationCondition();
		term.setPattern(pattern);
		term.setThreshold(threshold);
		definition.getTerminationConditions().add(term);
	}

}
