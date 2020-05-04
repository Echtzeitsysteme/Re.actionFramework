package org.reaction.intermTrafo.util;

import java.util.ArrayList;
import java.util.List;

import org.reaction.dsl.interpreter.Calculator;
import org.reaction.dsl.reactionLanguage.Rule;
import org.reaction.dsl.reactionLanguage.RuleType;
import org.reaction.intermTrafo.transformation.*;

import IntermediateModel.IntermPattern;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermediateModelFactory;
import IntermediateModel.PatternContainer;

public class RuleFactory {

	Rule originalRule;

	IntermTransformation transformation;

	Calculator calculator;
	
	PatternContainer patternContainer;

	IntermPatternTemplate lhsTemplate;
	IntermPatternTemplate rhsTemplate;

	boolean isBwd = false;
	double fwdRate = -1;
	double bwdRate = -1;

	PatternFactory patternFactoryLeft;
	PatternFactory patternFactoryRight;

	public RuleFactory(Rule originalRule, IntermTransformation transformation) {
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
		
		IntermRule ruleFwd = IntermediateModelFactory.eINSTANCE.createIntermRule();
		ruleFwd.setName(originalRule.getHead().getName());
		ruleFwd.setLhs(leftPattern);
		ruleFwd.setRhs(rightPattern);
		ruleFwd.setRate(fwdRate);
		allRules.add(ruleFwd);
		
		if(isBwd) {
			IntermRule ruleBwd = IntermediateModelFactory.eINSTANCE.createIntermRule();
			ruleBwd.setName(ruleFwd.getName()+"Bwd");
			ruleBwd.setLhs(rightPattern);
			ruleBwd.setRhs(leftPattern);
			ruleBwd.setRate(bwdRate);
			allRules.add(ruleBwd);
		}
		
		return allRules;
	}
}
