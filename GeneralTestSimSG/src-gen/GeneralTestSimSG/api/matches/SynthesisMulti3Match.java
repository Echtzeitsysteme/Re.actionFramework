package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisMulti3()</code>.
 */
public class SynthesisMulti3Match extends GraphTransformationMatch<SynthesisMulti3Match, SynthesisMulti3Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisMulti3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti3Match(final SynthesisMulti3Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
