package GKL_created_test.api;

import GKLModel.GKLModelPackage;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

/**
 * An application using the GKL_created_testAPI.
 */
public class GKL_created_testApp extends GraphTransformationApp<GKL_created_testAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public GKL_created_testApp(final IContextPatternInterpreter engine) {
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
	public GKL_created_testApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(GKLModelPackage.eINSTANCE);
	}

	@Override
	public GKL_created_testAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new GKL_created_testAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new GKL_created_testAPI(engine, resourceSet, workspacePath);
	}
}
