/**
 */
package org.architectural.rationale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getName <em>Name</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_J <em>AHave J</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_C <em>AHave C</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_R <em>AHave R</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_A <em>AHave A</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_Cq <em>AHave Cq</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_Ad <em>AHave Ad</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_S <em>AHave S</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_T <em>AHave T</em>}</li>
 *   <li>{@link org.architectural.rationale.ArchitecturalRationale#getA_Have_P <em>AHave P</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale()
 * @model
 * @generated
 */
public interface ArchitecturalRationale extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.architectural.rationale.ArchitecturalRationale#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>AHave J</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave J</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave J</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_J()
	 * @model containment="true" lower="4"
	 * @generated
	 */
	EList<Justification> getA_Have_J();

	/**
	 * Returns the value of the '<em><b>AHave C</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave C</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_C()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Context> getA_Have_C();

	/**
	 * Returns the value of the '<em><b>AHave R</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.Rationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave R</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave R</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_R()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rationale> getA_Have_R();

	/**
	 * Returns the value of the '<em><b>AHave A</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.Alternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave A</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_A()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alternative> getA_Have_A();

	/**
	 * Returns the value of the '<em><b>AHave Cq</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.Consequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave Cq</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave Cq</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_Cq()
	 * @model containment="true"
	 * @generated
	 */
	EList<Consequence> getA_Have_Cq();

	/**
	 * Returns the value of the '<em><b>AHave Ad</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.ArchitecturalDecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave Ad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave Ad</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_Ad()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitecturalDecision> getA_Have_Ad();

	/**
	 * Returns the value of the '<em><b>AHave S</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.ArchitecturalStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave S</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave S</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_S()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitecturalStrategy> getA_Have_S();

	/**
	 * Returns the value of the '<em><b>AHave T</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.ArchitecturalTactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave T</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_T()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitecturalTactic> getA_Have_T();

	/**
	 * Returns the value of the '<em><b>AHave P</b></em>' containment reference list.
	 * The list contents are of type {@link org.architectural.rationale.ArchitecturalPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHave P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHave P</em>' containment reference list.
	 * @see org.architectural.rationale.RationalePackage#getArchitecturalRationale_A_Have_P()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitecturalPattern> getA_Have_P();

} // ArchitecturalRationale
