/**
 */
package ecoreBCModel.impl;

import ecoreBCModel.*;

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
public class EcoreBCModelFactoryImpl extends EFactoryImpl implements EcoreBCModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreBCModelFactory init() {
		try {
			EcoreBCModelFactory theEcoreBCModelFactory = (EcoreBCModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(EcoreBCModelPackage.eNS_URI);
			if (theEcoreBCModelFactory != null) {
				return theEcoreBCModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreBCModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreBCModelFactoryImpl() {
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
		case EcoreBCModelPackage.INTERMEDIATE_MODEL:
			return createIntermediateModel();
		case EcoreBCModelPackage.INTERM_AGENT:
			return createIntermAgent();
		case EcoreBCModelPackage.INTERM_RULE:
			return createIntermRule();
		case EcoreBCModelPackage.INTERM_SITE:
			return createIntermSite();
		case EcoreBCModelPackage.INTERM_INITIALISATION:
			return createIntermInitialisation();
		case EcoreBCModelPackage.INTERM_OBSERVABLE:
			return createIntermObservable();
		case EcoreBCModelPackage.INTERM_SITE_STATE:
			return createIntermSiteState();
		case EcoreBCModelPackage.INTERM_PATTERN:
			return createIntermPattern();
		case EcoreBCModelPackage.INTERM_AGENT_INSTANCE:
			return createIntermAgentInstance();
		case EcoreBCModelPackage.INTERM_SITE_INSTANCE:
			return createIntermSiteInstance();
		case EcoreBCModelPackage.PATTERN_CONTAINER:
			return createPatternContainer();
		case EcoreBCModelPackage.INTERM_COMMAND:
			return createIntermCommand();
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
		case EcoreBCModelPackage.BINDING_STATE:
			return createBindingStateFromString(eDataType, initialValue);
		case EcoreBCModelPackage.COMMAND_TYPE:
			return createCommandTypeFromString(eDataType, initialValue);
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
		case EcoreBCModelPackage.BINDING_STATE:
			return convertBindingStateToString(eDataType, instanceValue);
		case EcoreBCModelPackage.COMMAND_TYPE:
			return convertCommandTypeToString(eDataType, instanceValue);
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
	public IntermAgentInstance createIntermAgentInstance() {
		IntermAgentInstanceImpl intermAgentInstance = new IntermAgentInstanceImpl();
		return intermAgentInstance;
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
	public IntermCommand createIntermCommand() {
		IntermCommandImpl intermCommand = new IntermCommandImpl();
		return intermCommand;
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
	@Override
	public EcoreBCModelPackage getEcoreBCModelPackage() {
		return (EcoreBCModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreBCModelPackage getPackage() {
		return EcoreBCModelPackage.eINSTANCE;
	}

} //EcoreBCModelFactoryImpl
