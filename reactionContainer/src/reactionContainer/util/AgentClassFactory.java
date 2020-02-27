package reactionContainer.util;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

//import org.simsg.simsgl.simSGL.Agent;
//import org.simsg.simsgl.simSGL.Attribute;
//import org.simsg.simsgl.simSGL.AttributeType;
//import org.simsg.simsgl.simSGL.FloatAttribute;
//import org.simsg.simsgl.simSGL.IntegerAttribute;
//import org.simsg.simsgl.simSGL.SingleSite;
//import org.simsg.simsgl.simSGL.Site;
//import org.simsg.simsgl.simSGL.State;

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
					EReference createdReference = createReferenceFromTo(object, siteOfAgent, possibleSite.getParent(),
							possibleSite);
					if (createdReference != null) {
						agentClass.getEStructuralFeatures().add(createdReference);
					}
				}
			}

			// generate site states
			if (siteOfAgent.getSiteStates() != null) {
				if (siteOfAgent.getSiteStates().size() > 0) {
					// If no information about possibly needed states is stored, use default state
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

	public EReference createReference(IntermAgent agent, IntermSite site) {
		String refName = createReferenceName(agent, site);
		if (classRegistry.containsReference(refName)) {
			return classRegistry.getRegisteredReference(refName);
		}

		return createGeneralSingleReference(refName);
	}

	public EReference createReferenceFromTo(IntermAgent agent, IntermSite site, IntermAgent otherAgent,
			IntermSite otherSite) {
		String refName = createReferenceName(agent, site, otherAgent, otherSite);
		if (classRegistry.containsReference(refName)) {
			return classRegistry.getRegisteredReference(refName);
		}

		return createSingleReference(refName, otherAgent.getName());
	}

	public EReference createGeneralSingleReference(String refName) {
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);

		reference.setEType(ReactionContainerPackage.Literals.AGENT);
		classRegistry.registerReference(reference);
		return reference;
	}

	/**
	 * Creates and registers a new reference of given type
	 * 
	 * @return the created reference or null, if it failed or an inverse edge
	 *         reference is already existent and registered
	 */
	public EReference createSingleReference(String refName, String typeName) {
		if (checkReferenceAlreadyRegistered(refName)) {
			return null;
		}

		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);

		reference.setEType(classRegistry.getRegisteredClass(typeName));
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

	private boolean checkReferenceAlreadyRegistered(EReference ref) {
		return checkReferenceAlreadyRegistered(ref.getName());
	}

	private boolean checkReferenceAlreadyRegistered(String refName) {
		String inverseRefName = getInverseReferenceName(refName);
		return classRegistry.getRegisteredReference(refName) != null
				|| classRegistry.getRegisteredReference(inverseRefName) != null;
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
