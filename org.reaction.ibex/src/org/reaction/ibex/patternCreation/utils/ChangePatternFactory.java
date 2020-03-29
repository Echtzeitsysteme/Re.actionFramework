package org.reaction.ibex.patternCreation.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.emoflon.ibex.common.patterns.IBeXPatternFactory;

import IBeXLanguage.IBeXCreatePattern;
import IBeXLanguage.IBeXDeletePattern;
import IBeXLanguage.IBeXEdge;
import IBeXLanguage.IBeXLanguageFactory;
import IBeXLanguage.IBeXNode;
import IBeXLanguage.IBeXPattern;
import IBeXLanguage.IBeXPatternSet;
import ecoreBCModel.BindingState;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;
import reactionContainer.ReactionContainerPackage;

public class ChangePatternFactory {

	private EPackage metamodelPackage;

	private IBeXCreatePattern createPattern;
	private IBeXDeletePattern deletePattern;

	private IBeXLanguageFactory ibexFactory = IBeXLanguageFactory.eINSTANCE;

	private Map<String, EClassImpl> agentTypeRegistry;
	private Map<String, EReference> edgeTypeRegistry;
	private Map<String, EClassImpl> stateTypeRegistry;

	private ChangePatternTemplate template;
	private Map<IntermAgentInstance, IntermAgentInstance> changesMap;
	private List<IntermAgentInstance> createdInstances;

	public ChangePatternFactory(EPackage metamodelPackage) {
		this.metamodelPackage = metamodelPackage;
		init();
	}

	private void init() {
		findAgentsAndStates();
	}

	private void findAgentsAndStates() {
		agentTypeRegistry = new HashMap<>();
		stateTypeRegistry = new HashMap<>();
		edgeTypeRegistry = new HashMap<>();

		for (EObject obj : metamodelPackage.eContents()) {
			EClassImpl clazz = (EClassImpl) obj;
			if (ModelHelper.isAgent(clazz)) {
				agentTypeRegistry.put(clazz.getName(), clazz);

				for (EObject classContent : clazz.eContents()) {

					if (classContent instanceof EReference) {
						edgeTypeRegistry.put(((EReference) classContent).getName(), (EReference) classContent);
					}
				}

			} else {
				stateTypeRegistry.put(clazz.getName(), clazz);
			}
		}
	}

	public void generateChangePatterns(ChangePatternTemplate template) {
		this.template = template;
		changesMap = template.getChangesMap();
		createdInstances = template.getCreatedInstances();
		generateChangePatterns();
	}

	private void generateChangePatterns() {
		createPattern = ibexFactory.createIBeXCreatePattern();
		createPattern.setName(template.getName());
		deletePattern = ibexFactory.createIBeXDeletePattern();
		deletePattern.setName(template.getName());

		generateNewInstances();
		establishChanges();
	}

	/**
	 * Adds nodes and edges to create pattern for all newly created agents.
	 */
	private void generateNewInstances() {
		for (IntermAgentInstance ai : createdInstances) {

			// Create new node
			IBeXNode newNode = getOrCreateNode(createPattern, ai);

			// Create state nodes
			for (IntermSiteInstance si : ai.getSiteInstances()) {

				// Create state as specified
				IBeXNode stateNode = getOrCreateStateNode(createPattern, si);
				if (stateNode != null) {
					createEdge(newNode, stateNode, NameProvider.getEdgeTypeToStateKey(ai, si));
				}

			}

			// Connections of new agents
			createBindingInformationForNewInstance(ai);
		}
	}

	/**
	 * Adds nodes and edges to the create and delete patterns corresponding to the
	 * information contained in the changes map.
	 */
	private void establishChanges() {
		for (IntermAgentInstance aiPre : changesMap.keySet()) {
			createBindingInformation(aiPre);
		}
	}

