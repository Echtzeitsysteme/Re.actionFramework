package org.reaction.export;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.reaction.dsl.reactionLanguage.AgentDeclaration;
import org.reaction.dsl.reactionLanguage.ReactionModel;
import org.reaction.dsl.reactionLanguage.Rule;
import org.reaction.dsl.reactionLanguage.Variable;

import IntermediateModel.BindingState;
import IntermediateModel.CommandType;
import IntermediateModel.IntermAgentInstance;
import IntermediateModel.IntermCommand;
import IntermediateModel.IntermInitialisation;
import IntermediateModel.IntermObservable;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermSiteInstance;
import IntermediateModel.IntermediateModelContainer;


public class ExportUtils {

	public static boolean isAgentBound(IntermAgentInstance ai) {
		for (IntermSiteInstance si : ai.getSiteInstances()) {
			if (si.getBindingState() == BindingState.BOUND) {
				return true;
			}
		}

		return false;
	}

	public static List<IntermAgentInstance> getAgentGroup(IntermAgentInstance ai) {
		return getAgentGroup(ai, new LinkedList<>());
	}

	private static List<IntermAgentInstance> getAgentGroup(IntermAgentInstance ai,
			List<IntermAgentInstance> foundMembers) {

		if (foundMembers.contains(ai)) {
			return foundMembers;
		} else {
			foundMembers.add(ai);
			for (IntermSiteInstance si : ai.getSiteInstances()) {
				if (si.getBindingState() == BindingState.BOUND && si.getBoundTo() != null) {
					IntermAgentInstance partnerAi = si.getBoundTo().getParent();
					foundMembers = getAgentGroup(partnerAi, foundMembers);
				}
			}
			return foundMembers;
		}
	}

	public static List<Variable> getVariablesFromModel(ReactionModel dslModel) {
		return EcoreUtil2.getAllContentsOfType(dslModel, Variable.class);
	}

	public static List<AgentDeclaration> getAgentDeclarationsFromModel(ReactionModel dslModel) {
		return EcoreUtil2.getAllContentsOfType(dslModel, AgentDeclaration.class);
	}

	public static List<Rule> getRulesFromModel(ReactionModel dslModel) {
		return EcoreUtil2.getAllContentsOfType(dslModel, Rule.class);
	}

	public static List<IntermRule> getRulesFromIntermModel(IntermediateModelContainer intermModel) {
		return EcoreUtil2.getAllContentsOfType(intermModel, IntermRule.class);
	}

	public static List<IntermInitialisation> getInitsFromIntermModel(IntermediateModelContainer intermModel) {
		return EcoreUtil2.getAllContentsOfType(intermModel, IntermInitialisation.class);
	}
	
	public static List<IntermObservable> getObsFromIntermModel(IntermediateModelContainer intermModel) {
		return EcoreUtil2.getAllContentsOfType(intermModel, IntermObservable.class);
	}
	
	public static List<IntermCommand> getCommandsFromIntermModel(IntermediateModelContainer intermModel){
		return EcoreUtil2.getAllContentsOfType(intermModel, IntermCommand.class);
	}
	
	public static int getHighestEndTime(List<IntermCommand> comms) {
		int time = -1;
		for(IntermCommand comm : comms) {
			if(comm.getType() == CommandType.TIME) {
				if(comm.getCnt() > time) {
					time = (int) comm.getCnt();
				}
			}
		}
				
		return time;
	}
	
	public static int getHighestIterationCnt(List<IntermCommand> comms) {
		int cnt = -1;
		for(IntermCommand comm : comms) {
			if(comm.getType() == CommandType.ITERATIONS) {
				if(comm.getCnt() > cnt) {
					cnt = (int) comm.getCnt();
				}
			}
		}
				
		return cnt;
	}
	
	public static boolean containsPatternCommands(List<IntermCommand> comms) {
		for(IntermCommand comm : comms) {
			if(comm.getType() == CommandType.MATCHES) {
				return true;
			}
		}
		return false;
	}

	public static Variable getVarByName(List<Variable> vars, String name) {
		for (Variable var : vars) {
			if (var.getName().equals(name)) {
				return var;
			}
		}
		return null;
	}

	public static IntermRule getIRuleByName(List<IntermRule> rules, String name) {
		for (IntermRule iRule : rules) {
			if (iRule.getName().equals(name)) {
				return iRule;
			}
		}
		return null;
	}

	public static boolean isInstanceInGroups(List<List<IntermAgentInstance>> groups, IntermAgentInstance ai) {
		for (List<IntermAgentInstance> group : groups) {
			if (group.contains(ai)) {
				return true;
			}
		}
		return false;
	}

	public static boolean lastSpecifiedSiteInstanceInList(List<IntermSiteInstance> siList, IntermSiteInstance si) {
		
		for (int i = siList.indexOf(si)+1; i < siList.size(); i++) {
			if(siList.get(i).getBindingState() != BindingState.UNSPECIFIED) {
				return false;
			}
		}

		return true;
	}
}
