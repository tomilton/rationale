/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.ArchitecturalTactic;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Tactic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalTacticImpl#getArchitecturalTacticName <em>Architectural Tactic Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalTacticImpl#getArchitecturalTacticDescription <em>Architectural Tactic Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitecturalTacticImpl extends MinimalEObjectImpl.Container implements ArchitecturalTactic {
	/**
	 * The default value of the '{@link #getArchitecturalTacticName() <em>Architectural Tactic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalTacticName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_TACTIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalTacticName() <em>Architectural Tactic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalTacticName()
	 * @generated
	 * @ordered
	 */
	protected String architecturalTacticName = ARCHITECTURAL_TACTIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecturalTacticDescription() <em>Architectural Tactic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalTacticDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_TACTIC_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalTacticDescription() <em>Architectural Tactic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalTacticDescription()
	 * @generated
	 * @ordered
	 */
	protected String architecturalTacticDescription = ARCHITECTURAL_TACTIC_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalTacticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ARCHITECTURAL_TACTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalTacticName() {
		return architecturalTacticName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalTacticName(String newArchitecturalTacticName) {
		String oldArchitecturalTacticName = architecturalTacticName;
		architecturalTacticName = newArchitecturalTacticName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME, oldArchitecturalTacticName, architecturalTacticName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalTacticDescription() {
		return architecturalTacticDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalTacticDescription(String newArchitecturalTacticDescription) {
		String oldArchitecturalTacticDescription = architecturalTacticDescription;
		architecturalTacticDescription = newArchitecturalTacticDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION, oldArchitecturalTacticDescription, architecturalTacticDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME:
				return getArchitecturalTacticName();
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION:
				return getArchitecturalTacticDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME:
				setArchitecturalTacticName((String)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION:
				setArchitecturalTacticDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME:
				setArchitecturalTacticName(ARCHITECTURAL_TACTIC_NAME_EDEFAULT);
				return;
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION:
				setArchitecturalTacticDescription(ARCHITECTURAL_TACTIC_DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_NAME:
				return ARCHITECTURAL_TACTIC_NAME_EDEFAULT == null ? architecturalTacticName != null : !ARCHITECTURAL_TACTIC_NAME_EDEFAULT.equals(architecturalTacticName);
			case RationalePackage.ARCHITECTURAL_TACTIC__ARCHITECTURAL_TACTIC_DESCRIPTION:
				return ARCHITECTURAL_TACTIC_DESCRIPTION_EDEFAULT == null ? architecturalTacticDescription != null : !ARCHITECTURAL_TACTIC_DESCRIPTION_EDEFAULT.equals(architecturalTacticDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ArchitecturalTacticName: ");
		result.append(architecturalTacticName);
		result.append(", ArchitecturalTacticDescription: ");
		result.append(architecturalTacticDescription);
		result.append(')');
		return result.toString();
	}

} //ArchitecturalTacticImpl
