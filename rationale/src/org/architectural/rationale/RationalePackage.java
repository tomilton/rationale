/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.architectural.rationale.RationaleFactory
 * @model kind="package"
 * @generated
 */
public interface RationalePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rationale";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rationale/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rationale";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RationalePackage eINSTANCE = org.architectural.rationale.impl.RationalePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl <em>Architectural Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.ArchitecturalRationaleImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalRationale()
	 * @generated
	 */
	int ARCHITECTURAL_RATIONALE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__NAME = 0;

	/**
	 * The feature id for the '<em><b>AHave J</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_J = 1;

	/**
	 * The feature id for the '<em><b>AHave C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_C = 2;

	/**
	 * The feature id for the '<em><b>AHave R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_R = 3;

	/**
	 * The feature id for the '<em><b>AHave A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_A = 4;

	/**
	 * The feature id for the '<em><b>AHave Cq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_CQ = 5;

	/**
	 * The feature id for the '<em><b>AHave Ad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_AD = 6;

	/**
	 * The feature id for the '<em><b>AHave S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_S = 7;

	/**
	 * The feature id for the '<em><b>AHave T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_T = 8;

	/**
	 * The feature id for the '<em><b>AHave P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE__AHAVE_P = 9;

	/**
	 * The number of structural features of the '<em>Architectural Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Architectural Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_RATIONALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.ContextImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Context Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.JustificationImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Justification Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__JUSTIFICATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Justification Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__JUSTIFICATION_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.AlternativeImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 3;

	/**
	 * The feature id for the '<em><b>Alternative Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ALTERNATIVE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Alternative Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ALTERNATIVE_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.RationaleImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 4;

	/**
	 * The feature id for the '<em><b>Rationale Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Rationale Has Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_HAS_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Rationale Has Justification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_HAS_JUSTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Rationale Has Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_HAS_ALTERNATIVE = 4;

	/**
	 * The feature id for the '<em><b>Rationale Has Consequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_HAS_CONSEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Rationale Has Architectural Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION = 6;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.ConsequenceImpl <em>Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.ConsequenceImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getConsequence()
	 * @generated
	 */
	int CONSEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Consequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__CONSEQUENCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Consequence Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__CONSEQUENCE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__PRO = 2;

	/**
	 * The feature id for the '<em><b>Con</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__CON = 3;

	/**
	 * The number of structural features of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.ArchitecturalDecisionImpl <em>Architectural Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.ArchitecturalDecisionImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalDecision()
	 * @generated
	 */
	int ARCHITECTURAL_DECISION = 6;

	/**
	 * The feature id for the '<em><b>Architectural Decision Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Architectural Decision Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Architectural Decision Has Architectural Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Architectural Decision Has Architectural Tactic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC = 3;

	/**
	 * The feature id for the '<em><b>Architectural Decision Has Architectural Strategy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY = 4;

	/**
	 * The number of structural features of the '<em>Architectural Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_DECISION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Architectural Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.ArchitecturalPatternImpl <em>Architectural Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.ArchitecturalPatternImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalPattern()
	 * @generated
	 */
	int ARCHITECTURAL_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Architectural Pattern Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Architectural Pattern Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Architectural Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Architectural Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.ArchitecturalTacticImpl <em>Architectural Tactic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.ArchitecturalTacticImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalTactic()
	 * @generated
	 */
	int ARCHITECTURAL_TACTIC = 8;

	/**
	 * The feature id for the '<em><b>Architectural Tactic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Architectural Tactic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Architectural Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_TACTIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Architectural Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_TACTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.architectural.rationale.impl.ArchitecturalStrategyImpl <em>Architectural Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.architectural.rationale.impl.ArchitecturalStrategyImpl
	 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalStrategy()
	 * @generated
	 */
	int ARCHITECTURAL_STRATEGY = 9;

	/**
	 * The feature id for the '<em><b>Architectural Strategy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Architectural Strategy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Architectural Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Architectural Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_STRATEGY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.ArchitecturalRationale <em>Architectural Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Rationale</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale
	 * @generated
	 */
	EClass getArchitecturalRationale();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalRationale#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getName()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EAttribute getArchitecturalRationale_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_J <em>AHave J</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave J</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_J()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_J();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_C <em>AHave C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave C</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_C()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_C();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_R <em>AHave R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave R</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_R()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_R();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_A <em>AHave A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave A</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_A()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_Cq <em>AHave Cq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave Cq</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_Cq()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_Cq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_Ad <em>AHave Ad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave Ad</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_Ad()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_Ad();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_S <em>AHave S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave S</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_S()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_S();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_T <em>AHave T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave T</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_T()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_T();

	/**
	 * Returns the meta object for the containment reference list '{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_P <em>AHave P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AHave P</em>'.
	 * @see org.architectural.rationale.ArchitecturalRationale#getA_Have_P()
	 * @see #getArchitecturalRationale()
	 * @generated
	 */
	EReference getArchitecturalRationale_A_Have_P();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.architectural.rationale.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Context#getContextName <em>Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Name</em>'.
	 * @see org.architectural.rationale.Context#getContextName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_ContextName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Context#getContextDescription <em>Context Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Description</em>'.
	 * @see org.architectural.rationale.Context#getContextDescription()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_ContextDescription();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see org.architectural.rationale.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Justification#getJustificationName <em>Justification Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification Name</em>'.
	 * @see org.architectural.rationale.Justification#getJustificationName()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_JustificationName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Justification#getJustificationDescription <em>Justification Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification Description</em>'.
	 * @see org.architectural.rationale.Justification#getJustificationDescription()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_JustificationDescription();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see org.architectural.rationale.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Alternative#getAlternativeName <em>Alternative Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Name</em>'.
	 * @see org.architectural.rationale.Alternative#getAlternativeName()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_AlternativeName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Alternative#getAlternativeDescription <em>Alternative Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Description</em>'.
	 * @see org.architectural.rationale.Alternative#getAlternativeDescription()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_AlternativeDescription();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see org.architectural.rationale.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Rationale#getRationaleName <em>Rationale Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale Name</em>'.
	 * @see org.architectural.rationale.Rationale#getRationaleName()
	 * @see #getRationale()
	 * @generated
	 */
	EAttribute getRationale_RationaleName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Rationale#getRationaleDescription <em>Rationale Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale Description</em>'.
	 * @see org.architectural.rationale.Rationale#getRationaleDescription()
	 * @see #getRationale()
	 * @generated
	 */
	EAttribute getRationale_RationaleDescription();

	/**
	 * Returns the meta object for the reference '{@link org.architectural.rationale.Rationale#getRationale_Has_Context <em>Rationale Has Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rationale Has Context</em>'.
	 * @see org.architectural.rationale.Rationale#getRationale_Has_Context()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Rationale_Has_Context();

	/**
	 * Returns the meta object for the reference list '{@link org.architectural.rationale.Rationale#getRationale_Has_Justification <em>Rationale Has Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rationale Has Justification</em>'.
	 * @see org.architectural.rationale.Rationale#getRationale_Has_Justification()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Rationale_Has_Justification();

	/**
	 * Returns the meta object for the reference '{@link org.architectural.rationale.Rationale#getRationale_Has_Alternative <em>Rationale Has Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rationale Has Alternative</em>'.
	 * @see org.architectural.rationale.Rationale#getRationale_Has_Alternative()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Rationale_Has_Alternative();

	/**
	 * Returns the meta object for the reference list '{@link org.architectural.rationale.Rationale#getRationale_Has_Consequence <em>Rationale Has Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rationale Has Consequence</em>'.
	 * @see org.architectural.rationale.Rationale#getRationale_Has_Consequence()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Rationale_Has_Consequence();

	/**
	 * Returns the meta object for the reference '{@link org.architectural.rationale.Rationale#getRationale_Has_ArchitecturalDecision <em>Rationale Has Architectural Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rationale Has Architectural Decision</em>'.
	 * @see org.architectural.rationale.Rationale#getRationale_Has_ArchitecturalDecision()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Rationale_Has_ArchitecturalDecision();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consequence</em>'.
	 * @see org.architectural.rationale.Consequence
	 * @generated
	 */
	EClass getConsequence();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Consequence#getConsequenceName <em>Consequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequence Name</em>'.
	 * @see org.architectural.rationale.Consequence#getConsequenceName()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_ConsequenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Consequence#getConsequenceDescription <em>Consequence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequence Description</em>'.
	 * @see org.architectural.rationale.Consequence#getConsequenceDescription()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_ConsequenceDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Consequence#getPro <em>Pro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pro</em>'.
	 * @see org.architectural.rationale.Consequence#getPro()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_Pro();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.Consequence#getCon <em>Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Con</em>'.
	 * @see org.architectural.rationale.Consequence#getCon()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_Con();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.ArchitecturalDecision <em>Architectural Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Decision</em>'.
	 * @see org.architectural.rationale.ArchitecturalDecision
	 * @generated
	 */
	EClass getArchitecturalDecision();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionName <em>Architectural Decision Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Decision Name</em>'.
	 * @see org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionName()
	 * @see #getArchitecturalDecision()
	 * @generated
	 */
	EAttribute getArchitecturalDecision_ArchitecturalDecisionName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionDescription <em>Architectural Decision Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Decision Description</em>'.
	 * @see org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionDescription()
	 * @see #getArchitecturalDecision()
	 * @generated
	 */
	EAttribute getArchitecturalDecision_ArchitecturalDecisionDescription();

	/**
	 * Returns the meta object for the reference list '{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalPattern <em>Architectural Decision Has Architectural Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Architectural Decision Has Architectural Pattern</em>'.
	 * @see org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalPattern()
	 * @see #getArchitecturalDecision()
	 * @generated
	 */
	EReference getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern();

	/**
	 * Returns the meta object for the reference list '{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalTactic <em>Architectural Decision Has Architectural Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Architectural Decision Has Architectural Tactic</em>'.
	 * @see org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalTactic()
	 * @see #getArchitecturalDecision()
	 * @generated
	 */
	EReference getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic();

	/**
	 * Returns the meta object for the reference list '{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalStrategy <em>Architectural Decision Has Architectural Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Architectural Decision Has Architectural Strategy</em>'.
	 * @see org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalStrategy()
	 * @see #getArchitecturalDecision()
	 * @generated
	 */
	EReference getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.ArchitecturalPattern <em>Architectural Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Pattern</em>'.
	 * @see org.architectural.rationale.ArchitecturalPattern
	 * @generated
	 */
	EClass getArchitecturalPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternName <em>Architectural Pattern Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Pattern Name</em>'.
	 * @see org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternName()
	 * @see #getArchitecturalPattern()
	 * @generated
	 */
	EAttribute getArchitecturalPattern_ArchitecturalPatternName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternDescription <em>Architectural Pattern Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Pattern Description</em>'.
	 * @see org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternDescription()
	 * @see #getArchitecturalPattern()
	 * @generated
	 */
	EAttribute getArchitecturalPattern_ArchitecturalPatternDescription();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.ArchitecturalTactic <em>Architectural Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Tactic</em>'.
	 * @see org.architectural.rationale.ArchitecturalTactic
	 * @generated
	 */
	EClass getArchitecturalTactic();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticName <em>Architectural Tactic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Tactic Name</em>'.
	 * @see org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticName()
	 * @see #getArchitecturalTactic()
	 * @generated
	 */
	EAttribute getArchitecturalTactic_ArchitecturalTacticName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticDescription <em>Architectural Tactic Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Tactic Description</em>'.
	 * @see org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticDescription()
	 * @see #getArchitecturalTactic()
	 * @generated
	 */
	EAttribute getArchitecturalTactic_ArchitecturalTacticDescription();

	/**
	 * Returns the meta object for class '{@link org.architectural.rationale.ArchitecturalStrategy <em>Architectural Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Strategy</em>'.
	 * @see org.architectural.rationale.ArchitecturalStrategy
	 * @generated
	 */
	EClass getArchitecturalStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyName <em>Architectural Strategy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Strategy Name</em>'.
	 * @see org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyName()
	 * @see #getArchitecturalStrategy()
	 * @generated
	 */
	EAttribute getArchitecturalStrategy_ArchitecturalStrategyName();

	/**
	 * Returns the meta object for the attribute '{@link org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyDescription <em>Architectural Strategy Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Strategy Description</em>'.
	 * @see org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyDescription()
	 * @see #getArchitecturalStrategy()
	 * @generated
	 */
	EAttribute getArchitecturalStrategy_ArchitecturalStrategyDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RationaleFactory getRationaleFactory();

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
		 * The meta object literal for the '{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl <em>Architectural Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.ArchitecturalRationaleImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalRationale()
		 * @generated
		 */
		EClass ARCHITECTURAL_RATIONALE = eINSTANCE.getArchitecturalRationale();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_RATIONALE__NAME = eINSTANCE.getArchitecturalRationale_Name();

		/**
		 * The meta object literal for the '<em><b>AHave J</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_J = eINSTANCE.getArchitecturalRationale_A_Have_J();

		/**
		 * The meta object literal for the '<em><b>AHave C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_C = eINSTANCE.getArchitecturalRationale_A_Have_C();

		/**
		 * The meta object literal for the '<em><b>AHave R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_R = eINSTANCE.getArchitecturalRationale_A_Have_R();

		/**
		 * The meta object literal for the '<em><b>AHave A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_A = eINSTANCE.getArchitecturalRationale_A_Have_A();

		/**
		 * The meta object literal for the '<em><b>AHave Cq</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_CQ = eINSTANCE.getArchitecturalRationale_A_Have_Cq();

		/**
		 * The meta object literal for the '<em><b>AHave Ad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_AD = eINSTANCE.getArchitecturalRationale_A_Have_Ad();

		/**
		 * The meta object literal for the '<em><b>AHave S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_S = eINSTANCE.getArchitecturalRationale_A_Have_S();

		/**
		 * The meta object literal for the '<em><b>AHave T</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_T = eINSTANCE.getArchitecturalRationale_A_Have_T();

		/**
		 * The meta object literal for the '<em><b>AHave P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_RATIONALE__AHAVE_P = eINSTANCE.getArchitecturalRationale_A_Have_P();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.ContextImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Context Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__CONTEXT_NAME = eINSTANCE.getContext_ContextName();

		/**
		 * The meta object literal for the '<em><b>Context Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__CONTEXT_DESCRIPTION = eINSTANCE.getContext_ContextDescription();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.JustificationImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '<em><b>Justification Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__JUSTIFICATION_NAME = eINSTANCE.getJustification_JustificationName();

		/**
		 * The meta object literal for the '<em><b>Justification Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__JUSTIFICATION_DESCRIPTION = eINSTANCE.getJustification_JustificationDescription();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.AlternativeImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Alternative Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE__ALTERNATIVE_NAME = eINSTANCE.getAlternative_AlternativeName();

		/**
		 * The meta object literal for the '<em><b>Alternative Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE__ALTERNATIVE_DESCRIPTION = eINSTANCE.getAlternative_AlternativeDescription();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.RationaleImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Rationale Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONALE__RATIONALE_NAME = eINSTANCE.getRationale_RationaleName();

		/**
		 * The meta object literal for the '<em><b>Rationale Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONALE__RATIONALE_DESCRIPTION = eINSTANCE.getRationale_RationaleDescription();

		/**
		 * The meta object literal for the '<em><b>Rationale Has Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__RATIONALE_HAS_CONTEXT = eINSTANCE.getRationale_Rationale_Has_Context();

		/**
		 * The meta object literal for the '<em><b>Rationale Has Justification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__RATIONALE_HAS_JUSTIFICATION = eINSTANCE.getRationale_Rationale_Has_Justification();

		/**
		 * The meta object literal for the '<em><b>Rationale Has Alternative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__RATIONALE_HAS_ALTERNATIVE = eINSTANCE.getRationale_Rationale_Has_Alternative();

		/**
		 * The meta object literal for the '<em><b>Rationale Has Consequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__RATIONALE_HAS_CONSEQUENCE = eINSTANCE.getRationale_Rationale_Has_Consequence();

		/**
		 * The meta object literal for the '<em><b>Rationale Has Architectural Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION = eINSTANCE.getRationale_Rationale_Has_ArchitecturalDecision();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.ConsequenceImpl <em>Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.ConsequenceImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getConsequence()
		 * @generated
		 */
		EClass CONSEQUENCE = eINSTANCE.getConsequence();

		/**
		 * The meta object literal for the '<em><b>Consequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSEQUENCE__CONSEQUENCE_NAME = eINSTANCE.getConsequence_ConsequenceName();

		/**
		 * The meta object literal for the '<em><b>Consequence Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSEQUENCE__CONSEQUENCE_DESCRIPTION = eINSTANCE.getConsequence_ConsequenceDescription();

		/**
		 * The meta object literal for the '<em><b>Pro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSEQUENCE__PRO = eINSTANCE.getConsequence_Pro();

		/**
		 * The meta object literal for the '<em><b>Con</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSEQUENCE__CON = eINSTANCE.getConsequence_Con();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.ArchitecturalDecisionImpl <em>Architectural Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.ArchitecturalDecisionImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalDecision()
		 * @generated
		 */
		EClass ARCHITECTURAL_DECISION = eINSTANCE.getArchitecturalDecision();

		/**
		 * The meta object literal for the '<em><b>Architectural Decision Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME = eINSTANCE.getArchitecturalDecision_ArchitecturalDecisionName();

		/**
		 * The meta object literal for the '<em><b>Architectural Decision Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION = eINSTANCE.getArchitecturalDecision_ArchitecturalDecisionDescription();

		/**
		 * The meta object literal for the '<em><b>Architectural Decision Has Architectural Pattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN = eINSTANCE.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern();

		/**
		 * The meta object literal for the '<em><b>Architectural Decision Has Architectural Tactic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC = eINSTANCE.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic();

		/**
		 * The meta object literal for the '<em><b>Architectural Decision Has Architectural Strategy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY = eINSTANCE.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.ArchitecturalPatternImpl <em>Architectural Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.ArchitecturalPatternImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalPattern()
		 * @generated
		 */
		EClass ARCHITECTURAL_PATTERN = eINSTANCE.getArchitecturalPattern();

		/**
		 * The meta object literal for the '<em><b>Architectural Pattern Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME = eINSTANCE.getArchitecturalPattern_ArchitecturalPatternName();

		/**
		 * The meta object literal for the '<em><b>Architectural Pattern Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION = eINSTANCE.getArchitecturalPattern_ArchitecturalPatternDescription();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.ArchitecturalTacticImpl <em>Architectural Tactic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.ArchitecturalTacticImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalTactic()
		 * @generated
		 */
		EClass ARCHITECTURAL_TACTIC = eINSTANCE.getArchitecturalTactic();

		/**
		 * The meta object literal for the '<em><b>Architectural Tactic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME = eINSTANCE.getArchitecturalTactic_ArchitecturalTacticName();

		/**
		 * The meta object literal for the '<em><b>Architectural Tactic Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION = eINSTANCE.getArchitecturalTactic_ArchitecturalTacticDescription();

		/**
		 * The meta object literal for the '{@link org.architectural.rationale.impl.ArchitecturalStrategyImpl <em>Architectural Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.architectural.rationale.impl.ArchitecturalStrategyImpl
		 * @see org.architectural.rationale.impl.RationalePackageImpl#getArchitecturalStrategy()
		 * @generated
		 */
		EClass ARCHITECTURAL_STRATEGY = eINSTANCE.getArchitecturalStrategy();

		/**
		 * The meta object literal for the '<em><b>Architectural Strategy Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME = eINSTANCE.getArchitecturalStrategy_ArchitecturalStrategyName();

		/**
		 * The meta object literal for the '<em><b>Architectural Strategy Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION = eINSTANCE.getArchitecturalStrategy_ArchitecturalStrategyDescription();

	}

} //RationalePackage
