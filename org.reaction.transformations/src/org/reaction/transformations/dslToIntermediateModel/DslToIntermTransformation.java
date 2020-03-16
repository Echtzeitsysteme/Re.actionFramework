package org.reaction.transformations.dslToIntermediateModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.xtext.biochemics.dotDsl.*;
import org.xtext.biochemics.interpreter.Calculator;
import org.eclipse.xtext.EcoreUtil2;
import org.reaction.transformations.util.IntermPatternTemplate;
import org.reaction.transformations.util.PatternFactory;
import org.reaction.transformations.util.RuleFactory;

import ecoreBCModel.*;

public class DslToIntermTransformation {

	ReactionModel originalModel;

	Calculator calculator;

	PatternContainer patternContainer;

	List<Agent> agentsInDeclarations;
	List<Rule> rulesInModel;
	List<Initialisation> initialisationsInModel;
	List<Observable> observablesInModel;
	List<TerminateCommand> commandsInModel;

	Map<Agent, IntermAgent> agentToIntermAgent;
	Map<Initialisation, IntermInitialisation> initToIntermInit;

	List<IntermRule> translatedRules;
	List<IntermObservable> translatedObservables;
	List<IntermCommand> translatedCommands;

	public DslToIntermTransformation(ReactionModel model) {
		patternContainer = EcoreBCModelFactory.eINSTANCE.createPatternContainer();
		this.originalModel = model;
		calculator = new Calculator();
		init();
	}

	/**
	 * @return the intermediate model
	 */
	public IntermediateModel generateIntermediateModel() {

		System.out.print("Generating new Model...");

		IntermediateModel intermModel = EcoreBCModelFactory.eINSTANCE.createIntermediateModel();
		intermModel.setPatternContainer(patternContainer);

		// Transform Agents and add to model
		transformAgents();
		intermModel.getComponents().addAll(agentToIntermAgent.values());

		// Transform Initialisations and add to model
		transformInitialisations();
		intermModel.getComponents().addAll(initToIntermInit.values());
		
		// Transfrom Rules and add to model
		transformRules();
		intermModel.getComponents().addAll(translatedRules);

		// Transform observables and add to model
		transformObservables();
		intermModel.getComponents().addAll(translatedObservables);

		// Transform commands and add to model
		transformCommands();
		intermModel.getComponents().addAll(translatedCommands);
		
		System.out.print(" Done.\n");
		return intermModel;
	}

	/**
	 * Initializes all fields that should capture the filtered contents of the
	 * original model
	 */
	private void init() {
		agentsInDeclarations = findAgentsInDeclarations();
		rulesInModel = findRulesInModel();
		initialisationsInModel = findInitialisationsInModel();
		observablesInModel = findObservablesInModel();
		commandsInModel = findCommandsInModel();
	}

	/**
	 * Finds all Agents in the all elements of type AgentDeclaration in the original
	 * model
	 * 
	 * @return
	 */
	private List<Agent> findAgentsInDeclarations() {
		List<Agent> agents = new ArrayList<>();
		List<AgentDeclaration> agentDeclarations = EcoreUtil2.getAllContentsOfType(originalModel,
				AgentDeclaration.class);
		for (AgentDeclaration agentDecl : agentDeclarations) {
			agents.addAll(agentDecl.getDeclaredAgents());
		}
		return agents;
	}

	/**
	 * Finds all rules within the original model, i.e. all stand-alone rules and all
	 * rules within complexes.
	 * 
	 * @return
	 */
	private List<Rule> findRulesInModel() {
		return EcoreUtil2.getAllContentsOfType(originalModel, Rule.class);
	}

	/**
	 * Finds all Initialisations within the original model, i.e. all stand-alone
	 * initialisations and all initialisations within complexes.
	 * 
	 * @return
	 */
	private List<Initialisation> findInitialisationsInModel() {
		return EcoreUtil2.getAllContentsOfType(originalModel, Initialisation.class);
	}

	/**
	 * Finds all Observables within the original model, i.e. all stand-alone
	 * initialisations and all observables within complexes.
	 * 
	 * @return
	 */
	private List<Observable> findObservablesInModel() {
		return EcoreUtil2.getAllContentsOfType(originalModel, Observable.class);
	}

	/**
	 * Finds all commands within the original model
	 * 
	 * @return
	 */
	private List<TerminateCommand> findCommandsInModel() {
		return EcoreUtil2.getAllContentsOfType(originalModel, TerminateCommand.class);
	}

	/**
	 * Transforms all agents found in the AgentDeclarations of the original model
	 * and puts them into the translational Map
	 */
	private void transformAgents() {
		agentToIntermAgent = new HashMap<>();
		for (Agent agent : agentsInDeclarations) {
			IntermAgent newAgent = EcoreBCModelFactory.eINSTANCE.createIntermAgent();
			newAgent.setName(agent.getName());
			agentToIntermAgent.put(agent, newAgent);
			List<IntermSite> newSites = createSites(agent);
			newAgent.getSites().addAll(newSites);

		}
	}

	/**
	 * Transforms all rules found in the original model and puts them into the
	 * translational List
	 */
	private void transformRules() {

		translatedRules = new ArrayList<>();

		for (Rule rule : rulesInModel) {
			RuleFactory ruleFactory = new RuleFactory(rule, this);
			translatedRules.addAll(ruleFactory.getRules());
		}

	}

