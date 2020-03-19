package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SynthDegCompleteRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import reactionContainer.Container;
import TestcasesModel.P_s;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>synthDegComplete()</code>.
 */
public class SynthDegCompleteMatch extends GraphTransformationMatch<SynthDegCompleteMatch, SynthDegCompleteRule> {
	private Container varBlank;
	private P_s varPs;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>synthDegComplete()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SynthDegCompleteMatch(final SynthDegCompleteRule pattern, final IMatch match) {
		super(pattern, match);
		varBlank = (Container) match.get("blank");
		varPs = (P_s) match.get("ps");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the blank.
	 *
	 * @return the blank
	 */
	public Container getBlank() {
		return varBlank;
	}

	/**
	 * Returns the ps.
	 *
	 * @return the ps
	 */
	public P_s getPs() {
		return varPs;
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
		s += "	blank --> " + varBlank + System.lineSeparator();
		s += "	ps --> " + varPs + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
