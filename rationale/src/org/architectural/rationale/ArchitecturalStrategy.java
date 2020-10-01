/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyName <em>Architectural Strategy Name</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyDescription <em>Architectural Strategy Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getArchitecturalStrategy()
 * @model
 * @generated
 */
public interface ArchitecturalStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Architectural Strategy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Strategy Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Strategy Name</em>' attribute.
	 * @see #setArchitecturalStrategyName(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalStrategy_ArchitecturalStrategyName()
	 * @model
	 * @generated
	 */
	String getArchitecturalStrategyName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyName <em>Architectural Strategy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Strategy Name</em>' attribute.
	 * @see #getArchitecturalStrategyName()
	 * @generated
	 */
	void setArchitecturalStrategyName(String value);

	/**
	 * Returns the value of the '<em><b>Architectural Strategy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Strategy Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Strategy Description</em>' attribute.
	 * @see #setArchitecturalStrategyDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalStrategy_ArchitecturalStrategyDescription()
	 * @model
	 * @generated
	 */
	String getArchitecturalStrategyDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalStrategy#getArchitecturalStrategyDescription <em>Architectural Strategy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Strategy Description</em>' attribute.
	 * @see #getArchitecturalStrategyDescription()
	 * @generated
	 */
	void setArchitecturalStrategyDescription(String value);

} // ArchitecturalStrategy
