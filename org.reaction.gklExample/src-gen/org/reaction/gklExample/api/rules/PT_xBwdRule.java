package org.reaction.gklExample.api.rules;

import GKLModel.P;
import GKLModel.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import org.reaction.gklExample.api.GklExampleAPI;
import org.reaction.gklExample.api.matches.PT_xBwdMatch;

/**
 * The rule <code>PT_xBwd()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class PT_xBwdRule extends GraphTransformationRule<PT_xBwdMatch, PT_xBwdRule> {
	private static String patternName = "PT_xBwd";

	/**
	 * Creates a new rule PT_xBwd().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public PT_xBwdRule(final GklExampleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected PT_xBwdMatch convertMatch(final IMatch match) {
		return new PT_xBwdMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("p");
		names.add("t");
		return names;
	}

	/**
	 * Binds the node p to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PT_xBwdRule bindP(final P object) {
		parameters.put("p", Objects.requireNonNull(object, "p must not be null!"));
		return this;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PT_xBwdRule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	p --> " + parameters.get("p") + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "}";
		return s;
	}
}