	/**
	 * Adds nodes and edges to represent the change of the given site bindings. <br>
	 * Update of state information is done by
	 * {@link #updateSiteInformation(IntermSiteInstance, IntermSiteInstance)
	 * updateSiteInformation}.
	 * 
	 * @param pre  - site instance in pre condition
	 * @param post - site instance in post condition
	 */
	private void updateSiteInformation(IntermSiteInstance pre, IntermSiteInstance post) {

		if (pre.getBindingState() == BindingState.BOUND) {

			IntermSiteInstance preBoundTo = pre.getBoundTo();
			IntermSiteInstance postBoundTo = post.getBoundTo();

			if (post.getBindingState() == BindingState.BOUND) {

				if (preBoundTo == null && postBoundTo == null) {
					/* Nothing to do -> propagated wildcard */
					/* Example: a.b+?, <..> => a.b+?, <..> */
					return;
				}
				if (preBoundTo != null) {
					if (preBoundTo.getName().equals(postBoundTo.getName())) {
						/* Binding stayed the same, nothing to do */
						return;
					}
					deleteBond(pre);
					createBond(post);
				}
			} else if (post.getBindingState() == BindingState.UNSPECIFIED) {

				// Check if it only is unspecified because the bond given in the pre condition
				// has explicitly been forbidden in the post condition
				List<IntermSiteInstance> onlySiteInstances = post.getNotBoundTo().stream()
						.filter(partner -> partner instanceof IntermSiteInstance)
						.map(partner -> (IntermSiteInstance) partner).collect(Collectors.toList());
				if (ModelHelper.isInstanceInList(preBoundTo, onlySiteInstances)) {
					deleteBond(pre);
				}

			} else if (post.getBindingState() == BindingState.FREE) {
				deleteBond(pre);
			}
		}

		if (pre.getBindingState() == BindingState.UNSPECIFIED) {
			if (post.getBindingState() == BindingState.BOUND) {
				throw new RuntimeException("Underspecified transformation rule: " + template.getRule().getName());
			} else if (post.getBindingState() == BindingState.UNSPECIFIED) {
				/* Nothing to do */
				return;
			} else if (post.getBindingState() == BindingState.FREE) {
				throw new RuntimeException("Free wildcard on right hand side of rule is not allowed.");
			}
		}

		if (pre.getBindingState() == BindingState.FREE) {
			if (post.getBindingState() == BindingState.BOUND) {
				// only create new bond
				createBond(post);
			} else if (post.getBindingState() == BindingState.UNSPECIFIED) {
				/* Nothing to do */
				return;
			} else if (post.getBindingState() == BindingState.FREE) {
				/* Nothing to do */
				return;
			}
		}
	}

	/**
	 * Creates the bond given by the bound site instance si by adding all necessary
	 * nodes and edges to the create pattern.
	 * 
	 * @param si - is required to be in Bound state
	 */
	private void createBond(IntermSiteInstance si) {

		if (si.getBindingState() != BindingState.BOUND) {
			throw new IllegalArgumentException("Given site instace " + si.getName()
					+ " is expected to be in state BOUND but was in state " + si.getBindingState());
		}

		// establish new connection
		IntermAgentInstance ai = si.getParent();

		IntermSiteInstance siBoundTo = si.getBoundTo();
		IntermAgentInstance aiBoundTo = siBoundTo.getParent();

		// create new bond
		IBeXNode boundNode = getOrCreateNode(createPattern, ai);
		IBeXNode boundTo = getOrCreateNode(createPattern, aiBoundTo);

		createEdge(boundNode, boundTo, NameProvider.getEdgeTypeKey(si, siBoundTo));
	}

	/**
	 * Deletes the bond given by the bound site instance si by adding all necessary
	 * nodes and edges to the delete pattern.
	 * 
	 * @param si - is required to be in Bound state
	 */
	private void deleteBond(IntermSiteInstance si) {

		if (si.getBindingState() != BindingState.BOUND) {
			throw new IllegalArgumentException("Given site instance " + si.getName()
					+ " is expected to be in state BOUND but was in state " + si.getBindingState());
		}

		// establish new connection
		IntermAgentInstance ai = si.getParent();

		IntermSiteInstance siBoundTo = si.getBoundTo();

		IBeXNode boundNode = getOrCreateNode(deletePattern, ai);
		if (siBoundTo != null) {
			IntermAgentInstance aiBoundTo = siBoundTo.getParent();

			// create new bond
			IBeXNode boundTo = getOrCreateNode(deletePattern, aiBoundTo);

			// delete old bond
			deleteEdge(boundNode, boundTo, NameProvider.getEdgeTypeKey(si, siBoundTo));
		} else {
			// Deletion of underspecified bond:
			IBeXNode boundTo = getOrCreateGenericNode(deletePattern, NameProvider.getQualifiedLocalNodeName(si));
			deleteEdge(boundNode, boundTo, NameProvider.getEdgeTypeKey(si, siBoundTo));
		}
	}

