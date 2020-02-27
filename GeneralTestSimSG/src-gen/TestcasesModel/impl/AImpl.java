/**
 */
package TestcasesModel.impl;

import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.TestcasesModelPackage;
import TestcasesModel.U_s;
import TestcasesModel.X;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_b_X_z <em>AbXz</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_b_A_c <em>AbAc</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_b_A_b <em>AbAb</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_c_X_z <em>AcXz</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_c_X_y <em>AcXy</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_c_u <em>Acu</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_c_p <em>Acp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AImpl extends AgentImpl implements A {
	/**
	 * The cached value of the '{@link #getA_b_X_z() <em>AbXz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_b_X_z()
	 * @generated
	 * @ordered
	 */
	protected X a_b_X_z;

	/**
	 * The cached value of the '{@link #getA_b_A_c() <em>AbAc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_b_A_c()
	 * @generated
	 * @ordered
	 */
	protected A a_b_A_c;

	/**
	 * The cached value of the '{@link #getA_b_A_b() <em>AbAb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_b_A_b()
	 * @generated
	 * @ordered
	 */
	protected A a_b_A_b;

	/**
	 * The cached value of the '{@link #getA_c_X_z() <em>AcXz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_c_X_z()
	 * @generated
	 * @ordered
	 */
	protected X a_c_X_z;

	/**
	 * The cached value of the '{@link #getA_c_X_y() <em>AcXy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_c_X_y()
	 * @generated
	 * @ordered
	 */
	protected X a_c_X_y;

	/**
	 * The cached value of the '{@link #getA_c_u() <em>Acu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_c_u()
	 * @generated
	 * @ordered
	 */
	protected U_s a_c_u;

	/**
	 * The cached value of the '{@link #getA_c_p() <em>Acp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_c_p()
	 * @generated
	 * @ordered
	 */
	protected P_s a_c_p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcasesModelPackage.Literals.A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public X getA_b_X_z() {
		if (a_b_X_z != null && a_b_X_z.eIsProxy()) {
			InternalEObject oldA_b_X_z = (InternalEObject) a_b_X_z;
			a_b_X_z = (X) eResolveProxy(oldA_b_X_z);
			if (a_b_X_z != oldA_b_X_z) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__ABXZ, oldA_b_X_z,
							a_b_X_z));
			}
		}
		return a_b_X_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X basicGetA_b_X_z() {
		return a_b_X_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_b_X_z(X newA_b_X_z) {
		X oldA_b_X_z = a_b_X_z;
		a_b_X_z = newA_b_X_z;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__ABXZ, oldA_b_X_z, a_b_X_z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A getA_b_A_c() {
		if (a_b_A_c != null && a_b_A_c.eIsProxy()) {
			InternalEObject oldA_b_A_c = (InternalEObject) a_b_A_c;
			a_b_A_c = (A) eResolveProxy(oldA_b_A_c);
			if (a_b_A_c != oldA_b_A_c) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__ABAC, oldA_b_A_c,
							a_b_A_c));
			}
		}
		return a_b_A_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetA_b_A_c() {
		return a_b_A_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_b_A_c(A newA_b_A_c) {
		A oldA_b_A_c = a_b_A_c;
		a_b_A_c = newA_b_A_c;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__ABAC, oldA_b_A_c, a_b_A_c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A getA_b_A_b() {
		if (a_b_A_b != null && a_b_A_b.eIsProxy()) {
			InternalEObject oldA_b_A_b = (InternalEObject) a_b_A_b;
			a_b_A_b = (A) eResolveProxy(oldA_b_A_b);
			if (a_b_A_b != oldA_b_A_b) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__ABAB, oldA_b_A_b,
							a_b_A_b));
			}
		}
		return a_b_A_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetA_b_A_b() {
		return a_b_A_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_b_A_b(A newA_b_A_b) {
		A oldA_b_A_b = a_b_A_b;
		a_b_A_b = newA_b_A_b;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__ABAB, oldA_b_A_b, a_b_A_b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public X getA_c_X_z() {
		if (a_c_X_z != null && a_c_X_z.eIsProxy()) {
			InternalEObject oldA_c_X_z = (InternalEObject) a_c_X_z;
			a_c_X_z = (X) eResolveProxy(oldA_c_X_z);
			if (a_c_X_z != oldA_c_X_z) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__ACXZ, oldA_c_X_z,
							a_c_X_z));
			}
		}
		return a_c_X_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X basicGetA_c_X_z() {
		return a_c_X_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_c_X_z(X newA_c_X_z) {
		X oldA_c_X_z = a_c_X_z;
		a_c_X_z = newA_c_X_z;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__ACXZ, oldA_c_X_z, a_c_X_z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public X getA_c_X_y() {
		if (a_c_X_y != null && a_c_X_y.eIsProxy()) {
			InternalEObject oldA_c_X_y = (InternalEObject) a_c_X_y;
			a_c_X_y = (X) eResolveProxy(oldA_c_X_y);
			if (a_c_X_y != oldA_c_X_y) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__ACXY, oldA_c_X_y,
							a_c_X_y));
			}
		}
		return a_c_X_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X basicGetA_c_X_y() {
		return a_c_X_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_c_X_y(X newA_c_X_y) {
		X oldA_c_X_y = a_c_X_y;
		a_c_X_y = newA_c_X_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__ACXY, oldA_c_X_y, a_c_X_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s getA_c_u() {
		if (a_c_u != null && a_c_u.eIsProxy()) {
			InternalEObject oldA_c_u = (InternalEObject) a_c_u;
			a_c_u = (U_s) eResolveProxy(oldA_c_u);
			if (a_c_u != oldA_c_u) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__ACU, oldA_c_u,
							a_c_u));
			}
		}
		return a_c_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U_s basicGetA_c_u() {
		return a_c_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_c_u(U_s newA_c_u) {
		U_s oldA_c_u = a_c_u;
		a_c_u = newA_c_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__ACU, oldA_c_u, a_c_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s getA_c_p() {
		if (a_c_p != null && a_c_p.eIsProxy()) {
			InternalEObject oldA_c_p = (InternalEObject) a_c_p;
			a_c_p = (P_s) eResolveProxy(oldA_c_p);
			if (a_c_p != oldA_c_p) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__ACP, oldA_c_p,
							a_c_p));
			}
		}
		return a_c_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_s basicGetA_c_p() {
		return a_c_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_c_p(P_s newA_c_p) {
		P_s oldA_c_p = a_c_p;
		a_c_p = newA_c_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__ACP, oldA_c_p, a_c_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestcasesModelPackage.A__ABXZ:
			if (resolve)
				return getA_b_X_z();
			return basicGetA_b_X_z();
		case TestcasesModelPackage.A__ABAC:
			if (resolve)
				return getA_b_A_c();
			return basicGetA_b_A_c();
		case TestcasesModelPackage.A__ABAB:
			if (resolve)
				return getA_b_A_b();
			return basicGetA_b_A_b();
		case TestcasesModelPackage.A__ACXZ:
			if (resolve)
				return getA_c_X_z();
			return basicGetA_c_X_z();
		case TestcasesModelPackage.A__ACXY:
			if (resolve)
				return getA_c_X_y();
			return basicGetA_c_X_y();
		case TestcasesModelPackage.A__ACU:
			if (resolve)
				return getA_c_u();
			return basicGetA_c_u();
		case TestcasesModelPackage.A__ACP:
			if (resolve)
				return getA_c_p();
			return basicGetA_c_p();
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
		case TestcasesModelPackage.A__ABXZ:
			setA_b_X_z((X) newValue);
			return;
		case TestcasesModelPackage.A__ABAC:
			setA_b_A_c((A) newValue);
			return;
		case TestcasesModelPackage.A__ABAB:
			setA_b_A_b((A) newValue);
			return;
		case TestcasesModelPackage.A__ACXZ:
			setA_c_X_z((X) newValue);
			return;
		case TestcasesModelPackage.A__ACXY:
			setA_c_X_y((X) newValue);
			return;
		case TestcasesModelPackage.A__ACU:
			setA_c_u((U_s) newValue);
			return;
		case TestcasesModelPackage.A__ACP:
			setA_c_p((P_s) newValue);
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
		case TestcasesModelPackage.A__ABXZ:
			setA_b_X_z((X) null);
			return;
		case TestcasesModelPackage.A__ABAC:
			setA_b_A_c((A) null);
			return;
		case TestcasesModelPackage.A__ABAB:
			setA_b_A_b((A) null);
			return;
		case TestcasesModelPackage.A__ACXZ:
			setA_c_X_z((X) null);
			return;
		case TestcasesModelPackage.A__ACXY:
			setA_c_X_y((X) null);
			return;
		case TestcasesModelPackage.A__ACU:
			setA_c_u((U_s) null);
			return;
		case TestcasesModelPackage.A__ACP:
			setA_c_p((P_s) null);
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
		case TestcasesModelPackage.A__ABXZ:
			return a_b_X_z != null;
		case TestcasesModelPackage.A__ABAC:
			return a_b_A_c != null;
		case TestcasesModelPackage.A__ABAB:
			return a_b_A_b != null;
		case TestcasesModelPackage.A__ACXZ:
			return a_c_X_z != null;
		case TestcasesModelPackage.A__ACXY:
			return a_c_X_y != null;
		case TestcasesModelPackage.A__ACU:
			return a_c_u != null;
		case TestcasesModelPackage.A__ACP:
			return a_c_p != null;
		}
		return super.eIsSet(featureID);
	}

} //AImpl
