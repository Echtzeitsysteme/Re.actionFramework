package org.reaction.ibex.patternCreation.utils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.emoflon.ibex.common.patterns.IBeXPatternFactory;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXEdge;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXInjectivityConstraint;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXNode;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternInvocation;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternModelFactory;

import IntermediateModel.IntermAgentInstance;
import IntermediateModel.IntermComponent;
import IntermediateModel.IntermObservable;
import IntermediateModel.IntermPattern;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermSiteInstance;
import IntermediateModel.IntermSiteState;
import IntermediateModel.IntermediateModelContainer;
import ReactionModel.ReactionModelPackage;

public class ContextCreator {
	private IntermediateModelContainer model;

	private EPackage metamodelPackage;
	
	private Map<IntermRule, IBeXContextPattern> rule2pattern;
	private List<IntermRule> rules;
	private List<IntermObservable> observables;

	private Map<String, EClassImpl> agentTypeRegistry;
	private Map<String, EReference> edgeTypeRegistry;
	private Map<String, EClassImpl> stateTypeRegistry;

	/**
	 * Contains all bound patterns with the corresponding pattern name as key. <br>
	 * patternName = "{UpperCaseAgentName}_{lowerCaseSiteName}Bound"
	 */
	private Map<String, IBeXContextPattern> boundPatterns;
	private Map<String, IBeXContextPattern> conditionPatterns;

	private IBeXPatternModelFactory ibexFactory;
	private IBeXModel ibexModel;

	public ContextCreator(final IntermediateModelContainer model, final EPackage metamodelPackage, final Map<IntermRule, IBeXContextPattern> rule2pattern) {
		this.model = model;
		this.metamodelPackage = metamodelPackage;
		this.rule2pattern = rule2pattern;
		boundPatterns = new HashMap<>();
		conditionPatterns = new HashMap<>();
		init();
	}

