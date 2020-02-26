package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.InjectivityRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * A match for the rule <code>injectivity()</code>.
 */
public class InjectivityMatch extends GraphTransformationMatch<InjectivityMatch, InjectivityRule> {
	private A varA1;
	private A varA2;
	private X varX;

	/**
	 * Creates a new match for the rule <code>injectivity()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public InjectivityMatch(final InjectivityRule pattern, final IMatch match) {
		super(pattern, match);
		varA1 = (A) match.get("a1");
		varA2 = (A) match.get("a2");
		varX = (X) match.get("x");
	}

	/**
	 * Returns the a1.
	 *
	 * @return the a1
	 */
	public A getA1() {
		return varA1;
	}

	/**
	 * Returns the a2.
	 *
	 * @return the a2
	 */
	public A getA2() {
		return varA2;
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
		s += "	a1 --> " + varA1 + System.lineSeparator();
		s += "	a2 --> " + varA2 + System.lineSeparator();
		s += "	x --> " + varX + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
