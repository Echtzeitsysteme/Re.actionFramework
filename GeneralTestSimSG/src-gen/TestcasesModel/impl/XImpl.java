/**
 */
package TestcasesModel.impl;

import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.TestcasesModelPackage;
import TestcasesModel.U_s;
import TestcasesModel.X;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_A_b <em>XzAb</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_y_A_b <em>XyAb</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_A_c <em>XzAc</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_y_A_c <em>XyAc</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_u <em>Xzu</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_p <em>Xzp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XImpl extends AgentImpl implements X {
	/**
	 * The cached value of the '{@link #getX_z_A_b() <em>XzAb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_z_A_b()
	 * @generated
	 * @ordered
	 */
	protected A x_z_A_b;

	/**
	 * The cached value of the '{@link #getX_y_A_b() <em>XyAb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_y_A_b()
	 * @generated
	 * @ordered
	 */
	protected A x_y_A_b;

	/**
	 * The cached value of the '{@link #getX_z_A_c() <em>XzAc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_z_A_c()
	 * @generated
	 * @ordered
	 */
	protected A x_z_A_c;

	/**
	 * The cached value of the '{@link #getX_y_A_c() <em>XyAc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_y_A_c()
	 * @generated
	 * @ordered
	 */
	protected A x_y_A_c;

	/**
	 * The cached value of the '{@link #getX_z_u() <em>Xzu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_z_u()
	 * @generated
	 * @ordered
	 */
	protected U_s x_z_u;

	/**
	 * The cached value of the '{@link #getX_z_p() <em>Xzp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_z_p()
	 * @generated
	 * @ordered
	 */
	protected P_s x_z_p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcasesModelPackage.Literals.X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A getX_z_A_b() {
		if (x_z_A_b != null && x_z_A_b.eIsProxy()) {
			InternalEObject oldX_z_A_b = (InternalEObject) x_z_A_b;
			x_z_A_b = (A) eResolveProxy(oldX_z_A_b);
			if (x_z_A_b != oldX_z_A_b) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XZAB, oldX_z_A_b,
							x_z_A_b));
			}
		}
		return x_z_A_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetX_z_A_b() {
		return x_z_A_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX_z_A_b(A newX_z_A_b, NotificationChain msgs) {
		A oldX_z_A_b = x_z_A_b;
		x_z_A_b = newX_z_A_b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TestcasesModelPackage.X__XZAB, oldX_z_A_b, newX_z_A_b);
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
	public void setX_z_A_b(A newX_z_A_b) {
		if (newX_z_A_b != x_z_A_b) {
			NotificationChain msgs = null;
			if (x_z_A_b != null)
				msgs = ((InternalEObject) x_z_A_b).eInverseRemove(this, TestcasesModelPackage.A__ABXZ, A.class, msgs);
			if (newX_z_A_b != null)
				msgs = ((InternalEObject) newX_z_A_b).eInverseAdd(this, TestcasesModelPackage.A__ABXZ, A.class, msgs);
			msgs = basicSetX_z_A_b(newX_z_A_b, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XZAB, newX_z_A_b,
					newX_z_A_b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A getX_y_A_b() {
		if (x_y_A_b != null && x_y_A_b.eIsProxy()) {
			InternalEObject oldX_y_A_b = (InternalEObject) x_y_A_b;
			x_y_A_b = (A) eResolveProxy(oldX_y_A_b);
			if (x_y_A_b != oldX_y_A_b) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XYAB, oldX_y_A_b,
							x_y_A_b));
			}
		}
		return x_y_A_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetX_y_A_b() {
		return x_y_A_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX_y_A_b(A newX_y_A_b, NotificationChain msgs) {
		A oldX_y_A_b = x_y_A_b;
		x_y_A_b = newX_y_A_b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TestcasesModelPackage.X__XYAB, oldX_y_A_b, newX_y_A_b);
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
	public void setX_y_A_b(A newX_y_A_b) {
		if (newX_y_A_b != x_y_A_b) {
			NotificationChain msgs = null;
			if (x_y_A_b != null)
				msgs = ((InternalEObject) x_y_A_b).eInverseRemove(this, TestcasesModelPackage.A__ABXY, A.class, msgs);
			if (newX_y_A_b != null)
				msgs = ((InternalEObject) newX_y_A_b).eInverseAdd(this, TestcasesModelPackage.A__ABXY, A.class, msgs);
			msgs = basicSetX_y_A_b(newX_y_A_b, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XYAB, newX_y_A_b,
					newX_y_A_b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A getX_z_A_c() {
		if (x_z_A_c != null && x_z_A_c.eIsProxy()) {
			InternalEObject oldX_z_A_c = (InternalEObject) x_z_A_c;
			x_z_A_c = (A) eResolveProxy(oldX_z_A_c);
			if (x_z_A_c != oldX_z_A_c) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XZAC, oldX_z_A_c,
							x_z_A_c));
			}
		}
		return x_z_A_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetX_z_A_c() {
		return x_z_A_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX_z_A_c(A newX_z_A_c, NotificationChain msgs) {
		A oldX_z_A_c = x_z_A_c;
		x_z_A_c = newX_z_A_c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TestcasesModelPackage.X__XZAC, oldX_z_A_c, newX_z_A_c);
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
	public void setX_z_A_c(A newX_z_A_c) {
		if (newX_z_A_c != x_z_A_c) {
			NotificationChain msgs = null;
			if (x_z_A_c != null)
				msgs = ((InternalEObject) x_z_A_c).eInverseRemove(this, TestcasesModelPackage.A__ACXZ, A.class, msgs);
			if (newX_z_A_c != null)
				msgs = ((InternalEObject) newX_z_A_c).eInverseAdd(this, TestcasesModelPackage.A__ACXZ, A.class, msgs);
			msgs = basicSetX_z_A_c(newX_z_A_c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XZAC, newX_z_A_c,
					newX_z_A_c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A getX_y_A_c() {
		if (x_y_A_c != null && x_y_A_c.eIsProxy()) {
			InternalEObject oldX_y_A_c = (InternalEObject) x_y_A_c;
			x_y_A_c = (A) eResolveProxy(oldX_y_A_c);
			if (x_y_A_c != oldX_y_A_c) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XYAC, oldX_y_A_c,
							x_y_A_c));
			}
		}
		return x_y_A_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetX_y_A_c() {
		return x_y_A_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX_y_A_c(A newX_y_A_c, NotificationChain msgs) {
		A oldX_y_A_c = x_y_A_c;
		x_y_A_c = newX_y_A_c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TestcasesModelPackage.X__XYAC, oldX_y_A_c, newX_y_A_c);
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
	public void setX_y_A_c(A newX_y_A_c) {
		if (newX_y_A_c != x_y_A_c) {
			NotificationChain msgs = null;
			if (x_y_A_c != null)
				msgs = ((InternalEObject) x_y_A_c).eInverseRemove(this, TestcasesModelPackage.A__ACXY, A.class, msgs);
			if (newX_y_A_c != null)
				msgs = ((InternalEObject) newX_y_A_c).eInverseAdd(this, TestcasesModelPackage.A__ACXY, A.class, msgs);
			msgs = basicSetX_y_A_c(newX_y_A_c, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XYAC, newX_y_A_c,
					newX_y_A_c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getX_z_u() {
		if (x_z_u != null && x_z_u.eIsProxy()) {
			InternalEObject oldX_z_u = (InternalEObject) x_z_u;
			x_z_u = (U_s) eResolveProxy(oldX_z_u);
			if (x_z_u != oldX_z_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XZU, oldX_z_u,
							x_z_u));
			}
		}
		return x_z_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetX_z_u() {
		return x_z_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX_z_u(U_s newX_z_u) {
		U_s oldX_z_u = x_z_u;
		x_z_u = newX_z_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XZU, oldX_z_u, x_z_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getX_z_p() {
		if (x_z_p != null && x_z_p.eIsProxy()) {
			InternalEObject oldX_z_p = (InternalEObject) x_z_p;
			x_z_p = (P_s) eResolveProxy(oldX_z_p);
			if (x_z_p != oldX_z_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XZP, oldX_z_p,
							x_z_p));
			}
		}
		return x_z_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetX_z_p() {
		return x_z_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX_z_p(P_s newX_z_p) {
		P_s oldX_z_p = x_z_p;
		x_z_p = newX_z_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XZP, oldX_z_p, x_z_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestcasesModelPackage.X__XZAB:
			if (x_z_A_b != null)
				msgs = ((InternalEObject) x_z_A_b).eInverseRemove(this, TestcasesModelPackage.A__ABXZ, A.class, msgs);
			return basicSetX_z_A_b((A) otherEnd, msgs);
		case TestcasesModelPackage.X__XYAB:
			if (x_y_A_b != null)
				msgs = ((InternalEObject) x_y_A_b).eInverseRemove(this, TestcasesModelPackage.A__ABXY, A.class, msgs);
			return basicSetX_y_A_b((A) otherEnd, msgs);
		case TestcasesModelPackage.X__XZAC:
			if (x_z_A_c != null)
				msgs = ((InternalEObject) x_z_A_c).eInverseRemove(this, TestcasesModelPackage.A__ACXZ, A.class, msgs);
			return basicSetX_z_A_c((A) otherEnd, msgs);
		case TestcasesModelPackage.X__XYAC:
			if (x_y_A_c != null)
				msgs = ((InternalEObject) x_y_A_c).eInverseRemove(this, TestcasesModelPackage.A__ACXY, A.class, msgs);
			return basicSetX_y_A_c((A) otherEnd, msgs);
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
		case TestcasesModelPackage.X__XZAB:
			return basicSetX_z_A_b(null, msgs);
		case TestcasesModelPackage.X__XYAB:
			return basicSetX_y_A_b(null, msgs);
		case TestcasesModelPackage.X__XZAC:
			return basicSetX_z_A_c(null, msgs);
		case TestcasesModelPackage.X__XYAC:
			return basicSetX_y_A_c(null, msgs);
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
		case TestcasesModelPackage.X__XZAB:
			if (resolve)
				return getX_z_A_b();
			return basicGetX_z_A_b();
		case TestcasesModelPackage.X__XYAB:
			if (resolve)
				return getX_y_A_b();
			return basicGetX_y_A_b();
		case TestcasesModelPackage.X__XZAC:
			if (resolve)
				return getX_z_A_c();
			return basicGetX_z_A_c();
		case TestcasesModelPackage.X__XYAC:
			if (resolve)
				return getX_y_A_c();
			return basicGetX_y_A_c();
		case TestcasesModelPackage.X__XZU:
			if (resolve)
				return getX_z_u();
			return basicGetX_z_u();
		case TestcasesModelPackage.X__XZP:
			if (resolve)
				return getX_z_p();
			return basicGetX_z_p();
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
		case TestcasesModelPackage.X__XZAB:
			setX_z_A_b((A) newValue);
			return;
		case TestcasesModelPackage.X__XYAB:
			setX_y_A_b((A) newValue);
			return;
		case TestcasesModelPackage.X__XZAC:
			setX_z_A_c((A) newValue);
			return;
		case TestcasesModelPackage.X__XYAC:
			setX_y_A_c((A) newValue);
			return;
		case TestcasesModelPackage.X__XZU:
			setX_z_u((U_s) newValue);
			return;
		case TestcasesModelPackage.X__XZP:
			setX_z_p((P_s) newValue);
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
		case TestcasesModelPackage.X__XZAB:
			setX_z_A_b((A) null);
			return;
		case TestcasesModelPackage.X__XYAB:
			setX_y_A_b((A) null);
			return;
		case TestcasesModelPackage.X__XZAC:
			setX_z_A_c((A) null);
			return;
		case TestcasesModelPackage.X__XYAC:
			setX_y_A_c((A) null);
			return;
		case TestcasesModelPackage.X__XZU:
			setX_z_u((U_s) null);
			return;
		case TestcasesModelPackage.X__XZP:
			setX_z_p((P_s) null);
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
		case TestcasesModelPackage.X__XZAB:
			return x_z_A_b != null;
		case TestcasesModelPackage.X__XYAB:
			return x_y_A_b != null;
		case TestcasesModelPackage.X__XZAC:
			return x_z_A_c != null;
		case TestcasesModelPackage.X__XYAC:
			return x_y_A_c != null;
		case TestcasesModelPackage.X__XZU:
			return x_z_u != null;
		case TestcasesModelPackage.X__XZP:
			return x_z_p != null;
		}
		return super.eIsSet(featureID);
	}

} //XImpl
