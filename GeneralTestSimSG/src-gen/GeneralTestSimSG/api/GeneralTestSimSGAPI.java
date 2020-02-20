package GeneralTestSimSG.api;

import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_Xz_state_uRule;
import GeneralTestSimSG.api.rules.ConditionPattern_Xz_to_AbRule;
import GeneralTestSimSG.api.rules.GenericRule;
import GeneralTestSimSG.api.rules.GenericTestRule;
import GeneralTestSimSG.api.rules.GenericWithStateRule;
import GeneralTestSimSG.api.rules.GenericWithStateTestRule;
import GeneralTestSimSG.api.rules.SelfBindingBwdRule;
import GeneralTestSimSG.api.rules.SelfBindingRule;
import GeneralTestSimSG.api.rules.SimpleBindingBwdRule;
import GeneralTestSimSG.api.rules.SimpleBindingRule;
import GeneralTestSimSG.api.rules.SynthDegCompleteBwdRule;
import GeneralTestSimSG.api.rules.SynthDegCompleteRule;
import GeneralTestSimSG.api.rules.SynthDegPartialBwdRule;
import GeneralTestSimSG.api.rules.SynthDegPartialRule;
import GeneralTestSimSG.api.rules.UnderspecRule;
import GeneralTestSimSG.api.rules.UnderspecTestRule;
import GeneralTestSimSG.api.rules.UnspecRule;
import GeneralTestSimSG.api.rules.UnspecTestRule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;

/**
 * The GeneralTestSimSGAPI with 18 rules.
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
	 * Creates a new instance of the rule <code>simpleBinding()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBindingRule simpleBinding() {
		return new SimpleBindingRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>conditionPattern_Ab_to_Xz_state_u()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public ConditionPattern_Ab_to_Xz_state_uRule conditionPattern_Ab_to_Xz_state_u() {
		return new ConditionPattern_Ab_to_Xz_state_uRule(this, interpreter);
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
	 * Creates a new instance of the rule <code>simpleBindingBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SimpleBindingBwdRule simpleBindingBwd() {
		return new SimpleBindingBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>selfBinding()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SelfBindingRule selfBinding() {
		return new SelfBindingRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>selfBindingBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SelfBindingBwdRule selfBindingBwd() {
		return new SelfBindingBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthDegComplete()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthDegCompleteRule synthDegComplete() {
		return new SynthDegCompleteRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthDegCompleteBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthDegCompleteBwdRule synthDegCompleteBwd() {
		return new SynthDegCompleteBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthDegPartial()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthDegPartialRule synthDegPartial() {
		return new SynthDegPartialRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>synthDegPartialBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public SynthDegPartialBwdRule synthDegPartialBwd() {
		return new SynthDegPartialBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspec()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public UnderspecRule underspec() {
		return new UnderspecRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>underspecTest()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public UnderspecTestRule underspecTest() {
		return new UnderspecTestRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>unspec()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public UnspecRule unspec() {
		return new UnspecRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>unspecTest()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public UnspecTestRule unspecTest() {
		return new UnspecTestRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>generic()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public GenericRule generic() {
		return new GenericRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>genericTest()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public GenericTestRule genericTest() {
		return new GenericTestRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>genericWithState()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public GenericWithStateRule genericWithState() {
		return new GenericWithStateRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>genericWithStateTest()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public GenericWithStateTestRule genericWithStateTest() {
		return new GenericWithStateTestRule(this, interpreter);
	}
}
