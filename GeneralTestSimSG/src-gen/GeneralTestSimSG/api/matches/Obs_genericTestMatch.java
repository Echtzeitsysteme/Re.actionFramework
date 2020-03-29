package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_genericTestRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.X;

/**
 * A match for the rule <code>obs_genericTest()</code>.
 */
public class Obs_genericTestMatch extends GraphTransformationMatch<Obs_genericTestMatch, Obs_genericTestRule> {
	private A varA;
	private X varLocal_for_a_c;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>obs_genericTest()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_genericTestMatch(final Obs_genericTestRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varLocal_for_a_c = (X) match.get("local_for_a_c");
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

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	local_for_a_c --> " + varLocal_for_a_c + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
