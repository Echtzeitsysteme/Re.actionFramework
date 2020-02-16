/**
 */
package TestcasesModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import reactionContainer.ReactionContainerPackage;

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
 * @see TestcasesModel.TestcasesModelFactory
 * @model kind="package"
 * @generated
 */
public interface TestcasesModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestcasesModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/GeneralTestSimSG/model/TestcasesModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TestcasesModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestcasesModelPackage eINSTANCE = TestcasesModel.impl.TestcasesModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link TestcasesModel.impl.TImpl <em>T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestcasesModel.impl.TImpl
	 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getT()
	 * @generated
	 */
	int T = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>Ti</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TI = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TJ = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestcasesModel.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestcasesModel.impl.AImpl
	 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getA()
	 * @generated
	 */
	int A = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>Ab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__AB = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__AC = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ACU = ReactionContainerPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Acp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ACP = ReactionContainerPackage.AGENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestcasesModel.impl.U_sImpl <em>Us</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestcasesModel.impl.U_sImpl
	 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getU_s()
	 * @generated
	 */
	int US = 2;

	/**
	 * The number of structural features of the '<em>Us</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_FEATURE_COUNT = ReactionContainerPackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Us</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_OPERATION_COUNT = ReactionContainerPackage.STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestcasesModel.impl.P_sImpl <em>Ps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestcasesModel.impl.P_sImpl
	 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getP_s()
	 * @generated
	 */
	int PS = 3;

	/**
	 * The number of structural features of the '<em>Ps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_FEATURE_COUNT = ReactionContainerPackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OPERATION_COUNT = ReactionContainerPackage.STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestcasesModel.impl.XImpl <em>X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestcasesModel.impl.XImpl
	 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getX()
	 * @generated
	 */
	int X = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>Xy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__XY = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__XZ = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xzu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__XZU = ReactionContainerPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xzp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__XZP = ReactionContainerPackage.AGENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link TestcasesModel.T <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T</em>'.
	 * @see TestcasesModel.T
	 * @generated
	 */
	EClass getT();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.T#getT_i <em>Ti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ti</em>'.
	 * @see TestcasesModel.T#getT_i()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_i();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.T#getT_j <em>Tj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tj</em>'.
	 * @see TestcasesModel.T#getT_j()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_j();

	/**
	 * Returns the meta object for class '{@link TestcasesModel.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see TestcasesModel.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.A#getA_b <em>Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ab</em>'.
	 * @see TestcasesModel.A#getA_b()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_A_b();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.A#getA_c <em>Ac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ac</em>'.
	 * @see TestcasesModel.A#getA_c()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_A_c();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.A#getA_c_u <em>Acu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acu</em>'.
	 * @see TestcasesModel.A#getA_c_u()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_A_c_u();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.A#getA_c_p <em>Acp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acp</em>'.
	 * @see TestcasesModel.A#getA_c_p()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_A_c_p();

	/**
	 * Returns the meta object for class '{@link TestcasesModel.U_s <em>Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Us</em>'.
	 * @see TestcasesModel.U_s
	 * @generated
	 */
	EClass getU_s();

	/**
	 * Returns the meta object for class '{@link TestcasesModel.P_s <em>Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ps</em>'.
	 * @see TestcasesModel.P_s
	 * @generated
	 */
	EClass getP_s();

	/**
	 * Returns the meta object for class '{@link TestcasesModel.X <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X</em>'.
	 * @see TestcasesModel.X
	 * @generated
	 */
	EClass getX();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.X#getX_y <em>Xy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xy</em>'.
	 * @see TestcasesModel.X#getX_y()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_X_y();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.X#getX_z <em>Xz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xz</em>'.
	 * @see TestcasesModel.X#getX_z()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_X_z();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.X#getX_z_u <em>Xzu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xzu</em>'.
	 * @see TestcasesModel.X#getX_z_u()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_X_z_u();

	/**
	 * Returns the meta object for the reference '{@link TestcasesModel.X#getX_z_p <em>Xzp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xzp</em>'.
	 * @see TestcasesModel.X#getX_z_p()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_X_z_p();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestcasesModelFactory getTestcasesModelFactory();

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
		 * The meta object literal for the '{@link TestcasesModel.impl.TImpl <em>T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestcasesModel.impl.TImpl
		 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getT()
		 * @generated
		 */
		EClass T = eINSTANCE.getT();

		/**
		 * The meta object literal for the '<em><b>Ti</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TI = eINSTANCE.getT_T_i();

		/**
		 * The meta object literal for the '<em><b>Tj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TJ = eINSTANCE.getT_T_j();

		/**
		 * The meta object literal for the '{@link TestcasesModel.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestcasesModel.impl.AImpl
		 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Ab</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__AB = eINSTANCE.getA_A_b();

		/**
		 * The meta object literal for the '<em><b>Ac</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__AC = eINSTANCE.getA_A_c();

		/**
		 * The meta object literal for the '<em><b>Acu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__ACU = eINSTANCE.getA_A_c_u();

		/**
		 * The meta object literal for the '<em><b>Acp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__ACP = eINSTANCE.getA_A_c_p();

		/**
		 * The meta object literal for the '{@link TestcasesModel.impl.U_sImpl <em>Us</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestcasesModel.impl.U_sImpl
		 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getU_s()
		 * @generated
		 */
		EClass US = eINSTANCE.getU_s();

		/**
		 * The meta object literal for the '{@link TestcasesModel.impl.P_sImpl <em>Ps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestcasesModel.impl.P_sImpl
		 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getP_s()
		 * @generated
		 */
		EClass PS = eINSTANCE.getP_s();

		/**
		 * The meta object literal for the '{@link TestcasesModel.impl.XImpl <em>X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestcasesModel.impl.XImpl
		 * @see TestcasesModel.impl.TestcasesModelPackageImpl#getX()
		 * @generated
		 */
		EClass X = eINSTANCE.getX();

		/**
		 * The meta object literal for the '<em><b>Xy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__XY = eINSTANCE.getX_X_y();

		/**
		 * The meta object literal for the '<em><b>Xz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__XZ = eINSTANCE.getX_X_z();

		/**
		 * The meta object literal for the '<em><b>Xzu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__XZU = eINSTANCE.getX_X_z_u();

		/**
		 * The meta object literal for the '<em><b>Xzp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__XZP = eINSTANCE.getX_X_z_p();

	}

} //TestcasesModelPackage
