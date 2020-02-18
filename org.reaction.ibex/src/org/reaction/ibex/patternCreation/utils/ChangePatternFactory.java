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
import ecoreBCModel.Bindable;
import ecoreBCModel.BindingState;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;

public class ChangePatternFactory {

	static boolean created = false;

	private EPackage metamodelPackage;

	private IBeXCreatePattern createPattern;
	private IBeXDeletePattern deletePattern;

	private IBeXLanguageFactory ibexFactory = IBeXLanguageFactory.eINSTANCE;

	private Map<String, EClassImpl> metamodelAgentTypes;
	private Map<String, EReference> metamodelEdgeTypes;
	private Map<String, EClassImpl> metamodelStateTypes;

	private ChangePatternTemplate template;
	private Map<IntermAgentInstance, IntermAgentInstance> changesMap;
	private List<IntermAgentInstance> createdInstances;

	private ChangePatternFactory(EPackage metamodelPackage) {
		created = true;
		this.metamodelPackage = metamodelPackage;
		init();
	}

	private void init() {
		findAgentsAndStates();
	}

	private void findAgentsAndStates() {
		metamodelAgentTypes = new HashMap<>();
		metamodelStateTypes = new HashMap<>();
		metamodelEdgeTypes = new HashMap<>();

		for (EObject obj : metamodelPackage.eContents()) {
			EClassImpl clazz = (EClassImpl) obj;
			if (ModelHelper.isAgent(clazz)) {
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
			IBeXNode newNode = createNode(ai);

			// Create state nodes
			for (IntermSiteInstance si : ai.getSiteInstances()) {
				IntermSiteState state = si.getState();
				if (state != null) {
					IBeXNode stateNode = getOrCreateStateNode(createPattern, si);
					createEdge(newNode, stateNode, NameProvider.getEdgeTypeKey(ai, si, true));
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

			Bindable preBoundToBindable = pre.getBoundTo();
			Bindable postBoundToBindable = post.getBoundTo();

			if (post.getBindingState() == BindingState.BOUND) {

				if (preBoundToBindable == null && postBoundToBindable == null) {
					/* Nothing to do -> propagated wildcard */
					/* Example: a.b+?, <..> => a.b+?, <..> */
					return;
				}

				if (!(postBoundToBindable instanceof IntermSiteInstance)) {
					throw new RuntimeException(
							"All instances on the right hand side of a rule must be well defined. Encountered generic or unclear binding in rule "
									+ template.getRule().getName() + ". Exiting.");
				}

				IntermSiteInstance postBoundTo = (IntermSiteInstance) postBoundToBindable;
				if (preBoundToBindable instanceof IntermSiteInstance) {
					if (postBoundToBindable instanceof IntermSiteInstance) {

						IntermSiteInstance preBoundTo = (IntermSiteInstance) preBoundToBindable;
						if (preBoundTo.getName().equals(postBoundTo.getName())) {
							/* Binding stayed the same, nothing to do */
							return;
						}
						deleteBond(pre);
						createBond(post);
					} else {
						throw new RuntimeException(
								"All instances on the right hand side of a rule must be well defined. Encountered generic or unclear binding, exiting.");
					}

				} else if (preBoundToBindable instanceof IntermAgentInstance) {
					if (postBoundToBindable instanceof IntermSiteInstance) {
						throw new UnsupportedOperationException(
								"Did not know that this was possible yet. Caused by rule "
										+ template.getRule().getName());
					} else if (preBoundToBindable instanceof IntermAgent) {
						throw new UnsupportedOperationException(
								"Did not know that this was possible yet. Caused by rule "
										+ template.getRule().getName());
					}
				}
			} else if (post.getBindingState() == BindingState.UNSPECIFIED) {

				// Check if it only is unspecified because the bond given in the pre condition
				// has explicitly been forbidden in the post condition
				if (preBoundToBindable instanceof IntermSiteInstance) {
					IntermSiteInstance preBoundTo = (IntermSiteInstance) preBoundToBindable;
					List<IntermSiteInstance> onlySiteInstances = post.getNotBoundTo().stream()
							.filter(partner -> partner instanceof IntermSiteInstance)
							.map(partner -> (IntermSiteInstance) partner).collect(Collectors.toList());
					if (ModelHelper.isInstanceInList(preBoundTo, onlySiteInstances)) {
						deleteBond(pre);
					}
				} else {
					throw new UnsupportedOperationException(
							"Encountered bound partner not of type IntermSiteInstance when establishing change from Free to Unspecified in rule "
									+ template.getRule().getName() + ". Exiting.");
				}
			} else if (post.getBindingState() == BindingState.FREE) {
				// TODO: Delete all potential old bonds
				// deleteNode then createNode?
			}

		}

		if (pre.getBindingState() == BindingState.UNSPECIFIED) {
			if (post.getBindingState() == BindingState.BOUND) {

				// TODO: Delete potential old bond
				// deleteBond?? --> delete old node and create new one?
				createBond(post);

			} else if (post.getBindingState() == BindingState.UNSPECIFIED) {
				/* Nothing to do */
				return;
			} else if (post.getBindingState() == BindingState.FREE) {
				// TODO: Delete all potential old bonds
				// deleteNode then createNode?
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
		Bindable boundToBindable = si.getBoundTo();
		if (!(boundToBindable instanceof IntermSiteInstance)) {
			throw new RuntimeException(
					"All instances on the right hand side of a rule must be well defined. Encountered generic or unclear binding at site "
							+ boundToBindable + " in rule " + template.getRule().getName() + ". Exiting.");
		}

		IntermSiteInstance siBoundTo = (IntermSiteInstance) boundToBindable;
		IntermAgentInstance aiBoundTo = siBoundTo.getParent();

		// create new bond
		IBeXNode boundNode = getOrCreateNode(createPattern, ai);
		IBeXNode boundTo = getOrCreateNode(createPattern, aiBoundTo);

		createEdge(boundNode, boundTo, NameProvider.getEdgeTypeKey(ai, si, false));
	}

	/**
	 * Deletes the bond given by the bound site instance si by adding all necessary
	 * nodes and edges to the delete pattern.
	 * 
	 * @param si - is required to be in Bound state
	 */
	private void deleteBond(IntermSiteInstance si) {

		if (si.getBindingState() != BindingState.BOUND) {
			throw new IllegalArgumentException("Given site instace " + si.getName()
					+ " is expected to be in state BOUND but was in state " + si.getBindingState());
		}

		// establish new connection
		IntermAgentInstance ai = si.getParent();
		Bindable BoundToBindable = si.getBoundTo();
		if (!(BoundToBindable instanceof IntermSiteInstance)) {
			throw new RuntimeException(
					"All instances on the right hand side of a rule must be well defined. Encountered generic or unclear binding, exiting.");
		}

		IntermSiteInstance siBoundTo = (IntermSiteInstance) BoundToBindable;
		IntermAgentInstance aiBoundTo = siBoundTo.getParent();

		// create new bond
		IBeXNode boundNode = getOrCreateNode(deletePattern, ai);
		IBeXNode boundTo = getOrCreateNode(deletePattern, aiBoundTo);

		deleteEdge(boundNode, boundTo, NameProvider.getEdgeTypeKey(ai, si, false));
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

			// TODO: How to delete old state if existent?

			// Get agent instances
			IntermAgentInstance aiPost = siPost.getParent();

			// Get or add nodes in state
			IBeXNode nodeInStatePost = getOrCreateNode(createPattern, aiPost);

			// Get or add state nodes
			IBeXNode stateNodePost = getOrCreateStateNode(createPattern, siPost);

			// add edges
			createEdge(nodeInStatePost, stateNodePost, NameProvider.getEdgeTypeKey(aiPost, siPost, true));
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
					deleteEdge(nodeInStatePre, stateNodePre, NameProvider.getEdgeTypeKey(aiPre, siPre, true));
					createEdge(nodeInStatePost, stateNodePost, NameProvider.getEdgeTypeKey(aiPost, siPost, true));
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
			deleteNode(aiPre);
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

			Bindable siBoundToBindable = si.getBoundTo();
			if (siBoundToBindable == null) {
				// No connection to create
				continue;
			}

			if (siBoundToBindable instanceof IntermSiteInstance) {

				IntermSiteInstance siBoundTo = (IntermSiteInstance) siBoundToBindable;
				IntermAgentInstance aiBoundTo = siBoundTo.getParent();

				String aiBoundToName = aiBoundTo.getName();
				IBeXNode nodeBoundTo = ModelHelper.getNodeFromCreatePattern(createPattern, aiBoundToName);
				if (nodeBoundTo == null) {
					nodeBoundTo = createNode(aiBoundTo);
				}

				createEdge(boundNode, nodeBoundTo, NameProvider.getEdgeTypeKey(ai, si, false));

			} else {
				throw new RuntimeException(
						"Encountered Binding instance without site specification. This should not be possible on the right hand side of a rule. Exiting.");
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
	 * Creates a new ibex node corresponding to the given agent instance and adds it
	 * to the create pattern.
	 * 
	 * @return the newly created node
	 */
	private IBeXNode createNode(IntermAgentInstance ai) {
		IBeXNode newNode = IBeXPatternFactory.createNode(ai.getName(),
				metamodelAgentTypes.get(ai.getInstanceOf().getName()));
		newNode.setName(ai.getName());
		if (ModelHelper.isInstanceInList(ai, createdInstances)) {
			createPattern.getCreatedNodes().add(newNode);
		} else {
			createPattern.getContextNodes().add(newNode);
		}
		return newNode;
	}

	// TODO: CreateNodeWithContextInformation if it was deleted before to accomplish
	// deletion of potential pre condition edges given by unspecified information.

	/**
	 * Creates a new ibex node corresponding to the given agent instance and adds it
	 * to the delete pattern.
	 * 
	 * @return the deleted node
	 */
	private IBeXNode deleteNode(IntermAgentInstance ai) {
		IBeXNode deletedNode = IBeXPatternFactory.createNode(ai.getName(),
				metamodelAgentTypes.get(ai.getInstanceOf().getName()));
		deletedNode.setName(ai.getName());
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

		String stateNodeName = NameProvider.getQualifiedStateNodeName(siteInState);

		if (pattern instanceof IBeXCreatePattern) {
			IBeXCreatePattern createPattern = (IBeXCreatePattern) pattern;

			IBeXNode stateNode = ModelHelper.getNodeFromCreatePattern(createPattern, stateNodeName);
			if (stateNode == null) {
				stateNode = IBeXPatternFactory.createNode(stateNodeName, metamodelStateTypes.get(stateNodeName));
				stateNode.setName(stateNodeName);
				createPattern.getContextNodes().add(stateNode);
			}
			return stateNode;
		}
		if (pattern instanceof IBeXDeletePattern) {
			IBeXDeletePattern deletePattern = (IBeXDeletePattern) pattern;

			IBeXNode stateNode = ModelHelper.getNodeFromDeletePattern(deletePattern, stateNodeName);
			if (stateNode == null) {
				stateNode = IBeXPatternFactory.createNode(stateNodeName, metamodelStateTypes.get(stateNodeName));
				stateNode.setName(stateNodeName);
				deletePattern.getContextNodes().add(stateNode);
			}
			return stateNode;
		}

		throw new RuntimeException("Encountered ContextPattern during creation of change patterns. Exiting.");
	}

	/**
	 * Creates a new ibex node corresponding to the given nodes and adds it to the
	 * create pattern.
	 * 
	 * @param edgeTypeKey - the key for getting the right edge type from the
	 *                    metamodelEdgeTypes-map.
	 * @return the deleted node
	 */
	private IBeXEdge createEdge(IBeXNode src, IBeXNode trg, String edgeTypeKey) {
		IBeXEdge edge = IBeXPatternFactory.createEdge(src, trg, metamodelEdgeTypes.get(edgeTypeKey));
		createPattern.getCreatedEdges().add(edge);
		return edge;
	}

	/**
	 * Creates a new ibex node corresponding to the given nodes and adds it to the
	 * delete pattern.
	 * 
	 * @param edgeTypeKey - the key for getting the right edge type from the
	 *                    metamodelEdgeTypes-map.
	 * @return the deleted node
	 */
	private IBeXEdge deleteEdge(IBeXNode src, IBeXNode trg, String edgeTypeKey) {
		IBeXEdge edge = IBeXPatternFactory.createEdge(src, trg, metamodelEdgeTypes.get(edgeTypeKey));
		deletePattern.getDeletedEdges().add(edge);
		return edge;
	}

	public IBeXCreatePattern getCreatePattern() {
		return createPattern;
	}

	public IBeXDeletePattern getDeletePattern() {
		return deletePattern;
	}

	public static ChangePatternFactory getInstance(EPackage metamodelPackage) {
		if (created == false) {
			return new ChangePatternFactory(metamodelPackage);
		} else {
			return null;
		}
	}
}
