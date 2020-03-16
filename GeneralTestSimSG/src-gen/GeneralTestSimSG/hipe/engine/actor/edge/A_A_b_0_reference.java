package GeneralTestSimSG.hipe.engine.actor.edge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import hipe.engine.util.HiPESet;
import hipe.engine.actor.Port;
import hipe.engine.match.EdgeMatch;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.actor.edge.PortEdge;
import hipe.engine.actor.edge.PortEdgeLeft;
import hipe.engine.actor.edge.PortEdgeRight;

import hipe.network.ReferenceNode;

import hipe.generic.actor.GenericReferenceActor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

public class A_A_b_0_reference extends GenericReferenceActor<TestcasesModel.A,reactionContainer.Agent> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdge(getSelf(), name2actor.get("a_bBound_production"), this::check_constraint_1));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_218_nacjunction"), this::check_constraint_18));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_219_nacjunction"), this::check_constraint_19));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_aFree_234_nacjunction"), this::check_constraint_39));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_concreteSplitTest_230_nacjunction"), this::check_constraint_35));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_underspecSynthTest_228_nacjunction"), this::check_constraint_33));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("selfBindingBwd_212_nacjunction"), this::check_constraint_11));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBindingBwd_210_nacjunction"), this::check_constraint_7));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleSynthesis_217_nacjunction"), this::check_constraint_16));
	}	

	public boolean check_constraint_1(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_18(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_19(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_39(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_35(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_33(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_11(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_7(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_16(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

