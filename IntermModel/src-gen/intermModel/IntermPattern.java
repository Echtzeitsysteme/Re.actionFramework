/**
 */
package intermModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermPattern#getAgentInstances <em>Agent Instances</em>}</li>
 *   <li>{@link intermModel.IntermPattern#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermPattern()
 * @model
 * @generated
 */
public interface IntermPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Agent Instances</b></em>' containment reference list.
	 * The list contents are of type {@link intermModel.IntermAgentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Instances</em>' containment reference list.
	 * @see intermModel.IntermModelPackage#getIntermPattern_AgentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermAgentInstance> getAgentInstances();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermModel.IntermModelPackage#getIntermPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermModel.IntermPattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IntermPattern
