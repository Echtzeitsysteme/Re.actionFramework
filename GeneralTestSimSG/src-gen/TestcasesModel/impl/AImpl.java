/**
 */
package TestcasesModel.impl;

import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.TestcasesModelPackage;
import TestcasesModel.U_s;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.Agent;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_b <em>Ab</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_c <em>Ac</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_c_u <em>Acu</em>}</li>
 *   <li>{@link TestcasesModel.impl.AImpl#getA_c_p <em>Acp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AImpl extends AgentImpl implements A {
	/**
	 * The cached value of the '{@link #getA_b() <em>Ab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_b()
	 * @generated
	 * @ordered
	 */
	protected Agent a_b;

	/**
	 * The cached value of the '{@link #getA_c() <em>Ac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_c()
	 * @generated
	 * @ordered
	 */
	protected Agent a_c;

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
	public Agent getA_b() {
		if (a_b != null && a_b.eIsProxy()) {
			InternalEObject oldA_b = (InternalEObject) a_b;
			a_b = (Agent) eResolveProxy(oldA_b);
			if (a_b != oldA_b) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__AB, oldA_b,
							a_b));
			}
		}
		return a_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetA_b() {
		return a_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_b(Agent newA_b) {
		Agent oldA_b = a_b;
		a_b = newA_b;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__AB, oldA_b, a_b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getA_c() {
		if (a_c != null && a_c.eIsProxy()) {
			InternalEObject oldA_c = (InternalEObject) a_c;
			a_c = (Agent) eResolveProxy(oldA_c);
			if (a_c != oldA_c) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.A__AC, oldA_c,
							a_c));
			}
		}
		return a_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetA_c() {
		return a_c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA_c(Agent newA_c) {
		Agent oldA_c = a_c;
		a_c = newA_c;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.A__AC, oldA_c, a_c));
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
		case TestcasesModelPackage.A__AB:
			if (resolve)
				return getA_b();
			return basicGetA_b();
		case TestcasesModelPackage.A__AC:
			if (resolve)
				return getA_c();
			return basicGetA_c();
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
		case TestcasesModelPackage.A__AB:
			setA_b((Agent) newValue);
			return;
		case TestcasesModelPackage.A__AC:
			setA_c((Agent) newValue);
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
		case TestcasesModelPackage.A__AB:
			setA_b((Agent) null);
			return;
		case TestcasesModelPackage.A__AC:
			setA_c((Agent) null);
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
		case TestcasesModelPackage.A__AB:
			return a_b != null;
		case TestcasesModelPackage.A__AC:
			return a_c != null;
		case TestcasesModelPackage.A__ACU:
			return a_c_u != null;
		case TestcasesModelPackage.A__ACP:
			return a_c_p != null;
		}
		return super.eIsSet(featureID);
	}

} //AImpl
