/**
 */
package ecoreBCModel;

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
 * @see ecoreBCModel.EcoreBCModelFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreBCModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreBCModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/EcoreBCModel/model/ecoreBCModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreBCModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreBCModelPackage eINSTANCE = ecoreBCModel.impl.EcoreBCModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermediateModelImpl <em>Intermediate Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermediateModelImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermediateModel()
	 * @generated
	 */
	int INTERMEDIATE_MODEL = 0;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermComponentImpl <em>Interm Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermComponentImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermComponent()
	 * @generated
	 */
	int INTERM_COMPONENT = 1;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermAgentImpl <em>Interm Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermAgentImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermAgent()
	 * @generated
	 */
	int INTERM_AGENT = 2;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermRuleImpl <em>Interm Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermRuleImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermRule()
	 * @generated
	 */
	int INTERM_RULE = 3;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermSiteImpl <em>Interm Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermSiteImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermSite()
	 * @generated
	 */
	int INTERM_SITE = 4;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermInitialisationImpl <em>Interm Initialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermInitialisationImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermInitialisation()
	 * @generated
	 */
	int INTERM_INITIALISATION = 5;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermObservableImpl <em>Interm Observable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermObservableImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermObservable()
	 * @generated
	 */
	int INTERM_OBSERVABLE = 6;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermSiteStateImpl <em>Interm Site State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermSiteStateImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermSiteState()
	 * @generated
	 */
	int INTERM_SITE_STATE = 7;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermPatternImpl <em>Interm Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermPatternImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermPattern()
	 * @generated
	 */
	int INTERM_PATTERN = 8;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermAgentInstanceImpl <em>Interm Agent Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermAgentInstanceImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermAgentInstance()
	 * @generated
	 */
	int INTERM_AGENT_INSTANCE = 9;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermSiteInstanceImpl <em>Interm Site Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermSiteInstanceImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermSiteInstance()
	 * @generated
	 */
	int INTERM_SITE_INSTANCE = 10;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.PatternContainerImpl <em>Pattern Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.PatternContainerImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getPatternContainer()
	 * @generated
	 */
	int PATTERN_CONTAINER = 11;

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
	 * The meta object id for the '{@link ecoreBCModel.impl.IntermCommandImpl <em>Interm Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.impl.IntermCommandImpl
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermCommand()
	 * @generated
	 */
	int INTERM_COMMAND = 12;

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
	 * The meta object id for the '{@link ecoreBCModel.BindingState <em>Binding State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.BindingState
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getBindingState()
	 * @generated
	 */
	int BINDING_STATE = 13;

	/**
	 * The meta object id for the '{@link ecoreBCModel.CommandType <em>Command Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreBCModel.CommandType
	 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getCommandType()
	 * @generated
	 */
	int COMMAND_TYPE = 14;

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermediateModel <em>Intermediate Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Model</em>'.
	 * @see ecoreBCModel.IntermediateModel
	 * @generated
	 */
	EClass getIntermediateModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreBCModel.IntermediateModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see ecoreBCModel.IntermediateModel#getComponents()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EReference getIntermediateModel_Components();

	/**
	 * Returns the meta object for the containment reference '{@link ecoreBCModel.IntermediateModel#getPatternContainer <em>Pattern Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern Container</em>'.
	 * @see ecoreBCModel.IntermediateModel#getPatternContainer()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EReference getIntermediateModel_PatternContainer();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermediateModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermediateModel#getName()
	 * @see #getIntermediateModel()
	 * @generated
	 */
	EAttribute getIntermediateModel_Name();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermComponent <em>Interm Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Component</em>'.
	 * @see ecoreBCModel.IntermComponent
	 * @generated
	 */
	EClass getIntermComponent();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermAgent <em>Interm Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Agent</em>'.
	 * @see ecoreBCModel.IntermAgent
	 * @generated
	 */
	EClass getIntermAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreBCModel.IntermAgent#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see ecoreBCModel.IntermAgent#getSites()
	 * @see #getIntermAgent()
	 * @generated
	 */
	EReference getIntermAgent_Sites();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermAgent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermAgent#getName()
	 * @see #getIntermAgent()
	 * @generated
	 */
	EAttribute getIntermAgent_Name();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermRule <em>Interm Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Rule</em>'.
	 * @see ecoreBCModel.IntermRule
	 * @generated
	 */
	EClass getIntermRule();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermRule#getName()
	 * @see #getIntermRule()
	 * @generated
	 */
	EAttribute getIntermRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermRule#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see ecoreBCModel.IntermRule#getRate()
	 * @see #getIntermRule()
	 * @generated
	 */
	EAttribute getIntermRule_Rate();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermRule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see ecoreBCModel.IntermRule#getLhs()
	 * @see #getIntermRule()
	 * @generated
	 */
	EReference getIntermRule_Lhs();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermRule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see ecoreBCModel.IntermRule#getRhs()
	 * @see #getIntermRule()
	 * @generated
	 */
	EReference getIntermRule_Rhs();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermSite <em>Interm Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Site</em>'.
	 * @see ecoreBCModel.IntermSite
	 * @generated
	 */
	EClass getIntermSite();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermSite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermSite#getName()
	 * @see #getIntermSite()
	 * @generated
	 */
	EAttribute getIntermSite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreBCModel.IntermSite#getSiteStates <em>Site States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site States</em>'.
	 * @see ecoreBCModel.IntermSite#getSiteStates()
	 * @see #getIntermSite()
	 * @generated
	 */
	EReference getIntermSite_SiteStates();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermSite#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ecoreBCModel.IntermSite#getParent()
	 * @see #getIntermSite()
	 * @generated
	 */
	EReference getIntermSite_Parent();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermInitialisation <em>Interm Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Initialisation</em>'.
	 * @see ecoreBCModel.IntermInitialisation
	 * @generated
	 */
	EClass getIntermInitialisation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermInitialisation#getCnt <em>Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cnt</em>'.
	 * @see ecoreBCModel.IntermInitialisation#getCnt()
	 * @see #getIntermInitialisation()
	 * @generated
	 */
	EAttribute getIntermInitialisation_Cnt();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermInitialisation#getInitPattern <em>Init Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Pattern</em>'.
	 * @see ecoreBCModel.IntermInitialisation#getInitPattern()
	 * @see #getIntermInitialisation()
	 * @generated
	 */
	EReference getIntermInitialisation_InitPattern();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermObservable <em>Interm Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Observable</em>'.
	 * @see ecoreBCModel.IntermObservable
	 * @generated
	 */
	EClass getIntermObservable();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermObservable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermObservable#getName()
	 * @see #getIntermObservable()
	 * @generated
	 */
	EAttribute getIntermObservable_Name();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermObservable#getObsPattern <em>Obs Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obs Pattern</em>'.
	 * @see ecoreBCModel.IntermObservable#getObsPattern()
	 * @see #getIntermObservable()
	 * @generated
	 */
	EReference getIntermObservable_ObsPattern();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermSiteState <em>Interm Site State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Site State</em>'.
	 * @see ecoreBCModel.IntermSiteState
	 * @generated
	 */
	EClass getIntermSiteState();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermSiteState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermSiteState#getName()
	 * @see #getIntermSiteState()
	 * @generated
	 */
	EAttribute getIntermSiteState_Name();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermPattern <em>Interm Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Pattern</em>'.
	 * @see ecoreBCModel.IntermPattern
	 * @generated
	 */
	EClass getIntermPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreBCModel.IntermPattern#getAgentInstances <em>Agent Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent Instances</em>'.
	 * @see ecoreBCModel.IntermPattern#getAgentInstances()
	 * @see #getIntermPattern()
	 * @generated
	 */
	EReference getIntermPattern_AgentInstances();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermPattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermPattern#getName()
	 * @see #getIntermPattern()
	 * @generated
	 */
	EAttribute getIntermPattern_Name();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermAgentInstance <em>Interm Agent Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Agent Instance</em>'.
	 * @see ecoreBCModel.IntermAgentInstance
	 * @generated
	 */
	EClass getIntermAgentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreBCModel.IntermAgentInstance#getSiteInstances <em>Site Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site Instances</em>'.
	 * @see ecoreBCModel.IntermAgentInstance#getSiteInstances()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EReference getIntermAgentInstance_SiteInstances();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermAgentInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see ecoreBCModel.IntermAgentInstance#getInstanceOf()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EReference getIntermAgentInstance_InstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermAgentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermAgentInstance#getName()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EAttribute getIntermAgentInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermAgentInstance#isLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see ecoreBCModel.IntermAgentInstance#isLocal()
	 * @see #getIntermAgentInstance()
	 * @generated
	 */
	EAttribute getIntermAgentInstance_Local();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermSiteInstance <em>Interm Site Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Site Instance</em>'.
	 * @see ecoreBCModel.IntermSiteInstance
	 * @generated
	 */
	EClass getIntermSiteInstance();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermSiteInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see ecoreBCModel.IntermSiteInstance#getInstanceOf()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_InstanceOf();

	/**
	 * Returns the meta object for the reference list '{@link ecoreBCModel.IntermSiteInstance#getNotBoundTo <em>Not Bound To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Not Bound To</em>'.
	 * @see ecoreBCModel.IntermSiteInstance#getNotBoundTo()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_NotBoundTo();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermSiteInstance#getBoundTo <em>Bound To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound To</em>'.
	 * @see ecoreBCModel.IntermSiteInstance#getBoundTo()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_BoundTo();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermSiteInstance#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see ecoreBCModel.IntermSiteInstance#getBindingState()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EAttribute getIntermSiteInstance_BindingState();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermSiteInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreBCModel.IntermSiteInstance#getName()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EAttribute getIntermSiteInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermSiteInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see ecoreBCModel.IntermSiteInstance#getState()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_State();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermSiteInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ecoreBCModel.IntermSiteInstance#getParent()
	 * @see #getIntermSiteInstance()
	 * @generated
	 */
	EReference getIntermSiteInstance_Parent();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.PatternContainer <em>Pattern Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Container</em>'.
	 * @see ecoreBCModel.PatternContainer
	 * @generated
	 */
	EClass getPatternContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreBCModel.PatternContainer#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see ecoreBCModel.PatternContainer#getPatterns()
	 * @see #getPatternContainer()
	 * @generated
	 */
	EReference getPatternContainer_Patterns();

	/**
	 * Returns the meta object for class '{@link ecoreBCModel.IntermCommand <em>Interm Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interm Command</em>'.
	 * @see ecoreBCModel.IntermCommand
	 * @generated
	 */
	EClass getIntermCommand();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermCommand#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ecoreBCModel.IntermCommand#getType()
	 * @see #getIntermCommand()
	 * @generated
	 */
	EAttribute getIntermCommand_Type();

	/**
	 * Returns the meta object for the reference '{@link ecoreBCModel.IntermCommand#getPatternToMatch <em>Pattern To Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern To Match</em>'.
	 * @see ecoreBCModel.IntermCommand#getPatternToMatch()
	 * @see #getIntermCommand()
	 * @generated
	 */
	EReference getIntermCommand_PatternToMatch();

	/**
	 * Returns the meta object for the attribute '{@link ecoreBCModel.IntermCommand#getCnt <em>Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cnt</em>'.
	 * @see ecoreBCModel.IntermCommand#getCnt()
	 * @see #getIntermCommand()
	 * @generated
	 */
	EAttribute getIntermCommand_Cnt();

	/**
	 * Returns the meta object for enum '{@link ecoreBCModel.BindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding State</em>'.
	 * @see ecoreBCModel.BindingState
	 * @generated
	 */
	EEnum getBindingState();

	/**
	 * Returns the meta object for enum '{@link ecoreBCModel.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Type</em>'.
	 * @see ecoreBCModel.CommandType
	 * @generated
	 */
	EEnum getCommandType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreBCModelFactory getEcoreBCModelFactory();

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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermediateModelImpl <em>Intermediate Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermediateModelImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermediateModel()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermComponentImpl <em>Interm Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermComponentImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermComponent()
		 * @generated
		 */
		EClass INTERM_COMPONENT = eINSTANCE.getIntermComponent();

		/**
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermAgentImpl <em>Interm Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermAgentImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermAgent()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermRuleImpl <em>Interm Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermRuleImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermRule()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermSiteImpl <em>Interm Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermSiteImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermSite()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermInitialisationImpl <em>Interm Initialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermInitialisationImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermInitialisation()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermObservableImpl <em>Interm Observable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermObservableImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermObservable()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermSiteStateImpl <em>Interm Site State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermSiteStateImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermSiteState()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermPatternImpl <em>Interm Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermPatternImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermPattern()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermAgentInstanceImpl <em>Interm Agent Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermAgentInstanceImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermAgentInstance()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermSiteInstanceImpl <em>Interm Site Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermSiteInstanceImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermSiteInstance()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.PatternContainerImpl <em>Pattern Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.PatternContainerImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getPatternContainer()
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
		 * The meta object literal for the '{@link ecoreBCModel.impl.IntermCommandImpl <em>Interm Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.impl.IntermCommandImpl
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getIntermCommand()
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
		 * The meta object literal for the '{@link ecoreBCModel.BindingState <em>Binding State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.BindingState
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getBindingState()
		 * @generated
		 */
		EEnum BINDING_STATE = eINSTANCE.getBindingState();

		/**
		 * The meta object literal for the '{@link ecoreBCModel.CommandType <em>Command Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreBCModel.CommandType
		 * @see ecoreBCModel.impl.EcoreBCModelPackageImpl#getCommandType()
		 * @generated
		 */
		EEnum COMMAND_TYPE = eINSTANCE.getCommandType();

	}

} //EcoreBCModelPackage
