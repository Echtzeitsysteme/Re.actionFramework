package GKL_created_test.api.matches;

import GKL_created_test.api.rules.T_y_P_aBoundTrgRule;
import GKLModel.P;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>T_y_P_aBoundTrg()</code>.
 */
public class T_y_P_aBoundTrgMatch extends GraphTransformationMatch<T_y_P_aBoundTrgMatch, T_y_P_aBoundTrgRule> {
	private P varTrg;

	/**
	 * Creates a new match for the rule <code>T_y_P_aBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public T_y_P_aBoundTrgMatch(final T_y_P_aBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (P) match.get("trg");
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public P getTrg() {
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
