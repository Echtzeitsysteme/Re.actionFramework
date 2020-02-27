package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.A_b_A_bBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>A_b_A_bBoundTrg()</code>.
 */
public class A_b_A_bBoundTrgMatch extends GraphTransformationMatch<A_b_A_bBoundTrgMatch, A_b_A_bBoundTrgRule> {
	private A varTrg;

	/**
	 * Creates a new match for the rule <code>A_b_A_bBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public A_b_A_bBoundTrgMatch(final A_b_A_bBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (A) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public A getTrg() {
		return varTrg;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	trg --> " + varTrg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
