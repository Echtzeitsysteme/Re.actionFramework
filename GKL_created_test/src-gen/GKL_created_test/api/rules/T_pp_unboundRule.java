package GKL_created_test.api.rules;

import GKL_created_test.api.GKL_created_testAPI;
import GKL_created_test.api.matches.T_pp_unboundMatch;
import GKLModel.P_s;
import GKLModel.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>T_pp_unbound()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class T_pp_unboundRule extends GraphTransformationRule<T_pp_unboundMatch, T_pp_unboundRule> {
	private static String patternName = "T_pp_unbound";

	/**
	 * Creates a new rule T_pp_unbound().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public T_pp_unboundRule(final GKL_created_testAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected T_pp_unboundMatch convertMatch(final IMatch match) {
		return new T_pp_unboundMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("t");
		names.add("ps");
		return names;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public T_pp_unboundRule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public T_pp_unboundRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "}";
		return s;
	}
}
