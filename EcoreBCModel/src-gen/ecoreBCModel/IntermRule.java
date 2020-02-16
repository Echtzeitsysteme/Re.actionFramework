/**
 */
package ecoreBCModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.IntermRule#getName <em>Name</em>}</li>
 *   <li>{@link ecoreBCModel.IntermRule#getRate <em>Rate</em>}</li>
 *   <li>{@link ecoreBCModel.IntermRule#getLhs <em>Lhs</em>}</li>
 *   <li>{@link ecoreBCModel.IntermRule#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see ecoreBCModel.EcoreBCModelPackage#getIntermRule()
 * @model
 * @generated
 */
public interface IntermRule extends IntermComponent {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermRule_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermRule_Rate()
	 * @model default="-1" required="true"
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermRule#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' reference.
	 * @see #setLhs(IntermPattern)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermRule_Lhs()
	 * @model
	 * @generated
	 */
	IntermPattern getLhs();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermRule#getLhs <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(IntermPattern value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(IntermPattern)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermRule_Rhs()
	 * @model
	 * @generated
	 */
	IntermPattern getRhs();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermRule#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(IntermPattern value);

} // IntermRule
