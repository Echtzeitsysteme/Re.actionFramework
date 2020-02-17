package org.reaction.ibex.patternCreation.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.emoflon.ibex.common.patterns.IBeXPatternFactory;

import IBeXLanguage.IBeXContext;
import IBeXLanguage.IBeXContextPattern;
import IBeXLanguage.IBeXCreatePattern;
import IBeXLanguage.IBeXDeletePattern;
import IBeXLanguage.IBeXEdge;
import IBeXLanguage.IBeXLanguageFactory;
import IBeXLanguage.IBeXNode;
import IBeXLanguage.IBeXNodePair;
import IBeXLanguage.IBeXPatternInvocation;
import IBeXLanguage.IBeXPatternSet;
import ecoreBCModel.Bindable;
import ecoreBCModel.BindingState;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermComponent;
import ecoreBCModel.IntermObservable;
import ecoreBCModel.IntermPattern;
import ecoreBCModel.IntermRule;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;
import ecoreBCModel.IntermediateModel;
import reactionContainer.ReactionContainerPackage;

public class ChangeCreator {
	private IntermediateModel model;

	private EPackage metamodelPackage;

	private List<IntermRule> rules;
	private List<IntermObservable> observables;

	private Map<String, EClassImpl> metamodelAgentTypes;
	private Map<String, EReference> metamodelEdgeTypes;
	private Map<String, EClassImpl> metamodelStateTypes;

	private IBeXLanguageFactory ibexFactory;
	private IBeXPatternSet ibexPatternSet;

	public ChangeCreator(IntermediateModel model, EPackage metamodelPackage, IBeXPatternSet ibexPatternSet) {
		this.model = model;
		this.metamodelPackage = metamodelPackage;
		this.ibexPatternSet = ibexPatternSet;
		init();
	}

	private void init() {
		ibexFactory = IBeXLanguageFactory.eINSTANCE;
		findAgentsAndStates();
		setModelComponents();
		generateIBeXPatterns();
	}

	private void setModelComponents() {
		rules = new LinkedList<>();
		observables = new LinkedList<>();
		List<IntermComponent> components = model.getComponents();

		for (IntermComponent comp : components) {
			if (comp instanceof IntermRule) {
				rules.add((IntermRule) comp);
			}
			if (comp instanceof IntermObservable) {
				observables.add((IntermObservable) comp);
			}
		}
	}

	private void findAgentsAndStates() {
		metamodelAgentTypes = new HashMap<>();
		metamodelStateTypes = new HashMap<>();
		metamodelEdgeTypes = new HashMap<>();

		for (EObject obj : metamodelPackage.eContents()) {
			EClassImpl clazz = (EClassImpl) obj;
			if (isAgent(clazz)) {
				metamodelAgentTypes.put(clazz.getName(), clazz);

				for (EObject classContent : clazz.eContents()) {

					if (classContent instanceof EReference) {
						metamodelEdgeTypes.put(((EReference) classContent).getName(), (EReference) classContent);
					}
				}

			} else {
				metamodelStateTypes.put(clazz.getName(), clazz);
			}
		}
	}

	public void generateIBeXPatterns() {
		createRulePatterns();
	}

	private void createRulePatterns() {

		for (IntermRule rule : rules) {
			// Create CreatePatterns and DeletePatterns
			createChangePatternsFromRule(rule);
		}
		
		//TODO: Injectiviy constraints in create/delete patterns?

	}

	private EReference getEdgeType(IntermAgentInstance ai, IntermSiteInstance si, boolean toState) {
		return metamodelEdgeTypes.get(getEdgeTypeKey(ai, si, toState));
	}

	private String getEdgeTypeKey(IntermAgentInstance ai, IntermSiteInstance si, boolean toState) {
		String key = ai.getInstanceOf().getName().toUpperCase() + "_" + si.getName();
		IntermSiteState state = si.getState();
		if (state != null && toState) {
			key = key + "_" + si.getState().getName();
		}
		return key;
	}

