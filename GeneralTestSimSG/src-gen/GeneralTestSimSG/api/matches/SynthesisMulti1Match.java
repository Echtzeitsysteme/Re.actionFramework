package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisMulti1()</code>.
 */
public class SynthesisMulti1Match extends GraphTransformationMatch<SynthesisMulti1Match, SynthesisMulti1Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisMulti1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti1Match(final SynthesisMulti1Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
