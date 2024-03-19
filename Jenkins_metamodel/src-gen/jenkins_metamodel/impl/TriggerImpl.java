/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.TRIGGER_TYPE;
import jenkins_metamodel.Trigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.TriggerImpl#getTrigger_type <em>Trigger type</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.TriggerImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The default value of the '{@link #getTrigger_type() <em>Trigger type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger_type()
	 * @generated
	 * @ordered
	 */
	protected static final TRIGGER_TYPE TRIGGER_TYPE_EDEFAULT = TRIGGER_TYPE.CRON;

	/**
	 * The cached value of the '{@link #getTrigger_type() <em>Trigger type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger_type()
	 * @generated
	 * @ordered
	 */
	protected TRIGGER_TYPE trigger_type = TRIGGER_TYPE_EDEFAULT;

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
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRIGGER_TYPE getTrigger_type() {
		return trigger_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger_type(TRIGGER_TYPE newTrigger_type) {
		TRIGGER_TYPE oldTrigger_type = trigger_type;
		trigger_type = newTrigger_type == null ? TRIGGER_TYPE_EDEFAULT : newTrigger_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.TRIGGER__TRIGGER_TYPE,
					oldTrigger_type, trigger_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.TRIGGER__TIMER, oldTimer,
					timer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.TRIGGER__TRIGGER_TYPE:
			return getTrigger_type();
		case Jenkins_metamodelPackage.TRIGGER__TIMER:
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
		case Jenkins_metamodelPackage.TRIGGER__TRIGGER_TYPE:
			setTrigger_type((TRIGGER_TYPE) newValue);
			return;
		case Jenkins_metamodelPackage.TRIGGER__TIMER:
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
		case Jenkins_metamodelPackage.TRIGGER__TRIGGER_TYPE:
			setTrigger_type(TRIGGER_TYPE_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.TRIGGER__TIMER:
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
		case Jenkins_metamodelPackage.TRIGGER__TRIGGER_TYPE:
			return trigger_type != TRIGGER_TYPE_EDEFAULT;
		case Jenkins_metamodelPackage.TRIGGER__TIMER:
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
		result.append(" (trigger_type: ");
		result.append(trigger_type);
		result.append(", timer: ");
		result.append(timer);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