	/**
	 * Adds nodes and edges to represent the change of the given site state.
	 * 
	 * @param pre  - site instance in pre condition
	 * @param post - site instance in post condition
	 */
	private void updateStateInformation(IntermSiteInstance siPre, IntermSiteInstance siPost) {

		IntermSiteState statePre = siPre.getState();
		IntermSiteState statePost = siPost.getState();

		if (statePost == null && statePre == null) {
			/* Nothing to do */
			return;
		}

		if (statePre == null) {

			// Get agent instances
			IntermAgentInstance aiPost = siPost.getParent();

			// Get or add nodes in state
			IBeXNode nodeInStatePost = getOrCreateNode(createPattern, aiPost);

			// Get or add state nodes
			IBeXNode stateNodePost = getOrCreateStateNode(createPattern, siPost);

			// add edges
			createEdge(nodeInStatePost, stateNodePost, NameProvider.getEdgeTypeToStateKey(aiPost, siPost));
		} else {

			if (statePost == null) {
				/* Nothing to do */
				return;
			} else {
				if (statePre.getName().equals(statePost.getName())) {
					/* Nothing to do */
					return;
				} else {

					IntermAgentInstance aiPre = siPre.getParent();
					IntermAgentInstance aiPost = siPost.getParent();

					// Get or add nodes in state
					IBeXNode nodeInStatePre = getOrCreateNode(deletePattern, aiPre);
					IBeXNode nodeInStatePost = getOrCreateNode(createPattern, aiPost);

					// Get or add state nodes
					IBeXNode stateNodePre = getOrCreateStateNode(deletePattern, siPre);
					IBeXNode stateNodePost = getOrCreateStateNode(createPattern, siPost);

					// add edges
					deleteEdge(nodeInStatePre, stateNodePre, NameProvider.getEdgeTypeToStateKey(aiPre, siPre));
					createEdge(nodeInStatePost, stateNodePost, NameProvider.getEdgeTypeToStateKey(aiPost, siPost));
				}
			}
		}
	}

	/**
	 * Adds nodes and edges to patterns to map the created and deleted connections
	 * of the given instance. <br>
	 * For establishing connections of a newly created instance, use method
	 * {@link #createBindingInformationForNewInstance(IntermAgentInstance)
	 * createBindingInformationForNewInstance}.
	 */
	private void createBindingInformation(IntermAgentInstance aiPre) {

		IntermAgentInstance aiPost = changesMap.get(aiPre);

		// delete node if not existent in post condition
		if (aiPost == null) {
			if (!ModelHelper.isInstanceLocal(aiPre)) {
				deleteNode(aiPre);
			}
			return;
		}

		for (IntermSiteInstance siPre : aiPre.getSiteInstances()) {
			IntermSiteInstance siPost = ModelHelper.getSiteInstanceByName(aiPost.getSiteInstances(), siPre.getName());

			updateSiteInformation(siPre, siPost);
			updateStateInformation(siPre, siPost);
		}
	}

	/**
	 * Adds nodes and edges to patterns to map the created and deleted connections
	 * of the given instance.<br>
	 * For establishing connections of an instance that was not newly created, use
	 * method {@link #createBindingInformation(IntermAgentInstance)
	 * createBindingInformation}.
	 */
	private void createBindingInformationForNewInstance(IntermAgentInstance ai) {
		for (IntermSiteInstance si : ai.getSiteInstances()) {

			IBeXNode boundNode = ModelHelper.getNodeFromCreatePattern(createPattern, ai.getName());

			if (si.getBindingState() == BindingState.BOUND) {
				IntermSiteInstance siBoundTo = si.getBoundTo();
				IntermAgentInstance aiBoundTo = siBoundTo.getParent();

				String aiBoundToName = aiBoundTo.getName();
				IBeXNode nodeBoundTo = ModelHelper.getNodeFromCreatePattern(createPattern, aiBoundToName);
				if (nodeBoundTo == null) {
					nodeBoundTo = createNode(aiBoundTo);
				}

				createEdge(boundNode, nodeBoundTo, NameProvider.getEdgeTypeKey(si, siBoundTo));
			}
		}
	}