	/**
	 * @return true, if there already exists an edge within the given pattern
	 *         connecting the two given nodes.
	 */
	private boolean nodesAlreadyConnected(IBeXContextPattern pattern, IBeXNode plannedSrc, IBeXNode plannedTrg) {

		List<IBeXEdge> edges = pattern.getLocalEdges();
		for (IBeXEdge edge : edges) {
			IBeXNode src = edge.getSourceNode();
			IBeXNode trg = edge.getTargetNode();
			if (plannedSrc == src && plannedTrg == trg) {
				return true;
			}
			if (plannedTrg == src && plannedSrc == trg) {
				return true;
			}
		}

		return false;
	}

	/**
	 * @return an already existent signature node with the given name within the
	 *         given pattern or null if no such node exists.
	 */
	private IBeXNode getSignatureNodeFromContextPattern(IBeXContextPattern pattern, String nodeName) {
		for (IBeXNode node : pattern.getSignatureNodes()) {
			if (node.getName().equals(nodeName)) {
				return node;
			}
		}
		return null;
	}

	/**
	 * @return an already existent local node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	private IBeXNode getLocalNodeFromContextPattern(IBeXContextPattern pattern, String nodeName) {
		for (IBeXNode node : pattern.getLocalNodes()) {
			if (node.getName().equals(nodeName)) {
				return node;
			}
		}
		return null;
	}

	/**
	 * @return the first found signature node with the given name or if there is no
	 *         such node, the first local node with the given name. if there is no
	 *         such local node as well, returns null.
	 */
	private IBeXNode getNodeFromContextPattern(IBeXContextPattern contextPattern, String name) {
		IBeXNode foundNode = getSignatureNodeFromContextPattern(contextPattern, name);
		if (foundNode == null) {
			foundNode = getLocalNodeFromContextPattern(contextPattern, name);
		}
		return foundNode;
	}

	/**
	 * @return the first context pattern found in the currently known contexts with
	 *         matching name
	 */
	private IBeXContextPattern getContextPatternByName(String name) {
		for (IBeXContext context : ibexPatternSet.getContextPatterns()) {
			IBeXContextPattern pattern = (IBeXContextPattern) context;
			if (pattern.getName().equals(name)) {
				return pattern;
			}
		}
		return null;
	}

	/**
	 * Adds the changes from the lhs of a rule to the rhs of a rule by mapping the
	 * agent in its state before to the agent in the state after applying the rule.
	 */
	private void createChangePatternsFromRule(IntermRule rule) {

		Map<IntermAgentInstance, IntermAgentInstance> changesMap = getChangesMap(rule);

		IBeXCreatePattern createPattern = ibexFactory.createIBeXCreatePattern();
		IBeXDeletePattern deletePattern = ibexFactory.createIBeXDeletePattern();
		createPattern.setName(rule.getName());
		deletePattern.setName(rule.getName());

		for (IntermAgentInstance pre : changesMap.keySet()) {

			IntermAgentInstance post = changesMap.get(pre);

			addSiteChangesToPatterns(createPattern, deletePattern, pre, post);

		}

		ibexPatternSet.getCreatePatterns().add(createPattern);
		ibexPatternSet.getDeletePatterns().add(deletePattern);

	}

	/**
	 * Instantiates the given create- and delete-patterns with the site changes
	 * given by the two before- and after-agentInstances.
	 */
	private void addSiteChangesToPatterns(IBeXCreatePattern createPattern, IBeXDeletePattern deletePattern,
			IntermAgentInstance aiPre, IntermAgentInstance aiPost) {

		for (IntermSiteInstance siPre : aiPre.getSiteInstances()) {

			IntermSiteInstance siPost = getSiteInstanceByName(aiPost.getSiteInstances(), siPre.getName());

			if (siPre.getBindingState() == BindingState.FREE && siPost.getBindingState() == BindingState.BOUND) {
				Bindable boundTo = siPost.getBoundTo();
				if (boundTo instanceof IntermSiteInstance) {
					IntermSiteInstance partner = (IntermSiteInstance) boundTo;
					createConnection(createPattern, siPost, partner);
				} else {
					throw new UnsupportedOperationException(
							"Handling of Bindables of Type IntermAgent or IntermAgentInstance not yet possible");
				}

			}
			// TODO: Other cases

			// Add state change
			IntermSiteState preState = siPre.getState();
			IntermSiteState postState = siPost.getState();
			if (preState != postState) {
				addStateChange(createPattern, deletePattern, siPre, siPost);
			}
		}
	}

