package org.reaction.ibex.patternCreation;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXNode;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import GTLanguage.GTLanguageFactory;
import GTLanguage.GTLanguagePackage;
import GTLanguage.GTNode;
import GTLanguage.GTRule;
import GTLanguage.GTRuleSet;

public class GTCreator {

	private IBeXPatternSet ibexPatterns;

	private GTLanguageFactory gtFactory = GTLanguagePackage.eINSTANCE.getGTLanguageFactory();
	private GTRuleSet gtRules;

	public GTCreator(IBeXPatternSet ibexPatterns) {
		this.ibexPatterns = ibexPatterns;
		init();
	}

	private void init() {
		createGTRules();
		gtFactory.createGTRuleSet();
	}

	/**
	 * Creates a GTRule for each rule present in the model
	 */
	private void createGTRules() {
		gtRules = gtFactory.createGTRuleSet();

		for (IBeXContext context : ibexPatterns.getContextPatterns()) {
			IBeXContextPattern contextPattern = (IBeXContextPattern) context;
			
			if(contextPattern.getName().matches(".*Bound")) {
				continue;
			}
			
			GTRule gtRule = gtFactory.createGTRule();
			gtRule.setDocumentation("");
			gtRule.setName(contextPattern.getName());
			gtRule.setExecutable(true);

			for(IBeXNode ibexNode : contextPattern.getSignatureNodes()) {
				GTNode gtNode = gtFactory.createGTNode();
				gtNode.setName(ibexNode.getName());
				gtNode.setType(ibexNode.getType());
				gtRule.getNodes().add(gtNode);
				gtRule.getRuleNodes().add(gtNode);
			}
			
			gtRules.getRules().add(gtRule);
		}

	}

	public GTRuleSet getGTRuleSet() {
		return gtRules;
	}

	/**
	 * Saves the current state of the GTRuleSet as .xmi file
	 */
	public void saveRuleSet(String saveLocation) {

//		System.out.print("Saving GT rule set to " + saveLocation + "... ");

		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create resource
		Resource resource = resSet.createResource(URI.createFileURI(saveLocation));
		resource.getContents().add(gtRules);
		
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

		// now save the content.
		try {
			resource.save(options);
//			System.out.print("Successful.\n");
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
}
