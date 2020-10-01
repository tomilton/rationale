/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.architectural.rationale.RationalePackage
 * @generated
 */
public interface RationaleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RationaleFactory eINSTANCE = org.architectural.rationale.impl.RationaleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Architectural Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architectural Rationale</em>'.
	 * @generated
	 */
	ArchitecturalRationale createArchitecturalRationale();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Justification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Justification</em>'.
	 * @generated
	 */
	Justification createJustification();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rationale</em>'.
	 * @generated
	 */
	Rationale createRationale();

	/**
	 * Returns a new object of class '<em>Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consequence</em>'.
	 * @generated
	 */
	Consequence createConsequence();

	/**
	 * Returns a new object of class '<em>Architectural Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architectural Decision</em>'.
	 * @generated
	 */
	ArchitecturalDecision createArchitecturalDecision();

	/**
	 * Returns a new object of class '<em>Architectural Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architectural Pattern</em>'.
	 * @generated
	 */
	ArchitecturalPattern createArchitecturalPattern();

	/**
	 * Returns a new object of class '<em>Architectural Tactic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architectural Tactic</em>'.
	 * @generated
	 */
	ArchitecturalTactic createArchitecturalTactic();

	/**
	 * Returns a new object of class '<em>Architectural Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architectural Strategy</em>'.
	 * @generated
	 */
	ArchitecturalStrategy createArchitecturalStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RationalePackage getRationalePackage();

} //RationaleFactory
