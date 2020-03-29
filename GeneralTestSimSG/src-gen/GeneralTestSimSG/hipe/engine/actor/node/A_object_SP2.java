package GeneralTestSimSG.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.network.ObjectNode;

import hipe.generic.actor.GenericObjectActor;

import hipe.generic.actor.junction.util.HiPEConfig;
		
public class A_object_SP2 extends GenericObjectActor<TestcasesModel.A> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<TestcasesModel.A>(getSelf(), name2actor.get("A_A_b_A_c_0_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<TestcasesModel.A>(getSelf(), name2actor.get("A_A_c_X_y_0_reference"), this::returnTrue));
		ports.add(new PortNodeMatchLeft<TestcasesModel.A>(getSelf(), name2actor.get("A_cFree_239_nacjunction"), this::returnTrue));
		ports.add(new PortNodeMatchLeft<TestcasesModel.A>(getSelf(), name2actor.get("selfBinding_51_junction"), this::check_constraint_1));
	}
	
	public boolean check_constraint_1(TestcasesModel.A a) {
		return a.getA_b_A_c().equals(a);
	}
	
}


