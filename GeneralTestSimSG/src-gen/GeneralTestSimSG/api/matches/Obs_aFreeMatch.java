package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_aFreeRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>obs_aFree()</code>.
 */
public class Obs_aFreeMatch extends GraphTransformationMatch<Obs_aFreeMatch, Obs_aFreeRule> {
	private A varA;

	/**
	 * Creates a new match for the rule <code>obs_aFree()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_aFreeMatch(final Obs_aFreeRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
	}

	/**
	 * Returns the a.
	 *
	 * @return the a
	 */
	public A getA() {
		return varA;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
