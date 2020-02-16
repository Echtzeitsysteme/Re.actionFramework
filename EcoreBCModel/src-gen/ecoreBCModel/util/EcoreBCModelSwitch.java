/**
 */
package ecoreBCModel.util;

import ecoreBCModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ecoreBCModel.EcoreBCModelPackage
 * @generated
 */
public class EcoreBCModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreBCModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreBCModelSwitch() {
		if (modelPackage == null) {
			modelPackage = EcoreBCModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EcoreBCModelPackage.INTERMEDIATE_MODEL: {
			IntermediateModel intermediateModel = (IntermediateModel) theEObject;
			T result = caseIntermediateModel(intermediateModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_COMPONENT: {
			IntermComponent intermComponent = (IntermComponent) theEObject;
			T result = caseIntermComponent(intermComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_AGENT: {
			IntermAgent intermAgent = (IntermAgent) theEObject;
			T result = caseIntermAgent(intermAgent);
			if (result == null)
				result = caseIntermComponent(intermAgent);
			if (result == null)
				result = caseBindable(intermAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_RULE: {
			IntermRule intermRule = (IntermRule) theEObject;
			T result = caseIntermRule(intermRule);
			if (result == null)
				result = caseIntermComponent(intermRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_SITE: {
			IntermSite intermSite = (IntermSite) theEObject;
			T result = caseIntermSite(intermSite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_INITIALISATION: {
			IntermInitialisation intermInitialisation = (IntermInitialisation) theEObject;
			T result = caseIntermInitialisation(intermInitialisation);
			if (result == null)
				result = caseIntermComponent(intermInitialisation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_OBSERVABLE: {
			IntermObservable intermObservable = (IntermObservable) theEObject;
			T result = caseIntermObservable(intermObservable);
			if (result == null)
				result = caseIntermComponent(intermObservable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_SITE_STATE: {
			IntermSiteState intermSiteState = (IntermSiteState) theEObject;
			T result = caseIntermSiteState(intermSiteState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_PATTERN: {
			IntermPattern intermPattern = (IntermPattern) theEObject;
			T result = caseIntermPattern(intermPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE: {
			IntermAgentInstance intermAgentInstance = (IntermAgentInstance) theEObject;
			T result = caseIntermAgentInstance(intermAgentInstance);
			if (result == null)
				result = caseBindable(intermAgentInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE: {
			IntermSiteInstance intermSiteInstance = (IntermSiteInstance) theEObject;
			T result = caseIntermSiteInstance(intermSiteInstance);
			if (result == null)
				result = caseBindable(intermSiteInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.PATTERN_CONTAINER: {
			PatternContainer patternContainer = (PatternContainer) theEObject;
			T result = casePatternContainer(patternContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.INTERM_COMMAND: {
			IntermCommand intermCommand = (IntermCommand) theEObject;
			T result = caseIntermCommand(intermCommand);
			if (result == null)
				result = caseIntermComponent(intermCommand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreBCModelPackage.BINDABLE: {
			Bindable bindable = (Bindable) theEObject;
			T result = caseBindable(bindable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateModel(IntermediateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermComponent(IntermComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermAgent(IntermAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermRule(IntermRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermSite(IntermSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Initialisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Initialisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermInitialisation(IntermInitialisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Observable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Observable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermObservable(IntermObservable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Site State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Site State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermSiteState(IntermSiteState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermPattern(IntermPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Agent Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Agent Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermAgentInstance(IntermAgentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Site Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Site Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermSiteInstance(IntermSiteInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternContainer(PatternContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interm Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interm Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermCommand(IntermCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindable(Bindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EcoreBCModelSwitch
