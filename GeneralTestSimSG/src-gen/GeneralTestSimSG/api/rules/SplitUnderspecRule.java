package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SplitUnderspecMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * The rule <code>splitUnderspec()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SplitUnderspecRule extends GraphTransformationRule<SplitUnderspecMatch, SplitUnderspecRule> {
	private static String patternName = "splitUnderspec";

	/**
	 * Creates a new rule splitUnderspec().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SplitUnderspecRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SplitUnderspecMatch convertMatch(final IMatch match) {
		return new SplitUnderspecMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("local_for_a_b");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SplitUnderspecRule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node local_for_a_b to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SplitUnderspecRule bindLocal_for_a_b(final X object) {
		parameters.put("local_for_a_b", Objects.requireNonNull(object, "local_for_a_b must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	local_for_a_b --> " + parameters.get("local_for_a_b") + System.lineSeparator();
		s += "}";
		return s;
	}
}
