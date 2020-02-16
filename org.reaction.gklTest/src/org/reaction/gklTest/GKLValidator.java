package org.reaction.gklTest;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.reaction.gklTest.api.GklTestDemoclesApp;

import reactionContainer.Container;

public class GKLValidator extends GklTestDemoclesApp {

	public GKLValidator(String location, Container container) {

		// Determine the path to the workspace root for loading models
		File root = new File(GKLValidator.class.getResource(".").getFile());
		workspacePath = root.getParentFile().getParentFile().getParentFile().getParentFile().getParent()
				+ File.separatorChar;

		// Add the container to be monitored by the pattern matcher
		URI uri = URI.createURI(location);
		createModel(uri);
		resourceSet.getResources().get(0).getContents().add(container);
	}

}
