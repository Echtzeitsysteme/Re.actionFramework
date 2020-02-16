package org.reaction.ibex.patternCreation;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GTLanguage.GTLanguageFactory;
import GTLanguage.GTLanguagePackage;
import GTLanguage.GTNode;
import GTLanguage.GTRule;
import GTLanguage.GTRuleSet;
import IBeXLanguage.IBeXContext;
import IBeXLanguage.IBeXContextPattern;
import IBeXLanguage.IBeXNode;
import IBeXLanguage.IBeXPatternSet;

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

		System.out.print("Saving GT rule set to " + saveLocation + "... ");

		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create resource
		Resource resource = resSet.createResource(URI.createFileURI(saveLocation));
		resource.getContents().add(gtRules);

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
