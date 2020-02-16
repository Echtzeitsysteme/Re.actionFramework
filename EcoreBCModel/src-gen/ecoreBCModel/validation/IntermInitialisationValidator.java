/**
 *
 * $Id$
 */
package ecoreBCModel.validation;

import ecoreBCModel.IntermPattern;

/**
 * A sample validator interface for {@link ecoreBCModel.IntermInitialisation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IntermInitialisationValidator {
	boolean validate();

	boolean validateCnt(int value);

	boolean validateInitPattern(IntermPattern value);
}
