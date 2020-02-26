package reactionContainer.generator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermSite;
import ecoreBCModel.IntermSiteState;
import reactionContainer.Agent;
import reactionContainer.State;
import reactionContainer.util.AgentClassFactory;
import reactionContainer.util.StateClassFactory;

public class AgentTemplate {

	Map<String, State> stateInstances;
	AgentClassFactory agentFactory;
	StateClassFactory stateFactory;

	private String agentClassName;
	private Map<String, String> siteStateReferences;
	private Map<String, List<AgentTemplate>> agentReferences;
	private Map<String, List<IntermSite>> siteReferences;

	public AgentTemplate(IntermAgent agent, AgentClassFactory agentFactory, StateClassFactory stateFactory,
			Map<String, State> stateInstances) {

		this.stateInstances = stateInstances;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;

		agentClassName = agent.getName();
		agentReferences = new HashMap<String, List<AgentTemplate>>();
		siteStateReferences = new HashMap<String, String>();
	}

	public void defineSiteState(IntermSite site, IntermSiteState state) {
		siteStateReferences.put(
				StateClassFactory.createCombinedClassName(agentClassName, site.getName(), state.getName()),
				state.getName().toUpperCase()+"_s");
	}

	public void addReference(IntermSite site, AgentTemplate otherAgent, IntermSite otherSite) {
		List<AgentTemplate> agentTemplates = agentReferences
				.get(AgentClassFactory.createCombinedClassName(agentClassName, site.getName()));
		List<IntermSite> siteTemplates = siteReferences
				.get(AgentClassFactory.createCombinedClassName(agentClassName, site.getName()));
		if (agentTemplates == null) {
			agentTemplates = new LinkedList<AgentTemplate>();
			agentReferences.put(AgentClassFactory.createCombinedClassName(agentClassName, site.getName(), otherAgent.getAgentClassName(), otherSite.getName()), agentTemplates);
		}
		if (siteTemplates == null) {
			siteTemplates = new LinkedList<IntermSite>();
			agentReferences.put(AgentClassFactory.createCombinedClassName(agentClassName, site.getName(), otherAgent.getAgentClassName(), otherSite.getName()), agentTemplates);
		}
		agentTemplates.add(otherAgent);
		siteTemplates.add(otherSite);
	}

	public void setStates(Agent thisAgent) {
		for (String refName : siteStateReferences.keySet()) {
			EReference ref = stateFactory.getEClassRegistry().getRegisteredReference(refName);
			EObject state = stateInstances.get(siteStateReferences.get(refName));
			thisAgent.eSet(ref, state);
		}
	}

	@SuppressWarnings("unchecked")
	public void setReferences(Agent thisAgent, Map<AgentTemplate, Agent> tempInstances) {
		for (String refName : agentReferences.keySet()) {
			List<AgentTemplate> otherTemplates = agentReferences.get(refName);
			EReference ref = agentFactory.getEClassRegistry().getRegisteredReference(refName);
			if (ref.getUpperBound() != EStructuralFeature.UNBOUNDED_MULTIPLICITY) {
				Agent otherAgent = tempInstances.get(otherTemplates.get(0));
				thisAgent.eSet(ref, otherAgent);
			} else {
				for (AgentTemplate template : otherTemplates) {
					Agent otherAgent = tempInstances.get(template);
					((List<Agent >) thisAgent.eGet(ref)).add(otherAgent);
				}

			}

		}
	}

	public String getAgentClassName() {
		return agentClassName;
	}

}
