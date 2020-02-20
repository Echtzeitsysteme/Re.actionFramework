package GeneralTestSimSG.hipe.engine;

import org.eclipse.emf.common.notify.Notification;


import java.lang.Thread;
import java.time.Duration;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import static akka.pattern.Patterns.ask;

import GeneralTestSimSG.hipe.engine.actor.NotificationActor;
import GeneralTestSimSG.hipe.engine.actor.DispatchActor;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.T_T_i_0_reference;
import GeneralTestSimSG.hipe.engine.actor.node.T_object;
import GeneralTestSimSG.hipe.engine.actor.edge.T_T_j_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_y_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_p_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_1_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_1_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_u_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_p_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_u_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_1_reference;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP3;
import GeneralTestSimSG.hipe.engine.actor.node.Agent_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.Agent_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.U_s_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.U_s_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP1;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitActor;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;
import hipe.engine.message.ExtractData;
import hipe.engine.message.production.ProductionResult;

import hipe.engine.util.IncUtil;
import hipe.engine.util.ProductionUtil;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine implements IHiPEEngine{

	private final ActorSystem system = ActorSystem.create("HiPE-Engine");
	private ActorRef dispatcher;
	private ActorRef notificationActor;
	private Map<String, ActorRef> name2actor = new ConcurrentHashMap<>();
	private Map<String, Class<?>> classes = new ConcurrentHashMap<>();
	private Map<String, String> productionNodes2pattern = new ConcurrentHashMap<>();
	private boolean dirty = false;
	private HiPENetwork network;
	
	private IncUtil iUtil = IncUtil.getUtil();
	private ProductionUtil pUtil = ProductionUtil.getUtil();
	
	private Thread thread;
	
	public HiPEEngine(HiPENetwork network) {
		thread = Thread.currentThread();
		iUtil.registerWakeUpCall(this::wakeUp);
		
		this.network = network;
	}
	
	public boolean wakeUp() {
		thread.interrupt();
		return true;
	}
	
	public void initialize() throws InterruptedException {
		createProductionNodes();
		createJunctionNodes();
		createReferenceNodes();
		createObjectNodes();

		classes.keySet().parallelStream().forEach(name -> {
			name2actor.put(name, system.actorOf(Props.create(classes.get(name))));			
		});
		
		dispatcher = system.actorOf(
				Props.create(DispatchActor.class, () -> new DispatchActor(name2actor)),
				"DispatchActor");
		
		notificationActor = system.actorOf(Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher)), "NotificationActor");
		
		name2actor.values().forEach(actor -> actor.tell(new InitActor(name2actor), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof AbstractJunctionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ProductionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		}
	
	public void createProductionNodes() {
		classes.put("a_bBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("a_bBound_production", "a_bBound");
		classes.put("a_cBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("a_cBound_production", "a_cBound");
		classes.put("t_iBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("t_iBound_production", "t_iBound");
		classes.put("t_jBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("t_jBound_production", "t_jBound");
		classes.put("x_yBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("x_yBound_production", "x_yBound");
		classes.put("x_zBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("x_zBound_production", "x_zBound");
		classes.put("simpleBinding_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBinding_production", "simpleBinding");
		classes.put("conditionPattern_Ab_to_Xz_state_u_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ab_to_Xz_state_u_production", "conditionPattern_Ab_to_Xz_state_u");
		classes.put("conditionPattern_Xz_to_Ab_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Xz_to_Ab_production", "conditionPattern_Xz_to_Ab");
		classes.put("simpleBindingBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBindingBwd_production", "simpleBindingBwd");
		classes.put("selfBinding_production", GenericProductionActor.class);
		productionNodes2pattern.put("selfBinding_production", "selfBinding");
		classes.put("selfBindingBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("selfBindingBwd_production", "selfBindingBwd");
		classes.put("synthDegComplete_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthDegComplete_production", "synthDegComplete");
		classes.put("synthDegCompleteBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthDegCompleteBwd_production", "synthDegCompleteBwd");
		classes.put("synthDegPartial_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthDegPartial_production", "synthDegPartial");
		classes.put("synthDegPartialBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthDegPartialBwd_production", "synthDegPartialBwd");
		classes.put("underspec_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspec_production", "underspec");
		classes.put("underspecTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecTest_production", "underspecTest");
		classes.put("unspec_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspec_production", "unspec");
		classes.put("unspecTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspecTest_production", "unspecTest");
		classes.put("generic_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic_production", "generic");
		classes.put("genericTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("genericTest_production", "genericTest");
		classes.put("genericWithState_production", GenericProductionActor.class);
		productionNodes2pattern.put("genericWithState_production", "genericWithState");
		classes.put("genericWithStateTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("genericWithStateTest_production", "genericWithStateTest");
		
	}
	
	public void createJunctionNodes() {
		classes.put("simpleBinding_25_junction", GenericJunctionActor.class);
		classes.put("simpleBinding_21_junction", GenericJunctionActor.class);
		classes.put("simpleBinding_19_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ab_to_Xz_state_u_33_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ab_to_Xz_state_u_29_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Xz_to_Ab_37_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_43_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_42_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_129_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_130_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBinding_50_junction", GenericJunctionActor.class);
		classes.put("selfBinding_57_junction", GenericJunctionActor.class);
		classes.put("selfBinding_53_junction", GenericJunctionActor.class);
		classes.put("selfBinding_49_junction", GenericJunctionActor.class);
		classes.put("selfBinding_131_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBinding_132_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_61_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_66_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_60_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_133_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_134_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegComplete_69_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_73_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_79_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_72_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_83_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_135_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartialBwd_89_junction", GenericJunctionActor.class);
		classes.put("synthDegPartialBwd_95_junction", GenericJunctionActor.class);
		classes.put("synthDegPartialBwd_88_junction", GenericJunctionActor.class);
		classes.put("underspec_101_junction", GenericJunctionActor.class);
		classes.put("underspec_99_junction", GenericJunctionActor.class);
		classes.put("underspecTest_136_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_111_junction", GenericJunctionActor.class);
		classes.put("unspecTest_137_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_138_nacjunction", GenericNACJunctionActor.class);
		classes.put("generic_114_junction", GenericJunctionActor.class);
		classes.put("genericTest_139_nacjunction", GenericNACJunctionActor.class);
		classes.put("genericWithState_124_junction", GenericJunctionActor.class);
		classes.put("genericWithState_120_junction", GenericJunctionActor.class);
		classes.put("genericWithStateTest_140_nacjunction", GenericNACJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("A_A_b_0_reference",A_A_b_0_reference.class);
		classes.put("A_A_c_0_reference",A_A_c_0_reference.class);
		classes.put("T_T_i_0_reference",T_T_i_0_reference.class);
		classes.put("T_T_j_0_reference",T_T_j_0_reference.class);
		classes.put("X_X_y_0_reference",X_X_y_0_reference.class);
		classes.put("X_X_z_0_reference",X_X_z_0_reference.class);
		classes.put("X_X_z_p_0_reference",X_X_z_p_0_reference.class);
		classes.put("A_A_b_1_reference",A_A_b_1_reference.class);
		classes.put("X_X_z_1_reference",X_X_z_1_reference.class);
		classes.put("X_X_z_u_0_reference",X_X_z_u_0_reference.class);
		classes.put("A_A_c_p_0_reference",A_A_c_p_0_reference.class);
		classes.put("A_A_c_u_0_reference",A_A_c_u_0_reference.class);
		classes.put("A_A_c_1_reference",A_A_c_1_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("T_object",T_object.class);
		classes.put("A_object_SP0",A_object_SP0.class);
		classes.put("A_object_SP1",A_object_SP1.class);
		classes.put("A_object_SP2",A_object_SP2.class);
		classes.put("A_object_SP3",A_object_SP3.class);
		classes.put("Agent_object_SP0",Agent_object_SP0.class);
		classes.put("Agent_object_SP1",Agent_object_SP1.class);
		classes.put("X_object_SP0",X_object_SP0.class);
		classes.put("X_object_SP1",X_object_SP1.class);
		classes.put("X_object_SP2",X_object_SP2.class);
		classes.put("U_s_object_SP0",U_s_object_SP0.class);
		classes.put("U_s_object_SP1",U_s_object_SP1.class);
		classes.put("P_s_object_SP0",P_s_object_SP0.class);
		classes.put("P_s_object_SP1",P_s_object_SP1.class);
		
	}

	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */			
	public void handleNotification(Notification notification) {
		try {
			dirty = true;
			ask(notificationActor, new NotificationMessage(notification), Duration.ofHours(24)).toCompletableFuture().get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}			
	}
	
	public Map<String, ProductionResult> extractData() throws InterruptedException {
		if(!dirty) {
			return java.util.Collections.synchronizedMap(new HashMap<>());
		}	
		dirty = false;
		
		iUtil.clean();
		pUtil.clean();
			
		notificationActor.tell(new NoMoreInput(), notificationActor);
		
		try {
			Thread.sleep(100000000);
		} catch(Exception e) {
		}
		
		return pUtil.getProductionResults();
	}
	
	public void terminate() {
		system.terminate();	
	}
}

