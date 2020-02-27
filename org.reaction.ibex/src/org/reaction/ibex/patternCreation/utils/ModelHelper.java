package org.reaction.ibex.patternCreation.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import IBeXLanguage.IBeXContext;
import IBeXLanguage.IBeXContextPattern;
import IBeXLanguage.IBeXCreatePattern;
import IBeXLanguage.IBeXDeletePattern;
import IBeXLanguage.IBeXEdge;
import IBeXLanguage.IBeXNode;
import IBeXLanguage.IBeXPatternInvocation;
import IBeXLanguage.IBeXPatternSet;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermSiteInstance;
import reactionContainer.ReactionContainerPackage;

public class ModelHelper {

	/**
	 * @return the edge with the given source and target node and of the given type
	 *         in the given context pattern. If not found, check for inverse
	 *         bidirectional edge. null, if both edges do not exist.
	 */
	public static IBeXEdge findEdgeInContextPattern(IBeXContextPattern contextPattern, IBeXNode src, IBeXNode trg,
			EReference edgeType) {

		//TODO: Is this even necessary?
		
		//look for normal edge
		
		//look for inverse edge
		
		return null;
	}

	/**
	 * @return the first context pattern found in the contexts of the pattern set
	 *         with matching name
	 */
	public static IBeXContextPattern getContextPatternByName(IBeXPatternSet patternSet, String name) {
		for (IBeXContext context : patternSet.getContextPatterns()) {
			IBeXContextPattern pattern = (IBeXContextPattern) context;
			if (pattern.getName().equals(name)) {
				return pattern;
			}
		}
		return null;
	}

	public static boolean patternAlreadyInvoked(IBeXContextPattern contextPattern, IBeXContextPattern invokedPattern) {
		List<IBeXContextPattern> invokedPatterns = contextPattern.getInvocations().stream()
				.map((IBeXPatternInvocation invoc) -> invoc.getInvokedPattern()).collect(Collectors.toList());
		return invokedPatterns.contains(invokedPattern);
	}

	/**
	 * @return the first agent instance found in the given list with the desired
	 *         name.
	 */
	public static IntermAgentInstance getAgentInstanceWithName(List<IntermAgentInstance> list, String name) {
		for (IntermAgentInstance ai : list) {
			if (ai.getName().equals(name)) {
				return ai;

			}
		}
		return null;
	}

	/**
	 * @return true, if an instance with the same name as the given instance is
	 *         contained in the given list of instances.
	 */
	public static boolean isInstanceInList(IntermAgentInstance instance, List<IntermAgentInstance> instances) {
		for (IntermAgentInstance listInstance : instances) {
			if (listInstance.getName().equals(instance.getName())) {
				return true;
			}
		}
		return false;
	}

	public static String getPartnerAgentTypeKey(EReference ref) {
		return getPartnerAgentTypeKey(ref.getName());
	}

	public static String getPartnerAgentTypeKey(String refName) {
		String regex = "(?<agent1>.*)_(?<site1>.*)_(?<agent2>.*)_(?<site2>.*)";
		Pattern regexPattern = Pattern.compile(regex);
		Matcher matcher = regexPattern.matcher(refName);
		matcher.find();

		return matcher.group("agent2");
	}

