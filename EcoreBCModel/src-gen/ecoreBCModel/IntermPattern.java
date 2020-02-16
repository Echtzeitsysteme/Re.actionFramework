/**
 */
package ecoreBCModel;

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
 *   <li>{@link ecoreBCModel.IntermPattern#getAgentInstances <em>Agent Instances</em>}</li>
 *   <li>{@link ecoreBCModel.IntermPattern#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ecoreBCModel.EcoreBCModelPackage#getIntermPattern()
 * @model
 * @generated
 */
public interface IntermPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Agent Instances</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreBCModel.IntermAgentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Instances</em>' containment reference list.
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermPattern_AgentInstances()
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
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermPattern_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermPattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IntermPattern
