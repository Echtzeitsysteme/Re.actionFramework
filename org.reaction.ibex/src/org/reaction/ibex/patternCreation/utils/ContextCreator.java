package org.reaction.ibex.patternCreation.utils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.emoflon.ibex.common.patterns.IBeXPatternFactory;

import IBeXLanguage.IBeXContext;
import IBeXLanguage.IBeXContextPattern;
import IBeXLanguage.IBeXEdge;
import IBeXLanguage.IBeXLanguageFactory;
import IBeXLanguage.IBeXNode;
import IBeXLanguage.IBeXNodePair;
import IBeXLanguage.IBeXPatternInvocation;
import IBeXLanguage.IBeXPatternSet;
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

public class ContextCreator {
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

	public ContextCreator(IntermediateModel model, EPackage metamodelPackage) {
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

	public void generateIBeXPatterns() {
		createBoundPatterns();
		createRulePatterns();
		createObservablePatterns();
	}

	private void createRulePatterns() {
		for (IntermRule rule : rules) {
			// Create ContextPattern
			createContextPatternFromRule(rule);

			// Add default states of newly generated right site agents to context
			for (IntermAgentInstance ai : rule.getRhs().getAgentInstances()) {
				if (!ModelHelper.isInstanceInList(ai, rule.getLhs().getAgentInstances())) {
					for (IntermSiteInstance si : ai.getSiteInstances()) {
						List<IntermSiteState> allStates = si.getInstanceOf().getSiteStates();
						if (si.getState() == null && allStates.size() > 0) {

							// Add default state node to context pattern
							IBeXNode stateNode = IBeXPatternFactory.createNode(
									NameProvider.getQualifiedDefaultStateNodeName(si),
									metamodelStateTypes.get(NameProvider.getDefaultStateTypeKey(si)));
							IBeXContextPattern contextPattern = getContextPatternByName(rule.getName());
							contextPattern.getSignatureNodes().add(stateNode);

						}
					}
				}
			}

		}

		// Add node pairs = injectivity constraints
		for (IBeXContext context : ibexPatternSet.getContextPatterns()) {
			IBeXContextPattern contextPattern = (IBeXContextPattern) context;
			// Except Bound Patterns
			if (!contextPattern.getName().endsWith("Bound")) {
				List<IBeXNodePair> nodePairs = createNodePairs(contextPattern);
				contextPattern.getInjectivityConstraints().addAll(nodePairs);
			}
		}

	}

	/**
	 * @return a list of all possible pairs resulting from the given list of nodes,
	 *         if each node can be paired with every other node except itself.
	 */
	private List<IBeXNodePair> createNodePairs(IBeXContextPattern contextPattern) {

		List<IBeXNode> nodes = new LinkedList<>();
		nodes.addAll(contextPattern.getSignatureNodes());
		nodes.addAll(contextPattern.getLocalNodes());
		List<IBeXNodePair> allPairs = new LinkedList<>();

		for (int i = 0; i < nodes.size(); i++) {
			for (int j = i + 1; j < nodes.size(); j++) {
				IBeXNode n1 = nodes.get(i);
				IBeXNode n2 = nodes.get(j);

				if (!ModelHelper.isAgent(n1.getType()) || !ModelHelper.isAgent(n2.getType())) {
					continue;
				}

				if (n1.getType() == ReactionContainerPackage.Literals.AGENT
						|| n2.getType() == ReactionContainerPackage.Literals.AGENT || n1.getType() == n2.getType()) {

					IBeXNodePair pair = ibexFactory.createIBeXNodePair();
					pair.getValues().add(n1);
					pair.getValues().add(n2);
					if (!allPairs.contains(pair)) {
						allPairs.add(pair);
					}
				}
			}
		}

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
						continue;
					}
				}

				// Pattern creation plus name
				IBeXContextPattern contextPattern = ibexFactory.createIBeXContextPattern();

				contextPattern.setName(NameProvider.getBoundSitePatternName(agent, ref));

				// Node creation
				IBeXNode n1 = IBeXPatternFactory.createNode("src", metamodelAgentTypes.get(agent.getName()));
				IBeXNode n2 = IBeXPatternFactory.createNode("trg", ReactionContainerPackage.Literals.AGENT);

				contextPattern.getSignatureNodes().add(n1);
				contextPattern.getLocalNodes().add(n2);

				// Edge Creation
				IBeXEdge edge = IBeXPatternFactory.createEdge(n1, n2, ref);
				contextPattern.getLocalEdges().add(edge);

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
		String stateNodeName = NameProvider.getQualifiedStateNodeName(si);
		IBeXNode stateNode = ModelHelper.getSignatureNodeFromContextPattern(contextPattern, stateNodeName);

		if (stateNode == null) {
			stateNode = IBeXPatternFactory.createNode(stateNodeName,
					metamodelStateTypes.get(NameProvider.getStateTypeKey(si)));
			contextPattern.getSignatureNodes().add(stateNode);
		}

		// Get node with state
		// Get nodes or create new ones if not existent
		IBeXNode nodeInState = ModelHelper.getNodeFromContextPattern(contextPattern, ai.getName());
		if (nodeInState == null) {
			nodeInState = IBeXPatternFactory.createNode(ai.getName(),
					metamodelAgentTypes.get(ai.getInstanceOf().getName()));
			if (ai.isLocal()) {
				contextPattern.getLocalNodes().add(nodeInState);
			} else {
				contextPattern.getSignatureNodes().add(nodeInState);
			}

		}

