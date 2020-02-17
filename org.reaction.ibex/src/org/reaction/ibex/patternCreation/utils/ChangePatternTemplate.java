package org.reaction.ibex.patternCreation.utils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermRule;

public class ChangePatternTemplate {

	private List<IntermAgentInstance> createdInstances;
	private Map<IntermAgentInstance, IntermAgentInstance> changesMap;
	
	private IntermRule rule;
	
	public ChangePatternTemplate(IntermRule rule) {
		this.rule = rule;
		init();
	}
	
	private void init() {
		initChanges();
	}
	
	/**
	 * @return a map containing the agent instance of the pre condition as key and
	 *         the agent instance of the post condition as value.
	 */
	private void initChanges() {
		createdInstances = new LinkedList<>();
		changesMap = new HashMap<>();

		List<IntermAgentInstance> lhs = rule.getLhs().getAgentInstances();
		List<IntermAgentInstance> rhs = rule.getRhs().getAgentInstances();

		for (IntermAgentInstance pre : lhs) {
			// get instance with same name from right site (null if it is deleted)
			IntermAgentInstance post = ModelHelper.getAgentInstanceWithName(rhs, pre.getName());
			changesMap.put(pre, post);
		}

		// TODO: Look for newly created agents on the right site
		for(IntermAgentInstance post : rhs) {
			if(!lhs.contains(post)) {
				createdInstances.add(post);
			}
		}
	}
	
	public String getName() {
		return rule.getName();
	}
}
