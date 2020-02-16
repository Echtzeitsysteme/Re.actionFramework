package org.reaction.ibex.patternCreation;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

public class IBeXCreator {

	private IntermediateModel model;

	private EPackage metamodelPackage;

	private List<IntermRule> rules;
	private List<IntermObservable> observables;

	private Map<String, EClassImpl> metamodelAgentTypes;
	private Map<String, EReference> metamodelEdgeTypes;
	private Map<String, EClassImpl> metamodelStateTypes;

	/**
	 * Contains all bound patterns with the corresponding pattern name as key. <br>
	 * patternName = "{lowerCaseAgentName}_{lowerCaseSiteName}Bound"
	 */
	private Map<String, IBeXContextPattern> boundPatterns;
	private Map<String, IBeXContextPattern> conditionPatterns;

	private IBeXLanguageFactory ibexFactory;
	private IBeXPatternSet ibexPatternSet;

	private EClass agentClass;

	public IBeXCreator(IntermediateModel model, EPackage metamodelPackage) {
		this.model = model;
		this.metamodelPackage = metamodelPackage;
		boundPatterns = new HashMap<>();
		conditionPatterns = new HashMap<>();
		init();
	}

	private void init() {
		ibexFactory = IBeXLanguageFactory.eINSTANCE;
		ibexPatternSet = ibexFactory.createIBeXPatternSet();
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
		createBoundPatterns();
		createRulePatterns();
		createObservablePatterns();
	}

	private void createRulePatterns() {
		for (IntermRule rule : rules) {
			// Create ContextPattern
			createContextPatternFromRule(rule);

			// Create CreatePatterns and DeletePatterns
			createChangePatternsFromRule(rule);
		}

		// Add node pairs = injectivity constraints
		for (IBeXContext context : ibexPatternSet.getContextPatterns()) {
			IBeXContextPattern pattern = (IBeXContextPattern) context;
			Map<EClass, Integer> nodeTypeRecords = new HashMap<>();

			List<IBeXNode> patternNodes = pattern.getSignatureNodes();
//			TODO: Do local nodes need to be included in eventual nodePairs as well?
//			patternNodes.addAll(pattern.getLocalNodes());
			for (IBeXNode node : patternNodes) {
				EClass nodeType = node.getType();
				int cnt = 0;
				if (nodeTypeRecords.containsKey(nodeType)) {
					cnt = nodeTypeRecords.get(nodeType);
				}

				nodeTypeRecords.put(nodeType, cnt + 1);
			}

			for (Entry<EClass, Integer> entry : nodeTypeRecords.entrySet()) {
				if (entry.getValue() > 1) {
					EClass type = entry.getKey();
					List<IBeXNode> nodesOfType = patternNodes.stream().filter((IBeXNode node) -> node.getType() == type)
							.collect(Collectors.toList());
					List<IBeXNodePair> pairs = createNodePairs(nodesOfType);
					pattern.getInjectivityConstraints().addAll(pairs);
				}
			}
		}
	}

	/**
	 * @return a list of all possible pairs resulting from the given list of nodes,
	 *         if each node can be paired with every other node except itself.
	 */
	private List<IBeXNodePair> createNodePairs(List<IBeXNode> nodes) {

		if (nodes.isEmpty()) {
			return new LinkedList<>();
		}

		List<IBeXNodePair> pairs = new LinkedList<>();
		IBeXNode firstNode = nodes.remove(0);
		for (IBeXNode otherNode : nodes) {
			IBeXNodePair pair = ibexFactory.createIBeXNodePair();
			pair.getValues().add(firstNode);
			pair.getValues().add(otherNode);
			pairs.add(pair);
		}
		List<IBeXNodePair> allPairs = createNodePairs(nodes);
		allPairs.addAll(pairs);

		return allPairs;
	}

	private void createObservablePatterns() {
		for (IntermObservable obs : observables) {
			createContextPatternFromObs(obs);
		}
	}

