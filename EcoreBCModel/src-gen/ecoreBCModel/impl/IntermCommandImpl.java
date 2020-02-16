/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.CommandType;
import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermCommand;
import ecoreBCModel.IntermPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interm Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.impl.IntermCommandImpl#getType <em>Type</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermCommandImpl#getPatternToMatch <em>Pattern To Match</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermCommandImpl#getCnt <em>Cnt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermCommandImpl extends IntermComponentImpl implements IntermCommand {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CommandType TYPE_EDEFAULT = CommandType.TIME;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CommandType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatternToMatch() <em>Pattern To Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternToMatch()
	 * @generated
	 * @ordered
	 */
	protected IntermPattern patternToMatch;

	/**
	 * The default value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected static final double CNT_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected double cnt = CNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreBCModelPackage.Literals.INTERM_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CommandType newType) {
		CommandType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_COMMAND__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermPattern getPatternToMatch() {
		if (patternToMatch != null && patternToMatch.eIsProxy()) {
			InternalEObject oldPatternToMatch = (InternalEObject) patternToMatch;
			patternToMatch = (IntermPattern) eResolveProxy(oldPatternToMatch);
			if (patternToMatch != oldPatternToMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreBCModelPackage.INTERM_COMMAND__PATTERN_TO_MATCH, oldPatternToMatch, patternToMatch));
			}
		}
		return patternToMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermPattern basicGetPatternToMatch() {
		return patternToMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternToMatch(IntermPattern newPatternToMatch) {
		IntermPattern oldPatternToMatch = patternToMatch;
		patternToMatch = newPatternToMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_COMMAND__PATTERN_TO_MATCH,
					oldPatternToMatch, patternToMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCnt() {
		return cnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCnt(double newCnt) {
		double oldCnt = cnt;
		cnt = newCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERM_COMMAND__CNT, oldCnt,
					cnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERM_COMMAND__TYPE:
			return getType();
		case EcoreBCModelPackage.INTERM_COMMAND__PATTERN_TO_MATCH:
			if (resolve)
				return getPatternToMatch();
			return basicGetPatternToMatch();
		case EcoreBCModelPackage.INTERM_COMMAND__CNT:
			return getCnt();
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
		case EcoreBCModelPackage.INTERM_COMMAND__TYPE:
			setType((CommandType) newValue);
			return;
		case EcoreBCModelPackage.INTERM_COMMAND__PATTERN_TO_MATCH:
			setPatternToMatch((IntermPattern) newValue);
			return;
		case EcoreBCModelPackage.INTERM_COMMAND__CNT:
			setCnt((Double) newValue);
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
		case EcoreBCModelPackage.INTERM_COMMAND__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case EcoreBCModelPackage.INTERM_COMMAND__PATTERN_TO_MATCH:
			setPatternToMatch((IntermPattern) null);
			return;
		case EcoreBCModelPackage.INTERM_COMMAND__CNT:
			setCnt(CNT_EDEFAULT);
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
		case EcoreBCModelPackage.INTERM_COMMAND__TYPE:
			return type != TYPE_EDEFAULT;
		case EcoreBCModelPackage.INTERM_COMMAND__PATTERN_TO_MATCH:
			return patternToMatch != null;
		case EcoreBCModelPackage.INTERM_COMMAND__CNT:
			return cnt != CNT_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", cnt: ");
		result.append(cnt);
		result.append(')');
		return result.toString();
	}

} //IntermCommandImpl
