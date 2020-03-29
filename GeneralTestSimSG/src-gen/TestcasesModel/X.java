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
 *   <li>{@link TestcasesModel.X#getX_z_A_b <em>XzAb</em>}</li>
 *   <li>{@link TestcasesModel.X#getX_y_A_b <em>XyAb</em>}</li>
 *   <li>{@link TestcasesModel.X#getX_z_A_c <em>XzAc</em>}</li>
 *   <li>{@link TestcasesModel.X#getX_y_A_c <em>XyAc</em>}</li>
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
	 * Returns the value of the '<em><b>XzAb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.A#getA_b_X_z <em>AbXz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XzAb</em>' reference.
	 * @see #setX_z_A_b(A)
	 * @see TestcasesModel.TestcasesModelPackage#getX_X_z_A_b()
	 * @see TestcasesModel.A#getA_b_X_z
	 * @model opposite="A_b_X_z"
	 * @generated
	 */
	A getX_z_A_b();

	/**
	 * Sets the value of the '{@link TestcasesModel.X#getX_z_A_b <em>XzAb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XzAb</em>' reference.
	 * @see #getX_z_A_b()
	 * @generated
	 */
	void setX_z_A_b(A value);

	/**
	 * Returns the value of the '<em><b>XyAb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.A#getA_b_X_y <em>AbXy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XyAb</em>' reference.
	 * @see #setX_y_A_b(A)
	 * @see TestcasesModel.TestcasesModelPackage#getX_X_y_A_b()
	 * @see TestcasesModel.A#getA_b_X_y
	 * @model opposite="A_b_X_y"
	 * @generated
	 */
	A getX_y_A_b();

	/**
	 * Sets the value of the '{@link TestcasesModel.X#getX_y_A_b <em>XyAb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XyAb</em>' reference.
	 * @see #getX_y_A_b()
	 * @generated
	 */
	void setX_y_A_b(A value);

	/**
	 * Returns the value of the '<em><b>XzAc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.A#getA_c_X_z <em>AcXz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XzAc</em>' reference.
	 * @see #setX_z_A_c(A)
	 * @see TestcasesModel.TestcasesModelPackage#getX_X_z_A_c()
	 * @see TestcasesModel.A#getA_c_X_z
	 * @model opposite="A_c_X_z"
	 * @generated
	 */
	A getX_z_A_c();

	/**
	 * Sets the value of the '{@link TestcasesModel.X#getX_z_A_c <em>XzAc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XzAc</em>' reference.
	 * @see #getX_z_A_c()
	 * @generated
	 */
	void setX_z_A_c(A value);

	/**
	 * Returns the value of the '<em><b>XyAc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.A#getA_c_X_y <em>AcXy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XyAc</em>' reference.
	 * @see #setX_y_A_c(A)
	 * @see TestcasesModel.TestcasesModelPackage#getX_X_y_A_c()
	 * @see TestcasesModel.A#getA_c_X_y
	 * @model opposite="A_c_X_y"
	 * @generated
	 */
	A getX_y_A_c();

	/**
	 * Sets the value of the '{@link TestcasesModel.X#getX_y_A_c <em>XyAc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XyAc</em>' reference.
	 * @see #getX_y_A_c()
	 * @generated
	 */
	void setX_y_A_c(A value);

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
