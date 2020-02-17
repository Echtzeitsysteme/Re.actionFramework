package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SimpleBind3Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.A;
import TestcasesModel.T;

/**
 * The rule <code>simpleBind3()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SimpleBind3Rule extends GraphTransformationRule<SimpleBind3Match, SimpleBind3Rule> {
	private static String patternName = "simpleBind3";

	/**
	 * Creates a new rule simpleBind3().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SimpleBind3Rule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SimpleBind3Match convertMatch(final IMatch match) {
		return new SimpleBind3Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("a");
		names.add("t");
		return names;
	}

	/**
	 * Binds the node a to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SimpleBind3Rule bindA(final A object) {
		parameters.put("a", Objects.requireNonNull(object, "a must not be null!"));
		return this;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SimpleBind3Rule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	a --> " + parameters.get("a") + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "}";
		return s;
	}
}
