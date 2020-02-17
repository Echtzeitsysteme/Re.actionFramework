package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisSingle2()</code>.
 */
public class SynthesisSingle2Match extends GraphTransformationMatch<SynthesisSingle2Match, SynthesisSingle2Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisSingle2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle2Match(final SynthesisSingle2Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
