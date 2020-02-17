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
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_u_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_p_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_1_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.T_T_i_1_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_1_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_p_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_b_2_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_1_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecified1_269_junction;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecified1_275_junction;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecified1_268_junction;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecified2_281_junction;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecified3_291_junction;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecified4_301_junction;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecified5_311_junction;
import GeneralTestSimSG.hipe.engine.actor.edge.A_A_c_2_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.underspecifiedAgent_390_junction;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_2_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.bidirectionalRule_449_junction;
import GeneralTestSimSG.hipe.engine.actor.edge.T_T_i_2_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.T_T_j_1_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.bidirectionalRule_448_junction;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_z_u_0_reference;
import GeneralTestSimSG.hipe.engine.actor.edge.T_T_j_2_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.injectivity_486_junction;
import GeneralTestSimSG.hipe.engine.actor.edge.X_X_y_1_reference;
import GeneralTestSimSG.hipe.engine.actor.junction.injectivity_492_junction;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP3;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP4;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP5;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP6;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP7;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP8;
import GeneralTestSimSG.hipe.engine.actor.node.A_object_SP9;
import GeneralTestSimSG.hipe.engine.actor.node.Agent_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.Agent_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.T_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.T_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.T_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.T_object_SP3;
import GeneralTestSimSG.hipe.engine.actor.node.T_object_SP4;
import GeneralTestSimSG.hipe.engine.actor.node.T_object_SP5;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP3;
import GeneralTestSimSG.hipe.engine.actor.node.X_object_SP4;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP3;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP4;
import GeneralTestSimSG.hipe.engine.actor.node.P_s_object_SP5;
import GeneralTestSimSG.hipe.engine.actor.node.U_s_object_SP0;
import GeneralTestSimSG.hipe.engine.actor.node.U_s_object_SP1;
import GeneralTestSimSG.hipe.engine.actor.node.U_s_object_SP2;
import GeneralTestSimSG.hipe.engine.actor.node.U_s_object_SP3;
import GeneralTestSimSG.hipe.engine.actor.node.U_s_object_SP4;

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
		classes.put("simpleBind1_1_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind1_1_production", "simpleBind1_1");
		classes.put("simpleBind1_2_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind1_2_production", "simpleBind1_2");
		classes.put("simpleBind1State1_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind1State1_production", "simpleBind1State1");
		classes.put("simpleBind1State2_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind1State2_production", "simpleBind1State2");
		classes.put("simpleBind2_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind2_production", "simpleBind2");
		classes.put("simpleBind2State1_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind2State1_production", "simpleBind2State1");
		classes.put("simpleBind2State2_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind2State2_production", "simpleBind2State2");
		classes.put("simpleBind2State3_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind2State3_production", "simpleBind2State3");
		classes.put("simpleBind2State4_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind2State4_production", "simpleBind2State4");
		classes.put("conditionPattern_Ab_to_Ti_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ab_to_Ti_production", "conditionPattern_Ab_to_Ti");
		classes.put("conditionPattern_Ti_to_Ab_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ti_to_Ab_production", "conditionPattern_Ti_to_Ab");
		classes.put("simpleBind3_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind3_production", "simpleBind3");
		classes.put("conditionPattern_Ac_to_Ti_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ac_to_Ti_production", "conditionPattern_Ac_to_Ti");
		classes.put("conditionPattern_Ti_to_Ac_state_u_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ti_to_Ac_state_u_production", "conditionPattern_Ti_to_Ac_state_u");
		classes.put("simpleBind3State1_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind3State1_production", "simpleBind3State1");
		classes.put("conditionPattern_Ti_to_Ac_state_p_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ti_to_Ac_state_p_production", "conditionPattern_Ti_to_Ac_state_p");
		classes.put("simpleBind3State2_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind3State2_production", "simpleBind3State2");
		classes.put("conditionPattern_Ti_to_Ac_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ti_to_Ac_production", "conditionPattern_Ti_to_Ac");
		classes.put("simpleBind3State3_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind3State3_production", "simpleBind3State3");
		classes.put("simpleBind3State4_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleBind3State4_production", "simpleBind3State4");
		classes.put("simpleSplit1_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit1_production", "simpleSplit1");
		classes.put("simpleSplit1State1_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit1State1_production", "simpleSplit1State1");
		classes.put("simpleSplit1State2_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit1State2_production", "simpleSplit1State2");
		classes.put("simpleSplit1State3_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit1State3_production", "simpleSplit1State3");
		classes.put("simpleSplit1State4_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit1State4_production", "simpleSplit1State4");
		classes.put("simpleSplit2State1_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit2State1_production", "simpleSplit2State1");
		classes.put("simpleSplit2State2_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit2State2_production", "simpleSplit2State2");
		classes.put("simpleSplit2State3_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit2State3_production", "simpleSplit2State3");
		classes.put("simpleSplit2State4_production", GenericProductionActor.class);
		productionNodes2pattern.put("simpleSplit2State4_production", "simpleSplit2State4");
		classes.put("expandedSplit_production", GenericProductionActor.class);
		productionNodes2pattern.put("expandedSplit_production", "expandedSplit");
		classes.put("expandedSplitState1_production", GenericProductionActor.class);
		productionNodes2pattern.put("expandedSplitState1_production", "expandedSplitState1");
		classes.put("expandedSplitState2_production", GenericProductionActor.class);
		productionNodes2pattern.put("expandedSplitState2_production", "expandedSplitState2");
		classes.put("synthesisSingle4_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisSingle4_production", "synthesisSingle4");
		classes.put("synthesisSingle5_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisSingle5_production", "synthesisSingle5");
		classes.put("synthesisSingle8_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisSingle8_production", "synthesisSingle8");
		classes.put("synthesisSingle9_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisSingle9_production", "synthesisSingle9");
		classes.put("synthesisMulti4_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisMulti4_production", "synthesisMulti4");
		classes.put("synthesisMulti5_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisMulti5_production", "synthesisMulti5");
		classes.put("synthesisMulti6_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisMulti6_production", "synthesisMulti6");
		classes.put("synthesisMulti7_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisMulti7_production", "synthesisMulti7");
		classes.put("synthesisMulti9_production", GenericProductionActor.class);
		productionNodes2pattern.put("synthesisMulti9_production", "synthesisMulti9");
		classes.put("partialSynthesis1_production", GenericProductionActor.class);
		productionNodes2pattern.put("partialSynthesis1_production", "partialSynthesis1");
		classes.put("partialSynthesis2_production", GenericProductionActor.class);
		productionNodes2pattern.put("partialSynthesis2_production", "partialSynthesis2");
		classes.put("degradation1_production", GenericProductionActor.class);
		productionNodes2pattern.put("degradation1_production", "degradation1");
		classes.put("degradation2_production", GenericProductionActor.class);
		productionNodes2pattern.put("degradation2_production", "degradation2");
		classes.put("degradation3_production", GenericProductionActor.class);
		productionNodes2pattern.put("degradation3_production", "degradation3");
		classes.put("partialDegradation1_production", GenericProductionActor.class);
		productionNodes2pattern.put("partialDegradation1_production", "partialDegradation1");
		classes.put("partialDegradation2_production", GenericProductionActor.class);
		productionNodes2pattern.put("partialDegradation2_production", "partialDegradation2");
		classes.put("partialDegradation3_production", GenericProductionActor.class);
		productionNodes2pattern.put("partialDegradation3_production", "partialDegradation3");
		classes.put("partialDegradation4_production", GenericProductionActor.class);
		productionNodes2pattern.put("partialDegradation4_production", "partialDegradation4");
		classes.put("underspecified1_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecified1_production", "underspecified1");
		classes.put("underspecified2_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecified2_production", "underspecified2");
		classes.put("underspecified3_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecified3_production", "underspecified3");
		classes.put("underspecified4_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecified4_production", "underspecified4");
		classes.put("underspecified5_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecified5_production", "underspecified5");
		classes.put("unspecified1_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspecified1_production", "unspecified1");
		classes.put("unspecified2_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspecified2_production", "unspecified2");
		classes.put("unspecified3_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspecified3_production", "unspecified3");
		classes.put("unspecified4_production", GenericProductionActor.class);
		productionNodes2pattern.put("unspecified4_production", "unspecified4");
		classes.put("conditionPattern_Ab_to_LocalAgent_X_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ab_to_LocalAgent_X_production", "conditionPattern_Ab_to_LocalAgent_X");
		classes.put("conditionPattern_Ac_to_LocalAgent_X_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ac_to_LocalAgent_X_production", "conditionPattern_Ac_to_LocalAgent_X");
		classes.put("generic1_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic1_production", "generic1");
		classes.put("generic2_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic2_production", "generic2");
		classes.put("generic3_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic3_production", "generic3");
		classes.put("generic4_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic4_production", "generic4");
		classes.put("generic5_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic5_production", "generic5");
		classes.put("generic6State1_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic6State1_production", "generic6State1");
		classes.put("generic6State2_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic6State2_production", "generic6State2");
		classes.put("generic7_production", GenericProductionActor.class);
		productionNodes2pattern.put("generic7_production", "generic7");
		classes.put("freeAgentsBind_production", GenericProductionActor.class);
		productionNodes2pattern.put("freeAgentsBind_production", "freeAgentsBind");
		classes.put("freeAgentsBind2_production", GenericProductionActor.class);
		productionNodes2pattern.put("freeAgentsBind2_production", "freeAgentsBind2");
		classes.put("underspecifiedAgent_production", GenericProductionActor.class);
		productionNodes2pattern.put("underspecifiedAgent_production", "underspecifiedAgent");
		classes.put("conditionPattern_Ab_to_Xz_state_p_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ab_to_Xz_state_p_production", "conditionPattern_Ab_to_Xz_state_p");
		classes.put("conditionPattern_Xz_to_Ab_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Xz_to_Ab_production", "conditionPattern_Xz_to_Ab");
		classes.put("forbiddenBondState_production", GenericProductionActor.class);
		productionNodes2pattern.put("forbiddenBondState_production", "forbiddenBondState");
		classes.put("conditionPattern_Ab_to_Xz_state_p_Local_production", GenericProductionActor.class);
		productionNodes2pattern.put("conditionPattern_Ab_to_Xz_state_p_Local_production", "conditionPattern_Ab_to_Xz_state_p_Local");
		classes.put("forbiddenBondStateGeneric_production", GenericProductionActor.class);
		productionNodes2pattern.put("forbiddenBondStateGeneric_production", "forbiddenBondStateGeneric");
		classes.put("forbiddenBondStateGenericWithSynthesis_production", GenericProductionActor.class);
		productionNodes2pattern.put("forbiddenBondStateGenericWithSynthesis_production", "forbiddenBondStateGenericWithSynthesis");
		classes.put("breakSpecificBond_production", GenericProductionActor.class);
		productionNodes2pattern.put("breakSpecificBond_production", "breakSpecificBond");
		classes.put("bidirectionalRule_production", GenericProductionActor.class);
		productionNodes2pattern.put("bidirectionalRule_production", "bidirectionalRule");
		classes.put("bidirectionalRuleBwd_production", GenericProductionActor.class);
		productionNodes2pattern.put("bidirectionalRuleBwd_production", "bidirectionalRuleBwd");
		classes.put("complexStateChanges_production", GenericProductionActor.class);
		productionNodes2pattern.put("complexStateChanges_production", "complexStateChanges");
		classes.put("genericBondBreak_production", GenericProductionActor.class);
		productionNodes2pattern.put("genericBondBreak_production", "genericBondBreak");
		classes.put("injectivity_production", GenericProductionActor.class);
		productionNodes2pattern.put("injectivity_production", "injectivity");
		
	}
	
	public void createJunctionNodes() {
		classes.put("simpleBind1_1_19_junction", GenericJunctionActor.class);
		classes.put("simpleBind1_1_495_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1_1_496_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1_1_497_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1_1_498_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1_2_22_junction", GenericJunctionActor.class);
		classes.put("simpleBind1_2_499_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1_2_500_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1_2_501_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1_2_502_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State1_27_junction", GenericJunctionActor.class);
		classes.put("simpleBind1State1_25_junction", GenericJunctionActor.class);
		classes.put("simpleBind1State1_503_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State1_504_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State1_505_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State1_506_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State2_32_junction", GenericJunctionActor.class);
		classes.put("simpleBind1State2_30_junction", GenericJunctionActor.class);
		classes.put("simpleBind1State2_507_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State2_508_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State2_509_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind1State2_510_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2_35_junction", GenericJunctionActor.class);
		classes.put("simpleBind2_511_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2_512_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State1_39_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State1_38_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State1_513_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State1_514_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State2_46_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State2_45_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State2_515_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State2_516_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State3_54_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State3_52_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State3_517_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State3_518_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State4_59_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State4_57_junction", GenericJunctionActor.class);
		classes.put("simpleBind2State4_519_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind2State4_520_nacjunction", GenericNACJunctionActor.class);
		classes.put("conditionPattern_Ab_to_Ti_62_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ti_to_Ab_67_junction", GenericJunctionActor.class);
		classes.put("simpleBind3_72_junction", GenericJunctionActor.class);
		classes.put("simpleBind3_521_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind3_522_nacjunction", GenericNACJunctionActor.class);
		classes.put("conditionPattern_Ac_to_Ti_75_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ti_to_Ac_state_u_84_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ti_to_Ac_state_u_80_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State1_89_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State1_88_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State1_523_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind3State1_524_nacjunction", GenericNACJunctionActor.class);
		classes.put("conditionPattern_Ti_to_Ac_state_p_99_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ti_to_Ac_state_p_95_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State2_104_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State2_103_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State2_525_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind3State2_526_nacjunction", GenericNACJunctionActor.class);
		classes.put("conditionPattern_Ti_to_Ac_110_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State3_117_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State3_115_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State3_527_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind3State3_528_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind3State4_122_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State4_120_junction", GenericJunctionActor.class);
		classes.put("simpleBind3State4_529_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleBind3State4_530_nacjunction", GenericNACJunctionActor.class);
		classes.put("simpleSplit1_125_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State1_136_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State1_132_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State1_130_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State2_146_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State2_142_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State2_140_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State3_152_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State3_150_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State4_159_junction", GenericJunctionActor.class);
		classes.put("simpleSplit1State4_157_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State1_170_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State1_166_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State1_164_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State2_180_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State2_176_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State2_174_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State3_186_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State3_184_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State4_193_junction", GenericJunctionActor.class);
		classes.put("simpleSplit2State4_191_junction", GenericJunctionActor.class);
		classes.put("expandedSplit_198_junction", GenericJunctionActor.class);
		classes.put("expandedSplitState1_207_junction", GenericJunctionActor.class);
		classes.put("expandedSplitState1_203_junction", GenericJunctionActor.class);
		classes.put("expandedSplitState2_215_junction", GenericJunctionActor.class);
		classes.put("expandedSplitState2_211_junction", GenericJunctionActor.class);
		classes.put("partialSynthesis2_229_junction", GenericJunctionActor.class);
		classes.put("degradation1_232_junction", GenericJunctionActor.class);
		classes.put("degradation2_235_junction", GenericJunctionActor.class);
		classes.put("degradation2_531_nacjunction", GenericNACJunctionActor.class);
		classes.put("degradation2_532_nacjunction", GenericNACJunctionActor.class);
		createJunctionNodes_1();
			}	
		
			private void createJunctionNodes_1() {
		classes.put("degradation2_533_nacjunction", GenericNACJunctionActor.class);
		classes.put("degradation2_534_nacjunction", GenericNACJunctionActor.class);
		classes.put("degradation3_242_junction", GenericJunctionActor.class);
		classes.put("degradation3_238_junction", GenericJunctionActor.class);
		classes.put("partialDegradation1_246_junction", GenericJunctionActor.class);
		classes.put("partialDegradation2_249_junction", GenericJunctionActor.class);
		classes.put("partialDegradation2_535_nacjunction", GenericNACJunctionActor.class);
		classes.put("partialDegradation2_536_nacjunction", GenericNACJunctionActor.class);
		classes.put("partialDegradation2_537_nacjunction", GenericNACJunctionActor.class);
		classes.put("partialDegradation2_538_nacjunction", GenericNACJunctionActor.class);
		classes.put("partialDegradation3_256_junction", GenericJunctionActor.class);
		classes.put("partialDegradation3_252_junction", GenericJunctionActor.class);
		classes.put("partialDegradation4_264_junction", GenericJunctionActor.class);
		classes.put("partialDegradation4_260_junction", GenericJunctionActor.class);
		classes.put("underspecified1_269_junction", underspecified1_269_junction.class);
		classes.put("underspecified1_275_junction", underspecified1_275_junction.class);
		classes.put("underspecified1_268_junction", underspecified1_268_junction.class);
		classes.put("underspecified2_285_junction", GenericJunctionActor.class);
		classes.put("underspecified2_281_junction", underspecified2_281_junction.class);
		classes.put("underspecified3_295_junction", GenericJunctionActor.class);
		classes.put("underspecified3_291_junction", underspecified3_291_junction.class);
		classes.put("underspecified4_305_junction", GenericJunctionActor.class);
		classes.put("underspecified4_301_junction", underspecified4_301_junction.class);
		classes.put("underspecified5_315_junction", GenericJunctionActor.class);
		classes.put("underspecified5_311_junction", underspecified5_311_junction.class);
		classes.put("unspecified2_322_junction", GenericJunctionActor.class);
		classes.put("unspecified3_327_junction", GenericJunctionActor.class);
		classes.put("unspecified3_325_junction", GenericJunctionActor.class);
		classes.put("unspecified4_331_junction", GenericJunctionActor.class);
		classes.put("unspecified4_334_junction", GenericJunctionActor.class);
		classes.put("unspecified4_330_junction", GenericJunctionActor.class);
		classes.put("generic1_539_nacjunction", GenericNACJunctionActor.class);
		classes.put("generic1_540_nacjunction", GenericNACJunctionActor.class);
		classes.put("generic3_347_junction", GenericJunctionActor.class);
		classes.put("generic4_356_junction", GenericJunctionActor.class);
		classes.put("generic4_352_junction", GenericJunctionActor.class);
		classes.put("generic5_360_junction", GenericJunctionActor.class);
		classes.put("generic6State1_365_junction", GenericJunctionActor.class);
		classes.put("generic6State2_371_junction", GenericJunctionActor.class);
		classes.put("generic7_377_junction", GenericJunctionActor.class);
		classes.put("freeAgentsBind_382_junction", GenericJunctionActor.class);
		classes.put("freeAgentsBind_541_nacjunction", GenericNACJunctionActor.class);
		classes.put("freeAgentsBind_542_nacjunction", GenericNACJunctionActor.class);
		classes.put("freeAgentsBind_543_nacjunction", GenericNACJunctionActor.class);
		classes.put("freeAgentsBind_544_nacjunction", GenericNACJunctionActor.class);
		classes.put("freeAgentsBind2_387_junction", GenericJunctionActor.class);
		classes.put("freeAgentsBind2_385_junction", GenericJunctionActor.class);
		classes.put("freeAgentsBind2_545_nacjunction", GenericNACJunctionActor.class);
		classes.put("freeAgentsBind2_546_nacjunction", GenericNACJunctionActor.class);
		classes.put("freeAgentsBind2_547_nacjunction", GenericNACJunctionActor.class);
		classes.put("freeAgentsBind2_548_nacjunction", GenericNACJunctionActor.class);
		classes.put("underspecifiedAgent_391_junction", GenericJunctionActor.class);
		classes.put("underspecifiedAgent_396_junction", GenericJunctionActor.class);
		classes.put("underspecifiedAgent_390_junction", underspecifiedAgent_390_junction.class);
		classes.put("conditionPattern_Ab_to_Xz_state_p_406_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ab_to_Xz_state_p_402_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Xz_to_Ab_410_junction", GenericJunctionActor.class);
		classes.put("forbiddenBondState_416_junction", GenericJunctionActor.class);
		classes.put("forbiddenBondState_415_junction", GenericJunctionActor.class);
		classes.put("forbiddenBondState_549_nacjunction", GenericNACJunctionActor.class);
		classes.put("forbiddenBondState_550_nacjunction", GenericNACJunctionActor.class);
		classes.put("conditionPattern_Ab_to_Xz_state_p_Local_426_junction", GenericJunctionActor.class);
		classes.put("conditionPattern_Ab_to_Xz_state_p_Local_422_junction", GenericJunctionActor.class);
		classes.put("forbiddenBondStateGeneric_430_junction", GenericJunctionActor.class);
		classes.put("forbiddenBondStateGeneric_551_nacjunction", GenericNACJunctionActor.class);
		classes.put("forbiddenBondStateGeneric_552_nacjunction", GenericNACJunctionActor.class);
		classes.put("forbiddenBondStateGeneric_553_nacjunction", GenericNACJunctionActor.class);
		classes.put("forbiddenBondStateGenericWithSynthesis_554_nacjunction", GenericNACJunctionActor.class);
		classes.put("breakSpecificBond_434_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRule_442_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRule_449_junction", bidirectionalRule_449_junction.class);
		classes.put("bidirectionalRule_454_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRule_448_junction", bidirectionalRule_448_junction.class);
		classes.put("bidirectionalRule_441_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRule_439_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRuleBwd_458_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRuleBwd_465_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRuleBwd_461_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRuleBwd_457_junction", GenericJunctionActor.class);
		classes.put("bidirectionalRuleBwd_555_nacjunction", GenericNACJunctionActor.class);
		classes.put("bidirectionalRuleBwd_556_nacjunction", GenericNACJunctionActor.class);
		classes.put("bidirectionalRuleBwd_557_nacjunction", GenericNACJunctionActor.class);
		classes.put("complexStateChanges_470_junction", GenericJunctionActor.class);
		classes.put("complexStateChanges_476_junction", GenericJunctionActor.class);
		classes.put("complexStateChanges_469_junction", GenericJunctionActor.class);
		classes.put("genericBondBreak_480_junction", GenericJunctionActor.class);
		classes.put("injectivity_486_junction", injectivity_486_junction.class);
		classes.put("injectivity_492_junction", injectivity_492_junction.class);
		classes.put("injectivity_485_junction", GenericJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("A_A_b_0_reference",A_A_b_0_reference.class);
		classes.put("A_A_c_0_reference",A_A_c_0_reference.class);
		classes.put("T_T_i_0_reference",T_T_i_0_reference.class);
		classes.put("T_T_j_0_reference",T_T_j_0_reference.class);
		classes.put("X_X_y_0_reference",X_X_y_0_reference.class);
		classes.put("X_X_z_0_reference",X_X_z_0_reference.class);
		classes.put("A_A_c_u_0_reference",A_A_c_u_0_reference.class);
		classes.put("A_A_c_p_0_reference",A_A_c_p_0_reference.class);
		classes.put("A_A_b_1_reference",A_A_b_1_reference.class);
		classes.put("T_T_i_1_reference",T_T_i_1_reference.class);
		classes.put("A_A_c_1_reference",A_A_c_1_reference.class);
		classes.put("X_X_z_p_0_reference",X_X_z_p_0_reference.class);
		classes.put("A_A_b_2_reference",A_A_b_2_reference.class);
		classes.put("X_X_z_1_reference",X_X_z_1_reference.class);
		classes.put("A_A_c_2_reference",A_A_c_2_reference.class);
		classes.put("X_X_z_2_reference",X_X_z_2_reference.class);
		classes.put("T_T_i_2_reference",T_T_i_2_reference.class);
		classes.put("T_T_j_1_reference",T_T_j_1_reference.class);
		classes.put("X_X_z_u_0_reference",X_X_z_u_0_reference.class);
		classes.put("T_T_j_2_reference",T_T_j_2_reference.class);
		classes.put("X_X_y_1_reference",X_X_y_1_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("A_object_SP0",A_object_SP0.class);
		classes.put("A_object_SP1",A_object_SP1.class);
		classes.put("A_object_SP2",A_object_SP2.class);
		classes.put("A_object_SP3",A_object_SP3.class);
		classes.put("A_object_SP4",A_object_SP4.class);
		classes.put("A_object_SP5",A_object_SP5.class);
		classes.put("A_object_SP6",A_object_SP6.class);
		classes.put("A_object_SP7",A_object_SP7.class);
		classes.put("A_object_SP8",A_object_SP8.class);
		classes.put("A_object_SP9",A_object_SP9.class);
		classes.put("Agent_object_SP0",Agent_object_SP0.class);
		classes.put("Agent_object_SP1",Agent_object_SP1.class);
		classes.put("T_object_SP0",T_object_SP0.class);
		classes.put("T_object_SP1",T_object_SP1.class);
		classes.put("T_object_SP2",T_object_SP2.class);
		classes.put("T_object_SP3",T_object_SP3.class);
		classes.put("T_object_SP4",T_object_SP4.class);
		classes.put("T_object_SP5",T_object_SP5.class);
		classes.put("X_object_SP0",X_object_SP0.class);
		classes.put("X_object_SP1",X_object_SP1.class);
		classes.put("X_object_SP2",X_object_SP2.class);
		classes.put("X_object_SP3",X_object_SP3.class);
		classes.put("X_object_SP4",X_object_SP4.class);
		classes.put("P_s_object_SP0",P_s_object_SP0.class);
		classes.put("P_s_object_SP1",P_s_object_SP1.class);
		classes.put("P_s_object_SP2",P_s_object_SP2.class);
		classes.put("P_s_object_SP3",P_s_object_SP3.class);
		classes.put("P_s_object_SP4",P_s_object_SP4.class);
		classes.put("P_s_object_SP5",P_s_object_SP5.class);
		classes.put("U_s_object_SP0",U_s_object_SP0.class);
		classes.put("U_s_object_SP1",U_s_object_SP1.class);
		classes.put("U_s_object_SP2",U_s_object_SP2.class);
		classes.put("U_s_object_SP3",U_s_object_SP3.class);
		classes.put("U_s_object_SP4",U_s_object_SP4.class);
		
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

