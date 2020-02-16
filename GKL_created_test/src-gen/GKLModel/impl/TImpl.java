/**
 */
package GKLModel.impl;

import GKLModel.GKLModelPackage;
import GKLModel.P_s;
import GKLModel.T;
import GKLModel.U_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.Agent;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.impl.TImpl#getT_x <em>Tx</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_x_u <em>Txu</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_x_p <em>Txp</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_y <em>Ty</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_y_u <em>Tyu</em>}</li>
 *   <li>{@link GKLModel.impl.TImpl#getT_y_p <em>Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImpl extends AgentImpl implements T {
	/**
	 * The cached value of the '{@link #getT_x() <em>Tx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_x()
	 * @generated
	 * @ordered
	 */
	protected Agent t_x;

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
	 * The cached value of the '{@link #getT_y() <em>Ty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_y()
	 * @generated
	 * @ordered
	 */
	protected Agent t_y;

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
	public Agent getT_x() {
		if (t_x != null && t_x.eIsProxy()) {
			InternalEObject oldT_x = (InternalEObject) t_x;
			t_x = (Agent) eResolveProxy(oldT_x);
			if (t_x != oldT_x) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TX, oldT_x, t_x));
			}
		}
		return t_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetT_x() {
		return t_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_x(Agent newT_x) {
		Agent oldT_x = t_x;
		t_x = newT_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TX, oldT_x, t_x));
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
	public Agent getT_y() {
		if (t_y != null && t_y.eIsProxy()) {
			InternalEObject oldT_y = (InternalEObject) t_y;
			t_y = (Agent) eResolveProxy(oldT_y);
			if (t_y != oldT_y) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.T__TY, oldT_y, t_y));
			}
		}
		return t_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetT_y() {
		return t_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_y(Agent newT_y) {
		Agent oldT_y = t_y;
		t_y = newT_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.T__TY, oldT_y, t_y));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GKLModelPackage.T__TX:
			if (resolve)
				return getT_x();
			return basicGetT_x();
		case GKLModelPackage.T__TXU:
			if (resolve)
				return getT_x_u();
			return basicGetT_x_u();
		case GKLModelPackage.T__TXP:
			if (resolve)
				return getT_x_p();
			return basicGetT_x_p();
		case GKLModelPackage.T__TY:
			if (resolve)
				return getT_y();
			return basicGetT_y();
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
		case GKLModelPackage.T__TX:
			setT_x((Agent) newValue);
			return;
		case GKLModelPackage.T__TXU:
			setT_x_u((U_s) newValue);
			return;
		case GKLModelPackage.T__TXP:
			setT_x_p((P_s) newValue);
			return;
		case GKLModelPackage.T__TY:
			setT_y((Agent) newValue);
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
		case GKLModelPackage.T__TX:
			setT_x((Agent) null);
			return;
		case GKLModelPackage.T__TXU:
			setT_x_u((U_s) null);
			return;
		case GKLModelPackage.T__TXP:
			setT_x_p((P_s) null);
			return;
		case GKLModelPackage.T__TY:
			setT_y((Agent) null);
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
		case GKLModelPackage.T__TX:
			return t_x != null;
		case GKLModelPackage.T__TXU:
			return t_x_u != null;
		case GKLModelPackage.T__TXP:
			return t_x_p != null;
		case GKLModelPackage.T__TY:
			return t_y != null;
		case GKLModelPackage.T__TYU:
			return t_y_u != null;
		case GKLModelPackage.T__TYP:
			return t_y_p != null;
		}
		return super.eIsSet(featureID);
	}

} //TImpl
