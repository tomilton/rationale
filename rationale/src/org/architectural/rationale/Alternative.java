/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.Alternative#getAlternativeName <em>Alternative Name</em>}</li>
 *   <li>{@link org.architectural.rationale.Alternative#getAlternativeDescription <em>Alternative Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternative Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Name</em>' attribute.
	 * @see #setAlternativeName(String)
	 * @see org.architectural.rationale.RationalePackage#getAlternative_AlternativeName()
	 * @model
	 * @generated
	 */
	String getAlternativeName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Alternative#getAlternativeName <em>Alternative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Name</em>' attribute.
	 * @see #getAlternativeName()
	 * @generated
	 */
	void setAlternativeName(String value);

	/**
	 * Returns the value of the '<em><b>Alternative Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Description</em>' attribute.
	 * @see #setAlternativeDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getAlternative_AlternativeDescription()
	 * @model
	 * @generated
	 */
	String getAlternativeDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Alternative#getAlternativeDescription <em>Alternative Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Description</em>' attribute.
	 * @see #getAlternativeDescription()
	 * @generated
	 */
	void setAlternativeDescription(String value);

} // Alternative
