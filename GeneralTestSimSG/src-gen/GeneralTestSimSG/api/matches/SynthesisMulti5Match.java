package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti5Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.P_s;

/**
 * A match for the rule <code>synthesisMulti5()</code>.
 */
public class SynthesisMulti5Match extends GraphTransformationMatch<SynthesisMulti5Match, SynthesisMulti5Rule> {
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>synthesisMulti5()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti5Match(final SynthesisMulti5Rule pattern, final IMatch match) {
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
