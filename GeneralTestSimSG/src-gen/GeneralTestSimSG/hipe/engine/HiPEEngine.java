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
import GeneralTestSimSG.hipe.engine.actor.edge.T_T_j_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_y_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_0_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.injectivity_134_junction;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_2_reference;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP1;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitActor;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.InitGenReferenceActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;
import hipe.engine.message.ExtractData;
import hipe.engine.message.production.ProductionResult;

import hipe.engine.util.IncUtil;
import hipe.engine.util.ProductionUtil;
import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine implements IHiPEEngine{

	private final ActorSystem system = ActorSystem.create("HiPE-Engine");
	private ActorRef dispatcher;
	private ActorRef notificationActor;

	private Map<String, NetworkNode> name2node = new HashMap<>();
	
	private Map<String, ActorRef> name2actor = new ConcurrentHashMap<>();
	private Map<String, InitGenReferenceActor<?,?>> name2initRefGen = new ConcurrentHashMap<>();
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
		network.getNetworknode().stream().forEach(n -> name2node.put(n.getName(), n));
		
		createProductionNodes();
		createJunctionNodes();
		createReferenceNodes();
		createObjectNodes();

		initializeReferenceNodes();

		classes.keySet().parallelStream().forEach(name -> {
			name2actor.put(name, system.actorOf(Props.create(classes.get(name))));			
		});
		
		dispatcher = system.actorOf(
				Props.create(DispatchActor.class, () -> new DispatchActor(name2actor)),
				"DispatchActor");
		
		notificationActor = system.actorOf(Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher)), "NotificationActor");
		
		name2actor.values().forEach(actor -> actor.tell(new InitActor(name2actor), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ObjectNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ReferenceNode).forEach(n -> name2actor.get(n.getName()).tell(name2initRefGen.get(n.getName()), notificationActor));
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
		classes.put("wildcard_production", GenericProductionActor.class);
		productionNodes2pattern.put("wildcard_production", "wildcard");
		classes.put("wildcardStateChange_production", GenericProductionActor.class);
		productionNodes2pattern.put("wildcardStateChange_production", "wildcardStateChange");
		classes.put("wildcardStateChangeBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("wildcardStateChangeBwd_production", "wildcardStateChangeBwd");
		classes.put("degUnspecific_production", GenericProductionActor.class);
		productionNodes2pattern.put("degUnspecific_production", "degUnspecific");
		classes.put("underspecSynth_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecSynth_production", "underspecSynth");
		classes.put("concreteSplit_production", GenericProductionActor.class);
		productionNodes2pattern.put("concreteSplit_production", "concreteSplit");
		classes.put("obs_underspecTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_underspecTest_production", "obs_underspecTest");
		classes.put("obs_genericTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_genericTest_production", "obs_genericTest");
		classes.put("obs_simpleSynthesisTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_simpleSynthesisTest_production", "obs_simpleSynthesisTest");
		classes.put("obs_unspecifiedStateChangeTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_unspecifiedStateChangeTest_production", "obs_unspecifiedStateChangeTest");
		classes.put("obs_wildcardTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_wildcardTest_production", "obs_wildcardTest");
		classes.put("obs_underspecSynthTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_underspecSynthTest_production", "obs_underspecSynthTest");
		classes.put("obs_concreteSplitTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_concreteSplitTest_production", "obs_concreteSplitTest");
		classes.put("obs_aFree_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_aFree_production", "obs_aFree");
		classes.put("obs_xFree_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_xFree_production", "obs_xFree");
		classes.put("obs_ax_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_ax_production", "obs_ax");
		
	}
	
	public void createJunctionNodes() {
		classes.put("simpleBinding_23_junction", GenericJunctionActor.class);
		classes.put("simpleBinding_21_junction", GenericJunctionActor.class);
		classes.put("simpleBinding_19_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_30_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_29_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_210_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_211_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBinding_40_junction", GenericJunctionActor.class);
		classes.put("selfBinding_38_junction", GenericJunctionActor.class);
		classes.put("selfBinding_36_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_45_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_212_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_213_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegComplete_50_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_54_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_55_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_53_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_64_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_214_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartialBwd_70_junction", GenericJunctionActor.class);
		classes.put("synthDegPartialBwd_71_junction", GenericJunctionActor.class);
		classes.put("synthDegPartialBwd_69_junction", GenericJunctionActor.class);
		classes.put("underspec_84_junction", GenericJunctionActor.class);
		classes.put("underspec_82_junction", GenericJunctionActor.class);
		classes.put("underspec_80_junction", GenericJunctionActor.class);
		classes.put("unspec_90_junction", GenericJunctionActor.class);
		classes.put("unspecTest_93_junction", GenericJunctionActor.class);
		classes.put("unspecTest_215_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_216_nacjunction", GenericNACJunctionActor.class);
		classes.put("generic_100_junction", GenericJunctionActor.class);
		classes.put("generic_98_junction", GenericJunctionActor.class);
		classes.put("generic_96_junction", GenericJunctionActor.class);
		classes.put("genericWithState_107_junction", GenericJunctionActor.class);
		classes.put("genericWithState_108_junction", GenericJunctionActor.class);
		classes.put("genericWithState_106_junction", GenericJunctionActor.class);
		classes.put("genericWithStateTest_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("genericWithStateTest_117_junction", GenericJunctionActor.class);
		classes.put("simpleSynthesis_126_junction", GenericJunctionActor.class);
		classes.put("simpleSynthesis_217_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecifiedStateChange_129_junction", GenericJunctionActor.class);
		classes.put("injectivity_136_junction", GenericJunctionActor.class);
		classes.put("injectivity_134_junction", injectivity_134_junction.class);
		classes.put("injectivity_218_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_219_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_220_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_221_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_141_junction", GenericJunctionActor.class);
		classes.put("injectivityBwd_139_junction", GenericJunctionActor.class);
		classes.put("injectivityBwd_222_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_223_nacjunction", GenericNACJunctionActor.class);
		classes.put("wildcard_146_junction", GenericJunctionActor.class);
		classes.put("wildcardStateChange_153_junction", GenericJunctionActor.class);
		classes.put("wildcardStateChange_151_junction", GenericJunctionActor.class);
		classes.put("wildcardStateChangeBwd_161_junction", GenericJunctionActor.class);
		classes.put("wildcardStateChangeBwd_159_junction", GenericJunctionActor.class);
		classes.put("concreteSplit_169_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_178_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_176_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_174_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_224_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecTest_225_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_genericTest_186_junction", GenericJunctionActor.class);
		classes.put("obs_genericTest_184_junction", GenericJunctionActor.class);
		classes.put("obs_wildcardTest_226_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_wildcardTest_227_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_228_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_229_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_202_junction", GenericJunctionActor.class);
		classes.put("obs_concreteSplitTest_230_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_231_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_232_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_233_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_aFree_234_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_aFree_235_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_xFree_236_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_xFree_237_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_ax_207_junction", GenericJunctionActor.class);
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
		classes.put("X_X_y_1_reference",X_X_y_1_reference.class);
		classes.put("A_A_b_2_reference",A_A_b_2_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("T_object",T_object.class);
		classes.put("A_object_SP0",A_object_SP0.class);
		classes.put("A_object_SP1",A_object_SP1.class);
		classes.put("A_object_SP2",A_object_SP2.class);
		classes.put("A_object_SP3",A_object_SP3.class);
		classes.put("A_object_SP4",A_object_SP4.class);
		classes.put("A_object_SP5",A_object_SP5.class);
		classes.put("Agent_object_SP0",Agent_object_SP0.class);
		classes.put("Agent_object_SP1",Agent_object_SP1.class);
		classes.put("X_object_SP0",X_object_SP0.class);
		classes.put("X_object_SP1",X_object_SP1.class);
		classes.put("X_object_SP2",X_object_SP2.class);
		classes.put("X_object_SP3",X_object_SP3.class);
		classes.put("U_s_object_SP0",U_s_object_SP0.class);
		classes.put("U_s_object_SP1",U_s_object_SP1.class);
		classes.put("U_s_object_SP2",U_s_object_SP2.class);
		classes.put("P_s_object_SP0",P_s_object_SP0.class);
		classes.put("P_s_object_SP1",P_s_object_SP1.class);
		classes.put("P_s_object_SP2",P_s_object_SP2.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("A_A_b_0_reference", new InitGenReferenceActor<TestcasesModel.A,reactionContainer.Agent>(name2actor, name2node.get("A_A_b_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_b(), null, false));
		name2initRefGen.put("A_A_c_0_reference", new InitGenReferenceActor<TestcasesModel.A,reactionContainer.Agent>(name2actor, name2node.get("A_A_c_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c(), null, false));
		name2initRefGen.put("T_T_i_0_reference", new InitGenReferenceActor<TestcasesModel.T,reactionContainer.Agent>(name2actor, name2node.get("T_T_i_0_reference"), (o) -> o instanceof TestcasesModel.T, (o) -> o.getT_i(), null, false));
		name2initRefGen.put("T_T_j_0_reference", new InitGenReferenceActor<TestcasesModel.T,reactionContainer.Agent>(name2actor, name2node.get("T_T_j_0_reference"), (o) -> o instanceof TestcasesModel.T, (o) -> o.getT_j(), null, false));
		name2initRefGen.put("X_X_y_0_reference", new InitGenReferenceActor<TestcasesModel.X,reactionContainer.Agent>(name2actor, name2node.get("X_X_y_0_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_y(), null, false));
		name2initRefGen.put("X_X_z_0_reference", new InitGenReferenceActor<TestcasesModel.X,reactionContainer.Agent>(name2actor, name2node.get("X_X_z_0_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_z(), null, false));
		name2initRefGen.put("X_X_z_p_0_reference", new InitGenReferenceActor<TestcasesModel.X,TestcasesModel.P_s>(name2actor, name2node.get("X_X_z_p_0_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_z_p(), null, false));
		name2initRefGen.put("A_A_b_1_reference", new InitGenReferenceActor<TestcasesModel.A,reactionContainer.Agent>(name2actor, name2node.get("A_A_b_1_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_b(), null, false));
		name2initRefGen.put("X_X_z_1_reference", new InitGenReferenceActor<TestcasesModel.X,reactionContainer.Agent>(name2actor, name2node.get("X_X_z_1_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_z(), null, false));
		name2initRefGen.put("X_X_z_u_0_reference", new InitGenReferenceActor<TestcasesModel.X,TestcasesModel.U_s>(name2actor, name2node.get("X_X_z_u_0_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_z_u(), null, false));
		name2initRefGen.put("A_A_c_p_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.P_s>(name2actor, name2node.get("A_A_c_p_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c_p(), null, false));
		name2initRefGen.put("A_A_c_u_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.U_s>(name2actor, name2node.get("A_A_c_u_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c_u(), null, false));
		name2initRefGen.put("A_A_c_1_reference", new InitGenReferenceActor<TestcasesModel.A,reactionContainer.Agent>(name2actor, name2node.get("A_A_c_1_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c(), null, false));
		name2initRefGen.put("X_X_y_1_reference", new InitGenReferenceActor<TestcasesModel.X,reactionContainer.Agent>(name2actor, name2node.get("X_X_y_1_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_y(), null, false));
		name2initRefGen.put("A_A_b_2_reference", new InitGenReferenceActor<TestcasesModel.A,reactionContainer.Agent>(name2actor, name2node.get("A_A_b_2_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_b(), null, false));
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

class T_object extends GenericObjectActor<TestcasesModel.T> { }
class A_object_SP2 extends GenericObjectActor<TestcasesModel.A> { }
class A_object_SP3 extends GenericObjectActor<TestcasesModel.A> { }
class A_object_SP4 extends GenericObjectActor<TestcasesModel.A> { }
class A_object_SP5 extends GenericObjectActor<TestcasesModel.A> { }
class Agent_object_SP0 extends GenericObjectActor<reactionContainer.Agent> { }
class Agent_object_SP1 extends GenericObjectActor<reactionContainer.Agent> { }
class X_object_SP0 extends GenericObjectActor<TestcasesModel.X> { }
class X_object_SP1 extends GenericObjectActor<TestcasesModel.X> { }
class X_object_SP2 extends GenericObjectActor<TestcasesModel.X> { }
class X_object_SP3 extends GenericObjectActor<TestcasesModel.X> { }
class U_s_object_SP0 extends GenericObjectActor<TestcasesModel.U_s> { }
class U_s_object_SP1 extends GenericObjectActor<TestcasesModel.U_s> { }
class U_s_object_SP2 extends GenericObjectActor<TestcasesModel.U_s> { }
class P_s_object_SP0 extends GenericObjectActor<TestcasesModel.P_s> { }
class P_s_object_SP1 extends GenericObjectActor<TestcasesModel.P_s> { }
class P_s_object_SP2 extends GenericObjectActor<TestcasesModel.P_s> { }

class X_X_z_p_0_reference extends GenericReferenceActor<TestcasesModel.X, TestcasesModel.P_s> { }
class A_A_b_1_reference extends GenericReferenceActor<TestcasesModel.A, reactionContainer.Agent> { }
class X_X_z_1_reference extends GenericReferenceActor<TestcasesModel.X, reactionContainer.Agent> { }
class X_X_z_u_0_reference extends GenericReferenceActor<TestcasesModel.X, TestcasesModel.U_s> { }
class A_A_c_p_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.P_s> { }
class A_A_c_u_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.U_s> { }
class A_A_c_1_reference extends GenericReferenceActor<TestcasesModel.A, reactionContainer.Agent> { }
class X_X_y_1_reference extends GenericReferenceActor<TestcasesModel.X, reactionContainer.Agent> { }

