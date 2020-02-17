package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ConditionPattern_Ti_to_Ac_state_uRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.T;

/**
 * A match for the rule <code>conditionPattern_Ti_to_Ac_state_u()</code>.
 */
public class ConditionPattern_Ti_to_Ac_state_uMatch extends GraphTransformationMatch<ConditionPattern_Ti_to_Ac_state_uMatch, ConditionPattern_Ti_to_Ac_state_uRule> {
	private T varSrc;
	private A varTrg;

	/**
	 * Creates a new match for the rule <code>conditionPattern_Ti_to_Ac_state_u()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConditionPattern_Ti_to_Ac_state_uMatch(final ConditionPattern_Ti_to_Ac_state_uRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (T) match.get("src");
		varTrg = (A) match.get("trg");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public T getSrc() {
		return varSrc;
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public A getTrg() {
		return varTrg;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	src --> " + varSrc + System.lineSeparator();
		s += "	trg --> " + varTrg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
