/**
 */
package intermModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see intermModel.IntermModelPackage
 * @generated
 */
public interface IntermModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermModelFactory eINSTANCE = intermModel.impl.IntermModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interm Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Site</em>'.
	 * @generated
	 */
	IntermSite createIntermSite();

	/**
	 * Returns a new object of class '<em>Interm Initialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Initialisation</em>'.
	 * @generated
	 */
	IntermInitialisation createIntermInitialisation();

	/**
	 * Returns a new object of class '<em>Interm Site Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Site Instance</em>'.
	 * @generated
	 */
	IntermSiteInstance createIntermSiteInstance();

	/**
	 * Returns a new object of class '<em>Pattern Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Container</em>'.
	 * @generated
	 */
	PatternContainer createPatternContainer();

	/**
	 * Returns a new object of class '<em>Interm Site State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Site State</em>'.
	 * @generated
	 */
	IntermSiteState createIntermSiteState();

	/**
	 * Returns a new object of class '<em>Interm Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Pattern</em>'.
	 * @generated
	 */
	IntermPattern createIntermPattern();

	/**
	 * Returns a new object of class '<em>Interm Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Rule</em>'.
	 * @generated
	 */
	IntermRule createIntermRule();

	/**
	 * Returns a new object of class '<em>Interm Observable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Observable</em>'.
	 * @generated
	 */
	IntermObservable createIntermObservable();

	/**
	 * Returns a new object of class '<em>Interm Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Agent</em>'.
	 * @generated
	 */
	IntermAgent createIntermAgent();

	/**
	 * Returns a new object of class '<em>Intermediate Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Model</em>'.
	 * @generated
	 */
	IntermediateModel createIntermediateModel();

	/**
	 * Returns a new object of class '<em>Interm Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Command</em>'.
	 * @generated
	 */
	IntermCommand createIntermCommand();

	/**
	 * Returns a new object of class '<em>Interm Agent Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interm Agent Instance</em>'.
	 * @generated
	 */
	IntermAgentInstance createIntermAgentInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermModelPackage getIntermModelPackage();

} //IntermModelFactory
