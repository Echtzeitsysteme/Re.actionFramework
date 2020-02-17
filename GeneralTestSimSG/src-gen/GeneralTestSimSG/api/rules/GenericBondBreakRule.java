package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.GenericBondBreakMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;

/**
 * The rule <code>genericBondBreak()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class GenericBondBreakRule extends GraphTransformationRule<GenericBondBreakMatch, GenericBondBreakRule> {
	private static String patternName = "genericBondBreak";

	/**
	 * Creates a new rule genericBondBreak().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public GenericBondBreakRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected GenericBondBreakMatch convertMatch(final IMatch match) {
		return new GenericBondBreakMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public GenericBondBreakRule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "}";
		return s;
	}
}
