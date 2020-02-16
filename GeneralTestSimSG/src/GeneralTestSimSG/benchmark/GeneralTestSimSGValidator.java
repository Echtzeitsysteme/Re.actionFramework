package GeneralTestSimSG.benchmark;

import java.io.File;

import org.eclipse.emf.common.util.URI;

import GeneralTestSimSG.api.GeneralTestSimSGDemoclesApp;
import reactionContainer.Container;

public class GeneralTestSimSGValidator extends GeneralTestSimSGDemoclesApp {

	public GeneralTestSimSGValidator(String location, Container container) {

		// Determine the path to the workspace root for loading models
		File root = new File(GeneralTestSimSGValidator.class.getResource(".").getFile());
		workspacePath = root.getParentFile().getParentFile().getParentFile().getParent() + File.separatorChar;

		// Add the container to be monitored by the pattern matcher
		URI uri = URI.createURI(location);
		createModel(uri);
		resourceSet.getResources().get(0).getContents().add(container);
	}
}
