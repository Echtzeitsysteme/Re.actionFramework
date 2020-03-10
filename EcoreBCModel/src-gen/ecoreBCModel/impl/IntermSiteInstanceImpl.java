/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.BindingState;
import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermSite;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interm Site Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.impl.IntermSiteInstanceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteInstanceImpl#getNotBoundTo <em>Not Bound To</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteInstanceImpl#getBoundTo <em>Bound To</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteInstanceImpl#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteInstanceImpl#getState <em>State</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteInstanceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermSiteInstanceImpl extends MinimalEObjectImpl.Container implements IntermSiteInstance {
	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected IntermSite instanceOf;

	/**
	 * The cached value of the '{@link #getNotBoundTo() <em>Not Bound To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotBoundTo()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermSiteInstance> notBoundTo;

	/**
	 * The cached value of the '{@link #getBoundTo() <em>Bound To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundTo()
	 * @generated
	 * @ordered
	 */
	protected IntermSiteInstance boundTo;

	/**
	 * The default value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingState()
	 * @generated
	 * @ordered
	 */
	protected static final BindingState BINDING_STATE_EDEFAULT = BindingState.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingState()
	 * @generated
	 * @ordered
	 */
	protected BindingState bindingState = BINDING_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UNTITLED";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected IntermSiteState state;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected IntermAgentInstance parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermSiteInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreBCModelPackage.Literals.INTERM_SITE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermSite getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject) instanceOf;
			instanceOf = (IntermSite) eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreBCModelPackage.INTERM_SITE_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermSite basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOf(IntermSite newInstanceOf) {
		IntermSite oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_SITE_INSTANCE__INSTANCE_OF,
					oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermSiteInstance> getNotBoundTo() {
		if (notBoundTo == null) {
			notBoundTo = new EObjectResolvingEList<IntermSiteInstance>(IntermSiteInstance.class, this,
					EcoreBCModelPackage.INTERM_SITE_INSTANCE__NOT_BOUND_TO);
		}
		return notBoundTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermSiteInstance getBoundTo() {
		if (boundTo != null && boundTo.eIsProxy()) {
			InternalEObject oldBoundTo = (InternalEObject) boundTo;
			boundTo = (IntermSiteInstance) eResolveProxy(oldBoundTo);
			if (boundTo != oldBoundTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreBCModelPackage.INTERM_SITE_INSTANCE__BOUND_TO, oldBoundTo, boundTo));
			}
		}
		return boundTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermSiteInstance basicGetBoundTo() {
		return boundTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundTo(IntermSiteInstance newBoundTo) {
		IntermSiteInstance oldBoundTo = boundTo;
		boundTo = newBoundTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_SITE_INSTANCE__BOUND_TO,
					oldBoundTo, boundTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingState getBindingState() {
		return bindingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingState(BindingState newBindingState) {
		BindingState oldBindingState = bindingState;
		bindingState = newBindingState == null ? BINDING_STATE_EDEFAULT : newBindingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcoreBCModelPackage.INTERM_SITE_INSTANCE__BINDING_STATE, oldBindingState, bindingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_SITE_INSTANCE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermSiteState getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject) state;
			state = (IntermSiteState) eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreBCModelPackage.INTERM_SITE_INSTANCE__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermSiteState basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(IntermSiteState newState) {
		IntermSiteState oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_SITE_INSTANCE__STATE,
					oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermAgentInstance getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (IntermAgentInstance) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreBCModelPackage.INTERM_SITE_INSTANCE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermAgentInstance basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IntermAgentInstance newParent) {
		IntermAgentInstance oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_SITE_INSTANCE__PARENT,
					oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__INSTANCE_OF:
			if (resolve)
				return getInstanceOf();
			return basicGetInstanceOf();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NOT_BOUND_TO:
			return getNotBoundTo();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BOUND_TO:
			if (resolve)
				return getBoundTo();
			return basicGetBoundTo();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BINDING_STATE:
			return getBindingState();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NAME:
			return getName();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__STATE:
			if (resolve)
				return getState();
			return basicGetState();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__INSTANCE_OF:
			setInstanceOf((IntermSite) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NOT_BOUND_TO:
			getNotBoundTo().clear();
			getNotBoundTo().addAll((Collection<? extends IntermSiteInstance>) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BOUND_TO:
			setBoundTo((IntermSiteInstance) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BINDING_STATE:
			setBindingState((BindingState) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NAME:
			setName((String) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__STATE:
			setState((IntermSiteState) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__PARENT:
			setParent((IntermAgentInstance) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__INSTANCE_OF:
			setInstanceOf((IntermSite) null);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NOT_BOUND_TO:
			getNotBoundTo().clear();
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BOUND_TO:
			setBoundTo((IntermSiteInstance) null);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BINDING_STATE:
			setBindingState(BINDING_STATE_EDEFAULT);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__STATE:
			setState((IntermSiteState) null);
			return;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__PARENT:
			setParent((IntermAgentInstance) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__INSTANCE_OF:
			return instanceOf != null;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NOT_BOUND_TO:
			return notBoundTo != null && !notBoundTo.isEmpty();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BOUND_TO:
			return boundTo != null;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__BINDING_STATE:
			return bindingState != BINDING_STATE_EDEFAULT;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__STATE:
			return state != null;
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE__PARENT:
			return parent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (bindingState: ");
		result.append(bindingState);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IntermSiteInstanceImpl
