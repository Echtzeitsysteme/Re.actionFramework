/**
 *
 * $Id$
 */
package GKLModel.validation;

import GKLModel.K;
import GKLModel.P;
import GKLModel.P_s;
import GKLModel.U_s;

/**
 * A sample validator interface for {@link GKLModel.T}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TValidator {
	boolean validate();

	boolean validateT_x_K_a(K value);

	boolean validateT_x_P_a(P value);

	boolean validateT_x_u(U_s value);

	boolean validateT_x_p(P_s value);

	boolean validateT_y_K_a(K value);

	boolean validateT_y_P_a(P value);

	boolean validateT_y_u(U_s value);

	boolean validateT_y_p(P_s value);
}
