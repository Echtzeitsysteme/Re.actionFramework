package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.GenericWithStateTestRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;

/**
 * A match for the rule <code>genericWithStateTest()</code>.
 */
public class GenericWithStateTestMatch extends GraphTransformationMatch<GenericWithStateTestMatch, GenericWithStateTestRule> {
	private A varA;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>genericWithStateTest()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public GenericWithStateTestMatch(final GenericWithStateTestRule pattern, final IMatch match) {
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
