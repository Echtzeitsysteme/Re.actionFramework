package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.UnderspecSynthRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>underspecSynth()</code>.
 */
public class UnderspecSynthMatch extends GraphTransformationMatch<UnderspecSynthMatch, UnderspecSynthRule> {
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>underspecSynth()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public UnderspecSynthMatch(final UnderspecSynthRule pattern, final IMatch match) {
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
