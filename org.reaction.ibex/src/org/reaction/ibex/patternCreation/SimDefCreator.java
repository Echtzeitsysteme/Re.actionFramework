package org.reaction.ibex.patternCreation;

import GTLanguage.GTRuleSet;
import ecoreBCModel.CommandType;
import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermCommand;
import ecoreBCModel.IntermComponent;
import ecoreBCModel.IntermObservable;
import ecoreBCModel.IntermRule;
import ecoreBCModel.IntermediateModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xtext.biochemics.dotDsl.TerminateCommand;

import GTLanguage.GTLanguagePackage;
import GTLanguage.GTRule;
import IBeXLanguage.IBeXContext;
import IBeXLanguage.IBeXContextPattern;
import IBeXLanguage.IBeXLanguagePackage;
import IBeXLanguage.IBeXPatternSet;
import SimulationDefinition.PatternObservation;
import SimulationDefinition.SimDefinition;
import SimulationDefinition.SimpleTerminationCondition;
import SimulationDefinition.PatternTerminationCondition;
import SimulationDefinition.SimulationDefinitionFactory;
import SimulationDefinition.StochasticRate;

public class SimDefCreator {

	private IntermediateModel model;
	private String trgProjectLocation;

	private URI gtRulesUri;
	private URI ibexPatternsUri;
	private Map<String, URI> metaModelUris = new HashMap<>();
	private URI modelUri;

	private List<IntermRule> modelRules;
	private List<IntermObservable> modelObs;
	private List<IntermCommand> modelCommands;

	private SimDefinition definition;
	private SimulationDefinitionFactory factory = SimulationDefinitionFactory.eINSTANCE;

	public SimDefCreator(IntermediateModel model, String trgProjectLocation) {
		this.model = model;
		this.trgProjectLocation = trgProjectLocation;
		init();
	}

	private void init() {
		definition = factory.createSimDefinition();
		definition.setName(model.getName() + "Definition");
		setGtRules(trgProjectLocation + "/model/gtRules.xmi");
		setIBeXPatterns(trgProjectLocation + "/model/ibex-patterns.xmi");
		setModelURI(trgProjectLocation + "/model/"+model.getName()+"Model.ecore");

		setModelComponents();

		createDefinition();
	}

	private void createDefinition() {

		for (IntermRule rule : modelRules) {
			addRuleRateAnnotation(rule.getName(), rule.getRate());
		}

		for (IntermObservable obs : modelObs) {
			addPatternObservation(obs.getName());
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

	public void setGtRules(String path) {
		setGtRulesURI(path);
		setGtRules();
	}

	public void setGtRules(URI uri) {
		setGtRulesURI(uri);
		setGtRules();
	}

	public void setIBeXPatterns(String path) {
		setIBeXPatternsURI(path);
		setIBeXPatterns();
	}

	public void setIBeXPatterns(URI uri) {
		setIBeXPatternsURI(uri);
		setIBeXPatterns();
	}

	public void setModelURI(String path) {
		URI fileUri = URI.createFileURI(path);
		setModelURI(fileUri);
	}

	public void setModelURI(URI uri) {
		modelUri = uri;
		definition.setSimulationModelURI(uri.toString());
	}

	public void addMetaModel(String name, URI uri) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource resource = rs.getResource(uri, true);

		if (resource == null) {
			throw new IOException("Could not load resource: " + uri.path());
		}

		if (resource.getContents().isEmpty()) {
			throw new IOException("Could not load resource: " + uri.path());
		}

		definition.getMetaModels().put(name, uri.toPlatformString(true));
	}

	public void addRuleRateAnnotation(String ruleName, double rate) {
		GTRule rule = null;
		for (GTRule r : definition.getGtRuleSet().getRules()) {
			if (r.getName().equals(ruleName)) {
				rule = r;
				break;
			}
		}
		if (rule == null) {
			System.err.println("Rule with name: <" + ruleName + "> not found!");
			return;
		}
		StochasticRate annotation = factory.createStochasticRate();
		annotation.setGTRule(rule);
		annotation.setRate(rate);
		definition.getRuleAnnotations().add(annotation);
	}

	public void addPatternObservation(String patternName) {
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
		System.out.println("Model saved to: " + uri.path());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Simulation-Definition name: " + definition.getName());
		sb.append("Contained URIs: \n");
		sb.append("GtRules-URI: " + gtRulesUri + "\n");
		sb.append("IBeXPatterns-URI: " + ibexPatternsUri + "\n");
		sb.append("SimulationModel-URI: " + modelUri + "\n");
		for (Entry<String, URI> metamodel : metaModelUris.entrySet()) {
			sb.append("SimulationMetaModel: " + metamodel.getKey() + ", " + metamodel.getValue() + "\n");
		}
		return sb.toString();
	}

	// private helper methods

	private void setGtRulesURI(String path) {
		URI fileUri = URI.createFileURI(path);
		setGtRulesURI(fileUri);
	}

	private void setGtRulesURI(URI uri) {
		gtRulesUri = uri;
		definition.setGtRulesURI(uri.toString());
	}

	private void setIBeXPatternsURI(String path) {
		URI fileUri = URI.createFileURI(path);
		setIBeXPatternsURI(fileUri);
	}

	private void setIBeXPatternsURI(URI uri) {
		ibexPatternsUri = uri;
		definition.setIbexPatternsURI(uri.toString());
	}

	private void setGtRules() {
		GTLanguagePackage.eINSTANCE.eClass();
		GTRuleSet rules = null;
		try {
			Resource rs = loadResource(gtRulesUri);
			rules = (GTRuleSet) rs.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		definition.setGtRuleSet(rules);
	}

	private void setIBeXPatterns() {
		IBeXLanguagePackage.eINSTANCE.eClass();
		IBeXPatternSet patterns = null;
		try {
			Resource rs = loadResource(ibexPatternsUri);
			patterns = (IBeXPatternSet) rs.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		definition.setIbexPatternSet(patterns);
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
