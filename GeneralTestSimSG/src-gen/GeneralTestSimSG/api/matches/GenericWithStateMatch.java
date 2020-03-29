package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.GenericWithStateRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.U_s;
import TestcasesModel.X;

/**
 * A match for the rule <code>genericWithState()</code>.
 */
public class GenericWithStateMatch extends GraphTransformationMatch<GenericWithStateMatch, GenericWithStateRule> {
	private A varA;
	private X varLocal_for_a_c;
	private U_s varUs;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>genericWithState()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public GenericWithStateMatch(final GenericWithStateRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varLocal_for_a_c = (X) match.get("local_for_a_c");
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
	 * Returns the local_for_a_c.
	 *
	 * @return the local_for_a_c
	 */
	public X getLocal_for_a_c() {
		return varLocal_for_a_c;
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
		s += "	local_for_a_c --> " + varLocal_for_a_c + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
