package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_aNotXyRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>obs_aNotXy()</code>.
 */
public class Obs_aNotXyMatch extends GraphTransformationMatch<Obs_aNotXyMatch, Obs_aNotXyRule> {
	private A varA;

	/**
	 * Creates a new match for the rule <code>obs_aNotXy()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_aNotXyMatch(final Obs_aNotXyRule pattern, final IMatch match) {
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
