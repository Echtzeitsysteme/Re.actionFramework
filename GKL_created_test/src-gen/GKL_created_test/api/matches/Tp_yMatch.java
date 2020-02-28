package GKL_created_test.api.matches;

import GKL_created_test.api.rules.Tp_yRule;
import GKLModel.K;
import GKLModel.P_s;
import GKLModel.T;
import GKLModel.U_s;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>Tp_y()</code>.
 */
public class Tp_yMatch extends GraphTransformationMatch<Tp_yMatch, Tp_yRule> {
	private T varT;
	private K varK;
	private U_s varUs;
	private P_s varPs;

	/**
	 * Creates a new match for the rule <code>Tp_y()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Tp_yMatch(final Tp_yRule pattern, final IMatch match) {
		super(pattern, match);
		varT = (T) match.get("t");
		varK = (K) match.get("k");
		varUs = (U_s) match.get("us");
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
	 * Returns the k.
	 *
	 * @return the k
	 */
	public K getK() {
		return varK;
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
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
		s += "	k --> " + varK + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
