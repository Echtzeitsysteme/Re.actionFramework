/**
 */
package ecoreBCModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interm Site Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.IntermSiteInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link ecoreBCModel.IntermSiteInstance#getNotBoundTo <em>Not Bound To</em>}</li>
 *   <li>{@link ecoreBCModel.IntermSiteInstance#getBoundTo <em>Bound To</em>}</li>
 *   <li>{@link ecoreBCModel.IntermSiteInstance#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link ecoreBCModel.IntermSiteInstance#getName <em>Name</em>}</li>
 *   <li>{@link ecoreBCModel.IntermSiteInstance#getState <em>State</em>}</li>
 *   <li>{@link ecoreBCModel.IntermSiteInstance#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance()
 * @model
 * @generated
 */
public interface IntermSiteInstance extends Bindable {
	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(IntermSite)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance_InstanceOf()
	 * @model required="true"
	 * @generated
	 */
	IntermSite getInstanceOf();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermSiteInstance#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(IntermSite value);

	/**
	 * Returns the value of the '<em><b>Not Bound To</b></em>' reference list.
	 * The list contents are of type {@link ecoreBCModel.Bindable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Bound To</em>' reference list.
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance_NotBoundTo()
	 * @model
	 * @generated
	 */
	EList<Bindable> getNotBoundTo();

	/**
	 * Returns the value of the '<em><b>Bound To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound To</em>' reference.
	 * @see #setBoundTo(Bindable)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance_BoundTo()
	 * @model
	 * @generated
	 */
	Bindable getBoundTo();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermSiteInstance#getBoundTo <em>Bound To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound To</em>' reference.
	 * @see #getBoundTo()
	 * @generated
	 */
	void setBoundTo(Bindable value);

	/**
	 * Returns the value of the '<em><b>Binding State</b></em>' attribute.
	 * The default value is <code>"UNSPECIFIED"</code>.
	 * The literals are from the enumeration {@link ecoreBCModel.BindingState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding State</em>' attribute.
	 * @see ecoreBCModel.BindingState
	 * @see #setBindingState(BindingState)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance_BindingState()
	 * @model default="UNSPECIFIED" required="true"
	 * @generated
	 */
	BindingState getBindingState();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermSiteInstance#getBindingState <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding State</em>' attribute.
	 * @see ecoreBCModel.BindingState
	 * @see #getBindingState()
	 * @generated
	 */
	void setBindingState(BindingState value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UNTITLED"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance_Name()
	 * @model default="UNTITLED" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermSiteInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(IntermSiteState)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance_State()
	 * @model
	 * @generated
	 */
	IntermSiteState getState();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermSiteInstance#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(IntermSiteState value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(IntermAgentInstance)
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSiteInstance_Parent()
	 * @model
	 * @generated
	 */
	IntermAgentInstance getParent();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermSiteInstance#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IntermAgentInstance value);

} // IntermSiteInstance