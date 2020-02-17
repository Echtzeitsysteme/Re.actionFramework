package org.reaction.generalTest;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.reaction.generalTest.api.GeneralTestAPI;
import org.reaction.generalTest.utils.ModelGenerator;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.benchmark.GeneralTestSimSGValidator;
import TestcasesModel.TestcasesModelPackage;
import reactionContainer.Container;
import reactionContainer.ReactionContainerPackage;

public class AllTests {

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	private GeneralTestAPI referenceApi;
	private GeneralTestSimSGAPI simsgApi;

	Map<String, Long> referenceMatches;
	Map<String, Long> simsgMatches;

	Map<String, GraphTransformationRule> referenceRules;
	Map<String, GraphTransformationRule> simsgRules;

	@Before
	public void setup() {
		TestcasesModelPackage.eINSTANCE.eClass();
		ReactionContainerPackage.eINSTANCE.eClass();
//		final String modelLocation = "C:\\Users\\tobia\\eclipse-workspaces\\languagePlayground\\dsl.dotTest\\bin\\Testcases.xmi";
		final String modelLocation = "C:\\Users\\tobia\\eclipse-workspaces\\re.actionFramework\\org.reaction.generalTest\\model\\Testcases.xmi";
		referenceMatches = new HashMap<>();
		simsgMatches = new HashMap<>();
		referenceRules = new HashMap<>();
		simsgRules = new HashMap<>();

		ModelGenerator.createAndSaveModel(modelLocation, 0);

		Resource contResource = ModelGenerator.loadModel(modelLocation);
		Container container = (Container) contResource.getContents().get(0);

		// init api and find reference Matches
		System.out.println("Initiating reference api...");

		referenceApi = new GeneralTestValidator(modelLocation, container).initAPI();

		Class<GeneralTestAPI> referenceApiClass = GeneralTestAPI.class;
		for (Method method : referenceApiClass.getDeclaredMethods()) {
			try {
				GraphTransformationRule rule = (GraphTransformationRule) method.invoke(referenceApi, new Object[] {});
				long matches = rule.countMatches();
				String key = method.getName();
				referenceRules.put(key, rule);
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
				if (method.getName().startsWith("condition")) {
					continue;
				}
				GraphTransformationRule rule = (GraphTransformationRule) method.invoke(simsgApi, new Object[] {});

				long matches = rule.countMatches();
				String key = method.getName();
				simsgRules.put(key, rule);
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
	public void testContextsAgainstCreatedModel() {
		System.out.println("Test execution here");
		Map<String, Boolean> matchesEqual = getMatches();
		List<String> sortedList = matchesEqual.keySet().stream().sorted().collect(Collectors.toList());
		for (String key : sortedList) {
			try {
				assertTrue(matchesEqual.get(key));
			} catch (AssertionError e) {
				collector.addError(e);
			}
		}
	}

	private Map<String, Boolean> getMatches() {
		List<String> sortedList = referenceMatches.keySet().stream().sorted().collect(Collectors.toList());
		Map<String, Boolean> matchesEqual = new HashMap<>();
		for (String key : sortedList) {
			if (referenceMatches.containsKey(key) && simsgMatches.containsKey(key)) {
				long referenceMatchCnt = referenceMatches.get(key);
				long simsgMatchCnt = simsgMatches.get(key);
				String formatPrint = String.format("\"Reference to SimSG --> %-30s:\t%-10s - %10s\n", key,
						String.valueOf(referenceMatchCnt), String.valueOf(simsgMatchCnt));
				try {
					if (referenceMatchCnt == simsgMatchCnt) {
						matchesEqual.put(key, true);
						System.out.printf(formatPrint);
					} else {
						matchesEqual.put(key, false);
						System.err.printf(formatPrint);
					}

				} catch (AssertionError e) {

					collector.addError(e);
				}
			}
		}
		return matchesEqual;
	}

//	@Test
//	public void testChangePatternsAgainstCreatedModel() {
//		List<String> sortedList = referenceRules.keySet().stream().sorted().collect(Collectors.toList());
//		for (String key : sortedList) {
//			GraphTransformationRule refRule = referenceRules.get(key);
//			GraphTransformationRule simsgRule = simsgRules.get(key);
//
//			Random random = new Random();
//			int numberOfApplications = random.nextInt(10) + 1; // 1 to 10 times
//			int i = 0;
//			while (i < numberOfApplications && refRule.isApplicable() && simsgRule.isApplicable()) {
//				refRule.apply();
//				simsgRule.apply();
//				i++;
//			}
//
//			Map<String, Boolean> equalMatches = getMatches();
//			equalMatches.values().forEach((equal) -> {
//				try {
//					assertTrue(equal);
//				} catch (AssertionError e) {
//					collector.addError(e);
//				}
//			});
//
//		}
//	}

}
