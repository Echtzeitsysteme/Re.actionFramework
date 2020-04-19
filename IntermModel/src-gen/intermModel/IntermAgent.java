/**
 */
package intermModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermAgent#getSites <em>Sites</em>}</li>
 *   <li>{@link intermModel.IntermAgent#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermAgent()
 * @model
 * @generated
 */
public interface IntermAgent extends IntermComponent {
	/**
	 * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
	 * The list contents are of type {@link intermModel.IntermSite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites</em>' containment reference list.
	 * @see intermModel.IntermModelPackage#getIntermAgent_Sites()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermSite> getSites();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermModel.IntermModelPackage#getIntermAgent_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermModel.IntermAgent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IntermAgent
