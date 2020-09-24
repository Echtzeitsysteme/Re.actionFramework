package org.reaction.ibex.patternCreation;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternModelPackage;

import IntermediateModel.IntermCommand;
import IntermediateModel.IntermComponent;
import IntermediateModel.IntermObservable;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermediateModelContainer;
import SimulationDefinition.*;

public class SimDefCreator {

	private IntermediateModelContainer model;
	private String trgProjectLocation;

	private URI ibexPatternsUri;
	private URI modelUri;
	private IBeXModel ibexModel;

	private List<IntermRule> modelRules;
	private List<IntermObservable> modelObs;
	private List<IntermCommand> modelCommands;

	private SimDefinition definition;
	private SimulationDefinitionFactory factory = SimulationDefinitionFactory.eINSTANCE;

	public SimDefCreator(IntermediateModelContainer model, String trgProjectLocation) {
		this.model = model;
		this.trgProjectLocation = trgProjectLocation;
		init();
	}

	private void init() {
		definition = factory.createSimDefinition();
		definition.setName(model.getName() + "Model");
		setIBeXModel(trgProjectLocation + "/model/ibex-patterns.xmi");
		setModelURI(trgProjectLocation + "/instances/simulation_instances/"+model.getName()+"Model.xmi");

		setModelComponents();

		createDefinition();
	}

	private void createDefinition() {

		for (IntermObservable obs : modelObs) {
			addPatternObservation("obs_"+obs.getName());
		}

		for (IntermCommand comm : modelCommands) {
			switch (comm.getType()) {
			case TIME:
				addTerminationConditionTime(comm.getCnt());
				break;
			case ITERATIONS:
				addTerminationConditionIterations((int)comm.getCnt());
				break;
			case MATCHES:
				addTerminationConditionPattern(comm.getPatternToMatch().getName(), (int)comm.getCnt());	//TODO: deliver correct pattern name parameter
				break;
			}
		}
	}

	private void setModelComponents() {
		modelRules = new LinkedList<>();
		modelObs = new LinkedList<>();
		modelCommands = new LinkedList<>();

		List<IntermComponent> components = model.getComponents();

		for (IntermComponent comp : components) {
			if (comp instanceof IntermRule) {
				modelRules.add((IntermRule) comp);
			}
			if (comp instanceof IntermObservable) {
				modelObs.add((IntermObservable) comp);
			}
			if (comp instanceof IntermCommand) {
				modelCommands.add((IntermCommand) comp);
			}
		}
	}

	public void setIBeXModel(String path) {
		setIBeXModelURI(path);
		setIBeXModel();
	}

	public void setIBeXModel(URI uri) {
		setIBeXModelURI(uri);
		setIBeXModel();
	}

	public void setModelURI(String path) {
		URI fileUri = URI.createFileURI(path);
		setModelURI(fileUri);
	}

	public void setModelURI(URI uri) {
		modelUri = uri;
		definition.setSimulationModelURI(uri.toString());
	}

	public void addPatternObservation(String patternName) {
		IBeXContextPattern pattern = null;
		for (IBeXContext p : ibexModel.getPatternSet().getContextPatterns()) {
			if (p.getName().equals(patternName)) {
				pattern = (IBeXContextPattern) p;
				break;
			}
		}
		if (pattern == null) {
			System.err.println("Pattern with name: <" + patternName + "> not found!");
			return;
		}
		PatternObservation obs = factory.createPatternObservation();
		obs.setPattern(pattern);
		obs.setName(patternName);
		definition.getObservations().add(obs);
	}

	public void addTerminationConditionIterations(int iterations) {
		SimpleTerminationCondition term = factory.createSimpleTerminationCondition();
		term.setMaxIterations(iterations);
		definition.getTerminationConditions().add(term);
	}

	public void addTerminationConditionTime(double time) {
		SimpleTerminationCondition term = factory.createSimpleTerminationCondition();
		term.setMaxSimulationTime(time);
		definition.getTerminationConditions().add(term);
	}

	public void addTerminationConditionPattern(String patternName, int threshold) {
		IBeXContextPattern pattern = null;
		for (IBeXContext p : ibexModel.getPatternSet().getContextPatterns()) {
			if (p.getName().equals(patternName)) {
				pattern = (IBeXContextPattern) p;
				break;
			}
		}
		if (pattern == null) {
			System.err.println("Pattern with name: <" + patternName + "> not found!");
			return;
		}

		PatternTerminationCondition term = factory.createPatternTerminationCondition();
		term.setPattern(pattern);
		term.setThreshold(threshold);
		definition.getTerminationConditions().add(term);
	}

	public SimDefinition getDefinition() {
		return definition;
	}

	public void saveDefinition(String path) {
		URI fileUri = URI.createFileURI(path);
		saveDefinition(fileUri);
	}

	public void saveDefinition(URI uri) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource defResource = rs.createResource(uri);
		defResource.getContents().add(definition);

		Map<Object, Object> saveOptions = ((XMIResource) defResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);

		try {
			((XMIResource) defResource).save(saveOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("SimulationDefinition saved to: " + uri.path());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Simulation-Definition name: " + definition.getName());
		sb.append("Contained URIs: \n");
		sb.append("IBeXModel-URI: " + ibexPatternsUri + "\n");
		sb.append("SimulationModel-URI: " + modelUri + "\n");
		return sb.toString();
	}

	// private helper methods
	private void setIBeXModelURI(String path) {
		URI fileUri = URI.createFileURI(path);
		setIBeXModelURI(fileUri);
	}

	private void setIBeXModelURI(URI uri) {
		ibexPatternsUri = uri;
		definition.setIbexModelURI(uri.toString());
	}

	private void setIBeXModel() {
		IBeXPatternModelPackage.eINSTANCE.eClass();
		IBeXModel patterns = null;
		try {
			Resource rs = loadResource(ibexPatternsUri);
			patterns = (IBeXModel) rs.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.ibexModel = patterns;
	}

	public static Resource loadResource(URI uri) throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource modelResource = rs.getResource(uri, true);
		if (modelResource == null)
			throw new IOException("File did not contain a valid model.");

		return modelResource;
	}

	public static Resource loadEcoreResource(URI uri) throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		Resource modelResource = rs.getResource(uri, true);
		if (modelResource == null)
			throw new IOException("File did not contain a vaild metamodel.");

		return modelResource;
	}

}
