package reactionContainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import intermModel.IntermAgent;
import reactionContainer.Agent;

public class AgentFactory extends EObjectFactory<Agent, IntermAgent>{
	
	public AgentFactory(EPackage ecorePackage, EClassRegistry<IntermAgent> agentClassRegistry) {
		super(ecorePackage, agentClassRegistry);
	}
	
	@Override
	public Agent createObject(String typeClass) {
		Agent agent = (Agent)ecoreFactory.create(classRegistry.getRegisteredClass(typeClass));
		agent.setID(System.nanoTime());
		return agent;
	}

	@Override
	public Agent createObject(EClass typeClass) {
		Agent agent = (Agent)ecoreFactory.create(typeClass);
		agent.setID(System.nanoTime());
		return agent;
	}
}
