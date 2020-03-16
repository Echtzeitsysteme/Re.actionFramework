/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.BindingState;
import ecoreBCModel.CommandType;
import ecoreBCModel.EcoreBCModelFactory;
import ecoreBCModel.EcoreBCModelPackage;
import ecoreBCModel.IntermAgent;
import ecoreBCModel.IntermAgentInstance;
import ecoreBCModel.IntermCommand;
import ecoreBCModel.IntermComponent;
import ecoreBCModel.IntermInitialisation;
import ecoreBCModel.IntermObservable;
import ecoreBCModel.IntermPattern;
import ecoreBCModel.IntermRule;
import ecoreBCModel.IntermSite;
import ecoreBCModel.IntermSiteInstance;
import ecoreBCModel.IntermSiteState;
import ecoreBCModel.IntermediateModel;
import ecoreBCModel.PatternContainer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreBCModelPackageImpl extends EPackageImpl implements EcoreBCModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermInitialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermObservableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermSiteStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermAgentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermSiteInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandTypeEEnum = null;

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
	 * @see ecoreBCModel.EcoreBCModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreBCModelPackageImpl() {
		super(eNS_URI, EcoreBCModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcoreBCModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcoreBCModelPackage init() {
		if (isInited)
			return (EcoreBCModelPackage) EPackage.Registry.INSTANCE.getEPackage(EcoreBCModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEcoreBCModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcoreBCModelPackageImpl theEcoreBCModelPackage = registeredEcoreBCModelPackage instanceof EcoreBCModelPackageImpl
				? (EcoreBCModelPackageImpl) registeredEcoreBCModelPackage
				: new EcoreBCModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcoreBCModelPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreBCModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreBCModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreBCModelPackage.eNS_URI, theEcoreBCModelPackage);
		return theEcoreBCModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateModel() {
		return intermediateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermediateModel_Components() {
		return (EReference) intermediateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermediateModel_PatternContainer() {
		return (EReference) intermediateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermediateModel_Name() {
		return (EAttribute) intermediateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermComponent() {
		return intermComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermAgent() {
		return intermAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermAgent_Sites() {
		return (EReference) intermAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermAgent_Name() {
		return (EAttribute) intermAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermRule() {
		return intermRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermRule_Name() {
		return (EAttribute) intermRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermRule_Rate() {
		return (EAttribute) intermRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermRule_Lhs() {
		return (EReference) intermRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermRule_Rhs() {
		return (EReference) intermRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermSite() {
		return intermSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermSite_Name() {
		return (EAttribute) intermSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermSite_SiteStates() {
		return (EReference) intermSiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermSite_Parent() {
		return (EReference) intermSiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermInitialisation() {
		return intermInitialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermInitialisation_Cnt() {
		return (EAttribute) intermInitialisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermInitialisation_InitPattern() {
		return (EReference) intermInitialisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermObservable() {
		return intermObservableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermObservable_Name() {
		return (EAttribute) intermObservableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermObservable_ObsPattern() {
		return (EReference) intermObservableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermSiteState() {
		return intermSiteStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermSiteState_Name() {
		return (EAttribute) intermSiteStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermPattern() {
		return intermPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermPattern_AgentInstances() {
		return (EReference) intermPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermPattern_Name() {
		return (EAttribute) intermPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermAgentInstance() {
		return intermAgentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermAgentInstance_SiteInstances() {
		return (EReference) intermAgentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermAgentInstance_InstanceOf() {
		return (EReference) intermAgentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermAgentInstance_Name() {
		return (EAttribute) intermAgentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermAgentInstance_Local() {
		return (EAttribute) intermAgentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermSiteInstance() {
		return intermSiteInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermSiteInstance_InstanceOf() {
		return (EReference) intermSiteInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermSiteInstance_NotBoundTo() {
		return (EReference) intermSiteInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermSiteInstance_BoundTo() {
		return (EReference) intermSiteInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermSiteInstance_BindingState() {
		return (EAttribute) intermSiteInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermSiteInstance_Name() {
		return (EAttribute) intermSiteInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermSiteInstance_State() {
		return (EReference) intermSiteInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermSiteInstance_Parent() {
		return (EReference) intermSiteInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatternContainer() {
		return patternContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatternContainer_Patterns() {
		return (EReference) patternContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermCommand() {
		return intermCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermCommand_Type() {
		return (EAttribute) intermCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermCommand_PatternToMatch() {
		return (EReference) intermCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermCommand_Cnt() {
		return (EAttribute) intermCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBindingState() {
		return bindingStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommandType() {
		return commandTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreBCModelFactory getEcoreBCModelFactory() {
		return (EcoreBCModelFactory) getEFactoryInstance();
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
		intermediateModelEClass = createEClass(INTERMEDIATE_MODEL);
		createEReference(intermediateModelEClass, INTERMEDIATE_MODEL__COMPONENTS);
		createEReference(intermediateModelEClass, INTERMEDIATE_MODEL__PATTERN_CONTAINER);
		createEAttribute(intermediateModelEClass, INTERMEDIATE_MODEL__NAME);

		intermComponentEClass = createEClass(INTERM_COMPONENT);

		intermAgentEClass = createEClass(INTERM_AGENT);
		createEReference(intermAgentEClass, INTERM_AGENT__SITES);
		createEAttribute(intermAgentEClass, INTERM_AGENT__NAME);

		intermRuleEClass = createEClass(INTERM_RULE);
		createEAttribute(intermRuleEClass, INTERM_RULE__NAME);
		createEAttribute(intermRuleEClass, INTERM_RULE__RATE);
		createEReference(intermRuleEClass, INTERM_RULE__LHS);
		createEReference(intermRuleEClass, INTERM_RULE__RHS);

		intermSiteEClass = createEClass(INTERM_SITE);
		createEAttribute(intermSiteEClass, INTERM_SITE__NAME);
		createEReference(intermSiteEClass, INTERM_SITE__SITE_STATES);
		createEReference(intermSiteEClass, INTERM_SITE__PARENT);

		intermInitialisationEClass = createEClass(INTERM_INITIALISATION);
		createEAttribute(intermInitialisationEClass, INTERM_INITIALISATION__CNT);
		createEReference(intermInitialisationEClass, INTERM_INITIALISATION__INIT_PATTERN);

		intermObservableEClass = createEClass(INTERM_OBSERVABLE);
		createEAttribute(intermObservableEClass, INTERM_OBSERVABLE__NAME);
		createEReference(intermObservableEClass, INTERM_OBSERVABLE__OBS_PATTERN);

		intermSiteStateEClass = createEClass(INTERM_SITE_STATE);
		createEAttribute(intermSiteStateEClass, INTERM_SITE_STATE__NAME);

		intermPatternEClass = createEClass(INTERM_PATTERN);
		createEReference(intermPatternEClass, INTERM_PATTERN__AGENT_INSTANCES);
		createEAttribute(intermPatternEClass, INTERM_PATTERN__NAME);

		intermAgentInstanceEClass = createEClass(INTERM_AGENT_INSTANCE);
		createEReference(intermAgentInstanceEClass, INTERM_AGENT_INSTANCE__SITE_INSTANCES);
		createEReference(intermAgentInstanceEClass, INTERM_AGENT_INSTANCE__INSTANCE_OF);
		createEAttribute(intermAgentInstanceEClass, INTERM_AGENT_INSTANCE__NAME);
		createEAttribute(intermAgentInstanceEClass, INTERM_AGENT_INSTANCE__LOCAL);

		intermSiteInstanceEClass = createEClass(INTERM_SITE_INSTANCE);
		createEReference(intermSiteInstanceEClass, INTERM_SITE_INSTANCE__INSTANCE_OF);
		createEReference(intermSiteInstanceEClass, INTERM_SITE_INSTANCE__NOT_BOUND_TO);
		createEReference(intermSiteInstanceEClass, INTERM_SITE_INSTANCE__BOUND_TO);
		createEAttribute(intermSiteInstanceEClass, INTERM_SITE_INSTANCE__BINDING_STATE);
		createEAttribute(intermSiteInstanceEClass, INTERM_SITE_INSTANCE__NAME);
		createEReference(intermSiteInstanceEClass, INTERM_SITE_INSTANCE__STATE);
		createEReference(intermSiteInstanceEClass, INTERM_SITE_INSTANCE__PARENT);

		patternContainerEClass = createEClass(PATTERN_CONTAINER);
		createEReference(patternContainerEClass, PATTERN_CONTAINER__PATTERNS);

		intermCommandEClass = createEClass(INTERM_COMMAND);
		createEAttribute(intermCommandEClass, INTERM_COMMAND__TYPE);
		createEReference(intermCommandEClass, INTERM_COMMAND__PATTERN_TO_MATCH);
		createEAttribute(intermCommandEClass, INTERM_COMMAND__CNT);

		// Create enums
		bindingStateEEnum = createEEnum(BINDING_STATE);
		commandTypeEEnum = createEEnum(COMMAND_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intermAgentEClass.getESuperTypes().add(this.getIntermComponent());
		intermRuleEClass.getESuperTypes().add(this.getIntermComponent());
		intermInitialisationEClass.getESuperTypes().add(this.getIntermComponent());
		intermObservableEClass.getESuperTypes().add(this.getIntermComponent());
		intermCommandEClass.getESuperTypes().add(this.getIntermComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(intermediateModelEClass, IntermediateModel.class, "IntermediateModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateModel_Components(), this.getIntermComponent(), null, "components", null, 0, -1,
				IntermediateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateModel_PatternContainer(), this.getPatternContainer(), null, "patternContainer",
				null, 1, 1, IntermediateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermediateModel_Name(), theXMLTypePackage.getString(), "name", "UNTITLED", 0, 1,
				IntermediateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(intermComponentEClass, IntermComponent.class, "IntermComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermAgentEClass, IntermAgent.class, "IntermAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermAgent_Sites(), this.getIntermSite(), null, "sites", null, 0, -1, IntermAgent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermAgent_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, IntermAgent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermRuleEClass, IntermRule.class, "IntermRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermRule_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, IntermRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermRule_Rate(), ecorePackage.getEDouble(), "rate", "-1", 1, 1, IntermRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermRule_Lhs(), this.getIntermPattern(), null, "lhs", null, 0, 1, IntermRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermRule_Rhs(), this.getIntermPattern(), null, "rhs", null, 0, 1, IntermRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermSiteEClass, IntermSite.class, "IntermSite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermSite_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, IntermSite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermSite_SiteStates(), this.getIntermSiteState(), null, "siteStates", null, 0, -1,
				IntermSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermSite_Parent(), this.getIntermAgent(), null, "parent", null, 1, 1, IntermSite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermInitialisationEClass, IntermInitialisation.class, "IntermInitialisation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermInitialisation_Cnt(), ecorePackage.getEInt(), "cnt", "0", 1, 1,
				IntermInitialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermInitialisation_InitPattern(), this.getIntermPattern(), null, "initPattern", null, 1, 1,
				IntermInitialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermObservableEClass, IntermObservable.class, "IntermObservable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermObservable_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				IntermObservable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getIntermObservable_ObsPattern(), this.getIntermPattern(), null, "obsPattern", null, 1, 1,
				IntermObservable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermSiteStateEClass, IntermSiteState.class, "IntermSiteState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermSiteState_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				IntermSiteState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(intermPatternEClass, IntermPattern.class, "IntermPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermPattern_AgentInstances(), this.getIntermAgentInstance(), null, "agentInstances", null,
				0, -1, IntermPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermPattern_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, IntermPattern.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermAgentInstanceEClass, IntermAgentInstance.class, "IntermAgentInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermAgentInstance_SiteInstances(), this.getIntermSiteInstance(), null, "siteInstances",
				null, 0, -1, IntermAgentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermAgentInstance_InstanceOf(), this.getIntermAgent(), null, "instanceOf", null, 1, 1,
				IntermAgentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermAgentInstance_Name(), theXMLTypePackage.getString(), "name", "UNTITLED", 1, 1,
				IntermAgentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermAgentInstance_Local(), theXMLTypePackage.getBoolean(), "local", null, 0, 1,
				IntermAgentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermSiteInstanceEClass, IntermSiteInstance.class, "IntermSiteInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermSiteInstance_InstanceOf(), this.getIntermSite(), null, "instanceOf", null, 1, 1,
				IntermSiteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermSiteInstance_NotBoundTo(), this.getIntermSiteInstance(), null, "notBoundTo", null, 0,
				-1, IntermSiteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermSiteInstance_BoundTo(), this.getIntermSiteInstance(), null, "boundTo", null, 0, 1,
				IntermSiteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermSiteInstance_BindingState(), this.getBindingState(), "bindingState", "UNSPECIFIED", 1,
				1, IntermSiteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermSiteInstance_Name(), theXMLTypePackage.getString(), "name", "UNTITLED", 1, 1,
				IntermSiteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getIntermSiteInstance_State(), this.getIntermSiteState(), null, "state", null, 0, 1,
				IntermSiteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermSiteInstance_Parent(), this.getIntermAgentInstance(), null, "parent", null, 0, 1,
				IntermSiteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternContainerEClass, PatternContainer.class, "PatternContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternContainer_Patterns(), this.getIntermPattern(), null, "patterns", null, 0, -1,
				PatternContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermCommandEClass, IntermCommand.class, "IntermCommand", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermCommand_Type(), this.getCommandType(), "type", null, 0, 1, IntermCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermCommand_PatternToMatch(), this.getIntermPattern(), null, "patternToMatch", null, 0, 1,
				IntermCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermCommand_Cnt(), ecorePackage.getEDouble(), "cnt", "-1.0", 0, 1, IntermCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingStateEEnum, BindingState.class, "BindingState");
		addEEnumLiteral(bindingStateEEnum, BindingState.BOUND);
		addEEnumLiteral(bindingStateEEnum, BindingState.FREE);
		addEEnumLiteral(bindingStateEEnum, BindingState.UNSPECIFIED);

		initEEnum(commandTypeEEnum, CommandType.class, "CommandType");
		addEEnumLiteral(commandTypeEEnum, CommandType.TIME);
		addEEnumLiteral(commandTypeEEnum, CommandType.ITERATIONS);
		addEEnumLiteral(commandTypeEEnum, CommandType.MATCHES);

		// Create resource
		createResource(eNS_URI);
	}

} //EcoreBCModelPackageImpl
