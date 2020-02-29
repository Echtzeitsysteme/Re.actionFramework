package GKL_created_test.api.matches;

import GKL_created_test.api.rules.P_a_T_yBoundSrcRule;
import GKLModel.P;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>P_a_T_yBoundSrc()</code>.
 */
public class P_a_T_yBoundSrcMatch extends GraphTransformationMatch<P_a_T_yBoundSrcMatch, P_a_T_yBoundSrcRule> {
	private P varSrc;

	/**
	 * Creates a new match for the rule <code>P_a_T_yBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public P_a_T_yBoundSrcMatch(final P_a_T_yBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (P) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public P getSrc() {
		return varSrc;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	src --> " + varSrc + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
