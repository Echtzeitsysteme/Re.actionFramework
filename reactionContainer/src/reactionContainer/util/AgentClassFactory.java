package reactionContainer.util;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermSite;
import ecoreBCModel.IntermSiteState;
import reactionContainer.Agent;
import reactionContainer.ReactionContainerPackage;

public class AgentClassFactory extends EClassFactory<IntermAgent, Agent> {

	protected StateClassFactory stateClassFactory;
	protected Map<String, List<IntermSite>> siteConnections;
	Map<String, List<IntermSiteState>> statesInUse;

	public AgentClassFactory(EPackage ecorePackage, StateClassFactory stateClassFactory,
			Map<String, List<IntermSite>> siteConnections, Map<String, List<IntermSiteState>> statesInUse) {
		super(ecorePackage);
		this.stateClassFactory = stateClassFactory;
		this.siteConnections = siteConnections;
		this.statesInUse = statesInUse;
	}

	@Override
	protected void setEObjectFactory() {
		objectFactory = new AgentFactory(ecorePackage, classRegistry);
	}

	@Override
	public EClass createClass(IntermAgent object) {
		if (classRegistry.containsClass(object.getName())) {
			return classRegistry.getRegisteredClass(object.getName());
		}

		EClass agentClass = ecoreFactory.createEClass();
		agentClass.getESuperTypes().add(ReactionContainerPackage.Literals.AGENT);
		agentClass.setName(object.getName());
		ecorePackage.getEClassifiers().add(agentClass);
		classRegistry.registerClass(agentClass);

		return agentClass;
	}

	public EClass createAgentReferences(IntermAgent object) {
		if (!classRegistry.containsClass(object.getName())) {
			return null;
		}

		EClass agentClass = classRegistry.getRegisteredClass(object.getName());

		// Create custom typed EReferences representing sites
		for (IntermSite siteOfAgent : object.getSites()) {

			// generate site connection references
			String key = object.getName() + "_" + siteOfAgent.getName();
			if (siteConnections.containsKey(key)) {
				for (IntermSite possibleSite : siteConnections.get(object.getName() + "_" + siteOfAgent.getName())) {
					createReferenceFromTo(object, siteOfAgent, possibleSite.getParent(), possibleSite);
				}
			}

			// generate site states
			if (siteOfAgent.getSiteStates() != null) {
				if (siteOfAgent.getSiteStates().size() > 0) {
					
					// Always create defaultStates
					IntermSiteState defaultState = siteOfAgent.getSiteStates().get(0);
					String refName = key + "_" + defaultState.getName();
					// Create default state if not already happened
					if (stateClassFactory.getEClassRegistry().getRegisteredReference(refName) == null) {
						EClass stateClass = stateClassFactory.createClass(defaultState);
						agentClass.getEStructuralFeatures()
								.add(stateClassFactory.createReference(object, siteOfAgent, defaultState, stateClass));
					}

					if (statesInUse.containsKey(key)) {
						for (IntermSiteState state : statesInUse.get(key)) {
							EClass stateClass = stateClassFactory.createClass(state);
							agentClass.getEStructuralFeatures()
									.add(stateClassFactory.createReference(object, siteOfAgent, state, stateClass));
						}
					}

				}
			}
		}

		return agentClass;
	}

	public boolean createReferenceFromTo(IntermAgent agent, IntermSite site, IntermAgent otherAgent,
			IntermSite otherSite) {
		String refName = createReferenceName(agent, site, otherAgent, otherSite);
		String inverseRefName = getInverseReferenceName(refName);
		if (classRegistry.containsReference(refName)) {
			return false;
		}

		EClass agentClass = classRegistry.getRegisteredClass(agent.getName());
		EClass oppositeAgentClass = classRegistry.getRegisteredClass(otherAgent.getName());
		EReference ref = createSingleReference(agentClass, refName, otherAgent.getName());
		if(!refName.equals(inverseRefName)) {
			EReference oppositeRef = createSingleReference(oppositeAgentClass, inverseRefName, agent.getName());
			ref.setEOpposite(oppositeRef);
			oppositeRef.setEOpposite(ref);
		}

		return true;
	}

	/**
	 * Creates and registers a new reference of given type
	 * 
	 * @return the created reference or null, if it failed or an inverse edge
	 *         reference is already existent and registered
	 */
	public EReference createSingleReference(EClass agentClass, String refName, String typeName) {
		if (checkReferenceAlreadyRegistered(refName)) {
			return null;
		}

		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);

		reference.setEType(classRegistry.getRegisteredClass(typeName));
		agentClass.getEStructuralFeatures().add(reference);
		classRegistry.registerReference(reference);
		
		return reference;
	}

	@Override
	public EObjectFactory<Agent, IntermAgent> getEObjectFactory() {
		return objectFactory;
	}

	@Override
	public EClassRegistry<IntermAgent> getEClassRegistry() {
		return classRegistry;
	}

	public static String createReferenceName(IntermAgent agent, IntermSite site) {
		return createCombinedClassName(agent.getName(), site.getName());
	}

	public static String createReferenceName(IntermAgent agent, IntermSite site, IntermAgent otherAgent,
			IntermSite otherSite) {
		return createCombinedClassName(agent.getName(), site.getName(), otherAgent.getName(), otherSite.getName());
	}

	private boolean checkReferenceAlreadyRegistered(String refName) {
		return classRegistry.getRegisteredReference(refName) != null;
	}

	private String getInverseReferenceName(String refName) {

		String regex = "(?<agent1>.*)_(?<site1>.*)_(?<agent2>.*)_(?<site2>.*)";
		Pattern regexPattern = Pattern.compile(regex);
		Matcher matcher = regexPattern.matcher(refName);
		matcher.find();

		return matcher.group("agent2") + "_" + matcher.group("site2") + "_" + matcher.group("agent1") + "_"
				+ matcher.group("site1");
	}

}
