package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.XFreeRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.X;

/**
 * A match for the rule <code>xFree()</code>.
 */
public class XFreeMatch extends GraphTransformationMatch<XFreeMatch, XFreeRule> {
	private X varX;

	/**
	 * Creates a new match for the rule <code>xFree()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public XFreeMatch(final XFreeRule pattern, final IMatch match) {
		super(pattern, match);
		varX = (X) match.get("x");
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
		s += "	x --> " + varX + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