	private void createBoundPatterns() {

		for (EClassImpl agent : metamodelAgentTypes.values()) {
			List<EReference> contents = agent.eContents().stream().filter((EObject obj) -> obj instanceof EReference)
					.map((EObject obj) -> (EReference) obj).collect(Collectors.toList());

			for (EReference ref : contents) {
				// skip if reference points to state
				EClass refType = ref.getEReferenceType();
				EClass stateClass = ReactionContainerPackage.Literals.STATE;
				List<EClass> superTypes = refType.getESuperTypes();
				if (!superTypes.isEmpty()) {
					EClass superType = superTypes.get(0);
					if (superType == stateClass) {
						continue; // TODO Check if transformation is still correct
					}
				}

				// Pattern creation plus name
				IBeXContextPattern contextPattern = ibexFactory.createIBeXContextPattern();
				String refName = ref.getName();
				contextPattern.setName(
						agent.getName().toLowerCase() + "_" + refName.substring(2, refName.length()) + "Bound");

				// Node creation
				IBeXNode n1 = IBeXPatternFactory.createNode("src", metamodelAgentTypes.get(agent.getName()));
				IBeXNode n2 = IBeXPatternFactory.createNode("trg", ReactionContainerPackage.Literals.AGENT);

				if (agentClass == null) {
					agentClass = ref.getEReferenceType();
				}

				contextPattern.getSignatureNodes().add(n1);
				contextPattern.getLocalNodes().add(n2);

				// Edge Creation
				IBeXEdge edge = IBeXPatternFactory.createEdge(n1, n2, ref);
				contextPattern.getLocalEdges().add(edge);

				// Pair creation
				IBeXNodePair nodePair = ibexFactory.createIBeXNodePair();
				nodePair.getValues().add(n1);
				nodePair.getValues().add(n2);
				contextPattern.getInjectivityConstraints().add(nodePair);

				// Save Pattern
				ibexPatternSet.getContextPatterns().add(contextPattern);
				boundPatterns.put(contextPattern.getName(), contextPattern);
			}
		}
	}