	/**
	 * Transforms all initialisations found in the original model and puts them into
	 * the translational map
	 */
	private void transformInitialisations() {
		initToIntermInit = new HashMap<>();
		for (Initialisation init : initialisationsInModel) {

			// Cnt evaluation
			IntermInitialisation newInit = EcoreBCModelFactory.eINSTANCE.createIntermInitialisation();
			newInit.setCnt((int) Math.floor(calculator.evaluate(init.getHead().getCnt())));

			// pattern transformation
			Pattern initPattern = init.getBody().getPattern();
			IntermPatternTemplate template = new IntermPatternTemplate(initPattern, this);
			PatternFactory patternFactory = new PatternFactory(template);
			IntermPattern intermInitPattern = patternFactory.getPattern(true);
			patternContainer.getPatterns().add(intermInitPattern);
			newInit.setInitPattern(intermInitPattern);

			initToIntermInit.put(init, newInit);
		}

	}

	/**
	 * Transforms all observables found in the original model and puts them into the
	 * translational list
	 */
	private void transformObservables() {
		translatedObservables = new ArrayList<>();

		for (Observable obs : observablesInModel) {
			IntermObservable iObs = EcoreBCModelFactory.eINSTANCE.createIntermObservable();
			iObs.setName(obs.getName());

			ObservableBody obsBody = obs.getBody();

			if (obsBody instanceof ObservablePattern) {
				ObservablePattern obsPattern = (ObservablePattern) obsBody;
				IntermPatternTemplate template = new IntermPatternTemplate(obsPattern.getPattern(), this);
				PatternFactory patternFactory = new PatternFactory(template);
				IntermPattern intermObsPattern = patternFactory.getPattern(false);
				patternContainer.getPatterns().add(intermObsPattern);
				iObs.setObsPattern(intermObsPattern);
			}
			if (obsBody instanceof ObservableArithmetic) {
				throw new UnsupportedOperationException(
						"Arithmetics and therefore variables in observables are not supported yet: "
								+ obsBody.toString());
			}

			translatedObservables.add(iObs);
		}
	}

	private void transformCommands() {
		translatedCommands = new ArrayList<>();

		for (TerminateCommand comm : commandsInModel) {

			IntermCommand iComm = EcoreBCModelFactory.eINSTANCE.createIntermCommand();

			if (comm instanceof TerminateTime) {
				iComm.setType(CommandType.TIME);
				iComm.setCnt(calculator.evaluate(((TerminateTime) comm).getTime()));
			}
			if (comm instanceof TerminateIterations) {
				iComm.setType(CommandType.ITERATIONS);
				iComm.setCnt(calculator.evaluate(((TerminateIterations) comm).getIterations()));
			}
			if (comm instanceof TerminateCount) {
				iComm.setType(CommandType.MATCHES);
				iComm.setCnt(calculator.evaluate(((TerminateCount) comm).getCnt()));

				// pattern transformation
				Pattern patternToMatch = ((TerminateCount) comm).getPattern();
				IntermPatternTemplate template = new IntermPatternTemplate(patternToMatch, this);
				PatternFactory patternFactory = new PatternFactory(template);
				IntermPattern iPatternToMatch = patternFactory.getPattern(false);
				patternContainer.getPatterns().add(iPatternToMatch);

				iComm.setPatternToMatch(iPatternToMatch);
			}

			translatedCommands.add(iComm);
		}
	}

	/**
	 * @param sites - original sites to be transformed
	 * @return the transformed sites for the intermediate model
	 */
	private List<IntermSite> createSites(Agent agent) {

		List<IntermSite> intermSites = new ArrayList<>();
		for (Site site : agent.getSites()) {
			IntermSite newSite = createSite(site);
			newSite.setParent(agentToIntermAgent(agent));
			intermSites.add(newSite);
		}
		return intermSites;
	}

	/**
	 * @return the intermediate site for the given site
	 */
	private IntermSite createSite(Site site) {
		IntermSite newSite = EcoreBCModelFactory.eINSTANCE.createIntermSite();
		newSite.setName(site.getName());
		List<IntermSiteState> newStates = createStates(site.getStates());
		newSite.getSiteStates().addAll(newStates);
		return newSite;
	}

	/**
	 * @param states - original states to be transformed
	 * @return the transformed states for the intermediate model
	 */
	private List<IntermSiteState> createStates(List<SiteState> states) {
		List<IntermSiteState> intermStates = new ArrayList<>();
		for (SiteState state : states) {
			IntermSiteState newState = EcoreBCModelFactory.eINSTANCE.createIntermSiteState();
			newState.setName(state.getName());
			intermStates.add(newState);
		}

		return intermStates;
	}

	/**
	 * @return the IntermAgent of a given agent from the DSL model by reading out
	 *         the transformation mappings
	 */
	public IntermAgent agentToIntermAgent(Agent agent) {
		if (!agentToIntermAgent.containsKey(agent)) {
			throw new NoSuchElementException("The agent '" + agent.getName()
					+ "' to be transformed does not exit. This should not happen as long as the agent transformations were done first and the given dsl model is valid.");
		}
		return agentToIntermAgent.get(agent);
	}

	/**
	 * @param site - a site of the original model
	 * @return the corresponding intermediate site
	 */
	public IntermSite siteToIntermSite(Site site) {
		Agent siteParent = (Agent) site.eContainer();
		IntermAgent intermAgent = agentToIntermAgent(siteParent);

		for (IntermSite intermSite : intermAgent.getSites()) {
			if (intermSite.getName().equals(site.getName())) {
				return intermSite;
			}
		}

		return null;
	}

	public IntermSite getIntermSiteOfAgent(AgentInstance agentInstance, SiteInstance siteInstance) {
		IntermAgent intermAgent = agentToIntermAgent.get(agentInstance.getInstanceOf());

		for (IntermSite iSite : intermAgent.getSites()) {
			if (iSite.getName().equals(siteInstance.getSite().getName())) {
				return iSite;
			}
		}

		return null;
	}

	public PatternContainer getPatternContainer() {
		return patternContainer;
	}
}