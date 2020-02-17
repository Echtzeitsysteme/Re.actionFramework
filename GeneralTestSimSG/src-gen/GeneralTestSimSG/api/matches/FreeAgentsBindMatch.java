package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.FreeAgentsBindRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.X;

/**
 * A match for the rule <code>freeAgentsBind()</code>.
 */
public class FreeAgentsBindMatch extends GraphTransformationMatch<FreeAgentsBindMatch, FreeAgentsBindRule> {
	private A varA;
	private X varX;

	/**
	 * Creates a new match for the rule <code>freeAgentsBind()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FreeAgentsBindMatch(final FreeAgentsBindRule pattern, final IMatch match) {
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
