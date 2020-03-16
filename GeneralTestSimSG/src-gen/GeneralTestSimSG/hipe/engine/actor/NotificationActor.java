package GeneralTestSimSG.hipe.engine.actor;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;

import hipe.generic.actor.junction.util.HiPEConfig;

public class NotificationActor extends AbstractActor {
	
	private Queue<Notification> notificationCache = new LinkedBlockingQueue<Notification>();
	private ActorRef dispatchActor;
	private Set<Object> discoveredObjects = Collections.synchronizedSet(new LinkedHashSet<>());
	
	private Map<Object, Function<EObject, Collection<EObject>>> explorationConsumer = new HashMap<>();
	
	private int counter = 0;
	public long time = 0;
	public long tell_time = 0;
	
	public NotificationActor(ActorRef dispatchActor) {
		this.dispatchActor = dispatchActor;
		initializeExploration();
	}
	
	private void initializeExploration() {
		explorationConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getA(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getX(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getU_s(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getAgent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getT(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(TestcasesModel.TestcasesModelPackage.eINSTANCE.getP_s(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(reactionContainer.ReactionContainerPackage.eINSTANCE.getContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			reactionContainer.Container _container = (reactionContainer.Container) obj;
			children.addAll(_container.getStates());
			children.addAll(_container.getAgents());
			return children;
		});
	}
	
	@Override
	public void preStart() throws Exception {

		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.loggingActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("NotificationNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationMessage.class, this::handleNotification) //
				.match(NoMoreInput.class, this::processNotifications) //
				.build();
	}
	
	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */
	public void handleNotification(NotificationMessage notification) {
		long tic = System.nanoTime();
		counter++;
		resolveNotification(notification.notification);
		getSender().tell(true, getSelf());
		time += System.nanoTime() - tic;
	}
	
	public void processNotifications(NoMoreInput msg) {
		long tic = System.nanoTime();
		long tell_tic = System.nanoTime();
		while(!notificationCache.isEmpty()) {
			dispatchActor.tell(notificationCache.poll(), getSelf());
		}
		dispatchActor.tell(msg, getSelf());
		discoveredObjects = Collections.synchronizedSet(new LinkedHashSet<>());
	}
	
	private void resolveNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD: {
			if(notification.getNewValue() instanceof Resource) {
				resolveAddResource(notification);
			}else {
				resolveAdd(notification);
			}
			break;
		}
		case Notification.REMOVE: {
			resolveRemove(notification);
			break;
		}
		case Notification.REMOVING_ADAPTER: {
			resolveRemoveAdapter(notification);
			break;
		}
		case Notification.RESOLVE: {
			throw new RuntimeException("Notification type RESOLVE not supported");
		}
		case Notification.SET: {
			resolveSet(notification);
			break;
		}
		case Notification.UNSET: {
			throw new RuntimeException("Notification type UNSET not supported");
		}
		case Notification.MOVE: {
			throw new RuntimeException("Notification type MOVE not supported");
		}
		case Notification.ADD_MANY: {
			resolveAddMany(notification);
			break;
		}
		case Notification.REMOVE_MANY: {
			resolveRemoveMany(notification);
			break;
		}
		default: throw new RuntimeException("Notification type id("+notification.getEventType()+") not supported");
		
		}
	}
	
	private void resolveAddResource(Notification notification) {
		Resource r = (Resource) notification.getNewValue();
		r.getContents().forEach(node -> {
			explore(node);
		});
	}
	
	private void explore(EObject rootObj) {

		if(rootObj == null) 
			return;
		
		Notification rootNotify = new ENotificationImpl(castMaybe(rootObj), Notification.ADD, null, null, rootObj);
		if(!discoveredObjects.contains(rootObj)) {
			notificationCache.add(rootNotify);
			discoveredObjects.add(rootObj);
		}
		
		Queue<EObject> frontier = new LinkedList<>();
		frontier.addAll(explorationConsumer.get(rootObj.eClass()).apply(rootObj));
		while(!frontier.isEmpty()) {
			EObject child = frontier.poll();
			Notification childNotify = new ENotificationImpl(castMaybe(child), Notification.ADD, null, null, child);
			if(!discoveredObjects.contains(child)) {
				notificationCache.add(childNotify);
				discoveredObjects.add(child);
			}
			frontier.addAll(explorationConsumer.get(child.eClass()).apply(child));
		}
	}
	
	private void resolveAdd(Notification notification) {
		EObject node = (EObject) notification.getNewValue();
		if(node == null) {
			return;
		}
		
		notificationCache.add(notification);
		explore(node);
		
	}
	
	private void resolveAddMany(Notification notification) {
		@SuppressWarnings("unchecked")
		List<EObject> addedNodes = (List<EObject>)notification.getNewValue();
		addedNodes.parallelStream().forEach(addedNode -> {
			Notification notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.ADD, (EReference)notification.getFeature(), null, addedNode);
			resolveAdd(notify);
		});
	}
	
	private void resolveRemove(Notification notification) {
		notificationCache.add(notification);
	}
	
	private void resolveRemoveMany(Notification notification) {
		@SuppressWarnings("unchecked")
		List<EObject> removedNodes = (List<EObject>)notification.getOldValue();
		for(EObject removedNode : removedNodes) {
			Notification notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.REMOVE, (EReference)notification.getFeature(), removedNode, null);
			resolveRemove(notify);
		}
	}
	
	private void resolveRemoveAdapter(Notification notification) {
		EContentAdapter adapter = (EContentAdapter)notification.getOldValue();
		if(adapter == null)
			return;
		notificationCache.add(notification);
	}
	
	private void resolveSet(Notification notification) {
		if(notification.getFeature() != null && notification.getFeature() instanceof EReference) {
			Notification notify = null;
			if(notification.getNewValue() == null) {
				notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.REMOVE, (EReference)notification.getFeature(), notification.getOldValue() , null);
				resolveRemove(notify);
			} else {
				notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.ADD, (EReference)notification.getFeature(), null , notification.getNewValue());
				resolveAdd(notify);
			}
			
		}else {
			notificationCache.add(notification);
		}
		
	}
	
	private static InternalEObject castMaybe(Object o) {
		if(o instanceof InternalEObject) {
			return (InternalEObject)o;
		}else {
			return null;
		}
	}

}

