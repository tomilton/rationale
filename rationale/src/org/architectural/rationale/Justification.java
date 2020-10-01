/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.Justification#getJustificationName <em>Justification Name</em>}</li>
 *   <li>{@link org.architectural.rationale.Justification#getJustificationDescription <em>Justification Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getJustification()
 * @model
 * @generated
 */
public interface Justification extends EObject {
	/**
	 * Returns the value of the '<em><b>Justification Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification Name</em>' attribute.
	 * @see #setJustificationName(String)
	 * @see org.architectural.rationale.RationalePackage#getJustification_JustificationName()
	 * @model
	 * @generated
	 */
	String getJustificationName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Justification#getJustificationName <em>Justification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification Name</em>' attribute.
	 * @see #getJustificationName()
	 * @generated
	 */
	void setJustificationName(String value);

	/**
	 * Returns the value of the '<em><b>Justification Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification Description</em>' attribute.
	 * @see #setJustificationDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getJustification_JustificationDescription()
	 * @model
	 * @generated
	 */
	String getJustificationDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Justification#getJustificationDescription <em>Justification Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification Description</em>' attribute.
	 * @see #getJustificationDescription()
	 * @generated
	 */
	void setJustificationDescription(String value);

} // Justification
