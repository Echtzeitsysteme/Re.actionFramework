/**
 */
package intermModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Observable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermObservable#getName <em>Name</em>}</li>
 *   <li>{@link intermModel.IntermObservable#getObsPattern <em>Obs Pattern</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermObservable()
 * @model
 * @generated
 */
public interface IntermObservable extends IntermComponent {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermModel.IntermModelPackage#getIntermObservable_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermModel.IntermObservable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Obs Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obs Pattern</em>' reference.
	 * @see #setObsPattern(IntermPattern)
	 * @see intermModel.IntermModelPackage#getIntermObservable_ObsPattern()
	 * @model required="true"
	 * @generated
	 */
	IntermPattern getObsPattern();

	/**
	 * Sets the value of the '{@link intermModel.IntermObservable#getObsPattern <em>Obs Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obs Pattern</em>' reference.
	 * @see #getObsPattern()
	 * @generated
	 */
	void setObsPattern(IntermPattern value);

} // IntermObservable
