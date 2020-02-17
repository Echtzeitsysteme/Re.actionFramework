package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Generic2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>generic2()</code>.
 */
public class Generic2Match extends GraphTransformationMatch<Generic2Match, Generic2Rule> {
	private A varA;

	/**
	 * Creates a new match for the rule <code>generic2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Generic2Match(final Generic2Rule pattern, final IMatch match) {
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
