package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SynthDegCompleteMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import reactionContainer.Container;
import TestcasesModel.P_s;
import TestcasesModel.U_s;

/**
 * The rule <code>synthDegComplete()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SynthDegCompleteRule extends GraphTransformationRule<SynthDegCompleteMatch, SynthDegCompleteRule> {
	private static String patternName = "synthDegComplete";

	/**
	 * Creates a new rule synthDegComplete().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SynthDegCompleteRule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SynthDegCompleteMatch convertMatch(final IMatch match) {
		return new SynthDegCompleteMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("blank");
		names.add("ps");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node blank to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SynthDegCompleteRule bindBlank(final Container object) {
		parameters.put("blank", Objects.requireNonNull(object, "blank must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SynthDegCompleteRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SynthDegCompleteRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	blank --> " + parameters.get("blank") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
