/**
 */
package org.gemoc.agro.simulation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.agro.simulation.FeedbackLevel;
import org.gemoc.agro.simulation.SchedulingFeedback;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingFeedbackImpl extends MinimalEObjectImpl.Container implements SchedulingFeedback {
	/**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
	protected static final FeedbackLevel LEVEL_EDEFAULT = FeedbackLevel.INFO;

	/**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
	protected FeedbackLevel level = LEVEL_EDEFAULT;

	/**
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
	protected String message = MESSAGE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SchedulingFeedbackImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SimulationPackage.Literals.SCHEDULING_FEEDBACK;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeedbackLevel getLevel() {
    return level;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLevel(FeedbackLevel newLevel) {
    FeedbackLevel oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.SCHEDULING_FEEDBACK__LEVEL, oldLevel, level));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMessage() {
    return message;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMessage(String newMessage) {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.SCHEDULING_FEEDBACK__MESSAGE, oldMessage, message));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SimulationPackage.SCHEDULING_FEEDBACK__LEVEL:
        return getLevel();
      case SimulationPackage.SCHEDULING_FEEDBACK__MESSAGE:
        return getMessage();
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
      case SimulationPackage.SCHEDULING_FEEDBACK__LEVEL:
        setLevel((FeedbackLevel)newValue);
        return;
      case SimulationPackage.SCHEDULING_FEEDBACK__MESSAGE:
        setMessage((String)newValue);
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
      case SimulationPackage.SCHEDULING_FEEDBACK__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case SimulationPackage.SCHEDULING_FEEDBACK__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
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
      case SimulationPackage.SCHEDULING_FEEDBACK__LEVEL:
        return level != LEVEL_EDEFAULT;
      case SimulationPackage.SCHEDULING_FEEDBACK__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
    result.append(" (level: ");
    result.append(level);
    result.append(", message: ");
    result.append(message);
    result.append(')');
    return result.toString();
  }

} //SchedulingFeedbackImpl