	private void init() {
		ibexFactory = IBeXPatternModelFactory.eINSTANCE;
		ibexModel = ibexFactory.createIBeXModel();
		ibexModel.setPatternSet(ibexFactory.createIBeXPatternSet());
		findAgentsAndStates();
		setModelComponents();
		generateIBeXPatterns();
		
		ibexModel.setEdgeSet(ibexFactory.createIBeXEdgeSet());
		ibexModel.setNodeSet(ibexFactory.createIBeXNodeSet());
		
		ibexModel.getNodeSet().getNodes().addAll(ibexModel.getPatternSet().getContextPatterns().stream()
				.filter(pattern -> (pattern instanceof IBeXContextPattern))
				.map(pattern -> (IBeXContextPattern)pattern)
				.flatMap(pattern -> pattern.getSignatureNodes().stream())
				.collect(Collectors.toList()));
		
		ibexModel.getNodeSet().getNodes().addAll(ibexModel.getPatternSet().getContextPatterns().stream()
				.filter(pattern -> (pattern instanceof IBeXContextPattern))
				.map(pattern -> (IBeXContextPattern)pattern)
				.flatMap(pattern -> pattern.getLocalNodes().stream())
				.collect(Collectors.toList()));
		
		ibexModel.getEdgeSet().getEdges().addAll(ibexModel.getPatternSet().getContextPatterns().stream()
				.filter(pattern -> (pattern instanceof IBeXContextPattern))
				.map(pattern -> (IBeXContextPattern)pattern)
				.flatMap(pattern -> pattern.getLocalEdges().stream())
				.map(edge -> {
					edge.setName(edge.getSourceNode().getName()+"->"+edge.getTargetNode().getName());
					return edge;
				})
				.collect(Collectors.toList()));
		
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
		agentTypeRegistry = new HashMap<>();
		stateTypeRegistry = new HashMap<>();
		edgeTypeRegistry = new HashMap<>();
		for (EObject obj : metamodelPackage.eContents()) {
			if(obj instanceof EAnnotation)
				continue;
			
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

	public void generateIBeXPatterns() {
		createBoundPatterns();
		createRulePatterns();
		createObservablePatterns();
	}

	private void createRulePatterns() {
		for (IntermRule rule : rules) {
			// Create ContextPattern
			createContextPatternFromRule(rule);		
		}
		
		for (IntermRule rule : rules) {
			// Add default states of newly generated right site agents to context
			for (IntermAgentInstance ai : rule.getRhs().getAgentInstances()) {
				if (!ModelHelper.isInstanceInList(ai, rule.getLhs().getAgentInstances())) {
					for (IntermSiteInstance si : ai.getSiteInstances()) {
						List<IntermSiteState> allStates = si.getInstanceOf().getSiteStates();
						if (si.getState() == null && allStates.size() > 0) {

							// Add default state node to context pattern
							IBeXNode stateNode = IBeXPatternFactory.createNode(
									NameProvider.getQualifiedDefaultStateNodeName(si),
									stateTypeRegistry.get(NameProvider.getDefaultStateTypeKey(si)));
							IBeXContextPattern contextPattern = rule2pattern.get(rule);
							contextPattern.getSignatureNodes().add(stateNode);
						}
					}
				}
			}
			
		}

		// Add node pairs = injectivity constraints
		for (IBeXContext context : ibexModel.getPatternSet().getContextPatterns()) {
			IBeXContextPattern contextPattern = (IBeXContextPattern) context;
			// exclude bound patterns since patterns can validly bind to itself
			if (!contextPattern.getName().endsWith("Bound")) {
				List<IBeXInjectivityConstraint> nodePairs = createNodePairs(contextPattern);
				contextPattern.getInjectivityConstraints().addAll(nodePairs);
			}
		}

	}

	/**
	 * @return a list of all possible pairs resulting from the given list of nodes,
	 *         if each node can be paired with every other node except itself.
	 */
	private List<IBeXInjectivityConstraint> createNodePairs(IBeXContextPattern contextPattern) {

		List<IBeXNode> nodes = new LinkedList<>();
		nodes.addAll(contextPattern.getSignatureNodes());
		nodes.addAll(contextPattern.getLocalNodes());
		List<IBeXInjectivityConstraint> allPairs = new LinkedList<>();

		for (int i = 0; i < nodes.size(); i++) {
			for (int j = i + 1; j < nodes.size(); j++) {
				IBeXNode n1 = nodes.get(i);
				IBeXNode n2 = nodes.get(j);

				if (!ModelHelper.isAgent(n1.getType()) || !ModelHelper.isAgent(n2.getType())) {
					continue;
				}

				if (n1.getType() == ReactionModelPackage.Literals.AGENT
						|| n2.getType() == ReactionModelPackage.Literals.AGENT || n1.getType() == n2.getType()) {

					IBeXInjectivityConstraint pair = ibexFactory.createIBeXInjectivityConstraint();
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

		for (EClassImpl agent : agentTypeRegistry.values()) {
			List<EReference> contents = agent.eContents().stream().filter((EObject obj) -> obj instanceof EReference)
					.map((EObject obj) -> (EReference) obj).collect(Collectors.toList());

			for (EReference ref : contents) {
				// skip if reference points to state
				EClass refType = ref.getEReferenceType();
				EClass stateClass = ReactionModelPackage.Literals.STATE;
				List<EClass> superTypes = refType.getESuperTypes();
				if (!superTypes.isEmpty()) {
					EClass superType = superTypes.get(0);
					if (superType == stateClass) {
						continue;
					}
				}

				// Src bound pattern creation
				IBeXContextPattern boundPattern = ibexFactory.createIBeXContextPattern();
				boundPattern.setName(NameProvider.getBoundSitePatternName(agent, ref));

				// Node creation
				IBeXNode n1 = IBeXPatternFactory.createNode("src", agentTypeRegistry.get(agent.getName()));
				IBeXNode n2 = IBeXPatternFactory.createNode("trg",
						agentTypeRegistry.get(ModelHelper.getPartnerAgentTypeKey(ref)));

				boundPattern.getSignatureNodes().add(n1);
				boundPattern.getLocalNodes().add(n2);

				// Edge Creation
				IBeXEdge edge = IBeXPatternFactory.createEdge(n1, n2, ref);
				boundPattern.getLocalEdges().add(edge);

				// Save Pattern
				ibexModel.getPatternSet().getContextPatterns().add(boundPattern);
				boundPatterns.put(boundPattern.getName(), boundPattern);
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
					stateTypeRegistry.get(NameProvider.getStateTypeKey(si)));
			contextPattern.getSignatureNodes().add(stateNode);
		}

		// Get node with state
		// Get nodes or create new ones if not existent
		IBeXNode nodeInState = ModelHelper.getNodeFromContextPattern(contextPattern, ai.getName());
		if (nodeInState == null) {
			nodeInState = IBeXPatternFactory.createNode(ai.getName(),
					agentTypeRegistry.get(ai.getInstanceOf().getName()));
			if (ai.isLocal()) {
				contextPattern.getLocalNodes().add(nodeInState);
			} else {
				contextPattern.getSignatureNodes().add(nodeInState);
			}

		}

		if (isActive) {
			IBeXEdge stateEdge = IBeXPatternFactory.createEdge(nodeInState, stateNode, getEdgeTypeToState(ai, si));
			contextPattern.getLocalEdges().add(stateEdge);
		}

	}

	private EReference getEdgeType(IntermSiteInstance si, IntermSiteInstance siTrg) {
		return edgeTypeRegistry.get(NameProvider.getEdgeTypeKey(si, siTrg));
	}

	private EReference getEdgeTypeToState(IntermAgentInstance ai, IntermSiteInstance si) {
		return edgeTypeRegistry.get(NameProvider.getEdgeTypeToStateKey(ai, si));
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
			freeNode = IBeXPatternFactory.createNode(ai.getName(), agentTypeRegistry.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(freeNode);
		}

		// Add Pattern Invocations for every bound pattern mapped to source
		List<IBeXContextPattern> boundPatterns = ModelHelper.getBoundPatternsForSite(ibexModel.getPatternSet(), ai, si);

		for (IBeXContextPattern invokedPattern : boundPatterns) {
			if (!ModelHelper.patternAlreadyInvokedWithNode(contextPattern, invokedPattern, freeNode)) {
				IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
				invoc.setInvokedBy(contextPattern);
				invoc.setPositive(false);

				invoc.setInvokedPattern(invokedPattern);

				IBeXNode srcNode = ModelHelper.getSignatureNodeFromContextPattern(invokedPattern, "src");

				invoc.getMapping().put(freeNode, srcNode);

				contextPattern.getInvocations().add(invoc);
			}
		}
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
					agentTypeRegistry.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(unspecifiedNode);
		}

		// Add Pattern Invocation for "Not Bound To"
		// Other cases can be excluded since an unspecified node can not be bound
		// neither is it free
		for (IntermSiteInstance siteNotBoundTo : si.getNotBoundTo()) {

			// Get or Create nodes
			IntermAgentInstance aiNotBoundTo = siteNotBoundTo.getParent();
			IBeXNode nodeNotBoundTo;
			if (aiNotBoundTo.isLocal()) {
				nodeNotBoundTo = IBeXPatternFactory.createNode(aiNotBoundTo.getName(),
						agentTypeRegistry.get(aiNotBoundTo.getInstanceOf().getName()));
			} else {
				nodeNotBoundTo = ModelHelper.getSignatureNodeFromContextPattern(contextPattern, aiNotBoundTo.getName());
				if (nodeNotBoundTo == null) {
					nodeNotBoundTo = IBeXPatternFactory.createNode(aiNotBoundTo.getName(),
							agentTypeRegistry.get(aiNotBoundTo.getInstanceOf().getName()));
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
		forbiddenPattern = IBeXPatternModelFactory.eINSTANCE.createIBeXContextPattern();
		forbiddenPattern.setName(qualifiedName);

		IntermAgentInstance trgParent = trg.getParent();

		// Create nodes
		IBeXNode srcNode = IBeXPatternFactory.createNode("src",
				agentTypeRegistry.get(src.getParent().getInstanceOf().getName()));
		IBeXNode trgNode = IBeXPatternFactory.createNode("trg",
				agentTypeRegistry.get(trg.getParent().getInstanceOf().getName()));

		forbiddenPattern.getSignatureNodes().add(srcNode);
		if (trg.getParent().isLocal()) {
			forbiddenPattern.getLocalNodes().add(trgNode);
		} else {
			forbiddenPattern.getSignatureNodes().add(trgNode);
		}

		// create edge
		IBeXEdge edge1 = IBeXPatternFactory.createEdge(srcNode, trgNode, getEdgeType(src, trg));
		forbiddenPattern.getLocalEdges().add(edge1);

		// Add state for target
		IntermSiteState state = trg.getState();
		if (state != null) {
			String stateNodeName = NameProvider.getQualifiedStateNodeName(trg);
			IBeXNode stateNode = IBeXPatternFactory.createNode(stateNodeName,
					stateTypeRegistry.get(NameProvider.getStateTypeKey(trg)));
			IBeXEdge stateEdge = IBeXPatternFactory.createEdge(trgNode, stateNode, getEdgeTypeToState(trgParent, trg));

			forbiddenPattern.getLocalNodes().add(stateNode);
			forbiddenPattern.getLocalEdges().add(stateEdge);
		}

		conditionPatterns.put(qualifiedName, forbiddenPattern);
		ibexModel.getPatternSet().getContextPatterns().add(forbiddenPattern);

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
					agentTypeRegistry.get(ai.getInstanceOf().getName()));
			contextPattern.getSignatureNodes().add(boundNode);
		}

		IntermSiteInstance boundToSite = si.getBoundTo();
		if (boundToSite != null) {

			if (si.getParent() == boundToSite.getParent()) {
				// Check if edge already exists outgoing from the node bound to

				IBeXNode boundPartner = boundNode;
				if (ModelHelper.getEdgeFromContextPattern(contextPattern, boundNode, boundPartner) == null) {
					EReference edgeType = getEdgeType(si, boundToSite);
					IBeXEdge edge = IBeXPatternFactory.createEdge(boundNode, boundPartner, edgeType);
					contextPattern.getLocalEdges().add(edge);
				}
			} else {
				IntermAgentInstance boundToAgent = boundToSite.getParent();
				String partnerName = boundToAgent.getName();
				IBeXNode boundPartner;

				boundPartner = ModelHelper.getNodeFromContextPattern(contextPattern, partnerName);
				if (boundPartner == null) {
					boundPartner = IBeXPatternFactory.createNode(partnerName,
							agentTypeRegistry.get(boundToAgent.getInstanceOf().getName()));
					contextPattern.getSignatureNodes().add(boundPartner);
				}

				EReference edgeType = getEdgeType(si, boundToSite);
				
				if (edgeType != null && ModelHelper.getEdgeFromContextPattern(contextPattern, boundNode, boundPartner) == null) {
					IBeXEdge edge = IBeXPatternFactory.createEdge(boundNode, boundPartner, edgeType);
					contextPattern.getLocalEdges().add(edge);
				}
			}
		}
		// for example: a.b+?
		else {

			// Create Free Pattern with NAC bound invocations
			IBeXContextPattern freePattern = ModelHelper.getFreePatternForSite(ibexModel.getPatternSet(), ai, si);

			if (freePattern == null) {
				// Create new free Pattern

				freePattern = ibexFactory.createIBeXContextPattern();
				freePattern.setName(NameProvider.getFreeSitePatternName(ai, si));

				IBeXNode freeNode = IBeXPatternFactory.createNode("src",
						agentTypeRegistry.get(ai.getInstanceOf().getName()));
				freePattern.getSignatureNodes().add(freeNode);

				// Add Pattern Invocations for every bound pattern mapped to source and for
				// every bound pattern mapped to trg
				List<IBeXContextPattern> boundPatterns = ModelHelper.getBoundPatternsForSite(ibexModel.getPatternSet(), ai, si);

				for (IBeXContextPattern invokedPattern : boundPatterns) {
					if (!ModelHelper.patternAlreadyInvokedWithNode(freePattern, invokedPattern, boundNode)) {
						IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
						invoc.setInvokedBy(freePattern);
						invoc.setPositive(false);

						invoc.setInvokedPattern(invokedPattern);

						IBeXNode srcNode = ModelHelper.getSignatureNodeFromContextPattern(invokedPattern, "src");

						invoc.getMapping().put(freeNode, srcNode);

						freePattern.getInvocations().add(invoc);
					}
				}

				ibexModel.getPatternSet().getContextPatterns().add(freePattern);
			}

			// Add free pattern as NAC to actual pattern
			IBeXNode nacNode = ModelHelper.getSignatureNodeFromContextPattern(freePattern, "src");

			IBeXPatternInvocation invoc = ibexFactory.createIBeXPatternInvocation();
			invoc.setPositive(false);
			invoc.setInvokedBy(contextPattern);
			invoc.setInvokedPattern(freePattern);

			invoc.getMapping().put(boundNode, nacNode);

			contextPattern.getInvocations().add(invoc);

		}
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
								stateTypeRegistry.get(NameProvider.getStateTypeKey(si)));
					} else {
						stateNode.setType(stateTypeRegistry.get(NameProvider.getStateTypeKey(si)));
					}

					contextPatternRule.getSignatureNodes().add(stateNode);
				}
			}
		}

		ibexModel.getPatternSet().getContextPatterns().add(contextPatternRule);
		rule2pattern.put(rule, contextPatternRule);
	}

