/**
 */
package GKLModel.impl;

import GKLModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GKLModelFactoryImpl extends EFactoryImpl implements GKLModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GKLModelFactory init() {
		try {
			GKLModelFactory theGKLModelFactory = (GKLModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(GKLModelPackage.eNS_URI);
			if (theGKLModelFactory != null) {
				return theGKLModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GKLModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GKLModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GKLModelPackage.P:
			return createP();
		case GKLModelPackage.K:
			return createK();
		case GKLModelPackage.T:
			return createT();
		case GKLModelPackage.US:
			return createU_s();
		case GKLModelPackage.PS:
			return createP_s();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P createP() {
		PImpl p = new PImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public K createK() {
		KImpl k = new KImpl();
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T createT() {
		TImpl t = new TImpl();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public U_s createU_s() {
		U_sImpl u_s = new U_sImpl();
		return u_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P_s createP_s() {
		P_sImpl p_s = new P_sImpl();
		return p_s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GKLModelPackage getGKLModelPackage() {
		return (GKLModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GKLModelPackage getPackage() {
		return GKLModelPackage.eINSTANCE;
	}

} //GKLModelFactoryImpl
