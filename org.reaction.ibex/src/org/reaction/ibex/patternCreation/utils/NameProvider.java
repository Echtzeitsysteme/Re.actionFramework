package org.reaction.ibex.patternCreation.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import ecoreBCModel.Bindable;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;

import org.xtext.biochemics.dotDsl.BondSide;
import org.xtext.biochemics.dotDsl.Bond;
import org.xtext.biochemics.dotDsl.AgentInstance;

public class NameProvider {

	/**
	 * @returns a valid name for a state node that should be unique in the context
	 *          of its rule
	 */
	public static String getQualifiedStateNodeName(IntermSiteInstance si) {
		return si.getState().getName() + "s";
	}

	/**
	 * @returns a valid name for a local node
	 */
	public static String getQualifiedLocalNodeName(IntermSiteInstance si) {

		IntermAgentInstance ai = si.getParent();

		return "local_for_" + ai.getName() + "_" + si.getName();
	}

	/**
	 * @returns a valid name for a local node
	 */
	public static String getQualifiedLocalNodeName(BondSide rbs) {

		Bond bond = (Bond) rbs.eContainer();
		String instanceName = ((AgentInstance) bond.getLeft().getAbstractAgent()).getName();
		String siteName = bond.getLeft().getSiteInstance().getSite().getName();

		return "local_for_" + instanceName + "_" + siteName;
	}

	/**
	 * @returns the valid and hopefully unique name for a bound pattern
	 */
	public static String getBoundSitePatternName(IntermAgentInstance ai, IntermSiteInstance si) {
		return ai.getInstanceOf().getName().toLowerCase() + "_" + si.getInstanceOf().getName() + "Bound";
	}

	/**
	 * @returns the valid and hopefully unique name for a bound pattern
	 */
	public static String getBoundSitePatternName(EClass agentClass, EReference siteReference) {

		int agentNameLength = agentClass.getName().length();
		String siteName = siteReference.getName().substring(agentNameLength + 1);

		return agentClass.getName().toLowerCase() + "_" + siteName + "Bound";
	}

	/**
	 * @return a qualified name for managing condition patterns.
	 */
	public static String getQualifiedConditionPatternName(IntermAgentInstance aiSrc, IntermSiteInstance siSrc,
			Bindable trg, boolean toLocalNode) {
		StringBuilder sb = new StringBuilder("conditionPattern_");

		if (trg instanceof IntermSiteInstance) {
			IntermSiteInstance siTrg = (IntermSiteInstance) trg;

			IntermAgentInstance aiTrg = siTrg.getParent();
			IntermSiteState stateTrg = siTrg.getState();

			sb.append(aiSrc.getInstanceOf().getName());
			sb.append(siSrc.getName());
			sb.append("_to_");
			sb.append(aiTrg.getInstanceOf().getName());
			sb.append(siTrg.getName());

			if (stateTrg != null) {
				sb.append("_state_" + stateTrg.getName());
			}
			if (toLocalNode) {
				sb.append("_Local");
			}

		}
		if (trg instanceof IntermAgent) {
			IntermAgent trgAgent = (IntermAgent) trg;

			sb.append(aiSrc.getInstanceOf().getName());
			sb.append(siSrc.getName());
			sb.append("_to_");
			sb.append("LocalAgent_");
			sb.append(trgAgent.getName().toUpperCase());
		}
		if (trg instanceof IntermAgentInstance) {
			throw new UnsupportedOperationException("Could not handle type of " + trg.toString());
		}
		return sb.toString();
	}

	/**
	 * @returns the key-string to get a state type from the state type map
	 */
	public static String getStateTypeKey(IntermSiteInstance si) {
		return si.getState().getName().toUpperCase() + "_s";
	}

	/**
	 * @param ai      - the agent where the edge starts
	 * @param si      - the site where the edge starts
	 * @param toState - true, if it is an edge pointing to a state node
	 * @return the key-string to get an edge type from the edge type map
	 */
	public static String getEdgeTypeKey(IntermAgentInstance ai, IntermSiteInstance si, boolean toState) {
		String key = ai.getInstanceOf().getName().toUpperCase() + "_" + si.getName();
		IntermSiteState state = si.getState();
		if (state != null && toState) {
			key = key + "_" + si.getState().getName();
		}
		return key;
	}

}