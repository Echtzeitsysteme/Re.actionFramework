/**
 *
 * $Id$
 */
package ecoreBCModel.validation;

import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermSiteInstance;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ecoreBCModel.IntermAgentInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IntermAgentInstanceValidator {
	boolean validate();

	boolean validateSiteInstances(EList<IntermSiteInstance> value);

	boolean validateInstanceOf(IntermAgent value);

	boolean validateName(String value);

	boolean validateLocal(boolean value);
}