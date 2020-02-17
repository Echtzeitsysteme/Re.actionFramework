package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SynthesisSingle9Match;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import TestcasesModel.P_s;

/**
 * The rule <code>synthesisSingle9()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SynthesisSingle9Rule extends GraphTransformationRule<SynthesisSingle9Match, SynthesisSingle9Rule> {
	private static String patternName = "synthesisSingle9";

	/**
	 * Creates a new rule synthesisSingle9().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SynthesisSingle9Rule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SynthesisSingle9Match convertMatch(final IMatch match) {
		return new SynthesisSingle9Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("ps");
		return names;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SynthesisSingle9Rule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "}";
		return s;
	}
}
