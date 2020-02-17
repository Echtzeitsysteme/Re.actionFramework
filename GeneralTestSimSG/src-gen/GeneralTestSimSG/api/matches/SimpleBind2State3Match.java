package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SimpleBind2State3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;

/**
 * A match for the rule <code>simpleBind2State3()</code>.
 */
public class SimpleBind2State3Match extends GraphTransformationMatch<SimpleBind2State3Match, SimpleBind2State3Rule> {
	private A varA;
	private T varT;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>simpleBind2State3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SimpleBind2State3Match(final SimpleBind2State3Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varT = (T) match.get("t");
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

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
