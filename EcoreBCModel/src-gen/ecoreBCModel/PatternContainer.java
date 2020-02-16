/**
 */
package ecoreBCModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.PatternContainer#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see ecoreBCModel.EcoreBCModelPackage#getPatternContainer()
 * @model
 * @generated
 */
public interface PatternContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreBCModel.IntermPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see ecoreBCModel.EcoreBCModelPackage#getPatternContainer_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermPattern> getPatterns();

} // PatternContainer
