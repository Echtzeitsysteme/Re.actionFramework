package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.A_c_X_zBoundSrcRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>A_c_X_zBoundSrc()</code>.
 */
public class A_c_X_zBoundSrcMatch extends GraphTransformationMatch<A_c_X_zBoundSrcMatch, A_c_X_zBoundSrcRule> {
	private A varSrc;

	/**
	 * Creates a new match for the rule <code>A_c_X_zBoundSrc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public A_c_X_zBoundSrcMatch(final A_c_X_zBoundSrcRule pattern, final IMatch match) {
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
