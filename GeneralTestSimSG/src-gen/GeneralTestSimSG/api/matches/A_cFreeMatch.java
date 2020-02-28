package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.A_cFreeRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>A_cFree()</code>.
 */
public class A_cFreeMatch extends GraphTransformationMatch<A_cFreeMatch, A_cFreeRule> {
	private A varSrc;

	/**
	 * Creates a new match for the rule <code>A_cFree()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public A_cFreeMatch(final A_cFreeRule pattern, final IMatch match) {
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
