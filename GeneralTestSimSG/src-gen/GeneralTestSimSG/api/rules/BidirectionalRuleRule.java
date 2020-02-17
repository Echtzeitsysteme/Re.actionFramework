package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.BidirectionalRuleMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;
import TestcasesModel.U_s;
import TestcasesModel.X;

/**
 * The rule <code>bidirectionalRule()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class BidirectionalRuleRule extends GraphTransformationRule<BidirectionalRuleMatch, BidirectionalRuleRule> {
	private static String patternName = "bidirectionalRule";

	/**
	 * Creates a new rule bidirectionalRule().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public BidirectionalRuleRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected BidirectionalRuleMatch convertMatch(final IMatch match) {
		return new BidirectionalRuleMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("t");
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
	public BidirectionalRuleRule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public BidirectionalRuleRule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	/**
	 * Binds the node x to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public BidirectionalRuleRule bindX(final X object) {
		parameters.put("x", Objects.requireNonNull(object, "x must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public BidirectionalRuleRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public BidirectionalRuleRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "	x --> " + parameters.get("x") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
