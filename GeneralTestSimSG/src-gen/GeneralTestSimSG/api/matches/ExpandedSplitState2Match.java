package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ExpandedSplitState2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.T;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>expandedSplitState2()</code>.
 */
public class ExpandedSplitState2Match extends GraphTransformationMatch<ExpandedSplitState2Match, ExpandedSplitState2Rule> {
	private A varA;
	private T varT;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>expandedSplitState2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ExpandedSplitState2Match(final ExpandedSplitState2Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varT = (T) match.get("t");
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
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
