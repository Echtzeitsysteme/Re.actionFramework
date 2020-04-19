package org.reaction.dsl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.reaction.dsl.reactionLanguage.*;

public class ReactionLanguageQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

		public static QualifiedName getQualifiedName(EObject object) {
			if(object instanceof AgentInstance) {
				return getQualifiedName((AgentInstance) object);
			}
			if(object instanceof Agent) {
				return getQualifiedName((Agent) object);
			}
			if(object instanceof Site) {
				return getQualifiedName((Site) object);
			}
			if(object instanceof SiteState) {
				return getQualifiedName((SiteState) object);
			}
			if(object instanceof Variable) {
				return getQualifiedName((Variable) object);
			}
			if(object instanceof Observable) {
				return getQualifiedName((Observable) object);
			}
			return QualifiedName.EMPTY;
		}
	
		private static QualifiedName getQualifiedName(AgentInstance aInstance) {	
			return QualifiedName.create(getComponentOfInstance(aInstance), aInstance.getName());		
		}
	
		private static QualifiedName getQualifiedName(Agent agent) {
			return QualifiedName.create("Agent",agent.getName());
		}
		
		private static QualifiedName getQualifiedName(Site site) {
			return QualifiedName.create(((Agent)site.eContainer()).getName(), site.getName());
		}
		
		private static QualifiedName getQualifiedName(SiteState state) {
			Site site = (Site) state.eContainer();
			Agent agent = (Agent) site.eContainer();
			return QualifiedName.create(agent.getName(), site.getName(), state.getName());
		}
		
		private static QualifiedName getQualifiedName(Observable obs) {
			return QualifiedName.create(obs.getName());
		}
		
		private static QualifiedName getQualifiedName(Variable var) {
			return QualifiedName.create(var.getName());
		}

		private static String getComponentOfInstance(AgentInstance ai) {
			EObject traverser = ai.eContainer();
			Signature signature = null;
			String prefix = "";
			
			while(!(traverser instanceof ReactionModel)){
				traverser = traverser.eContainer();
				
				if(traverser instanceof Rule) {
					Rule rule = (Rule) traverser;
					signature = rule.getHead().getSignature();
					prefix= "Rule" + rule.getHead().getName();
				}
				if(traverser instanceof Observable) {
					Observable obs = (Observable) traverser;
					ObservablePattern obsPattern = (ObservablePattern) obs.getBody();
					signature = obsPattern.getSignature();
					prefix = "Obs"+obs.getName();
				}
				if(traverser instanceof Complex) {
					Complex complex = (Complex)traverser;
					signature = complex.getSignature();
					prefix = "Complex";
				}
				if(traverser instanceof Initialisation) {
					signature = ((Initialisation) traverser).getBody().getSignature();
					prefix = "Init";
				}
				if(traverser instanceof TerminateCount) {
					TerminateCount command = (TerminateCount) traverser;
					signature = command.getSignature();
				}
				
				if(signature != null) {
					if(signature.getInstances().contains(ai)) {
						return prefix;
					}
				}
			}
			throw new RuntimeException("Illegal model definition");
		}
}
