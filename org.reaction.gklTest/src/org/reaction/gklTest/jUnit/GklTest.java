package org.reaction.gklTest.jUnit;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.junit.Before;
import org.junit.Test;
import org.reaction.gklTest.GKLValidator;
import org.reaction.gklTest.api.GklTestAPI;
import org.reaction.gklTest.utils.ModelGenerator;

import GKLModel.GKLModelPackage;
import reactionContainer.Container;
import reactionContainer.ReactionContainerPackage;
import test.benchmark.GKLTestValidator;
import GKL_created_test.api.*;

public class GklTest {

	private GklTestAPI referenceApi;
	private GKL_created_testAPI gklApi;

	Map<String, Long> referenceMatches;
	Map<String, Long> gklMatches;

	@Before
	public void setup() {
		GKLModelPackage.eINSTANCE.eClass();
		ReactionContainerPackage.eINSTANCE.eClass();

		referenceMatches = new HashMap<>();
		gklMatches = new HashMap<>();
		Resource contResource = ModelGenerator.loadModel(
				"C:\\Users\\tobia\\eclipse-workspaces\\runtime-EclipseApplication\\org.reaction.gklTest\\model\\GKLModel.xmi");
		Container container = (Container) contResource.getContents().get(0);

		// init api and find reference Matches
		System.out.println("Initiating reference api...");
//		ModelGenerator.createAndSaveModel("C:\\Users\\tobia\\eclipse-workspaces\\runtime-EclipseApplication\\org.reaction.gklTest\\model\\GKLModel.xmi", 0);
		referenceApi = new GKLValidator(
				"C:\\Users\\tobia\\eclipse-workspaces\\runtime-EclipseApplication\\org.reaction.gklTest\\model\\GKLModel.xmi",
				container).initAPI();

		Class<GklTestAPI> referenceApiClass = GklTestAPI.class;
		for (Method method : referenceApiClass.getMethods()) {
			if (method.getName().startsWith("rule")) {
				try {
					GraphTransformationPattern pattern = (GraphTransformationPattern) method.invoke(referenceApi,
							new Object[] {});
					long matches = pattern.countMatches();
					String key = method.getName().substring(4);
					referenceMatches.put(key, matches);
				} catch (IllegalAccessException e) {
					// Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Initiating gkl api...");
		// init api and find gkl matches
		gklApi = new GKLTestValidator(
				"C:\\Users\\tobia\\eclipse-workspaces\\runtime-EclipseApplication\\org.reaction.gklTest\\model\\GKLModel.xmi",
				container).initAPI();
		
		Class<GKL_created_testAPI> gklApiClass = GKL_created_testAPI.class;
		for (Method method : gklApiClass.getDeclaredMethods()) {
			try {
				GraphTransformationPattern pattern = (GraphTransformationPattern) method.invoke(gklApi,
						new Object[] {});
				long matches = pattern.countMatches();
				String key = method.getName();
				gklMatches.put(key, matches);
			} catch (IllegalAccessException e) {
				// Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Test
	public void testAgainstCreatedModel() {
		System.out.println("Test execution here");
		for (String key : referenceMatches.keySet()) {
			long referenceMatchCnt = referenceMatches.get(key);
			long gklMatchCnt = gklMatches.get(key);
			String formatPrint = String.format("\"Reference to GKL --> %-12s:\t%-10s - %10s\n", key, String.valueOf(referenceMatchCnt), String.valueOf(gklMatchCnt));
			System.out.printf(formatPrint);
			assertTrue(referenceMatchCnt == gklMatchCnt);
		}
	}


}