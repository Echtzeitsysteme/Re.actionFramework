/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermSiteInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interm Agent Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.impl.IntermAgentInstanceImpl#getSiteInstances <em>Site Instances</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermAgentInstanceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermAgentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermAgentInstanceImpl#isLocal <em>Local</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermAgentInstanceImpl extends MinimalEObjectImpl.Container implements IntermAgentInstance {
	/**
	 * The cached value of the '{@link #getSiteInstances() <em>Site Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermSiteInstance> siteInstances;

	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected IntermAgent instanceOf;

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
	 * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean local = LOCAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermAgentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreBCModelPackage.Literals.INTERM_AGENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermSiteInstance> getSiteInstances() {
		if (siteInstances == null) {
			siteInstances = new EObjectContainmentEList<IntermSiteInstance>(IntermSiteInstance.class, this,
					EcoreBCModelPackage.INTERM_AGENT_INSTANCE__SITE_INSTANCES);
		}
		return siteInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermAgent getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject) instanceOf;
			instanceOf = (IntermAgent) eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreBCModelPackage.INTERM_AGENT_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermAgent basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOf(IntermAgent newInstanceOf) {
		IntermAgent oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcoreBCModelPackage.INTERM_AGENT_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_AGENT_INSTANCE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocal(boolean newLocal) {
		boolean oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_AGENT_INSTANCE__LOCAL,
					oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__SITE_INSTANCES:
			return ((InternalEList<?>) getSiteInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__SITE_INSTANCES:
			return getSiteInstances();
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__INSTANCE_OF:
			if (resolve)
				return getInstanceOf();
			return basicGetInstanceOf();
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__NAME:
			return getName();
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__LOCAL:
			return isLocal();
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
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__SITE_INSTANCES:
			getSiteInstances().clear();
			getSiteInstances().addAll((Collection<? extends IntermSiteInstance>) newValue);
			return;
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__INSTANCE_OF:
			setInstanceOf((IntermAgent) newValue);
			return;
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__NAME:
			setName((String) newValue);
			return;
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__LOCAL:
			setLocal((Boolean) newValue);
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
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__SITE_INSTANCES:
			getSiteInstances().clear();
			return;
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__INSTANCE_OF:
			setInstanceOf((IntermAgent) null);
			return;
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__LOCAL:
			setLocal(LOCAL_EDEFAULT);
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
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__SITE_INSTANCES:
			return siteInstances != null && !siteInstances.isEmpty();
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__INSTANCE_OF:
			return instanceOf != null;
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE__LOCAL:
			return local != LOCAL_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", local: ");
		result.append(local);
		result.append(')');
		return result.toString();
	}

} //IntermAgentInstanceImpl
