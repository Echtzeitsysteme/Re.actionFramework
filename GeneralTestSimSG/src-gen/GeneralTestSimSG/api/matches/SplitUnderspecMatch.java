package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SplitUnderspecRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * A match for the rule <code>splitUnderspec()</code>.
 */
public class SplitUnderspecMatch extends GraphTransformationMatch<SplitUnderspecMatch, SplitUnderspecRule> {
	private A varA;
	private X varLocal_for_a_b;

	/**
	 * Creates a new match for the rule <code>splitUnderspec()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SplitUnderspecMatch(final SplitUnderspecRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varLocal_for_a_b = (X) match.get("local_for_a_b");
	}

	/**
	 * Returns the a.
	 *
	 * @return the a
	 */
	public A getA() {
		return varA;
	}

	/**
	 * Returns the local_for_a_b.
	 *
	 * @return the local_for_a_b
	 */
	public X getLocal_for_a_b() {
		return varLocal_for_a_b;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	local_for_a_b --> " + varLocal_for_a_b + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
