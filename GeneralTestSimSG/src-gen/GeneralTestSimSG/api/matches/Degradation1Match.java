package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Degradation1Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * A match for the rule <code>degradation1()</code>.
 */
public class Degradation1Match extends GraphTransformationMatch<Degradation1Match, Degradation1Rule> {
	private A varA;
	private X varX;

	/**
	 * Creates a new match for the rule <code>degradation1()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Degradation1Match(final Degradation1Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varX = (X) match.get("x");
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
	 * Returns the x.
	 *
	 * @return the x
	 */
	public X getX() {
		return varX;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	x --> " + varX + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
