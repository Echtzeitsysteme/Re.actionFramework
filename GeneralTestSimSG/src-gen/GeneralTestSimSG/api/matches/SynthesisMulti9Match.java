package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti9Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.P_s;

/**
 * A match for the rule <code>synthesisMulti9()</code>.
 */
public class SynthesisMulti9Match extends GraphTransformationMatch<SynthesisMulti9Match, SynthesisMulti9Rule> {
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>synthesisMulti9()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti9Match(final SynthesisMulti9Rule pattern, final IMatch match) {
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
