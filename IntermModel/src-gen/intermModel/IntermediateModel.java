/**
 */
package intermModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermModel.IntermediateModel#getComponents <em>Components</em>}</li>
 *   <li>{@link intermModel.IntermediateModel#getPatternContainer <em>Pattern Container</em>}</li>
 *   <li>{@link intermModel.IntermediateModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see intermModel.IntermModelPackage#getIntermediateModel()
 * @model
 * @generated
 */
public interface IntermediateModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link intermModel.IntermComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see intermModel.IntermModelPackage#getIntermediateModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Pattern Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Container</em>' containment reference.
	 * @see #setPatternContainer(PatternContainer)
	 * @see intermModel.IntermModelPackage#getIntermediateModel_PatternContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PatternContainer getPatternContainer();

	/**
	 * Sets the value of the '{@link intermModel.IntermediateModel#getPatternContainer <em>Pattern Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Container</em>' containment reference.
	 * @see #getPatternContainer()
	 * @generated
	 */
	void setPatternContainer(PatternContainer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UNTITLED"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermModel.IntermModelPackage#getIntermediateModel_Name()
	 * @model default="UNTITLED"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermModel.IntermediateModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IntermediateModel
