/**
 */
package intermModel.util;

import intermModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see intermModel.IntermModelPackage
 * @generated
 */
public class IntermModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermModelSwitch<Adapter> modelSwitch = new IntermModelSwitch<Adapter>() {
		@Override
		public Adapter caseIntermSite(IntermSite object) {
			return createIntermSiteAdapter();
		}

		@Override
		public Adapter caseIntermInitialisation(IntermInitialisation object) {
			return createIntermInitialisationAdapter();
		}

		@Override
		public Adapter caseIntermSiteInstance(IntermSiteInstance object) {
			return createIntermSiteInstanceAdapter();
		}

		@Override
		public Adapter casePatternContainer(PatternContainer object) {
			return createPatternContainerAdapter();
		}

		@Override
		public Adapter caseIntermSiteState(IntermSiteState object) {
			return createIntermSiteStateAdapter();
		}

		@Override
		public Adapter caseIntermPattern(IntermPattern object) {
			return createIntermPatternAdapter();
		}

		@Override
		public Adapter caseIntermRule(IntermRule object) {
			return createIntermRuleAdapter();
		}

		@Override
		public Adapter caseIntermObservable(IntermObservable object) {
			return createIntermObservableAdapter();
		}

		@Override
		public Adapter caseIntermComponent(IntermComponent object) {
			return createIntermComponentAdapter();
		}

		@Override
		public Adapter caseIntermAgent(IntermAgent object) {
			return createIntermAgentAdapter();
		}

		@Override
		public Adapter caseIntermediateModel(IntermediateModel object) {
			return createIntermediateModelAdapter();
		}

		@Override
		public Adapter caseIntermCommand(IntermCommand object) {
			return createIntermCommandAdapter();
		}

		@Override
		public Adapter caseIntermAgentInstance(IntermAgentInstance object) {
			return createIntermAgentInstanceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermSite <em>Interm Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermSite
	 * @generated
	 */
	public Adapter createIntermSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermInitialisation <em>Interm Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermInitialisation
	 * @generated
	 */
	public Adapter createIntermInitialisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermSiteInstance <em>Interm Site Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermSiteInstance
	 * @generated
	 */
	public Adapter createIntermSiteInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.PatternContainer <em>Pattern Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.PatternContainer
	 * @generated
	 */
	public Adapter createPatternContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermSiteState <em>Interm Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermSiteState
	 * @generated
	 */
	public Adapter createIntermSiteStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermPattern <em>Interm Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermPattern
	 * @generated
	 */
	public Adapter createIntermPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermRule <em>Interm Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermRule
	 * @generated
	 */
	public Adapter createIntermRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermObservable <em>Interm Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermObservable
	 * @generated
	 */
	public Adapter createIntermObservableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermComponent <em>Interm Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermComponent
	 * @generated
	 */
	public Adapter createIntermComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermAgent <em>Interm Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermAgent
	 * @generated
	 */
	public Adapter createIntermAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermediateModel <em>Intermediate Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermediateModel
	 * @generated
	 */
	public Adapter createIntermediateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermCommand <em>Interm Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermCommand
	 * @generated
	 */
	public Adapter createIntermCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermModel.IntermAgentInstance <em>Interm Agent Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermModel.IntermAgentInstance
	 * @generated
	 */
	public Adapter createIntermAgentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntermModelAdapterFactory
