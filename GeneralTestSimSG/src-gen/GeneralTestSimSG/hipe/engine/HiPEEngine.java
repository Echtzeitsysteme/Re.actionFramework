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
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_A_b_0_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.injectivity_138_junction;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP4;

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
		classes.put("A_b_X_zBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_X_zBoundSrc_production", "A_b_X_zBoundSrc");
		classes.put("A_b_X_zBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_X_zBoundTrg_production", "A_b_X_zBoundTrg");
		classes.put("A_b_A_cBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_A_cBoundSrc_production", "A_b_A_cBoundSrc");
		classes.put("A_b_A_cBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_A_cBoundTrg_production", "A_b_A_cBoundTrg");
		classes.put("A_b_A_bBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_A_bBoundSrc_production", "A_b_A_bBoundSrc");
		classes.put("A_b_A_bBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_A_bBoundTrg_production", "A_b_A_bBoundTrg");
		classes.put("A_b_X_yBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_X_yBoundSrc_production", "A_b_X_yBoundSrc");
		classes.put("A_b_X_yBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_b_X_yBoundTrg_production", "A_b_X_yBoundTrg");
		classes.put("A_c_X_zBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_c_X_zBoundSrc_production", "A_c_X_zBoundSrc");
		classes.put("A_c_X_zBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_c_X_zBoundTrg_production", "A_c_X_zBoundTrg");
		classes.put("A_c_X_yBoundSrc_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_c_X_yBoundSrc_production", "A_c_X_yBoundSrc");
		classes.put("A_c_X_yBoundTrg_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_c_X_yBoundTrg_production", "A_c_X_yBoundTrg");
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
		classes.put("A_cFree_production", GenericProductionActor.class);
		productionNodes2pattern.put("A_cFree_production", "A_cFree");
		classes.put("wildcard_production", GenericProductionActor.class);
		productionNodes2pattern.put("wildcard_production", "wildcard");
		classes.put("wildcardStateChange_production", GenericProductionActor.class);
		productionNodes2pattern.put("wildcardStateChange_production", "wildcardStateChange");
		classes.put("wildcardStateChangeBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("wildcardStateChangeBwd_production", "wildcardStateChangeBwd");
		classes.put("degUnspecific_production", GenericProductionActor.class);
		productionNodes2pattern.put("degUnspecific_production", "degUnspecific");
		classes.put("concreteSplit_production", GenericProductionActor.class);
		productionNodes2pattern.put("concreteSplit_production", "concreteSplit");
		classes.put("underspecSynth_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecSynth_production", "underspecSynth");
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
		classes.put("obs_concreteSplitTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_concreteSplitTest_production", "obs_concreteSplitTest");
		classes.put("obs_underspecSynthTest_production", GenericProductionActor.class);
		productionNodes2pattern.put("obs_underspecSynthTest_production", "obs_underspecSynthTest");
		
	}
	
	public void createJunctionNodes() {
		classes.put("simpleBinding_39_junction", GenericJunctionActor.class);
		classes.put("simpleBinding_37_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_46_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_45_junction", GenericJunctionActor.class);
		classes.put("simpleBindingBwd_198_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_199_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_200_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_201_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_202_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_203_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBindingBwd_204_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBinding_54_junction", GenericJunctionActor.class);
		classes.put("selfBinding_52_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_59_junction", GenericJunctionActor.class);
		classes.put("selfBindingBwd_205_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_206_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_207_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_208_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_209_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_210_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_211_nacjunction", GenericNACJunctionActor.class);
		classes.put("selfBindingBwd_212_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegComplete_66_junction", GenericJunctionActor.class);
		classes.put("synthDegComplete_64_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_71_junction", GenericJunctionActor.class);
		classes.put("synthDegCompleteBwd_69_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_78_junction", GenericJunctionActor.class);
		classes.put("synthDegPartial_213_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartial_214_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartial_215_nacjunction", GenericNACJunctionActor.class);
		classes.put("synthDegPartialBwd_85_junction", GenericJunctionActor.class);
		classes.put("synthDegPartialBwd_83_junction", GenericJunctionActor.class);
		classes.put("underspec_94_junction", GenericJunctionActor.class);
		classes.put("underspec_92_junction", GenericJunctionActor.class);
		classes.put("unspec_100_junction", GenericJunctionActor.class);
		classes.put("unspecTest_103_junction", GenericJunctionActor.class);
		classes.put("unspecTest_216_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_217_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_218_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecTest_219_nacjunction", GenericNACJunctionActor.class);
		classes.put("generic_108_junction", GenericJunctionActor.class);
		classes.put("generic_106_junction", GenericJunctionActor.class);
		classes.put("genericWithState_116_junction", GenericJunctionActor.class);
		classes.put("genericWithState_114_junction", GenericJunctionActor.class);
		classes.put("genericWithStateTest_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("simpleSynthesis_130_junction", GenericJunctionActor.class);
		classes.put("simpleSynthesis_220_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleSynthesis_221_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleSynthesis_222_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleSynthesis_223_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleSynthesis_224_nacjunction", GenericNACJunctionActor.class);
		classes.put("unspecifiedStateChange_133_junction", GenericJunctionActor.class);
		classes.put("injectivity_140_junction", GenericJunctionActor.class);
		classes.put("injectivity_138_junction", injectivity_138_junction.class);
		classes.put("injectivity_225_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_226_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_227_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_228_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_229_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_230_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_231_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_232_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_233_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_234_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_235_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_236_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_237_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivity_238_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_145_junction", GenericJunctionActor.class);
		classes.put("injectivityBwd_143_junction", GenericJunctionActor.class);
		classes.put("injectivityBwd_239_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_240_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_241_nacjunction", GenericNACJunctionActor.class);
		classes.put("injectivityBwd_242_nacjunction", GenericNACJunctionActor.class);
		classes.put("A_cFree_243_nacjunction", GenericNACJunctionActor.class);
		classes.put("A_cFree_244_nacjunction", GenericNACJunctionActor.class);
		classes.put("A_cFree_245_nacjunction", GenericNACJunctionActor.class);
		classes.put("wildcard_151_junction", GenericJunctionActor.class);
		classes.put("wildcard_246_nacjunction", GenericNACJunctionActor.class);
		classes.put("wildcardStateChange_154_junction", GenericJunctionActor.class);
		classes.put("wildcardStateChange_247_nacjunction", GenericNACJunctionActor.class);
		classes.put("wildcardStateChangeBwd_159_junction", GenericJunctionActor.class);
		classes.put("wildcardStateChangeBwd_248_nacjunction", GenericNACJunctionActor.class);
		classes.put("underspecSynth_168_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_173_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_171_junction", GenericJunctionActor.class);
		classes.put("obs_underspecTest_249_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecTest_250_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecTest_251_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecTest_252_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_genericTest_179_junction", GenericJunctionActor.class);
		classes.put("obs_wildcardTest_253_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_wildcardTest_254_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_wildcardTest_255_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_wildcardTest_256_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_192_junction", GenericJunctionActor.class);
		classes.put("obs_concreteSplitTest_257_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_258_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_259_nacjunction", GenericNACJunctionActor.class);
		createJunctionNodes_1();
			}	
		
			private void createJunctionNodes_1() {
		classes.put("obs_concreteSplitTest_260_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_261_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_262_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_263_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_264_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_265_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_266_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_267_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_concreteSplitTest_268_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_269_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_270_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_271_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_272_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_273_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_274_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_275_nacjunction", GenericNACJunctionActor.class);
		classes.put("obs_underspecSynthTest_276_nacjunction", GenericNACJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("A_A_b_X_z_0_reference",A_A_b_X_z_0_reference.class);
		classes.put("A_A_b_A_c_0_reference",A_A_b_A_c_0_reference.class);
		classes.put("A_A_b_A_b_0_reference",A_A_b_A_b_0_reference.class);
		classes.put("A_A_b_X_y_0_reference",A_A_b_X_y_0_reference.class);
		classes.put("A_A_c_X_z_0_reference",A_A_c_X_z_0_reference.class);
		classes.put("A_A_c_X_y_0_reference",A_A_c_X_y_0_reference.class);
		classes.put("X_X_z_p_0_reference",X_X_z_p_0_reference.class);
		classes.put("X_X_z_u_0_reference",X_X_z_u_0_reference.class);
		classes.put("A_A_c_p_0_reference",A_A_c_p_0_reference.class);
		classes.put("A_A_c_u_0_reference",A_A_c_u_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("Container_object",Container_object.class);
		classes.put("A_object_SP0",A_object_SP0.class);
		classes.put("A_object_SP1",A_object_SP1.class);
		classes.put("A_object_SP2",A_object_SP2.class);
		classes.put("A_object_SP3",A_object_SP3.class);
		classes.put("A_object_SP4",A_object_SP4.class);
		classes.put("A_object_SP5",A_object_SP5.class);
		classes.put("X_object_SP0",X_object_SP0.class);
		classes.put("X_object_SP1",X_object_SP1.class);
		classes.put("X_object_SP2",X_object_SP2.class);
		classes.put("U_s_object_SP0",U_s_object_SP0.class);
		classes.put("U_s_object_SP1",U_s_object_SP1.class);
		classes.put("U_s_object_SP2",U_s_object_SP2.class);
		classes.put("P_s_object_SP0",P_s_object_SP0.class);
		classes.put("P_s_object_SP1",P_s_object_SP1.class);
		classes.put("P_s_object_SP2",P_s_object_SP2.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("A_A_b_X_z_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.X>(name2actor, name2node.get("A_A_b_X_z_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_b_X_z(), null, false));
		name2initRefGen.put("A_A_b_A_c_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.A>(name2actor, name2node.get("A_A_b_A_c_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_b_A_c(), null, true));
		name2initRefGen.put("A_A_b_A_b_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.A>(name2actor, name2node.get("A_A_b_A_b_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_b_A_b(), null, true));
		name2initRefGen.put("A_A_b_X_y_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.X>(name2actor, name2node.get("A_A_b_X_y_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_b_X_y(), null, false));
		name2initRefGen.put("A_A_c_X_z_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.X>(name2actor, name2node.get("A_A_c_X_z_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c_X_z(), null, false));
		name2initRefGen.put("A_A_c_X_y_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.X>(name2actor, name2node.get("A_A_c_X_y_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c_X_y(), null, false));
		name2initRefGen.put("X_X_z_p_0_reference", new InitGenReferenceActor<TestcasesModel.X,TestcasesModel.P_s>(name2actor, name2node.get("X_X_z_p_0_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_z_p(), null, false));
		name2initRefGen.put("X_X_z_u_0_reference", new InitGenReferenceActor<TestcasesModel.X,TestcasesModel.U_s>(name2actor, name2node.get("X_X_z_u_0_reference"), (o) -> o instanceof TestcasesModel.X, (o) -> o.getX_z_u(), null, false));
		name2initRefGen.put("A_A_c_p_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.P_s>(name2actor, name2node.get("A_A_c_p_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c_p(), null, false));
		name2initRefGen.put("A_A_c_u_0_reference", new InitGenReferenceActor<TestcasesModel.A,TestcasesModel.U_s>(name2actor, name2node.get("A_A_c_u_0_reference"), (o) -> o instanceof TestcasesModel.A, (o) -> o.getA_c_u(), null, false));
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

class Container_object extends GenericObjectActor<reactionContainer.Container> { }
class A_object_SP0 extends GenericObjectActor<TestcasesModel.A> { }
class A_object_SP1 extends GenericObjectActor<TestcasesModel.A> { }
class A_object_SP2 extends GenericObjectActor<TestcasesModel.A> { }
class A_object_SP3 extends GenericObjectActor<TestcasesModel.A> { }
class A_object_SP5 extends GenericObjectActor<TestcasesModel.A> { }
class X_object_SP0 extends GenericObjectActor<TestcasesModel.X> { }
class X_object_SP1 extends GenericObjectActor<TestcasesModel.X> { }
class X_object_SP2 extends GenericObjectActor<TestcasesModel.X> { }
class U_s_object_SP0 extends GenericObjectActor<TestcasesModel.U_s> { }
class U_s_object_SP1 extends GenericObjectActor<TestcasesModel.U_s> { }
class U_s_object_SP2 extends GenericObjectActor<TestcasesModel.U_s> { }
class P_s_object_SP0 extends GenericObjectActor<TestcasesModel.P_s> { }
class P_s_object_SP1 extends GenericObjectActor<TestcasesModel.P_s> { }
class P_s_object_SP2 extends GenericObjectActor<TestcasesModel.P_s> { }

class A_A_b_X_z_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.X> { }
class A_A_b_A_c_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.A> { }
class A_A_b_X_y_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.X> { }
class A_A_c_X_z_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.X> { }
class A_A_c_X_y_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.X> { }
class X_X_z_p_0_reference extends GenericReferenceActor<TestcasesModel.X, TestcasesModel.P_s> { }
class X_X_z_u_0_reference extends GenericReferenceActor<TestcasesModel.X, TestcasesModel.U_s> { }
class A_A_c_p_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.P_s> { }
class A_A_c_u_0_reference extends GenericReferenceActor<TestcasesModel.A, TestcasesModel.U_s> { }

