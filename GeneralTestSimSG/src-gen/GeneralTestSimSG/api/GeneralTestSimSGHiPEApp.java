package GeneralTestSimSG.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the GeneralTestSimSGAPI with HiPE.
 */
public class GeneralTestSimSGHiPEApp extends GeneralTestSimSGApp {

	/**
	 * Creates the application with HiPE.
	 */
	public GeneralTestSimSGHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GeneralTestSimSGHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
