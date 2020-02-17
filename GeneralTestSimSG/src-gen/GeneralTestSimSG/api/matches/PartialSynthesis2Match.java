package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.PartialSynthesis2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;

/**
 * A match for the rule <code>partialSynthesis2()</code>.
 */
public class PartialSynthesis2Match extends GraphTransformationMatch<PartialSynthesis2Match, PartialSynthesis2Rule> {
	private A varA;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>partialSynthesis2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public PartialSynthesis2Match(final PartialSynthesis2Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varPs = (P_s) match.get("ps");
	}

	/**
	 * Returns the a.
	 *
	 * @return the a
	 */
	public A getA() {
		return varA;
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
		s += "	a --> " + varA + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
