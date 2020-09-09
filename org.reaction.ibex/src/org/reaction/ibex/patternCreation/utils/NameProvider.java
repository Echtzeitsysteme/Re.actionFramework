package org.reaction.ibex.patternCreation.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.reaction.dsl.reactionLanguage.*;

import IntermediateModel.IntermAgent;
import IntermediateModel.IntermAgentInstance;
import IntermediateModel.IntermSite;
import IntermediateModel.IntermSiteInstance;
import IntermediateModel.IntermSiteState;


public class NameProvider {

	public static String getInverseEdgeReferenceName(String refName) {

		String regex = "(?<agent1>.*)_(?<site1>.*)_(?<agent2>.*)_(?<site2>.*)";
		Pattern regexPattern = Pattern.compile(regex);
		Matcher matcher = regexPattern.matcher(refName);
		matcher.find();

		return matcher.group("agent2") + "_" + matcher.group("site2") + "_" + matcher.group("agent1") + "_"
				+ matcher.group("site1");
	}

	public static String getComponentOfReference(EReference ref, String component) {
		return getComponentOfReference(ref.getName(), component);
	}

	public static String getComponentOfReference(String refName, String component) {

		if (!component.equals("agent1") && !component.equals("agent2") && !component.equals("site1")
				&& !component.equals("site2")) {
			throw new IllegalArgumentException("Can only get agent1/2 or site1/2 from bidirectional reference name");
		}

		String regex = "(?<agent1>.*)_(?<site1>.*)_(?<agent2>.*)_(?<site2>.*)";
		Pattern regexPattern = Pattern.compile(regex);
		Matcher matcher = regexPattern.matcher(refName);
		matcher.find();

		return matcher.group(component);
	}

	public static String getFreeSitePatternName(IntermAgentInstance ai, IntermSiteInstance si) {
		return ai.getInstanceOf().getName().toUpperCase() + "_" + si.getName() + "Free";
	}

	public static String getComponentNameOfBoundPattern(IBeXContextPattern contextPattern, String component) {
		String boundPatternName = contextPattern.getName();
		// Cut "BoundSrc"/"BoundTrg" from end:
		if(boundPatternName.endsWith("BoundGeneratedForCondition")) {
			boundPatternName = boundPatternName.substring(0, boundPatternName.length() - 27);		
		}
		else {
			boundPatternName = boundPatternName.substring(0, boundPatternName.length() - 5);			
		}
		return getComponentNameOfBoundPattern(boundPatternName, component);
	}

	public static String getComponentNameOfBoundPattern(String refName, String component) {

		if (!component.equals("agent1") && !component.equals("agent2") && !component.equals("site1")
				&& !component.equals("site2")) {
			throw new IllegalArgumentException("Can only get agent1/2 or site1/2 from bidirectional reference name");
		}

		String regex = "(?<agent1>.*)_(?<site1>.*)_(?<agent2>.*)_(?<site2>.*)";
		Pattern regexPattern = Pattern.compile(regex);
		Matcher matcher = regexPattern.matcher(refName);
		matcher.find();

		return matcher.group(component);
	}

	/**
	 * @returns a valid name for a state node that should be unique in the context
	 *          of its rule
	 */
	public static String getQualifiedStateNodeName(IntermSiteInstance si) {
		return si.getState().getName() + "s";
	}

	/**
	 * @returns a valid name for a state node in the default state of the given site
	 *          that should be unique in the context of its rule
	 */
	public static String getQualifiedDefaultStateNodeName(IntermSiteInstance si) {
		List<IntermSiteState> states = si.getInstanceOf().getSiteStates();
		if (states.size() > 0) {
			return states.get(0).getName() + "s";
		} else {
			return null;
		}
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
		SiteInstance leftSite = bond.getLeft().getSiteInstance();

		if (leftSite == null) {
			return "local_for_" + instanceName + "_to_" + rbs.getAbstractAgent().getName() + "_"
					+ rbs.getSiteInstance();
		}

		String siteName = leftSite.getSite().getName();

		return "local_for_" + instanceName + "_" + siteName;
	}

	/**
	 * @returns the valid and hopefully unique name for a bound pattern
	 */
	public static String getBoundSitePatternName(IntermAgentInstance ai, IntermSiteInstance si) {
		return ai.getInstanceOf().getName() + "_" + si.getInstanceOf().getName() + "_BoundGeneratedForCondition";
	}

	/**
	 * @returns the valid and hopefully unique name for a bound pattern
	 */
	public static String getBoundSitePatternName(EClass agentClass, EReference siteReference) {
		return siteReference.getName()+"_BoundGeneratedForCondition";
	}

	/**
	 * @return a qualified name for managing condition patterns.
	 */
	public static String getQualifiedConditionPatternName(IntermAgentInstance aiSrc, IntermSiteInstance siSrc,
			IntermSiteInstance siTrg, boolean toLocalNode) {
		StringBuilder sb = new StringBuilder("conditionPattern_");

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

		return sb.toString();
	}

	/**
	 * @returns the key-string to get a state type from the state type map
	 */
	public static String getStateTypeKey(IntermSiteInstance si) {
		if (si.getState() == null) {
			return null;
		}
		return si.getState().getName().toUpperCase() + "_s";
	}

	/**
	 * @returns a valid name for a state node in the default state of the given site
	 *          that should be unique in the context of its rule
	 */
	public static String getDefaultStateTypeKey(IntermSiteInstance si) {
		List<IntermSiteState> states = si.getInstanceOf().getSiteStates();
		if (states.size() > 0) {
			return states.get(0).getName().toUpperCase() + "_s";
		} else {
			return null;
		}
	}

	/**
	 * @return the key-string to get an edge type from from a specific site to a
	 *         specific site
	 */
	public static String getEdgeTypeKey(IntermSiteInstance si, IntermSiteInstance siTrg) {
		IntermAgentInstance ai = si.getParent();
		IntermAgentInstance aiTrg = siTrg.getParent();
		return ai.getInstanceOf().getName() + "_" + si.getName() + "_"
				+ aiTrg.getInstanceOf().getName() + "_" + siTrg.getName();
	}

	/**
	 * @return the key-string to get an edge type from from a specific site to the
	 *         first found site in use of the given agent
	 *
	 */
	// TODO: In metamodel-creation check for bindings to local nodes
	public static String getEdgeTypeKeyToAgent(IntermSiteInstance si, IntermAgent agent) {
		IntermAgentInstance ai = si.getParent();

		IntermSite site = agent.getSites().get(0);

		return ai.getInstanceOf().getName().toUpperCase() + "_" + si.getName() + "_" + agent.getName().toUpperCase()
				+ "_" + site.getName();
	}

	/**
	 * @param ai      - the agent where the edge starts
	 * @param si      - the site where the edge starts
	 * @param toState - true, if it is an edge pointing to a state node
	 * @return the key-string to get an edge type from the edge type map
	 */
	public static String getEdgeTypeToStateKey(IntermAgentInstance ai, IntermSiteInstance si) {
		String key = ai.getInstanceOf().getName() + "_" + si.getName();
		IntermSiteState state = si.getState();
		if (state != null) {
			key = key + "_" + si.getState().getName();
		}

		// If no state given but state is possible, return key for default state
		if (state == null) {
			List<IntermSiteState> possibleStates = si.getInstanceOf().getSiteStates();
			if (possibleStates.size() > 0) {
				IntermSiteState defaultState = possibleStates.get(0);
				key = key + "_" + defaultState.getName();
			} else {
				throw new RuntimeException("I don't know if this program state should be reachable?");
			}

		}

		return key;
	}

}
