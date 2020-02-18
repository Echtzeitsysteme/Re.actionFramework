/**
 *
 * $Id$
 */
package ecoreBCModel.validation;

import ecoreBCModel.IntermSite;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ecoreBCModel.IntermAgent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IntermAgentValidator {
	boolean validate();

	boolean validateSites(EList<IntermSite> value);

	boolean validateName(String value);
}