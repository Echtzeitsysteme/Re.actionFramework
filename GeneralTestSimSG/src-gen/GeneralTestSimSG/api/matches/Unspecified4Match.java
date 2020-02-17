package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Unspecified4Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.U_s;
import TestcasesModel.X;

/**
 * A match for the rule <code>unspecified4()</code>.
 */
public class Unspecified4Match extends GraphTransformationMatch<Unspecified4Match, Unspecified4Rule> {
	private A varA;
	private X varX;
	private U_s varUs;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>unspecified4()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Unspecified4Match(final Unspecified4Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varX = (X) match.get("x");
		varUs = (U_s) match.get("us");
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
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
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
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
