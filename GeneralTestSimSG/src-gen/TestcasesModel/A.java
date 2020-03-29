/**
 */
package TestcasesModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.A#getA_b_X_z <em>AbXz</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_b_A_c <em>AbAc</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_c_A_b <em>AcAb</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_b_A_b <em>AbAb</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_b_X_y <em>AbXy</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_c_X_z <em>AcXz</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_c_X_y <em>AcXy</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_c_u <em>Acu</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_c_p <em>Acp</em>}</li>
 * </ul>
 *
 * @see TestcasesModel.TestcasesModelPackage#getA()
 * @model
 * @generated
 */
public interface A extends Agent {
	/**
	 * Returns the value of the '<em><b>AbXz</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.X#getX_z_A_b <em>XzAb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AbXz</em>' reference.
	 * @see #setA_b_X_z(X)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_b_X_z()
	 * @see TestcasesModel.X#getX_z_A_b
	 * @model opposite="X_z_A_b"
	 * @generated
	 */
	X getA_b_X_z();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_b_X_z <em>AbXz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AbXz</em>' reference.
	 * @see #getA_b_X_z()
	 * @generated
	 */
	void setA_b_X_z(X value);

	/**
	 * Returns the value of the '<em><b>AbAc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.A#getA_c_A_b <em>AcAb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AbAc</em>' reference.
	 * @see #setA_b_A_c(A)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_b_A_c()
	 * @see TestcasesModel.A#getA_c_A_b
	 * @model opposite="A_c_A_b"
	 * @generated
	 */
	A getA_b_A_c();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_b_A_c <em>AbAc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AbAc</em>' reference.
	 * @see #getA_b_A_c()
	 * @generated
	 */
	void setA_b_A_c(A value);

	/**
	 * Returns the value of the '<em><b>AcAb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.A#getA_b_A_c <em>AbAc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AcAb</em>' reference.
	 * @see #setA_c_A_b(A)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_c_A_b()
	 * @see TestcasesModel.A#getA_b_A_c
	 * @model opposite="A_b_A_c"
	 * @generated
	 */
	A getA_c_A_b();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_c_A_b <em>AcAb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AcAb</em>' reference.
	 * @see #getA_c_A_b()
	 * @generated
	 */
	void setA_c_A_b(A value);

	/**
	 * Returns the value of the '<em><b>AbAb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AbAb</em>' reference.
	 * @see #setA_b_A_b(A)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_b_A_b()
	 * @model
	 * @generated
	 */
	A getA_b_A_b();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_b_A_b <em>AbAb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AbAb</em>' reference.
	 * @see #getA_b_A_b()
	 * @generated
	 */
	void setA_b_A_b(A value);

	/**
	 * Returns the value of the '<em><b>AbXy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.X#getX_y_A_b <em>XyAb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AbXy</em>' reference.
	 * @see #setA_b_X_y(X)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_b_X_y()
	 * @see TestcasesModel.X#getX_y_A_b
	 * @model opposite="X_y_A_b"
	 * @generated
	 */
	X getA_b_X_y();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_b_X_y <em>AbXy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AbXy</em>' reference.
	 * @see #getA_b_X_y()
	 * @generated
	 */
	void setA_b_X_y(X value);

	/**
	 * Returns the value of the '<em><b>AcXz</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.X#getX_z_A_c <em>XzAc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AcXz</em>' reference.
	 * @see #setA_c_X_z(X)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_c_X_z()
	 * @see TestcasesModel.X#getX_z_A_c
	 * @model opposite="X_z_A_c"
	 * @generated
	 */
	X getA_c_X_z();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_c_X_z <em>AcXz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AcXz</em>' reference.
	 * @see #getA_c_X_z()
	 * @generated
	 */
	void setA_c_X_z(X value);

	/**
	 * Returns the value of the '<em><b>AcXy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TestcasesModel.X#getX_y_A_c <em>XyAc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AcXy</em>' reference.
	 * @see #setA_c_X_y(X)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_c_X_y()
	 * @see TestcasesModel.X#getX_y_A_c
	 * @model opposite="X_y_A_c"
	 * @generated
	 */
	X getA_c_X_y();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_c_X_y <em>AcXy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AcXy</em>' reference.
	 * @see #getA_c_X_y()
	 * @generated
	 */
	void setA_c_X_y(X value);

	/**
	 * Returns the value of the '<em><b>Acu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acu</em>' reference.
	 * @see #setA_c_u(U_s)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_c_u()
	 * @model
	 * @generated
	 */
	U_s getA_c_u();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_c_u <em>Acu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acu</em>' reference.
	 * @see #getA_c_u()
	 * @generated
	 */
	void setA_c_u(U_s value);

	/**
	 * Returns the value of the '<em><b>Acp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acp</em>' reference.
	 * @see #setA_c_p(P_s)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_c_p()
	 * @model
	 * @generated
	 */
	P_s getA_c_p();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_c_p <em>Acp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acp</em>' reference.
	 * @see #getA_c_p()
	 * @generated
	 */
	void setA_c_p(P_s value);

} // A
