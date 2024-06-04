/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.EventTrigger;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.WEBHOOK_ACTIVITY_TYPES;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.EventTriggerImpl#getActivityType <em>Activity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventTriggerImpl extends TriggerImpl implements EventTrigger {
	/**
	 * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected EList<WEBHOOK_ACTIVITY_TYPES> activityType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.EVENT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WEBHOOK_ACTIVITY_TYPES> getActivityType() {
		if (activityType == null) {
			activityType = new EDataTypeUniqueEList<WEBHOOK_ACTIVITY_TYPES>(WEBHOOK_ACTIVITY_TYPES.class, this,
					GHA_metamodelPackage.EVENT_TRIGGER__ACTIVITY_TYPE);
		}
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GHA_metamodelPackage.EVENT_TRIGGER__ACTIVITY_TYPE:
			return getActivityType();
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
		case GHA_metamodelPackage.EVENT_TRIGGER__ACTIVITY_TYPE:
			getActivityType().clear();
			getActivityType().addAll((Collection<? extends WEBHOOK_ACTIVITY_TYPES>) newValue);
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
		case GHA_metamodelPackage.EVENT_TRIGGER__ACTIVITY_TYPE:
			getActivityType().clear();
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
		case GHA_metamodelPackage.EVENT_TRIGGER__ACTIVITY_TYPE:
			return activityType != null && !activityType.isEmpty();
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
		result.append(" (activityType: ");
		result.append(activityType);
		result.append(')');
		return result.toString();
	}

} //EventTriggerImpl
