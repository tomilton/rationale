/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Tactic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticName <em>Architectural Tactic Name</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticDescription <em>Architectural Tactic Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getArchitecturalTactic()
 * @model
 * @generated
 */
public interface ArchitecturalTactic extends EObject {
	/**
	 * Returns the value of the '<em><b>Architectural Tactic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Tactic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Tactic Name</em>' attribute.
	 * @see #setArchitecturalTacticName(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalTactic_ArchitecturalTacticName()
	 * @model
	 * @generated
	 */
	String getArchitecturalTacticName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticName <em>Architectural Tactic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Tactic Name</em>' attribute.
	 * @see #getArchitecturalTacticName()
	 * @generated
	 */
	void setArchitecturalTacticName(String value);

	/**
	 * Returns the value of the '<em><b>Architectural Tactic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Tactic Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Tactic Description</em>' attribute.
	 * @see #setArchitecturalTacticDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalTactic_ArchitecturalTacticDescription()
	 * @model
	 * @generated
	 */
	String getArchitecturalTacticDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalTactic#getArchitecturalTacticDescription <em>Architectural Tactic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Tactic Description</em>' attribute.
	 * @see #getArchitecturalTacticDescription()
	 * @generated
	 */
	void setArchitecturalTacticDescription(String value);

} // ArchitecturalTactic
