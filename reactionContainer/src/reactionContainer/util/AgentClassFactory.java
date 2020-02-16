package reactionContainer.util;

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
	
	public AgentClassFactory(EPackage ecorePackage, StateClassFactory stateClassFactory) {
		super(ecorePackage);
		this.stateClassFactory = stateClassFactory;
	}
	
	@Override
	protected void setEObjectFactory() {
		objectFactory = new AgentFactory(ecorePackage, classRegistry);
	}

	
	@Override
	public EClass createClass(IntermAgent object) {
		if(classRegistry.containsClass(object.getName())) {
			return classRegistry.getRegisteredClass(object.getName());
		}
		
		EClass agentClass = ecoreFactory.createEClass();
		agentClass.getESuperTypes().add(ReactionContainerPackage.Literals.AGENT);
		agentClass.setName(object.getName());
		ecorePackage.getEClassifiers().add(agentClass);
		classRegistry.registerClass(agentClass);
		
		// Create custom typed EReferences representing sites
		for(IntermSite site : object.getSites()) {
			agentClass.getEStructuralFeatures().add(createReference(object, site));
			// generate site states
			if(site.getSiteStates() != null) {
				if(site.getSiteStates().size() > 0) {
					for(IntermSiteState state : site.getSiteStates()) {
						EClass stateClass = stateClassFactory.createClass(state);
						agentClass.getEStructuralFeatures().add(stateClassFactory.createReference(object, site, state, stateClass));
					}
				}
			}
		}
		
		return agentClass;
	}
	
	public EReference createReference(IntermAgent agent, IntermSite site) {
		String refName = createReferenceName(agent, site);
		if(classRegistry.containsReference(refName)) {
			return classRegistry.getRegisteredReference(refName);
		}

		return createSingleReference(agent, refName);

	}
	
	public EReference createSingleReference(IntermAgent agent, String refName) {
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(ReactionContainerPackage.Literals.AGENT);
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

}
