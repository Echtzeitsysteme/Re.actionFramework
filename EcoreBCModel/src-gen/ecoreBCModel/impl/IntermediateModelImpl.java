/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermComponent;
import ecoreBCModel.IntermediateModel;
import ecoreBCModel.PatternContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreBCModel.impl.IntermediateModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermediateModelImpl#getPatternContainer <em>Pattern Container</em>}</li>
 *   <li>{@link ecoreBCModel.impl.IntermediateModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateModelImpl extends MinimalEObjectImpl.Container implements IntermediateModel {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermComponent> components;

	/**
	 * The cached value of the '{@link #getPatternContainer() <em>Pattern Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternContainer()
	 * @generated
	 * @ordered
	 */
	protected PatternContainer patternContainer;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UNTITLED";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreBCModelPackage.Literals.INTERMEDIATE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<IntermComponent>(IntermComponent.class, this,
					EcoreBCModelPackage.INTERMEDIATE_MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternContainer getPatternContainer() {
		return patternContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternContainer(PatternContainer newPatternContainer, NotificationChain msgs) {
		PatternContainer oldPatternContainer = patternContainer;
		patternContainer = newPatternContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER, oldPatternContainer,
					newPatternContainer);
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
	public void setPatternContainer(PatternContainer newPatternContainer) {
		if (newPatternContainer != patternContainer) {
			NotificationChain msgs = null;
			if (patternContainer != null)
				msgs = ((InternalEObject) patternContainer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER, null, msgs);
			if (newPatternContainer != null)
				msgs = ((InternalEObject) newPatternContainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER, null, msgs);
			msgs = basicSetPatternContainer(newPatternContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER, newPatternContainer,
					newPatternContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreBCModelPackage.INTERMEDIATE_MODEL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER:
			return basicSetPatternContainer(null, msgs);
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
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__COMPONENTS:
			return getComponents();
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER:
			return getPatternContainer();
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends IntermComponent>) newValue);
			return;
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER:
			setPatternContainer((PatternContainer) newValue);
			return;
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__NAME:
			setName((String) newValue);
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
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__COMPONENTS:
			getComponents().clear();
			return;
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER:
			setPatternContainer((PatternContainer) null);
			return;
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__NAME:
			setName(NAME_EDEFAULT);
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
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__COMPONENTS:
			return components != null && !components.isEmpty();
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__PATTERN_CONTAINER:
			return patternContainer != null;
		case EcoreBCModelPackage.INTERMEDIATE_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IntermediateModelImpl
