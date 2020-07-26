/**
 */
package GKLModel;

import ReactionModel.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.T#getT_x_P_a <em>TxPa</em>}</li>
 *   <li>{@link GKLModel.T#getT_y_P_a <em>TyPa</em>}</li>
 *   <li>{@link GKLModel.T#getT_x_K_a <em>TxKa</em>}</li>
 *   <li>{@link GKLModel.T#getT_x_u <em>Txu</em>}</li>
 *   <li>{@link GKLModel.T#getT_x_p <em>Txp</em>}</li>
 *   <li>{@link GKLModel.T#getT_y_K_a <em>TyKa</em>}</li>
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
	 * Returns the value of the '<em><b>TxPa</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.P#getP_a_T_x <em>PaTx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TxPa</em>' reference.
	 * @see #setT_x_P_a(P)
	 * @see GKLModel.GKLModelPackage#getT_T_x_P_a()
	 * @see GKLModel.P#getP_a_T_x
	 * @model opposite="P_a_T_x"
	 * @generated
	 */
	P getT_x_P_a();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_x_P_a <em>TxPa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TxPa</em>' reference.
	 * @see #getT_x_P_a()
	 * @generated
	 */
	void setT_x_P_a(P value);

	/**
	 * Returns the value of the '<em><b>TyPa</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.P#getP_a_T_y <em>PaTy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TyPa</em>' reference.
	 * @see #setT_y_P_a(P)
	 * @see GKLModel.GKLModelPackage#getT_T_y_P_a()
	 * @see GKLModel.P#getP_a_T_y
	 * @model opposite="P_a_T_y"
	 * @generated
	 */
	P getT_y_P_a();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_y_P_a <em>TyPa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TyPa</em>' reference.
	 * @see #getT_y_P_a()
	 * @generated
	 */
	void setT_y_P_a(P value);

	/**
	 * Returns the value of the '<em><b>TxKa</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.K#getK_a_T_x <em>KaTx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TxKa</em>' reference.
	 * @see #setT_x_K_a(K)
	 * @see GKLModel.GKLModelPackage#getT_T_x_K_a()
	 * @see GKLModel.K#getK_a_T_x
	 * @model opposite="K_a_T_x"
	 * @generated
	 */
	K getT_x_K_a();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_x_K_a <em>TxKa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TxKa</em>' reference.
	 * @see #getT_x_K_a()
	 * @generated
	 */
	void setT_x_K_a(K value);

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
	 * Returns the value of the '<em><b>TyKa</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.K#getK_a_T_y <em>KaTy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TyKa</em>' reference.
	 * @see #setT_y_K_a(K)
	 * @see GKLModel.GKLModelPackage#getT_T_y_K_a()
	 * @see GKLModel.K#getK_a_T_y
	 * @model opposite="K_a_T_y"
	 * @generated
	 */
	K getT_y_K_a();

	/**
	 * Sets the value of the '{@link GKLModel.T#getT_y_K_a <em>TyKa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TyKa</em>' reference.
	 * @see #getT_y_K_a()
	 * @generated
	 */
	void setT_y_K_a(K value);

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
