/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.*;

import org.eclipse.emf.ecore.EClass;
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
public class RationaleFactoryImpl extends EFactoryImpl implements RationaleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RationaleFactory init() {
		try {
			RationaleFactory theRationaleFactory = (RationaleFactory)EPackage.Registry.INSTANCE.getEFactory(RationalePackage.eNS_URI);
			if (theRationaleFactory != null) {
				return theRationaleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RationaleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationaleFactoryImpl() {
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
			case RationalePackage.ARCHITECTURAL_RATIONALE: return createArchitecturalRationale();
			case RationalePackage.CONTEXT: return createContext();
			case RationalePackage.JUSTIFICATION: return createJustification();
			case RationalePackage.ALTERNATIVE: return createAlternative();
			case RationalePackage.RATIONALE: return createRationale();
			case RationalePackage.CONSEQUENCE: return createConsequence();
			case RationalePackage.ARCHITECTURAL_DECISION: return createArchitecturalDecision();
			case RationalePackage.ARCHITECTURAL_PATTERN: return createArchitecturalPattern();
			case RationalePackage.ARCHITECTURAL_TACTIC: return createArchitecturalTactic();
			case RationalePackage.ARCHITECTURAL_STRATEGY: return createArchitecturalStrategy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalRationale createArchitecturalRationale() {
		ArchitecturalRationaleImpl architecturalRationale = new ArchitecturalRationaleImpl();
		return architecturalRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rationale createRationale() {
		RationaleImpl rationale = new RationaleImpl();
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequence createConsequence() {
		ConsequenceImpl consequence = new ConsequenceImpl();
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalDecision createArchitecturalDecision() {
		ArchitecturalDecisionImpl architecturalDecision = new ArchitecturalDecisionImpl();
		return architecturalDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalPattern createArchitecturalPattern() {
		ArchitecturalPatternImpl architecturalPattern = new ArchitecturalPatternImpl();
		return architecturalPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalTactic createArchitecturalTactic() {
		ArchitecturalTacticImpl architecturalTactic = new ArchitecturalTacticImpl();
		return architecturalTactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalStrategy createArchitecturalStrategy() {
		ArchitecturalStrategyImpl architecturalStrategy = new ArchitecturalStrategyImpl();
		return architecturalStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalePackage getRationalePackage() {
		return (RationalePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RationalePackage getPackage() {
		return RationalePackage.eINSTANCE;
	}

} //RationaleFactoryImpl
