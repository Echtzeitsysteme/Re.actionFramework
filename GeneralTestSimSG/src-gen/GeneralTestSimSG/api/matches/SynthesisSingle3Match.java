package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>synthesisSingle3()</code>.
 */
public class SynthesisSingle3Match extends GraphTransformationMatch<SynthesisSingle3Match, SynthesisSingle3Rule> {

	/**
	 * Creates a new match for the rule <code>synthesisSingle3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle3Match(final SynthesisSingle3Rule pattern, final IMatch match) {
		super(pattern, match);
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
