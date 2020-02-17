package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.ForbiddenBondStateGenericWithSynthesisMatch;
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
 * The rule <code>forbiddenBondStateGenericWithSynthesis()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class ForbiddenBondStateGenericWithSynthesisRule extends GraphTransformationRule<ForbiddenBondStateGenericWithSynthesisMatch, ForbiddenBondStateGenericWithSynthesisRule> {
	private static String patternName = "forbiddenBondStateGenericWithSynthesis";

	/**
	 * Creates a new rule forbiddenBondStateGenericWithSynthesis().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public ForbiddenBondStateGenericWithSynthesisRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected ForbiddenBondStateGenericWithSynthesisMatch convertMatch(final IMatch match) {
		return new ForbiddenBondStateGenericWithSynthesisMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("local_X");
		names.add("ps");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenBondStateGenericWithSynthesisRule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node local_X to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenBondStateGenericWithSynthesisRule bindLocal_X(final X object) {
		parameters.put("local_X", Objects.requireNonNull(object, "local_X must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ForbiddenBondStateGenericWithSynthesisRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	local_X --> " + parameters.get("local_X") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "}";
		return s;
	}
}
