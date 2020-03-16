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

public class A_A_c_0_reference extends GenericReferenceActor<TestcasesModel.A,reactionContainer.Agent> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdge(getSelf(), name2actor.get("a_cBound_production"), this::check_constraint_2));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_aFree_235_nacjunction"), this::check_constraint_40));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_concreteSplitTest_231_nacjunction"), this::check_constraint_36));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_underspecSynthTest_229_nacjunction"), this::check_constraint_34));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("selfBindingBwd_213_nacjunction"), this::check_constraint_12));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("synthDegPartial_214_nacjunction"), this::check_constraint_13));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("wildcardStateChangeBwd_161_junction"), this::check_constraint_28));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("wildcardStateChange_153_junction"), this::check_constraint_27));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("wildcard_146_junction"), this::check_constraint_26));
	}	

	public boolean check_constraint_2(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_40(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_36(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_34(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_12(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_13(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_28(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_c_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_c_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_27(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_c_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_c_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_26(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_c_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_c_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

