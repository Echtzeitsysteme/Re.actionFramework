package GKL_created_test.api.matches;

import GKL_created_test.api.rules.T_y_P_aBoundSrcRule;
import GKLModel.T;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>T_y_P_aBoundSrc()</code>.
 */
public class T_y_P_aBoundSrcMatch extends GraphTransformationMatch<T_y_P_aBoundSrcMatch, T_y_P_aBoundSrcRule> {
	private T varSrc;

	/**
	 * Creates a new match for the rule <code>T_y_P_aBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public T_y_P_aBoundSrcMatch(final T_y_P_aBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (T) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public T getSrc() {
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
