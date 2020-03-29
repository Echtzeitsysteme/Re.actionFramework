package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_underspecTestRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.X;

/**
 * A match for the rule <code>obs_underspecTest()</code>.
 */
public class Obs_underspecTestMatch extends GraphTransformationMatch<Obs_underspecTestMatch, Obs_underspecTestRule> {
	private A varA;
	private X varLocal_for_a_c;
	private P_s varPs;
	private X varX;

	/**
	 * Creates a new match for the rule <code>obs_underspecTest()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_underspecTestMatch(final Obs_underspecTestRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varLocal_for_a_c = (X) match.get("local_for_a_c");
		varPs = (P_s) match.get("ps");
		varX = (X) match.get("x");
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
	 * Returns the local_for_a_c.
	 *
	 * @return the local_for_a_c
	 */
	public X getLocal_for_a_c() {
		return varLocal_for_a_c;
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
	}

	/**
	 * Returns the x.
	 *
	 * @return the x
	 */
	public X getX() {
		return varX;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	local_for_a_c --> " + varLocal_for_a_c + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "	x --> " + varX + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
