/**
 */
package intermModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see intermModel.IntermModelFactory
 * @model kind="package"
 * @generated
 */
public interface IntermModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intermModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/intermModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intermModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermModelPackage eINSTANCE = intermModel.impl.IntermModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermSiteImpl <em>Interm Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermSiteImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermSite()
	 * @generated
	 */
	int INTERM_SITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Site States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE__SITE_STATES = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Interm Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interm Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermComponentImpl <em>Interm Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermComponentImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermComponent()
	 * @generated
	 */
	int INTERM_COMPONENT = 8;

	/**
	 * The number of structural features of the '<em>Interm Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interm Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermInitialisationImpl <em>Interm Initialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermInitialisationImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermInitialisation()
	 * @generated
	 */
	int INTERM_INITIALISATION = 1;

	/**
	 * The feature id for the '<em><b>Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_INITIALISATION__CNT = INTERM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_INITIALISATION__INIT_PATTERN = INTERM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interm Initialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_INITIALISATION_FEATURE_COUNT = INTERM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interm Initialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_INITIALISATION_OPERATION_COUNT = INTERM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermSiteInstanceImpl <em>Interm Site Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermSiteInstanceImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermSiteInstance()
	 * @generated
	 */
	int INTERM_SITE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE__INSTANCE_OF = 0;

	/**
	 * The feature id for the '<em><b>Not Bound To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE__NOT_BOUND_TO = 1;

	/**
	 * The feature id for the '<em><b>Bound To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE__BOUND_TO = 2;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE__BINDING_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE__NAME = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE__STATE = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE__PARENT = 6;

	/**
	 * The number of structural features of the '<em>Interm Site Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Interm Site Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.PatternContainerImpl <em>Pattern Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.PatternContainerImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getPatternContainer()
	 * @generated
	 */
	int PATTERN_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTAINER__PATTERNS = 0;

	/**
	 * The number of structural features of the '<em>Pattern Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pattern Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermSiteStateImpl <em>Interm Site State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermSiteStateImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermSiteState()
	 * @generated
	 */
	int INTERM_SITE_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Interm Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interm Site State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_SITE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermPatternImpl <em>Interm Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermPatternImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermPattern()
	 * @generated
	 */
	int INTERM_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Agent Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_PATTERN__AGENT_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_PATTERN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Interm Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interm Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermRuleImpl <em>Interm Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermRuleImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermRule()
	 * @generated
	 */
	int INTERM_RULE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_RULE__NAME = INTERM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_RULE__RATE = INTERM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_RULE__LHS = INTERM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_RULE__RHS = INTERM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interm Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_RULE_FEATURE_COUNT = INTERM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interm Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_RULE_OPERATION_COUNT = INTERM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermObservableImpl <em>Interm Observable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermObservableImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermObservable()
	 * @generated
	 */
	int INTERM_OBSERVABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_OBSERVABLE__NAME = INTERM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obs Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_OBSERVABLE__OBS_PATTERN = INTERM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interm Observable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_OBSERVABLE_FEATURE_COUNT = INTERM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interm Observable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_OBSERVABLE_OPERATION_COUNT = INTERM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermAgentImpl <em>Interm Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermAgentImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermAgent()
	 * @generated
	 */
	int INTERM_AGENT = 9;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT__SITES = INTERM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT__NAME = INTERM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interm Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_FEATURE_COUNT = INTERM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interm Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_OPERATION_COUNT = INTERM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermediateModelImpl <em>Intermediate Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermediateModelImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermediateModel()
	 * @generated
	 */
	int INTERMEDIATE_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Pattern Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL__PATTERN_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Intermediate Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Intermediate Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermCommandImpl <em>Interm Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermCommandImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermCommand()
	 * @generated
	 */
	int INTERM_COMMAND = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_COMMAND__TYPE = INTERM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern To Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_COMMAND__PATTERN_TO_MATCH = INTERM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_COMMAND__CNT = INTERM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interm Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_COMMAND_FEATURE_COUNT = INTERM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interm Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_COMMAND_OPERATION_COUNT = INTERM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermModel.impl.IntermAgentInstanceImpl <em>Interm Agent Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.impl.IntermAgentInstanceImpl
	 * @see intermModel.impl.IntermModelPackageImpl#getIntermAgentInstance()
	 * @generated
	 */
	int INTERM_AGENT_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Site Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_INSTANCE__SITE_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_INSTANCE__INSTANCE_OF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_INSTANCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_INSTANCE__LOCAL = 3;

	/**
	 * The number of structural features of the '<em>Interm Agent Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interm Agent Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERM_AGENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermModel.CommandType <em>Command Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.CommandType
	 * @see intermModel.impl.IntermModelPackageImpl#getCommandType()
	 * @generated
	 */
	int COMMAND_TYPE = 13;

	/**
	 * The meta object id for the '{@link intermModel.BindingState <em>Binding State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermModel.BindingState
	 * @see intermModel.impl.IntermModelPackageImpl#getBindingState()
	 * @generated
	 */
	int BINDING_STATE = 14;

	/**
	 * Returns the meta object for class '{@link intermModel.IntermSite <em>Interm Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Site</em>'.
	 * @see intermModel.IntermSite
	 * @generated
	 */
	EClass getIntermSite();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermSite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermSite#getName()
	 * @see #getIntermSite()
	 * @generated
	 */
	EAttribute getIntermSite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link intermModel.IntermSite#getSiteStates <em>Site States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site States</em>'.
	 * @see intermModel.IntermSite#getSiteStates()
	 * @see #getIntermSite()
	 * @generated
	 */
	EReference getIntermSite_SiteStates();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermSite#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see intermModel.IntermSite#getParent()
	 * @see #getIntermSite()
	 * @generated
	 */
	EReference getIntermSite_Parent();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermInitialisation <em>Interm Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Initialisation</em>'.
	 * @see intermModel.IntermInitialisation
	 * @generated
	 */
	EClass getIntermInitialisation();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermInitialisation#getCnt <em>Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cnt</em>'.
	 * @see intermModel.IntermInitialisation#getCnt()
	 * @see #getIntermInitialisation()
	 * @generated
	 */
	EAttribute getIntermInitialisation_Cnt();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermInitialisation#getInitPattern <em>Init Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Pattern</em>'.
	 * @see intermModel.IntermInitialisation#getInitPattern()
	 * @see #getIntermInitialisation()
	 * @generated
	 */
	EReference getIntermInitialisation_InitPattern();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermSiteInstance <em>Interm Site Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Site Instance</em>'.
	 * @see intermModel.IntermSiteInstance
	 * @generated
	 */
	EClass getIntermSiteInstance();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermSiteInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see intermModel.IntermSiteInstance#getInstanceOf()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_InstanceOf();

	/**
	 * Returns the meta object for the reference list '{@link intermModel.IntermSiteInstance#getNotBoundTo <em>Not Bound To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Not Bound To</em>'.
	 * @see intermModel.IntermSiteInstance#getNotBoundTo()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_NotBoundTo();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermSiteInstance#getBoundTo <em>Bound To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound To</em>'.
	 * @see intermModel.IntermSiteInstance#getBoundTo()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_BoundTo();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermSiteInstance#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see intermModel.IntermSiteInstance#getBindingState()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EAttribute getIntermSiteInstance_BindingState();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermSiteInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermSiteInstance#getName()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EAttribute getIntermSiteInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermSiteInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see intermModel.IntermSiteInstance#getState()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_State();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermSiteInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see intermModel.IntermSiteInstance#getParent()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_Parent();

	/**
	 * Returns the meta object for class '{@link intermModel.PatternContainer <em>Pattern Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Container</em>'.
	 * @see intermModel.PatternContainer
	 * @generated
	 */
	EClass getPatternContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link intermModel.PatternContainer#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see intermModel.PatternContainer#getPatterns()
	 * @see #getPatternContainer()
	 * @generated
	 */
	EReference getPatternContainer_Patterns();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermSiteState <em>Interm Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Site State</em>'.
	 * @see intermModel.IntermSiteState
	 * @generated
	 */
	EClass getIntermSiteState();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermSiteState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermSiteState#getName()
	 * @see #getIntermSiteState()
	 * @generated
	 */
	EAttribute getIntermSiteState_Name();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermPattern <em>Interm Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Pattern</em>'.
	 * @see intermModel.IntermPattern
	 * @generated
	 */
	EClass getIntermPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link intermModel.IntermPattern#getAgentInstances <em>Agent Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent Instances</em>'.
	 * @see intermModel.IntermPattern#getAgentInstances()
	 * @see #getIntermPattern()
	 * @generated
	 */
	EReference getIntermPattern_AgentInstances();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermPattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermPattern#getName()
	 * @see #getIntermPattern()
	 * @generated
	 */
	EAttribute getIntermPattern_Name();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermRule <em>Interm Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Rule</em>'.
	 * @see intermModel.IntermRule
	 * @generated
	 */
	EClass getIntermRule();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermRule#getName()
	 * @see #getIntermRule()
	 * @generated
	 */
	EAttribute getIntermRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermRule#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see intermModel.IntermRule#getRate()
	 * @see #getIntermRule()
	 * @generated
	 */
	EAttribute getIntermRule_Rate();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermRule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see intermModel.IntermRule#getLhs()
	 * @see #getIntermRule()
	 * @generated
	 */
	EReference getIntermRule_Lhs();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermRule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see intermModel.IntermRule#getRhs()
	 * @see #getIntermRule()
	 * @generated
	 */
	EReference getIntermRule_Rhs();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermObservable <em>Interm Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Observable</em>'.
	 * @see intermModel.IntermObservable
	 * @generated
	 */
	EClass getIntermObservable();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermObservable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermObservable#getName()
	 * @see #getIntermObservable()
	 * @generated
	 */
	EAttribute getIntermObservable_Name();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermObservable#getObsPattern <em>Obs Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obs Pattern</em>'.
	 * @see intermModel.IntermObservable#getObsPattern()
	 * @see #getIntermObservable()
	 * @generated
	 */
	EReference getIntermObservable_ObsPattern();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermComponent <em>Interm Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Component</em>'.
	 * @see intermModel.IntermComponent
	 * @generated
	 */
	EClass getIntermComponent();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermAgent <em>Interm Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Agent</em>'.
	 * @see intermModel.IntermAgent
	 * @generated
	 */
	EClass getIntermAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link intermModel.IntermAgent#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see intermModel.IntermAgent#getSites()
	 * @see #getIntermAgent()
	 * @generated
	 */
	EReference getIntermAgent_Sites();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermAgent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermAgent#getName()
	 * @see #getIntermAgent()
	 * @generated
	 */
	EAttribute getIntermAgent_Name();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermediateModel <em>Intermediate Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Model</em>'.
	 * @see intermModel.IntermediateModel
	 * @generated
	 */
	EClass getIntermediateModel();

	/**
	 * Returns the meta object for the containment reference list '{@link intermModel.IntermediateModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see intermModel.IntermediateModel#getComponents()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EReference getIntermediateModel_Components();

	/**
	 * Returns the meta object for the containment reference '{@link intermModel.IntermediateModel#getPatternContainer <em>Pattern Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern Container</em>'.
	 * @see intermModel.IntermediateModel#getPatternContainer()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EReference getIntermediateModel_PatternContainer();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermediateModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermediateModel#getName()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EAttribute getIntermediateModel_Name();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermCommand <em>Interm Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Command</em>'.
	 * @see intermModel.IntermCommand
	 * @generated
	 */
	EClass getIntermCommand();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermCommand#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see intermModel.IntermCommand#getType()
	 * @see #getIntermCommand()
	 * @generated
	 */
	EAttribute getIntermCommand_Type();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermCommand#getPatternToMatch <em>Pattern To Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern To Match</em>'.
	 * @see intermModel.IntermCommand#getPatternToMatch()
	 * @see #getIntermCommand()
	 * @generated
	 */
	EReference getIntermCommand_PatternToMatch();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermCommand#getCnt <em>Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cnt</em>'.
	 * @see intermModel.IntermCommand#getCnt()
	 * @see #getIntermCommand()
	 * @generated
	 */
	EAttribute getIntermCommand_Cnt();

	/**
	 * Returns the meta object for class '{@link intermModel.IntermAgentInstance <em>Interm Agent Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Agent Instance</em>'.
	 * @see intermModel.IntermAgentInstance
	 * @generated
	 */
	EClass getIntermAgentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link intermModel.IntermAgentInstance#getSiteInstances <em>Site Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site Instances</em>'.
	 * @see intermModel.IntermAgentInstance#getSiteInstances()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EReference getIntermAgentInstance_SiteInstances();

	/**
	 * Returns the meta object for the reference '{@link intermModel.IntermAgentInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see intermModel.IntermAgentInstance#getInstanceOf()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EReference getIntermAgentInstance_InstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermAgentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermModel.IntermAgentInstance#getName()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EAttribute getIntermAgentInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link intermModel.IntermAgentInstance#isLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see intermModel.IntermAgentInstance#isLocal()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EAttribute getIntermAgentInstance_Local();

	/**
	 * Returns the meta object for enum '{@link intermModel.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Type</em>'.
	 * @see intermModel.CommandType
	 * @generated
	 */
	EEnum getCommandType();

	/**
	 * Returns the meta object for enum '{@link intermModel.BindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding State</em>'.
	 * @see intermModel.BindingState
	 * @generated
	 */
	EEnum getBindingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermModelFactory getIntermModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermSiteImpl <em>Interm Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermSiteImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermSite()
		 * @generated
		 */
		EClass INTERM_SITE = eINSTANCE.getIntermSite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_SITE__NAME = eINSTANCE.getIntermSite_Name();

		/**
		 * The meta object literal for the '<em><b>Site States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_SITE__SITE_STATES = eINSTANCE.getIntermSite_SiteStates();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_SITE__PARENT = eINSTANCE.getIntermSite_Parent();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermInitialisationImpl <em>Interm Initialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermInitialisationImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermInitialisation()
		 * @generated
		 */
		EClass INTERM_INITIALISATION = eINSTANCE.getIntermInitialisation();

		/**
		 * The meta object literal for the '<em><b>Cnt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_INITIALISATION__CNT = eINSTANCE.getIntermInitialisation_Cnt();

		/**
		 * The meta object literal for the '<em><b>Init Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_INITIALISATION__INIT_PATTERN = eINSTANCE.getIntermInitialisation_InitPattern();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermSiteInstanceImpl <em>Interm Site Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermSiteInstanceImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermSiteInstance()
		 * @generated
		 */
		EClass INTERM_SITE_INSTANCE = eINSTANCE.getIntermSiteInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_SITE_INSTANCE__INSTANCE_OF = eINSTANCE.getIntermSiteInstance_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Not Bound To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_SITE_INSTANCE__NOT_BOUND_TO = eINSTANCE.getIntermSiteInstance_NotBoundTo();

		/**
		 * The meta object literal for the '<em><b>Bound To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_SITE_INSTANCE__BOUND_TO = eINSTANCE.getIntermSiteInstance_BoundTo();

		/**
		 * The meta object literal for the '<em><b>Binding State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_SITE_INSTANCE__BINDING_STATE = eINSTANCE.getIntermSiteInstance_BindingState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_SITE_INSTANCE__NAME = eINSTANCE.getIntermSiteInstance_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_SITE_INSTANCE__STATE = eINSTANCE.getIntermSiteInstance_State();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_SITE_INSTANCE__PARENT = eINSTANCE.getIntermSiteInstance_Parent();

		/**
		 * The meta object literal for the '{@link intermModel.impl.PatternContainerImpl <em>Pattern Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.PatternContainerImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getPatternContainer()
		 * @generated
		 */
		EClass PATTERN_CONTAINER = eINSTANCE.getPatternContainer();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONTAINER__PATTERNS = eINSTANCE.getPatternContainer_Patterns();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermSiteStateImpl <em>Interm Site State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermSiteStateImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermSiteState()
		 * @generated
		 */
		EClass INTERM_SITE_STATE = eINSTANCE.getIntermSiteState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_SITE_STATE__NAME = eINSTANCE.getIntermSiteState_Name();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermPatternImpl <em>Interm Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermPatternImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermPattern()
		 * @generated
		 */
		EClass INTERM_PATTERN = eINSTANCE.getIntermPattern();

		/**
		 * The meta object literal for the '<em><b>Agent Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_PATTERN__AGENT_INSTANCES = eINSTANCE.getIntermPattern_AgentInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_PATTERN__NAME = eINSTANCE.getIntermPattern_Name();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermRuleImpl <em>Interm Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermRuleImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermRule()
		 * @generated
		 */
		EClass INTERM_RULE = eINSTANCE.getIntermRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_RULE__NAME = eINSTANCE.getIntermRule_Name();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_RULE__RATE = eINSTANCE.getIntermRule_Rate();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_RULE__LHS = eINSTANCE.getIntermRule_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_RULE__RHS = eINSTANCE.getIntermRule_Rhs();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermObservableImpl <em>Interm Observable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermObservableImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermObservable()
		 * @generated
		 */
		EClass INTERM_OBSERVABLE = eINSTANCE.getIntermObservable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_OBSERVABLE__NAME = eINSTANCE.getIntermObservable_Name();

		/**
		 * The meta object literal for the '<em><b>Obs Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_OBSERVABLE__OBS_PATTERN = eINSTANCE.getIntermObservable_ObsPattern();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermComponentImpl <em>Interm Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermComponentImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermComponent()
		 * @generated
		 */
		EClass INTERM_COMPONENT = eINSTANCE.getIntermComponent();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermAgentImpl <em>Interm Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermAgentImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermAgent()
		 * @generated
		 */
		EClass INTERM_AGENT = eINSTANCE.getIntermAgent();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_AGENT__SITES = eINSTANCE.getIntermAgent_Sites();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_AGENT__NAME = eINSTANCE.getIntermAgent_Name();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermediateModelImpl <em>Intermediate Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermediateModelImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermediateModel()
		 * @generated
		 */
		EClass INTERMEDIATE_MODEL = eINSTANCE.getIntermediateModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_MODEL__COMPONENTS = eINSTANCE.getIntermediateModel_Components();

		/**
		 * The meta object literal for the '<em><b>Pattern Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_MODEL__PATTERN_CONTAINER = eINSTANCE.getIntermediateModel_PatternContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_MODEL__NAME = eINSTANCE.getIntermediateModel_Name();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermCommandImpl <em>Interm Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermCommandImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermCommand()
		 * @generated
		 */
		EClass INTERM_COMMAND = eINSTANCE.getIntermCommand();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_COMMAND__TYPE = eINSTANCE.getIntermCommand_Type();

		/**
		 * The meta object literal for the '<em><b>Pattern To Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_COMMAND__PATTERN_TO_MATCH = eINSTANCE.getIntermCommand_PatternToMatch();

		/**
		 * The meta object literal for the '<em><b>Cnt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_COMMAND__CNT = eINSTANCE.getIntermCommand_Cnt();

		/**
		 * The meta object literal for the '{@link intermModel.impl.IntermAgentInstanceImpl <em>Interm Agent Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.impl.IntermAgentInstanceImpl
		 * @see intermModel.impl.IntermModelPackageImpl#getIntermAgentInstance()
		 * @generated
		 */
		EClass INTERM_AGENT_INSTANCE = eINSTANCE.getIntermAgentInstance();

		/**
		 * The meta object literal for the '<em><b>Site Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_AGENT_INSTANCE__SITE_INSTANCES = eINSTANCE.getIntermAgentInstance_SiteInstances();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERM_AGENT_INSTANCE__INSTANCE_OF = eINSTANCE.getIntermAgentInstance_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_AGENT_INSTANCE__NAME = eINSTANCE.getIntermAgentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERM_AGENT_INSTANCE__LOCAL = eINSTANCE.getIntermAgentInstance_Local();

		/**
		 * The meta object literal for the '{@link intermModel.CommandType <em>Command Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.CommandType
		 * @see intermModel.impl.IntermModelPackageImpl#getCommandType()
		 * @generated
		 */
		EEnum COMMAND_TYPE = eINSTANCE.getCommandType();

		/**
		 * The meta object literal for the '{@link intermModel.BindingState <em>Binding State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermModel.BindingState
		 * @see intermModel.impl.IntermModelPackageImpl#getBindingState()
		 * @generated
		 */
		EEnum BINDING_STATE = eINSTANCE.getBindingState();

	}

} //IntermModelPackage
