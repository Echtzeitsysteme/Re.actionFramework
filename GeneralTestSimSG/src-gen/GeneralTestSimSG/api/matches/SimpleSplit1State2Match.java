package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SimpleSplit1State2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>simpleSplit1State2()</code>.
 */
public class SimpleSplit1State2Match extends GraphTransformationMatch<SimpleSplit1State2Match, SimpleSplit1State2Rule> {
	private A varA;
	private T varT;
	private P_s varPs;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>simpleSplit1State2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SimpleSplit1State2Match(final SimpleSplit1State2Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varT = (T) match.get("t");
		varPs = (P_s) match.get("ps");
		varUs = (U_s) match.get("us");
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
	 * Returns the t.
	 *
	 * @return the t
	 */
	public T getT() {
		return varT;
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
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
		s += "	a --> " + varA + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
