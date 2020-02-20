package org.reaction.ibex.patternCreation.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import IBeXLanguage.IBeXContextPattern;
import IBeXLanguage.IBeXCreatePattern;
import IBeXLanguage.IBeXDeletePattern;
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
	

	/**
	 * @return true, if an instance with the given name is
	 *         contained in the given list of instances.
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
	 * @return an already existent node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getNodeFromDeletePattern(IBeXDeletePattern pattern, String name) {
		IBeXNode foundNode = getDeletedNodeFromDeletePattern(pattern, name);
		if(foundNode == null) {
			return getContextNodeFromDeletePattern(pattern, name);
		}else {
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
	 * @return an already existent node with the given name within the given
	 *         pattern or null if no such node exists.
	 */
	public static IBeXNode getNodeFromCreatePattern(IBeXCreatePattern pattern, String name) {
		IBeXNode foundNode = getCreatedNodeFromCreatePattern(pattern, name);
		if(foundNode == null) {
			return getContextNodeFromCreatePattern(pattern, name);
		}else {
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
		if(foundNode == null) {
			return getLocalNodeFromContextPattern(pattern, name);
		}else {
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
	 * @return an already existent node with the given name within the given
	 *         list or null if no such node exists.
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
