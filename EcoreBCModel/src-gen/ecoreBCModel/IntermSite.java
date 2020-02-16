/**
 */
package ecoreBCModel;

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
 *   <li>{@link ecoreBCModel.IntermSite#getName <em>Name</em>}</li>
 *   <li>{@link ecoreBCModel.IntermSite#getSiteStates <em>Site States</em>}</li>
 * </ul>
 *
 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSite()
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
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSite_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreBCModel.IntermSite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Site States</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreBCModel.IntermSiteState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site States</em>' containment reference list.
	 * @see ecoreBCModel.EcoreBCModelPackage#getIntermSite_SiteStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermSiteState> getSiteStates();

} // IntermSite
