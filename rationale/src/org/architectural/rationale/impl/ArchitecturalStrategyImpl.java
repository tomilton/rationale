/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.ArchitecturalStrategy;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalStrategyImpl#getArchitecturalStrategyName <em>Architectural Strategy Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalStrategyImpl#getArchitecturalStrategyDescription <em>Architectural Strategy Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitecturalStrategyImpl extends MinimalEObjectImpl.Container implements ArchitecturalStrategy {
	/**
	 * The default value of the '{@link #getArchitecturalStrategyName() <em>Architectural Strategy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalStrategyName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_STRATEGY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalStrategyName() <em>Architectural Strategy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalStrategyName()
	 * @generated
	 * @ordered
	 */
	protected String architecturalStrategyName = ARCHITECTURAL_STRATEGY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecturalStrategyDescription() <em>Architectural Strategy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalStrategyDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_STRATEGY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalStrategyDescription() <em>Architectural Strategy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalStrategyDescription()
	 * @generated
	 * @ordered
	 */
	protected String architecturalStrategyDescription = ARCHITECTURAL_STRATEGY_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ARCHITECTURAL_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalStrategyName() {
		return architecturalStrategyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalStrategyName(String newArchitecturalStrategyName) {
		String oldArchitecturalStrategyName = architecturalStrategyName;
		architecturalStrategyName = newArchitecturalStrategyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME, oldArchitecturalStrategyName, architecturalStrategyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalStrategyDescription() {
		return architecturalStrategyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalStrategyDescription(String newArchitecturalStrategyDescription) {
		String oldArchitecturalStrategyDescription = architecturalStrategyDescription;
		architecturalStrategyDescription = newArchitecturalStrategyDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION, oldArchitecturalStrategyDescription, architecturalStrategyDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME:
				return getArchitecturalStrategyName();
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION:
				return getArchitecturalStrategyDescription();
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
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME:
				setArchitecturalStrategyName((String)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION:
				setArchitecturalStrategyDescription((String)newValue);
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
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME:
				setArchitecturalStrategyName(ARCHITECTURAL_STRATEGY_NAME_EDEFAULT);
				return;
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION:
				setArchitecturalStrategyDescription(ARCHITECTURAL_STRATEGY_DESCRIPTION_EDEFAULT);
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
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_NAME:
				return ARCHITECTURAL_STRATEGY_NAME_EDEFAULT == null ? architecturalStrategyName != null : !ARCHITECTURAL_STRATEGY_NAME_EDEFAULT.equals(architecturalStrategyName);
			case RationalePackage.ARCHITECTURAL_STRATEGY__ARCHITECTURAL_STRATEGY_DESCRIPTION:
				return ARCHITECTURAL_STRATEGY_DESCRIPTION_EDEFAULT == null ? architecturalStrategyDescription != null : !ARCHITECTURAL_STRATEGY_DESCRIPTION_EDEFAULT.equals(architecturalStrategyDescription);
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
		result.append(" (ArchitecturalStrategyName: ");
		result.append(architecturalStrategyName);
		result.append(", ArchitecturalStrategyDescription: ");
		result.append(architecturalStrategyDescription);
		result.append(')');
		return result.toString();
	}

} //ArchitecturalStrategyImpl
