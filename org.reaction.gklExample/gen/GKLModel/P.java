/**
 */
package GKLModel;

import ReactionModel.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.P#getP_a_T_x <em>PaTx</em>}</li>
 *   <li>{@link GKLModel.P#getP_a_T_y <em>PaTy</em>}</li>
 * </ul>
 *
 * @see GKLModel.GKLModelPackage#getP()
 * @model
 * @generated
 */
public interface P extends Agent {
	/**
	 * Returns the value of the '<em><b>PaTx</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.T#getT_x_P_a <em>TxPa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PaTx</em>' reference.
	 * @see #setP_a_T_x(T)
	 * @see GKLModel.GKLModelPackage#getP_P_a_T_x()
	 * @see GKLModel.T#getT_x_P_a
	 * @model opposite="T_x_P_a"
	 * @generated
	 */
	T getP_a_T_x();

	/**
	 * Sets the value of the '{@link GKLModel.P#getP_a_T_x <em>PaTx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PaTx</em>' reference.
	 * @see #getP_a_T_x()
	 * @generated
	 */
	void setP_a_T_x(T value);

	/**
	 * Returns the value of the '<em><b>PaTy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.T#getT_y_P_a <em>TyPa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PaTy</em>' reference.
	 * @see #setP_a_T_y(T)
	 * @see GKLModel.GKLModelPackage#getP_P_a_T_y()
	 * @see GKLModel.T#getT_y_P_a
	 * @model opposite="T_y_P_a"
	 * @generated
	 */
	T getP_a_T_y();

	/**
	 * Sets the value of the '{@link GKLModel.P#getP_a_T_y <em>PaTy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PaTy</em>' reference.
	 * @see #getP_a_T_y()
	 * @generated
	 */
	void setP_a_T_y(T value);

} // P
