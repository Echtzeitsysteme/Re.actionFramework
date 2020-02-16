package GKL_created_test.api.rules;

import GKL_created_test.api.GKL_created_testAPI;
import GKL_created_test.api.matches.PT_yBwdMatch;
import GKLModel.P;
import GKLModel.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>PT_yBwd()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class PT_yBwdRule extends GraphTransformationRule<PT_yBwdMatch, PT_yBwdRule> {
	private static String patternName = "PT_yBwd";

	/**
	 * Creates a new rule PT_yBwd().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public PT_yBwdRule(final GKL_created_testAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected PT_yBwdMatch convertMatch(final IMatch match) {
		return new PT_yBwdMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p");
		names.add("t");
		return names;
	}

	/**
	 * Binds the node p to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PT_yBwdRule bindP(final P object) {
		parameters.put("p", Objects.requireNonNull(object, "p must not be null!"));
		return this;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PT_yBwdRule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p --> " + parameters.get("p") + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "}";
		return s;
	}
}
