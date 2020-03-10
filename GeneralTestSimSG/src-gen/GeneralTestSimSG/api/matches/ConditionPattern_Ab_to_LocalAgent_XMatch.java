package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_LocalAgent_XRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;

/**
 * A match for the rule <code>conditionPattern_Ab_to_LocalAgent_X()</code>.
 */
public class ConditionPattern_Ab_to_LocalAgent_XMatch extends GraphTransformationMatch<ConditionPattern_Ab_to_LocalAgent_XMatch, ConditionPattern_Ab_to_LocalAgent_XRule> {
	private A varSrc;

	/**
	 * Creates a new match for the rule <code>conditionPattern_Ab_to_LocalAgent_X()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConditionPattern_Ab_to_LocalAgent_XMatch(final ConditionPattern_Ab_to_LocalAgent_XRule pattern, final IMatch match) {
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
