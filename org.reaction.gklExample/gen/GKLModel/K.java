/**
 */
package GKLModel;

import ReactionModel.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>K</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.K#getK_a_T_x <em>KaTx</em>}</li>
 *   <li>{@link GKLModel.K#getK_a_T_y <em>KaTy</em>}</li>
 * </ul>
 *
 * @see GKLModel.GKLModelPackage#getK()
 * @model
 * @generated
 */
public interface K extends Agent {
	/**
	 * Returns the value of the '<em><b>KaTx</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.T#getT_x_K_a <em>TxKa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KaTx</em>' reference.
	 * @see #setK_a_T_x(T)
	 * @see GKLModel.GKLModelPackage#getK_K_a_T_x()
	 * @see GKLModel.T#getT_x_K_a
	 * @model opposite="T_x_K_a"
	 * @generated
	 */
	T getK_a_T_x();

	/**
	 * Sets the value of the '{@link GKLModel.K#getK_a_T_x <em>KaTx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KaTx</em>' reference.
	 * @see #getK_a_T_x()
	 * @generated
	 */
	void setK_a_T_x(T value);

	/**
	 * Returns the value of the '<em><b>KaTy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GKLModel.T#getT_y_K_a <em>TyKa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KaTy</em>' reference.
	 * @see #setK_a_T_y(T)
	 * @see GKLModel.GKLModelPackage#getK_K_a_T_y()
	 * @see GKLModel.T#getT_y_K_a
	 * @model opposite="T_y_K_a"
	 * @generated
	 */
	T getK_a_T_y();

	/**
	 * Sets the value of the '{@link GKLModel.K#getK_a_T_y <em>KaTy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KaTy</em>' reference.
	 * @see #getK_a_T_y()
	 * @generated
	 */
	void setK_a_T_y(T value);

} // K
