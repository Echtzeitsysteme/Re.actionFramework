/**
 */
package TestcasesModel.impl;

import TestcasesModel.P_s;
import TestcasesModel.TestcasesModelPackage;
import TestcasesModel.U_s;
import TestcasesModel.X;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.Agent;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_y <em>Xy</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z <em>Xz</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_u <em>Xzu</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_p <em>Xzp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XImpl extends AgentImpl implements X {
	/**
	 * The cached value of the '{@link #getX_y() <em>Xy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_y()
	 * @generated
	 * @ordered
	 */
	protected Agent x_y;

	/**
	 * The cached value of the '{@link #getX_z() <em>Xz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_z()
	 * @generated
	 * @ordered
	 */
	protected Agent x_z;

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
	public Agent getX_y() {
		if (x_y != null && x_y.eIsProxy()) {
			InternalEObject oldX_y = (InternalEObject) x_y;
			x_y = (Agent) eResolveProxy(oldX_y);
			if (x_y != oldX_y) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XY, oldX_y,
							x_y));
			}
		}
		return x_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetX_y() {
		return x_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX_y(Agent newX_y) {
		Agent oldX_y = x_y;
		x_y = newX_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XY, oldX_y, x_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getX_z() {
		if (x_z != null && x_z.eIsProxy()) {
			InternalEObject oldX_z = (InternalEObject) x_z;
			x_z = (Agent) eResolveProxy(oldX_z);
			if (x_z != oldX_z) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.X__XZ, oldX_z,
							x_z));
			}
		}
		return x_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetX_z() {
		return x_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX_z(Agent newX_z) {
		Agent oldX_z = x_z;
		x_z = newX_z;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.X__XZ, oldX_z, x_z));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestcasesModelPackage.X__XY:
			if (resolve)
				return getX_y();
			return basicGetX_y();
		case TestcasesModelPackage.X__XZ:
			if (resolve)
				return getX_z();
			return basicGetX_z();
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
		case TestcasesModelPackage.X__XY:
			setX_y((Agent) newValue);
			return;
		case TestcasesModelPackage.X__XZ:
			setX_z((Agent) newValue);
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
		case TestcasesModelPackage.X__XY:
			setX_y((Agent) null);
			return;
		case TestcasesModelPackage.X__XZ:
			setX_z((Agent) null);
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
		case TestcasesModelPackage.X__XY:
			return x_y != null;
		case TestcasesModelPackage.X__XZ:
			return x_z != null;
		case TestcasesModelPackage.X__XZU:
			return x_z_u != null;
		case TestcasesModelPackage.X__XZP:
			return x_z_p != null;
		}
		return super.eIsSet(featureID);
	}

} //XImpl
