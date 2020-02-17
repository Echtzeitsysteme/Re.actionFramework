package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthesisSingle8Rule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>synthesisSingle8()</code>.
 */
public class SynthesisSingle8Match extends GraphTransformationMatch<SynthesisSingle8Match, SynthesisSingle8Rule> {
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>synthesisSingle8()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthesisSingle8Match(final SynthesisSingle8Rule pattern, final IMatch match) {
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
