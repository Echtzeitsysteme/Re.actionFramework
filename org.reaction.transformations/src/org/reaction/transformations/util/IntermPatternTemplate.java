package org.reaction.transformations.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.reaction.ibex.patternCreation.utils.NameProvider;
import org.reaction.transformations.dslToIntermediateModel.DslToIntermTransformation;
import org.xtext.biochemics.dotDsl.*;

import ecoreBCModel.*;

/**
 * Template because it holds instances representing a completely valid pattern
 * except for states that were left unspecified.
 * 
 * @author tobnie
 *
 */
public class IntermPatternTemplate {

	String name;

	int initCnt;

	Map<String, IntermAgentInstance> instances;
	List<IntermAgentInstance> localInstances;
	List<IntermSiteInstance> sitesWithUnspecifiedStates;
	Pattern originalPattern;
	PatternContainer patternContainer;
	DslToIntermTransformation transformation;

	public IntermPatternTemplate(Pattern pattern, DslToIntermTransformation transformation) {
		originalPattern = pattern;
		this.transformation = transformation;
		patternContainer = transformation.getPatternContainer();
		init();
	}

	private void init() {
		initCnt = 1;
		createName();
		if (originalPattern instanceof BlankPattern) {
			instances = Collections.emptyMap();
			localInstances = Collections.emptyList();
		} else {
			initInstances();
			initUnspecifiedStatesMap();
			establishConnections();
		}
	}

	/**
	 * Connects all instances in the mapping as given by the original pattern.
	 * unspecified site states are set to null and unspecified sites are left to
	 * stay unspecified.
	 */
	private void establishConnections() {
		List<Bond> Bonds = ((Bonds) originalPattern).getBonds();
		for (Bond pElement : Bonds) {

			if (pElement instanceof BlankPattern) {
				return;
			}
			if (pElement instanceof Bond) {
				establishBond((Bond) pElement);
			} else {
				throw new UnsupportedOperationException(
						"Other types than bonds and blank patterns can not be used for establishing connections between the instances");
			}
		}
	}

	/**
	 * 
	 * @param rbs - the right bond side to be searched.
	 * @return the partner to be bound or not be bound to. Can be of type
	 *         IntermAgent, IntermAgentInstance or IntermSiteInstance.
	 */
	private IntermSiteInstance findPartner(BondSide rbs) {
		SiteInstance rbsSi = rbs.getSiteInstance();

		AbstractAgent abstrAgent = rbs.getAbstractAgent();
		if (abstrAgent instanceof Agent) {
			// Agent and Site Instance given: create local instance and return it
				IntermAgentInstance localInstance = this.createLocalAgent((Agent) abstrAgent);
				String localInstanceName = NameProvider.getQualifiedLocalNodeName(rbs);
				localInstance.setName(localInstanceName);

				// create local site
				IntermSiteInstance localSite = EcoreBCModelFactory.eINSTANCE.createIntermSiteInstance();
				localSite.setInstanceOf(transformation.siteToIntermSite(rbsSi.getSite()));
				localSite.setName(rbsSi.getSite().getName());
				localSite.setBindingState(BindingState.UNSPECIFIED);
				localSite.setParent(localInstance);

				// Set state
				SiteInstanceState state = rbsSi.getSiteState();
				if (state != null) {
					IntermSiteState iState = getIntermSiteState(localSite, rbsSi.getSiteState());
					localSite.setState(iState);
				}

				localInstance.getSiteInstances().add(localSite);

				localInstances.add(localInstance);

				return localSite;
		}
		if (abstrAgent instanceof AgentInstance) {
			// Find right bond side objects

			AgentInstance rightAi = (AgentInstance) abstrAgent;
			if (rbsSi != null) {
				IntermSiteInstance siteInstance = getIntermSiteInstance(rightAi, rbsSi);

				// set state
				SiteInstanceState state = rbsSi.getSiteState();
				if (state != null) {
					IntermSiteState iState = getIntermSiteState(siteInstance, rbsSi.getSiteState());
					siteInstance.setState(iState);
				}

				return siteInstance;
			} else {
				IntermAgentInstance intermRightAi = instances.get(rightAi.getName());
				throw new UnsupportedOperationException("You broke something when removing Bindable Interface.");
//				return intermRightAi;
			}

		}
		return null;
	}