		if (isActive) {
			IBeXEdge stateEdge = IBeXPatternFactory.createEdge(nodeInState, stateNode, getEdgeType(ai, si, true));
			contextPattern.getLocalEdges().add(stateEdge);
		}

	}

	private EReference getEdgeType(IntermAgentInstance ai, IntermSiteInstance si, boolean toState) {
		if (toState) {
			return metamodelEdgeTypes.get(NameProvider.getEdgeTypeKeyToState(ai, si));
		} else {
			return metamodelEdgeTypes.get(NameProvider.getEdgeTypeKey(ai, si));
		}

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
		IBeXNode freeNode = ModelHelper.getSignatureNodeFromContextPattern(contextPattern, ai.getName());
		if (freeNode == null) {
			freeNode = IBeXPatternFactory.createNode(ai.getName(),
					metamodelAgentTypes.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(freeNode);
		}

		// Add Pattern Invocation
		IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
		invoc.setInvokedBy(contextPattern);
		invoc.setPositive(false);
		String boundPatternName = NameProvider.getBoundSitePatternName(ai, si);
		IBeXContextPattern invokedPattern = getContextPatternByName(boundPatternName);
		invoc.setInvokedPattern(invokedPattern);

		IBeXNode srcNode = ModelHelper.getSignatureNodeFromContextPattern(invokedPattern, "src");

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
		IBeXNode unspecifiedNode = ModelHelper.getSignatureNodeFromContextPattern(contextPattern, ai.getName());
		if (unspecifiedNode == null) {
			unspecifiedNode = IBeXPatternFactory.createNode(ai.getName(),
					metamodelAgentTypes.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(unspecifiedNode);
		}

		// Add Pattern Invocation for "Not Bound To"
		// Other cases can be excluded since an unspecified node can not be bound
		// neither is it free
		for (IntermSiteInstance notBoundTo : si.getNotBoundTo()) {

			// Get or Create nodes

			IntermSiteInstance siteNotBoundTo = (IntermSiteInstance) notBoundTo;
			IntermAgentInstance aiNotBoundTo = siteNotBoundTo.getParent();
			IBeXNode nodeNotBoundTo;
			if (aiNotBoundTo.isLocal()) {
				nodeNotBoundTo = IBeXPatternFactory.createNode(aiNotBoundTo.getName(),
						metamodelAgentTypes.get(aiNotBoundTo.getInstanceOf().getName()));
			} else {
				nodeNotBoundTo = ModelHelper.getSignatureNodeFromContextPattern(contextPattern, aiNotBoundTo.getName());
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
			IBeXNode invokedSrcNode = ModelHelper.getSignatureNodeFromContextPattern(invokedPattern, "src");
			invoc.getMapping().put(unspecifiedNode, invokedSrcNode);

			if (!aiNotBoundTo.isLocal()) {
				IBeXNode invokedTrgNode = ModelHelper.getSignatureNodeFromContextPattern(invokedPattern, "trg");
				invoc.getMapping().put(nodeNotBoundTo, invokedTrgNode);
			}

			// add pattern invocation
			contextPattern.getInvocations().add(invoc);

		}
	}

	/**
	 * Gets the forbidden pattern either from the conditionPattern-map or creates
	 * and registers a new one if necessary.
	 * 
	 * @return an IBeXContextPattern that can be invoked negatively as forbidden
	 *         condition of the binding between the given sites src and trg.
	 */
	private IBeXContextPattern getForbiddenPattern(IntermAgentInstance ai, IntermSiteInstance src,
			IntermSiteInstance trg) {

		String qualifiedName = NameProvider.getQualifiedConditionPatternName(ai, src, trg, trg.getParent().isLocal());
		IBeXContextPattern forbiddenPattern = getConditionPatternByName(qualifiedName);
		if (forbiddenPattern != null) {
			return forbiddenPattern;
		}

		// If condition pattern does not already exit -> create a new one
		forbiddenPattern = IBeXLanguageFactory.eINSTANCE.createIBeXContextPattern();
		forbiddenPattern.setName(qualifiedName);

		IntermAgentInstance trgParent = trg.getParent();

		// Create nodes
		IBeXNode srcNode = IBeXPatternFactory.createNode("src",
				metamodelAgentTypes.get(src.getParent().getInstanceOf().getName()));
		IBeXNode trgNode = IBeXPatternFactory.createNode("trg",
				metamodelAgentTypes.get(trg.getParent().getInstanceOf().getName()));

		forbiddenPattern.getSignatureNodes().add(srcNode);
		if (trg.getParent().isLocal()) {
			forbiddenPattern.getLocalNodes().add(trgNode);
		} else {
			forbiddenPattern.getSignatureNodes().add(trgNode);
		}

		// create edge
		IBeXEdge edge1 = IBeXPatternFactory.createEdge(srcNode, trgNode, getEdgeType(src.getParent(), src, false));
		forbiddenPattern.getLocalEdges().add(edge1);
		IBeXEdge edge2 = IBeXPatternFactory.createEdge(trgNode, srcNode, getEdgeType(trgParent, trg, false));
		forbiddenPattern.getLocalEdges().add(edge2);

		// Add state for target
		IntermSiteState state = trg.getState();
		if (state != null) {
			String stateNodeName = NameProvider.getQualifiedStateNodeName(trg);
			IBeXNode stateNode = IBeXPatternFactory.createNode(stateNodeName,
					metamodelStateTypes.get(NameProvider.getStateTypeKey(trg)));
			IBeXEdge stateEdge = IBeXPatternFactory.createEdge(trgNode, stateNode, getEdgeType(trgParent, trg, true));

			forbiddenPattern.getLocalNodes().add(stateNode);
			forbiddenPattern.getLocalEdges().add(stateEdge);
		}

		conditionPatterns.put(qualifiedName, forbiddenPattern);
		ibexPatternSet.getContextPatterns().add(forbiddenPattern);

		return forbiddenPattern;
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
		IBeXNode boundNode = ModelHelper.getNodeFromContextPattern(contextPattern, ai.getName());
		if (boundNode == null) {
			boundNode = IBeXPatternFactory.createNode(ai.getName(),
					metamodelAgentTypes.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(boundNode);
		}

		IntermSiteInstance boundToSite = si.getBoundTo();
		if (boundToSite != null) {

			IntermAgentInstance boundToAgent = boundToSite.getParent();
			String partnerName = boundToAgent.getName();
			IBeXNode boundPartner;

			boundPartner = ModelHelper.getNodeFromContextPattern(contextPattern, partnerName);
			if (boundPartner == null) {
				boundPartner = IBeXPatternFactory.createNode(partnerName,
						metamodelAgentTypes.get(boundToAgent.getInstanceOf().getName()));
				if (boundToAgent.isLocal()) {
					contextPattern.getLocalNodes().add(boundPartner);
				} else {
					contextPattern.getSignatureNodes().add(boundPartner);
				}

			}

			IBeXEdge connectingEdge = IBeXPatternFactory.createEdge(boundNode, boundPartner,
					getEdgeType(ai, si, false));
			contextPattern.getLocalEdges().add(connectingEdge);

		}
		// for example: a.b+?
		else {
			// invoke bound pattern
			IBeXPatternInvocation boundInvoc = ibexFactory.createIBeXPatternInvocation();
			String invokedPatternName = NameProvider.getBoundSitePatternName(ai, si);
			IBeXContextPattern invokedPattern = getContextPatternByName(invokedPatternName);
			boundInvoc.setInvokedPattern(invokedPattern);
			boundInvoc.setPositive(true);
			boundInvoc.setInvokedBy(contextPattern);
			boundInvoc.getMapping().put(boundNode, ModelHelper.getNodeFromContextPattern(invokedPattern, "src"));
			contextPattern.getInvocations().add(boundInvoc);
		}
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
					String stateNodeName = NameProvider.getQualifiedStateNodeName(si);
					IBeXNode stateNode = ModelHelper.getNodeFromContextPattern(contextPatternRule, stateNodeName);
					if (stateNode == null) {
						stateNode = IBeXPatternFactory.createNode(stateNodeName,
								metamodelStateTypes.get(NameProvider.getStateTypeKey(si)));
					} else {
						stateNode.setType(metamodelStateTypes.get(NameProvider.getStateTypeKey(si)));
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
		obsContextPattern.setName("obs_" + obs.getName());

		ibexPatternSet.getContextPatterns().add(obsContextPattern);
	}

	/**
	 * @return the given pattern translated into an IBeXContextPattern
	 */
	private IBeXContextPattern createContextPatternFromPattern(IntermPattern pattern) {

		IBeXContextPattern contextPattern = ibexFactory.createIBeXContextPattern();

		List<IntermAgentInstance> instances = pattern.getAgentInstances();

		for (IntermAgentInstance ai : instances) {
			for (IntermSiteInstance si : ai.getSiteInstances()) {

				// Only create "actively binding" nodes for signature nodes. Local nodes will
				// and should only be created as passive part to bind signature nodes to
				switch (si.getBindingState()) {
				case FREE:
					addFreeSiteToContextPattern(contextPattern, ai, si);
					// Check for state
					if (si.getState() != null) {
						addStateToContextPattern(contextPattern, ai, si, true);
					}
					break;
				case UNSPECIFIED:
					if (!ai.isLocal()) {
						addUnspecifiedSiteToContextPattern(contextPattern, ai, si);
						// Check for state
						if (si.getState() != null) {
							addStateToContextPattern(contextPattern, ai, si, true);
						}
					}
					break;
				case BOUND:
					addBoundSiteToContextPattern(contextPattern, ai, si);

					if (si.getNotBoundTo().contains(si.getBoundTo())) {
						throw new IllegalStateException(
								"A configuration where a site is bound to a site it was explicitly declared not to be bound to should not be possible.");
					}
					// Check for state
					if (si.getState() != null) {
						addStateToContextPattern(contextPattern, ai, si, true);
					}
					break;
				}

			}
		}

		return contextPattern;
	}

	public IBeXPatternSet getIBeXPatternSet() {
		return ibexPatternSet;
	}

}
