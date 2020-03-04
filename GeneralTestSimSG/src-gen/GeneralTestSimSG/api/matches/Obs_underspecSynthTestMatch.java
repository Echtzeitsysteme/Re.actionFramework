package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_underspecSynthTestRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>obs_underspecSynthTest()</code>.
 */
public class Obs_underspecSynthTestMatch extends GraphTransformationMatch<Obs_underspecSynthTestMatch, Obs_underspecSynthTestRule> {
	private A varA;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>obs_underspecSynthTest()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_underspecSynthTestMatch(final Obs_underspecSynthTestRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varUs = (U_s) match.get("us");
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
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
