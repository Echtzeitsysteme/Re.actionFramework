package org.reaction.transformations.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import ecoreBCModel.BindingState;
import ecoreBCModel.EcoreBCModelFactory;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermPattern;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;

public class PatternFactory {

	IntermPatternTemplate template;
	Map<String, IntermAgentInstance> instances;
	List<IntermAgentInstance> localInstances;

	List<IntermSiteInstance> unspecifiedSiteInstances;
	Map<IntermSiteInstance, List<IntermSiteState>> siteToPossibleStates;

	public PatternFactory(IntermPatternTemplate template) {
		this.template = template;
		init();
	}

	private void init() {
		instances = template.getAgentInstances();
		localInstances = template.getLocalInstances();
	}

	/**
	 * @param concretePattern - if true, all unspecified states are set to default
	 *                        state and all unspecified sites are set to free
	 * @return the pattern resulting from the template
	 */
	public IntermPattern getPattern(boolean concretePattern) {
		IntermPattern pattern = EcoreBCModelFactory.eINSTANCE.createIntermPattern();
		if (!concretePattern || (unspecifiedSiteInstances != null && unspecifiedSiteInstances.isEmpty())) {
			pattern.setName(template.getName());
			pattern.getAgentInstances().addAll(instances.values());
			pattern.getAgentInstances().addAll(localInstances);
		} else {
			pattern.setName(template.getName() + "madeConcrete");
			makeInstancesConcrete();
			pattern.getAgentInstances().addAll(instances.values());
			pattern.getAgentInstances().addAll(localInstances);
		}

		return pattern;
	}

	/**
	 * @return a copy of the existent agent instance list with all unspecified
	 *         states set to default state and all unspecified sites set to free.
	 */
	private void makeInstancesConcrete() {
		
		for (IntermAgentInstance ai : instances.values()) {
			for (IntermSiteInstance si : ai.getSiteInstances()) {
				if (si.getBindingState() == BindingState.UNSPECIFIED) {
					si.setBindingState(BindingState.FREE);
				}
				if (si.getState() == null) {
					List<IntermSiteState> possibleStates = si.getInstanceOf().getSiteStates();
					if (possibleStates != null && possibleStates.size() > 0) {
						si.setState(possibleStates.get(0));
					}
				}
			}
		}

	}

	/**
	 * @return a copy of the given list of agent instances
	 */
	public List<IntermAgentInstance> createAiCopies(List<IntermAgentInstance> original) {
		List<IntermAgentInstance> copy = new ArrayList<>();
		for (IntermAgentInstance ai : original) {
			IntermAgentInstance aiCopy = EcoreBCModelFactory.eINSTANCE.createIntermAgentInstance();
			aiCopy.setInstanceOf(ai.getInstanceOf());
			aiCopy.setName(ai.getName());
			aiCopy.setLocal(ai.isLocal());
			aiCopy.getSiteInstances().addAll((createSiteCopies(ai.getSiteInstances())));
			copy.add(aiCopy);
		}
		return copy;
	}

	/**
	 * @return a copy of the given list of agent instances
	 */
	public List<IntermAgentInstance> createAiCopies(Collection<IntermAgentInstance> original) {
		List<IntermAgentInstance> copies = new ArrayList<>();
		for (IntermAgentInstance ai : original) {
			IntermAgentInstance aiCopy = EcoreBCModelFactory.eINSTANCE.createIntermAgentInstance();
			aiCopy.setInstanceOf(ai.getInstanceOf());
			aiCopy.setName(ai.getName());
			aiCopy.setLocal(ai.isLocal());
			aiCopy.getSiteInstances().addAll(createSiteCopies(ai.getSiteInstances()));
			copies.add(aiCopy);
		}
		return copies;
	}

	public List<IntermSiteInstance> createSiteCopies(List<IntermSiteInstance> original) {

		List<IntermSiteInstance> copy = new ArrayList<>();
		for (IntermSiteInstance si : original) {
			IntermSiteInstance siCopy = EcoreBCModelFactory.eINSTANCE.createIntermSiteInstance();
			siCopy.setName(si.getName());
			siCopy.setInstanceOf(si.getInstanceOf());
			siCopy.setBindingState(si.getBindingState());
			siCopy.setState(si.getState());
			siCopy.getNotBoundTo().addAll(si.getNotBoundTo());
			siCopy.setBoundTo(si.getBoundTo());
			copy.add(siCopy);
		}

		return copy;
	}

}