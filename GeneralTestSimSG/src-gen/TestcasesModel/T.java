/**
 */
package TestcasesModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.T#getT_i <em>Ti</em>}</li>
 *   <li>{@link TestcasesModel.T#getT_j <em>Tj</em>}</li>
 * </ul>
 *
 * @see TestcasesModel.TestcasesModelPackage#getT()
 * @model
 * @generated
 */
public interface T extends Agent {
	/**
	 * Returns the value of the '<em><b>Ti</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ti</em>' reference.
	 * @see #setT_i(Agent)
	 * @see TestcasesModel.TestcasesModelPackage#getT_T_i()
	 * @model
	 * @generated
	 */
	Agent getT_i();

	/**
	 * Sets the value of the '{@link TestcasesModel.T#getT_i <em>Ti</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ti</em>' reference.
	 * @see #getT_i()
	 * @generated
	 */
	void setT_i(Agent value);

	/**
	 * Returns the value of the '<em><b>Tj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tj</em>' reference.
	 * @see #setT_j(Agent)
	 * @see TestcasesModel.TestcasesModelPackage#getT_T_j()
	 * @model
	 * @generated
	 */
	Agent getT_j();

	/**
	 * Sets the value of the '{@link TestcasesModel.T#getT_j <em>Tj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tj</em>' reference.
	 * @see #getT_j()
	 * @generated
	 */
	void setT_j(Agent value);

} // T
