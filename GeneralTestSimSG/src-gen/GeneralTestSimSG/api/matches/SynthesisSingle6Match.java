package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle6Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisSingle6()</code>.
 */
public class SynthesisSingle6Match extends GraphTransformationMatch<SynthesisSingle6Match, SynthesisSingle6Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisSingle6()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle6Match(final SynthesisSingle6Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
