package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti8Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisMulti8()</code>.
 */
public class SynthesisMulti8Match extends GraphTransformationMatch<SynthesisMulti8Match, SynthesisMulti8Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisMulti8()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti8Match(final SynthesisMulti8Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
