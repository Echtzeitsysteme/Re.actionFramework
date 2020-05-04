package org.reaction.ibex.patternCreation.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXCreatePattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDeletePattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXEdge;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXNode;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternInvocation;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;

import IntermediateModel.IntermAgentInstance;
import IntermediateModel.IntermSiteInstance;
import ReactionModel.ReactionModelPackage;

public class ModelHelper {

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

	public static boolean patternAlreadyInvokedWithNode(IBeXContextPattern contextPattern, IBeXContextPattern invokedPattern, IBeXNode node) {
		List<IBeXPatternInvocation> invocations = contextPattern.getInvocations();
		for(IBeXPatternInvocation invoc : invocations) {
			IBeXContextPattern pattern = invoc.getInvokedPattern();
			EMap<IBeXNode, IBeXNode> mapping = invoc.getMapping();
			
			if(pattern == invokedPattern && mapping.containsKey(node)) {
				return true;
			}
		}
		return false;
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
	public static IBeXContextPattern getFreePatternForSite(IBeXPatternSet patternSet, IntermAgentInstance ai,
			IntermSiteInstance si) {

		for (IBeXContext context : patternSet.getContextPatterns()) {
			IBeXContextPattern contextPattern = (IBeXContextPattern) context;
			String contextPatternName = contextPattern.getName();
			if (!contextPatternName.endsWith("Free")) {
				continue;
			}

			//Cut off "Free"
			contextPatternName = contextPatternName.substring(0, contextPatternName.length()-4);
			
			//Check agent and site name
			String regex = "(?<agent>.*)_(?<site>.*)";
			Pattern regexPattern = Pattern.compile(regex);
			Matcher matcher = regexPattern.matcher(contextPatternName);
			matcher.find();

			if(matcher.group("agent").equals(ai.getInstanceOf().getName().toUpperCase()) && matcher.group("site").equals(si.getName())){
				return contextPattern;
			}
			
		}

		return null;
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
			if (agent1.equals(ai.getInstanceOf().getName()) && site1.equals(si.getName())) {
				boundPatterns.add(contextPattern);
			}
		}

		return boundPatterns;
	}
	
	public static IBeXEdge getEdgeFromContextPattern (IBeXContextPattern contextPattern, IBeXNode src, IBeXNode trg) {
		for(IBeXEdge e : contextPattern.getLocalEdges()) {
			IBeXNode eSrc = e.getSourceNode();
			IBeXNode eTrg = e.getTargetNode();
			if(eSrc.equals(src) && eTrg.equals(trg)) {
				return e;
			}
			if(eSrc.equals(trg) && eTrg.equals(src)) {
				return e;
			}
		}
		
		return null;
	}
	
	public static IBeXEdge getEdgeFromDeletePattern (IBeXDeletePattern deletePattern, IBeXNode src, IBeXNode trg) {
		for(IBeXEdge e : deletePattern.getDeletedEdges()) {
			IBeXNode eSrc = e.getSourceNode();
			IBeXNode eTrg = e.getTargetNode();
			if(eSrc.equals(src) && eTrg.equals(trg)) {
				return e;
			}
			if(eSrc.equals(trg) && eTrg.equals(src)) {
				return e;
			}
		}
		
		return null;
	}
	
	public static boolean isInstanceLocal(IntermAgentInstance ai) {
		return ai.getName().startsWith("local");
	}
	
	/**
	 * @param ai - the agent instance the site belongs
	 * @param si - the site to find the patterns for
	 * @return a list of all ContextPatterns representing the given site as bound
	 */
	public static List<IBeXContextPattern> getBoundPatternsForSiteAsSrc(IBeXPatternSet patternSet, IntermAgentInstance ai,
			IntermSiteInstance si) {

		List<IBeXContextPattern> boundPatterns = new LinkedList<>();

		for (IBeXContext context : patternSet.getContextPatterns()) {
			IBeXContextPattern contextPattern = (IBeXContextPattern) context;
			if (!contextPattern.getName().endsWith("BoundSrc")) {
				continue;
			}

			String agent1 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "agent1");
			String site1 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "site1");
			if (agent1.equals(ai.getInstanceOf().getName().toUpperCase()) && site1.equals(si.getName())) {
				boundPatterns.add(contextPattern);
			}
		}

		return boundPatterns;
	}
	
	
	/**
	 * @param ai - the agent instance the site belongs
	 * @param si - the site to find the patterns for
	 * @return a list of all ContextPatterns representing the given site as bound
	 */
	public static List<IBeXContextPattern> getBoundPatternsForSiteAsTrg(IBeXPatternSet patternSet, IntermAgentInstance ai,
			IntermSiteInstance si) {

		List<IBeXContextPattern> boundPatterns = new LinkedList<>();

		for (IBeXContext context : patternSet.getContextPatterns()) {
			IBeXContextPattern contextPattern = (IBeXContextPattern) context;
			if (!contextPattern.getName().endsWith("BoundTrg")) {
				continue;
			}

			String agent2 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "agent2");
			String site2 = NameProvider.getComponentNameOfBoundPattern(contextPattern, "site2");
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
		EClass agentClass = ReactionModelPackage.Literals.AGENT;
		if (clazz == agentClass) {
			return true;
		} else {
			List<EClass> superTypes = clazz.getESuperTypes();
			return superTypes.isEmpty() ? false : superTypes.get(0) == agentClass;
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
