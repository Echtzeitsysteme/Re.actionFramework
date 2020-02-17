package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle10Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisSingle10()</code>.
 */
public class SynthesisSingle10Match extends GraphTransformationMatch<SynthesisSingle10Match, SynthesisSingle10Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisSingle10()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle10Match(final SynthesisSingle10Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
