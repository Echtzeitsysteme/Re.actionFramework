package org.reaction.gklExample.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the GklExampleAPI with HiPE.
 */
public class GklExampleHiPEApp extends GklExampleApp {

	/**
	 * Creates the application with HiPE.
	 */
	public GklExampleHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GklExampleHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
