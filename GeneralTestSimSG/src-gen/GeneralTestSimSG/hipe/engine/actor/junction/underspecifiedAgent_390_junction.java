package GeneralTestSimSG.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;

import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.AbstractJunctionNode;

public class underspecifiedAgent_390_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("underspecifiedAgent_production"), this::check_constraint_70));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_70(HMatch match) {
		reactionContainer.Agent x_z_local = (reactionContainer.Agent) match.getNodes()[4];
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) match.getNodes()[2];
		TestcasesModel.A a = (TestcasesModel.A) match.getNodes()[1];
		TestcasesModel.X x = (TestcasesModel.X) match.getNodes()[3];
		boolean predicate = !a.equals(x_z_local) && !x.equals(a_b_local) && !a_b_local.equals(x_z_local);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

