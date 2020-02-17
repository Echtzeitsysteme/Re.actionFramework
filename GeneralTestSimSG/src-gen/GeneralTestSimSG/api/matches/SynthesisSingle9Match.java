package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle9Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.P_s;

/**
 * A match for the rule <code>synthesisSingle9()</code>.
 */
public class SynthesisSingle9Match extends GraphTransformationMatch<SynthesisSingle9Match, SynthesisSingle9Rule> {
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>synthesisSingle9()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle9Match(final SynthesisSingle9Rule pattern, final IMatch match) {
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
