package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti7Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.P_s;

/**
 * A match for the rule <code>synthesisMulti7()</code>.
 */
public class SynthesisMulti7Match extends GraphTransformationMatch<SynthesisMulti7Match, SynthesisMulti7Rule> {
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>synthesisMulti7()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti7Match(final SynthesisMulti7Rule pattern, final IMatch match) {
		super(pattern, match);
		varPs = (P_s) match.get("ps");
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
