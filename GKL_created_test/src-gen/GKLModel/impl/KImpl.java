/**
 */
package GKLModel.impl;

import GKLModel.GKLModelPackage;
import GKLModel.K;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.Agent;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>K</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.impl.KImpl#getK_a <em>Ka</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KImpl extends AgentImpl implements K {
	/**
	 * The cached value of the '{@link #getK_a() <em>Ka</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK_a()
	 * @generated
	 * @ordered
	 */
	protected Agent k_a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GKLModelPackage.Literals.K;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getK_a() {
		if (k_a != null && k_a.eIsProxy()) {
			InternalEObject oldK_a = (InternalEObject) k_a;
			k_a = (Agent) eResolveProxy(oldK_a);
			if (k_a != oldK_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.K__KA, oldK_a, k_a));
			}
		}
		return k_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetK_a() {
		return k_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setK_a(Agent newK_a) {
		Agent oldK_a = k_a;
		k_a = newK_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.K__KA, oldK_a, k_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GKLModelPackage.K__KA:
			if (resolve)
				return getK_a();
			return basicGetK_a();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GKLModelPackage.K__KA:
			setK_a((Agent) newValue);
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
		case GKLModelPackage.K__KA:
			setK_a((Agent) null);
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
		case GKLModelPackage.K__KA:
			return k_a != null;
		}
		return super.eIsSet(featureID);
	}

} //KImpl
