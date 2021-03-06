package org.reaction.export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.reaction.dsl.interpreter.Calculator;
import org.reaction.dsl.reactionLanguage.Agent;
import org.reaction.dsl.reactionLanguage.AgentDeclaration;
import org.reaction.dsl.reactionLanguage.ArithmeticExpr;
import org.reaction.dsl.reactionLanguage.ReactionModel;
import org.reaction.dsl.reactionLanguage.Rule;
import org.reaction.dsl.reactionLanguage.RuleType;
import org.reaction.dsl.reactionLanguage.Site;
import org.reaction.dsl.reactionLanguage.SiteState;
import org.reaction.dsl.reactionLanguage.Variable;

import IntermediateModel.BindingState;
import IntermediateModel.IntermAgent;
import IntermediateModel.IntermAgentInstance;
import IntermediateModel.IntermCommand;
import IntermediateModel.IntermInitialisation;
import IntermediateModel.IntermObservable;
import IntermediateModel.IntermPattern;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermSiteInstance;
import IntermediateModel.IntermSiteState;
import IntermediateModel.IntermediateModelContainer;

public class BNGLFactory {

	private Calculator calculator;
	private ReactionModel dslModel;
	protected List<IntermAgent> agentsInModel;
	protected List<AgentDeclaration> agentDeclarations;
	protected Map<String, List<IntermSiteState>> statesInModel;
	private List<Variable> vars;
	private List<IntermInitialisation> inits;
	private List<Rule> rules;
	private List<IntermRule> intermRules;
	private List<IntermObservable> intermObs;
	private List<IntermCommand> intermComms;
	private IntermediateModelContainer intermModel;
	private StringBuilder sb;
	private final String lineBreak = System.getProperty("line.separator");

	public BNGLFactory(ReactionModel dslModel, IntermediateModelContainer intermModel, List<IntermAgent> agentsInModel,
			Map<String, List<IntermSiteState>> statesInModel) {
		this.agentsInModel = agentsInModel;
		this.statesInModel = statesInModel;
		this.dslModel = dslModel;
		this.intermModel = intermModel;
		init();
	}

