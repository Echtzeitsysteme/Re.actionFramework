package org.reaction.reactionmodel.generator;

import IntermediateModel.IntermAgent;
import IntermediateModel.IntermSite;
import IntermediateModel.IntermSiteInstance;
import IntermediateModel.IntermSiteState;
import ReactionModel.Agent;
import ReactionModel.State;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.reaction.reactionmodel.util.AgentClassFactory;
import org.reaction.reactionmodel.util.StateClassFactory;

public class AgentTemplate {

	Map<String, State> stateInstances;
	AgentClassFactory agentFactory;
	StateClassFactory stateFactory;

	private String agentClassName;
	private Map<String, String> siteStateReferences;
	private Map<IntermSite, IntermSite> siteReferences;

	public AgentTemplate(IntermAgent agent, AgentClassFactory agentFactory, StateClassFactory stateFactory,
			Map<String, State> stateInstances) {

		this.stateInstances = stateInstances;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;

		agentClassName = agent.getName();
		siteStateReferences = new HashMap<>();
		siteReferences = new HashMap<>();
	}

	public void defineSiteState(IntermSite site, IntermSiteState state) {
		siteStateReferences.put(
				StateClassFactory.createCombinedClassName(agentClassName, site.getName(), state.getName()),
				state.getName().toUpperCase()+"_s");
	}
	
	public void defineSitePartner(IntermSite site, IntermSite otherSite) {
		siteReferences.put(site, otherSite);
	}

	public void setStates(Agent thisAgent) {
		for (String refName : siteStateReferences.keySet()) {
			EReference ref = stateFactory.getEClassRegistry().getRegisteredReference(refName);
			EObject state = stateInstances.get(siteStateReferences.get(refName));
			thisAgent.eSet(ref, state);
		}
	}
	
	public boolean isBound() {
		return siteReferences.isEmpty();
	}
	
	public static String createSiteRefName(IntermSiteInstance site, IntermSiteInstance otherSite) {
		return site.getParent().getInstanceOf().getName()+"_"+site.getName()+"_"+otherSite.getParent().getInstanceOf().getName()+"_"+otherSite.getName();
	}

	public String getAgentClassName() {
		return agentClassName;
	}

}
