package org.reaction.ibex.patternCreation;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.reaction.ibex.patternCreation.utils.ChangeCreator;
import org.reaction.ibex.patternCreation.utils.ContextCreator;

import IBeXLanguage.IBeXPatternSet;
import intermModel.IntermediateModel;

public class IBeXCreator {

	private IntermediateModel model;

	private EPackage metamodelPackage;

	private ContextCreator contextCreator;
	private ChangeCreator changeCreator;

	private IBeXPatternSet ibexPatternSet;

	public IBeXCreator(IntermediateModel model, EPackage metamodelPackage) {
		this.model = model;
		this.metamodelPackage = metamodelPackage;
		init();
	}

	private void init() {
		contextCreator = new ContextCreator(model, metamodelPackage);
		ibexPatternSet = contextCreator.getIBeXPatternSet();
		changeCreator = new ChangeCreator(model, metamodelPackage, ibexPatternSet);
		ibexPatternSet = changeCreator.getIBeXPatternSet();
	}

	public IBeXPatternSet getIBeXPatternSet() {
		return ibexPatternSet;
	}

	public void savePatternSet(String ibexSaveLocation) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(ibexSaveLocation));
		resource.getContents().add(ibexPatternSet);
		Map<Object, Object> options = ((XMLResource) resource).getDefaultSaveOptions();
		options.put(XMIResource.OPTION_ENCODING, "ASCII");
		options.put(XMIResource.OPTION_SAVE_ONLY_IF_CHANGED, XMIResource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		options.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl() {
			@Override
			public URI deresolve(final URI uri) {
				if (!uri.isPlatform()) {
					// DONT TOUCH----------------------------------------------
					String[] uriSegments = uri.segments();
					String uriString;
					final String MODEL_STRING = "model";
					int modelPos = -1;

					// find "model"-segment
					for (int i = 0; i < uriSegments.length; i++) {
						if (uriSegments[i].equals(MODEL_STRING)) {
							modelPos = i;
							break;
						}
					}

					// create platform uri
					StringBuilder sb = new StringBuilder("platform:/resource");
					for (int i = modelPos - 1; i < uriSegments.length; i++) {
						sb.append("/");
						sb.append(uriSegments[i]);
					}

					sb.append("#");
					sb.append(uri.fragment());
					uriString = sb.toString();

					return URI.createURI(uriString, true);
				} else {
					return uri;
				}
			}
		});
		try {
			resource.save(options);
		} catch (IOException e) {
			System.err.println("Error trying to save the ibex-patterns at " + ibexSaveLocation);
			return;
		}
	}
}
