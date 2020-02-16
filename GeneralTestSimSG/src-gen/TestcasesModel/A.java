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
 *   <li>{@link TestcasesModel.A#getA_b <em>Ab</em>}</li>
 *   <li>{@link TestcasesModel.A#getA_c <em>Ac</em>}</li>
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
	 * Returns the value of the '<em><b>Ab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ab</em>' reference.
	 * @see #setA_b(Agent)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_b()
	 * @model
	 * @generated
	 */
	Agent getA_b();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_b <em>Ab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ab</em>' reference.
	 * @see #getA_b()
	 * @generated
	 */
	void setA_b(Agent value);

	/**
	 * Returns the value of the '<em><b>Ac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ac</em>' reference.
	 * @see #setA_c(Agent)
	 * @see TestcasesModel.TestcasesModelPackage#getA_A_c()
	 * @model
	 * @generated
	 */
	Agent getA_c();

	/**
	 * Sets the value of the '{@link TestcasesModel.A#getA_c <em>Ac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ac</em>' reference.
	 * @see #getA_c()
	 * @generated
	 */
	void setA_c(Agent value);

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
