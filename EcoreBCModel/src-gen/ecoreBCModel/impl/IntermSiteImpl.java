/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermSite;
import ecoreBCModel.IntermSiteState;

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
 * An implementation of the model object '<em><b>Interm Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.impl.IntermSiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteImpl#getSiteStates <em>Site States</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermSiteImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermSiteImpl extends MinimalEObjectImpl.Container implements IntermSite {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getSiteStates() <em>Site States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermSiteState> siteStates;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected IntermAgent parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreBCModelPackage.Literals.INTERM_SITE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_SITE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermSiteState> getSiteStates() {
		if (siteStates == null) {
			siteStates = new EObjectContainmentEList<IntermSiteState>(IntermSiteState.class, this,
					EcoreBCModelPackage.INTERM_SITE__SITE_STATES);
		}
		return siteStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermAgent getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (IntermAgent) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreBCModelPackage.INTERM_SITE__PARENT,
							oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermAgent basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IntermAgent newParent) {
		IntermAgent oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_SITE__PARENT, oldParent,
					parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_SITE__SITE_STATES:
			return ((InternalEList<?>) getSiteStates()).basicRemove(otherEnd, msgs);
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
		case EcoreBCModelPackage.INTERM_SITE__NAME:
			return getName();
		case EcoreBCModelPackage.INTERM_SITE__SITE_STATES:
			return getSiteStates();
		case EcoreBCModelPackage.INTERM_SITE__PARENT:
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
		case EcoreBCModelPackage.INTERM_SITE__NAME:
			setName((String) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE__SITE_STATES:
			getSiteStates().clear();
			getSiteStates().addAll((Collection<? extends IntermSiteState>) newValue);
			return;
		case EcoreBCModelPackage.INTERM_SITE__PARENT:
			setParent((IntermAgent) newValue);
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
		case EcoreBCModelPackage.INTERM_SITE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcoreBCModelPackage.INTERM_SITE__SITE_STATES:
			getSiteStates().clear();
			return;
		case EcoreBCModelPackage.INTERM_SITE__PARENT:
			setParent((IntermAgent) null);
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
		case EcoreBCModelPackage.INTERM_SITE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcoreBCModelPackage.INTERM_SITE__SITE_STATES:
			return siteStates != null && !siteStates.isEmpty();
		case EcoreBCModelPackage.INTERM_SITE__PARENT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IntermSiteImpl
