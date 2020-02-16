package org.reaction.main;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EPackage;
import org.reaction.ibex.patternCreation.GTCreator;
import org.reaction.ibex.patternCreation.IBeXCreator;
import org.reaction.ibex.patternCreation.SimDefCreator;
import org.reaction.transformations.dslToIntermediateModel.DslToIntermTransformation;
import org.reaction.transformations.util.EMFResourceHelper;
import org.xtext.biochemics.dotDsl.ReactionModel;

import IBeXLanguage.IBeXPatternSet;
import ecoreBCModel.IntermediateModel;
import reactionContainer.generator.ContainerEMF;
import reactionContainer.generator.ContainerGenerator;

public class Main {

	public static void main(String[] args) {

		// Load Model
//		final String dslModelLocation = "C:\\Users\\tobia\\OneDrive\\Dokumente\\BA\\runtime-EclipseXtext\\dsl.dotTest\\src\\GKL.xmi";
//		final String trgProjectLocation = "C:\\Users\\tobia\\eclipse-workspaces\\runtime-EclipseApplication\\GKL_created_test";
		
		final String dslModelLocation = "C:\\Users\\tobia\\OneDrive\\Dokumente\\BA\\runtime-EclipseXtext\\dsl.dotTest\\src\\Testcases.xmi";
		final String trgProjectLocation = "C:\\Users\\tobia\\eclipse-workspaces\\runtime-EclipseApplication\\GeneralTestSimSG";
		
		final String userDir = System.getProperty("user.dir");
		final String tempModels = userDir + "/models/";

		IntermediateModel intermModel;

		// Clear directories
		System.out.println("Clearing directories...");
		
		//Clear tempModel Folder
		File tempModelFolder = new File(tempModels);
		deleteFolder(tempModelFolder);
		
		//Clear trgProjectLocations
		File trgProjectModelFolder = new File(trgProjectLocation+"/model/");
		File trgProjectInstanceFolder = new File(trgProjectLocation+"/instances/");
		deleteFolder(trgProjectModelFolder);
		deleteFolder(trgProjectInstanceFolder);
		
		
		// Reaction model to intermediate model
		try {
			System.out.println("Initiating Reaction to Intermediate Transformation...");
			ReactionModel dslModel = EMFResourceHelper.loadReactionModel(dslModelLocation);
			DslToIntermTransformation dslToInterm = new DslToIntermTransformation(dslModel);
			intermModel = dslToInterm.generateIntermediateModel();

			// Get dsl Model name --> TODO: let it be entered within language
			String dslModelFilePatternString = "(.+\\\\)(?<fileName>.+)(\\.xmi)";
			Pattern dslModelFilePattern = Pattern.compile(dslModelFilePatternString);
			Matcher m = dslModelFilePattern.matcher(dslModelLocation);
			String intermModelSaveLocation;

			if (m.find()) {
				String dslModelName = m.group("fileName");
				intermModel.setName(dslModelName);
				intermModelSaveLocation = tempModels + dslModelName + "Intermediate.xmi";
			} else {
				System.err.println("Could not find dsl model name. Exiting");
				return;
			}

			EMFResourceHelper.saveResource(intermModel, intermModelSaveLocation);
		} catch (Exception e) {
			System.out.println("Transforming to Intermediate Model failed with:");
			e.printStackTrace();
			return;
		}

		// Intermediate to SimSG model
		System.out.println("Initiating Intermediate to SimSG Transformation...");

		ContainerGenerator containerGen = new ContainerEMF(intermModel);
		String metamodelPath = trgProjectLocation + "/model/" + intermModel.getName() + "Model.ecore";
		String modelPath = trgProjectLocation + "/instances/simulation_instances/" + intermModel.getName() + "Model.xmi";

		try {
			containerGen.doGenerate(modelPath, metamodelPath);
		} catch (Exception e) {
			System.err.println("Creating Ecore-Model for SimSG failed with:");
			e.printStackTrace();
			return;
		}

		System.out.println("Ecore Creation successful.");

		System.out.print("Loading Ecore Model... ");
		EPackage metamodelPackage;
		try {
			metamodelPackage = EMFResourceHelper.loadEPackage(metamodelPath);
		} catch (Exception e) {
			System.err.println("\nLoading Ecore-Model of SimSG failed with:");
			e.printStackTrace();
			return;
		}
		System.out.print(" Successful.\n");

		// Creating IBeX items
		System.out.println("Initiating generation of IBeX items...");
		try {
			IBeXCreator ibexCreator = new IBeXCreator(intermModel, metamodelPackage);
			IBeXPatternSet ibexPatternSet = ibexCreator.getIBeXPatternSet();
			String ibexSaveLocation = trgProjectLocation + "/model/ibex-patterns.xmi";
			ibexCreator.savePatternSet2(ibexSaveLocation);

			GTCreator gtCreator = new GTCreator(ibexPatternSet);
//			GTRuleSet gtRuleSet = gtCreator.getGTRuleSet();
			String gtSaveLocation = trgProjectLocation + "/model/gtRules.xmi";
			gtCreator.saveRuleSet(gtSaveLocation);

			SimDefCreator simDefCreator = new SimDefCreator(intermModel, trgProjectLocation);
			String simDefSaveLocation = trgProjectLocation + "/instances/simulation_definitions/"
					+ simDefCreator.getDefinition().getName() + ".xmi";
			simDefCreator.saveDefinition(simDefSaveLocation);
		} catch (Exception e) {
			System.err.println("Creating IBeX items failed with:");
			e.printStackTrace();
			return;
		}
		System.out.println("IBeX items created successfully.");
		
		System.out.println("Transformation complete.");

	}
	
	private static void deleteFolder(File folder) {
		for(File f : folder.listFiles()) {
			if(f.isDirectory()) {
				deleteFolder(f);
			}else {
				f.delete();
			}
		}
	}

}
