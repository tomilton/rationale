/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternName <em>Architectural Pattern Name</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternDescription <em>Architectural Pattern Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getArchitecturalPattern()
 * @model
 * @generated
 */
public interface ArchitecturalPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Architectural Pattern Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Pattern Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Pattern Name</em>' attribute.
	 * @see #setArchitecturalPatternName(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalPattern_ArchitecturalPatternName()
	 * @model
	 * @generated
	 */
	String getArchitecturalPatternName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternName <em>Architectural Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Pattern Name</em>' attribute.
	 * @see #getArchitecturalPatternName()
	 * @generated
	 */
	void setArchitecturalPatternName(String value);

	/**
	 * Returns the value of the '<em><b>Architectural Pattern Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Pattern Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Pattern Description</em>' attribute.
	 * @see #setArchitecturalPatternDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalPattern_ArchitecturalPatternDescription()
	 * @model
	 * @generated
	 */
	String getArchitecturalPatternDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalPattern#getArchitecturalPatternDescription <em>Architectural Pattern Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Pattern Description</em>' attribute.
	 * @see #getArchitecturalPatternDescription()
	 * @generated
	 */
	void setArchitecturalPatternDescription(String value);

} // ArchitecturalPattern
