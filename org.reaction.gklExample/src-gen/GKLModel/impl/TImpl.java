/**
 */
package GKLModel.impl;

import GKLModel.GKLModelPackage;
import GKLModel.K;
import GKLModel.P;
import GKLModel.P_s;
import GKLModel.T;
import GKLModel.U_s;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.impl.TImpl#getT_x_P_a <em>TxPa</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_y_P_a <em>TyPa</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_x_K_a <em>TxKa</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_x_u <em>Txu</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_x_p <em>Txp</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_y_K_a <em>TyKa</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_y_u <em>Tyu</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_y_p <em>Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImpl extends AgentImpl implements T {
	/**
	 * The cached value of the '{@link #getT_x_P_a() <em>TxPa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x_P_a()
	 * @generated
	 * @ordered
	 */
	protected P t_x_P_a;

	/**
	 * The cached value of the '{@link #getT_y_P_a() <em>TyPa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y_P_a()
	 * @generated
	 * @ordered
	 */
	protected P t_y_P_a;

	/**
	 * The cached value of the '{@link #getT_x_K_a() <em>TxKa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x_K_a()
	 * @generated
	 * @ordered
	 */
	protected K t_x_K_a;

	/**
	 * The cached value of the '{@link #getT_x_u() <em>Txu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x_u()
	 * @generated
	 * @ordered
	 */
	protected U_s t_x_u;

	/**
	 * The cached value of the '{@link #getT_x_p() <em>Txp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x_p()
	 * @generated
	 * @ordered
	 */
	protected P_s t_x_p;

	/**
	 * The cached value of the '{@link #getT_y_K_a() <em>TyKa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y_K_a()
	 * @generated
	 * @ordered
	 */
	protected K t_y_K_a;

	/**
	 * The cached value of the '{@link #getT_y_u() <em>Tyu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y_u()
	 * @generated
	 * @ordered
	 */
	protected U_s t_y_u;

	/**
	 * The cached value of the '{@link #getT_y_p() <em>Typ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y_p()
	 * @generated
	 * @ordered
	 */
	protected P_s t_y_p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GKLModelPackage.Literals.T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P getT_x_P_a() {
		if (t_x_P_a != null && t_x_P_a.eIsProxy()) {
			InternalEObject oldT_x_P_a = (InternalEObject) t_x_P_a;
			t_x_P_a = (P) eResolveProxy(oldT_x_P_a);
			if (t_x_P_a != oldT_x_P_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TXPA, oldT_x_P_a,
							t_x_P_a));
			}
		}
		return t_x_P_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P basicGetT_x_P_a() {
		return t_x_P_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT_x_P_a(P newT_x_P_a, NotificationChain msgs) {
		P oldT_x_P_a = t_x_P_a;
		t_x_P_a = newT_x_P_a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TXPA,
					oldT_x_P_a, newT_x_P_a);
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
	public void setT_x_P_a(P newT_x_P_a) {
		if (newT_x_P_a != t_x_P_a) {
			NotificationChain msgs = null;
			if (t_x_P_a != null)
				msgs = ((InternalEObject) t_x_P_a).eInverseRemove(this, GKLModelPackage.P__PATX, P.class, msgs);
			if (newT_x_P_a != null)
				msgs = ((InternalEObject) newT_x_P_a).eInverseAdd(this, GKLModelPackage.P__PATX, P.class, msgs);
			msgs = basicSetT_x_P_a(newT_x_P_a, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TXPA, newT_x_P_a, newT_x_P_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P getT_y_P_a() {
		if (t_y_P_a != null && t_y_P_a.eIsProxy()) {
			InternalEObject oldT_y_P_a = (InternalEObject) t_y_P_a;
			t_y_P_a = (P) eResolveProxy(oldT_y_P_a);
			if (t_y_P_a != oldT_y_P_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TYPA, oldT_y_P_a,
							t_y_P_a));
			}
		}
		return t_y_P_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P basicGetT_y_P_a() {
		return t_y_P_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT_y_P_a(P newT_y_P_a, NotificationChain msgs) {
		P oldT_y_P_a = t_y_P_a;
		t_y_P_a = newT_y_P_a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TYPA,
					oldT_y_P_a, newT_y_P_a);
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
	public void setT_y_P_a(P newT_y_P_a) {
		if (newT_y_P_a != t_y_P_a) {
			NotificationChain msgs = null;
			if (t_y_P_a != null)
				msgs = ((InternalEObject) t_y_P_a).eInverseRemove(this, GKLModelPackage.P__PATY, P.class, msgs);
			if (newT_y_P_a != null)
				msgs = ((InternalEObject) newT_y_P_a).eInverseAdd(this, GKLModelPackage.P__PATY, P.class, msgs);
			msgs = basicSetT_y_P_a(newT_y_P_a, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TYPA, newT_y_P_a, newT_y_P_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public K getT_x_K_a() {
		if (t_x_K_a != null && t_x_K_a.eIsProxy()) {
			InternalEObject oldT_x_K_a = (InternalEObject) t_x_K_a;
			t_x_K_a = (K) eResolveProxy(oldT_x_K_a);
			if (t_x_K_a != oldT_x_K_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TXKA, oldT_x_K_a,
							t_x_K_a));
			}
		}
		return t_x_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K basicGetT_x_K_a() {
		return t_x_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT_x_K_a(K newT_x_K_a, NotificationChain msgs) {
		K oldT_x_K_a = t_x_K_a;
		t_x_K_a = newT_x_K_a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TXKA,
					oldT_x_K_a, newT_x_K_a);
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
	public void setT_x_K_a(K newT_x_K_a) {
		if (newT_x_K_a != t_x_K_a) {
			NotificationChain msgs = null;
			if (t_x_K_a != null)
				msgs = ((InternalEObject) t_x_K_a).eInverseRemove(this, GKLModelPackage.K__KATX, K.class, msgs);
			if (newT_x_K_a != null)
				msgs = ((InternalEObject) newT_x_K_a).eInverseAdd(this, GKLModelPackage.K__KATX, K.class, msgs);
			msgs = basicSetT_x_K_a(newT_x_K_a, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TXKA, newT_x_K_a, newT_x_K_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getT_x_u() {
		if (t_x_u != null && t_x_u.eIsProxy()) {
			InternalEObject oldT_x_u = (InternalEObject) t_x_u;
			t_x_u = (U_s) eResolveProxy(oldT_x_u);
			if (t_x_u != oldT_x_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TXU, oldT_x_u, t_x_u));
			}
		}
		return t_x_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetT_x_u() {
		return t_x_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_x_u(U_s newT_x_u) {
		U_s oldT_x_u = t_x_u;
		t_x_u = newT_x_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TXU, oldT_x_u, t_x_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getT_x_p() {
		if (t_x_p != null && t_x_p.eIsProxy()) {
			InternalEObject oldT_x_p = (InternalEObject) t_x_p;
			t_x_p = (P_s) eResolveProxy(oldT_x_p);
			if (t_x_p != oldT_x_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TXP, oldT_x_p, t_x_p));
			}
		}
		return t_x_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetT_x_p() {
		return t_x_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_x_p(P_s newT_x_p) {
		P_s oldT_x_p = t_x_p;
		t_x_p = newT_x_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TXP, oldT_x_p, t_x_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public K getT_y_K_a() {
		if (t_y_K_a != null && t_y_K_a.eIsProxy()) {
			InternalEObject oldT_y_K_a = (InternalEObject) t_y_K_a;
			t_y_K_a = (K) eResolveProxy(oldT_y_K_a);
			if (t_y_K_a != oldT_y_K_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TYKA, oldT_y_K_a,
							t_y_K_a));
			}
		}
		return t_y_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K basicGetT_y_K_a() {
		return t_y_K_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT_y_K_a(K newT_y_K_a, NotificationChain msgs) {
		K oldT_y_K_a = t_y_K_a;
		t_y_K_a = newT_y_K_a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TYKA,
					oldT_y_K_a, newT_y_K_a);
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
	public void setT_y_K_a(K newT_y_K_a) {
		if (newT_y_K_a != t_y_K_a) {
			NotificationChain msgs = null;
			if (t_y_K_a != null)
				msgs = ((InternalEObject) t_y_K_a).eInverseRemove(this, GKLModelPackage.K__KATY, K.class, msgs);
			if (newT_y_K_a != null)
				msgs = ((InternalEObject) newT_y_K_a).eInverseAdd(this, GKLModelPackage.K__KATY, K.class, msgs);
			msgs = basicSetT_y_K_a(newT_y_K_a, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TYKA, newT_y_K_a, newT_y_K_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getT_y_u() {
		if (t_y_u != null && t_y_u.eIsProxy()) {
			InternalEObject oldT_y_u = (InternalEObject) t_y_u;
			t_y_u = (U_s) eResolveProxy(oldT_y_u);
			if (t_y_u != oldT_y_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TYU, oldT_y_u, t_y_u));
			}
		}
		return t_y_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetT_y_u() {
		return t_y_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_y_u(U_s newT_y_u) {
		U_s oldT_y_u = t_y_u;
		t_y_u = newT_y_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TYU, oldT_y_u, t_y_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getT_y_p() {
		if (t_y_p != null && t_y_p.eIsProxy()) {
			InternalEObject oldT_y_p = (InternalEObject) t_y_p;
			t_y_p = (P_s) eResolveProxy(oldT_y_p);
			if (t_y_p != oldT_y_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TYP, oldT_y_p, t_y_p));
			}
		}
		return t_y_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetT_y_p() {
		return t_y_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_y_p(P_s newT_y_p) {
		P_s oldT_y_p = t_y_p;
		t_y_p = newT_y_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TYP, oldT_y_p, t_y_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GKLModelPackage.T__TXPA:
			if (t_x_P_a != null)
				msgs = ((InternalEObject) t_x_P_a).eInverseRemove(this, GKLModelPackage.P__PATX, P.class, msgs);
			return basicSetT_x_P_a((P) otherEnd, msgs);
		case GKLModelPackage.T__TYPA:
			if (t_y_P_a != null)
				msgs = ((InternalEObject) t_y_P_a).eInverseRemove(this, GKLModelPackage.P__PATY, P.class, msgs);
			return basicSetT_y_P_a((P) otherEnd, msgs);
		case GKLModelPackage.T__TXKA:
			if (t_x_K_a != null)
				msgs = ((InternalEObject) t_x_K_a).eInverseRemove(this, GKLModelPackage.K__KATX, K.class, msgs);
			return basicSetT_x_K_a((K) otherEnd, msgs);
		case GKLModelPackage.T__TYKA:
			if (t_y_K_a != null)
				msgs = ((InternalEObject) t_y_K_a).eInverseRemove(this, GKLModelPackage.K__KATY, K.class, msgs);
			return basicSetT_y_K_a((K) otherEnd, msgs);
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
		case GKLModelPackage.T__TXPA:
			return basicSetT_x_P_a(null, msgs);
		case GKLModelPackage.T__TYPA:
			return basicSetT_y_P_a(null, msgs);
		case GKLModelPackage.T__TXKA:
			return basicSetT_x_K_a(null, msgs);
		case GKLModelPackage.T__TYKA:
			return basicSetT_y_K_a(null, msgs);
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
		case GKLModelPackage.T__TXPA:
			if (resolve)
				return getT_x_P_a();
			return basicGetT_x_P_a();
		case GKLModelPackage.T__TYPA:
			if (resolve)
				return getT_y_P_a();
			return basicGetT_y_P_a();
		case GKLModelPackage.T__TXKA:
			if (resolve)
				return getT_x_K_a();
			return basicGetT_x_K_a();
		case GKLModelPackage.T__TXU:
			if (resolve)
				return getT_x_u();
			return basicGetT_x_u();
		case GKLModelPackage.T__TXP:
			if (resolve)
				return getT_x_p();
			return basicGetT_x_p();
		case GKLModelPackage.T__TYKA:
			if (resolve)
				return getT_y_K_a();
			return basicGetT_y_K_a();
		case GKLModelPackage.T__TYU:
			if (resolve)
				return getT_y_u();
			return basicGetT_y_u();
		case GKLModelPackage.T__TYP:
			if (resolve)
				return getT_y_p();
			return basicGetT_y_p();
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
		case GKLModelPackage.T__TXPA:
			setT_x_P_a((P) newValue);
			return;
		case GKLModelPackage.T__TYPA:
			setT_y_P_a((P) newValue);
			return;
		case GKLModelPackage.T__TXKA:
			setT_x_K_a((K) newValue);
			return;
		case GKLModelPackage.T__TXU:
			setT_x_u((U_s) newValue);
			return;
		case GKLModelPackage.T__TXP:
			setT_x_p((P_s) newValue);
			return;
		case GKLModelPackage.T__TYKA:
			setT_y_K_a((K) newValue);
			return;
		case GKLModelPackage.T__TYU:
			setT_y_u((U_s) newValue);
			return;
		case GKLModelPackage.T__TYP:
			setT_y_p((P_s) newValue);
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
		case GKLModelPackage.T__TXPA:
			setT_x_P_a((P) null);
			return;
		case GKLModelPackage.T__TYPA:
			setT_y_P_a((P) null);
			return;
		case GKLModelPackage.T__TXKA:
			setT_x_K_a((K) null);
			return;
		case GKLModelPackage.T__TXU:
			setT_x_u((U_s) null);
			return;
		case GKLModelPackage.T__TXP:
			setT_x_p((P_s) null);
			return;
		case GKLModelPackage.T__TYKA:
			setT_y_K_a((K) null);
			return;
		case GKLModelPackage.T__TYU:
			setT_y_u((U_s) null);
			return;
		case GKLModelPackage.T__TYP:
			setT_y_p((P_s) null);
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
		case GKLModelPackage.T__TXPA:
			return t_x_P_a != null;
		case GKLModelPackage.T__TYPA:
			return t_y_P_a != null;
		case GKLModelPackage.T__TXKA:
			return t_x_K_a != null;
		case GKLModelPackage.T__TXU:
			return t_x_u != null;
		case GKLModelPackage.T__TXP:
			return t_x_p != null;
		case GKLModelPackage.T__TYKA:
			return t_y_K_a != null;
		case GKLModelPackage.T__TYU:
			return t_y_u != null;
		case GKLModelPackage.T__TYP:
			return t_y_p != null;
		}
		return super.eIsSet(featureID);
	}

} //TImpl
