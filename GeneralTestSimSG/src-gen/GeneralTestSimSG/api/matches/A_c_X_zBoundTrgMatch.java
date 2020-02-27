package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.A_c_X_zBoundTrgRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.X;

/**
 * A match for the rule <code>A_c_X_zBoundTrg()</code>.
 */
public class A_c_X_zBoundTrgMatch extends GraphTransformationMatch<A_c_X_zBoundTrgMatch, A_c_X_zBoundTrgRule> {
	private X varTrg;

	/**
	 * Creates a new match for the rule <code>A_c_X_zBoundTrg()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public A_c_X_zBoundTrgMatch(final A_c_X_zBoundTrgRule pattern, final IMatch match) {
		super(pattern, match);
		varTrg = (X) match.get("trg");
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
		s += "	trg --> " + varTrg + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
