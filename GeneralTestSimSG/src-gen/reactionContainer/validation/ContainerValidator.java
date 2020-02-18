/**
 *
 * $Id$
 */
package reactionContainer.validation;

import org.eclipse.emf.common.util.EList;

import reactionContainer.Agent;
import reactionContainer.State;

/**
 * A sample validator interface for {@link reactionContainer.Container}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContainerValidator {
	boolean validate();

	boolean validateStates(EList<State> value);

	boolean validateAgents(EList<Agent> value);

	boolean validateModelName(String value);
}