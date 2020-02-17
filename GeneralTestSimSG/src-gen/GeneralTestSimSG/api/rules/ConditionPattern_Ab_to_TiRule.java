package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.ConditionPattern_Ab_to_TiMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.T;

/**
 * The rule <code>conditionPattern_Ab_to_Ti()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ConditionPattern_Ab_to_TiRule extends GraphTransformationRule<ConditionPattern_Ab_to_TiMatch, ConditionPattern_Ab_to_TiRule> {
	private static String patternName = "conditionPattern_Ab_to_Ti";

	/**
	 * Creates a new rule conditionPattern_Ab_to_Ti().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ConditionPattern_Ab_to_TiRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ConditionPattern_Ab_to_TiMatch convertMatch(final IMatch match) {
		return new ConditionPattern_Ab_to_TiMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("src");
		names.add("trg");
		return names;
	}

	/**
	 * Binds the node src to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConditionPattern_Ab_to_TiRule bindSrc(final A object) {
		parameters.put("src", Objects.requireNonNull(object, "src must not be null!"));
		return this;
	}

	/**
	 * Binds the node trg to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConditionPattern_Ab_to_TiRule bindTrg(final T object) {
		parameters.put("trg", Objects.requireNonNull(object, "trg must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	src --> " + parameters.get("src") + System.lineSeparator();
		s += "	trg --> " + parameters.get("trg") + System.lineSeparator();
		s += "}";
		return s;
	}
}
