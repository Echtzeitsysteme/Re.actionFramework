package GKL_created_test.api.rules;

import GKL_created_test.api.GKL_created_testAPI;
import GKL_created_test.api.matches.T_x_K_aBoundSrcMatch;
import GKLModel.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>T_x_K_aBoundSrc()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class T_x_K_aBoundSrcRule extends GraphTransformationRule<T_x_K_aBoundSrcMatch, T_x_K_aBoundSrcRule> {
	private static String patternName = "T_x_K_aBoundSrc";

	/**
	 * Creates a new rule T_x_K_aBoundSrc().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public T_x_K_aBoundSrcRule(final GKL_created_testAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected T_x_K_aBoundSrcMatch convertMatch(final IMatch match) {
		return new T_x_K_aBoundSrcMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("src");
		return names;
	}

	/**
	 * Binds the node src to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public T_x_K_aBoundSrcRule bindSrc(final T object) {
		parameters.put("src", Objects.requireNonNull(object, "src must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	src --> " + parameters.get("src") + System.lineSeparator();
		s += "}";
		return s;
	}
}
