package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.ConditionPattern_Xz_to_AbMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * The rule <code>conditionPattern_Xz_to_Ab()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ConditionPattern_Xz_to_AbRule extends GraphTransformationRule<ConditionPattern_Xz_to_AbMatch, ConditionPattern_Xz_to_AbRule> {
	private static String patternName = "conditionPattern_Xz_to_Ab";

	/**
	 * Creates a new rule conditionPattern_Xz_to_Ab().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ConditionPattern_Xz_to_AbRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ConditionPattern_Xz_to_AbMatch convertMatch(final IMatch match) {
		return new ConditionPattern_Xz_to_AbMatch(this, match);
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
	public ConditionPattern_Xz_to_AbRule bindSrc(final X object) {
		parameters.put("src", Objects.requireNonNull(object, "src must not be null!"));
		return this;
	}

	/**
	 * Binds the node trg to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConditionPattern_Xz_to_AbRule bindTrg(final A object) {
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
