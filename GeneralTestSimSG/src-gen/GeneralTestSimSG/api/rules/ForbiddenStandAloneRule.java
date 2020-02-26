package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.ForbiddenStandAloneMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.U_s;

/**
 * The rule <code>forbiddenStandAlone()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ForbiddenStandAloneRule extends GraphTransformationRule<ForbiddenStandAloneMatch, ForbiddenStandAloneRule> {
	private static String patternName = "forbiddenStandAlone";

	/**
	 * Creates a new rule forbiddenStandAlone().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ForbiddenStandAloneRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ForbiddenStandAloneMatch convertMatch(final IMatch match) {
		return new ForbiddenStandAloneMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("us");
		return names;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenStandAloneRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
