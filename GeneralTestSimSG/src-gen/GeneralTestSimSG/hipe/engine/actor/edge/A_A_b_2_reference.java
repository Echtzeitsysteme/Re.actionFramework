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

public class A_A_b_2_reference extends GenericReferenceActor<TestcasesModel.A,reactionContainer.Agent> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("injectivityBwd_141_junction"), this::check_constraint_22));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivityBwd_141_junction"), this::check_constraint_23));
	}	

	public boolean check_constraint_22(EdgeMatch edge) {
		TestcasesModel.A a1 = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a2 = (reactionContainer.Agent) edge.target();
		boolean predicate = !a1.equals(a2);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_23(EdgeMatch edge) {
		TestcasesModel.A a2 = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a1 = (reactionContainer.Agent) edge.target();
		boolean predicate = !a1.equals(a2);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

