package org.reaction.ibex.patternCreation.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXArithmeticExpression;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXArithmeticValueLiteral;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXCreatePattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDeletePattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDistributionType;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternModelFactory;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXProbability;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXProbabilityDistribution;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;

import IntermediateModel.IntermComponent;
import IntermediateModel.IntermRule;
import IntermediateModel.IntermediateModelContainer;


public class RuleCreator {

	private IntermediateModelContainer model;
	private EPackage metamodelPackage;
	private Map<IntermRule, IBeXContextPattern> rulen2pattern;
	
	private List<ChangePatternTemplate> changePatternTemplates;
	private ChangePatternFactory changePatternFactory;
	
	private IBeXModel ibexModel;

	public RuleCreator(final IntermediateModelContainer model, final EPackage metamodelPackage, final IBeXModel ibexModel, final Map<IntermRule, IBeXContextPattern> rulen2pattern) {
		this.model = model;
		this.metamodelPackage = metamodelPackage;
		this.ibexModel = ibexModel;
		this.rulen2pattern = rulen2pattern;
		init();
	}
	
	public IBeXModel getIBeXModel() {
		return ibexModel;
	}

	private void init() {
		changePatternTemplates = new LinkedList<>();
		changePatternFactory = new ChangePatternFactory(metamodelPackage);
		generateTemplates();
		ibexModel.setRuleSet(IBeXPatternModelFactory.eINSTANCE.createIBeXRuleSet());
		generateRules();
	}

	private void generateTemplates() {
		for (IntermComponent comp : model.getComponents()) {
			if (comp instanceof IntermRule) {
				changePatternTemplates.add(new ChangePatternTemplate((IntermRule) comp));
			}
		}
	}
	
	private void generateRules() {
		for(ChangePatternTemplate template : changePatternTemplates) {
			IBeXContextPattern lhs = rulen2pattern.get(template.getRule());
			changePatternFactory.generateChangePatterns(template, lhs);
			
			IBeXRule rule = IBeXPatternModelFactory.eINSTANCE.createIBeXRule();
			rule.setName(template.getName());
			rule.setLhs(lhs);
			// create change patterns
			addCreatePattern(rule, changePatternFactory.getCreatePattern());
			addDeletePattern(rule, changePatternFactory.getDeletePattern());
			
			// create rhs
			IBeXContextPattern rhs = IBeXPatternModelFactory.eINSTANCE.createIBeXContextPattern();
			rhs.setName(lhs.getName()+"_rhs");
			rhs.getSignatureNodes().addAll(lhs.getSignatureNodes().stream()
					.filter(lhsNode -> !rule.getDelete().getDeletedNodes().contains(lhsNode))
					.collect(Collectors.toList()));
			rhs.getLocalNodes().addAll(lhs.getLocalNodes().stream()
					.filter(lhsNode -> !rule.getDelete().getDeletedNodes().contains(lhsNode))
					.collect(Collectors.toList()));
			rhs.getLocalEdges().addAll(lhs.getLocalEdges().stream()
					.filter(lhsEdge -> !rule.getDelete().getDeletedEdges().contains(lhsEdge))
					.collect(Collectors.toList()));
			rhs.getSignatureNodes().addAll(rule.getCreate().getCreatedNodes());
			rhs.getLocalEdges().addAll(rule.getCreate().getCreatedEdges());
			rule.setRhs(rhs);
			
			//set static rate
			IBeXProbability gtProbability = IBeXPatternModelFactory.eINSTANCE.createIBeXProbability();
			IBeXProbabilityDistribution function = IBeXPatternModelFactory.eINSTANCE.createIBeXProbabilityDistribution();
			IBeXArithmeticValueLiteral sd = IBeXPatternModelFactory.eINSTANCE.createIBeXArithmeticValueLiteral();
			sd.setValue(0.0);
			function.setStddev(sd);
			function.setType(IBeXDistributionType.STATIC);
			IBeXArithmeticValueLiteral expression = IBeXPatternModelFactory.eINSTANCE.createIBeXArithmeticValueLiteral();
			expression.setValue(template.getRule().getRate());
			function.setMean(expression);
			gtProbability.setDistribution(function);
			rule.setProbability(gtProbability);
			
			ibexModel.getRuleSet().getRules().add(rule);
		}
	}

	private void addCreatePattern(IBeXRule rule, IBeXCreatePattern pattern) {
		rule.setCreate(pattern);
		pattern.getCreatedEdges().forEach(edge -> edge.setName("++"+edge.getSourceNode().getName()+"->"+edge.getTargetNode().getName()));
		ibexModel.getNodeSet().getNodes().addAll(pattern.getCreatedNodes());
		ibexModel.getNodeSet().getNodes().addAll(pattern.getContextNodes());
		ibexModel.getEdgeSet().getEdges().addAll(pattern.getCreatedEdges());
	}
	
	private void addDeletePattern(IBeXRule rule, IBeXDeletePattern pattern) {
		rule.setDelete(pattern);
		pattern.getDeletedEdges().forEach(edge -> edge.setName("--"+edge.getSourceNode().getName()+"->"+edge.getTargetNode().getName()));
		ibexModel.getNodeSet().getNodes().addAll(pattern.getDeletedNodes());
		ibexModel.getNodeSet().getNodes().addAll(pattern.getContextNodes());
		ibexModel.getEdgeSet().getEdges().addAll(pattern.getDeletedEdges());
	}
}
