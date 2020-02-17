package GeneralTestSimSG.api;

import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import TestcasesModel.TestcasesModelPackage;

/**
 * An application using the GeneralTestSimSGAPI.
 */
public class GeneralTestSimSGApp extends GraphTransformationApp<GeneralTestSimSGAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public GeneralTestSimSGApp(final IContextPatternInterpreter engine) {
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
	public GeneralTestSimSGApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(TestcasesModelPackage.eINSTANCE);
	}

	@Override
	public GeneralTestSimSGAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new GeneralTestSimSGAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new GeneralTestSimSGAPI(engine, resourceSet, workspacePath);
	}
}