	/**
	 * Adds nodes and edges for one site having a specified state
	 * 
	 * @param isActive - true, if the agent actually is in the corresponding state
	 *                 in the pre condition. false, if the node is only given as
	 *                 context for being used in create and delete patterns.
	 */
	private void addStateToContextPattern(IBeXContextPattern contextPattern, IntermAgentInstance ai,
			IntermSiteInstance si, boolean isActive) {

		// if state node already exists -> only create new Edge
		String stateNodeName = getStateNodeName(si);
		IBeXNode stateNode = getSignatureNodeFromContextPattern(contextPattern, stateNodeName);

		if (stateNode != null) {
			IBeXNode nodeInState;
			if (ai.isLocal()) {
				nodeInState = getLocalNodeFromContextPattern(contextPattern, ai.getName());
				if (nodeInState == null) {
					throw new IllegalStateException(
							"The attempt of adding a state to a non existent local node should not be possible within the control flow of the program.");
				}
			} else {
				nodeInState = getSignatureNodeFromContextPattern(contextPattern, ai.getName());
			}

			if (nodeInState == null) {
				nodeInState = IBeXPatternFactory.createNode(ai.getName(), metamodelStateTypes.get(getStateTypeKey(si)));

				contextPattern.getSignatureNodes().add(nodeInState);
			}
			if (isActive) {
				IBeXEdge stateEdge = IBeXPatternFactory.createEdge(nodeInState, stateNode, getEdgeType(ai, si, true));
				contextPattern.getLocalEdges().add(stateEdge);
			}

		} else {

			// Get node with state
			// Get nodes or create new ones if not existent
			IBeXNode nodeInState = getSignatureNodeFromContextPattern(contextPattern, ai.getName());
			if (nodeInState == null) {
				nodeInState = IBeXPatternFactory.createNode(ai.getName(),
						metamodelAgentTypes.get(ai.getInstanceOf().getName()));
				contextPattern.getSignatureNodes().add(nodeInState);
			}

			stateNode = IBeXPatternFactory.createNode(stateNodeName, metamodelStateTypes.get(getStateTypeKey(si)));
			contextPattern.getSignatureNodes().add(stateNode);

			if (isActive) {
				IBeXEdge stateEdge = IBeXPatternFactory.createEdge(nodeInState, stateNode, getEdgeType(ai, si, true));
				contextPattern.getLocalEdges().add(stateEdge);
			}
		}
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
	 * Adds node for a free site
	 * 
	 * @param contextPattern
	 * @param ai
	 * @param si
	 */
	private void addFreeSiteToContextPattern(IBeXContextPattern contextPattern, IntermAgentInstance ai,
			IntermSiteInstance si) {

		// Get nodes or create new ones if not existent
		IBeXNode freeNode = getSignatureNodeFromContextPattern(contextPattern, ai.getName());
		if (freeNode == null) {
			freeNode = IBeXPatternFactory.createNode(ai.getName(),
					metamodelAgentTypes.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(freeNode);
		}

		// Add Pattern Invocation
		IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
		invoc.setInvokedBy(contextPattern);
		invoc.setPositive(false);
		String boundPatternName = getBoundSitePatternName(ai, si);
		IBeXContextPattern invokedPattern = getContextPatternByName(boundPatternName);
		invoc.setInvokedPattern(invokedPattern);

		IBeXNode srcNode = getSignatureNodeFromContextPattern(invokedPattern, "src");

		invoc.getMapping().put(freeNode, srcNode);

		contextPattern.getInvocations().add(invoc);
	}

	/**
	 * Adds nodes for an unspecified site
	 * 
	 * @param contextPattern
	 * @param ai
	 * @param si
	 */
	private void addUnspecifiedSiteToContextPattern(IBeXContextPattern contextPattern, IntermAgentInstance ai,
			IntermSiteInstance si) {

		// Get nodes or create new ones if not existent
		IBeXNode unspecifiedNode = getSignatureNodeFromContextPattern(contextPattern, ai.getName());
		if (unspecifiedNode == null) {
			unspecifiedNode = IBeXPatternFactory.createNode(ai.getName(),
					metamodelAgentTypes.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(unspecifiedNode);
		}

		// Add Pattern Invocation for "Not Bound To"
		// Other cases can be excluded since an unspecified node can not be bound
		// neither is it free
		for (Bindable notBoundTo : si.getNotBoundTo()) {

			// Get or Create nodes
			if (notBoundTo instanceof IntermSiteInstance) {
				IntermSiteInstance siteNotBoundTo = (IntermSiteInstance) notBoundTo;
				IntermAgentInstance aiNotBoundTo = siteNotBoundTo.getParent();
				IBeXNode nodeNotBoundTo;
				if (aiNotBoundTo.isLocal()) {
					nodeNotBoundTo = IBeXPatternFactory.createNode("local",
							metamodelAgentTypes.get(aiNotBoundTo.getInstanceOf().getName()));
				} else {
					nodeNotBoundTo = getSignatureNodeFromContextPattern(contextPattern, aiNotBoundTo.getName());
					if (nodeNotBoundTo == null) {
						nodeNotBoundTo = IBeXPatternFactory.createNode(aiNotBoundTo.getName(),
								metamodelAgentTypes.get(aiNotBoundTo.getInstanceOf().getName()));
						contextPattern.getSignatureNodes().add(nodeNotBoundTo);
					}
				}

				// Get or Create pattern to invoke and create invocation
				IBeXContextPattern invokedPattern = getForbiddenPattern(ai, si, siteNotBoundTo);
				IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
				invoc.setInvokedBy(contextPattern);
				invoc.setInvokedPattern(invokedPattern);
				invoc.setPositive(false);

				// Set invocation mappings
				IBeXNode invokedSrcNode = getSignatureNodeFromContextPattern(invokedPattern, "src");
				invoc.getMapping().put(unspecifiedNode, invokedSrcNode);

				if (!aiNotBoundTo.isLocal()) {
					IBeXNode invokedTrgNode = getSignatureNodeFromContextPattern(invokedPattern, "trg");
					invoc.getMapping().put(nodeNotBoundTo, invokedTrgNode);
				}

				// add pattern invocation
				contextPattern.getInvocations().add(invoc);
			}

			if (notBoundTo instanceof IntermAgent) {
				// Get or Create pattern to invoke and create invocation
				IBeXContextPattern invokedPattern = getForbiddenPattern(ai, si, notBoundTo);
				IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
				invoc.setInvokedBy(contextPattern);
				invoc.setInvokedPattern(invokedPattern);
				invoc.setPositive(false);

				// Set invocation mappings
				IBeXNode invokedSrcNode = getSignatureNodeFromContextPattern(invokedPattern, "src");
				invoc.getMapping().put(unspecifiedNode, invokedSrcNode);

				// add pattern invocation
				contextPattern.getInvocations().add(invoc);
			}
		}
	}

	/**
	 * Gets the forbidden pattern either from the conditionPattern-map or creates
	 * and registers a new one if necessary.
	 * 
	 * @return an IBeXContextPattern that can be invoked negatively as forbidden
	 *         condition of the binding between the given sites src and trg.
	 */
	private IBeXContextPattern getForbiddenPattern(IntermAgentInstance ai, IntermSiteInstance src, Bindable trg) {

		if (trg instanceof IntermSiteInstance) {
			IntermSiteInstance trgSi = (IntermSiteInstance) trg;
			String qualifiedName = getQualifiedConditionPatternName(ai, src, trgSi, trgSi.getParent().isLocal());
			IBeXContextPattern forbiddenPattern = getConditionPatternByName(qualifiedName);
			if (forbiddenPattern != null) {
				return forbiddenPattern;
			}

			// If condition pattern does not already exit -> create a new one
			forbiddenPattern = IBeXLanguageFactory.eINSTANCE.createIBeXContextPattern();
			forbiddenPattern.setName(qualifiedName);

			IntermAgentInstance trgParent = trgSi.getParent();

			// Create nodes
			IBeXNode srcNode = IBeXPatternFactory.createNode("src",
					metamodelAgentTypes.get(src.getParent().getInstanceOf().getName()));
			IBeXNode trgNode = IBeXPatternFactory.createNode("trg",
					metamodelAgentTypes.get(trgSi.getParent().getInstanceOf().getName()));

			forbiddenPattern.getSignatureNodes().add(srcNode);
			if (trgSi.getParent().isLocal()) {
				forbiddenPattern.getLocalNodes().add(trgNode);
			} else {
				forbiddenPattern.getSignatureNodes().add(trgNode);
			}

			// create node pair
			IBeXNodePair pair = ibexFactory.createIBeXNodePair();
			pair.getValues().add(srcNode);
			pair.getValues().add(trgNode);
			forbiddenPattern.getInjectivityConstraints().add(pair);

			// create edge
			IBeXEdge edge = IBeXPatternFactory.createEdge(srcNode, trgNode, getEdgeType(src.getParent(), src, false));
			forbiddenPattern.getLocalEdges().add(edge);

			// Add state for target
			IntermSiteState state = trgSi.getState();
			if (state != null) {
				String stateNodeName = getStateNodeName(trgSi);
				IBeXNode stateNode = IBeXPatternFactory.createNode(stateNodeName,
						metamodelStateTypes.get(getStateTypeKey(trgSi)));
				IBeXEdge stateEdge = IBeXPatternFactory.createEdge(trgNode, stateNode,
						getEdgeType(trgParent, trgSi, true));

				forbiddenPattern.getLocalNodes().add(stateNode);
				forbiddenPattern.getLocalEdges().add(stateEdge);
			}

			conditionPatterns.put(qualifiedName, forbiddenPattern);
			ibexPatternSet.getContextPatterns().add(forbiddenPattern);

			return forbiddenPattern;
		}
		if (trg instanceof IntermAgent) {
			IntermAgent trgAgent = (IntermAgent) trg;
			String qualifiedName = getQualifiedConditionPatternName(ai, src, trgAgent, true);
			IBeXContextPattern forbiddenPattern = getConditionPatternByName(qualifiedName);
			if (forbiddenPattern != null) {
				return forbiddenPattern;
			}

			// If condition pattern does not already exit -> create a new one
			forbiddenPattern = IBeXLanguageFactory.eINSTANCE.createIBeXContextPattern();
			forbiddenPattern.setName(qualifiedName);

			// Create nodes
			IBeXNode srcNode = IBeXPatternFactory.createNode("src",
					metamodelAgentTypes.get(src.getParent().getInstanceOf().getName()));
			IBeXNode trgNode = IBeXPatternFactory.createNode("trg", metamodelAgentTypes.get(trgAgent.getName()));

			forbiddenPattern.getSignatureNodes().add(srcNode);
			forbiddenPattern.getLocalNodes().add(trgNode);

			// create injectivity constraint if nodes are of same type
			if (srcNode.getType() == trgNode.getType()) {
				IBeXNodePair pair = ibexFactory.createIBeXNodePair();
				pair.getValues().add(srcNode);
				pair.getValues().add(trgNode);
				forbiddenPattern.getInjectivityConstraints().add(pair);
			}

			// create edge
			IBeXEdge edge = IBeXPatternFactory.createEdge(srcNode, trgNode, getEdgeType(src.getParent(), src, false));
			forbiddenPattern.getLocalEdges().add(edge);

			conditionPatterns.put(qualifiedName, forbiddenPattern);
			ibexPatternSet.getContextPatterns().add(forbiddenPattern);

			return forbiddenPattern;
		}

		throw new UnsupportedOperationException("Could not handle type of " + trg.toString());
	}

	/**
	 * Adds nodes for one site bound to another
	 * 
	 * @param contextPattern
	 * @param ai
	 * @param si
	 */
	private void addBoundSiteToContextPattern(IBeXContextPattern contextPattern, IntermAgentInstance ai,
			IntermSiteInstance si) {

		// Get nodes or create new ones if not existent
		IBeXNode boundNode = getSignatureNodeFromContextPattern(contextPattern, ai.getName());
		if (boundNode == null) {
			boundNode = IBeXPatternFactory.createNode(ai.getName(),
					metamodelAgentTypes.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(boundNode);
		}

		Bindable boundTo = si.getBoundTo();
		if (boundTo != null) {
			if (boundTo instanceof IntermSiteInstance) {

				IntermSiteInstance boundToSite = (IntermSiteInstance) boundTo;

				IntermAgentInstance boundToParent = boundToSite.getParent();
				String partnerName = boundToParent.getName();
				IBeXNode boundPartner;
				if (boundToParent.isLocal()) {
					boundPartner = IBeXPatternFactory.createNode(partnerName,
							metamodelAgentTypes.get(boundToParent.getInstanceOf().getName()));
					contextPattern.getLocalNodes().add(boundPartner);

					// State for local nodes must be considered here since only signature nodes will
					// actively be created when translating patterns
					IntermSiteState state = boundToSite.getState();
					if (state != null) {
						addStateToContextPattern(contextPattern, boundToSite.getParent(), boundToSite, true);
					}

				} else {
					boundPartner = getSignatureNodeFromContextPattern(contextPattern, partnerName);
					if (boundPartner == null) {
						boundPartner = IBeXPatternFactory.createNode(partnerName,
								metamodelAgentTypes.get(boundToParent.getInstanceOf().getName()));
						contextPattern.getSignatureNodes().add(boundPartner);
					}
				}

				if (!nodesAlreadyConnected(contextPattern, boundNode, boundPartner)) {
					// Create Edge
					IBeXEdge connectingEdge = IBeXPatternFactory.createEdge(boundNode, boundPartner,
							getEdgeType(ai, si, false));
					contextPattern.getLocalEdges().add(connectingEdge);
				}

			} else if (boundTo instanceof IntermAgent) {

				IntermAgent boundToAgent = (IntermAgent) boundTo;

				String partnerName = boundToAgent.getName();
				IBeXNode boundPartner;

				// Create local node
				boundPartner = IBeXPatternFactory.createNode(partnerName + "_local",
						metamodelAgentTypes.get(partnerName));
				contextPattern.getLocalNodes().add(boundPartner);

				// Create Edge
				IBeXEdge connectingEdge = IBeXPatternFactory.createEdge(boundNode, boundPartner,
						getEdgeType(ai, si, false));
				contextPattern.getLocalEdges().add(connectingEdge);

			} else if (boundTo instanceof IntermAgentInstance) {
				
				IntermAgentInstance boundToInstance = (IntermAgentInstance) boundTo;
				String partnerName = boundToInstance.getName();
				IBeXNode boundPartner;
				if (boundToInstance.isLocal()) {
					boundPartner = IBeXPatternFactory.createNode(partnerName,
							metamodelAgentTypes.get(boundToInstance.getInstanceOf().getName()));
					contextPattern.getLocalNodes().add(boundPartner);
				} else {
					boundPartner = getSignatureNodeFromContextPattern(contextPattern, partnerName);
					if (boundPartner == null) {
						boundPartner = IBeXPatternFactory.createNode(partnerName,
								metamodelAgentTypes.get(boundToInstance.getInstanceOf().getName()));
						contextPattern.getSignatureNodes().add(boundPartner);
					}
				}

				if (!nodesAlreadyConnected(contextPattern, boundNode, boundPartner)) {
					// Create Edge
					IBeXEdge connectingEdge = IBeXPatternFactory.createEdge(boundNode, boundPartner,
							getEdgeType(ai, si, false));
					contextPattern.getLocalEdges().add(connectingEdge);
				}

			} else {
				throw new UnsupportedOperationException("Could not handle type of " + boundTo.toString());
			}
		}
		// for example: a.b+?
		else {

			// Create invocation
			IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
			IBeXContextPattern invokedBoundPattern = boundPatterns.get(getBoundSitePatternName(ai, si));
			invoc.setInvokedBy(contextPattern);
			invoc.setInvokedPattern(invokedBoundPattern);
			invoc.setPositive(true);

			IBeXNode srcNode = getSignatureNodeFromContextPattern(invokedBoundPattern, "src");
			invoc.getMapping().put(boundNode, srcNode);

			// Add invocation
			contextPattern.getInvocations().add(invoc);
		}
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
	 * @return the first context pattern found in the currently known condition
	 *         patterns with matching name
	 */
	private IBeXContextPattern getConditionPatternByName(String name) {
		return conditionPatterns.get(name);
	}

	/**
	 * creates a context pattern containing all relevant local and signature nodes
	 * and adds it to the ibex pattern set.
	 */
	private void createContextPatternFromRule(IntermRule rule) {

		IntermPattern lhs = rule.getLhs();
		IntermPattern rhs = rule.getRhs();

		IBeXContextPattern contextPatternRule = createContextPatternFromPattern(lhs);
		contextPatternRule.setName(rule.getName());

		// Iterate over all states on the right side so they are available as context
		// nodes for state changes in create/delete patterns
		List<IntermAgentInstance> rhsInstances = rhs.getAgentInstances();
		for (IntermAgentInstance ai : rhsInstances) {
			for (IntermSiteInstance si : ai.getSiteInstances()) {
				if (si.getState() != null) {
					String stateNodeName = getStateNodeName(si);
					IBeXNode stateNode = getOrCreateNode(contextPatternRule, stateNodeName);
					if (stateNode == null) {
						stateNode = IBeXPatternFactory.createNode(stateNodeName,
								metamodelStateTypes.get(getStateTypeKey(si)));
					} else {
						stateNode.setType(metamodelStateTypes.get(getStateTypeKey(si)));
					}

					contextPatternRule.getSignatureNodes().add(stateNode);
				}
			}
		}

		ibexPatternSet.getContextPatterns().add(contextPatternRule);
	}

	/**
	 * Creates the respective pattern from a given observable and registers it.
	 */
	private void createContextPatternFromObs(IntermObservable obs) {
		IBeXContextPattern obsContextPattern = createContextPatternFromPattern(obs.getObsPattern());
		obsContextPattern.setName(obs.getName());

		ibexPatternSet.getContextPatterns().add(obsContextPattern);
	}

	/**
	 * @return the given pattern translated into an IBeXContextPattern
	 */
	private IBeXContextPattern createContextPatternFromPattern(IntermPattern pattern) {

		IBeXContextPattern contextPattern = ibexFactory.createIBeXContextPattern();

		List<IntermAgentInstance> instances = pattern.getAgentInstances();

		for (IntermAgentInstance ai : instances) {
			if (!ai.isLocal()) {
				for (IntermSiteInstance si : ai.getSiteInstances()) {

					// Only create "actively binding" nodes for signature nodes. Local nodes will
					// and should only be created as passive part to bind signature nodes to
					switch (si.getBindingState()) {
					case FREE:
						addFreeSiteToContextPattern(contextPattern, ai, si);
						break;
					case UNSPECIFIED:
						addUnspecifiedSiteToContextPattern(contextPattern, ai, si);
						break;
					case BOUND:
						addBoundSiteToContextPattern(contextPattern, ai, si);

						if (si.getNotBoundTo().contains(si.getBoundTo())) {
							throw new IllegalStateException(
									"A configuration where a site is bound to a site it was explicitly declared not to be bound to should not be possible.");
						}
						break;
					}
					// Check for state
					if (si.getState() != null) {
						addStateToContextPattern(contextPattern, ai, si, true);
					}
				}
			}
		}

		return contextPattern;
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

		// TODO: Reactivate
//		for (IntermAgentInstance pre : changesMap.keySet()) {
//
//			IntermAgentInstance post = changesMap.get(pre);
//
//			addSiteChangesToPatterns(createPattern, deletePattern, pre, post);
//
//		}

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
	 * Checks whether a node corresponding to the given name already exists. If it
	 * does not a new node will be created.
	 * 
	 * @return the already existent or newly created node.
	 */
	private IBeXNode getOrCreateNode(IBeXContextPattern pattern, String name) {
		for (IBeXNode node : pattern.getSignatureNodes()) {
			if (node.getName().equals(name)) {
				return node;
			}
		}
		for (IBeXNode node : pattern.getSignatureNodes()) {
			if (node.getName().equals(name)) {
				return node;
			}
		}
		IBeXNode node = IBeXPatternFactory.createNode(name, agentClass);
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

		for (IntermAgentInstance pre : lhs) {
			// get instance with same name from right site (null if it is deleted)
			IntermAgentInstance post = getAgentInstanceWithName(rhs, pre.getName());
			changesMap.put(pre, post);
		}

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
	 * @returns the valid and hopefully unique name for a bound pattern
	 */
	private String getBoundSitePatternName(IntermAgentInstance ai, IntermSiteInstance si) {
		return ai.getInstanceOf().getName().toLowerCase() + "_" + si.getInstanceOf().getName() + "Bound";
	}

	/**
	 * @return true if the given class inherited from the agent class
	 */
	private boolean isAgent(EClass clazz) {
		return clazz.getESuperTypes().get(0) == ReactionContainerPackage.Literals.AGENT;
	}

	/**
	 * @returns a valid name for a state node that should be unique in the context
	 *          of its rule
	 */
	private String getStateNodeName(IntermSiteInstance si) {
		return si.getState().getName() + "s";
	}

	/**
	 * @return a qualified name for managing condition patterns.
	 */
	private String getQualifiedConditionPatternName(IntermAgentInstance aiSrc, IntermSiteInstance siSrc, Bindable trg,
			boolean toLocalNode) {
		StringBuilder sb = new StringBuilder("conditionPattern_");

		if (trg instanceof IntermSiteInstance) {
			IntermSiteInstance siTrg = (IntermSiteInstance) trg;

			IntermAgentInstance aiTrg = siTrg.getParent();
			IntermSiteState stateTrg = siTrg.getState();

			sb.append(aiSrc.getInstanceOf().getName());
			sb.append(siSrc.getName());
			sb.append("_to_");
			sb.append(aiTrg.getInstanceOf().getName());
			sb.append(siTrg.getName());

			if (stateTrg != null) {
				sb.append("_state_" + stateTrg.getName());
			}
			if (toLocalNode) {
				sb.append("_Local");
			}

		}
		if (trg instanceof IntermAgent) {
			IntermAgent trgAgent = (IntermAgent) trg;

			sb.append(aiSrc.getInstanceOf().getName());
			sb.append(siSrc.getName());
			sb.append("_to_");
			sb.append("LocalAgent_");
			sb.append(trgAgent.getName().toUpperCase());
		}
		if (trg instanceof IntermAgentInstance) {
			throw new UnsupportedOperationException("Could not handle type of " + trg.toString());
		}
		return sb.toString();
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
