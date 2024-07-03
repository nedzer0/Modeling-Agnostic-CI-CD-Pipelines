/**
 */
package cICD_metamodel.impl;

import cICD_metamodel.CICD_metamodelPackage;
import cICD_metamodel.ScheduleTrigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.impl.ScheduleTriggerImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleTriggerImpl extends MinimalEObjectImpl.Container implements ScheduleTrigger {
	/**
	 * The default value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected String timer = TIMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICD_metamodelPackage.Literals.SCHEDULE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimer(String newTimer) {
		String oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.SCHEDULE_TRIGGER__TIMER,
					oldTimer, timer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CICD_metamodelPackage.SCHEDULE_TRIGGER__TIMER:
			return getTimer();
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
		case CICD_metamodelPackage.SCHEDULE_TRIGGER__TIMER:
			setTimer((String) newValue);
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
		case CICD_metamodelPackage.SCHEDULE_TRIGGER__TIMER:
			setTimer(TIMER_EDEFAULT);
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
		case CICD_metamodelPackage.SCHEDULE_TRIGGER__TIMER:
			return TIMER_EDEFAULT == null ? timer != null : !TIMER_EDEFAULT.equals(timer);
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
		result.append(" (timer: ");
		result.append(timer);
		result.append(')');
		return result.toString();
	}

} //ScheduleTriggerImpl