	/**
	 * Creates the respective pattern from a given observable and registers it.
	 */
	private void createContextPatternFromObs(IntermObservable obs) {
		IBeXContextPattern obsContextPattern = createContextPatternFromPattern(obs.getObsPattern());
		obsContextPattern.setName("obs_" + obs.getName());

		ibexModel.getPatternSet().getContextPatterns().add(obsContextPattern);
	}

	/**
	 * @return the given pattern translated into an IBeXContextPattern
	 */
	private IBeXContextPattern createContextPatternFromPattern(IntermPattern pattern) {

		IBeXContextPattern contextPattern = ibexFactory.createIBeXContextPattern();

		List<IntermAgentInstance> instances = pattern.getAgentInstances();

		// Add container node for imitating blank pattern
		if (instances.isEmpty()) {
			IBeXNode blankNode = IBeXPatternFactory.createNode("blank", ReactionModelPackage.Literals.REACTION_CONTAINER);
			contextPattern.getSignatureNodes().add(blankNode);
			return contextPattern;
		}

		for (IntermAgentInstance ai : instances) {

			List<IntermSiteInstance> siList = ai.getSiteInstances();

			// only create agent node if the agent does not have any sites
			if (siList.isEmpty()) {
				String aiName = ai.getName();
				IBeXNode node = ModelHelper.getNodeFromContextPattern(contextPattern, aiName);
				if (node == null) {
					node = IBeXPatternFactory.createNode(aiName, agentTypeRegistry.get(ai.getInstanceOf().getName()));
					if (ai.isLocal()) {
						contextPattern.getLocalNodes().add(node);
					} else {
						contextPattern.getSignatureNodes().add(node);
					}
				}
			}

			for (IntermSiteInstance si : siList) {

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

	public IBeXModel getIBeXModel() {
		return ibexModel;
	}

}
