package GKL_created_test.api.matches;

import GKL_created_test.api.rules.KT_yBwdRule;
import GKLModel.K;
import GKLModel.T;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>KT_yBwd()</code>.
 */
public class KT_yBwdMatch extends GraphTransformationMatch<KT_yBwdMatch, KT_yBwdRule> {
	private T varT;
	private K varK;

	/**
	 * Creates a new match for the rule <code>KT_yBwd()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public KT_yBwdMatch(final KT_yBwdRule pattern, final IMatch match) {
		super(pattern, match);
		varT = (T) match.get("t");
		varK = (K) match.get("k");
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
	 * Returns the k.
	 *
	 * @return the k
	 */
	public K getK() {
		return varK;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	k --> " + varK + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
