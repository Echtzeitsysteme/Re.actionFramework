package GKL_created_test.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the GKL_created_testAPI with Democles.
 */
public class GKL_created_testDemoclesApp extends GKL_created_testApp {

	/**
	 * Creates the application with Democles.
	 */
	public GKL_created_testDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GKL_created_testDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