	/**
	 * Establishes a connection from a bond by setting the binding partners for the
	 * corresponding sites
	 * 
	 * @param bond - the bond to be used as connection template
	 */
	private void establishBond(Bond bond) {

		BondSideOrWildcard rbsOrWild = bond.getRight();

		// Find left bond side agents
		BondSide lbs = bond.getLeft();
		AgentInstance leftAi = (AgentInstance) lbs.getAbstractAgent();
		SiteInstance leftSi = lbs.getSiteInstance();
		IntermSiteInstance leftIntermSi = getIntermSiteInstance(leftAi, leftSi);
		BondType bondType = bond.getBondType();

		List<IntermSiteInstance> intermLeftSiteInstances = new LinkedList<>();
		if (leftIntermSi == null) {
			intermLeftSiteInstances.addAll(instances.get(leftAi.getName()).getSiteInstances());
		} else {
			intermLeftSiteInstances.add(leftIntermSi);
		}

		// update state (if existent) or recognize as unspecified
		if (leftSi != null) {
			if (leftSi.getSite().getStates().size() > 0) {
				if (leftSi.getSiteState() != null) {
					leftIntermSi.setState(getIntermSiteState(leftIntermSi, leftSi.getSiteState()));
				} else {
					addSiteWithUnspecifiedState(leftIntermSi);
				}
			}
		}

		if (rbsOrWild != null) {

			// right side unspecified ---- of type a.x//0 or a.x+?
			if (rbsOrWild.getWildcard() != null) {

				BindingState stateToSet = BindingState.FREE;
				if (bondType == BondType.BOUND) {
					stateToSet = BindingState.BOUND;
				}

				for (IntermSiteInstance si : intermLeftSiteInstances) {
					si.setBindingState(stateToSet);
				}
			}

			// right side specified
			else {

				BondSide rbs = (BondSide) rbsOrWild;
				IntermSiteInstance partner = findPartner(rbs); // Finds partner AND sets state

				if (bondType == BondType.UNBOUND) {
					for (IntermSiteInstance si : intermLeftSiteInstances) {
						forbidSiteInstanceConnection(si, partner);
					}
				}
				if (bondType == BondType.BOUND) {
					for (IntermSiteInstance si : intermLeftSiteInstances) {
						connectSiteInstanceTo(si, partner);
					}
				}
			}
		}
	}

	/**
	 * Connects two given intermediate site instances and updates their binding
	 * statuses.
	 */
	private void connectSiteInstanceTo(IntermSiteInstance si1, IntermSiteInstance partner) {
		si1.setBoundTo(partner);
		si1.setBindingState(BindingState.BOUND);

		partner.setBoundTo(si1);
		partner.setBindingState(BindingState.BOUND);
	}

	/**
	 * Forbids the connection between two given intermediate site instances
	 */
	private void forbidSiteInstanceConnection(IntermSiteInstance si1, IntermSiteInstance partner) {
		si1.getNotBoundTo().add(partner);
		partner.getNotBoundTo().add(si1);
	}

	/**
	 * @return the intermediate site instance of all the already existent agent
	 *         instances corresponding to the given agent and site instances.
	 */
	private IntermSiteInstance getIntermSiteInstance(AgentInstance agentInstance, SiteInstance siteInstance) {
		if (siteInstance == null) {
			return null;
		}

		IntermAgentInstance intermAi = instances.get(agentInstance.getName());

		for (IntermSiteInstance ini : intermAi.getSiteInstances()) {
			if (ini.getName().equals(siteInstance.getSite().getName())) {
				return ini;
			}
		}
		return null;
	}

	/**
	 * Remembers a given site as having no specified state
	 */
	private void addSiteWithUnspecifiedState(IntermSiteInstance intermSi) {
		if (!sitesWithUnspecifiedStates.contains(intermSi)) {
			sitesWithUnspecifiedStates.add(intermSi);
		}
	}

	/**
	 * @return the intermediate site state to a given siteInstanceState
	 */
	private IntermSiteState getIntermSiteState(IntermSiteInstance intermSi, SiteInstanceState siteInstanceState) {

		for (IntermSiteState iSiteState : intermSi.getInstanceOf().getSiteStates()) {
			if (iSiteState.getName().equals(siteInstanceState.getState().getName())) {
				return iSiteState;
			}
		}

		return null;
	}

	/**
	 * Finds all instances used within the given pattern and instantiates them in a
	 * mapping to intermediate agent instances. These agent instances have all site
	 * instances created but set to unspecified and only possess null site states.
	 */
	private void initInstances() {

		instances = new HashMap<>();
		List<AgentInstance> allInstances = getAgentInstancesFromPattern(originalPattern);

		// Put instances in Map
		for (IntermAgentInstance ini : transformAgentInstancesToInterm(allInstances)) {
			instances.put(ini.getName(), ini);
		}

		localInstances = new LinkedList<>();
	}

	private void initUnspecifiedStatesMap() {
		sitesWithUnspecifiedStates = new ArrayList<>();
	}

	/**
	 * Transforms a list of agent instances to a list of intermediate agent
	 * instances
	 */
	private List<IntermAgentInstance> transformAgentInstancesToInterm(List<AgentInstance> instances) {
		return instances.stream().map((AgentInstance ai) -> transformAgent(ai)).collect(Collectors.toList());
	}

