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

public class X_X_y_0_reference extends GenericReferenceActor<TestcasesModel.X,reactionContainer.Agent> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivityBwd_222_nacjunction"), this::check_constraint_24));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_220_nacjunction"), this::check_constraint_20));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_concreteSplitTest_232_nacjunction"), this::check_constraint_37));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_underspecTest_224_nacjunction"), this::check_constraint_29));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_wildcardTest_226_nacjunction"), this::check_constraint_31));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_xFree_236_nacjunction"), this::check_constraint_41));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("unspecTest_215_nacjunction"), this::check_constraint_14));
		ports.add(new PortEdge(getSelf(), name2actor.get("x_yBound_production"), this::check_constraint_5));
	}	

	public boolean check_constraint_24(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_20(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_37(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_29(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_31(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_41(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_14(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_5(EdgeMatch edge) {
		TestcasesModel.X src = (TestcasesModel.X) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

