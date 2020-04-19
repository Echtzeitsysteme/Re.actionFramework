package org.reaction.gklExample.api;

import GKLModel.GKLModelPackage;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

/**
 * An application using the GklExampleAPI.
 */
public class GklExampleApp extends GraphTransformationApp<GklExampleAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public GklExampleApp(final IContextPatternInterpreter engine) {
		super(engine);
	}

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 * @param workspacePath
	 *            the workspace path
	 */
	public GklExampleApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(GKLModelPackage.eINSTANCE);
	}

	@Override
	public GklExampleAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new GklExampleAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new GklExampleAPI(engine, resourceSet, workspacePath);
	}
}
