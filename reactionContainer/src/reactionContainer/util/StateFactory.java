package reactionContainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

import ecoreBCModel.IntermSiteState;
import reactionContainer.State;

public class StateFactory extends EObjectFactory<State, IntermSiteState> {
	
	public StateFactory(EPackage ecorePackage, EClassRegistry<IntermSiteState> stateClassRegistry) {
		super(ecorePackage, stateClassRegistry);
	}
	
	@Override
	public State createObject(String typeClass) {
		return (State)ecoreFactory.create(classRegistry.getRegisteredClass(typeClass));
	}

	@Override
	public State createObject(EClass typeClass) {
		return (State)ecoreFactory.create(typeClass);
	}

}
