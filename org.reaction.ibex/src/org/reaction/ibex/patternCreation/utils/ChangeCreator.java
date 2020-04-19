package org.reaction.ibex.patternCreation.utils;

import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import IBeXLanguage.IBeXPatternSet;
import intermModel.IntermComponent;
import intermModel.IntermRule;
import intermModel.IntermediateModel;

public class ChangeCreator {

	private IntermediateModel model;
	private EPackage metamodelPackage;
	
	private List<ChangePatternTemplate> changePatternTemplates;
	private ChangePatternFactory changePatternFactory;
	
	private IBeXPatternSet ibexPatternSet;

	public ChangeCreator(IntermediateModel model, EPackage metamodelPackage, IBeXPatternSet ibexPatternSet) {
		this.model = model;
		this.metamodelPackage = metamodelPackage;
		this.ibexPatternSet = ibexPatternSet;
		init();
	}

	
	private void init() {
		changePatternTemplates = new LinkedList<>();
		changePatternFactory = new ChangePatternFactory(metamodelPackage);
		generateTemplates();
		generateChangePatterns();
	}

	private void generateTemplates() {
		for (IntermComponent comp : model.getComponents()) {
			if (comp instanceof IntermRule) {
				changePatternTemplates.add(new ChangePatternTemplate((IntermRule) comp));
			}
		}
	}
	
	private void generateChangePatterns() {
		for(ChangePatternTemplate template : changePatternTemplates) {
			changePatternFactory.generateChangePatterns(template);
			ibexPatternSet.getCreatePatterns().add(changePatternFactory.getCreatePattern());
			ibexPatternSet.getDeletePatterns().add(changePatternFactory.getDeletePattern());
		}
	}

	public IBeXPatternSet getIBeXPatternSet() {
		return ibexPatternSet;
	}
}
