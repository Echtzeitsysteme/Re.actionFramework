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
	String eNS_URI = "platform:/resource/org.reaction.gklExample/model/GKLModel.ecore";

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
	 * The feature id for the '<em><b>PaTx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PATX = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PaTy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PATY = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GKLModel.impl.TImpl <em>T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GKLModel.impl.TImpl
	 * @see GKLModel.impl.GKLModelPackageImpl#getT()
	 * @generated
	 */
	int T = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>TxPa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TXPA = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TyPa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TYPA = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TxKa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TXKA = ReactionContainerPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Txu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TXU = ReactionContainerPackage.AGENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Txp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TXP = ReactionContainerPackage.AGENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TyKa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TYKA = ReactionContainerPackage.AGENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tyu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TYU = ReactionContainerPackage.AGENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T__TYP = ReactionContainerPackage.AGENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GKLModel.impl.KImpl <em>K</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GKLModel.impl.KImpl
	 * @see GKLModel.impl.GKLModelPackageImpl#getK()
	 * @generated
	 */
	int K = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K__ID = ReactionContainerPackage.AGENT__ID;

	/**
	 * The feature id for the '<em><b>KaTx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K__KATX = ReactionContainerPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>KaTy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K__KATY = ReactionContainerPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>K</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K_FEATURE_COUNT = ReactionContainerPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>K</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int K_OPERATION_COUNT = ReactionContainerPackage.AGENT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the reference '{@link GKLModel.P#getP_a_T_x <em>PaTx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PaTx</em>'.
	 * @see GKLModel.P#getP_a_T_x()
	 * @see #getP()
	 * @generated
	 */
	EReference getP_P_a_T_x();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.P#getP_a_T_y <em>PaTy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PaTy</em>'.
	 * @see GKLModel.P#getP_a_T_y()
	 * @see #getP()
	 * @generated
	 */
	EReference getP_P_a_T_y();

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
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_x_P_a <em>TxPa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TxPa</em>'.
	 * @see GKLModel.T#getT_x_P_a()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_x_P_a();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_y_P_a <em>TyPa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TyPa</em>'.
	 * @see GKLModel.T#getT_y_P_a()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_y_P_a();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_x_K_a <em>TxKa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TxKa</em>'.
	 * @see GKLModel.T#getT_x_K_a()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_x_K_a();

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
	 * Returns the meta object for the reference '{@link GKLModel.T#getT_y_K_a <em>TyKa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TyKa</em>'.
	 * @see GKLModel.T#getT_y_K_a()
	 * @see #getT()
	 * @generated
	 */
	EReference getT_T_y_K_a();

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
	 * Returns the meta object for class '{@link GKLModel.K <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>K</em>'.
	 * @see GKLModel.K
	 * @generated
	 */
	EClass getK();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.K#getK_a_T_x <em>KaTx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>KaTx</em>'.
	 * @see GKLModel.K#getK_a_T_x()
	 * @see #getK()
	 * @generated
	 */
	EReference getK_K_a_T_x();

	/**
	 * Returns the meta object for the reference '{@link GKLModel.K#getK_a_T_y <em>KaTy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>KaTy</em>'.
	 * @see GKLModel.K#getK_a_T_y()
	 * @see #getK()
	 * @generated
	 */
	EReference getK_K_a_T_y();

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
		 * The meta object literal for the '<em><b>PaTx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P__PATX = eINSTANCE.getP_P_a_T_x();

		/**
		 * The meta object literal for the '<em><b>PaTy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P__PATY = eINSTANCE.getP_P_a_T_y();

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
		 * The meta object literal for the '<em><b>TxPa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TXPA = eINSTANCE.getT_T_x_P_a();

		/**
		 * The meta object literal for the '<em><b>TyPa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TYPA = eINSTANCE.getT_T_y_P_a();

		/**
		 * The meta object literal for the '<em><b>TxKa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TXKA = eINSTANCE.getT_T_x_K_a();

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
		 * The meta object literal for the '<em><b>TyKa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T__TYKA = eINSTANCE.getT_T_y_K_a();

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
		 * The meta object literal for the '{@link GKLModel.impl.KImpl <em>K</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GKLModel.impl.KImpl
		 * @see GKLModel.impl.GKLModelPackageImpl#getK()
		 * @generated
		 */
		EClass K = eINSTANCE.getK();

		/**
		 * The meta object literal for the '<em><b>KaTx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference K__KATX = eINSTANCE.getK_K_a_T_x();

		/**
		 * The meta object literal for the '<em><b>KaTy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference K__KATY = eINSTANCE.getK_K_a_T_y();

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
