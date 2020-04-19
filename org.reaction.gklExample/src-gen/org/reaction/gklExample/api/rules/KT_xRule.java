package org.reaction.gklExample.api.rules;

import GKLModel.K;
import GKLModel.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import org.reaction.gklExample.api.GklExampleAPI;
import org.reaction.gklExample.api.matches.KT_xMatch;

/**
 * The rule <code>KT_x()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
public class KT_xRule extends GraphTransformationRule<KT_xMatch, KT_xRule> {
	private static String patternName = "KT_x";

	/**
	 * Creates a new rule KT_x().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	public KT_xRule(final GklExampleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	protected KT_xMatch convertMatch(final IMatch match) {
		return new KT_xMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("t");
		names.add("k");
		return names;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public KT_xRule bindT(final T object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}

	/**
	 * Binds the node k to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public KT_xRule bindK(final K object) {
		parameters.put("k", Objects.requireNonNull(object, "k must not be null!"));
		return this;
	}

	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "	k --> " + parameters.get("k") + System.lineSeparator();
		s += "}";
		return s;
	}
}
