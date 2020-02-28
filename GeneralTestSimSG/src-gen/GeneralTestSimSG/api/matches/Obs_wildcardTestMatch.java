package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_wildcardTestRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.X;

/**
 * A match for the rule <code>obs_wildcardTest()</code>.
 */
public class Obs_wildcardTestMatch extends GraphTransformationMatch<Obs_wildcardTestMatch, Obs_wildcardTestRule> {
	private X varX;

	/**
	 * Creates a new match for the rule <code>obs_wildcardTest()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_wildcardTestMatch(final Obs_wildcardTestRule pattern, final IMatch match) {
		super(pattern, match);
		varX = (X) match.get("x");
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
		s += "	x --> " + varX + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
