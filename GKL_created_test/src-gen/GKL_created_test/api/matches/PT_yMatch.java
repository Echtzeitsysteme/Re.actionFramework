package GKL_created_test.api.matches;

import GKL_created_test.api.rules.PT_yRule;
import GKLModel.P;
import GKLModel.T;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>PT_y()</code>.
 */
public class PT_yMatch extends GraphTransformationMatch<PT_yMatch, PT_yRule> {
	private P varP;
	private T varT;

	/**
	 * Creates a new match for the rule <code>PT_y()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public PT_yMatch(final PT_yRule pattern, final IMatch match) {
		super(pattern, match);
		varP = (P) match.get("p");
		varT = (T) match.get("t");
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

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	p --> " + varP + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