	/**
	 * Finds the node to the given agent instance in the given pattern or creates a
	 * new node and adds it to the corresponding pattern.
	 * 
	 * @returns the found or created node
	 */
	private IBeXNode getOrCreateNode(IBeXPattern pattern, IntermAgentInstance ai) {
		if (pattern instanceof IBeXCreatePattern) {
			IBeXCreatePattern createPattern = (IBeXCreatePattern) pattern;

			IBeXNode createdNode = ModelHelper.getNodeFromCreatePattern(createPattern, ai.getName());
			if (createdNode == null) {
				createdNode = createNode(ai);
			}
			return createdNode;
		}
		if (pattern instanceof IBeXDeletePattern) {
			IBeXDeletePattern deletePattern = (IBeXDeletePattern) pattern;
			IBeXNode deletedNode = ModelHelper.getNodeFromDeletePattern(deletePattern, ai.getName());
			if (deletedNode == null) {
				deletedNode = deleteNode(ai);
			}
			return deletedNode;
		}

		throw new RuntimeException("Encountered ContextPattern during creation of change patterns. Exiting.");
	}

	/**
	 * Finds the node to the given agent instance name in the given pattern or
	 * creates a new node and adds it to the corresponding pattern.
	 * 
	 * @returns the found or created node
	 */
	private IBeXNode getOrCreateGenericNode(IBeXPattern pattern, String instanceName) {
		if (pattern instanceof IBeXCreatePattern) {
			throw new RuntimeException("There should never be a need for creation of an local generic node");
		}
		if (pattern instanceof IBeXDeletePattern) {
			IBeXDeletePattern deletePattern = (IBeXDeletePattern) pattern;
			IBeXNode deletedNode = ModelHelper.getNodeFromDeletePattern(deletePattern, instanceName);
			if (deletedNode == null) {
				deletedNode = deleteGenericNode(instanceName);
			}
			return deletedNode;
		}

		throw new RuntimeException("Encountered ContextPattern during creation of change patterns. Exiting.");
	}

	/**
	 * Creates a new ibex node corresponding to the given agent instance and adds it
	 * to the create pattern.
	 * 
	 * @return the newly created node
	 */
	private IBeXNode createNode(IntermAgentInstance ai) {
		IBeXNode newNode = IBeXPatternFactory.createNode(ai.getName(),
				agentTypeRegistry.get(ai.getInstanceOf().getName()));
		newNode.setName(ai.getName());
		if (ModelHelper.isInstanceInList(ai, createdInstances)) {
			createPattern.getCreatedNodes().add(newNode);
		} else {
			createPattern.getContextNodes().add(newNode);
		}
		return newNode;
	}

	/**
	 * Creates a new ibex node corresponding to the given agent instance and adds it
	 * to the delete pattern.
	 * 
	 * @return the deleted node
	 */
	private IBeXNode deleteNode(IntermAgentInstance ai) {

		// delete node itself
		IBeXNode deletedNode = IBeXPatternFactory.createNode(ai.getName(),
				agentTypeRegistry.get(ai.getInstanceOf().getName()));
		deletedNode.setName(ai.getName());
		if (changesMap.get(ai) != null) {
			deletePattern.getContextNodes().add(deletedNode);
			return deletedNode;
		} else {
			if (!ModelHelper.isInstanceLocal(ai)) {
				deletePattern.getDeletedNodes().add(deletedNode);
			}else {
				deletePattern.getContextNodes().add(deletedNode);
			}

			// delete all edges connected to it
			for (IntermSiteInstance si : ai.getSiteInstances()) {
				if (si.getBindingState() == BindingState.BOUND) {

					IntermSiteInstance boundTo = si.getBoundTo();
					IntermAgentInstance boundToParent = boundTo.getParent();

					IBeXNode boundToNode = getOrCreateNode(deletePattern, boundToParent);
					if (ModelHelper.getEdgeFromDeletePattern(deletePattern, deletedNode, boundToNode) != null) {
						deleteEdge(deletedNode, boundToNode, NameProvider.getEdgeTypeKey(si, boundTo));
					}

					// delete state
					if (!ai.isLocal() && si.getState() != null) {
						IBeXNode stateNode = getOrCreateStateNode(deletePattern, si);
						deleteEdge(deletedNode, stateNode, NameProvider.getEdgeTypeToStateKey(ai, si));
					}
				}
			}

			return deletedNode;
		}
	}

