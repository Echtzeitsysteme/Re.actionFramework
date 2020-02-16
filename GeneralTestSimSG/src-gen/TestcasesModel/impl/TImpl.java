/**
 */
package TestcasesModel.impl;

import TestcasesModel.T;
import TestcasesModel.TestcasesModelPackage;

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
 *   <li>{@link TestcasesModel.impl.TImpl#getT_i <em>Ti</em>}</li>
 *   <li>{@link TestcasesModel.impl.TImpl#getT_j <em>Tj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImpl extends AgentImpl implements T {
	/**
	 * The cached value of the '{@link #getT_i() <em>Ti</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_i()
	 * @generated
	 * @ordered
	 */
	protected Agent t_i;

	/**
	 * The cached value of the '{@link #getT_j() <em>Tj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_j()
	 * @generated
	 * @ordered
	 */
	protected Agent t_j;

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
		return TestcasesModelPackage.Literals.T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getT_i() {
		if (t_i != null && t_i.eIsProxy()) {
			InternalEObject oldT_i = (InternalEObject) t_i;
			t_i = (Agent) eResolveProxy(oldT_i);
			if (t_i != oldT_i) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.T__TI, oldT_i,
							t_i));
			}
		}
		return t_i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetT_i() {
		return t_i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_i(Agent newT_i) {
		Agent oldT_i = t_i;
		t_i = newT_i;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.T__TI, oldT_i, t_i));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getT_j() {
		if (t_j != null && t_j.eIsProxy()) {
			InternalEObject oldT_j = (InternalEObject) t_j;
			t_j = (Agent) eResolveProxy(oldT_j);
			if (t_j != oldT_j) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestcasesModelPackage.T__TJ, oldT_j,
							t_j));
			}
		}
		return t_j;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetT_j() {
		return t_j;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT_j(Agent newT_j) {
		Agent oldT_j = t_j;
		t_j = newT_j;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesModelPackage.T__TJ, oldT_j, t_j));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestcasesModelPackage.T__TI:
			if (resolve)
				return getT_i();
			return basicGetT_i();
		case TestcasesModelPackage.T__TJ:
			if (resolve)
				return getT_j();
			return basicGetT_j();
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
		case TestcasesModelPackage.T__TI:
			setT_i((Agent) newValue);
			return;
		case TestcasesModelPackage.T__TJ:
			setT_j((Agent) newValue);
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
		case TestcasesModelPackage.T__TI:
			setT_i((Agent) null);
			return;
		case TestcasesModelPackage.T__TJ:
			setT_j((Agent) null);
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
		case TestcasesModelPackage.T__TI:
			return t_i != null;
		case TestcasesModelPackage.T__TJ:
			return t_j != null;
		}
		return super.eIsSet(featureID);
	}

} //TImpl
