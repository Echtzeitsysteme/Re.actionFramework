package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.GenericTestRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>genericTest()</code>.
 */
public class GenericTestMatch extends GraphTransformationMatch<GenericTestMatch, GenericTestRule> {
	private A varA;

	/**
	 * Creates a new match for the rule <code>genericTest()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public GenericTestMatch(final GenericTestRule pattern, final IMatch match) {
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
