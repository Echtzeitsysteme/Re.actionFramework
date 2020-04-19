package org.reaction.gklExample.api.matches;

import GKLModel.P;
import GKLModel.T;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.reaction.gklExample.api.rules.PT_yBwdRule;

/**
 * A match for the rule <code>PT_yBwd()</code>.
 */
public class PT_yBwdMatch extends GraphTransformationMatch<PT_yBwdMatch, PT_yBwdRule> {
	private P varP;
	private T varT;

	/**
	 * Creates a new match for the rule <code>PT_yBwd()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public PT_yBwdMatch(final PT_yBwdRule pattern, final IMatch match) {
		super(pattern, match);
		varP = (P) match.get("p");
		varT = (T) match.get("t");
	}

	/**
	 * Returns the p.
	 *
	 * @return the p
	 */
	public P getP() {
		return varP;
	}

	/**
	 * Returns the t.
	 *
	 * @return the t
	 */
	public T getT() {
		return varT;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p --> " + varP + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
