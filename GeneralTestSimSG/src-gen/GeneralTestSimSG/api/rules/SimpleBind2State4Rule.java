package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SimpleBind2State4Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.T;
import TestcasesModel.U_s;

/**
 * The rule <code>simpleBind2State4()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SimpleBind2State4Rule extends GraphTransformationRule<SimpleBind2State4Match, SimpleBind2State4Rule> {
	private static String patternName = "simpleBind2State4";

	/**
	 * Creates a new rule simpleBind2State4().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SimpleBind2State4Rule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SimpleBind2State4Match convertMatch(final IMatch match) {
		return new SimpleBind2State4Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("t");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SimpleBind2State4Rule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SimpleBind2State4Rule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SimpleBind2State4Rule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
