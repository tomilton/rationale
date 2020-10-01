/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.Context;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.ContextImpl#getContextName <em>Context Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ContextImpl#getContextDescription <em>Context Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The default value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected String contextName = CONTEXT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextDescription() <em>Context Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextDescription() <em>Context Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDescription()
	 * @generated
	 * @ordered
	 */
	protected String contextDescription = CONTEXT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextName() {
		return contextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextName(String newContextName) {
		String oldContextName = contextName;
		contextName = newContextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.CONTEXT__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextDescription() {
		return contextDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextDescription(String newContextDescription) {
		String oldContextDescription = contextDescription;
		contextDescription = newContextDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.CONTEXT__CONTEXT_DESCRIPTION, oldContextDescription, contextDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.CONTEXT__CONTEXT_NAME:
				return getContextName();
			case RationalePackage.CONTEXT__CONTEXT_DESCRIPTION:
				return getContextDescription();
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
			case RationalePackage.CONTEXT__CONTEXT_NAME:
				setContextName((String)newValue);
				return;
			case RationalePackage.CONTEXT__CONTEXT_DESCRIPTION:
				setContextDescription((String)newValue);
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
			case RationalePackage.CONTEXT__CONTEXT_NAME:
				setContextName(CONTEXT_NAME_EDEFAULT);
				return;
			case RationalePackage.CONTEXT__CONTEXT_DESCRIPTION:
				setContextDescription(CONTEXT_DESCRIPTION_EDEFAULT);
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
			case RationalePackage.CONTEXT__CONTEXT_NAME:
				return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
			case RationalePackage.CONTEXT__CONTEXT_DESCRIPTION:
				return CONTEXT_DESCRIPTION_EDEFAULT == null ? contextDescription != null : !CONTEXT_DESCRIPTION_EDEFAULT.equals(contextDescription);
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
		result.append(" (ContextName: ");
		result.append(contextName);
		result.append(", ContextDescription: ");
		result.append(contextDescription);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
