/**
 */
package GKLModel.impl;

import GKLModel.GKLModelPackage;
import GKLModel.K;
import GKLModel.T;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>K</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.impl.KImpl#getK_a_T_x <em>KaTx</em>}</li>
 *   <li>{@link GKLModel.impl.KImpl#getK_a_T_y <em>KaTy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KImpl extends AgentImpl implements K {
	/**
	 * The cached value of the '{@link #getK_a_T_x() <em>KaTx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK_a_T_x()
	 * @generated
	 * @ordered
	 */
	protected T k_a_T_x;

	/**
	 * The cached value of the '{@link #getK_a_T_y() <em>KaTy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK_a_T_y()
	 * @generated
	 * @ordered
	 */
	protected T k_a_T_y;

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
	public T getK_a_T_x() {
		if (k_a_T_x != null && k_a_T_x.eIsProxy()) {
			InternalEObject oldK_a_T_x = (InternalEObject) k_a_T_x;
			k_a_T_x = (T) eResolveProxy(oldK_a_T_x);
			if (k_a_T_x != oldK_a_T_x) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.K__KATX, oldK_a_T_x,
							k_a_T_x));
			}
		}
		return k_a_T_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetK_a_T_x() {
		return k_a_T_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetK_a_T_x(T newK_a_T_x, NotificationChain msgs) {
		T oldK_a_T_x = k_a_T_x;
		k_a_T_x = newK_a_T_x;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GKLModelPackage.K__KATX,
					oldK_a_T_x, newK_a_T_x);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setK_a_T_x(T newK_a_T_x) {
		if (newK_a_T_x != k_a_T_x) {
			NotificationChain msgs = null;
			if (k_a_T_x != null)
				msgs = ((InternalEObject) k_a_T_x).eInverseRemove(this, GKLModelPackage.T__TXKA, T.class, msgs);
			if (newK_a_T_x != null)
				msgs = ((InternalEObject) newK_a_T_x).eInverseAdd(this, GKLModelPackage.T__TXKA, T.class, msgs);
			msgs = basicSetK_a_T_x(newK_a_T_x, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.K__KATX, newK_a_T_x, newK_a_T_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T getK_a_T_y() {
		if (k_a_T_y != null && k_a_T_y.eIsProxy()) {
			InternalEObject oldK_a_T_y = (InternalEObject) k_a_T_y;
			k_a_T_y = (T) eResolveProxy(oldK_a_T_y);
			if (k_a_T_y != oldK_a_T_y) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.K__KATY, oldK_a_T_y,
							k_a_T_y));
			}
		}
		return k_a_T_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetK_a_T_y() {
		return k_a_T_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetK_a_T_y(T newK_a_T_y, NotificationChain msgs) {
		T oldK_a_T_y = k_a_T_y;
		k_a_T_y = newK_a_T_y;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GKLModelPackage.K__KATY,
					oldK_a_T_y, newK_a_T_y);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setK_a_T_y(T newK_a_T_y) {
		if (newK_a_T_y != k_a_T_y) {
			NotificationChain msgs = null;
			if (k_a_T_y != null)
				msgs = ((InternalEObject) k_a_T_y).eInverseRemove(this, GKLModelPackage.T__TYKA, T.class, msgs);
			if (newK_a_T_y != null)
				msgs = ((InternalEObject) newK_a_T_y).eInverseAdd(this, GKLModelPackage.T__TYKA, T.class, msgs);
			msgs = basicSetK_a_T_y(newK_a_T_y, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.K__KATY, newK_a_T_y, newK_a_T_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GKLModelPackage.K__KATX:
			if (k_a_T_x != null)
				msgs = ((InternalEObject) k_a_T_x).eInverseRemove(this, GKLModelPackage.T__TXKA, T.class, msgs);
			return basicSetK_a_T_x((T) otherEnd, msgs);
		case GKLModelPackage.K__KATY:
			if (k_a_T_y != null)
				msgs = ((InternalEObject) k_a_T_y).eInverseRemove(this, GKLModelPackage.T__TYKA, T.class, msgs);
			return basicSetK_a_T_y((T) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GKLModelPackage.K__KATX:
			return basicSetK_a_T_x(null, msgs);
		case GKLModelPackage.K__KATY:
			return basicSetK_a_T_y(null, msgs);
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
		case GKLModelPackage.K__KATX:
			if (resolve)
				return getK_a_T_x();
			return basicGetK_a_T_x();
		case GKLModelPackage.K__KATY:
			if (resolve)
				return getK_a_T_y();
			return basicGetK_a_T_y();
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
		case GKLModelPackage.K__KATX:
			setK_a_T_x((T) newValue);
			return;
		case GKLModelPackage.K__KATY:
			setK_a_T_y((T) newValue);
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
		case GKLModelPackage.K__KATX:
			setK_a_T_x((T) null);
			return;
		case GKLModelPackage.K__KATY:
			setK_a_T_y((T) null);
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
		case GKLModelPackage.K__KATX:
			return k_a_T_x != null;
		case GKLModelPackage.K__KATY:
			return k_a_T_y != null;
		}
		return super.eIsSet(featureID);
	}

} //KImpl
