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

public class T_T_j_0_reference extends GenericReferenceActor<TestcasesModel.T,reactionContainer.Agent> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdge(getSelf(), name2actor.get("t_jBound_production"), this::check_constraint_4));
	}	

	public boolean check_constraint_4(EdgeMatch edge) {
		TestcasesModel.T src = (TestcasesModel.T) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

