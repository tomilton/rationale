/**
 */
package org.architectural.rationale.impl;

import java.util.Collection;

import org.architectural.rationale.Alternative;
import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.Consequence;
import org.architectural.rationale.Context;
import org.architectural.rationale.Justification;
import org.architectural.rationale.Rationale;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.RationaleImpl#getRationaleName <em>Rationale Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.RationaleImpl#getRationaleDescription <em>Rationale Description</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.RationaleImpl#getRationale_Has_Context <em>Rationale Has Context</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.RationaleImpl#getRationale_Has_Justification <em>Rationale Has Justification</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.RationaleImpl#getRationale_Has_Alternative <em>Rationale Has Alternative</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.RationaleImpl#getRationale_Has_Consequence <em>Rationale Has Consequence</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.RationaleImpl#getRationale_Has_ArchitecturalDecision <em>Rationale Has Architectural Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RationaleImpl extends MinimalEObjectImpl.Container implements Rationale {
	/**
	 * The default value of the '{@link #getRationaleName() <em>Rationale Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationaleName()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationaleName() <em>Rationale Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationaleName()
	 * @generated
	 * @ordered
	 */
	protected String rationaleName = RATIONALE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationaleDescription() <em>Rationale Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationaleDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationaleDescription() <em>Rationale Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationaleDescription()
	 * @generated
	 * @ordered
	 */
	protected String rationaleDescription = RATIONALE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRationale_Has_Context() <em>Rationale Has Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale_Has_Context()
	 * @generated
	 * @ordered
	 */
	protected Context rationale_Has_Context;

	/**
	 * The cached value of the '{@link #getRationale_Has_Justification() <em>Rationale Has Justification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale_Has_Justification()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> rationale_Has_Justification;

	/**
	 * The cached value of the '{@link #getRationale_Has_Alternative() <em>Rationale Has Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale_Has_Alternative()
	 * @generated
	 * @ordered
	 */
	protected Alternative rationale_Has_Alternative;

	/**
	 * The cached value of the '{@link #getRationale_Has_Consequence() <em>Rationale Has Consequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale_Has_Consequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Consequence> rationale_Has_Consequence;

	/**
	 * The cached value of the '{@link #getRationale_Has_ArchitecturalDecision() <em>Rationale Has Architectural Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale_Has_ArchitecturalDecision()
	 * @generated
	 * @ordered
	 */
	protected ArchitecturalDecision rationale_Has_ArchitecturalDecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.RATIONALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationaleName() {
		return rationaleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationaleName(String newRationaleName) {
		String oldRationaleName = rationaleName;
		rationaleName = newRationaleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.RATIONALE__RATIONALE_NAME, oldRationaleName, rationaleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationaleDescription() {
		return rationaleDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationaleDescription(String newRationaleDescription) {
		String oldRationaleDescription = rationaleDescription;
		rationaleDescription = newRationaleDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.RATIONALE__RATIONALE_DESCRIPTION, oldRationaleDescription, rationaleDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getRationale_Has_Context() {
		if (rationale_Has_Context != null && rationale_Has_Context.eIsProxy()) {
			InternalEObject oldRationale_Has_Context = (InternalEObject)rationale_Has_Context;
			rationale_Has_Context = (Context)eResolveProxy(oldRationale_Has_Context);
			if (rationale_Has_Context != oldRationale_Has_Context) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.RATIONALE__RATIONALE_HAS_CONTEXT, oldRationale_Has_Context, rationale_Has_Context));
			}
		}
		return rationale_Has_Context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetRationale_Has_Context() {
		return rationale_Has_Context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale_Has_Context(Context newRationale_Has_Context) {
		Context oldRationale_Has_Context = rationale_Has_Context;
		rationale_Has_Context = newRationale_Has_Context;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.RATIONALE__RATIONALE_HAS_CONTEXT, oldRationale_Has_Context, rationale_Has_Context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getRationale_Has_Justification() {
		if (rationale_Has_Justification == null) {
			rationale_Has_Justification = new EObjectResolvingEList<Justification>(Justification.class, this, RationalePackage.RATIONALE__RATIONALE_HAS_JUSTIFICATION);
		}
		return rationale_Has_Justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative getRationale_Has_Alternative() {
		if (rationale_Has_Alternative != null && rationale_Has_Alternative.eIsProxy()) {
			InternalEObject oldRationale_Has_Alternative = (InternalEObject)rationale_Has_Alternative;
			rationale_Has_Alternative = (Alternative)eResolveProxy(oldRationale_Has_Alternative);
			if (rationale_Has_Alternative != oldRationale_Has_Alternative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.RATIONALE__RATIONALE_HAS_ALTERNATIVE, oldRationale_Has_Alternative, rationale_Has_Alternative));
			}
		}
		return rationale_Has_Alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative basicGetRationale_Has_Alternative() {
		return rationale_Has_Alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale_Has_Alternative(Alternative newRationale_Has_Alternative) {
		Alternative oldRationale_Has_Alternative = rationale_Has_Alternative;
		rationale_Has_Alternative = newRationale_Has_Alternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.RATIONALE__RATIONALE_HAS_ALTERNATIVE, oldRationale_Has_Alternative, rationale_Has_Alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consequence> getRationale_Has_Consequence() {
		if (rationale_Has_Consequence == null) {
			rationale_Has_Consequence = new EObjectResolvingEList<Consequence>(Consequence.class, this, RationalePackage.RATIONALE__RATIONALE_HAS_CONSEQUENCE);
		}
		return rationale_Has_Consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalDecision getRationale_Has_ArchitecturalDecision() {
		if (rationale_Has_ArchitecturalDecision != null && rationale_Has_ArchitecturalDecision.eIsProxy()) {
			InternalEObject oldRationale_Has_ArchitecturalDecision = (InternalEObject)rationale_Has_ArchitecturalDecision;
			rationale_Has_ArchitecturalDecision = (ArchitecturalDecision)eResolveProxy(oldRationale_Has_ArchitecturalDecision);
			if (rationale_Has_ArchitecturalDecision != oldRationale_Has_ArchitecturalDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RationalePackage.RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION, oldRationale_Has_ArchitecturalDecision, rationale_Has_ArchitecturalDecision));
			}
		}
		return rationale_Has_ArchitecturalDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalDecision basicGetRationale_Has_ArchitecturalDecision() {
		return rationale_Has_ArchitecturalDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale_Has_ArchitecturalDecision(ArchitecturalDecision newRationale_Has_ArchitecturalDecision) {
		ArchitecturalDecision oldRationale_Has_ArchitecturalDecision = rationale_Has_ArchitecturalDecision;
		rationale_Has_ArchitecturalDecision = newRationale_Has_ArchitecturalDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION, oldRationale_Has_ArchitecturalDecision, rationale_Has_ArchitecturalDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.RATIONALE__RATIONALE_NAME:
				return getRationaleName();
			case RationalePackage.RATIONALE__RATIONALE_DESCRIPTION:
				return getRationaleDescription();
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONTEXT:
				if (resolve) return getRationale_Has_Context();
				return basicGetRationale_Has_Context();
			case RationalePackage.RATIONALE__RATIONALE_HAS_JUSTIFICATION:
				return getRationale_Has_Justification();
			case RationalePackage.RATIONALE__RATIONALE_HAS_ALTERNATIVE:
				if (resolve) return getRationale_Has_Alternative();
				return basicGetRationale_Has_Alternative();
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONSEQUENCE:
				return getRationale_Has_Consequence();
			case RationalePackage.RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION:
				if (resolve) return getRationale_Has_ArchitecturalDecision();
				return basicGetRationale_Has_ArchitecturalDecision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RationalePackage.RATIONALE__RATIONALE_NAME:
				setRationaleName((String)newValue);
				return;
			case RationalePackage.RATIONALE__RATIONALE_DESCRIPTION:
				setRationaleDescription((String)newValue);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONTEXT:
				setRationale_Has_Context((Context)newValue);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_JUSTIFICATION:
				getRationale_Has_Justification().clear();
				getRationale_Has_Justification().addAll((Collection<? extends Justification>)newValue);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_ALTERNATIVE:
				setRationale_Has_Alternative((Alternative)newValue);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONSEQUENCE:
				getRationale_Has_Consequence().clear();
				getRationale_Has_Consequence().addAll((Collection<? extends Consequence>)newValue);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION:
				setRationale_Has_ArchitecturalDecision((ArchitecturalDecision)newValue);
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
			case RationalePackage.RATIONALE__RATIONALE_NAME:
				setRationaleName(RATIONALE_NAME_EDEFAULT);
				return;
			case RationalePackage.RATIONALE__RATIONALE_DESCRIPTION:
				setRationaleDescription(RATIONALE_DESCRIPTION_EDEFAULT);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONTEXT:
				setRationale_Has_Context((Context)null);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_JUSTIFICATION:
				getRationale_Has_Justification().clear();
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_ALTERNATIVE:
				setRationale_Has_Alternative((Alternative)null);
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONSEQUENCE:
				getRationale_Has_Consequence().clear();
				return;
			case RationalePackage.RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION:
				setRationale_Has_ArchitecturalDecision((ArchitecturalDecision)null);
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
			case RationalePackage.RATIONALE__RATIONALE_NAME:
				return RATIONALE_NAME_EDEFAULT == null ? rationaleName != null : !RATIONALE_NAME_EDEFAULT.equals(rationaleName);
			case RationalePackage.RATIONALE__RATIONALE_DESCRIPTION:
				return RATIONALE_DESCRIPTION_EDEFAULT == null ? rationaleDescription != null : !RATIONALE_DESCRIPTION_EDEFAULT.equals(rationaleDescription);
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONTEXT:
				return rationale_Has_Context != null;
			case RationalePackage.RATIONALE__RATIONALE_HAS_JUSTIFICATION:
				return rationale_Has_Justification != null && !rationale_Has_Justification.isEmpty();
			case RationalePackage.RATIONALE__RATIONALE_HAS_ALTERNATIVE:
				return rationale_Has_Alternative != null;
			case RationalePackage.RATIONALE__RATIONALE_HAS_CONSEQUENCE:
				return rationale_Has_Consequence != null && !rationale_Has_Consequence.isEmpty();
			case RationalePackage.RATIONALE__RATIONALE_HAS_ARCHITECTURAL_DECISION:
				return rationale_Has_ArchitecturalDecision != null;
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
		result.append(" (RationaleName: ");
		result.append(rationaleName);
		result.append(", RationaleDescription: ");
		result.append(rationaleDescription);
		result.append(')');
		return result.toString();
	}

} //RationaleImpl
