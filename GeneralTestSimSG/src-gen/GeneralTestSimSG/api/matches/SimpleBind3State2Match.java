package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SimpleBind3State2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>simpleBind3State2()</code>.
 */
public class SimpleBind3State2Match extends GraphTransformationMatch<SimpleBind3State2Match, SimpleBind3State2Rule> {
	private A varA;
	private T varT;
	private P_s varPs;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>simpleBind3State2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SimpleBind3State2Match(final SimpleBind3State2Rule pattern, final IMatch match) {
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
