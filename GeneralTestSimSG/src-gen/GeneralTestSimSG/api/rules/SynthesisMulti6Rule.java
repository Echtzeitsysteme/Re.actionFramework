package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SynthesisMulti6Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.U_s;

/**
 * The rule <code>synthesisMulti6()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SynthesisMulti6Rule extends GraphTransformationRule<SynthesisMulti6Match, SynthesisMulti6Rule> {
	private static String patternName = "synthesisMulti6";

	/**
	 * Creates a new rule synthesisMulti6().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SynthesisMulti6Rule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SynthesisMulti6Match convertMatch(final IMatch match) {
		return new SynthesisMulti6Match(this, match);
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
	public SynthesisMulti6Rule bindUs(final U_s object) {
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
