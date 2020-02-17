package org.reaction.ibex.patternCreation.utils;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import IBeXLanguage.IBeXContextPattern;
import IBeXLanguage.IBeXEdge;
import IBeXLanguage.IBeXNode;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermSiteInstance;
import reactionContainer.ReactionContainerPackage;

public class ModelHelper {

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
	 * @return the first found signature node with the given name or if there is no
	 *         such node, the first local node with the given name. if there is no
	 *         such local node as well, returns null.
	 */
	public static IBeXNode getNodeFromContextPattern(IBeXContextPattern contextPattern, String name) {
		IBeXNode foundNode = getSignatureNodeFromContextPattern(contextPattern, name);
		if (foundNode == null) {
			foundNode = getLocalNodeFromContextPattern(contextPattern, name);
		}
		return foundNode;
	}

	/**
	 * @return an already existent signature node with the given name within the
	 *         given pattern or null if no such node exists.
	 */
	public static IBeXNode getSignatureNodeFromContextPattern(IBeXContextPattern pattern, String nodeName) {
		for (IBeXNode node : pattern.getSignatureNodes()) {
			if (node.getName().equals(nodeName)) {
				return node;
			}
		}
		return null;
	}


	/**
	 * @return an already existent local node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getLocalNodeFromContextPattern(IBeXContextPattern pattern, String nodeName) {
		for (IBeXNode node : pattern.getLocalNodes()) {
			if (node.getName().equals(nodeName)) {
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
