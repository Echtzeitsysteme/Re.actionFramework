package reactionContainer.generator;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermComponent;
import ecoreBCModel.IntermInitialisation;
import ecoreBCModel.IntermObservable;
import ecoreBCModel.IntermPattern;
import ecoreBCModel.IntermRule;
import ecoreBCModel.IntermSite;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;
import ecoreBCModel.IntermediateModel;
import reactionContainer.Agent;
import reactionContainer.Container;
import reactionContainer.ReactionContainerFactory;
import reactionContainer.ReactionContainerPackage;
import reactionContainer.State;
import reactionContainer.impl.ReactionContainerFactoryImpl;
import reactionContainer.util.AgentClassFactory;
import reactionContainer.util.StateClassFactory;

public abstract class ContainerGenerator {
	private String projectPath;
	private URI modelLocation;
	private Resource modelResource;
	protected IntermediateModel model;
	private boolean isInitialized;

	private ReactionContainerFactory factory;
	protected Container containerModel;

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
		EcoreBCModelPackage.eINSTANCE.eClass();
		ReactionContainerPackage.eINSTANCE.eClass();
		factory = ReactionContainerFactoryImpl.init();

		projectPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		projectPath = projectPath.replaceFirst("/bin", "");
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

	public ContainerGenerator(IntermediateModel model) {
		modelResource = null;
		isInitialized = model != null;
		this.model = (IntermediateModel) model;

		init();
	}

	private boolean loadResource() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ReactionRules",
				new XMIResourceFactoryImpl());
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
		model = (IntermediateModel) modelResource.getContents().get(0);
		if (model != null)
			return true;

		return false;
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
		String absoluteMetaModelPath = FileSystems.getDefault().getPath(metaModelPath).normalize().toAbsolutePath().toString();

		Resource res = resSet.createResource(URI.createFileURI(absoluteMetaModelPath));
		res.getContents().add(dynamicMetaModel);
		
		EPackage.Registry.INSTANCE.put(dynamicMetaModel.getNsURI(), dynamicMetaModel);

		Map<Object, Object> saveOptions = ((XMIResource) res).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);

		try {
			((XMIResource) res).save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doGenerate(String modelPath, String metaModelPath) throws Exception {
		setMetaModelPath(metaModelPath);

		generateAgentClasses();

		createAndSetResourceSet();

		setContainerURI(modelPath);
		createAndSetResource();

		containerModel = factory.createContainer();
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
		String dynamicMetaModelName = model.getName()+"Model";
		dynamicMetaModel.setName(dynamicMetaModelName);
		dynamicMetaModel.setNsPrefix(dynamicMetaModelName);
		URI uri = createMetaModelURI();
		dynamicMetaModel.setNsURI(uri.toString());

		ReactionContainerPackage.eINSTANCE.getESubpackages().clear();
		ReactionContainerPackage.eINSTANCE.getESubpackages().add(dynamicMetaModel);

		stateClassFactory = new StateClassFactory(dynamicMetaModel);
		agentClassFactory = new AgentClassFactory(dynamicMetaModel, stateClassFactory);

		model.getComponents().forEach(x -> {
			if (x instanceof IntermAgent) {
				IntermAgent agnt = (IntermAgent) x;
				agentClassFactory.createClass(agnt);
			}
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
}
