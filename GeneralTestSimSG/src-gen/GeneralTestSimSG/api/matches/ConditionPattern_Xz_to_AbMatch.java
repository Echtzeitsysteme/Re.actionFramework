package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ConditionPattern_Xz_to_AbRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * A match for the rule <code>conditionPattern_Xz_to_Ab()</code>.
 */
public class ConditionPattern_Xz_to_AbMatch extends GraphTransformationMatch<ConditionPattern_Xz_to_AbMatch, ConditionPattern_Xz_to_AbRule> {
	private X varSrc;
	private A varTrg;

	/**
	 * Creates a new match for the rule <code>conditionPattern_Xz_to_Ab()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConditionPattern_Xz_to_AbMatch(final ConditionPattern_Xz_to_AbRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (X) match.get("src");
		varTrg = (A) match.get("trg");
	}

	/**
	 * Returns the src.
	 *
	 * @return the src
	 */
	public X getSrc() {
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