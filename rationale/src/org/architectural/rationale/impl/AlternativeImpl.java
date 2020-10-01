/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.Alternative;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.AlternativeImpl#getAlternativeName <em>Alternative Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.AlternativeImpl#getAlternativeDescription <em>Alternative Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeImpl extends MinimalEObjectImpl.Container implements Alternative {
	/**
	 * The default value of the '{@link #getAlternativeName() <em>Alternative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeName() <em>Alternative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName()
	 * @generated
	 * @ordered
	 */
	protected String alternativeName = ALTERNATIVE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternativeDescription() <em>Alternative Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeDescription() <em>Alternative Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeDescription()
	 * @generated
	 * @ordered
	 */
	protected String alternativeDescription = ALTERNATIVE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeName() {
		return alternativeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeName(String newAlternativeName) {
		String oldAlternativeName = alternativeName;
		alternativeName = newAlternativeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ALTERNATIVE__ALTERNATIVE_NAME, oldAlternativeName, alternativeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeDescription() {
		return alternativeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeDescription(String newAlternativeDescription) {
		String oldAlternativeDescription = alternativeDescription;
		alternativeDescription = newAlternativeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ALTERNATIVE__ALTERNATIVE_DESCRIPTION, oldAlternativeDescription, alternativeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_NAME:
				return getAlternativeName();
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_DESCRIPTION:
				return getAlternativeDescription();
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
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_NAME:
				setAlternativeName((String)newValue);
				return;
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_DESCRIPTION:
				setAlternativeDescription((String)newValue);
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
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_NAME:
				setAlternativeName(ALTERNATIVE_NAME_EDEFAULT);
				return;
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_DESCRIPTION:
				setAlternativeDescription(ALTERNATIVE_DESCRIPTION_EDEFAULT);
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
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_NAME:
				return ALTERNATIVE_NAME_EDEFAULT == null ? alternativeName != null : !ALTERNATIVE_NAME_EDEFAULT.equals(alternativeName);
			case RationalePackage.ALTERNATIVE__ALTERNATIVE_DESCRIPTION:
				return ALTERNATIVE_DESCRIPTION_EDEFAULT == null ? alternativeDescription != null : !ALTERNATIVE_DESCRIPTION_EDEFAULT.equals(alternativeDescription);
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
		result.append(" (AlternativeName: ");
		result.append(alternativeName);
		result.append(", AlternativeDescription: ");
		result.append(alternativeDescription);
		result.append(')');
		return result.toString();
	}

} //AlternativeImpl
