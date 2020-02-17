package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SimpleBind3Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.T;

/**
 * A match for the rule <code>simpleBind3()</code>.
 */
public class SimpleBind3Match extends GraphTransformationMatch<SimpleBind3Match, SimpleBind3Rule> {
	private A varA;
	private T varT;

	/**
	 * Creates a new match for the rule <code>simpleBind3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SimpleBind3Match(final SimpleBind3Rule pattern, final IMatch match) {
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
