package org.reaction.ibex.patternCreation;

import IntermediateModel.IntermRule;
import IntermediateModel.IntermediateModelContainer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXEdge;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.reaction.ibex.patternCreation.utils.RuleCreator;
import org.reaction.ibex.patternCreation.utils.ContextCreator;


public class IBeXCreator {

	private IntermediateModelContainer model;

	private EPackage metamodelPackage;

	private Map<IntermRule, IBeXContextPattern> rule2pattern = new HashMap<>();
	private ContextCreator contextCreator;
	private RuleCreator changeCreator;

	private IBeXModel ibexModel;

	public IBeXCreator(IntermediateModelContainer model, EPackage metamodelPackage) {
		this.model = model;
		this.metamodelPackage = metamodelPackage;
		init();
	}

	private void init() {
		contextCreator = new ContextCreator(model, metamodelPackage, rule2pattern);
		ibexModel = contextCreator.getIBeXModel();
		changeCreator = new RuleCreator(model, metamodelPackage, ibexModel, rule2pattern);
		ibexModel = changeCreator.getIBeXModel();
	}

	public IBeXModel getIBeXModel() {
		return ibexModel;
	}

	public void savePatternSet(String ibexSaveLocation) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(ibexSaveLocation));
		resource.getContents().add(ibexModel);
		Map<Object, Object> options = ((XMLResource) resource).getDefaultSaveOptions();
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
		options.put(XMIResource.OPTION_SAVE_ONLY_IF_CHANGED, XMIResource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		try {
			resource.save(options);
		} catch (IOException e) {
			System.err.println("Error trying to save the ibex-patterns at " + ibexSaveLocation + "\n\tMessage: "+e.getMessage());
			return;
		}
	}
}
