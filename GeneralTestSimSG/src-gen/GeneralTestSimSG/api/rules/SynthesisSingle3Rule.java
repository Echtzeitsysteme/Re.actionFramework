package GeneralTestSimSG.api.rules;

import GeneralTestSimSG.api.GeneralTestSimSGAPI;
import GeneralTestSimSG.api.matches.SynthesisSingle3Match;
import java.util.ArrayList;
import java.util.List;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>synthesisSingle3()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class SynthesisSingle3Rule extends GraphTransformationRule<SynthesisSingle3Match, SynthesisSingle3Rule> {
	private static String patternName = "synthesisSingle3";

	/**
	 * Creates a new rule synthesisSingle3().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public SynthesisSingle3Rule(final GeneralTestSimSGAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected SynthesisSingle3Match convertMatch(final IMatch match) {
		return new SynthesisSingle3Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		return names;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "}";
		return s;
	}
}
