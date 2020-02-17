package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.BreakSpecificBondMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * The rule <code>breakSpecificBond()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class BreakSpecificBondRule extends GraphTransformationRule<BreakSpecificBondMatch, BreakSpecificBondRule> {
	private static String patternName = "breakSpecificBond";

	/**
	 * Creates a new rule breakSpecificBond().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public BreakSpecificBondRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected BreakSpecificBondMatch convertMatch(final IMatch match) {
		return new BreakSpecificBondMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("x");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public BreakSpecificBondRule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node x to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public BreakSpecificBondRule bindX(final X object) {
		parameters.put("x", Objects.requireNonNull(object, "x must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	x --> " + parameters.get("x") + System.lineSeparator();
		s += "}";
		return s;
	}
}
