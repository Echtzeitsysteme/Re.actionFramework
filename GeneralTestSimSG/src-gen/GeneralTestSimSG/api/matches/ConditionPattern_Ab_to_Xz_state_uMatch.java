package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_Xz_state_uRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * A match for the rule <code>conditionPattern_Ab_to_Xz_state_u()</code>.
 */
public class ConditionPattern_Ab_to_Xz_state_uMatch extends GraphTransformationMatch<ConditionPattern_Ab_to_Xz_state_uMatch, ConditionPattern_Ab_to_Xz_state_uRule> {
	private A varSrc;
	private X varTrg;

	/**
	 * Creates a new match for the rule <code>conditionPattern_Ab_to_Xz_state_u()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConditionPattern_Ab_to_Xz_state_uMatch(final ConditionPattern_Ab_to_Xz_state_uRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (A) match.get("src");
		varTrg = (X) match.get("trg");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public A getSrc() {
		return varSrc;
	}

	/**
	 * Returns the trg.
	 *
	 * @return the trg
	 */
	public X getTrg() {
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
