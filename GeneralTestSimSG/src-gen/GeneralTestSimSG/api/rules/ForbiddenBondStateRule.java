package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.ForbiddenBondStateMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.U_s;
import TestcasesModel.X;

/**
 * The rule <code>forbiddenBondState()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ForbiddenBondStateRule extends GraphTransformationRule<ForbiddenBondStateMatch, ForbiddenBondStateRule> {
	private static String patternName = "forbiddenBondState";

	/**
	 * Creates a new rule forbiddenBondState().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ForbiddenBondStateRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ForbiddenBondStateMatch convertMatch(final IMatch match) {
		return new ForbiddenBondStateMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("x");
		names.add("ps");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenBondStateRule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node x to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenBondStateRule bindX(final X object) {
		parameters.put("x", Objects.requireNonNull(object, "x must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenBondStateRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenBondStateRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	x --> " + parameters.get("x") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
