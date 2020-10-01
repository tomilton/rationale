/**
 */
package org.architectural.rationale.impl;

import org.architectural.rationale.Consequence;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.ConsequenceImpl#getConsequenceName <em>Consequence Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ConsequenceImpl#getConsequenceDescription <em>Consequence Description</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ConsequenceImpl#getPro <em>Pro</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ConsequenceImpl#getCon <em>Con</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsequenceImpl extends MinimalEObjectImpl.Container implements Consequence {
	/**
	 * The default value of the '{@link #getConsequenceName() <em>Consequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSEQUENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsequenceName() <em>Consequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequenceName()
	 * @generated
	 * @ordered
	 */
	protected String consequenceName = CONSEQUENCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsequenceDescription() <em>Consequence Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequenceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSEQUENCE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsequenceDescription() <em>Consequence Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequenceDescription()
	 * @generated
	 * @ordered
	 */
	protected String consequenceDescription = CONSEQUENCE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPro() <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPro()
	 * @generated
	 * @ordered
	 */
	protected static final String PRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPro() <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPro()
	 * @generated
	 * @ordered
	 */
	protected String pro = PRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCon() <em>Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCon()
	 * @generated
	 * @ordered
	 */
	protected static final String CON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCon() <em>Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCon()
	 * @generated
	 * @ordered
	 */
	protected String con = CON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.CONSEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsequenceName() {
		return consequenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequenceName(String newConsequenceName) {
		String oldConsequenceName = consequenceName;
		consequenceName = newConsequenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.CONSEQUENCE__CONSEQUENCE_NAME, oldConsequenceName, consequenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsequenceDescription() {
		return consequenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequenceDescription(String newConsequenceDescription) {
		String oldConsequenceDescription = consequenceDescription;
		consequenceDescription = newConsequenceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.CONSEQUENCE__CONSEQUENCE_DESCRIPTION, oldConsequenceDescription, consequenceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPro() {
		return pro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPro(String newPro) {
		String oldPro = pro;
		pro = newPro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.CONSEQUENCE__PRO, oldPro, pro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCon() {
		return con;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCon(String newCon) {
		String oldCon = con;
		con = newCon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.CONSEQUENCE__CON, oldCon, con));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_NAME:
				return getConsequenceName();
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_DESCRIPTION:
				return getConsequenceDescription();
			case RationalePackage.CONSEQUENCE__PRO:
				return getPro();
			case RationalePackage.CONSEQUENCE__CON:
				return getCon();
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
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_NAME:
				setConsequenceName((String)newValue);
				return;
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_DESCRIPTION:
				setConsequenceDescription((String)newValue);
				return;
			case RationalePackage.CONSEQUENCE__PRO:
				setPro((String)newValue);
				return;
			case RationalePackage.CONSEQUENCE__CON:
				setCon((String)newValue);
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
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_NAME:
				setConsequenceName(CONSEQUENCE_NAME_EDEFAULT);
				return;
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_DESCRIPTION:
				setConsequenceDescription(CONSEQUENCE_DESCRIPTION_EDEFAULT);
				return;
			case RationalePackage.CONSEQUENCE__PRO:
				setPro(PRO_EDEFAULT);
				return;
			case RationalePackage.CONSEQUENCE__CON:
				setCon(CON_EDEFAULT);
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
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_NAME:
				return CONSEQUENCE_NAME_EDEFAULT == null ? consequenceName != null : !CONSEQUENCE_NAME_EDEFAULT.equals(consequenceName);
			case RationalePackage.CONSEQUENCE__CONSEQUENCE_DESCRIPTION:
				return CONSEQUENCE_DESCRIPTION_EDEFAULT == null ? consequenceDescription != null : !CONSEQUENCE_DESCRIPTION_EDEFAULT.equals(consequenceDescription);
			case RationalePackage.CONSEQUENCE__PRO:
				return PRO_EDEFAULT == null ? pro != null : !PRO_EDEFAULT.equals(pro);
			case RationalePackage.CONSEQUENCE__CON:
				return CON_EDEFAULT == null ? con != null : !CON_EDEFAULT.equals(con);
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
		result.append(" (ConsequenceName: ");
		result.append(consequenceName);
		result.append(", ConsequenceDescription: ");
		result.append(consequenceDescription);
		result.append(", pro: ");
		result.append(pro);
		result.append(", con: ");
		result.append(con);
		result.append(')');
		return result.toString();
	}

} //ConsequenceImpl
