package org.reaction.gklExample.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.reaction.gklExample.api.rules.KT_xBwdRule;
import org.reaction.gklExample.api.rules.KT_xRule;
import org.reaction.gklExample.api.rules.KT_yBwdRule;
import org.reaction.gklExample.api.rules.KT_yRule;
import org.reaction.gklExample.api.rules.Obs_T_pp_unboundRule;
import org.reaction.gklExample.api.rules.Obs_T_ppRule;
import org.reaction.gklExample.api.rules.PT_xBwdRule;
import org.reaction.gklExample.api.rules.PT_xRule;
import org.reaction.gklExample.api.rules.PT_yBwdRule;
import org.reaction.gklExample.api.rules.PT_yRule;
import org.reaction.gklExample.api.rules.Tp_xRule;
import org.reaction.gklExample.api.rules.Tp_yRule;
import org.reaction.gklExample.api.rules.Tu_xRule;
import org.reaction.gklExample.api.rules.Tu_yRule;

/**
 * The GklExampleAPI with 14 rules.
 */
public class GklExampleAPI extends GraphTransformationAPI {
	public static String patternPath = "org.reaction.gklExample/src-gen/org/reaction/gklExample/api/ibex-patterns.xmi";

	/**
	 * Creates a new GklExampleAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public GklExampleAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new GklExampleAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param defaultResource
	 *            the default resource
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public GklExampleAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
			final String workspacePath) {
		super(engine, model, defaultResource);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new instance of the rule <code>KT_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_xRule KT_x() {
		return new KT_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>KT_xBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_xBwdRule KT_xBwd() {
		return new KT_xBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tp_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tp_xRule Tp_x() {
		return new Tp_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>KT_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_yRule KT_y() {
		return new KT_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>KT_yBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_yBwdRule KT_yBwd() {
		return new KT_yBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tp_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tp_yRule Tp_y() {
		return new Tp_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_xRule PT_x() {
		return new PT_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_xBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_xBwdRule PT_xBwd() {
		return new PT_xBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tu_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tu_xRule Tu_x() {
		return new Tu_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_yRule PT_y() {
		return new PT_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_yBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_yBwdRule PT_yBwd() {
		return new PT_yBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tu_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tu_yRule Tu_y() {
		return new Tu_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_T_pp()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_T_ppRule obs_T_pp() {
		return new Obs_T_ppRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>obs_T_pp_unbound()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Obs_T_pp_unboundRule obs_T_pp_unbound() {
		return new Obs_T_pp_unboundRule(this, interpreter);
	}
}
