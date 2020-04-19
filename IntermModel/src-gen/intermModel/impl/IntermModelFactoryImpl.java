/**
 */
package intermModel.impl;

import intermModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class IntermModelFactoryImpl extends EFactoryImpl implements IntermModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermModelFactory init() {
		try {
			IntermModelFactory theIntermModelFactory = (IntermModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(IntermModelPackage.eNS_URI);
			if (theIntermModelFactory != null) {
				return theIntermModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermModelFactoryImpl() {
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
		case IntermModelPackage.INTERM_SITE:
			return createIntermSite();
		case IntermModelPackage.INTERM_INITIALISATION:
			return createIntermInitialisation();
		case IntermModelPackage.INTERM_SITE_INSTANCE:
			return createIntermSiteInstance();
		case IntermModelPackage.PATTERN_CONTAINER:
			return createPatternContainer();
		case IntermModelPackage.INTERM_SITE_STATE:
			return createIntermSiteState();
		case IntermModelPackage.INTERM_PATTERN:
			return createIntermPattern();
		case IntermModelPackage.INTERM_RULE:
			return createIntermRule();
		case IntermModelPackage.INTERM_OBSERVABLE:
			return createIntermObservable();
		case IntermModelPackage.INTERM_AGENT:
			return createIntermAgent();
		case IntermModelPackage.INTERMEDIATE_MODEL:
			return createIntermediateModel();
		case IntermModelPackage.INTERM_COMMAND:
			return createIntermCommand();
		case IntermModelPackage.INTERM_AGENT_INSTANCE:
			return createIntermAgentInstance();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case IntermModelPackage.COMMAND_TYPE:
			return createCommandTypeFromString(eDataType, initialValue);
		case IntermModelPackage.BINDING_STATE:
			return createBindingStateFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case IntermModelPackage.COMMAND_TYPE:
			return convertCommandTypeToString(eDataType, instanceValue);
		case IntermModelPackage.BINDING_STATE:
			return convertBindingStateToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermSite createIntermSite() {
		IntermSiteImpl intermSite = new IntermSiteImpl();
		return intermSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermInitialisation createIntermInitialisation() {
		IntermInitialisationImpl intermInitialisation = new IntermInitialisationImpl();
		return intermInitialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermSiteInstance createIntermSiteInstance() {
		IntermSiteInstanceImpl intermSiteInstance = new IntermSiteInstanceImpl();
		return intermSiteInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternContainer createPatternContainer() {
		PatternContainerImpl patternContainer = new PatternContainerImpl();
		return patternContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermSiteState createIntermSiteState() {
		IntermSiteStateImpl intermSiteState = new IntermSiteStateImpl();
		return intermSiteState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermPattern createIntermPattern() {
		IntermPatternImpl intermPattern = new IntermPatternImpl();
		return intermPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermRule createIntermRule() {
		IntermRuleImpl intermRule = new IntermRuleImpl();
		return intermRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermObservable createIntermObservable() {
		IntermObservableImpl intermObservable = new IntermObservableImpl();
		return intermObservable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermAgent createIntermAgent() {
		IntermAgentImpl intermAgent = new IntermAgentImpl();
		return intermAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateModel createIntermediateModel() {
		IntermediateModelImpl intermediateModel = new IntermediateModelImpl();
		return intermediateModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermCommand createIntermCommand() {
		IntermCommandImpl intermCommand = new IntermCommandImpl();
		return intermCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermAgentInstance createIntermAgentInstance() {
		IntermAgentInstanceImpl intermAgentInstance = new IntermAgentInstanceImpl();
		return intermAgentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType createCommandTypeFromString(EDataType eDataType, String initialValue) {
		CommandType result = CommandType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingState createBindingStateFromString(EDataType eDataType, String initialValue) {
		BindingState result = BindingState.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermModelPackage getIntermModelPackage() {
		return (IntermModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermModelPackage getPackage() {
		return IntermModelPackage.eINSTANCE;
	}

} //IntermModelFactoryImpl
