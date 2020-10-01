/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.Alternative;
import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.ArchitecturalPattern;
import org.architectural.rationale.ArchitecturalRationale;
import org.architectural.rationale.ArchitecturalStrategy;
import org.architectural.rationale.ArchitecturalTactic;
import org.architectural.rationale.Consequence;
import org.architectural.rationale.Context;
import org.architectural.rationale.Justification;
import org.architectural.rationale.Rationale;
import org.architectural.rationale.RationaleFactory;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RationalePackageImpl extends EPackageImpl implements RationalePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalTacticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalStrategyEClass = null;

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
	 * @see org.architectural.rationale.RationalePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RationalePackageImpl() {
		super(eNS_URI, RationaleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RationalePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RationalePackage init() {
		if (isInited) return (RationalePackage)EPackage.Registry.INSTANCE.getEPackage(RationalePackage.eNS_URI);

		// Obtain or create and register package
		RationalePackageImpl theRationalePackage = (RationalePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RationalePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RationalePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRationalePackage.createPackageContents();

		// Initialize created meta-data
		theRationalePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRationalePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RationalePackage.eNS_URI, theRationalePackage);
		return theRationalePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalRationale() {
		return architecturalRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalRationale_Name() {
		return (EAttribute)architecturalRationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_J() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_C() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_R() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_A() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_Cq() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_Ad() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_S() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_T() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalRationale_A_Have_P() {
		return (EReference)architecturalRationaleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_ContextName() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_ContextDescription() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJustification() {
		return justificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_JustificationName() {
		return (EAttribute)justificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_JustificationDescription() {
		return (EAttribute)justificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlternative_AlternativeName() {
		return (EAttribute)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlternative_AlternativeDescription() {
		return (EAttribute)alternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationale_RationaleName() {
		return (EAttribute)rationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationale_RationaleDescription() {
		return (EAttribute)rationaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Rationale_Has_Context() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Rationale_Has_Justification() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Rationale_Has_Alternative() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Rationale_Has_Consequence() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Rationale_Has_ArchitecturalDecision() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsequence() {
		return consequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsequence_ConsequenceName() {
		return (EAttribute)consequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsequence_ConsequenceDescription() {
		return (EAttribute)consequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsequence_Pro() {
		return (EAttribute)consequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsequence_Con() {
		return (EAttribute)consequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalDecision() {
		return architecturalDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalDecision_ArchitecturalDecisionName() {
		return (EAttribute)architecturalDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalDecision_ArchitecturalDecisionDescription() {
		return (EAttribute)architecturalDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern() {
		return (EReference)architecturalDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic() {
		return (EReference)architecturalDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy() {
		return (EReference)architecturalDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalPattern() {
		return architecturalPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalPattern_ArchitecturalPatternName() {
		return (EAttribute)architecturalPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalPattern_ArchitecturalPatternDescription() {
		return (EAttribute)architecturalPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalTactic() {
		return architecturalTacticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalTactic_ArchitecturalTacticName() {
		return (EAttribute)architecturalTacticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalTactic_ArchitecturalTacticDescription() {
		return (EAttribute)architecturalTacticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalStrategy() {
		return architecturalStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalStrategy_ArchitecturalStrategyName() {
		return (EAttribute)architecturalStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalStrategy_ArchitecturalStrategyDescription() {
		return (EAttribute)architecturalStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationaleFactory getRationaleFactory() {
		return (RationaleFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		architecturalRationaleEClass = createEClass(ARCHITECTURAL_RATIONALE);
		createEAttribute(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__NAME);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_J);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_C);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_R);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_A);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_CQ);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_AD);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_S);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_T);
		createEReference(architecturalRationaleEClass, ARCHITECTURAL_RATIONALE__AHAVE_P);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__CONTEXT_NAME);
		createEAttribute(contextEClass, CONTEXT__CONTEXT_DESCRIPTION);

		justificationEClass = createEClass(JUSTIFICATION);
		createEAttribute(justificationEClass, JUSTIFICATION__JUSTIFICATION_NAME);
		createEAttribute(justificationEClass, JUSTIFICATION__JUSTIFICATION_DESCRIPTION);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEAttribute(alternativeEClass, ALTERNATIVE__ALTERNATIVE_NAME);
		createEAttribute(alternativeEClass, ALTERNATIVE__ALTERNATIVE_DESCRIPTION);

		rationaleEClass = createEClass(RATIONALE);
		createEAttribute(rationaleEClass, RATIONALE__RATIONALE_NAME);
		createEAttribute(rationaleEClass, RATIONALE__RATIONALE_DESCRIPTION);
		createEReference(rationaleEClass, RATIONALE__RATIONALE_HAS_CONTEXT);
		createEReference(rationaleEClass, RATIONALE__RATIONALE_HAS_JUSTIFICATION);
		createEReference(rationaleEClass, RATIONALE__RATIONALE_HAS_ALTERNATIVE);
		createEReference(rationaleEClass, RATIONALE__RATIONALE_HAS_CONSEQUENCE);
		createEReference(rationaleEClass, RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION);

		consequenceEClass = createEClass(CONSEQUENCE);
		createEAttribute(consequenceEClass, CONSEQUENCE__CONSEQUENCE_NAME);
		createEAttribute(consequenceEClass, CONSEQUENCE__CONSEQUENCE_DESCRIPTION);
		createEAttribute(consequenceEClass, CONSEQUENCE__PRO);
		createEAttribute(consequenceEClass, CONSEQUENCE__CON);

		architecturalDecisionEClass = createEClass(ARCHITECTURAL_DECISION);
		createEAttribute(architecturalDecisionEClass, ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME);
		createEAttribute(architecturalDecisionEClass, ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION);
		createEReference(architecturalDecisionEClass, ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN);
		createEReference(architecturalDecisionEClass, ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC);
		createEReference(architecturalDecisionEClass, ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY);

		architecturalPatternEClass = createEClass(ARCHITECTURAL_PATTERN);
		createEAttribute(architecturalPatternEClass, ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME);
		createEAttribute(architecturalPatternEClass, ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION);

		architecturalTacticEClass = createEClass(ARCHITECTURAL_TACTIC);
		createEAttribute(architecturalTacticEClass, ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME);
		createEAttribute(architecturalTacticEClass, ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION);

		architecturalStrategyEClass = createEClass(ARCHITECTURAL_STRATEGY);
		createEAttribute(architecturalStrategyEClass, ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME);
		createEAttribute(architecturalStrategyEClass, ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(architecturalRationaleEClass, ArchitecturalRationale.class, "ArchitecturalRationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitecturalRationale_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_J(), this.getJustification(), null, "A_Have_J", null, 4, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_C(), this.getContext(), null, "A_Have_C", null, 1, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_R(), this.getRationale(), null, "A_Have_R", null, 1, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_A(), this.getAlternative(), null, "A_Have_A", null, 0, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_Cq(), this.getConsequence(), null, "A_Have_Cq", null, 0, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_Ad(), this.getArchitecturalDecision(), null, "A_Have_Ad", null, 0, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_S(), this.getArchitecturalStrategy(), null, "A_Have_S", null, 0, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_T(), this.getArchitecturalTactic(), null, "A_Have_T", null, 0, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalRationale_A_Have_P(), this.getArchitecturalPattern(), null, "A_Have_P", null, 0, -1, ArchitecturalRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_ContextName(), ecorePackage.getEString(), "ContextName", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_ContextDescription(), ecorePackage.getEString(), "ContextDescription", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJustification_JustificationName(), ecorePackage.getEString(), "JustificationName", null, 0, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_JustificationDescription(), ecorePackage.getEString(), "JustificationDescription", null, 0, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlternative_AlternativeName(), ecorePackage.getEString(), "AlternativeName", null, 0, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlternative_AlternativeDescription(), ecorePackage.getEString(), "AlternativeDescription", null, 0, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRationale_RationaleName(), ecorePackage.getEString(), "RationaleName", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationale_RationaleDescription(), ecorePackage.getEString(), "RationaleDescription", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRationale_Rationale_Has_Context(), this.getContext(), null, "Rationale_Has_Context", null, 1, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRationale_Rationale_Has_Justification(), this.getJustification(), null, "Rationale_Has_Justification", null, 4, 4, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRationale_Rationale_Has_Alternative(), this.getAlternative(), null, "Rationale_Has_Alternative", null, 1, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRationale_Rationale_Has_Consequence(), this.getConsequence(), null, "Rationale_Has_Consequence", null, 0, -1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRationale_Rationale_Has_ArchitecturalDecision(), this.getArchitecturalDecision(), null, "Rationale_Has_ArchitecturalDecision", null, 1, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consequenceEClass, Consequence.class, "Consequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsequence_ConsequenceName(), ecorePackage.getEString(), "ConsequenceName", null, 0, 1, Consequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsequence_ConsequenceDescription(), ecorePackage.getEString(), "ConsequenceDescription", null, 0, 1, Consequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsequence_Pro(), ecorePackage.getEString(), "pro", null, 0, 1, Consequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsequence_Con(), ecorePackage.getEString(), "con", null, 0, 1, Consequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architecturalDecisionEClass, ArchitecturalDecision.class, "ArchitecturalDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitecturalDecision_ArchitecturalDecisionName(), ecorePackage.getEString(), "ArchitecturalDecisionName", null, 0, 1, ArchitecturalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitecturalDecision_ArchitecturalDecisionDescription(), ecorePackage.getEString(), "ArchitecturalDecisionDescription", null, 0, 1, ArchitecturalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern(), this.getArchitecturalPattern(), null, "ArchitecturalDecision_Has_ArchitecturalPattern", null, 0, -1, ArchitecturalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic(), this.getArchitecturalTactic(), null, "ArchitecturalDecision_Has_ArchitecturalTactic", null, 0, -1, ArchitecturalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy(), this.getArchitecturalStrategy(), null, "ArchitecturalDecision_Has_ArchitecturalStrategy", null, 0, -1, ArchitecturalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architecturalPatternEClass, ArchitecturalPattern.class, "ArchitecturalPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitecturalPattern_ArchitecturalPatternName(), ecorePackage.getEString(), "ArchitecturalPatternName", null, 0, 1, ArchitecturalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitecturalPattern_ArchitecturalPatternDescription(), ecorePackage.getEString(), "ArchitecturalPatternDescription", null, 0, 1, ArchitecturalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architecturalTacticEClass, ArchitecturalTactic.class, "ArchitecturalTactic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitecturalTactic_ArchitecturalTacticName(), ecorePackage.getEString(), "ArchitecturalTacticName", null, 0, 1, ArchitecturalTactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitecturalTactic_ArchitecturalTacticDescription(), ecorePackage.getEString(), "ArchitecturalTacticDescription", null, 0, 1, ArchitecturalTactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architecturalStrategyEClass, ArchitecturalStrategy.class, "ArchitecturalStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitecturalStrategy_ArchitecturalStrategyName(), ecorePackage.getEString(), "ArchitecturalStrategyName", null, 0, 1, ArchitecturalStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitecturalStrategy_ArchitecturalStrategyDescription(), ecorePackage.getEString(), "ArchitecturalStrategyDescription", null, 0, 1, ArchitecturalStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getArchitecturalRationale_A_Have_J(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getArchitecturalRationale_A_Have_C(), 
		   source, 
		   new String[] {
		   });
	}

} //RationalePackageImpl
