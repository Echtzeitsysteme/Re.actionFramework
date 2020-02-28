package GKL_created_test.api.matches;

import GKL_created_test.api.rules.Obs_T_pp_unboundRule;
import GKLModel.P_s;
import GKLModel.T;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>obs_T_pp_unbound()</code>.
 */
public class Obs_T_pp_unboundMatch extends GraphTransformationMatch<Obs_T_pp_unboundMatch, Obs_T_pp_unboundRule> {
	private T varT;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>obs_T_pp_unbound()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Obs_T_pp_unboundMatch(final Obs_T_pp_unboundRule pattern, final IMatch match) {
		super(pattern, match);
		varT = (T) match.get("t");
		varPs = (P_s) match.get("ps");
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
		s += "	t --> " + varT + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
