package org.reaction.intermTrafo.util;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.reaction.dsl.reactionLanguage.ReactionLanguagePackage;
import org.reaction.dsl.reactionLanguage.ReactionModel;

import intermModel.*;

public class EMFResourceHelper {

	public static ReactionModel loadReactionModel(String resourceLocation) {

		System.out.print("Loading model from " + resourceLocation + "... ");

		final URI uri = URI.createFileURI(resourceLocation);

		ReactionLanguagePackage.eINSTANCE.eClass();
		EPackage ePackage = ReactionLanguagePackage.eINSTANCE;

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);

		// Get the resource
		Resource resource = resSet.getResource(uri, true);

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		ReactionModel reactionModel = (ReactionModel) resource.getContents().get(0);

		System.out.print("Successful.\n");
		return reactionModel;
	}

	public static IntermediateModel loadIntermModel(String resourceLocation) {

		System.out.print("Loading model from " + resourceLocation + "... ");

		final URI uri = URI.createFileURI(resourceLocation);

		IntermModelPackage.eINSTANCE.eClass();
		EPackage ePackage = IntermModelPackage.eINSTANCE;

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);

		// Get the resource
		Resource resource = resSet.getResource(uri, true);

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		IntermediateModel intermModel = (IntermediateModel) resource.getContents().get(0);

		System.out.print("Successful.\n");
		return intermModel;
	}

	public static EPackage loadEPackage(String resourceLocation) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
		Resource model = resourceSet.getResource(URI.createFileURI(resourceLocation), true);
		EPackage metamodelPackage = (EPackage) model.getContents().get(0);
		String platformUri = fileUriToPlatformUri(resourceLocation);
		resourceSet.getPackageRegistry().put(platformUri, metamodelPackage);
		return metamodelPackage;
	}

	private static String fileUriToPlatformUri(String fileUri) {
		URI uri = URI.createFileURI(fileUri);
		int startIndex = uri.segmentCount()-3;
		String platformString = "";
		for(int i = startIndex; i< uri.segmentCount(); i++) {
			platformString = platformString +"/"+uri.segment(i);
		}
//		URI platformUri = URI.createPlatformResourceURI(platformString, true);
		return uri.toPlatformString(true);
	}

	public static void saveResource(EObject model, String resourceLocation) {

		System.out.print("Saving model to " + resourceLocation + "... ");

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createFileURI(resourceLocation));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(model);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.print("Successful.\n");
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveEcore(EObject model, String resourceLocation) {

		System.out.print("Saving model to " + resourceLocation + "... ");

		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());

		// Obtain new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create resource
		Resource resource = resSet.createResource(URI.createFileURI(resourceLocation));
		resource.getContents().add(model);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.print("Successful.\n");
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}

}
