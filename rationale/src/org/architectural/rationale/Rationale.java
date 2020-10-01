/**
 */
package org.architectural.rationale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.Rationale#getRationaleName <em>Rationale Name</em>}</li>
 *   <li>{@link org.architectural.rationale.Rationale#getRationaleDescription <em>Rationale Description</em>}</li>
 *   <li>{@link org.architectural.rationale.Rationale#getRationale_Has_Context <em>Rationale Has Context</em>}</li>
 *   <li>{@link org.architectural.rationale.Rationale#getRationale_Has_Justification <em>Rationale Has Justification</em>}</li>
 *   <li>{@link org.architectural.rationale.Rationale#getRationale_Has_Alternative <em>Rationale Has Alternative</em>}</li>
 *   <li>{@link org.architectural.rationale.Rationale#getRationale_Has_Consequence <em>Rationale Has Consequence</em>}</li>
 *   <li>{@link org.architectural.rationale.Rationale#getRationale_Has_ArchitecturalDecision <em>Rationale Has Architectural Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getRationale()
 * @model
 * @generated
 */
public interface Rationale extends EObject {
	/**
	 * Returns the value of the '<em><b>Rationale Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Name</em>' attribute.
	 * @see #setRationaleName(String)
	 * @see org.architectural.rationale.RationalePackage#getRationale_RationaleName()
	 * @model
	 * @generated
	 */
	String getRationaleName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Rationale#getRationaleName <em>Rationale Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Name</em>' attribute.
	 * @see #getRationaleName()
	 * @generated
	 */
	void setRationaleName(String value);

	/**
	 * Returns the value of the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Description</em>' attribute.
	 * @see #setRationaleDescription(String)
	 * @see org.architectural.rationale.RationalePackage#getRationale_RationaleDescription()
	 * @model
	 * @generated
	 */
	String getRationaleDescription();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Rationale#getRationaleDescription <em>Rationale Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Description</em>' attribute.
	 * @see #getRationaleDescription()
	 * @generated
	 */
	void setRationaleDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rationale Has Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Has Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Has Context</em>' reference.
	 * @see #setRationale_Has_Context(Context)
	 * @see org.architectural.rationale.RationalePackage#getRationale_Rationale_Has_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getRationale_Has_Context();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Rationale#getRationale_Has_Context <em>Rationale Has Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Has Context</em>' reference.
	 * @see #getRationale_Has_Context()
	 * @generated
	 */
	void setRationale_Has_Context(Context value);

	/**
	 * Returns the value of the '<em><b>Rationale Has Justification</b></em>' reference list.
	 * The list contents are of type {@link org.architectural.rationale.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Has Justification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Has Justification</em>' reference list.
	 * @see org.architectural.rationale.RationalePackage#getRationale_Rationale_Has_Justification()
	 * @model lower="4" upper="4"
	 * @generated
	 */
	EList<Justification> getRationale_Has_Justification();

	/**
	 * Returns the value of the '<em><b>Rationale Has Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Has Alternative</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Has Alternative</em>' reference.
	 * @see #setRationale_Has_Alternative(Alternative)
	 * @see org.architectural.rationale.RationalePackage#getRationale_Rationale_Has_Alternative()
	 * @model required="true"
	 * @generated
	 */
	Alternative getRationale_Has_Alternative();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Rationale#getRationale_Has_Alternative <em>Rationale Has Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Has Alternative</em>' reference.
	 * @see #getRationale_Has_Alternative()
	 * @generated
	 */
	void setRationale_Has_Alternative(Alternative value);

	/**
	 * Returns the value of the '<em><b>Rationale Has Consequence</b></em>' reference list.
	 * The list contents are of type {@link org.architectural.rationale.Consequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Has Consequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Has Consequence</em>' reference list.
	 * @see org.architectural.rationale.RationalePackage#getRationale_Rationale_Has_Consequence()
	 * @model
	 * @generated
	 */
	EList<Consequence> getRationale_Has_Consequence();

	/**
	 * Returns the value of the '<em><b>Rationale Has Architectural Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Has Architectural Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Has Architectural Decision</em>' reference.
	 * @see #setRationale_Has_ArchitecturalDecision(ArchitecturalDecision)
	 * @see org.architectural.rationale.RationalePackage#getRationale_Rationale_Has_ArchitecturalDecision()
	 * @model required="true"
	 * @generated
	 */
	ArchitecturalDecision getRationale_Has_ArchitecturalDecision();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.Rationale#getRationale_Has_ArchitecturalDecision <em>Rationale Has Architectural Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Has Architectural Decision</em>' reference.
	 * @see #getRationale_Has_ArchitecturalDecision()
	 * @generated
	 */
	void setRationale_Has_ArchitecturalDecision(ArchitecturalDecision value);

} // Rationale
