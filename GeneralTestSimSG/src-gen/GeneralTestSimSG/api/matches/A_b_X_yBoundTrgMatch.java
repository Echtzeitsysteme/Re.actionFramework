package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.A_b_X_yBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.X;

/**
 * A match for the rule <code>A_b_X_yBoundTrg()</code>.
 */
public class A_b_X_yBoundTrgMatch extends GraphTransformationMatch<A_b_X_yBoundTrgMatch, A_b_X_yBoundTrgRule> {
	private X varTrg;

	/**
	 * Creates a new match for the rule <code>A_b_X_yBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public A_b_X_yBoundTrgMatch(final A_b_X_yBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (X) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public X getTrg() {
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
