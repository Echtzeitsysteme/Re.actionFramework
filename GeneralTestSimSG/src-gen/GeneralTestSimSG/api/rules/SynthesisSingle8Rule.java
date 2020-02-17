package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SynthesisSingle8Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.U_s;

/**
 * The rule <code>synthesisSingle8()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SynthesisSingle8Rule extends GraphTransformationRule<SynthesisSingle8Match, SynthesisSingle8Rule> {
	private static String patternName = "synthesisSingle8";

	/**
	 * Creates a new rule synthesisSingle8().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SynthesisSingle8Rule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SynthesisSingle8Match convertMatch(final IMatch match) {
		return new SynthesisSingle8Match(this, match);
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
	public SynthesisSingle8Rule bindUs(final U_s object) {
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
