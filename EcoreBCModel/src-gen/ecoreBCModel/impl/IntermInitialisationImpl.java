/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermInitialisation;
import ecoreBCModel.IntermPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interm Initialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.impl.IntermInitialisationImpl#getCnt <em>Cnt</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermInitialisationImpl#getInitPattern <em>Init Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermInitialisationImpl extends IntermComponentImpl implements IntermInitialisation {
	/**
	 * The default value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected static final int CNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected int cnt = CNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitPattern() <em>Init Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitPattern()
	 * @generated
	 * @ordered
	 */
	protected IntermPattern initPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermInitialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreBCModelPackage.Literals.INTERM_INITIALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCnt() {
		return cnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCnt(int newCnt) {
		int oldCnt = cnt;
		cnt = newCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_INITIALISATION__CNT,
					oldCnt, cnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermPattern getInitPattern() {
		if (initPattern != null && initPattern.eIsProxy()) {
			InternalEObject oldInitPattern = (InternalEObject) initPattern;
			initPattern = (IntermPattern) eResolveProxy(oldInitPattern);
			if (initPattern != oldInitPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreBCModelPackage.INTERM_INITIALISATION__INIT_PATTERN, oldInitPattern, initPattern));
			}
		}
		return initPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermPattern basicGetInitPattern() {
		return initPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitPattern(IntermPattern newInitPattern) {
		IntermPattern oldInitPattern = initPattern;
		initPattern = newInitPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcoreBCModelPackage.INTERM_INITIALISATION__INIT_PATTERN, oldInitPattern, initPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_INITIALISATION__CNT:
			return getCnt();
		case EcoreBCModelPackage.INTERM_INITIALISATION__INIT_PATTERN:
			if (resolve)
				return getInitPattern();
			return basicGetInitPattern();
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
		case EcoreBCModelPackage.INTERM_INITIALISATION__CNT:
			setCnt((Integer) newValue);
			return;
		case EcoreBCModelPackage.INTERM_INITIALISATION__INIT_PATTERN:
			setInitPattern((IntermPattern) newValue);
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
		case EcoreBCModelPackage.INTERM_INITIALISATION__CNT:
			setCnt(CNT_EDEFAULT);
			return;
		case EcoreBCModelPackage.INTERM_INITIALISATION__INIT_PATTERN:
			setInitPattern((IntermPattern) null);
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
		case EcoreBCModelPackage.INTERM_INITIALISATION__CNT:
			return cnt != CNT_EDEFAULT;
		case EcoreBCModelPackage.INTERM_INITIALISATION__INIT_PATTERN:
			return initPattern != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cnt: ");
		result.append(cnt);
		result.append(')');
		return result.toString();
	}

} //IntermInitialisationImpl
