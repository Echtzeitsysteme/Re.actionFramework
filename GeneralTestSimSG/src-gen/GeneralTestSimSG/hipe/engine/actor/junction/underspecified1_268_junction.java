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

public class underspecified1_268_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("underspecified1_production"), this::check_constraint_47));
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
	
	public boolean check_constraint_47(HMatch match) {
		TestcasesModel.A a = (TestcasesModel.A) match.getNodes()[0];
		reactionContainer.Agent x_z_local = (reactionContainer.Agent) match.getNodes()[5];
		reactionContainer.Agent a_c_local = (reactionContainer.Agent) match.getNodes()[2];
		TestcasesModel.X x = (TestcasesModel.X) match.getNodes()[3];
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) match.getNodes()[1];
		reactionContainer.Agent x_y_local = (reactionContainer.Agent) match.getNodes()[4];
		boolean predicate = !a.equals(x_y_local) && !a.equals(x_z_local) && !x.equals(a_b_local) && !x.equals(a_c_local) && !a_b_local.equals(x_y_local) && !a_b_local.equals(x_z_local) && !a_c_local.equals(x_y_local) && !a_c_local.equals(x_z_local);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}
