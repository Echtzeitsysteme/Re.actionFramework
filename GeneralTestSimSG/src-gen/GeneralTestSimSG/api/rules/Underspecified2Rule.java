package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.Underspecified2Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.X;

/**
 * The rule <code>underspecified2()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Underspecified2Rule extends GraphTransformationRule<Underspecified2Match, Underspecified2Rule> {
	private static String patternName = "underspecified2";

	/**
	 * Creates a new rule underspecified2().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Underspecified2Rule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Underspecified2Match convertMatch(final IMatch match) {
		return new Underspecified2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("x");
		names.add("ps");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Underspecified2Rule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node x to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Underspecified2Rule bindX(final X object) {
		parameters.put("x", Objects.requireNonNull(object, "x must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Underspecified2Rule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	x --> " + parameters.get("x") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "}";
		return s;
	}
}
