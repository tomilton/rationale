/**
 */
package org.architectural.rationale.impl;

import java.util.Collection;

import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.ArchitecturalPattern;
import org.architectural.rationale.ArchitecturalStrategy;
import org.architectural.rationale.ArchitecturalTactic;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalDecisionImpl#getArchitecturalDecisionName <em>Architectural Decision Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalDecisionImpl#getArchitecturalDecisionDescription <em>Architectural Decision Description</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalDecisionImpl#getArchitecturalDecision_Has_ArchitecturalPattern <em>Architectural Decision Has Architectural Pattern</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalDecisionImpl#getArchitecturalDecision_Has_ArchitecturalTactic <em>Architectural Decision Has Architectural Tactic</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalDecisionImpl#getArchitecturalDecision_Has_ArchitecturalStrategy <em>Architectural Decision Has Architectural Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitecturalDecisionImpl extends MinimalEObjectImpl.Container implements ArchitecturalDecision {
	/**
	 * The default value of the '{@link #getArchitecturalDecisionName() <em>Architectural Decision Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalDecisionName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_DECISION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalDecisionName() <em>Architectural Decision Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalDecisionName()
	 * @generated
	 * @ordered
	 */
	protected String architecturalDecisionName = ARCHITECTURAL_DECISION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecturalDecisionDescription() <em>Architectural Decision Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalDecisionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURAL_DECISION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecturalDecisionDescription() <em>Architectural Decision Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalDecisionDescription()
	 * @generated
	 * @ordered
	 */
	protected String architecturalDecisionDescription = ARCHITECTURAL_DECISION_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArchitecturalDecision_Has_ArchitecturalPattern() <em>Architectural Decision Has Architectural Pattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalDecision_Has_ArchitecturalPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalPattern> architecturalDecision_Has_ArchitecturalPattern;

	/**
	 * The cached value of the '{@link #getArchitecturalDecision_Has_ArchitecturalTactic() <em>Architectural Decision Has Architectural Tactic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalDecision_Has_ArchitecturalTactic()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalTactic> architecturalDecision_Has_ArchitecturalTactic;

	/**
	 * The cached value of the '{@link #getArchitecturalDecision_Has_ArchitecturalStrategy() <em>Architectural Decision Has Architectural Strategy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalDecision_Has_ArchitecturalStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalStrategy> architecturalDecision_Has_ArchitecturalStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ARCHITECTURAL_DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalDecisionName() {
		return architecturalDecisionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalDecisionName(String newArchitecturalDecisionName) {
		String oldArchitecturalDecisionName = architecturalDecisionName;
		architecturalDecisionName = newArchitecturalDecisionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME, oldArchitecturalDecisionName, architecturalDecisionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecturalDecisionDescription() {
		return architecturalDecisionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalDecisionDescription(String newArchitecturalDecisionDescription) {
		String oldArchitecturalDecisionDescription = architecturalDecisionDescription;
		architecturalDecisionDescription = newArchitecturalDecisionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION, oldArchitecturalDecisionDescription, architecturalDecisionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalPattern> getArchitecturalDecision_Has_ArchitecturalPattern() {
		if (architecturalDecision_Has_ArchitecturalPattern == null) {
			architecturalDecision_Has_ArchitecturalPattern = new EObjectResolvingEList<ArchitecturalPattern>(ArchitecturalPattern.class, this, RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN);
		}
		return architecturalDecision_Has_ArchitecturalPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalTactic> getArchitecturalDecision_Has_ArchitecturalTactic() {
		if (architecturalDecision_Has_ArchitecturalTactic == null) {
			architecturalDecision_Has_ArchitecturalTactic = new EObjectResolvingEList<ArchitecturalTactic>(ArchitecturalTactic.class, this, RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC);
		}
		return architecturalDecision_Has_ArchitecturalTactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalStrategy> getArchitecturalDecision_Has_ArchitecturalStrategy() {
		if (architecturalDecision_Has_ArchitecturalStrategy == null) {
			architecturalDecision_Has_ArchitecturalStrategy = new EObjectResolvingEList<ArchitecturalStrategy>(ArchitecturalStrategy.class, this, RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY);
		}
		return architecturalDecision_Has_ArchitecturalStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME:
				return getArchitecturalDecisionName();
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION:
				return getArchitecturalDecisionDescription();
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN:
				return getArchitecturalDecision_Has_ArchitecturalPattern();
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC:
				return getArchitecturalDecision_Has_ArchitecturalTactic();
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY:
				return getArchitecturalDecision_Has_ArchitecturalStrategy();
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
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME:
				setArchitecturalDecisionName((String)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION:
				setArchitecturalDecisionDescription((String)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN:
				getArchitecturalDecision_Has_ArchitecturalPattern().clear();
				getArchitecturalDecision_Has_ArchitecturalPattern().addAll((Collection<? extends ArchitecturalPattern>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC:
				getArchitecturalDecision_Has_ArchitecturalTactic().clear();
				getArchitecturalDecision_Has_ArchitecturalTactic().addAll((Collection<? extends ArchitecturalTactic>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY:
				getArchitecturalDecision_Has_ArchitecturalStrategy().clear();
				getArchitecturalDecision_Has_ArchitecturalStrategy().addAll((Collection<? extends ArchitecturalStrategy>)newValue);
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
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME:
				setArchitecturalDecisionName(ARCHITECTURAL_DECISION_NAME_EDEFAULT);
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION:
				setArchitecturalDecisionDescription(ARCHITECTURAL_DECISION_DESCRIPTION_EDEFAULT);
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN:
				getArchitecturalDecision_Has_ArchitecturalPattern().clear();
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC:
				getArchitecturalDecision_Has_ArchitecturalTactic().clear();
				return;
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY:
				getArchitecturalDecision_Has_ArchitecturalStrategy().clear();
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
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_NAME:
				return ARCHITECTURAL_DECISION_NAME_EDEFAULT == null ? architecturalDecisionName != null : !ARCHITECTURAL_DECISION_NAME_EDEFAULT.equals(architecturalDecisionName);
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_DESCRIPTION:
				return ARCHITECTURAL_DECISION_DESCRIPTION_EDEFAULT == null ? architecturalDecisionDescription != null : !ARCHITECTURAL_DECISION_DESCRIPTION_EDEFAULT.equals(architecturalDecisionDescription);
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_PATTERN:
				return architecturalDecision_Has_ArchitecturalPattern != null && !architecturalDecision_Has_ArchitecturalPattern.isEmpty();
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_TACTIC:
				return architecturalDecision_Has_ArchitecturalTactic != null && !architecturalDecision_Has_ArchitecturalTactic.isEmpty();
			case RationalePackage.ARCHITECTURAL_DECISION__ARCHITECTURAL_DECISION_HAS_ARCHITECTURAL_STRATEGY:
				return architecturalDecision_Has_ArchitecturalStrategy != null && !architecturalDecision_Has_ArchitecturalStrategy.isEmpty();
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
		result.append(" (ArchitecturalDecisionName: ");
		result.append(architecturalDecisionName);
		result.append(", ArchitecturalDecisionDescription: ");
		result.append(architecturalDecisionDescription);
		result.append(')');
		return result.toString();
	}

} //ArchitecturalDecisionImpl
