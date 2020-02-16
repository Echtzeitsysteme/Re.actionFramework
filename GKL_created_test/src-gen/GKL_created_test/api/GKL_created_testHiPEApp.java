package GKL_created_test.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the GKL_created_testAPI with HiPE.
 */
public class GKL_created_testHiPEApp extends GKL_created_testApp {

	/**
	 * Creates the application with HiPE.
	 */
	public GKL_created_testHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GKL_created_testHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
