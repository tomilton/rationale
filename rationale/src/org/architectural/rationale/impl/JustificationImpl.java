/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.Justification;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.JustificationImpl#getJustificationName <em>Justification Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.JustificationImpl#getJustificationDescription <em>Justification Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JustificationImpl extends MinimalEObjectImpl.Container implements Justification {
	/**
	 * The default value of the '{@link #getJustificationName() <em>Justification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationName()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustificationName() <em>Justification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationName()
	 * @generated
	 * @ordered
	 */
	protected String justificationName = JUSTIFICATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustificationDescription() <em>Justification Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustificationDescription() <em>Justification Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationDescription()
	 * @generated
	 * @ordered
	 */
	protected String justificationDescription = JUSTIFICATION_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JustificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.JUSTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustificationName() {
		return justificationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustificationName(String newJustificationName) {
		String oldJustificationName = justificationName;
		justificationName = newJustificationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.JUSTIFICATION__JUSTIFICATION_NAME, oldJustificationName, justificationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustificationDescription() {
		return justificationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustificationDescription(String newJustificationDescription) {
		String oldJustificationDescription = justificationDescription;
		justificationDescription = newJustificationDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.JUSTIFICATION__JUSTIFICATION_DESCRIPTION, oldJustificationDescription, justificationDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_NAME:
				return getJustificationName();
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_DESCRIPTION:
				return getJustificationDescription();
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
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_NAME:
				setJustificationName((String)newValue);
				return;
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_DESCRIPTION:
				setJustificationDescription((String)newValue);
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
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_NAME:
				setJustificationName(JUSTIFICATION_NAME_EDEFAULT);
				return;
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_DESCRIPTION:
				setJustificationDescription(JUSTIFICATION_DESCRIPTION_EDEFAULT);
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
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_NAME:
				return JUSTIFICATION_NAME_EDEFAULT == null ? justificationName != null : !JUSTIFICATION_NAME_EDEFAULT.equals(justificationName);
			case RationalePackage.JUSTIFICATION__JUSTIFICATION_DESCRIPTION:
				return JUSTIFICATION_DESCRIPTION_EDEFAULT == null ? justificationDescription != null : !JUSTIFICATION_DESCRIPTION_EDEFAULT.equals(justificationDescription);
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
		result.append(" (JustificationName: ");
		result.append(justificationName);
		result.append(", JustificationDescription: ");
		result.append(justificationDescription);
		result.append(')');
		return result.toString();
	}

} //JustificationImpl
