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

public class A_A_b_A_b_0_reference extends GenericReferenceActor<TestcasesModel.A,TestcasesModel.A> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdge(getSelf(), name2actor.get("A_b_A_bBoundSrc_production"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("A_b_A_bBoundTrg_production"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("injectivityBwd_145_junction"), this::check_constraint_3));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivityBwd_145_junction"), this::check_constraint_4));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_232_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_234_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_237_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("injectivity_239_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_aFree_284_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_aFree_286_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_concreteSplitTest_272_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_concreteSplitTest_274_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_underspecSynthTest_264_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("obs_underspecSynthTest_266_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("selfBindingBwd_212_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("selfBindingBwd_214_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBindingBwd_205_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBindingBwd_207_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleSynthesis_227_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleSynthesis_229_nacjunction"), this::returnTrue));
	}	

	public boolean check_constraint_3(EdgeMatch edge) {
		TestcasesModel.A a1 = (TestcasesModel.A) edge.source();
		TestcasesModel.A a2 = (TestcasesModel.A) edge.target();
		boolean predicate = !a1.equals(a2);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_4(EdgeMatch edge) {
		TestcasesModel.A a2 = (TestcasesModel.A) edge.source();
		TestcasesModel.A a1 = (TestcasesModel.A) edge.target();
		boolean predicate = !a1.equals(a2);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

