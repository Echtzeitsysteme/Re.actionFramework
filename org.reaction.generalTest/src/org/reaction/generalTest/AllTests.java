package org.reaction.generalTest;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.junit.Before;
import org.junit.Test;
import org.reaction.generalTest.api.GeneralTestAPI;
import org.reaction.generalTest.utils.ModelGenerator;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.benchmark.GeneralTestSimSGValidator;
import TestcasesModel.TestcasesModelPackage;
import reactionContainer.Container;
import reactionContainer.ReactionContainerPackage;


public class AllTests {

	private GeneralTestAPI referenceApi;
	private GeneralTestSimSGAPI simsgApi;

	Map<String, Long> referenceMatches;
	Map<String, Long> simsgMatches;

	@Before
	public void setup() {
		TestcasesModelPackage.eINSTANCE.eClass();
		ReactionContainerPackage.eINSTANCE.eClass();
		String modelLocation = "C:\\Users\\tobia\\eclipse-workspaces\\runtime-EclipseApplication\\org.reaction.generalTest\\model\\TestcasesModel.xmi";
		referenceMatches = new HashMap<>();
		simsgMatches = new HashMap<>();

//		ModelGenerator.createAndSaveModel(modelLocation, 0);

		Resource contResource = ModelGenerator.loadModel(modelLocation);
		Container container = (Container) contResource.getContents().get(0);

		// init api and find reference Matches
		System.out.println("Initiating reference api...");

		referenceApi = new GeneralTestValidator(modelLocation, container).initAPI();
		
		Class<GeneralTestAPI> referenceApiClass = GeneralTestAPI.class;
		for (Method method : referenceApiClass.getDeclaredMethods()) {
			try {
				GraphTransformationPattern pattern = (GraphTransformationPattern) method.invoke(referenceApi,
						new Object[] {});
				long matches = pattern.countMatches();
				String key = method.getName();
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
		
		System.out.println("Initiating simsg api...");
		// init api and find simsg matches
		simsgApi = new GeneralTestSimSGValidator(modelLocation, container).initAPI();
		
		Class<GeneralTestSimSGAPI> simsgApiClass = GeneralTestSimSGAPI.class;
		for (Method method : simsgApiClass.getDeclaredMethods()) {
			try {
				if(method.getName().startsWith("condition")) {
					continue;
				}
				GraphTransformationPattern pattern = (GraphTransformationPattern) method.invoke(simsgApi,
						new Object[] {});
				long matches = pattern.countMatches();
				String key = method.getName();
				simsgMatches.put(key, matches);
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
		for (String key : simsgMatches.keySet()) {
			long referenceMatchCnt = referenceMatches.get(key);
			long simsgMatchCnt = simsgMatches.get(key);
			String formatPrint = String.format("\"Reference to SimSG --> %-20s:\t%-10s - %10s\n", key,
					String.valueOf(referenceMatchCnt), String.valueOf(simsgMatchCnt));
			System.out.printf(formatPrint);
			assertTrue(referenceMatchCnt == simsgMatchCnt);
		}
	}

}