	/**
	 * Instantiates the given create- and delete-patterns with the state changes
	 * given by the two before- and after- agentInstances.
	 */
	private void addStateChange(IBeXCreatePattern createPattern, IBeXDeletePattern deletePattern,
			IntermSiteInstance siPre, IntermSiteInstance siPost) {

		// Create new state and delete old state for right site

		IntermAgentInstance aiPost = siPost.getParent();
		IBeXNode agentNode = IBeXPatternFactory.createNode(aiPost.getName(), metamodelAgentTypes.get(aiPost.getName()));

		String stateNodeName = getStateNodeName(siPost);
		IBeXNode stateNode = IBeXPatternFactory.createNode(stateNodeName,
				metamodelStateTypes.get(getStateTypeKey(siPost)));
		IBeXEdge createEdge = IBeXPatternFactory.createEdge(agentNode, stateNode, getEdgeType(aiPost, siPost, true));

		createPattern.getContextNodes().add(agentNode);
		createPattern.getContextNodes().add(stateNode);
		createPattern.getCreatedEdges().add(createEdge);

		// Delete
		IntermSiteState preState = siPre.getState();

		if (preState != null) {
			IntermAgentInstance aiPre = siPre.getParent();
			IBeXNode agentNodeDel = IBeXPatternFactory.createNode(agentNode.getName(), agentNode.getType());
			IBeXNode stateNodeDel = IBeXPatternFactory.createNode(getStateNodeName(siPre),
					metamodelStateTypes.get(getStateTypeKey(siPre)));
			IBeXEdge deleteEdge = IBeXPatternFactory.createEdge(agentNodeDel, stateNodeDel,
					getEdgeType(aiPre, siPre, true));

			deletePattern.getContextNodes().add(agentNodeDel);
			deletePattern.getContextNodes().add(stateNodeDel);
			deletePattern.getDeletedEdges().add(deleteEdge);
		}
	}

	/**
	 * Creates an edge representing a connection between the two given agent
	 * instances and adds it to the given create pattern.
	 */
	private void createConnection(IBeXCreatePattern createPattern, IntermSiteInstance siSrc, IntermSiteInstance siTrg) {
		IBeXNode contextNodeSrc = getOrCreateNode(createPattern, siSrc.getParent());
		IBeXNode contextNodeTrg = getOrCreateNode(createPattern, siTrg.getParent());
		IBeXEdge createdEdge = IBeXPatternFactory.createEdge(contextNodeSrc, contextNodeTrg,
				getEdgeType(siTrg.getParent(), siTrg, false));

		createPattern.getContextNodes().add(contextNodeSrc);
		createPattern.getContextNodes().add(contextNodeTrg);
		createPattern.getCreatedEdges().add(createdEdge);
	}

	/**
	 * Checks whether a node corresponding to the given agent instance already
	 * exists. If it does not a new node will be created.
	 * 
	 * @return the already existent or newly created node.
	 */
	private IBeXNode getOrCreateNode(IBeXCreatePattern pattern, IntermAgentInstance ai) {
		for (IBeXNode node : pattern.getContextNodes()) {
			if (node.getName().equals(ai.getName())) {
				return node;
			}
		}
		for (IBeXNode node : pattern.getCreatedNodes()) {
			if (node.getName().equals(ai.getName())) {
				return node;
			}
		}
		IBeXNode node = IBeXPatternFactory.createNode(ai.getName(), ai.eClass());
		return node;
	}

