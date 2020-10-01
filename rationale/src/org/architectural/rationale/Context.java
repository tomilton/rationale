/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.Context#getContextName <em>Context Name</em>}</li>
 *   <li>{@link org.architectural.rationale.Context#getContextDescription <em>Context Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Name</em>' attribute.
	 * @see #setContextName(String)
	 * @see org.architectural.rationale.RationalePackage#getContext_ContextName()
	 * @model
	 * @generated
	 */
	String getContextName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Context#getContextName <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Name</em>' attribute.
	 * @see #getContextName()
	 * @generated
	 */
	void setContextName(String value);

	/**
	 * Returns the value of the '<em><b>Context Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Description</em>' attribute.
	 * @see #setContextDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getContext_ContextDescription()
	 * @model
	 * @generated
	 */
	String getContextDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Context#getContextDescription <em>Context Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Description</em>' attribute.
	 * @see #getContextDescription()
	 * @generated
	 */
	void setContextDescription(String value);

} // Context
