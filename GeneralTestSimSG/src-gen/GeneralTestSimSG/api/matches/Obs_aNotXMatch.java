package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Obs_aNotXRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>obs_aNotX()</code>.
 */
public class Obs_aNotXMatch extends GraphTransformationMatch<Obs_aNotXMatch, Obs_aNotXRule> {
	private A varA;

	/**
	 * Creates a new match for the rule <code>obs_aNotX()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_aNotXMatch(final Obs_aNotXRule pattern, final IMatch match) {
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
