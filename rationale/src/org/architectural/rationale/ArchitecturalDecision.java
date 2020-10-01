/**
 */
package org.architectural.rationale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionName <em>Architectural Decision Name</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionDescription <em>Architectural Decision Description</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalPattern <em>Architectural Decision Has Architectural Pattern</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalTactic <em>Architectural Decision Has Architectural Tactic</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecision_Has_ArchitecturalStrategy <em>Architectural Decision Has Architectural Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getArchitecturalDecision()
 * @model
 * @generated
 */
public interface ArchitecturalDecision extends EObject {
	/**
	 * Returns the value of the '<em><b>Architectural Decision Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Decision Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Decision Name</em>' attribute.
	 * @see #setArchitecturalDecisionName(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalDecision_ArchitecturalDecisionName()
	 * @model
	 * @generated
	 */
	String getArchitecturalDecisionName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionName <em>Architectural Decision Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Decision Name</em>' attribute.
	 * @see #getArchitecturalDecisionName()
	 * @generated
	 */
	void setArchitecturalDecisionName(String value);

	/**
	 * Returns the value of the '<em><b>Architectural Decision Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Decision Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Decision Description</em>' attribute.
	 * @see #setArchitecturalDecisionDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalDecision_ArchitecturalDecisionDescription()
	 * @model
	 * @generated
	 */
	String getArchitecturalDecisionDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalDecision#getArchitecturalDecisionDescription <em>Architectural Decision Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Decision Description</em>' attribute.
	 * @see #getArchitecturalDecisionDescription()
	 * @generated
	 */
	void setArchitecturalDecisionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Architectural Decision Has Architectural Pattern</b></em>' reference list.
	 * The list contents are of type {@link org.architectural.rationale.ArchitecturalPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Decision Has Architectural Pattern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Decision Has Architectural Pattern</em>' reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern()
	 * @model
	 * @generated
	 */
	EList<ArchitecturalPattern> getArchitecturalDecision_Has_ArchitecturalPattern();

	/**
	 * Returns the value of the '<em><b>Architectural Decision Has Architectural Tactic</b></em>' reference list.
	 * The list contents are of type {@link org.architectural.rationale.ArchitecturalTactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Decision Has Architectural Tactic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Decision Has Architectural Tactic</em>' reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic()
	 * @model
	 * @generated
	 */
	EList<ArchitecturalTactic> getArchitecturalDecision_Has_ArchitecturalTactic();

	/**
	 * Returns the value of the '<em><b>Architectural Decision Has Architectural Strategy</b></em>' reference list.
	 * The list contents are of type {@link org.architectural.rationale.ArchitecturalStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Decision Has Architectural Strategy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Decision Has Architectural Strategy</em>' reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy()
	 * @model
	 * @generated
	 */
	EList<ArchitecturalStrategy> getArchitecturalDecision_Has_ArchitecturalStrategy();

} // ArchitecturalDecision
