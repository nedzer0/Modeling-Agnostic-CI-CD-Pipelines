/**
 */
package cICD_metamodel.impl;

import cICD_metamodel.CICD_metamodelPackage;
import cICD_metamodel.IfStep;
import cICD_metamodel.Step;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>If Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.impl.IfStepImpl#getIf_steps <em>If steps</em>}</li>
 *   <li>{@link cICD_metamodel.impl.IfStepImpl#getElse_steps <em>Else steps</em>}</li>
 *   <li>{@link cICD_metamodel.impl.IfStepImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStepImpl extends MinimalEObjectImpl.Container implements IfStep {
	/**
	 * The cached value of the '{@link #getIf_steps() <em>If steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_steps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> if_steps;

	/**
	 * The cached value of the '{@link #getElse_steps() <em>Else steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse_steps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> else_steps;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICD_metamodelPackage.Literals.IF_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getIf_steps() {
		if (if_steps == null) {
			if_steps = new EObjectContainmentEList<Step>(Step.class, this, CICD_metamodelPackage.IF_STEP__IF_STEPS);
		}
		return if_steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getElse_steps() {
		if (else_steps == null) {
			else_steps = new EObjectContainmentEList<Step>(Step.class, this, CICD_metamodelPackage.IF_STEP__ELSE_STEPS);
		}
		return else_steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.IF_STEP__CONDITION,
					oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICD_metamodelPackage.IF_STEP__IF_STEPS:
			return ((InternalEList<?>) getIf_steps()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.IF_STEP__ELSE_STEPS:
			return ((InternalEList<?>) getElse_steps()).basicRemove(otherEnd, msgs);
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
		case CICD_metamodelPackage.IF_STEP__IF_STEPS:
			return getIf_steps();
		case CICD_metamodelPackage.IF_STEP__ELSE_STEPS:
			return getElse_steps();
		case CICD_metamodelPackage.IF_STEP__CONDITION:
			return getCondition();
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
		case CICD_metamodelPackage.IF_STEP__IF_STEPS:
			getIf_steps().clear();
			getIf_steps().addAll((Collection<? extends Step>) newValue);
			return;
		case CICD_metamodelPackage.IF_STEP__ELSE_STEPS:
			getElse_steps().clear();
			getElse_steps().addAll((Collection<? extends Step>) newValue);
			return;
		case CICD_metamodelPackage.IF_STEP__CONDITION:
			setCondition((String) newValue);
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
		case CICD_metamodelPackage.IF_STEP__IF_STEPS:
			getIf_steps().clear();
			return;
		case CICD_metamodelPackage.IF_STEP__ELSE_STEPS:
			getElse_steps().clear();
			return;
		case CICD_metamodelPackage.IF_STEP__CONDITION:
			setCondition(CONDITION_EDEFAULT);
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
		case CICD_metamodelPackage.IF_STEP__IF_STEPS:
			return if_steps != null && !if_steps.isEmpty();
		case CICD_metamodelPackage.IF_STEP__ELSE_STEPS:
			return else_steps != null && !else_steps.isEmpty();
		case CICD_metamodelPackage.IF_STEP__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //IfStepImpl
