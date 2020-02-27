package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_xFreeRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.X;

/**
 * A match for the rule <code>obs_xFree()</code>.
 */
public class Obs_xFreeMatch extends GraphTransformationMatch<Obs_xFreeMatch, Obs_xFreeRule> {
	private X varX;

	/**
	 * Creates a new match for the rule <code>obs_xFree()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_xFreeMatch(final Obs_xFreeRule pattern, final IMatch match) {
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
