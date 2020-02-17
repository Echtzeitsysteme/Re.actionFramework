package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ConditionPattern_Ab_to_TiRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.T;

/**
 * A match for the rule <code>conditionPattern_Ab_to_Ti()</code>.
 */
public class ConditionPattern_Ab_to_TiMatch extends GraphTransformationMatch<ConditionPattern_Ab_to_TiMatch, ConditionPattern_Ab_to_TiRule> {
	private A varSrc;
	private T varTrg;

	/**
	 * Creates a new match for the rule <code>conditionPattern_Ab_to_Ti()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConditionPattern_Ab_to_TiMatch(final ConditionPattern_Ab_to_TiRule pattern, final IMatch match) {
		super(pattern, match);
		varSrc = (A) match.get("src");
		varTrg = (T) match.get("trg");
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
	public T getTrg() {
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
