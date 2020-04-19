/**
 */
package GKLModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GKLModel.GKLModelPackage
 * @generated
 */
public interface GKLModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GKLModelFactory eINSTANCE = GKLModel.impl.GKLModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P</em>'.
	 * @generated
	 */
	P createP();

	/**
	 * Returns a new object of class '<em>T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T</em>'.
	 * @generated
	 */
	T createT();

	/**
	 * Returns a new object of class '<em>K</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>K</em>'.
	 * @generated
	 */
	K createK();

	/**
	 * Returns a new object of class '<em>Us</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Us</em>'.
	 * @generated
	 */
	U_s createU_s();

	/**
	 * Returns a new object of class '<em>Ps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ps</em>'.
	 * @generated
	 */
	P_s createP_s();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GKLModelPackage getGKLModelPackage();

} //GKLModelFactory
