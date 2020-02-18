package GeneralTestSimSG.api;

import GeneralTestSimSG.api.rules.BidirectionalRuleBwdRule;
import GeneralTestSimSG.api.rules.BidirectionalRuleRule;
import GeneralTestSimSG.api.rules.BreakSpecificBondRule;
import GeneralTestSimSG.api.rules.ComplexStateChangesRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_LocalAgent_XRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_TiRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_Xz_state_p_LocalRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_Xz_state_pRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ac_to_LocalAgent_XRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ac_to_TiRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ti_to_AbRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ti_to_Ac_state_pRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ti_to_Ac_state_uRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Ti_to_AcRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Xz_to_AbRule;
import GeneralTestSimSG.api.rules.Degradation1Rule;
import GeneralTestSimSG.api.rules.Degradation2Rule;
import GeneralTestSimSG.api.rules.Degradation3Rule;
import GeneralTestSimSG.api.rules.ExpandedSplitRule;
import GeneralTestSimSG.api.rules.ExpandedSplitState1Rule;
import GeneralTestSimSG.api.rules.ExpandedSplitState2Rule;
import GeneralTestSimSG.api.rules.ForbiddenBondStateGenericRule;
import GeneralTestSimSG.api.rules.ForbiddenBondStateGenericWithSynthesisRule;
import GeneralTestSimSG.api.rules.ForbiddenBondStateRule;
import GeneralTestSimSG.api.rules.FreeAgentsBind2Rule;
import GeneralTestSimSG.api.rules.FreeAgentsBindRule;
import GeneralTestSimSG.api.rules.Generic1Rule;
import GeneralTestSimSG.api.rules.Generic2Rule;
import GeneralTestSimSG.api.rules.Generic3Rule;
import GeneralTestSimSG.api.rules.Generic4Rule;
import GeneralTestSimSG.api.rules.Generic5Rule;
import GeneralTestSimSG.api.rules.Generic6State1Rule;
import GeneralTestSimSG.api.rules.Generic6State2Rule;
import GeneralTestSimSG.api.rules.Generic7Rule;
import GeneralTestSimSG.api.rules.GenericBondBreakRule;
import GeneralTestSimSG.api.rules.InjectivityRule;
import GeneralTestSimSG.api.rules.PartialDegradation1Rule;
import GeneralTestSimSG.api.rules.PartialDegradation2Rule;
import GeneralTestSimSG.api.rules.PartialDegradation3Rule;
import GeneralTestSimSG.api.rules.PartialDegradation4Rule;
import GeneralTestSimSG.api.rules.PartialSynthesis1Rule;
import GeneralTestSimSG.api.rules.PartialSynthesis2Rule;
import GeneralTestSimSG.api.rules.RhsGeneric1Rule;
import GeneralTestSimSG.api.rules.RhsGeneric2Rule;
import GeneralTestSimSG.api.rules.SimpleBind1_1Rule;
import GeneralTestSimSG.api.rules.SimpleBind1_2Rule;
import GeneralTestSimSG.api.rules.SimpleBind1State1Rule;
import GeneralTestSimSG.api.rules.SimpleBind1State2Rule;
import GeneralTestSimSG.api.rules.SimpleBind2Rule;
import GeneralTestSimSG.api.rules.SimpleBind2State1Rule;
import GeneralTestSimSG.api.rules.SimpleBind2State2Rule;
import GeneralTestSimSG.api.rules.SimpleBind2State3Rule;
import GeneralTestSimSG.api.rules.SimpleBind2State4Rule;
import GeneralTestSimSG.api.rules.SimpleBind3Rule;
import GeneralTestSimSG.api.rules.SimpleBind3State1Rule;
import GeneralTestSimSG.api.rules.SimpleBind3State2Rule;
import GeneralTestSimSG.api.rules.SimpleBind3State3Rule;
import GeneralTestSimSG.api.rules.SimpleBind3State4Rule;
import GeneralTestSimSG.api.rules.SimpleSplit1Rule;
import GeneralTestSimSG.api.rules.SimpleSplit1State1Rule;
import GeneralTestSimSG.api.rules.SimpleSplit1State2Rule;
import GeneralTestSimSG.api.rules.SimpleSplit1State3Rule;
import GeneralTestSimSG.api.rules.SimpleSplit1State4Rule;
import GeneralTestSimSG.api.rules.SimpleSplit2State1Rule;
import GeneralTestSimSG.api.rules.SimpleSplit2State2Rule;
import GeneralTestSimSG.api.rules.SimpleSplit2State3Rule;
import GeneralTestSimSG.api.rules.SimpleSplit2State4Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti1Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti2Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti3Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti4Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti5Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti6Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti7Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti8Rule;
import GeneralTestSimSG.api.rules.SynthesisMulti9Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle10Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle1Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle2Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle3Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle4Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle5Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle6Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle7Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle8Rule;
import GeneralTestSimSG.api.rules.SynthesisSingle9Rule;
import GeneralTestSimSG.api.rules.Underspecified1Rule;
import GeneralTestSimSG.api.rules.Underspecified2Rule;
import GeneralTestSimSG.api.rules.Underspecified3Rule;
import GeneralTestSimSG.api.rules.Underspecified4Rule;
import GeneralTestSimSG.api.rules.Underspecified5Rule;
import GeneralTestSimSG.api.rules.UnderspecifiedAgentRule;
import GeneralTestSimSG.api.rules.Unspecified1Rule;
import GeneralTestSimSG.api.rules.Unspecified2Rule;
import GeneralTestSimSG.api.rules.Unspecified3Rule;
import GeneralTestSimSG.api.rules.Unspecified4Rule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;

