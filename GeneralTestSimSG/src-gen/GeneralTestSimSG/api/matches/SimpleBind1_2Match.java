package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SimpleBind1_2Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.T;

/**
 * A match for the rule <code>simpleBind1_2()</code>.
 */
public class SimpleBind1_2Match extends GraphTransformationMatch<SimpleBind1_2Match, SimpleBind1_2Rule> {
	private A varA;
	private T varT;

	/**
	 * Creates a new match for the rule <code>simpleBind1_2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SimpleBind1_2Match(final SimpleBind1_2Rule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varT = (T) match.get("t");
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

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
