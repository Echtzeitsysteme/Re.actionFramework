/**
 */
package GKLModel.impl;

import GKLModel.GKLModelFactory;
import GKLModel.GKLModelPackage;
import GKLModel.P_s;
import GKLModel.U_s;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reactionContainer.ReactionContainerPackage;

import reactionContainer.impl.ReactionContainerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GKLModelPackageImpl extends EPackageImpl implements GKLModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass u_sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p_sEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see GKLModel.GKLModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GKLModelPackageImpl() {
		super(eNS_URI, GKLModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GKLModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GKLModelPackage init() {
		if (isInited)
			return (GKLModelPackage) EPackage.Registry.INSTANCE.getEPackage(GKLModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGKLModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GKLModelPackageImpl theGKLModelPackage = registeredGKLModelPackage instanceof GKLModelPackageImpl
				? (GKLModelPackageImpl) registeredGKLModelPackage
				: new GKLModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReactionContainerPackage.eNS_URI);
		ReactionContainerPackageImpl theReactionContainerPackage = (ReactionContainerPackageImpl) (registeredPackage instanceof ReactionContainerPackageImpl
				? registeredPackage
				: ReactionContainerPackage.eINSTANCE);

		// Create package meta-data objects
		theGKLModelPackage.createPackageContents();
		theReactionContainerPackage.createPackageContents();

		// Initialize created meta-data
		theGKLModelPackage.initializePackageContents();
		theReactionContainerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGKLModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GKLModelPackage.eNS_URI, theGKLModelPackage);
		return theGKLModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getT() {
		return tEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_x_K_a() {
		return (EReference) tEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_x_P_a() {
		return (EReference) tEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_x_u() {
		return (EReference) tEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_x_p() {
		return (EReference) tEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_y_K_a() {
		return (EReference) tEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_y_P_a() {
		return (EReference) tEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_y_u() {
		return (EReference) tEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getT_T_y_p() {
		return (EReference) tEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getK() {
		return kEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP() {
		return pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getU_s() {
		return u_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP_s() {
		return p_sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GKLModelFactory getGKLModelFactory() {
		return (GKLModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		tEClass = createEClass(T);
		createEReference(tEClass, T__TXKA);
		createEReference(tEClass, T__TXPA);
		createEReference(tEClass, T__TXU);
		createEReference(tEClass, T__TXP);
		createEReference(tEClass, T__TYKA);
		createEReference(tEClass, T__TYPA);
		createEReference(tEClass, T__TYU);
		createEReference(tEClass, T__TYP);

		kEClass = createEClass(K);

		pEClass = createEClass(P);

		u_sEClass = createEClass(US);

		p_sEClass = createEClass(PS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ReactionContainerPackage theReactionContainerPackage = (ReactionContainerPackage) EPackage.Registry.INSTANCE
				.getEPackage(ReactionContainerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		kEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		pEClass.getESuperTypes().add(theReactionContainerPackage.getAgent());
		u_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());
		p_sEClass.getESuperTypes().add(theReactionContainerPackage.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(tEClass, GKLModel.T.class, "T", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_T_x_K_a(), this.getK(), null, "T_x_K_a", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_x_P_a(), this.getP(), null, "T_x_P_a", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_x_u(), this.getU_s(), null, "T_x_u", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_x_p(), this.getP_s(), null, "T_x_p", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_y_K_a(), this.getK(), null, "T_y_K_a", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_y_P_a(), this.getP(), null, "T_y_P_a", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_y_u(), this.getU_s(), null, "T_y_u", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getT_T_y_p(), this.getP_s(), null, "T_y_p", null, 0, 1, GKLModel.T.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(kEClass, GKLModel.K.class, "K", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pEClass, GKLModel.P.class, "P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(u_sEClass, U_s.class, "U_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p_sEClass, P_s.class, "P_s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GKLModelPackageImpl
