package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.ForbiddenStandAloneRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>forbiddenStandAlone()</code>.
 */
public class ForbiddenStandAloneMatch extends GraphTransformationMatch<ForbiddenStandAloneMatch, ForbiddenStandAloneRule> {
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>forbiddenStandAlone()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ForbiddenStandAloneMatch(final ForbiddenStandAloneRule pattern, final IMatch match) {
		super(pattern, match);
		varUs = (U_s) match.get("us");
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
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
