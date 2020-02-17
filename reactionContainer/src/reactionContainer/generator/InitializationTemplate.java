package reactionContainer.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermPattern;
import ecoreBCModel.IntermSite;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;
import reactionContainer.Agent;
import reactionContainer.State;
import reactionContainer.util.AgentClassFactory;
import reactionContainer.util.StateClassFactory;

public class InitializationTemplate {

	private IntermPattern pattern;
	private AgentClassFactory agentFactory;
	private StateClassFactory stateFactory;
	private Map<String, State> stateInstances;
	private Map<IntermAgentInstance, AgentTemplate> agentTemplates;

	public InitializationTemplate(IntermPattern pattern, AgentClassFactory agentFactory, StateClassFactory stateFactory,
			Map<String, State> stateInstances) {

		this.pattern = pattern;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;
		this.stateInstances = stateInstances;

		createAgentTemplates();
		findStates();
	}

	private void createAgentTemplates() {
		agentTemplates = new HashMap<>();

		// find agents in pattern
		for (IntermAgentInstance instance : pattern.getAgentInstances()) {
			agentTemplates.put(instance,
					new AgentTemplate(instance.getInstanceOf(), agentFactory, stateFactory, stateInstances));
		}

	}

	private void findStates() {

		for (IntermAgentInstance instance : pattern.getAgentInstances()) {
			for (IntermSiteInstance siteInstance : instance.getSiteInstances()) {
				IntermSite site = siteInstance.getInstanceOf();

				if (site.getSiteStates().size() > 0) {
					if (siteInstance.getState() == null) {
						agentTemplates.get(instance).defineSiteState(site, site.getSiteStates().get(0));
					} else {
						IntermSiteState siteState = siteInstance.getState();
						agentTemplates.get(instance).defineSiteState(site, siteState);
					}
				}
			}
		}

	}

	public Collection<Agent> createInstances(int amount) {
		Collection<Agent> instances = new LinkedList<Agent>();
		Map<AgentTemplate, Agent> tempInstances = new HashMap<AgentTemplate, Agent>();

		for (AgentTemplate template : agentTemplates.values()) {
			tempInstances.put(template, null);
		}
		for (; amount > 0; amount--) {

			for (AgentTemplate template : agentTemplates.values()) {
				Agent agent = agentFactory.getEObjectFactory().createObject(template.getAgentClassName());
				template.setStates(agent);
				tempInstances.replace(template, agent);
			}

			for (AgentTemplate template : agentTemplates.values()) {
				template.setReferences(tempInstances.get(template), tempInstances);
			}

			instances.addAll(tempInstances.values());

		}

		return instances;
	}

}
