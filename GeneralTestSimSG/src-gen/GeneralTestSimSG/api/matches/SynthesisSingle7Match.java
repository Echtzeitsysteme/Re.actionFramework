package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle7Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisSingle7()</code>.
 */
public class SynthesisSingle7Match extends GraphTransformationMatch<SynthesisSingle7Match, SynthesisSingle7Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisSingle7()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle7Match(final SynthesisSingle7Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
