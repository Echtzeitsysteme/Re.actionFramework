/**
 */
package intermModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Agent Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermAgentInstance#getSiteInstances <em>Site Instances</em>}</li>
 *   <li>{@link intermModel.IntermAgentInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link intermModel.IntermAgentInstance#getName <em>Name</em>}</li>
 *   <li>{@link intermModel.IntermAgentInstance#isLocal <em>Local</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermAgentInstance()
 * @model
 * @generated
 */
public interface IntermAgentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Instances</b></em>' containment reference list.
	 * The list contents are of type {@link intermModel.IntermSiteInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Instances</em>' containment reference list.
	 * @see intermModel.IntermModelPackage#getIntermAgentInstance_SiteInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermSiteInstance> getSiteInstances();

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(IntermAgent)
	 * @see intermModel.IntermModelPackage#getIntermAgentInstance_InstanceOf()
	 * @model required="true"
	 * @generated
	 */
	IntermAgent getInstanceOf();

	/**
	 * Sets the value of the '{@link intermModel.IntermAgentInstance#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(IntermAgent value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UNTITLED"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermModel.IntermModelPackage#getIntermAgentInstance_Name()
	 * @model default="UNTITLED" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermModel.IntermAgentInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @see intermModel.IntermModelPackage#getIntermAgentInstance_Local()
	 * @model
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link intermModel.IntermAgentInstance#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

} // IntermAgentInstance
