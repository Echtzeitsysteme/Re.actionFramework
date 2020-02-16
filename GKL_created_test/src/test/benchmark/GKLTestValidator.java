package test.benchmark;

import java.io.File;

import org.eclipse.emf.common.util.URI;

import GKL_created_test.api.GKL_created_testDemoclesApp;
import reactionContainer.Container;

public class GKLTestValidator extends GKL_created_testDemoclesApp {

	public GKLTestValidator(String location, Container container) {

		// Determine the path to the workspace root for loading models
		File root = new File(GKLTestValidator.class.getResource(".").getFile());
		workspacePath = root.getParentFile().getParentFile().getParentFile().getParent() + File.separatorChar;

		// Add the container to be monitored by the pattern matcher
		URI uri = URI.createURI(location);
		createModel(uri);
		resourceSet.getResources().get(0).getContents().add(container);
	}
}
