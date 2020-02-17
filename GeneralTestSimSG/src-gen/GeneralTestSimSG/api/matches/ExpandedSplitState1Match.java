package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ExpandedSplitState1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;

/**
 * A match for the rule <code>expandedSplitState1()</code>.
 */
public class ExpandedSplitState1Match extends GraphTransformationMatch<ExpandedSplitState1Match, ExpandedSplitState1Rule> {
	private A varA;
	private T varT;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>expandedSplitState1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ExpandedSplitState1Match(final ExpandedSplitState1Rule pattern, final IMatch match) {
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