	/**
	 * @return the first site instance found in the given list with the desired
	 *         name.
	 */
	private IntermSiteInstance getSiteInstanceByName(List<IntermSiteInstance> list, String name) {
		for (IntermSiteInstance si : list) {
			if (si.getName().equals(name)) {
				return si;
			}
		}
		return null;
	}

	/**
	 * @return a map containing the agent instance of the pre condition as key and
	 *         the agent instance of the post condition as value.
	 */
	private Map<IntermAgentInstance, IntermAgentInstance> getChangesMap(IntermRule rule) {

		Map<IntermAgentInstance, IntermAgentInstance> changesMap = new HashMap<>();

		List<IntermAgentInstance> lhs = rule.getLhs().getAgentInstances();
		List<IntermAgentInstance> rhs = rule.getRhs().getAgentInstances();

		//TODO: Reactivate
//		for (IntermAgentInstance pre : lhs) {
//			// get instance with same name from right site (null if it is deleted)
//			IntermAgentInstance post = getAgentInstanceWithName(rhs, pre.getName());
//			changesMap.put(pre, post);
//		}

		// TODO: Look for newly created agents on the right site

		return changesMap;
	}

	/**
	 * @return the first agent instance found in the given list with the desired
	 *         name.
	 */
	private IntermAgentInstance getAgentInstanceWithName(List<IntermAgentInstance> list, String name) {
		for (IntermAgentInstance ai : list) {
			if (ai.getName().equals(name)) {
				return ai;
			}
		}
		return null;
	}

	/**
	 * @return true if the given class inherited from the agent class
	 */
	private boolean isAgent(EClass clazz) {
		EClass agentClass = ReactionContainerPackage.Literals.AGENT;
		if (clazz == agentClass) {
			return true;
		} else {
			return clazz.getESuperTypes().get(0) == agentClass;
		}
	}

	/**
	 * @returns a valid name for a state node that should be unique in the context
	 *          of its rule
	 */
	private String getStateNodeName(IntermSiteInstance si) {
		return si.getState().getName() + "s";
	}

	/**
	 * @returns the key-string to get a state type from the state type map
	 */
	private String getStateTypeKey(IntermSiteInstance si) {
		return si.getState().getName().toUpperCase() + "_s";
	}

	public IBeXPatternSet getIBeXPatternSet() {
		return ibexPatternSet;
	}

	public void savePatternSet2(String ibexSaveLocation) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(ibexSaveLocation));
		resource.getContents().add(ibexPatternSet);
		Map<Object, Object> options = ((XMLResource) resource).getDefaultSaveOptions();
		options.put(XMIResource.OPTION_ENCODING, "ASCII");
		options.put(XMIResource.OPTION_SAVE_ONLY_IF_CHANGED, XMIResource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		options.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl() {
			@Override
			public URI deresolve(final URI uri) {
				if (!uri.isPlatform()) {
					// DONT TOUCH----------------------------------------------
					String[] uriSegments = uri.segments();
					String uriString;
					final String MODEL_STRING = "model";
					int modelPos = -1;

					// find "model"-segment
					for (int i = 0; i < uriSegments.length; i++) {
						if (uriSegments[i].equals(MODEL_STRING)) {
							modelPos = i;
							break;
						}
					}

					// create platform uri
					StringBuilder sb = new StringBuilder("platform:/resource");
					for (int i = modelPos - 1; i < uriSegments.length; i++) {
						sb.append("/");
						sb.append(uriSegments[i]);
					}

					sb.append("#");
					sb.append(uri.fragment());
					uriString = sb.toString();

					return URI.createURI(uriString, true);
				} else {
					return uri;
				}
			}
		});
		try {
			resource.save(options);
		} catch (IOException e) {
			System.out.println("Error trying to save the ibex-patterns at " + ibexSaveLocation);
			return;
		}
	}
}
