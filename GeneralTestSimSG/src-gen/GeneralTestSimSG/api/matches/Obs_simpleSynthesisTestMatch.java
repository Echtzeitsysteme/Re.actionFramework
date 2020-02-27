package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_simpleSynthesisTestRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.U_s;
import TestcasesModel.X;

/**
 * A match for the rule <code>obs_simpleSynthesisTest()</code>.
 */
public class Obs_simpleSynthesisTestMatch extends GraphTransformationMatch<Obs_simpleSynthesisTestMatch, Obs_simpleSynthesisTestRule> {
	private X varX;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>obs_simpleSynthesisTest()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_simpleSynthesisTestMatch(final Obs_simpleSynthesisTestRule pattern, final IMatch match) {
		super(pattern, match);
		varX = (X) match.get("x");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the x.
	 *
	 * @return the x
	 */
	public X getX() {
		return varX;
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
		s += "	x --> " + varX + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
