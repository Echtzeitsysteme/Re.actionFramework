package org.reaction.generalTest;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.reaction.generalTest.api.GeneralTestDemoclesApp;

import reactionContainer.Container;

public class GeneralTestValidator extends GeneralTestDemoclesApp {

	public GeneralTestValidator(String location, Container container) {

		// Determine the path to the workspace root for loading models
		File root = new File(GeneralTestValidator.class.getResource(".").getFile());
		workspacePath = root.getParentFile().getParentFile().getParentFile().getParentFile().getParent()
				+ File.separatorChar;

		// Add the container to be monitored by the pattern matcher
		URI uri = URI.createURI(location);
		createModel(uri);
		resourceSet.getResources().get(0).getContents().add(container);
	}
	
	

}
