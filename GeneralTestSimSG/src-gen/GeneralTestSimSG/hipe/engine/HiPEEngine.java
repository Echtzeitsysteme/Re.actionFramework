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
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_X_z_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_A_c_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_A_b_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_X_z_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_X_y_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_p_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_u_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_p_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_u_0_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.injectivity_116_junction;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP3;
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
		classes.put("A_b_X_zBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_X_zBound_production", "A_b_X_zBound");
		classes.put("A_b_A_cBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_A_cBound_production", "A_b_A_cBound");
		classes.put("A_b_A_bBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_A_bBound_production", "A_b_A_bBound");
		classes.put("A_c_X_zBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_c_X_zBound_production", "A_c_X_zBound");
		classes.put("A_c_X_yBound_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_c_X_yBound_production", "A_c_X_yBound");
		classes.put("simpleBinding_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBinding_production", "simpleBinding");
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
		classes.put("unspec_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspec_production", "unspec");
		classes.put("unspecTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspecTest_production", "unspecTest");
		classes.put("generic_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic_production", "generic");
		classes.put("genericWithState_production", GenericProductionActor.class);
		productionNodes2pattern.put("genericWithState_production", "genericWithState");
		classes.put("genericWithStateTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("genericWithStateTest_production", "genericWithStateTest");
		classes.put("simpleSynthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSynthesis_production", "simpleSynthesis");
		classes.put("unspecifiedStateChange_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspecifiedStateChange_production", "unspecifiedStateChange");
		classes.put("injectivity_production", GenericProductionActor.class);
		productionNodes2pattern.put("injectivity_production", "injectivity");
		classes.put("injectivityBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("injectivityBwd_production", "injectivityBwd");
		classes.put("obs_underspecTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_underspecTest_production", "obs_underspecTest");
		classes.put("obs_genericTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_genericTest_production", "obs_genericTest");
		classes.put("obs_simpleSynthesisTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_simpleSynthesisTest_production", "obs_simpleSynthesisTest");
		classes.put("obs_unspecifiedStateChangeTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_unspecifiedStateChangeTest_production", "obs_unspecifiedStateChangeTest");
		
	}
	
	public void createJunctionNodes() {
		classes.put("simpleBinding_18_junction", GenericJunctionActor.class);
		classes.put("simpleBinding_16_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_25_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_24_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_148_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_149_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_150_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_151_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBinding_33_junction", GenericJunctionActor.class);
		classes.put("selfBinding_31_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_38_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_152_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_153_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_154_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_155_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_156_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegComplete_43_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_50_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_46_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_55_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_157_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartial_158_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartial_159_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartialBwd_64_junction", GenericJunctionActor.class);
		classes.put("synthDegPartialBwd_60_junction", GenericJunctionActor.class);
		classes.put("underspec_71_junction", GenericJunctionActor.class);
		classes.put("underspec_69_junction", GenericJunctionActor.class);
		classes.put("unspec_77_junction", GenericJunctionActor.class);
		classes.put("unspecTest_80_junction", GenericJunctionActor.class);
		classes.put("unspecTest_160_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_161_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_162_nacjunction", GenericNACJunctionActor.class);
		classes.put("generic_85_junction", GenericJunctionActor.class);
		classes.put("generic_83_junction", GenericJunctionActor.class);
		classes.put("genericWithState_95_junction", GenericJunctionActor.class);
		classes.put("genericWithState_91_junction", GenericJunctionActor.class);
		classes.put("genericWithStateTest_104_junction", GenericJunctionActor.class);
		classes.put("genericWithStateTest_100_junction", GenericJunctionActor.class);
		classes.put("simpleSynthesis_108_junction", GenericJunctionActor.class);
		classes.put("simpleSynthesis_163_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleSynthesis_164_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleSynthesis_165_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecifiedStateChange_111_junction", GenericJunctionActor.class);
		classes.put("injectivity_118_junction", GenericJunctionActor.class);
		classes.put("injectivity_116_junction", injectivity_116_junction.class);
		classes.put("injectivity_166_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_167_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_168_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_169_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_170_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_123_junction", GenericJunctionActor.class);
		classes.put("injectivityBwd_121_junction", GenericJunctionActor.class);
		classes.put("injectivityBwd_171_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_172_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_173_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecTest_130_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_128_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_174_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecTest_175_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecTest_176_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_genericTest_136_junction", GenericJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("A_A_b_X_z_0_reference",A_A_b_X_z_0_reference.class);
		classes.put("A_A_b_A_c_0_reference",A_A_b_A_c_0_reference.class);
		classes.put("A_A_b_A_b_0_reference",A_A_b_A_b_0_reference.class);
		classes.put("A_A_c_X_z_0_reference",A_A_c_X_z_0_reference.class);
		classes.put("A_A_c_X_y_0_reference",A_A_c_X_y_0_reference.class);
		classes.put("X_X_z_p_0_reference",X_X_z_p_0_reference.class);
		classes.put("X_X_z_u_0_reference",X_X_z_u_0_reference.class);
		classes.put("A_A_c_p_0_reference",A_A_c_p_0_reference.class);
		classes.put("A_A_c_u_0_reference",A_A_c_u_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("A_object_SP0",A_object_SP0.class);
		classes.put("A_object_SP1",A_object_SP1.class);
		classes.put("A_object_SP2",A_object_SP2.class);
		classes.put("A_object_SP3",A_object_SP3.class);
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

