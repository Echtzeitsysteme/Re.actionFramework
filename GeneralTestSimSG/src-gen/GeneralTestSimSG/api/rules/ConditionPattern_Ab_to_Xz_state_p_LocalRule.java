package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.ConditionPattern_Ab_to_Xz_state_p_LocalMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;

/**
 * The rule <code>conditionPattern_Ab_to_Xz_state_p_Local()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ConditionPattern_Ab_to_Xz_state_p_LocalRule extends GraphTransformationRule<ConditionPattern_Ab_to_Xz_state_p_LocalMatch, ConditionPattern_Ab_to_Xz_state_p_LocalRule> {
	private static String patternName = "conditionPattern_Ab_to_Xz_state_p_Local";

	/**
	 * Creates a new rule conditionPattern_Ab_to_Xz_state_p_Local().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ConditionPattern_Ab_to_Xz_state_p_LocalRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ConditionPattern_Ab_to_Xz_state_p_LocalMatch convertMatch(final IMatch match) {
		return new ConditionPattern_Ab_to_Xz_state_p_LocalMatch(this, match);
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
	public ConditionPattern_Ab_to_Xz_state_p_LocalRule bindSrc(final A object) {
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
