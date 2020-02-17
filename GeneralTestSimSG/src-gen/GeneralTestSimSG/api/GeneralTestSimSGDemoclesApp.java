package GeneralTestSimSG.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the GeneralTestSimSGAPI with Democles.
 */
public class GeneralTestSimSGDemoclesApp extends GeneralTestSimSGApp {

	/**
	 * Creates the application with Democles.
	 */
	public GeneralTestSimSGDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GeneralTestSimSGDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
