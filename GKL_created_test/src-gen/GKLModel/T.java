/**
 */
package GKLModel;

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
 *   <li>{@link GKLModel.T#getT_x <em>Tx</em>}</li>
 *   <li>{@link GKLModel.T#getT_x_u <em>Txu</em>}</li>
 *   <li>{@link GKLModel.T#getT_x_p <em>Txp</em>}</li>
 *   <li>{@link GKLModel.T#getT_y <em>Ty</em>}</li>
 *   <li>{@link GKLModel.T#getT_y_u <em>Tyu</em>}</li>
 *   <li>{@link GKLModel.T#getT_y_p <em>Typ</em>}</li>
 * </ul>
 *
 * @see GKLModel.GKLModelPackage#getT()
 * @model
 * @generated
 */
public interface T extends Agent {
	/**
	 * Returns the value of the '<em><b>Tx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx</em>' reference.
	 * @see #setT_x(Agent)
	 * @see GKLModel.GKLModelPackage#getT_T_x()
	 * @model
	 * @generated
	 */
	Agent getT_x();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_x <em>Tx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx</em>' reference.
	 * @see #getT_x()
	 * @generated
	 */
	void setT_x(Agent value);

	/**
	 * Returns the value of the '<em><b>Txu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txu</em>' reference.
	 * @see #setT_x_u(U_s)
	 * @see GKLModel.GKLModelPackage#getT_T_x_u()
	 * @model
	 * @generated
	 */
	U_s getT_x_u();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_x_u <em>Txu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txu</em>' reference.
	 * @see #getT_x_u()
	 * @generated
	 */
	void setT_x_u(U_s value);

	/**
	 * Returns the value of the '<em><b>Txp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txp</em>' reference.
	 * @see #setT_x_p(P_s)
	 * @see GKLModel.GKLModelPackage#getT_T_x_p()
	 * @model
	 * @generated
	 */
	P_s getT_x_p();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_x_p <em>Txp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txp</em>' reference.
	 * @see #getT_x_p()
	 * @generated
	 */
	void setT_x_p(P_s value);

	/**
	 * Returns the value of the '<em><b>Ty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ty</em>' reference.
	 * @see #setT_y(Agent)
	 * @see GKLModel.GKLModelPackage#getT_T_y()
	 * @model
	 * @generated
	 */
	Agent getT_y();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_y <em>Ty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ty</em>' reference.
	 * @see #getT_y()
	 * @generated
	 */
	void setT_y(Agent value);

	/**
	 * Returns the value of the '<em><b>Tyu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tyu</em>' reference.
	 * @see #setT_y_u(U_s)
	 * @see GKLModel.GKLModelPackage#getT_T_y_u()
	 * @model
	 * @generated
	 */
	U_s getT_y_u();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_y_u <em>Tyu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tyu</em>' reference.
	 * @see #getT_y_u()
	 * @generated
	 */
	void setT_y_u(U_s value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' reference.
	 * @see #setT_y_p(P_s)
	 * @see GKLModel.GKLModelPackage#getT_T_y_p()
	 * @model
	 * @generated
	 */
	P_s getT_y_p();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_y_p <em>Typ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' reference.
	 * @see #getT_y_p()
	 * @generated
	 */
	void setT_y_p(P_s value);

} // T
