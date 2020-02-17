package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.Degradation2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * A match for the rule <code>degradation2()</code>.
 */
public class Degradation2Match extends GraphTransformationMatch<Degradation2Match, Degradation2Rule> {
	private A varA;
	private X varX;

	/**
	 * Creates a new match for the rule <code>degradation2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public Degradation2Match(final Degradation2Rule pattern, final IMatch match) {
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
