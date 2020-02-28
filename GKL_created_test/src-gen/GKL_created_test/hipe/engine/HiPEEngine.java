package GKL_created_test.hipe.engine;

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

import GKL_created_test.hipe.engine.actor.NotificationActor;
import GKL_created_test.hipe.engine.actor.DispatchActor;
import GKL_created_test.hipe.engine.actor.edge.T_T_x_K_a_0_reference;
import GKL_created_test.hipe.engine.actor.node.K_object;
import GKL_created_test.hipe.engine.actor.edge.T_T_x_P_a_0_reference;
import GKL_created_test.hipe.engine.actor.node.P_object;
import GKL_created_test.hipe.engine.actor.edge.T_T_y_K_a_0_reference;
import GKL_created_test.hipe.engine.actor.edge.T_T_y_P_a_0_reference;
import GKL_created_test.hipe.engine.actor.node.P_s_object;
import GKL_created_test.hipe.engine.actor.edge.T_T_x_u_0_reference;
import GKL_created_test.hipe.engine.actor.node.U_s_object;
import GKL_created_test.hipe.engine.actor.edge.T_T_y_u_0_reference;
import GKL_created_test.hipe.engine.actor.edge.T_T_x_p_0_reference;
import GKL_created_test.hipe.engine.actor.edge.T_T_y_p_0_reference;
import GKL_created_test.hipe.engine.actor.node.T_object_SP0;
import GKL_created_test.hipe.engine.actor.node.T_object_SP1;
import GKL_created_test.hipe.engine.actor.node.T_object_SP2;

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
		classes.put("T_x_K_aBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_x_K_aBoundSrc_production", "T_x_K_aBoundSrc");
		classes.put("T_x_K_aBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_x_K_aBoundTrg_production", "T_x_K_aBoundTrg");
		classes.put("T_x_P_aBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_x_P_aBoundSrc_production", "T_x_P_aBoundSrc");
		classes.put("T_x_P_aBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_x_P_aBoundTrg_production", "T_x_P_aBoundTrg");
		classes.put("T_y_K_aBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_y_K_aBoundSrc_production", "T_y_K_aBoundSrc");
		classes.put("T_y_K_aBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_y_K_aBoundTrg_production", "T_y_K_aBoundTrg");
		classes.put("T_y_P_aBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_y_P_aBoundSrc_production", "T_y_P_aBoundSrc");
		classes.put("T_y_P_aBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("T_y_P_aBoundTrg_production", "T_y_P_aBoundTrg");
		classes.put("KT_x_production", GenericProductionActor.class);
		productionNodes2pattern.put("KT_x_production", "KT_x");
		classes.put("KT_xBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("KT_xBwd_production", "KT_xBwd");
		classes.put("Tp_x_production", GenericProductionActor.class);
		productionNodes2pattern.put("Tp_x_production", "Tp_x");
		classes.put("KT_y_production", GenericProductionActor.class);
		productionNodes2pattern.put("KT_y_production", "KT_y");
		classes.put("KT_yBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("KT_yBwd_production", "KT_yBwd");
		classes.put("Tp_y_production", GenericProductionActor.class);
		productionNodes2pattern.put("Tp_y_production", "Tp_y");
		classes.put("PT_x_production", GenericProductionActor.class);
		productionNodes2pattern.put("PT_x_production", "PT_x");
		classes.put("PT_xBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("PT_xBwd_production", "PT_xBwd");
		classes.put("Tu_x_production", GenericProductionActor.class);
		productionNodes2pattern.put("Tu_x_production", "Tu_x");
		classes.put("PT_y_production", GenericProductionActor.class);
		productionNodes2pattern.put("PT_y_production", "PT_y");
		classes.put("PT_yBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("PT_yBwd_production", "PT_yBwd");
		classes.put("Tu_y_production", GenericProductionActor.class);
		productionNodes2pattern.put("Tu_y_production", "Tu_y");
		classes.put("obs_T_pp_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_T_pp_production", "obs_T_pp");
		classes.put("obs_T_pp_unbound_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_T_pp_unbound_production", "obs_T_pp_unbound");
		
	}
	
	public void createJunctionNodes() {
		classes.put("KT_x_25_junction", GenericJunctionActor.class);
		classes.put("KT_x_91_nacjunction", GenericNACJunctionActor.class);
		classes.put("KT_x_92_nacjunction", GenericNACJunctionActor.class);
		classes.put("KT_x_93_nacjunction", GenericNACJunctionActor.class);
		classes.put("KT_x_94_nacjunction", GenericNACJunctionActor.class);
		classes.put("Tp_x_33_junction", GenericJunctionActor.class);
		classes.put("Tp_x_31_junction", GenericJunctionActor.class);
		classes.put("KT_y_39_junction", GenericJunctionActor.class);
		classes.put("KT_y_95_nacjunction", GenericNACJunctionActor.class);
		classes.put("KT_y_96_nacjunction", GenericNACJunctionActor.class);
		classes.put("KT_y_97_nacjunction", GenericNACJunctionActor.class);
		classes.put("KT_y_98_nacjunction", GenericNACJunctionActor.class);
		classes.put("Tp_y_47_junction", GenericJunctionActor.class);
		classes.put("Tp_y_45_junction", GenericJunctionActor.class);
		classes.put("PT_x_53_junction", GenericJunctionActor.class);
		classes.put("PT_x_99_nacjunction", GenericNACJunctionActor.class);
		classes.put("PT_x_100_nacjunction", GenericNACJunctionActor.class);
		classes.put("PT_x_101_nacjunction", GenericNACJunctionActor.class);
		classes.put("PT_x_102_nacjunction", GenericNACJunctionActor.class);
		classes.put("Tu_x_61_junction", GenericJunctionActor.class);
		classes.put("Tu_x_59_junction", GenericJunctionActor.class);
		classes.put("PT_y_67_junction", GenericJunctionActor.class);
		classes.put("PT_y_103_nacjunction", GenericNACJunctionActor.class);
		classes.put("PT_y_104_nacjunction", GenericNACJunctionActor.class);
		classes.put("PT_y_105_nacjunction", GenericNACJunctionActor.class);
		classes.put("PT_y_106_nacjunction", GenericNACJunctionActor.class);
		classes.put("Tu_y_75_junction", GenericJunctionActor.class);
		classes.put("Tu_y_73_junction", GenericJunctionActor.class);
		classes.put("obs_T_pp_81_junction", GenericJunctionActor.class);
		classes.put("obs_T_pp_unbound_86_junction", GenericJunctionActor.class);
		classes.put("obs_T_pp_unbound_107_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_T_pp_unbound_108_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_T_pp_unbound_109_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_T_pp_unbound_110_nacjunction", GenericNACJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("T_T_x_K_a_0_reference",T_T_x_K_a_0_reference.class);
		classes.put("T_T_x_P_a_0_reference",T_T_x_P_a_0_reference.class);
		classes.put("T_T_y_K_a_0_reference",T_T_y_K_a_0_reference.class);
		classes.put("T_T_y_P_a_0_reference",T_T_y_P_a_0_reference.class);
		classes.put("T_T_x_u_0_reference",T_T_x_u_0_reference.class);
		classes.put("T_T_y_u_0_reference",T_T_y_u_0_reference.class);
		classes.put("T_T_x_p_0_reference",T_T_x_p_0_reference.class);
		classes.put("T_T_y_p_0_reference",T_T_y_p_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("K_object",K_object.class);
		classes.put("P_object",P_object.class);
		classes.put("P_s_object",P_s_object.class);
		classes.put("U_s_object",U_s_object.class);
		classes.put("T_object_SP0",T_object_SP0.class);
		classes.put("T_object_SP1",T_object_SP1.class);
		classes.put("T_object_SP2",T_object_SP2.class);
		
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

