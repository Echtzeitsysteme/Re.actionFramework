package GKL_created_test.api.rules;

import GKL_created_test.api.GKL_created_testAPI;
import GKL_created_test.api.matches.T_x_P_aBoundTrgMatch;
import GKLModel.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>T_x_P_aBoundTrg()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class T_x_P_aBoundTrgRule extends GraphTransformationRule<T_x_P_aBoundTrgMatch, T_x_P_aBoundTrgRule> {
	private static String patternName = "T_x_P_aBoundTrg";

	/**
	 * Creates a new rule T_x_P_aBoundTrg().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public T_x_P_aBoundTrgRule(final GKL_created_testAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected T_x_P_aBoundTrgMatch convertMatch(final IMatch match) {
		return new T_x_P_aBoundTrgMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("trg");
		return names;
	}

	/**
	 * Binds the node trg to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public T_x_P_aBoundTrgRule bindTrg(final P object) {
		parameters.put("trg", Objects.requireNonNull(object, "trg must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	trg --> " + parameters.get("trg") + System.lineSeparator();
		s += "}";
		return s;
	}
}
