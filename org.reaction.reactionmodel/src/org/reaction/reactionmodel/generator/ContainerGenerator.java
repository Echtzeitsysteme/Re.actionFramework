package org.reaction.reactionmodel.generator;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.reaction.reactionmodel.util.AgentClassFactory;
import org.reaction.reactionmodel.util.StateClassFactory;

import IntermediateModel.IntermAgent;
import IntermediateModel.IntermAgentInstance;
import IntermediateModel.IntermComponent;
import IntermediateModel.IntermInitialisation;
import IntermediateModel.IntermObservable;
import IntermediateModel.IntermPattern;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermSite;
import IntermediateModel.IntermSiteInstance;
import IntermediateModel.IntermSiteState;
import IntermediateModel.IntermediateModelContainer;
import IntermediateModel.IntermediateModelPackage;
import ReactionModel.Agent;
import ReactionModel.ReactionContainer;
import ReactionModel.ReactionModelFactory;
import ReactionModel.ReactionModelPackage;
import ReactionModel.State;
import ReactionModel.impl.ReactionModelFactoryImpl;

public abstract class ContainerGenerator {
	private String projectPath;
	private URI modelLocation;
	private Resource modelResource;
	protected IntermediateModelContainer model;
	private boolean isInitialized;

	private ReactionModelFactory factory;
	protected ReactionContainer containerModel;

	protected EPackage dynamicMetaModel;
	protected AgentClassFactory agentClassFactory;
	protected StateClassFactory stateClassFactory;
	protected Map<String, State> stateInstances;

	protected Map<IntermInitialisation, InitializationTemplate> templates;
	protected Map<String, List<IntermSite>> siteConnections;
	protected List<IntermAgent> agentsInModel;
	protected Map<String, List<IntermSiteState>> statesInModel;

	protected URI containerURI;
	protected String metaModelPath;
	protected ResourceSet containerResSet;
	protected Resource containerRes;

	private void init() {
		IntermediateModelPackage.eINSTANCE.eClass();
		ReactionModelPackage.eINSTANCE.eClass();
		factory = ReactionModelFactoryImpl.init();

		projectPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		projectPath = projectPath.replaceFirst("/bin", "");

		filterActiveComponents();
	}

	public ContainerGenerator(URI modelLocation) {
		this.modelLocation = modelLocation;
		isInitialized = loadResource();
		if (isInitialized)
			isInitialized = loadModel();

		init();
	}

	public ContainerGenerator(Resource model) {
		modelResource = model;
		isInitialized = model != null;
		if (isInitialized) {
			modelLocation = modelResource.getURI();
			isInitialized = loadModel();
		}

		init();
	}

	public ContainerGenerator(IntermediateModelContainer model) {
		modelResource = null;
		isInitialized = model != null;
		this.model = (IntermediateModelContainer) model;

		init();
	}

	private boolean loadResource() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().putIfAbsent("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		modelResource = null;
		try {
			modelResource = rs.getResource(modelLocation, true);
		} catch (Exception e) {
			System.out.println("Exception occured while loading a resource: " + e.getClass() + ": " + e.getMessage());
			return false;
		}
		if (modelResource != null)
			return true;

		return false;

	}

	private boolean loadModel() {
		model = (IntermediateModelContainer) modelResource.getContents().get(0);
		if (model != null)
			return true;

		return false;
	}

