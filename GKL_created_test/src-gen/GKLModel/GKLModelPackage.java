/**
 */
package GKLModel;

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
 * @see GKLModel.GKLModelFactory
 * @model kind="package"
 * @generated
 */
public interface GKLModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GKLModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/GKL_created_test/model/GKLModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GKLModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GKLModelPackage eINSTANCE = GKLModel.impl.GKLModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link GKLModel.impl.PImpl <em>P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GKLModel.impl.PImpl
	 * @see GKLModel.impl.GKLModelPackageImpl#getP()
	 * @generated
	 */
	int P = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>Pa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PA = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GKLModel.impl.KImpl <em>K</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GKLModel.impl.KImpl
	 * @see GKLModel.impl.GKLModelPackageImpl#getK()
	 * @generated
	 */
	int K = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>Ka</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K__KA = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>K</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>K</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GKLModel.impl.TImpl <em>T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GKLModel.impl.TImpl
	 * @see GKLModel.impl.GKLModelPackageImpl#getT()
	 * @generated
	 */
	int T = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TX = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Txu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TXU = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Txp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TXP = ReactionContainerPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TY = ReactionContainerPackage.AGENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tyu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TYU = ReactionContainerPackage.AGENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TYP = ReactionContainerPackage.AGENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GKLModel.impl.U_sImpl <em>Us</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GKLModel.impl.U_sImpl
	 * @see GKLModel.impl.GKLModelPackageImpl#getU_s()
	 * @generated
	 */
	int US = 3;

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
	 * The meta object id for the '{@link GKLModel.impl.P_sImpl <em>Ps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GKLModel.impl.P_sImpl
	 * @see GKLModel.impl.GKLModelPackageImpl#getP_s()
	 * @generated
	 */
	int PS = 4;

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
	 * Returns the meta object for class '{@link GKLModel.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P</em>'.
	 * @see GKLModel.P
	 * @generated
	 */
	EClass getP();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.P#getP_a <em>Pa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pa</em>'.
	 * @see GKLModel.P#getP_a()
	 * @see #getP()
	 * @generated
	 */
	EReference getP_P_a();

	/**
	 * Returns the meta object for class '{@link GKLModel.K <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>K</em>'.
	 * @see GKLModel.K
	 * @generated
	 */
	EClass getK();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.K#getK_a <em>Ka</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ka</em>'.
	 * @see GKLModel.K#getK_a()
	 * @see #getK()
	 * @generated
	 */
	EReference getK_K_a();

	/**
	 * Returns the meta object for class '{@link GKLModel.T <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T</em>'.
	 * @see GKLModel.T
	 * @generated
	 */
	EClass getT();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_x <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tx</em>'.
	 * @see GKLModel.T#getT_x()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_x();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_x_u <em>Txu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Txu</em>'.
	 * @see GKLModel.T#getT_x_u()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_x_u();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_x_p <em>Txp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Txp</em>'.
	 * @see GKLModel.T#getT_x_p()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_x_p();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_y <em>Ty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ty</em>'.
	 * @see GKLModel.T#getT_y()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_y();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_y_u <em>Tyu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tyu</em>'.
	 * @see GKLModel.T#getT_y_u()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_y_u();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_y_p <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typ</em>'.
	 * @see GKLModel.T#getT_y_p()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_y_p();

	/**
	 * Returns the meta object for class '{@link GKLModel.U_s <em>Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Us</em>'.
	 * @see GKLModel.U_s
	 * @generated
	 */
	EClass getU_s();

	/**
	 * Returns the meta object for class '{@link GKLModel.P_s <em>Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ps</em>'.
	 * @see GKLModel.P_s
	 * @generated
	 */
	EClass getP_s();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GKLModelFactory getGKLModelFactory();

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
		 * The meta object literal for the '{@link GKLModel.impl.PImpl <em>P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GKLModel.impl.PImpl
		 * @see GKLModel.impl.GKLModelPackageImpl#getP()
		 * @generated
		 */
		EClass P = eINSTANCE.getP();

		/**
		 * The meta object literal for the '<em><b>Pa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P__PA = eINSTANCE.getP_P_a();

		/**
		 * The meta object literal for the '{@link GKLModel.impl.KImpl <em>K</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GKLModel.impl.KImpl
		 * @see GKLModel.impl.GKLModelPackageImpl#getK()
		 * @generated
		 */
		EClass K = eINSTANCE.getK();

		/**
		 * The meta object literal for the '<em><b>Ka</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference K__KA = eINSTANCE.getK_K_a();

		/**
		 * The meta object literal for the '{@link GKLModel.impl.TImpl <em>T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GKLModel.impl.TImpl
		 * @see GKLModel.impl.GKLModelPackageImpl#getT()
		 * @generated
		 */
		EClass T = eINSTANCE.getT();

		/**
		 * The meta object literal for the '<em><b>Tx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TX = eINSTANCE.getT_T_x();

		/**
		 * The meta object literal for the '<em><b>Txu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TXU = eINSTANCE.getT_T_x_u();

		/**
		 * The meta object literal for the '<em><b>Txp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TXP = eINSTANCE.getT_T_x_p();

		/**
		 * The meta object literal for the '<em><b>Ty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TY = eINSTANCE.getT_T_y();

		/**
		 * The meta object literal for the '<em><b>Tyu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TYU = eINSTANCE.getT_T_y_u();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TYP = eINSTANCE.getT_T_y_p();

		/**
		 * The meta object literal for the '{@link GKLModel.impl.U_sImpl <em>Us</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GKLModel.impl.U_sImpl
		 * @see GKLModel.impl.GKLModelPackageImpl#getU_s()
		 * @generated
		 */
		EClass US = eINSTANCE.getU_s();

		/**
		 * The meta object literal for the '{@link GKLModel.impl.P_sImpl <em>Ps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GKLModel.impl.P_sImpl
		 * @see GKLModel.impl.GKLModelPackageImpl#getP_s()
		 * @generated
		 */
		EClass PS = eINSTANCE.getP_s();

	}

} //GKLModelPackage