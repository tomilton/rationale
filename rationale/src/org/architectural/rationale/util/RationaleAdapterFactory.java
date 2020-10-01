/**
 */
package org.architectural.rationale.util;

import org.architectural.rationale.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.architectural.rationale.RationalePackage
 * @generated
 */
public class RationaleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RationalePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationaleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RationalePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationaleSwitch<Adapter> modelSwitch =
		new RationaleSwitch<Adapter>() {
			@Override
			public Adapter caseArchitecturalRationale(ArchitecturalRationale object) {
				return createArchitecturalRationaleAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseJustification(Justification object) {
				return createJustificationAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseRationale(Rationale object) {
				return createRationaleAdapter();
			}
			@Override
			public Adapter caseConsequence(Consequence object) {
				return createConsequenceAdapter();
			}
			@Override
			public Adapter caseArchitecturalDecision(ArchitecturalDecision object) {
				return createArchitecturalDecisionAdapter();
			}
			@Override
			public Adapter caseArchitecturalPattern(ArchitecturalPattern object) {
				return createArchitecturalPatternAdapter();
			}
			@Override
			public Adapter caseArchitecturalTactic(ArchitecturalTactic object) {
				return createArchitecturalTacticAdapter();
			}
			@Override
			public Adapter caseArchitecturalStrategy(ArchitecturalStrategy object) {
				return createArchitecturalStrategyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.ArchitecturalRationale <em>Architectural Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.ArchitecturalRationale
	 * @generated
	 */
	public Adapter createArchitecturalRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.Justification
	 * @generated
	 */
	public Adapter createJustificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.Rationale
	 * @generated
	 */
	public Adapter createRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.Consequence
	 * @generated
	 */
	public Adapter createConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.ArchitecturalDecision <em>Architectural Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.ArchitecturalDecision
	 * @generated
	 */
	public Adapter createArchitecturalDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.ArchitecturalPattern <em>Architectural Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.ArchitecturalPattern
	 * @generated
	 */
	public Adapter createArchitecturalPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.ArchitecturalTactic <em>Architectural Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.ArchitecturalTactic
	 * @generated
	 */
	public Adapter createArchitecturalTacticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.architectural.rationale.ArchitecturalStrategy <em>Architectural Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.architectural.rationale.ArchitecturalStrategy
	 * @generated
	 */
	public Adapter createArchitecturalStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RationaleAdapterFactory
