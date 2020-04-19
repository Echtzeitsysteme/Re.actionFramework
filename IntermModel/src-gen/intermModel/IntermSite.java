/**
 */
package intermModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermSite#getName <em>Name</em>}</li>
 *   <li>{@link intermModel.IntermSite#getSiteStates <em>Site States</em>}</li>
 *   <li>{@link intermModel.IntermSite#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermSite()
 * @model
 * @generated
 */
public interface IntermSite extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermModel.IntermModelPackage#getIntermSite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermModel.IntermSite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Site States</b></em>' containment reference list.
	 * The list contents are of type {@link intermModel.IntermSiteState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site States</em>' containment reference list.
	 * @see intermModel.IntermModelPackage#getIntermSite_SiteStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermSiteState> getSiteStates();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(IntermAgent)
	 * @see intermModel.IntermModelPackage#getIntermSite_Parent()
	 * @model
	 * @generated
	 */
	IntermAgent getParent();

	/**
	 * Sets the value of the '{@link intermModel.IntermSite#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IntermAgent value);

} // IntermSite
