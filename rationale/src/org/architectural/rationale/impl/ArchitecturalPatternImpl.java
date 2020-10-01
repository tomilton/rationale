/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.ArchitecturalPattern;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalPatternImpl#getArchitecturalPatternName <em>Architectural Pattern Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalPatternImpl#getArchitecturalPatternDescription <em>Architectural Pattern Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitecturalPatternImpl extends MinimalEObjectImpl.Container implements ArchitecturalPattern {
	/**
	 * The default value of the '{@link #getArchitecturalPatternName() <em>Architectural Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalPatternName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_PATTERN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalPatternName() <em>Architectural Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalPatternName()
	 * @generated
	 * @ordered
	 */
	protected String architecturalPatternName = ARCHITECTURAL_PATTERN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecturalPatternDescription() <em>Architectural Pattern Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalPatternDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_PATTERN_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalPatternDescription() <em>Architectural Pattern Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalPatternDescription()
	 * @generated
	 * @ordered
	 */
	protected String architecturalPatternDescription = ARCHITECTURAL_PATTERN_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ARCHITECTURAL_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalPatternName() {
		return architecturalPatternName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalPatternName(String newArchitecturalPatternName) {
		String oldArchitecturalPatternName = architecturalPatternName;
		architecturalPatternName = newArchitecturalPatternName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME, oldArchitecturalPatternName, architecturalPatternName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalPatternDescription() {
		return architecturalPatternDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalPatternDescription(String newArchitecturalPatternDescription) {
		String oldArchitecturalPatternDescription = architecturalPatternDescription;
		architecturalPatternDescription = newArchitecturalPatternDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION, oldArchitecturalPatternDescription, architecturalPatternDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME:
				return getArchitecturalPatternName();
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION:
				return getArchitecturalPatternDescription();
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
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME:
				setArchitecturalPatternName((String)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION:
				setArchitecturalPatternDescription((String)newValue);
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
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME:
				setArchitecturalPatternName(ARCHITECTURAL_PATTERN_NAME_EDEFAULT);
				return;
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION:
				setArchitecturalPatternDescription(ARCHITECTURAL_PATTERN_DESCRIPTION_EDEFAULT);
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
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_NAME:
				return ARCHITECTURAL_PATTERN_NAME_EDEFAULT == null ? architecturalPatternName != null : !ARCHITECTURAL_PATTERN_NAME_EDEFAULT.equals(architecturalPatternName);
			case RationalePackage.ARCHITECTURAL_PATTERN__ARCHITECTURAL_PATTERN_DESCRIPTION:
				return ARCHITECTURAL_PATTERN_DESCRIPTION_EDEFAULT == null ? architecturalPatternDescription != null : !ARCHITECTURAL_PATTERN_DESCRIPTION_EDEFAULT.equals(architecturalPatternDescription);
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
		result.append(" (ArchitecturalPatternName: ");
		result.append(architecturalPatternName);
		result.append(", ArchitecturalPatternDescription: ");
		result.append(architecturalPatternDescription);
		result.append(')');
		return result.toString();
	}

} //ArchitecturalPatternImpl
