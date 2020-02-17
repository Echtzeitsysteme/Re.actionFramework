package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Unspecified1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>unspecified1()</code>.
 */
public class Unspecified1Match extends GraphTransformationMatch<Unspecified1Match, Unspecified1Rule> {
	private A varA;

	/**
	 * Creates a new match for the rule <code>unspecified1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Unspecified1Match(final Unspecified1Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
	}

	/**
	 * Returns the a.
	 *
	 * @return the a
	 */
	public A getA() {
		return varA;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
