package reactionContainer.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import intermModel.IntermAgent;
import intermModel.IntermSite;
import intermModel.IntermSiteState;
import reactionContainer.ReactionContainerPackage;
import reactionContainer.State;

public class StateClassFactory extends EClassFactory<IntermSiteState, State> {
	
	public StateClassFactory(EPackage ecorePackage) {
		super(ecorePackage);
	}
	
	@Override
	protected void setEObjectFactory() {
		objectFactory = new StateFactory(ecorePackage, classRegistry);
	}

	
	@Override
	public EClass createClass(IntermSiteState object) {
		
		String qualifiedName = object.getName().toUpperCase()+"_s";
		
		if(classRegistry.containsClass(qualifiedName)) {
			return classRegistry.getRegisteredClass(qualifiedName);
		}
		
		EClass stateClass = ecoreFactory.createEClass();
		stateClass.getESuperTypes().add(ReactionContainerPackage.Literals.STATE);
		stateClass.setName(qualifiedName);
		ecorePackage.getEClassifiers().add(stateClass);
		classRegistry.registerClass(stateClass);

		
		return stateClass;
	}
	
	public EReference createReference(IntermAgent agent, IntermSite site, IntermSiteState state, EClass stateClass) {
		String refName = createReferenceName(agent, site, state);
		if(classRegistry.containsReference(refName)) {
			return classRegistry.getRegisteredReference(refName);
		}
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(stateClass);
		classRegistry.registerReference(reference);
		return reference;
	}
	
	public EReference createReference(IntermAgent agent, IntermSiteState state, EClass stateClass) {
		String refName = createReferenceName(agent, state);
		if(classRegistry.containsReference(refName)) {
			return classRegistry.getRegisteredReference(refName);
		}
		EReference reference = ecoreFactory.createEReference();
		reference.setUpperBound(1);
		reference.setLowerBound(0);
		reference.setName(refName);
		reference.setEType(stateClass);
		classRegistry.registerReference(reference);
		return reference;
	}

	@Override
	public EObjectFactory<State, IntermSiteState> getEObjectFactory() {
		return objectFactory;
	}

	@Override
	public EClassRegistry<IntermSiteState> getEClassRegistry() {
		return classRegistry;
	}
	
	public static String createReferenceName(IntermAgent agent, IntermSite site, IntermSiteState state) {
		return createCombinedClassName(agent.getName(), site.getName(), state.getName());
	}
	
	public static String createReferenceName(IntermAgent agent, IntermSiteState state) {
		return createCombinedClassName(agent.getName(), state.getName());
	}

	
}
