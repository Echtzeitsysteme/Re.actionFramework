package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisMulti2()</code>.
 */
public class SynthesisMulti2Match extends GraphTransformationMatch<SynthesisMulti2Match, SynthesisMulti2Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisMulti2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti2Match(final SynthesisMulti2Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
