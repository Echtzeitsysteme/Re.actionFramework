/**
 */
package ecoreBCModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Agent Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.IntermAgentInstance#getSiteInstances <em>Site Instances</em>}</li>
 *   <li>{@link ecoreBCModel.IntermAgentInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link ecoreBCModel.IntermAgentInstance#getName <em>Name</em>}</li>
 *   <li>{@link ecoreBCModel.IntermAgentInstance#isLocal <em>Local</em>}</li>
 * </ul>
 *
 * @see ecoreBCModel.EcoreBCModelPackage#getIntermAgentInstance()
 * @model
 * @generated
 */
public interface IntermAgentInstance extends Bindable {
	/**
	 * Returns the value of the '<em><b>Site Instances</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreBCModel.IntermSiteInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Instances</em>' containment reference list.
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermAgentInstance_SiteInstances()
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
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermAgentInstance_InstanceOf()
	 * @model required="true"
	 * @generated
	 */
	IntermAgent getInstanceOf();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermAgentInstance#getInstanceOf <em>Instance Of</em>}' reference.
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
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermAgentInstance_Name()
	 * @model default="UNTITLED" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermAgentInstance#getName <em>Name</em>}' attribute.
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
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermAgentInstance_Local()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermAgentInstance#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

} // IntermAgentInstance
