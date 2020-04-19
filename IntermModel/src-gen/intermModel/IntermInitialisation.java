/**
 */
package intermModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Initialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermInitialisation#getCnt <em>Cnt</em>}</li>
 *   <li>{@link intermModel.IntermInitialisation#getInitPattern <em>Init Pattern</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermInitialisation()
 * @model
 * @generated
 */
public interface IntermInitialisation extends IntermComponent {
	/**
	 * Returns the value of the '<em><b>Cnt</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cnt</em>' attribute.
	 * @see #setCnt(int)
	 * @see intermModel.IntermModelPackage#getIntermInitialisation_Cnt()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getCnt();

	/**
	 * Sets the value of the '{@link intermModel.IntermInitialisation#getCnt <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cnt</em>' attribute.
	 * @see #getCnt()
	 * @generated
	 */
	void setCnt(int value);

	/**
	 * Returns the value of the '<em><b>Init Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Pattern</em>' reference.
	 * @see #setInitPattern(IntermPattern)
	 * @see intermModel.IntermModelPackage#getIntermInitialisation_InitPattern()
	 * @model required="true"
	 * @generated
	 */
	IntermPattern getInitPattern();

	/**
	 * Sets the value of the '{@link intermModel.IntermInitialisation#getInitPattern <em>Init Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Pattern</em>' reference.
	 * @see #getInitPattern()
	 * @generated
	 */
	void setInitPattern(IntermPattern value);

} // IntermInitialisation
