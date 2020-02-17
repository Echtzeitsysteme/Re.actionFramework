package org.reaction.ibex.patternCreation.utils;

import org.eclipse.emf.ecore.EPackage;

import IBeXLanguage.IBeXCreatePattern;
import IBeXLanguage.IBeXDeletePattern;
import IBeXLanguage.IBeXLanguageFactory;

public class ChangePatternFactory {

	static boolean created = false;
	
	private EPackage metamodelPackage;
	
	private IBeXCreatePattern createPattern;
	private IBeXDeletePattern deletePattern;
	
	private IBeXLanguageFactory ibexFactory = IBeXLanguageFactory.eINSTANCE;
	
	private ChangePatternTemplate template;
	
	private ChangePatternFactory(EPackage metamodelPackage) {
		created = true;
		this.metamodelPackage = metamodelPackage;
	}
	
	public void generateChangePatterns(ChangePatternTemplate template) {
		this.template = template;
		generateCreatePattern();
		generateDeletePattern();
	}
	
	private void generateCreatePattern() {
		createPattern = ibexFactory.createIBeXCreatePattern();
		createPattern.setName(template.getName());
	}
	
	private  void generateDeletePattern() {
		deletePattern = ibexFactory.createIBeXDeletePattern();
		deletePattern.setName(template.getName());
	}
	
	public IBeXCreatePattern getCreatePattern() {
		return createPattern;
	}
	
	public IBeXDeletePattern getDeletePattern() {
		return deletePattern;
	}
	
	public static ChangePatternFactory getInstance(EPackage metamodelPackage) {
		if(created == false) {
			return new ChangePatternFactory(metamodelPackage);	
		}else {
			return null;
		}
	}
}
