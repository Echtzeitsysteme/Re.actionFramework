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

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_u <em>Xzu</em>}</li>
 *   <li>{@link TestcasesModel.impl.XImpl#getX_z_p <em>Xzp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XImpl extends AgentImpl implements X {
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
		case TestcasesModelPackage.X__XZU:
			return x_z_u != null;
		case TestcasesModelPackage.X__XZP:
			return x_z_p != null;
		}
		return super.eIsSet(featureID);
	}

} //XImpl
