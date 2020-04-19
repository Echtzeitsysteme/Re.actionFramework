package org.reaction.gklExample.api.matches;

import GKLModel.K;
import GKLModel.T;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.reaction.gklExample.api.rules.KT_xBwdRule;

/**
 * A match for the rule <code>KT_xBwd()</code>.
 */
public class KT_xBwdMatch extends GraphTransformationMatch<KT_xBwdMatch, KT_xBwdRule> {
	private T varT;
	private K varK;

	/**
	 * Creates a new match for the rule <code>KT_xBwd()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public KT_xBwdMatch(final KT_xBwdRule pattern, final IMatch match) {
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
