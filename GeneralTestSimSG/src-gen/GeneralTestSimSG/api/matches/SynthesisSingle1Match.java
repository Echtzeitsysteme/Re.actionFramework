package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisSingle1()</code>.
 */
public class SynthesisSingle1Match extends GraphTransformationMatch<SynthesisSingle1Match, SynthesisSingle1Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisSingle1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle1Match(final SynthesisSingle1Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
