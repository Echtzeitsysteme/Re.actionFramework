package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ForbiddenBondStateGenericRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;
import TestcasesModel.X;

/**
 * A match for the rule <code>forbiddenBondStateGeneric()</code>.
 */
public class ForbiddenBondStateGenericMatch extends GraphTransformationMatch<ForbiddenBondStateGenericMatch, ForbiddenBondStateGenericRule> {
	private A varA;
	private T varT;
	private X varLocal_X;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>forbiddenBondStateGeneric()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ForbiddenBondStateGenericMatch(final ForbiddenBondStateGenericRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varT = (T) match.get("t");
		varLocal_X = (X) match.get("local_X");
		varPs = (P_s) match.get("ps");
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
	 * Returns the t.
	 *
	 * @return the t
	 */
	public T getT() {
		return varT;
	}

	/**
	 * Returns the local_X.
	 *
	 * @return the local_X
	 */
	public X getLocal_X() {
		return varLocal_X;
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	local_X --> " + varLocal_X + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
