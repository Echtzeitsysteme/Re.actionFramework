package GeneralTestSimSG.api;

import GeneralTestSimSG.api.rules.AFreeRule;
import GeneralTestSimSG.api.rules.AxRule;
import GeneralTestSimSG.api.rules.SelfBindingBwdRule;
import GeneralTestSimSG.api.rules.SelfBindingRule;
import GeneralTestSimSG.api.rules.SimpleBindingBwdRule;
import GeneralTestSimSG.api.rules.SimpleBindingRule;
import GeneralTestSimSG.api.rules.SynthDegCompleteBwdRule;
import GeneralTestSimSG.api.rules.SynthDegCompleteRule;
import GeneralTestSimSG.api.rules.SynthDegPartialBwdRule;
import GeneralTestSimSG.api.rules.SynthDegPartialRule;
import GeneralTestSimSG.api.rules.UnspecRule;
import GeneralTestSimSG.api.rules.UnspecTestRule;
import GeneralTestSimSG.api.rules.XFreeRule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;

/**
 * The GeneralTestSimSGAPI with 13 rules.
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
	 * Creates a new instance of the rule <code>ax()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AxRule ax() {
		return new AxRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>aFree()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public AFreeRule aFree() {
		return new AFreeRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>xFree()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public XFreeRule xFree() {
		return new XFreeRule(this, interpreter);
	}
}
