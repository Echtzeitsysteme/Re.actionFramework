package GKL_created_test.api.matches;

import GKL_created_test.api.rules.Tu_xRule;
import GKLModel.P;
import GKLModel.P_s;
import GKLModel.T;
import GKLModel.U_s;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Tu_x()</code>.
 */
public class Tu_xMatch extends GraphTransformationMatch<Tu_xMatch, Tu_xRule> {
	private P varP;
	private T varT;
	private P_s varPs;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>Tu_x()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Tu_xMatch(final Tu_xRule pattern, final IMatch match) {
		super(pattern, match);
		varP = (P) match.get("p");
		varT = (T) match.get("t");
		varPs = (P_s) match.get("ps");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the p.
	 *
	 * @return the p
	 */
	public P getP() {
		return varP;
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

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p --> " + varP + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
