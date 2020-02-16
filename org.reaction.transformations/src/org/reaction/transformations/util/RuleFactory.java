package org.reaction.transformations.util;

import java.util.ArrayList;
import java.util.List;

import org.reaction.transformations.dslToIntermediateModel.DslToIntermTransformation;
import org.xtext.biochemics.dotDsl.Rule;
import org.xtext.biochemics.dotDsl.RuleType;
import org.xtext.biochemics.interpreter.Calculator;

import ecoreBCModel.IntermPattern;
import ecoreBCModel.IntermRule;
import ecoreBCModel.PatternContainer;
import ecoreBCModel.EcoreBCModelFactory;

public class RuleFactory {

	Rule originalRule;

	DslToIntermTransformation transformation;

	Calculator calculator;
	
	PatternContainer patternContainer;

	IntermPatternTemplate lhsTemplate;
	IntermPatternTemplate rhsTemplate;

	boolean isBwd = false;
	double fwdRate = -1;
	double bwdRate = -1;

	PatternFactory patternFactoryLeft;
	PatternFactory patternFactoryRight;

	public RuleFactory(Rule originalRule, DslToIntermTransformation transformation) {
		this.originalRule = originalRule;
		this.transformation = transformation;
		this.patternContainer = transformation.getPatternContainer();
		init();
	}

	private void init() {

		calculator = new Calculator();
		fwdRate = calculator.evaluate(originalRule.getBody().getRates().getRateForward());
		if (originalRule.getBody().getRuleType() == RuleType.BI) {
			isBwd = true;
			bwdRate = calculator.evaluate(originalRule.getBody().getRates().getRateBackward());
		}

		lhsTemplate = new IntermPatternTemplate(originalRule.getBody().getLhs(), transformation);
		rhsTemplate = new IntermPatternTemplate(originalRule.getBody().getRhs(), transformation);
		patternFactoryLeft = new PatternFactory(lhsTemplate);
		patternFactoryRight = new PatternFactory(rhsTemplate);
	}
	
	public List<IntermRule> getRules(){
		
		List<IntermRule> allRules = new ArrayList<>();
		
		IntermPattern leftPattern = patternFactoryLeft.getPattern(false);
		IntermPattern rightPattern = patternFactoryRight.getPattern(false);
		patternContainer.getPatterns().add(leftPattern);
		patternContainer.getPatterns().add(rightPattern);
		
		IntermRule ruleFwd = EcoreBCModelFactory.eINSTANCE.createIntermRule();
		ruleFwd.setName(originalRule.getHead().getName());
		ruleFwd.setLhs(leftPattern);
		ruleFwd.setRhs(rightPattern);
		ruleFwd.setRate(fwdRate);
		allRules.add(ruleFwd);
		
		if(isBwd) {
			IntermRule ruleBwd = EcoreBCModelFactory.eINSTANCE.createIntermRule();
			ruleBwd.setName(ruleFwd.getName()+"Bwd");
			ruleBwd.setLhs(rightPattern);
			ruleBwd.setRhs(leftPattern);
			ruleBwd.setRate(bwdRate);
			allRules.add(ruleBwd);
		}
		
		return allRules;
	}
}
