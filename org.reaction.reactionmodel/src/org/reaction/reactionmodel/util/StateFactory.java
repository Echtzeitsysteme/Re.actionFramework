package org.reaction.reactionmodel.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import IntermediateModel.IntermSiteState;
import ReactionModel.State;

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
