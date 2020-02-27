/**
 */
package TestcasesModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.X#getX_z_u <em>Xzu</em>}</li>
 *   <li>{@link TestcasesModel.X#getX_z_p <em>Xzp</em>}</li>
 * </ul>
 *
 * @see TestcasesModel.TestcasesModelPackage#getX()
 * @model
 * @generated
 */
public interface X extends Agent {
	/**
	 * Returns the value of the '<em><b>Xzu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xzu</em>' reference.
	 * @see #setX_z_u(U_s)
	 * @see TestcasesModel.TestcasesModelPackage#getX_X_z_u()
	 * @model
	 * @generated
	 */
	U_s getX_z_u();

	/**
	 * Sets the value of the '{@link TestcasesModel.X#getX_z_u <em>Xzu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xzu</em>' reference.
	 * @see #getX_z_u()
	 * @generated
	 */
	void setX_z_u(U_s value);

	/**
	 * Returns the value of the '<em><b>Xzp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xzp</em>' reference.
	 * @see #setX_z_p(P_s)
	 * @see TestcasesModel.TestcasesModelPackage#getX_X_z_p()
	 * @model
	 * @generated
	 */
	P_s getX_z_p();

	/**
	 * Sets the value of the '{@link TestcasesModel.X#getX_z_p <em>Xzp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xzp</em>' reference.
	 * @see #getX_z_p()
	 * @generated
	 */
	void setX_z_p(P_s value);

} // X
