package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.InjectivityMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * The rule <code>injectivity()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class InjectivityRule extends GraphTransformationRule<InjectivityMatch, InjectivityRule> {
	private static String patternName = "injectivity";

	/**
	 * Creates a new rule injectivity().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public InjectivityRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected InjectivityMatch convertMatch(final IMatch match) {
		return new InjectivityMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a1");
		names.add("a2");
		names.add("x");
		return names;
	}

	/**
	 * Binds the node a1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public InjectivityRule bindA1(final A object) {
		parameters.put("a1", Objects.requireNonNull(object, "a1 must not be null!"));
		return this;
	}

	/**
	 * Binds the node a2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public InjectivityRule bindA2(final A object) {
		parameters.put("a2", Objects.requireNonNull(object, "a2 must not be null!"));
		return this;
	}

	/**
	 * Binds the node x to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public InjectivityRule bindX(final X object) {
		parameters.put("x", Objects.requireNonNull(object, "x must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a1 --> " + parameters.get("a1") + System.lineSeparator();
		s += "	a2 --> " + parameters.get("a2") + System.lineSeparator();
		s += "	x --> " + parameters.get("x") + System.lineSeparator();
		s += "}";
		return s;
	}
}
