/**
 */
package org.architectural.rationale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.Consequence#getConsequenceName <em>Consequence Name</em>}</li>
 *   <li>{@link org.architectural.rationale.Consequence#getConsequenceDescription <em>Consequence Description</em>}</li>
 *   <li>{@link org.architectural.rationale.Consequence#getPro <em>Pro</em>}</li>
 *   <li>{@link org.architectural.rationale.Consequence#getCon <em>Con</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getConsequence()
 * @model
 * @generated
 */
public interface Consequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Consequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence Name</em>' attribute.
	 * @see #setConsequenceName(String)
	 * @see org.architectural.rationale.RationalePackage#getConsequence_ConsequenceName()
	 * @model
	 * @generated
	 */
	String getConsequenceName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Consequence#getConsequenceName <em>Consequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence Name</em>' attribute.
	 * @see #getConsequenceName()
	 * @generated
	 */
	void setConsequenceName(String value);

	/**
	 * Returns the value of the '<em><b>Consequence Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence Description</em>' attribute.
	 * @see #setConsequenceDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getConsequence_ConsequenceDescription()
	 * @model
	 * @generated
	 */
	String getConsequenceDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Consequence#getConsequenceDescription <em>Consequence Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence Description</em>' attribute.
	 * @see #getConsequenceDescription()
	 * @generated
	 */
	void setConsequenceDescription(String value);

	/**
	 * Returns the value of the '<em><b>Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro</em>' attribute.
	 * @see #setPro(String)
	 * @see org.architectural.rationale.RationalePackage#getConsequence_Pro()
	 * @model
	 * @generated
	 */
	String getPro();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Consequence#getPro <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro</em>' attribute.
	 * @see #getPro()
	 * @generated
	 */
	void setPro(String value);

	/**
	 * Returns the value of the '<em><b>Con</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Con</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Con</em>' attribute.
	 * @see #setCon(String)
	 * @see org.architectural.rationale.RationalePackage#getConsequence_Con()
	 * @model
	 * @generated
	 */
	String getCon();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Consequence#getCon <em>Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con</em>' attribute.
	 * @see #getCon()
	 * @generated
	 */
	void setCon(String value);

} // Consequence