	/**
	 * filters all really used components within the model.
	 */
	protected void filterActiveComponents() {
		siteConnections = new HashMap<>();
		agentsInModel = new LinkedList<>();
		statesInModel = new HashMap<>();

		for (IntermComponent comp : model.getComponents()) {

			IntermPattern patternLhs = null;
			IntermPattern patternRhs = null;
			if (comp instanceof IntermObservable) {
				IntermObservable obs = (IntermObservable) comp;
				patternLhs = obs.getObsPattern();
			} else if (comp instanceof IntermInitialisation) {
				IntermInitialisation init = (IntermInitialisation) comp;
				patternLhs = init.getInitPattern();
			} else if (comp instanceof IntermRule) {
				IntermRule rule = (IntermRule) comp;
				patternLhs = rule.getLhs();
				patternRhs = rule.getRhs();
			} else {
				continue;
			}

			List<IntermAgentInstance> agentInstances = new LinkedList<>();
			agentInstances.addAll(patternLhs.getAgentInstances());
			if (patternRhs != null) {
				agentInstances.addAll(patternRhs.getAgentInstances());
			}

			for (IntermAgentInstance ai : agentInstances) {

				// put in list of existent agents
				if (!getUsedAgentsInModel().contains(ai.getInstanceOf())) {
					getUsedAgentsInModel().add(ai.getInstanceOf());
				}

				for (IntermSiteInstance si : ai.getSiteInstances()) {
					String key = ai.getInstanceOf().getName()+"_"+si.getName();
					List<IntermSiteState> statesOfSite = getUsedStates().get(key);
					if(statesOfSite == null) {
						statesOfSite = new LinkedList<>();
					}
					
					IntermSiteInstance siBoundTo = si.getBoundTo();
					

					IntermSiteState state = si.getState();
					if (state != null) {
						if (!statesOfSite.contains(state)) {
							statesOfSite.add(state);
							getUsedStates().put(key, statesOfSite);
						}
					}

					if (siBoundTo != null) {
						IntermAgent boundToAgent = null;
						IntermSiteInstance boundToSiteInstance = null;
						IntermSite boundToSite = null;
						if (siBoundTo instanceof IntermSiteInstance) {
							IntermSiteInstance siPartner = (IntermSiteInstance) siBoundTo;
							boundToAgent = siPartner.getParent().getInstanceOf();
							boundToSiteInstance = siPartner;
							boundToSite = boundToSiteInstance.getInstanceOf();
						}else {
							throw new UnsupportedOperationException("Unexpected type of siBindable encountered");
						}

						IntermAgent agentParent = ai.getInstanceOf();
						if (!getUsedAgentsInModel().contains(agentParent)) {
							getUsedAgentsInModel().add(agentParent);
						}


						IntermSiteState partnerState = boundToSiteInstance.getState();
						String partnerKey = boundToAgent.getName()+"_"+boundToSite.getName();
						List<IntermSiteState> statesOfPartnerSite = getUsedStates().get(partnerKey);
						if(statesOfPartnerSite == null) {
							statesOfPartnerSite = new LinkedList<>();
						}
						if (partnerState != null) {
							if(!statesOfPartnerSite.contains(partnerState)) {
								statesOfPartnerSite.add(partnerState);
								getUsedStates().put(partnerKey, statesOfPartnerSite);
							}
						}

						List<IntermSite> existentSites = siteConnections.get(key);
						if (existentSites == null) {
							existentSites = new LinkedList<>();
						}
						if (!existentSites.contains(boundToSite)) {
							existentSites.add(boundToSite);
						}
						siteConnections.put(key, existentSites);
						
						List<IntermSite> existentSitesPartner = siteConnections.get(partnerKey);
						if (existentSitesPartner == null) {
							existentSitesPartner = new LinkedList<>();
						}
						if (!existentSitesPartner.contains(si.getInstanceOf())) {
							existentSitesPartner.add(si.getInstanceOf());
						}
						siteConnections.put(partnerKey, existentSitesPartner);
						
					}
				}
			}
		}
	}

	protected abstract void setContainerURI(String path);

	protected void setMetaModelPath(String path) {
		this.metaModelPath = path;
	}

	protected abstract void createAndSetResourceSet();

	protected abstract void createAndSetResource();

	protected abstract void saveModel() throws Exception;

	protected void saveMetaModel() throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//		String absoluteMetaModelPath = FileSystems.getDefault().getPath(metaModelPath).normalize().toAbsolutePath().toString();

		Resource res = resSet.createResource(URI.createURI("platform:/resource"+metaModelPath, true));
		res.getContents().add(dynamicMetaModel);
		
		EPackage.Registry.INSTANCE.put(dynamicMetaModel.getNsURI(), dynamicMetaModel);

