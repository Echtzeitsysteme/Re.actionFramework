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

public class X_X_z_0_reference extends GenericReferenceActor<TestcasesModel.X,reactionContainer.Agent> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivityBwd_223_nacjunction"), this::check_constraint_25));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_221_nacjunction"), this::check_constraint_21));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_concreteSplitTest_233_nacjunction"), this::check_constraint_38));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_underspecTest_225_nacjunction"), this::check_constraint_30));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_wildcardTest_227_nacjunction"), this::check_constraint_32));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_xFree_237_nacjunction"), this::check_constraint_42));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBindingBwd_211_nacjunction"), this::check_constraint_8));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("unspecTest_216_nacjunction"), this::check_constraint_15));
		ports.add(new PortEdge(getSelf(), name2actor.get("x_zBound_production"), this::check_constraint_6));
	}	

	public boolean check_constraint_25(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_21(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_38(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_30(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_32(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_42(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_8(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_15(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_6(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

