package org.reaction.gklTest.utils;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GeneratorUtils {
	
	public static Resource loadResource(String path) throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		URI uri = URI.createFileURI(path);
		Resource modelResource = rs.getResource(uri, true);
		if(modelResource == null)
			throw new IOException("File did not contain a valid model.");
		
		return modelResource;
	}
	
	public static void saveModelContainer(Resource model, String path) throws Exception {
		URI uri = URI.createFileURI(path);
		Resource modelResource = model.getResourceSet().createResource(uri);
		modelResource.getContents().add(model.getContents().get(0));
		
		Map<Object, Object> saveOptions = ((XMIResource)modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
//		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		((XMIResource)modelResource).save(saveOptions);
		System.out.println("Model saved to: "+uri.path());
	}
}
