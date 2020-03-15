/**
 */
package GKLModel.impl;

import GKLModel.GKLModelPackage;
import GKLModel.P;
import GKLModel.T;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reactionContainer.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GKLModel.impl.PImpl#getP_a_T_x <em>PaTx</em>}</li>
 *   <li>{@link GKLModel.impl.PImpl#getP_a_T_y <em>PaTy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PImpl extends AgentImpl implements P {
	/**
	 * The cached value of the '{@link #getP_a_T_x() <em>PaTx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_a_T_x()
	 * @generated
	 * @ordered
	 */
	protected T p_a_T_x;

	/**
	 * The cached value of the '{@link #getP_a_T_y() <em>PaTy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_a_T_y()
	 * @generated
	 * @ordered
	 */
	protected T p_a_T_y;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GKLModelPackage.Literals.P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T getP_a_T_x() {
		if (p_a_T_x != null && p_a_T_x.eIsProxy()) {
			InternalEObject oldP_a_T_x = (InternalEObject) p_a_T_x;
			p_a_T_x = (T) eResolveProxy(oldP_a_T_x);
			if (p_a_T_x != oldP_a_T_x) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.P__PATX, oldP_a_T_x,
							p_a_T_x));
			}
		}
		return p_a_T_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetP_a_T_x() {
		return p_a_T_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP_a_T_x(T newP_a_T_x) {
		T oldP_a_T_x = p_a_T_x;
		p_a_T_x = newP_a_T_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.P__PATX, oldP_a_T_x, p_a_T_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T getP_a_T_y() {
		if (p_a_T_y != null && p_a_T_y.eIsProxy()) {
			InternalEObject oldP_a_T_y = (InternalEObject) p_a_T_y;
			p_a_T_y = (T) eResolveProxy(oldP_a_T_y);
			if (p_a_T_y != oldP_a_T_y) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GKLModelPackage.P__PATY, oldP_a_T_y,
							p_a_T_y));
			}
		}
		return p_a_T_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetP_a_T_y() {
		return p_a_T_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP_a_T_y(T newP_a_T_y) {
		T oldP_a_T_y = p_a_T_y;
		p_a_T_y = newP_a_T_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GKLModelPackage.P__PATY, oldP_a_T_y, p_a_T_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GKLModelPackage.P__PATX:
			if (resolve)
				return getP_a_T_x();
			return basicGetP_a_T_x();
		case GKLModelPackage.P__PATY:
			if (resolve)
				return getP_a_T_y();
			return basicGetP_a_T_y();
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
		case GKLModelPackage.P__PATX:
			setP_a_T_x((T) newValue);
			return;
		case GKLModelPackage.P__PATY:
			setP_a_T_y((T) newValue);
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
		case GKLModelPackage.P__PATX:
			setP_a_T_x((T) null);
			return;
		case GKLModelPackage.P__PATY:
			setP_a_T_y((T) null);
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
		case GKLModelPackage.P__PATX:
			return p_a_T_x != null;
		case GKLModelPackage.P__PATY:
			return p_a_T_y != null;
		}
		return super.eIsSet(featureID);
	}

} //PImpl