	/**
	 * @return true, if an instance with the given name is contained in the given
	 *         list of instances.
	 */
	public static boolean isInstanceInList(String instanceName, List<IntermAgentInstance> instances) {
		for (IntermAgentInstance listInstance : instances) {
			if (listInstance.getName().equals(instanceName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return true, if an instance with the same name as the given instance is
	 *         contained in the given list of instances.
	 */
	public static boolean isInstanceInList(IntermSiteInstance instance, List<IntermSiteInstance> instances) {
		for (IntermSiteInstance listInstance : instances) {
			if (listInstance.getName().equals(instance.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param ai - the agent instance the site belongs
	 * @param si - the site to find the patterns for
	 * @return a list of all ContextPatterns representing the given site as bound
	 */
	public static List<IBeXContextPattern> getBoundPatternsForSite(IBeXPatternSet patternSet, IntermAgentInstance ai,
			IntermSiteInstance si) {

		List<IBeXContextPattern> boundPatterns = new LinkedList<>();

		for (IBeXContext context : patternSet.getContextPatterns()) {
			IBeXContextPattern contextPattern = (IBeXContextPattern) context;
			if (!contextPattern.getName().endsWith("Bound")) {
				continue;
			}

			String agent1 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "agent1");
			String site1 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "site1");
			String agent2 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "agent2");
			String site2 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "site2");
			if (agent1.equals(ai.getInstanceOf().getName().toUpperCase()) && site1.equals(si.getName())) {
				boundPatterns.add(contextPattern);
			}
			if (agent2.equals(ai.getInstanceOf().getName().toUpperCase()) && site2.equals(si.getName())) {
				boundPatterns.add(contextPattern);
			}
		}

		return boundPatterns;
	}

	/**
	 * @return true if the given class inherited from the agent class
	 */
	public static boolean isAgent(EClass clazz) {
		EClass agentClass = ReactionContainerPackage.Literals.AGENT;
		if (clazz == agentClass) {
			return true;
		} else {
			return clazz.getESuperTypes().get(0) == agentClass;
		}
	}

	/**
	 * @return true, if there already exists an edge within the given pattern
	 *         connecting the two given nodes.
	 */
	public static boolean nodesAlreadyConnected(IBeXContextPattern pattern, IBeXNode plannedSrc, IBeXNode plannedTrg) {

		List<IBeXEdge> edges = pattern.getLocalEdges();
		for (IBeXEdge edge : edges) {
			IBeXNode src = edge.getSourceNode();
			IBeXNode trg = edge.getTargetNode();
			if (plannedSrc == src && plannedTrg == trg) {
				return true;
			}
			if (plannedTrg == src && plannedSrc == trg) {
				return true;
			}
		}

		return false;
	}

	/**
	 * @return an already existent node with the given name within the given pattern
	 *         or null if no such node exists.
	 */
	public static IBeXNode getNodeFromDeletePattern(IBeXDeletePattern pattern, String name) {
		IBeXNode foundNode = getDeletedNodeFromDeletePattern(pattern, name);
		if (foundNode == null) {
			return getContextNodeFromDeletePattern(pattern, name);
		} else {
			return foundNode;
		}
	}

	/**
	 * @return an already existent deleted node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getDeletedNodeFromDeletePattern(IBeXDeletePattern pattern, String name) {
		return getNodeFromList(pattern.getContextNodes(), name);
	}

	/**
	 * @return an already existent deleted node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getContextNodeFromDeletePattern(IBeXDeletePattern pattern, String name) {
		return getNodeFromList(pattern.getDeletedNodes(), name);
	}

	/**
	 * @return an already existent node with the given name within the given pattern
	 *         or null if no such node exists.
	 */
	public static IBeXNode getNodeFromCreatePattern(IBeXCreatePattern pattern, String name) {
		IBeXNode foundNode = getCreatedNodeFromCreatePattern(pattern, name);
		if (foundNode == null) {
			return getContextNodeFromCreatePattern(pattern, name);
		} else {
			return foundNode;
		}
	}

	/**
	 * @return an already existent created node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getCreatedNodeFromCreatePattern(IBeXCreatePattern pattern, String name) {
		return getNodeFromList(pattern.getCreatedNodes(), name);
	}

	/**
	 * @return an already existent context node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getContextNodeFromCreatePattern(IBeXCreatePattern pattern, String name) {
		return getNodeFromList(pattern.getContextNodes(), name);
	}

	/**
	 * @return the first found signature node with the given name or if there is no
	 *         such node, the first local node with the given name. if there is no
	 *         such local node as well, returns null.
	 */
	public static IBeXNode getNodeFromContextPattern(IBeXContextPattern pattern, String name) {
		IBeXNode foundNode = getSignatureNodeFromContextPattern(pattern, name);
		if (foundNode == null) {
			return getLocalNodeFromContextPattern(pattern, name);
		} else {
			return foundNode;
		}
	}

	/**
	 * @return an already existent signature node with the given name within the
	 *         given pattern or null if no such node exists.
	 */
	public static IBeXNode getSignatureNodeFromContextPattern(IBeXContextPattern pattern, String nodeName) {
		return getNodeFromList(pattern.getSignatureNodes(), nodeName);
	}

	/**
	 * @return an already existent local node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getLocalNodeFromContextPattern(IBeXContextPattern pattern, String nodeName) {
		return getNodeFromList(pattern.getLocalNodes(), nodeName);
	}

	/**
	 * @return an already existent node with the given name within the given list or
	 *         null if no such node exists.
	 */
	private static IBeXNode getNodeFromList(List<IBeXNode> nodes, String name) {
		for (IBeXNode node : nodes) {
			if (node.getName().equals(name)) {
				return node;
			}
		}
		return null;
	}

	/**
	 * @return the first site instance found in the given list with the desired
	 *         name.
	 */
	public static IntermSiteInstance getSiteInstanceByName(List<IntermSiteInstance> list, String name) {
		for (IntermSiteInstance si : list) {
			if (si.getName().equals(name)) {
				return si;
			}
		}
		return null;
	}
}
