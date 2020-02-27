package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.A_b_A_cBoundSrcRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>A_b_A_cBoundSrc()</code>.
 */
public class A_b_A_cBoundSrcMatch extends GraphTransformationMatch<A_b_A_cBoundSrcMatch, A_b_A_cBoundSrcRule> {
	private A varSrc;

	/**
	 * Creates a new match for the rule <code>A_b_A_cBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public A_b_A_cBoundSrcMatch(final A_b_A_cBoundSrcRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (A) match.get("src");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public A getSrc() {
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