/**
 * The GeneralTestSimSGAPI with 96 rules.
 */
public class GeneralTestSimSGAPI extends GraphTransformationAPI {
	public static String patternPath = "GeneralTestSimSG/src-gen/GeneralTestSimSG/api/ibex-patterns.xmi";

	/**
	 * Creates a new GeneralTestSimSGAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public GeneralTestSimSGAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new GeneralTestSimSGAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param defaultResource
	 *            the default resource
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public GeneralTestSimSGAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
			final String workspacePath) {
		super(engine, model, defaultResource);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind1_1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind1_1Rule simpleBind1_1() {
		return new SimpleBind1_1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind1_2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind1_2Rule simpleBind1_2() {
		return new SimpleBind1_2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind1State1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind1State1Rule simpleBind1State1() {
		return new SimpleBind1State1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind1State2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind1State2Rule simpleBind1State2() {
		return new SimpleBind1State2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind2Rule simpleBind2() {
		return new SimpleBind2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind2State1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind2State1Rule simpleBind2State1() {
		return new SimpleBind2State1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind2State2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind2State2Rule simpleBind2State2() {
		return new SimpleBind2State2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind2State3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind2State3Rule simpleBind2State3() {
		return new SimpleBind2State3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind2State4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind2State4Rule simpleBind2State4() {
		return new SimpleBind2State4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ab_to_Ti()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ab_to_TiRule conditionPattern_Ab_to_Ti() {
		return new ConditionPattern_Ab_to_TiRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ti_to_Ab()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ti_to_AbRule conditionPattern_Ti_to_Ab() {
		return new ConditionPattern_Ti_to_AbRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind3Rule simpleBind3() {
		return new SimpleBind3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ac_to_Ti()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ac_to_TiRule conditionPattern_Ac_to_Ti() {
		return new ConditionPattern_Ac_to_TiRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ti_to_Ac_state_u()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ti_to_Ac_state_uRule conditionPattern_Ti_to_Ac_state_u() {
		return new ConditionPattern_Ti_to_Ac_state_uRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind3State1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind3State1Rule simpleBind3State1() {
		return new SimpleBind3State1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ti_to_Ac_state_p()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ti_to_Ac_state_pRule conditionPattern_Ti_to_Ac_state_p() {
		return new ConditionPattern_Ti_to_Ac_state_pRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind3State2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind3State2Rule simpleBind3State2() {
		return new SimpleBind3State2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ti_to_Ac()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ti_to_AcRule conditionPattern_Ti_to_Ac() {
		return new ConditionPattern_Ti_to_AcRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind3State3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind3State3Rule simpleBind3State3() {
		return new SimpleBind3State3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleBind3State4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBind3State4Rule simpleBind3State4() {
		return new SimpleBind3State4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit1Rule simpleSplit1() {
		return new SimpleSplit1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit1State1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit1State1Rule simpleSplit1State1() {
		return new SimpleSplit1State1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit1State2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit1State2Rule simpleSplit1State2() {
		return new SimpleSplit1State2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit1State3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit1State3Rule simpleSplit1State3() {
		return new SimpleSplit1State3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit1State4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit1State4Rule simpleSplit1State4() {
		return new SimpleSplit1State4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit2State1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit2State1Rule simpleSplit2State1() {
		return new SimpleSplit2State1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit2State2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit2State2Rule simpleSplit2State2() {
		return new SimpleSplit2State2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit2State3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit2State3Rule simpleSplit2State3() {
		return new SimpleSplit2State3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>simpleSplit2State4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleSplit2State4Rule simpleSplit2State4() {
		return new SimpleSplit2State4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>expandedSplit()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ExpandedSplitRule expandedSplit() {
		return new ExpandedSplitRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>expandedSplitState1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ExpandedSplitState1Rule expandedSplitState1() {
		return new ExpandedSplitState1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>expandedSplitState2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ExpandedSplitState2Rule expandedSplitState2() {
		return new ExpandedSplitState2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle1Rule synthesisSingle1() {
		return new SynthesisSingle1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle2Rule synthesisSingle2() {
		return new SynthesisSingle2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle3Rule synthesisSingle3() {
		return new SynthesisSingle3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle4Rule synthesisSingle4() {
		return new SynthesisSingle4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle5()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle5Rule synthesisSingle5() {
		return new SynthesisSingle5Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle6()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle6Rule synthesisSingle6() {
		return new SynthesisSingle6Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle7()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle7Rule synthesisSingle7() {
		return new SynthesisSingle7Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle8()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle8Rule synthesisSingle8() {
		return new SynthesisSingle8Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle9()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle9Rule synthesisSingle9() {
		return new SynthesisSingle9Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisSingle10()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisSingle10Rule synthesisSingle10() {
		return new SynthesisSingle10Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti1Rule synthesisMulti1() {
		return new SynthesisMulti1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti2Rule synthesisMulti2() {
		return new SynthesisMulti2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti3Rule synthesisMulti3() {
		return new SynthesisMulti3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti4Rule synthesisMulti4() {
		return new SynthesisMulti4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti5()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti5Rule synthesisMulti5() {
		return new SynthesisMulti5Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti6()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti6Rule synthesisMulti6() {
		return new SynthesisMulti6Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti7()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti7Rule synthesisMulti7() {
		return new SynthesisMulti7Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti8()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti8Rule synthesisMulti8() {
		return new SynthesisMulti8Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthesisMulti9()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthesisMulti9Rule synthesisMulti9() {
		return new SynthesisMulti9Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>partialSynthesis1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PartialSynthesis1Rule partialSynthesis1() {
		return new PartialSynthesis1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>partialSynthesis2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PartialSynthesis2Rule partialSynthesis2() {
		return new PartialSynthesis2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>degradation1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Degradation1Rule degradation1() {
		return new Degradation1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>degradation2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Degradation2Rule degradation2() {
		return new Degradation2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>degradation3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Degradation3Rule degradation3() {
		return new Degradation3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>partialDegradation1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PartialDegradation1Rule partialDegradation1() {
		return new PartialDegradation1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>partialDegradation2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PartialDegradation2Rule partialDegradation2() {
		return new PartialDegradation2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>partialDegradation3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PartialDegradation3Rule partialDegradation3() {
		return new PartialDegradation3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>partialDegradation4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PartialDegradation4Rule partialDegradation4() {
		return new PartialDegradation4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspecified1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Underspecified1Rule underspecified1() {
		return new Underspecified1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspecified2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Underspecified2Rule underspecified2() {
		return new Underspecified2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspecified3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Underspecified3Rule underspecified3() {
		return new Underspecified3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspecified4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Underspecified4Rule underspecified4() {
		return new Underspecified4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspecified5()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Underspecified5Rule underspecified5() {
		return new Underspecified5Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>unspecified1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Unspecified1Rule unspecified1() {
		return new Unspecified1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>unspecified2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Unspecified2Rule unspecified2() {
		return new Unspecified2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>unspecified3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Unspecified3Rule unspecified3() {
		return new Unspecified3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>unspecified4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Unspecified4Rule unspecified4() {
		return new Unspecified4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ab_to_LocalAgent_X()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ab_to_LocalAgent_XRule conditionPattern_Ab_to_LocalAgent_X() {
		return new ConditionPattern_Ab_to_LocalAgent_XRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ac_to_LocalAgent_X()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ac_to_LocalAgent_XRule conditionPattern_Ac_to_LocalAgent_X() {
		return new ConditionPattern_Ac_to_LocalAgent_XRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic1Rule generic1() {
		return new Generic1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic2Rule generic2() {
		return new Generic2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic3()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic3Rule generic3() {
		return new Generic3Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic4()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic4Rule generic4() {
		return new Generic4Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic5()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic5Rule generic5() {
		return new Generic5Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic6State1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic6State1Rule generic6State1() {
		return new Generic6State1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic6State2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic6State2Rule generic6State2() {
		return new Generic6State2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic7()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Generic7Rule generic7() {
		return new Generic7Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>freeAgentsBind()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public FreeAgentsBindRule freeAgentsBind() {
		return new FreeAgentsBindRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>freeAgentsBind2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public FreeAgentsBind2Rule freeAgentsBind2() {
		return new FreeAgentsBind2Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspecifiedAgent()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public UnderspecifiedAgentRule underspecifiedAgent() {
		return new UnderspecifiedAgentRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ab_to_Xz_state_p()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ab_to_Xz_state_pRule conditionPattern_Ab_to_Xz_state_p() {
		return new ConditionPattern_Ab_to_Xz_state_pRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Xz_to_Ab()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Xz_to_AbRule conditionPattern_Xz_to_Ab() {
		return new ConditionPattern_Xz_to_AbRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>forbiddenBondState()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ForbiddenBondStateRule forbiddenBondState() {
		return new ForbiddenBondStateRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ab_to_Xz_state_p_Local()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ab_to_Xz_state_p_LocalRule conditionPattern_Ab_to_Xz_state_p_Local() {
		return new ConditionPattern_Ab_to_Xz_state_p_LocalRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>forbiddenBondStateGeneric()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ForbiddenBondStateGenericRule forbiddenBondStateGeneric() {
		return new ForbiddenBondStateGenericRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>forbiddenBondStateGenericWithSynthesis()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ForbiddenBondStateGenericWithSynthesisRule forbiddenBondStateGenericWithSynthesis() {
		return new ForbiddenBondStateGenericWithSynthesisRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>breakSpecificBond()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public BreakSpecificBondRule breakSpecificBond() {
		return new BreakSpecificBondRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>bidirectionalRule()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public BidirectionalRuleRule bidirectionalRule() {
		return new BidirectionalRuleRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>bidirectionalRuleBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public BidirectionalRuleBwdRule bidirectionalRuleBwd() {
		return new BidirectionalRuleBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>complexStateChanges()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ComplexStateChangesRule complexStateChanges() {
		return new ComplexStateChangesRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>genericBondBreak()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public GenericBondBreakRule genericBondBreak() {
		return new GenericBondBreakRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>injectivity()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public InjectivityRule injectivity() {
		return new InjectivityRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>rhsGeneric1()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public RhsGeneric1Rule rhsGeneric1() {
		return new RhsGeneric1Rule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>rhsGeneric2()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public RhsGeneric2Rule rhsGeneric2() {
		return new RhsGeneric2Rule(this, interpreter);
	}
}