	public void saveFile(String location) {
		File file = new File(location);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.append(sb.toString());
		} catch (IOException e) {
			System.err.println("Saving BNGL file to \"" + location + "\" failed.");
		}
	}

	private void init() {
		sb = new StringBuilder("");
		vars = ExportUtils.getVariablesFromModel(dslModel);
		inits = ExportUtils.getInitsFromIntermModel(intermModel);
		agentDeclarations = ExportUtils.getAgentDeclarationsFromModel(dslModel);
		rules = ExportUtils.getRulesFromModel(dslModel);
		intermRules = ExportUtils.getRulesFromIntermModel(intermModel);
		intermObs = ExportUtils.getObsFromIntermModel(intermModel);
		intermComms = ExportUtils.getCommandsFromIntermModel(intermModel);
	}

	public void generateBNGL() {
		sb.append("begin model");
		br();
		br();
		if (!vars.isEmpty()) {
			generateParameters();
		}
		generateMoleculeTypes();
		generateSpecies();
		generateRules();
		generateObservables();
		sb.append("end model");
		br();
		br();
		sb.append("#----------------Simulation Details below----------------#");
		br();
		br();
		generateSimulationDetails();
	}

	private void generateParameters() {
		sb.append("begin parameters");
		br();

		for (Variable var : vars) {
			sb.append("\t" + var.getName() + "\t" + calculator.evaluate(var.getValue()));
		}

		sb.append("end parameters");
		br();
		br();
	}

	private void generateMoleculeTypes() {

		sb.append("begin molecule types");
		br();

		for (AgentDeclaration decl : agentDeclarations) {
			for (Agent agent : decl.getDeclaredAgents()) {
				sb.append("\t");
				List<Site> sites = agent.getSites();
				String agentName = agent.getName();

				sb.append(agentName + "(");
				for (Site site : sites) {
					sb.append(site.getName());
					List<SiteState> siteStates = site.getStates();
					if (!siteStates.isEmpty()) {
						for (SiteState state : siteStates) {
							sb.append("~");
							sb.append(state.getName());
						}
					}
					if (sites.indexOf(site) != sites.size() - 1) {
						sb.append(",");
					}
				}
				sb.append(")");
				br();
			}
		}

		sb.append("end molecule types");
		br();
		br();
	}

	// Yet: Only one initialisation allowed and all agents free
	private void generateSpecies() {
		sb.append("begin species");
		br();

		for (IntermInitialisation init : inits) {
			IntermPattern initPattern = init.getInitPattern();
			int amount = init.getCnt();
			List<IntermAgentInstance> instances = initPattern.getAgentInstances();
			for (IntermAgentInstance ai : instances) {

				// Add species
				sb.append("\t");
				sb.append(ai.getInstanceOf().getName() + "(");
				List<IntermSiteInstance> siList = ai.getSiteInstances();
				for (IntermSiteInstance si : siList) {
					sb.append(si.getName());
					if (si.getState() != null) {
						sb.append("~" + si.getState().getName());
					}

					if (siList.indexOf(si) != siList.size() - 1) {
						sb.append(",");
					}
				}
				sb.append(")");

				// Add amount
				sb.append("\t");
				sb.append(amount);
				br();
			}
		}

		sb.append("end species");
		br();
		br();
	}

	private void generateRules() {
		sb.append("begin reaction rules");
		br();

		for (Rule rule : rules) {
			sb.append("\t");
			sb.append(generateRule(rule));
			br();
		}

		sb.append("end reaction rules");
		br();
		br();
	}

	private String generateRule(Rule rule) {

		StringBuilder ruleBuilder = new StringBuilder();
		String ruleName = rule.getHead().getName();
		IntermRule iRule = ExportUtils.getIRuleByName(intermRules, ruleName);
		ArithmeticExpr exprFwd = rule.getBody().getRates().getRateForward();
		ArithmeticExpr exprBwd = null;

		String op = null;
		if (rule.getBody().getRuleType() == RuleType.UNI) {
			op = " -> ";
		}
		if (rule.getBody().getRuleType() == RuleType.BI) {
			op = " <-> ";
			exprBwd = rule.getBody().getRates().getRateBackward();
		}

		String lhs = generatePattern(iRule.getLhs(), false);
		String rhs = generatePattern(iRule.getRhs(), false);

		// start string building here

		// Name
		ruleBuilder.append(ruleName + ":\t");

		// Pre condition
		ruleBuilder.append(lhs);

		// rule type
		ruleBuilder.append(op);

		// Post condition
		ruleBuilder.append(rhs);
		ruleBuilder.append("\t\t");
		ruleBuilder.append(ArithmeticExpressionConverter.toString(exprFwd));
		if (exprBwd != null) {
			ruleBuilder.append(", " + ArithmeticExpressionConverter.toString(exprBwd));
		}

		return ruleBuilder.toString(); // TODO String format
	}

	private String generatePattern(IntermPattern pattern, boolean withUnspecifiedAgents) {
		StringBuilder patternBuilder = new StringBuilder();

		List<IntermAgentInstance> patternAis = pattern.getAgentInstances();
		List<List<IntermAgentInstance>> agentGroups = new LinkedList<>();

		for (IntermAgentInstance ai : patternAis) {
			if (!ExportUtils.isInstanceInGroups(agentGroups, ai)) {
				agentGroups.add(ExportUtils.getAgentGroup(ai));
			}
		}

		for (List<IntermAgentInstance> group : agentGroups) {
			String groupString = generateGroup(group, withUnspecifiedAgents);
			patternBuilder.append(groupString);

			if (agentGroups.indexOf(group) != agentGroups.size() - 1) {
				patternBuilder.append(" + ");
			}
		}

		return patternBuilder.toString();
	}

	private String generateGroup(List<IntermAgentInstance> group, boolean withUnspecifiedAgents) {

		StringBuilder groupBuilder = new StringBuilder();

		int indexCnt = 1;
		Map<IntermSiteInstance, Integer> siteIndices = new HashMap<>();

		// TODO Local agents?
		for (IntermAgentInstance ai : group) {

			if (ai.isLocal()) {
				printWarning("Encountered local agent but can not yet handle that.");
			}

			groupBuilder.append(ai.getInstanceOf().getName() + "(");
			for (IntermSiteInstance si : ai.getSiteInstances()) {
				StringBuilder siBuilder = new StringBuilder();
				// Only mention instance if it is relevant for the pattern

				siBuilder.append(si.getName());

				// State
				IntermSiteState state = si.getState();
				if (state != null) {
					siBuilder.append("~" + state.getName());
				}

				if (si.getBindingState() == BindingState.UNSPECIFIED) {
					if (withUnspecifiedAgents) {
						siBuilder.append("!?");
					} else {
						continue;
					}
				}

				if (si.getBindingState() == BindingState.BOUND) {
					IntermSiteInstance siPartner = si.getBoundTo();
					if (siPartner == null) {
						siBuilder.append("!+");
					} else {
						// Lookup or put indices
						if (siteIndices.containsKey(si)) {
							siBuilder.append("!" + siteIndices.get(si));
						} else {
							siBuilder.append("!" + indexCnt);
							siteIndices.put(si, indexCnt);
							siteIndices.put(siPartner, indexCnt);
							indexCnt++;
						}
					}
				}

				// Add separator for every but the last site
				if (!withUnspecifiedAgents) {
					if (!ExportUtils.lastSpecifiedSiteInstanceInList(ai.getSiteInstances(), si)) {
						siBuilder.append(",");
					}
				} else {
					if (ai.getSiteInstances().indexOf(si) != ai.getSiteInstances().size() - 1) {
						siBuilder.append(",");
					}
				}

				groupBuilder.append(siBuilder.toString());
			}
			groupBuilder.append(")");

			if (group.indexOf(ai) != group.size() - 1) {
				groupBuilder.append(".");
			}
		}

		return groupBuilder.toString();
	}

	private void generateObservables() {
		sb.append("begin observables");
		br();

		for (IntermObservable obs : intermObs) {

			sb.append("\tMolecules " + obs.getName());
			String obsPattern = generatePattern(obs.getObsPattern(), true);
			sb.append("\t");
			sb.append(obsPattern);
			br();
		}

		sb.append("end observables");
		br();
		br();
	}

	private void generateSimulationDetails() {
		int endTime = ExportUtils.getHighestEndTime(intermComms);
		int endCnt = ExportUtils.getHighestIterationCnt(intermComms);
		int simulationParam = endTime > endCnt ? endTime : endCnt;
		if (simulationParam == -1) {
			simulationParam = 50; // 50 as arbitrary chosen default value
		}
		if (ExportUtils.containsPatternCommands(intermComms)) {
			printWarning("Encountered Termination condition on pattern matches but can not handle that.");
		}
		sb.append("generate_network({overwrite=>1})");
		br();
		br();
		sb.append("simulate({method=>\"ssa\", t_end=>" + simulationParam + ", n_steps=>" + simulationParam + "})");
	}

	private void printWarning(String warning) {
		System.out.println("WARNING ----- " + warning);
	}

	private void br() {
		sb.append(lineBreak);
	}
}