		Map<Object, Object> saveOptions = ((XMIResource) res).getDefaultSaveOptions();
//		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
//		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
//		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
//		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_ONLY_IF_CHANGED, XMIResource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl() {
			@Override
			public URI deresolve(URI uri) {
				return uri;
			}
		});
		try {
			((XMIResource) res).save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		res.unload();
	}
	
	public EPackage getMetamodel() {
		return dynamicMetaModel;
	}

	public void doGenerate(String modelPath, String metaModelPath) throws Exception {
		setMetaModelPath(metaModelPath);

		generateAgentClasses();

		createAndSetResourceSet();

		setContainerURI(modelPath);
		createAndSetResource();

		containerModel = factory.createReactionContainer();
		containerModel.setModelName(model.getName() + "Model");

		createStateInstances();
		generateInitializationTemplates();
		createInstances();

		containerRes.getContents().add(containerModel);
		saveModel();
		saveMetaModel();

		containerRes.unload();
	}

	private void generateInitializationTemplates() {
		templates = new HashMap<IntermInitialisation, InitializationTemplate>();

		List<IntermInitialisation> initials = model.getComponents().stream()
				.filter((IntermComponent c) -> c instanceof IntermInitialisation)
				.map((IntermComponent c) -> (IntermInitialisation) c).collect(Collectors.toList());
		for (IntermInitialisation init : initials) {
			templates.put(init, new InitializationTemplate(init.getInitPattern(), agentClassFactory, stateClassFactory,
					stateInstances));
		}
	}

	private void createInstances() {
		List<Agent> agents = new LinkedList<Agent>();
		for (IntermInitialisation init : templates.keySet()) {
			int amount = init.getCnt();
			agents.addAll(templates.get(init).createInstances(amount));
		}
		containerModel.getAgents().addAll(agents);
	}

	protected void generateAgentClasses() {

		dynamicMetaModel = EcoreFactory.eINSTANCE.createEPackage();
		
		String dynamicMetaModelName = model.getName() + "Model";
		dynamicMetaModel.setName(dynamicMetaModelName);
		dynamicMetaModel.setNsPrefix(dynamicMetaModelName);
		URI uri = createMetaModelURI();
		dynamicMetaModel.setNsURI(uri.toString());
		
		EAnnotation genAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		genAnnotation.setSource("http://www.eclipse.org/emf/2002/GenModel");
		dynamicMetaModel.getEAnnotations().add(genAnnotation);

//		ReactionModelPackage.eINSTANCE.getESubpackages().clear();
//		ReactionModelPackage.eINSTANCE.getESubpackages().add(dynamicMetaModel);
		
		stateClassFactory = new StateClassFactory(dynamicMetaModel);
		agentClassFactory = new AgentClassFactory(dynamicMetaModel, stateClassFactory, siteConnections, getUsedStates());

		getUsedAgentsInModel().forEach(x -> {
			agentClassFactory.createClass(x);
		});
		getUsedAgentsInModel().forEach(x -> {
			agentClassFactory.createAgentReferences(x);
		});
	}

	protected void createStateInstances() {
		stateInstances = new HashMap<String, State>();

		stateClassFactory.getEClassRegistry().getAllClasses().forEach(stateClass -> {
			State state = stateClassFactory.getEObjectFactory().createObject(stateClass);
			containerModel.getStates().add(state);
			stateInstances.put(state.eClass().getName(), state);
		});

	}
	

	public URI createMetaModelURI() {
		URI metamodelPathUri = URI.createFileURI(metaModelPath);
		int i = 0;
		while (!metamodelPathUri.segment(i).equals("model")) {
			i++;
		}
		i--;

		StringBuilder sb = new StringBuilder();
		for (int j = i; j < metamodelPathUri.segmentCount(); j++) {
			sb.append("/" + metamodelPathUri.segment(j));
		}

		String test = sb.toString();
		return URI.createPlatformResourceURI(test, true);
	}

	public List<IntermAgent> getUsedAgentsInModel() {
		return agentsInModel;
	}

	public Map<String, List<IntermSiteState>> getUsedStates() {
		return statesInModel;
	}
}
