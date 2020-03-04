package GKL_created_test.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.InputContainer;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;

public class DispatchActor extends AbstractActor {
	
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2setConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = new HashMap<>();
	
	private IncUtil util = IncUtil.getUtil();
	
	public DispatchActor(Map<String, ActorRef> name2actor) {
		this.name2actor = name2actor;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	}
	
	private void initializeAdd() {
		type2addConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getK(), obj -> {
			GKLModel.K _k = (GKLModel.K) obj;
			util.newMessage();
			name2actor.get("K_object").tell(new ObjectAdded<GKLModel.K>(_k), getSelf());
		});
		type2addConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT(), obj -> {
			GKLModel.T _t = (GKLModel.T) obj;
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ObjectAdded<GKLModel.T>(_t), getSelf());
			util.newMessage();
			name2actor.get("T_object_SP1").tell(new ObjectAdded<GKLModel.T>(_t), getSelf());
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ObjectAdded<GKLModel.T>(_t), getSelf());
		});
		type2addConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getP(), obj -> {
			GKLModel.P _p = (GKLModel.P) obj;
			util.newMessage();
			name2actor.get("P_object").tell(new ObjectAdded<GKLModel.P>(_p), getSelf());
		});
		type2addConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getP_s(), obj -> {
			GKLModel.P_s _p_s = (GKLModel.P_s) obj;
			util.newMessage();
			name2actor.get("P_s_object").tell(new ObjectAdded<GKLModel.P_s>(_p_s), getSelf());
		});
		type2addConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getU_s(), obj -> {
			GKLModel.U_s _u_s = (GKLModel.U_s) obj;
			util.newMessage();
			name2actor.get("U_s_object").tell(new ObjectAdded<GKLModel.U_s>(_u_s), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getP_P_a_T_x(), notification -> {
			util.newMessage();
			name2actor.get("P_object").tell(new ReferenceAdded<GKLModel.P, GKLModel.T>((GKLModel.P) notification.getNotifier(), (GKLModel.T) notification.getNewValue(), name2actor.get("P_P_a_T_x_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getP_P_a_T_y(), notification -> {
			util.newMessage();
			name2actor.get("P_object").tell(new ReferenceAdded<GKLModel.P, GKLModel.T>((GKLModel.P) notification.getNotifier(), (GKLModel.T) notification.getNewValue(), name2actor.get("P_P_a_T_y_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_x_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ReferenceAdded<GKLModel.T, GKLModel.K>((GKLModel.T) notification.getNotifier(), (GKLModel.K) notification.getNewValue(), name2actor.get("T_T_x_K_a_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_y_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ReferenceAdded<GKLModel.T, GKLModel.K>((GKLModel.T) notification.getNotifier(), (GKLModel.K) notification.getNewValue(), name2actor.get("T_T_y_K_a_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_x_u(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ReferenceAdded<GKLModel.T, GKLModel.U_s>((GKLModel.T) notification.getNotifier(), (GKLModel.U_s) notification.getNewValue(), name2actor.get("T_T_x_u_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_y_u(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP1").tell(new ReferenceAdded<GKLModel.T, GKLModel.U_s>((GKLModel.T) notification.getNotifier(), (GKLModel.U_s) notification.getNewValue(), name2actor.get("T_T_y_u_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_x_p(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ReferenceAdded<GKLModel.T, GKLModel.P_s>((GKLModel.T) notification.getNotifier(), (GKLModel.P_s) notification.getNewValue(), name2actor.get("T_T_x_p_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_y_p(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ReferenceAdded<GKLModel.T, GKLModel.P_s>((GKLModel.T) notification.getNotifier(), (GKLModel.P_s) notification.getNewValue(), name2actor.get("T_T_y_p_0_reference")), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getP_P_a_T_x(), notification -> {
			util.newMessage();
			name2actor.get("P_object").tell(new ReferenceDeleted<GKLModel.P, GKLModel.T>((GKLModel.P) notification.getNotifier(), (GKLModel.T) notification.getOldValue(), name2actor.get("P_P_a_T_x_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getP_P_a_T_y(), notification -> {
			util.newMessage();
			name2actor.get("P_object").tell(new ReferenceDeleted<GKLModel.P, GKLModel.T>((GKLModel.P) notification.getNotifier(), (GKLModel.T) notification.getOldValue(), name2actor.get("P_P_a_T_y_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_x_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ReferenceDeleted<GKLModel.T, GKLModel.K>((GKLModel.T) notification.getNotifier(), (GKLModel.K) notification.getOldValue(), name2actor.get("T_T_x_K_a_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_y_K_a(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ReferenceDeleted<GKLModel.T, GKLModel.K>((GKLModel.T) notification.getNotifier(), (GKLModel.K) notification.getOldValue(), name2actor.get("T_T_y_K_a_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_x_u(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ReferenceDeleted<GKLModel.T, GKLModel.U_s>((GKLModel.T) notification.getNotifier(), (GKLModel.U_s) notification.getOldValue(), name2actor.get("T_T_x_u_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_y_u(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP1").tell(new ReferenceDeleted<GKLModel.T, GKLModel.U_s>((GKLModel.T) notification.getNotifier(), (GKLModel.U_s) notification.getOldValue(), name2actor.get("T_T_y_u_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_x_p(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ReferenceDeleted<GKLModel.T, GKLModel.P_s>((GKLModel.T) notification.getNotifier(), (GKLModel.P_s) notification.getOldValue(), name2actor.get("T_T_x_p_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(GKLModel.GKLModelPackage.eINSTANCE.getT_T_y_p(), notification -> {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ReferenceDeleted<GKLModel.T, GKLModel.P_s>((GKLModel.T) notification.getNotifier(), (GKLModel.P_s) notification.getOldValue(), name2actor.get("T_T_y_p_0_reference")), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		super.postStop();
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(Notification.class, this::handleNotification) //
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		util.allMessagesInserted();
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			return;
		case Notification.REMOVE:
			handleRemove(notification);
			return;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			return;	
		case Notification.SET:
			handleSet(notification);
		}
	}

	private void handleAdd(Notification notification) {
		handleAddedNode(notification.getNewValue());
		handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof GKLModel.P) {
			util.newMessage();
			name2actor.get("P_object").tell(new ObjectDeleted<GKLModel.P>((GKLModel.P) node), getSelf());
		}
		if (node instanceof GKLModel.K) {
			util.newMessage();
			name2actor.get("K_object").tell(new ObjectDeleted<GKLModel.K>((GKLModel.K) node), getSelf());
		}
		if (node instanceof GKLModel.P_s) {
			util.newMessage();
			name2actor.get("P_s_object").tell(new ObjectDeleted<GKLModel.P_s>((GKLModel.P_s) node), getSelf());
		}
		if (node instanceof GKLModel.U_s) {
			util.newMessage();
			name2actor.get("U_s_object").tell(new ObjectDeleted<GKLModel.U_s>((GKLModel.U_s) node), getSelf());
		}
		if (node instanceof GKLModel.T) {
			util.newMessage();
			name2actor.get("T_object_SP0").tell(new ObjectDeleted<GKLModel.T>((GKLModel.T) node), getSelf());
		}
		if (node instanceof GKLModel.T) {
			util.newMessage();
			name2actor.get("T_object_SP1").tell(new ObjectDeleted<GKLModel.T>((GKLModel.T) node), getSelf());
		}
		if (node instanceof GKLModel.T) {
			util.newMessage();
			name2actor.get("T_object_SP2").tell(new ObjectDeleted<GKLModel.T>((GKLModel.T) node), getSelf());
		}
	}
}

