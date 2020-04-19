package org.reaction.gklExample.api.rules;

import GKLModel.P;
import GKLModel.P_s;
import GKLModel.T;
import GKLModel.U_s;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import org.reaction.gklExample.api.GklExampleAPI;
import org.reaction.gklExample.api.matches.Tu_xMatch;

/**
 * The rule <code>Tu_x()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class Tu_xRule extends GraphTransformationRule<Tu_xMatch, Tu_xRule> {
	private static String patternName = "Tu_x";

	/**
	 * Creates a new rule Tu_x().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public Tu_xRule(final GklExampleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected Tu_xMatch convertMatch(final IMatch match) {
		return new Tu_xMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p");
		names.add("t");
		names.add("ps");
		names.add("us");
		return names;
	}

	/**
	 * Binds the node p to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tu_xRule bindP(final P object) {
		parameters.put("p", Objects.requireNonNull(object, "p must not be null!"));
		return this;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tu_xRule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	/**
	 * Binds the node ps to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tu_xRule bindPs(final P_s object) {
		parameters.put("ps", Objects.requireNonNull(object, "ps must not be null!"));
		return this;
	}

	/**
	 * Binds the node us to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public Tu_xRule bindUs(final U_s object) {
		parameters.put("us", Objects.requireNonNull(object, "us must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p --> " + parameters.get("p") + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "	ps --> " + parameters.get("ps") + System.lineSeparator();
		s += "	us --> " + parameters.get("us") + System.lineSeparator();
		s += "}";
		return s;
	}
}