	/**
	 * Creates a new ibex node corresponding to the given agent instance and adds it
	 * to the delete pattern.
	 * 
	 * @return the deleted node
	 */
	private IBeXNode deleteGenericNode(String instanceName) {
		IBeXNode deletedNode = IBeXPatternFactory.createNode(instanceName, ReactionContainerPackage.Literals.AGENT);
		deletedNode.setName(instanceName);
		deletePattern.getDeletedNodes().add(deletedNode);
		return deletedNode;
	}

	/**
	 * Creates a new ibex node corresponding to the given state and adds it to the
	 * context nodes of the corresponding pattern.
	 * 
	 * @return the found or created state node
	 */
	private IBeXNode getOrCreateStateNode(IBeXPattern pattern, IntermSiteInstance siteInState) {

		boolean defaultState = false;

		String stateNodeName;
		if (siteInState.getState() != null) {
			stateNodeName = NameProvider.getQualifiedStateNodeName(siteInState);
		} else {
			stateNodeName = NameProvider.getQualifiedDefaultStateNodeName(siteInState);
			defaultState = true;
			if (stateNodeName == null) {
				return null;
			}
		}

		if (pattern instanceof IBeXCreatePattern) {
			IBeXCreatePattern createPattern = (IBeXCreatePattern) pattern;

			IBeXNode stateNode = ModelHelper.getNodeFromCreatePattern(createPattern, stateNodeName);
			if (stateNode == null) {
				if (!defaultState) {
					stateNode = IBeXPatternFactory.createNode(stateNodeName,
							stateTypeRegistry.get(NameProvider.getStateTypeKey(siteInState)));
				} else {
					stateNode = IBeXPatternFactory.createNode(stateNodeName,
							stateTypeRegistry.get(NameProvider.getDefaultStateTypeKey(siteInState)));
				}

				stateNode.setName(stateNodeName);
				createPattern.getContextNodes().add(stateNode);
			}
			return stateNode;
		}
		if (pattern instanceof IBeXDeletePattern) {
			IBeXDeletePattern deletePattern = (IBeXDeletePattern) pattern;

			IBeXNode stateNode = ModelHelper.getNodeFromDeletePattern(deletePattern, stateNodeName);
			if (stateNode == null) {
				stateNode = IBeXPatternFactory.createNode(stateNodeName,
						stateTypeRegistry.get(NameProvider.getStateTypeKey(siteInState)));
				stateNode.setName(stateNodeName);
				deletePattern.getContextNodes().add(stateNode);
			}
			return stateNode;
		}

		throw new RuntimeException("Encountered ContextPattern during creation of change patterns. Exiting.");
	}

	/**
	 * Creates a new ibex edge corresponding to the given nodes and adds it to the
	 * create pattern.
	 * 
	 * @param edgeTypeKey - the key for getting the right edge type from the
	 *                    edgeTypeRegistry
	 * @return the created edge
	 */
	private IBeXEdge createEdge(IBeXNode src, IBeXNode trg, String edgeTypeKey) {

		EReference edgeType = edgeTypeRegistry.get(edgeTypeKey);
		if (edgeType == null) {
			return null;
		}

		IBeXEdge edge = IBeXPatternFactory.createEdge(src, trg, edgeType);
		createPattern.getCreatedEdges().add(edge);
		return edge;
	}

	/**
	 * Creates a new ibex edge corresponding to the given nodes and adds it to the
	 * delete pattern.
	 * 
	 * @param edgeTypeKey - the key for getting the right edge type from the
	 *                    edgeTypeRegistry.
	 * @return the deleted edge
	 */
	private IBeXEdge deleteEdge(IBeXNode src, IBeXNode trg, String edgeTypeKey) {

		EReference edgeType = edgeTypeRegistry.get(edgeTypeKey);
		if (edgeType == null) {
			return null;
		}

		// TODO: Is it necessary to look for the inverse edge? Or is it automatically
		// handled?
//		IBeXContextPattern preConditionPattern = ModelHelper.getContextPatternByName(ibexPatternSet, template.getRule().getName());
//		IBeXEdge oldEdge = ModelHelper.findEdgeInContextPattern(preConditionPattern, src, trg, edgeType);

		IBeXEdge edge = IBeXPatternFactory.createEdge(src, trg, edgeType);
		deletePattern.getDeletedEdges().add(edge);
		return edge;
	}

	public IBeXCreatePattern getCreatePattern() {
		return createPattern;
	}

	public IBeXDeletePattern getDeletePattern() {
		return deletePattern;
	}
}
