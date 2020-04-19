package org.reaction.gklExample.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the GklExampleAPI with Democles.
 */
public class GklExampleDemoclesApp extends GklExampleApp {

	/**
	 * Creates the application with Democles.
	 */
	public GklExampleDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public GklExampleDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
