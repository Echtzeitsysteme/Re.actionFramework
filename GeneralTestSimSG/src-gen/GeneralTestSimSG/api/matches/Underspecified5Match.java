package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Underspecified5Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.X;

/**
 * A match for the rule <code>underspecified5()</code>.
 */
public class Underspecified5Match extends GraphTransformationMatch<Underspecified5Match, Underspecified5Rule> {
	private A varA;
	private X varX;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>underspecified5()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Underspecified5Match(final Underspecified5Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varX = (X) match.get("x");
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
	 * Returns the x.
	 *
	 * @return the x
	 */
	public X getX() {
		return varX;
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
		s += "	x --> " + varX + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
