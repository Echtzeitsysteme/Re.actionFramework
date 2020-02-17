package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisMulti4Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>synthesisMulti4()</code>.
 */
public class SynthesisMulti4Match extends GraphTransformationMatch<SynthesisMulti4Match, SynthesisMulti4Rule> {
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>synthesisMulti4()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisMulti4Match(final SynthesisMulti4Rule pattern, final IMatch match) {
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
