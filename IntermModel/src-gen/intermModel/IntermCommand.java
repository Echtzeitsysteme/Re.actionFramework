/**
 */
package intermModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermCommand#getType <em>Type</em>}</li>
 *   <li>{@link intermModel.IntermCommand#getPatternToMatch <em>Pattern To Match</em>}</li>
 *   <li>{@link intermModel.IntermCommand#getCnt <em>Cnt</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermCommand()
 * @model
 * @generated
 */
public interface IntermCommand extends IntermComponent {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link intermModel.CommandType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see intermModel.CommandType
	 * @see #setType(CommandType)
	 * @see intermModel.IntermModelPackage#getIntermCommand_Type()
	 * @model
	 * @generated
	 */
	CommandType getType();

	/**
	 * Sets the value of the '{@link intermModel.IntermCommand#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see intermModel.CommandType
	 * @see #getType()
	 * @generated
	 */
	void setType(CommandType value);

	/**
	 * Returns the value of the '<em><b>Pattern To Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern To Match</em>' reference.
	 * @see #setPatternToMatch(IntermPattern)
	 * @see intermModel.IntermModelPackage#getIntermCommand_PatternToMatch()
	 * @model
	 * @generated
	 */
	IntermPattern getPatternToMatch();

	/**
	 * Sets the value of the '{@link intermModel.IntermCommand#getPatternToMatch <em>Pattern To Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern To Match</em>' reference.
	 * @see #getPatternToMatch()
	 * @generated
	 */
	void setPatternToMatch(IntermPattern value);

	/**
	 * Returns the value of the '<em><b>Cnt</b></em>' attribute.
	 * The default value is <code>"-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cnt</em>' attribute.
	 * @see #setCnt(double)
	 * @see intermModel.IntermModelPackage#getIntermCommand_Cnt()
	 * @model default="-1.0"
	 * @generated
	 */
	double getCnt();

	/**
	 * Sets the value of the '{@link intermModel.IntermCommand#getCnt <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cnt</em>' attribute.
	 * @see #getCnt()
	 * @generated
	 */
	void setCnt(double value);

} // IntermCommand
