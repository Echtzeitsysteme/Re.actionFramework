package GeneralTestSimSG.hipe.engine.actor;

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
		type2addConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getX(), obj -> {
			TestcasesModel.X _x = (TestcasesModel.X) obj;
			util.newMessage();
			name2actor.get("X_object_SP0").tell(new ObjectAdded<TestcasesModel.X>(_x), getSelf());
			util.newMessage();
			name2actor.get("X_object_SP1").tell(new ObjectAdded<TestcasesModel.X>(_x), getSelf());
			util.newMessage();
			name2actor.get("X_object_SP2").tell(new ObjectAdded<TestcasesModel.X>(_x), getSelf());
			util.newMessage();
			name2actor.get("X_object_SP3").tell(new ObjectAdded<TestcasesModel.X>(_x), getSelf());
		});
		type2addConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getP_s(), obj -> {
			TestcasesModel.P_s _p_s = (TestcasesModel.P_s) obj;
			util.newMessage();
			name2actor.get("P_s_object_SP0").tell(new ObjectAdded<TestcasesModel.P_s>(_p_s), getSelf());
			util.newMessage();
			name2actor.get("P_s_object_SP1").tell(new ObjectAdded<TestcasesModel.P_s>(_p_s), getSelf());
			util.newMessage();
			name2actor.get("P_s_object_SP2").tell(new ObjectAdded<TestcasesModel.P_s>(_p_s), getSelf());
		});
		type2addConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA(), obj -> {
			TestcasesModel.A _a = (TestcasesModel.A) obj;
			util.newMessage();
			name2actor.get("A_object_SP0").tell(new ObjectAdded<TestcasesModel.A>(_a), getSelf());
			util.newMessage();
			name2actor.get("A_object_SP1").tell(new ObjectAdded<TestcasesModel.A>(_a), getSelf());
			util.newMessage();
			name2actor.get("A_object_SP2").tell(new ObjectAdded<TestcasesModel.A>(_a), getSelf());
			util.newMessage();
			name2actor.get("A_object_SP3").tell(new ObjectAdded<TestcasesModel.A>(_a), getSelf());
			util.newMessage();
			name2actor.get("A_object_SP4").tell(new ObjectAdded<TestcasesModel.A>(_a), getSelf());
			util.newMessage();
			name2actor.get("A_object_SP5").tell(new ObjectAdded<TestcasesModel.A>(_a), getSelf());
			util.newMessage();
			name2actor.get("A_object_SP6").tell(new ObjectAdded<TestcasesModel.A>(_a), getSelf());
		});
		type2addConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getU_s(), obj -> {
			TestcasesModel.U_s _u_s = (TestcasesModel.U_s) obj;
			util.newMessage();
			name2actor.get("U_s_object_SP0").tell(new ObjectAdded<TestcasesModel.U_s>(_u_s), getSelf());
			util.newMessage();
			name2actor.get("U_s_object_SP1").tell(new ObjectAdded<TestcasesModel.U_s>(_u_s), getSelf());
			util.newMessage();
			name2actor.get("U_s_object_SP2").tell(new ObjectAdded<TestcasesModel.U_s>(_u_s), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_X_z(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP0").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getNewValue(), name2actor.get("A_A_b_X_z_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_A_c(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP1").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.A>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.A) notification.getNewValue(), name2actor.get("A_A_b_A_c_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_A_b(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP3").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.A>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.A) notification.getNewValue(), name2actor.get("A_A_b_A_b_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_X_y(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP5").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getNewValue(), name2actor.get("A_A_b_X_y_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_X_z(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP6").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getNewValue(), name2actor.get("A_A_c_X_z_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_X_y(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP0").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getNewValue(), name2actor.get("A_A_c_X_y_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getX_X_z_p(), notification -> {
			util.newMessage();
			name2actor.get("X_object_SP0").tell(new ReferenceAdded<TestcasesModel.X, TestcasesModel.P_s>((TestcasesModel.X) notification.getNotifier(), (TestcasesModel.P_s) notification.getNewValue(), name2actor.get("X_X_z_p_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getX_X_z_u(), notification -> {
			util.newMessage();
			name2actor.get("X_object_SP1").tell(new ReferenceAdded<TestcasesModel.X, TestcasesModel.U_s>((TestcasesModel.X) notification.getNotifier(), (TestcasesModel.U_s) notification.getNewValue(), name2actor.get("X_X_z_u_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_p(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP2").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.P_s>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.P_s) notification.getNewValue(), name2actor.get("A_A_c_p_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_u(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP4").tell(new ReferenceAdded<TestcasesModel.A, TestcasesModel.U_s>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.U_s) notification.getNewValue(), name2actor.get("A_A_c_u_0_reference")), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_X_z(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP0").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getOldValue(), name2actor.get("A_A_b_X_z_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_A_c(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP1").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.A>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.A) notification.getOldValue(), name2actor.get("A_A_b_A_c_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_A_b(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP3").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.A>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.A) notification.getOldValue(), name2actor.get("A_A_b_A_b_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_b_X_y(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP5").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getOldValue(), name2actor.get("A_A_b_X_y_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_X_z(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP6").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getOldValue(), name2actor.get("A_A_c_X_z_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_X_y(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP0").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.X>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.X) notification.getOldValue(), name2actor.get("A_A_c_X_y_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getX_X_z_p(), notification -> {
			util.newMessage();
			name2actor.get("X_object_SP0").tell(new ReferenceDeleted<TestcasesModel.X, TestcasesModel.P_s>((TestcasesModel.X) notification.getNotifier(), (TestcasesModel.P_s) notification.getOldValue(), name2actor.get("X_X_z_p_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getX_X_z_u(), notification -> {
			util.newMessage();
			name2actor.get("X_object_SP1").tell(new ReferenceDeleted<TestcasesModel.X, TestcasesModel.U_s>((TestcasesModel.X) notification.getNotifier(), (TestcasesModel.U_s) notification.getOldValue(), name2actor.get("X_X_z_u_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_p(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP2").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.P_s>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.P_s) notification.getOldValue(), name2actor.get("A_A_c_p_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA_A_c_u(), notification -> {
			util.newMessage();
			name2actor.get("A_object_SP4").tell(new ReferenceDeleted<TestcasesModel.A, TestcasesModel.U_s>((TestcasesModel.A) notification.getNotifier(), (TestcasesModel.U_s) notification.getOldValue(), name2actor.get("A_A_c_u_0_reference")), getSelf());
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
		if (node instanceof TestcasesModel.A) {
			util.newMessage();
			name2actor.get("A_object_SP0").tell(new ObjectDeleted<TestcasesModel.A>((TestcasesModel.A) node), getSelf());
		}
		if (node instanceof TestcasesModel.A) {
			util.newMessage();
			name2actor.get("A_object_SP1").tell(new ObjectDeleted<TestcasesModel.A>((TestcasesModel.A) node), getSelf());
		}
		if (node instanceof TestcasesModel.A) {
			util.newMessage();
			name2actor.get("A_object_SP2").tell(new ObjectDeleted<TestcasesModel.A>((TestcasesModel.A) node), getSelf());
		}
		if (node instanceof TestcasesModel.A) {
			util.newMessage();
			name2actor.get("A_object_SP3").tell(new ObjectDeleted<TestcasesModel.A>((TestcasesModel.A) node), getSelf());
		}
		if (node instanceof TestcasesModel.A) {
			util.newMessage();
			name2actor.get("A_object_SP4").tell(new ObjectDeleted<TestcasesModel.A>((TestcasesModel.A) node), getSelf());
		}
		if (node instanceof TestcasesModel.A) {
			util.newMessage();
			name2actor.get("A_object_SP5").tell(new ObjectDeleted<TestcasesModel.A>((TestcasesModel.A) node), getSelf());
		}
		if (node instanceof TestcasesModel.A) {
			util.newMessage();
			name2actor.get("A_object_SP6").tell(new ObjectDeleted<TestcasesModel.A>((TestcasesModel.A) node), getSelf());
		}
		if (node instanceof TestcasesModel.X) {
			util.newMessage();
			name2actor.get("X_object_SP0").tell(new ObjectDeleted<TestcasesModel.X>((TestcasesModel.X) node), getSelf());
		}
		if (node instanceof TestcasesModel.X) {
			util.newMessage();
			name2actor.get("X_object_SP1").tell(new ObjectDeleted<TestcasesModel.X>((TestcasesModel.X) node), getSelf());
		}
		if (node instanceof TestcasesModel.X) {
			util.newMessage();
			name2actor.get("X_object_SP2").tell(new ObjectDeleted<TestcasesModel.X>((TestcasesModel.X) node), getSelf());
		}
		if (node instanceof TestcasesModel.X) {
			util.newMessage();
			name2actor.get("X_object_SP3").tell(new ObjectDeleted<TestcasesModel.X>((TestcasesModel.X) node), getSelf());
		}
		if (node instanceof TestcasesModel.U_s) {
			util.newMessage();
			name2actor.get("U_s_object_SP0").tell(new ObjectDeleted<TestcasesModel.U_s>((TestcasesModel.U_s) node), getSelf());
		}
		if (node instanceof TestcasesModel.U_s) {
			util.newMessage();
			name2actor.get("U_s_object_SP1").tell(new ObjectDeleted<TestcasesModel.U_s>((TestcasesModel.U_s) node), getSelf());
		}
		if (node instanceof TestcasesModel.U_s) {
			util.newMessage();
			name2actor.get("U_s_object_SP2").tell(new ObjectDeleted<TestcasesModel.U_s>((TestcasesModel.U_s) node), getSelf());
		}
		if (node instanceof TestcasesModel.P_s) {
			util.newMessage();
			name2actor.get("P_s_object_SP0").tell(new ObjectDeleted<TestcasesModel.P_s>((TestcasesModel.P_s) node), getSelf());
		}
		if (node instanceof TestcasesModel.P_s) {
			util.newMessage();
			name2actor.get("P_s_object_SP1").tell(new ObjectDeleted<TestcasesModel.P_s>((TestcasesModel.P_s) node), getSelf());
		}
		if (node instanceof TestcasesModel.P_s) {
			util.newMessage();
			name2actor.get("P_s_object_SP2").tell(new ObjectDeleted<TestcasesModel.P_s>((TestcasesModel.P_s) node), getSelf());
		}
	}
}

