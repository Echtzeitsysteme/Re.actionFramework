package GKL_created_test.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.engine.message.HiPEMessage;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.InitActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.node.NodeAddedLeft;
import hipe.engine.message.node.NodeDeletedLeft;
import hipe.engine.message.node.NodeAddedRight;
import hipe.engine.message.node.NodeDeletedRight;
import hipe.engine.message.junction.MatchAddedLeft;
import hipe.engine.message.junction.MatchAddedRight;
import hipe.engine.message.junction.MatchDeletedLeft;
import hipe.engine.message.junction.MatchDeletedRight;
		
public class T_object_SP0 extends AbstractActor {
	
	private List<Port<GKLModel.T>> ports;		
		
	public T_object_SP0() {
	}

	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortNodeMatchRight<GKLModel.T>(getSelf(), name2actor.get("PT_x_41_junction"), this::returnTrue));
		ports.add(new PortNodeLeft<GKLModel.T>(getSelf(), name2actor.get("T_T_x_0_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<GKLModel.T>(getSelf(), name2actor.get("T_T_x_u_0_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<GKLModel.T>(getSelf(), name2actor.get("T_T_y_p_0_reference"), this::returnTrue));
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(HiPEMessage.class, this::distributeMessage)
				.build();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void distributeMessage(HiPEMessage msg) {
		switch(msg.getType()) {
		case InitActor :
			initActor((InitActor)msg);
			return;
		case AttributeChanged :
			changeAttribute((AttributeChanged)msg);
			return;
		case ObjectAdded :
			addNode((ObjectAdded)msg);
			return;
		case ObjectDeleted :
			removeNode((ObjectDeleted)msg);
			return;
		case ReferenceAdded :
			addEdge((ReferenceAdded)msg);
			return;
		case ReferenceDeleted :
			removeEdge((ReferenceDeleted)msg);
			return;
		default:
			break;
		}
	}
	
	private void addEdge(ReferenceAdded message) {
		message.edgeActor.tell(message, getSelf());
	}
	
	private void removeEdge(ReferenceDeleted message) {
		message.edgeActor.tell(message, getSelf());
	}
	
	private void addNode(ObjectAdded<GKLModel.T> message) {
		for(Port<GKLModel.T> port : ports) {
			port.sendAdd(message, message.node);
		}
		message.initialMessage.decrement();
	}
	
	private void removeNode(ObjectDeleted<GKLModel.T> message) {
		for(Port<GKLModel.T> port : ports) {
			port.sendRemove(message, message.node);
		}		
		message.initialMessage.decrement();
	}
	
	private void changeAttribute(AttributeChanged<GKLModel.T> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		for(Port<GKLModel.T> port : ports) {
			port.sendAttributeChanged(message, message.node);
		}
		message.initialMessage.decrement();
	}
	
	private boolean returnTrue(Object o) {
		return true;
	}
	
}