	/**
	 * Transforms an agent instance to an intermediate agent instance
	 * 
	 * @param ai - the original agent instance to be transformed
	 * @return an intermediate agent instance with all site states set to null and
	 *         all sites set to unspecified
	 */
	private IntermAgentInstance transformAgent(AgentInstance ai) {

		IntermAgentInstance intermAi = EcoreBCModelFactory.eINSTANCE.createIntermAgentInstance();
		intermAi.setName(ai.getName());
		intermAi.setInstanceOf(transformation.agentToIntermAgent(ai.getInstanceOf()));
		intermAi.getSiteInstances().addAll(deriveSiteInstances(intermAi, ai));

		return intermAi;
	}

	/**
	 * @return a local IntermAgentInstance of the given type with the given site
	 *         instance. The binding state of the given site instance is
	 *         unspecified.
	 */
	private IntermAgentInstance createLocalAgent(Agent agent) {
		IntermAgent rightIAgent = transformation.agentToIntermAgent(agent);

		// create local agent
		IntermAgentInstance localInstance = EcoreBCModelFactory.eINSTANCE.createIntermAgentInstance();
		localInstance.setInstanceOf(rightIAgent);
		localInstance.setLocal(false);

		return localInstance;
	}

	/**
	 * Derives all interm site instances from a given agent instance.
	 * 
	 * @param ai - the agent instance to derive the site instances from.
	 * @return a list of site instances. all bindings unspecified and all states set
	 *         to null
	 */
	private Collection<IntermSiteInstance> deriveSiteInstances(IntermAgentInstance intermAi, AgentInstance ai) {

		List<IntermSiteInstance> intermSiList = new ArrayList<>();

		for (Site site : ai.getInstanceOf().getSites()) {
			IntermSiteInstance intermSi = EcoreBCModelFactory.eINSTANCE.createIntermSiteInstance();
			intermSi.setName(site.getName());
			intermSi.setParent(intermAi);
			intermSi.setBindingState(BindingState.UNSPECIFIED);
			intermSi.setInstanceOf(transformation.siteToIntermSite(site));
			intermSiList.add(intermSi);
		}

		return intermSiList;
	}

	/**
	 * Returns a list of all agent instances existent in a pattern.
	 */
	private List<AgentInstance> getAgentInstancesFromPattern(Pattern pattern) {

		if (pattern instanceof BlankPattern) {
			return Collections.emptyList();
		} else {
			List<Bond> elements = ((Bonds) pattern).getBonds();
			List<AgentInstance> instances = new ArrayList<>();

			for (Bond element : elements) {
				if (element instanceof Bond) {
					Bond bond = (Bond) element;
					AgentInstance instanceToAddLeft = (AgentInstance) ((Bond) element).getLeft().getAbstractAgent();
					if (!(instances.contains(instanceToAddLeft))) {
						instances.add(instanceToAddLeft);
					}

					BondSideOrWildcard rbsOrWildcard = bond.getRight();
					if (rbsOrWildcard instanceof BondSide) {
						AbstractAgent abstrAgent = (((BondSide) rbsOrWildcard).getAbstractAgent());
						if (abstrAgent instanceof AgentInstance) {
							AgentInstance instanceToAddRight = (AgentInstance) abstrAgent;
							if (!(instances.contains(instanceToAddRight))) {
								instances.add(instanceToAddRight);
							}
						}
					}
				}
			}
			return instances;
		}
	}

	public Map<String, IntermAgentInstance> getAgentInstances() {
		return instances;
	}

	public List<IntermAgentInstance> getLocalInstances() {
		return localInstances;
	}

	public List<IntermSiteInstance> getSitesWithUnspecifiedStates() {
		return sitesWithUnspecifiedStates;
	}

	public String getName() {
		return name;
	}

	/**
	 * @return the name of a rule, observer or initialisation of a pattern
	 */
	private String getParentName(Pattern pattern) {
		EObject traverser = pattern;

		while (!(traverser instanceof ReactionModel)) {
			if (traverser instanceof Rule) {
				String ruleName = ((Rule) traverser).getHead().getName();
				if (isLhs(pattern)) {
					return ruleName + "Lhs";
				} else {
					return ruleName + "Rhs";
				}
			}
			if (traverser instanceof Observable) {
				return ((Observable) traverser).getName();
			}
			if (traverser instanceof Initialisation) {
				return "init" + initCnt++;
			}

			traverser = traverser.eContainer();
		}

		throw new RuntimeException("Could not find parent of pattern: " + pattern.toString());
	}

	/**
	 * @return true, if this pattern is the left hand side of its rule
	 */
	private boolean isLhs(Pattern pattern) {

		EObject traverser = pattern.eContainer();
		while (!(traverser instanceof RuleBody)) {
			traverser = traverser.eContainer();
		}
		if (traverser instanceof RuleBody) {
			if (((RuleBody) traverser).getLhs() == pattern) {
				return true;
			} else {
				return false;
			}
		}

		throw new RuntimeException("Pattern " + pattern.toString() + "does not seem to be in contained in a rule?");
	}

	private void createName() {
		name = getParentName(originalPattern);
	}
}
