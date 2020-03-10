package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ConditionPattern_Ac_to_Xy_LocalRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>conditionPattern_Ac_to_Xy_Local()</code>.
 */
public class ConditionPattern_Ac_to_Xy_LocalMatch extends GraphTransformationMatch<ConditionPattern_Ac_to_Xy_LocalMatch, ConditionPattern_Ac_to_Xy_LocalRule> {
	private A varSrc;

	/**
	 * Creates a new match for the rule <code>conditionPattern_Ac_to_Xy_Local()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConditionPattern_Ac_to_Xy_LocalMatch(final ConditionPattern_Ac_to_Xy_LocalRule pattern, final IMatch match) {
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
