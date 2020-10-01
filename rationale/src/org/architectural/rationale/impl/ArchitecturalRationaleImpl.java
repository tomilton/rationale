/**
 */
package org.architectural.rationale.impl;

import java.util.Collection;

import org.architectural.rationale.Alternative;
import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.ArchitecturalPattern;
import org.architectural.rationale.ArchitecturalRationale;
import org.architectural.rationale.ArchitecturalStrategy;
import org.architectural.rationale.ArchitecturalTactic;
import org.architectural.rationale.Consequence;
import org.architectural.rationale.Context;
import org.architectural.rationale.Justification;
import org.architectural.rationale.Rationale;
import org.architectural.rationale.RationalePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Rationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_J <em>AHave J</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_C <em>AHave C</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_R <em>AHave R</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_A <em>AHave A</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_Cq <em>AHave Cq</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_Ad <em>AHave Ad</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_S <em>AHave S</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_T <em>AHave T</em>}</li>
 *   <li>{@link org.architectural.rationale.impl.ArchitecturalRationaleImpl#getA_Have_P <em>AHave P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitecturalRationaleImpl extends MinimalEObjectImpl.Container implements ArchitecturalRationale {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getA_Have_J() <em>AHave J</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_J()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> a_Have_J;

	/**
	 * The cached value of the '{@link #getA_Have_C() <em>AHave C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_C()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> a_Have_C;

	/**
	 * The cached value of the '{@link #getA_Have_R() <em>AHave R</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_R()
	 * @generated
	 * @ordered
	 */
	protected EList<Rationale> a_Have_R;

	/**
	 * The cached value of the '{@link #getA_Have_A() <em>AHave A</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_A()
	 * @generated
	 * @ordered
	 */
	protected EList<Alternative> a_Have_A;

	/**
	 * The cached value of the '{@link #getA_Have_Cq() <em>AHave Cq</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_Cq()
	 * @generated
	 * @ordered
	 */
	protected EList<Consequence> a_Have_Cq;

	/**
	 * The cached value of the '{@link #getA_Have_Ad() <em>AHave Ad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_Ad()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalDecision> a_Have_Ad;

	/**
	 * The cached value of the '{@link #getA_Have_S() <em>AHave S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_S()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalStrategy> a_Have_S;

	/**
	 * The cached value of the '{@link #getA_Have_T() <em>AHave T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_T()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalTactic> a_Have_T;

	/**
	 * The cached value of the '{@link #getA_Have_P() <em>AHave P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_Have_P()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalPattern> a_Have_P;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalRationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RationalePackage.Literals.ARCHITECTURAL_RATIONALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RationalePackage.ARCHITECTURAL_RATIONALE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getA_Have_J() {
		if (a_Have_J == null) {
			a_Have_J = new EObjectContainmentEList<Justification>(Justification.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_J);
		}
		return a_Have_J;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getA_Have_C() {
		if (a_Have_C == null) {
			a_Have_C = new EObjectContainmentEList<Context>(Context.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_C);
		}
		return a_Have_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rationale> getA_Have_R() {
		if (a_Have_R == null) {
			a_Have_R = new EObjectContainmentEList<Rationale>(Rationale.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_R);
		}
		return a_Have_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alternative> getA_Have_A() {
		if (a_Have_A == null) {
			a_Have_A = new EObjectContainmentEList<Alternative>(Alternative.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_A);
		}
		return a_Have_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consequence> getA_Have_Cq() {
		if (a_Have_Cq == null) {
			a_Have_Cq = new EObjectContainmentEList<Consequence>(Consequence.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_CQ);
		}
		return a_Have_Cq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalDecision> getA_Have_Ad() {
		if (a_Have_Ad == null) {
			a_Have_Ad = new EObjectContainmentEList<ArchitecturalDecision>(ArchitecturalDecision.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_AD);
		}
		return a_Have_Ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalStrategy> getA_Have_S() {
		if (a_Have_S == null) {
			a_Have_S = new EObjectContainmentEList<ArchitecturalStrategy>(ArchitecturalStrategy.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_S);
		}
		return a_Have_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalTactic> getA_Have_T() {
		if (a_Have_T == null) {
			a_Have_T = new EObjectContainmentEList<ArchitecturalTactic>(ArchitecturalTactic.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_T);
		}
		return a_Have_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalPattern> getA_Have_P() {
		if (a_Have_P == null) {
			a_Have_P = new EObjectContainmentEList<ArchitecturalPattern>(ArchitecturalPattern.class, this, RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_P);
		}
		return a_Have_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_J:
				return ((InternalEList<?>)getA_Have_J()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_C:
				return ((InternalEList<?>)getA_Have_C()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_R:
				return ((InternalEList<?>)getA_Have_R()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_A:
				return ((InternalEList<?>)getA_Have_A()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_CQ:
				return ((InternalEList<?>)getA_Have_Cq()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_AD:
				return ((InternalEList<?>)getA_Have_Ad()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_S:
				return ((InternalEList<?>)getA_Have_S()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_T:
				return ((InternalEList<?>)getA_Have_T()).basicRemove(otherEnd, msgs);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_P:
				return ((InternalEList<?>)getA_Have_P()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RationalePackage.ARCHITECTURAL_RATIONALE__NAME:
				return getName();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_J:
				return getA_Have_J();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_C:
				return getA_Have_C();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_R:
				return getA_Have_R();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_A:
				return getA_Have_A();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_CQ:
				return getA_Have_Cq();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_AD:
				return getA_Have_Ad();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_S:
				return getA_Have_S();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_T:
				return getA_Have_T();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_P:
				return getA_Have_P();
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
			case RationalePackage.ARCHITECTURAL_RATIONALE__NAME:
				setName((String)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_J:
				getA_Have_J().clear();
				getA_Have_J().addAll((Collection<? extends Justification>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_C:
				getA_Have_C().clear();
				getA_Have_C().addAll((Collection<? extends Context>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_R:
				getA_Have_R().clear();
				getA_Have_R().addAll((Collection<? extends Rationale>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_A:
				getA_Have_A().clear();
				getA_Have_A().addAll((Collection<? extends Alternative>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_CQ:
				getA_Have_Cq().clear();
				getA_Have_Cq().addAll((Collection<? extends Consequence>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_AD:
				getA_Have_Ad().clear();
				getA_Have_Ad().addAll((Collection<? extends ArchitecturalDecision>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_S:
				getA_Have_S().clear();
				getA_Have_S().addAll((Collection<? extends ArchitecturalStrategy>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_T:
				getA_Have_T().clear();
				getA_Have_T().addAll((Collection<? extends ArchitecturalTactic>)newValue);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_P:
				getA_Have_P().clear();
				getA_Have_P().addAll((Collection<? extends ArchitecturalPattern>)newValue);
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
			case RationalePackage.ARCHITECTURAL_RATIONALE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_J:
				getA_Have_J().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_C:
				getA_Have_C().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_R:
				getA_Have_R().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_A:
				getA_Have_A().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_CQ:
				getA_Have_Cq().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_AD:
				getA_Have_Ad().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_S:
				getA_Have_S().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_T:
				getA_Have_T().clear();
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_P:
				getA_Have_P().clear();
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
			case RationalePackage.ARCHITECTURAL_RATIONALE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_J:
				return a_Have_J != null && !a_Have_J.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_C:
				return a_Have_C != null && !a_Have_C.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_R:
				return a_Have_R != null && !a_Have_R.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_A:
				return a_Have_A != null && !a_Have_A.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_CQ:
				return a_Have_Cq != null && !a_Have_Cq.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_AD:
				return a_Have_Ad != null && !a_Have_Ad.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_S:
				return a_Have_S != null && !a_Have_S.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_T:
				return a_Have_T != null && !a_Have_T.isEmpty();
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_P:
				return a_Have_P != null && !a_Have_P.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArchitecturalRationaleImpl
