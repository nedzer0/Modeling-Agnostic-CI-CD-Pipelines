/**
 */
package org.gemoc.agro.simulation.impl;

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
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.exploitation.Surface;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.SchedulingFeedback;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl#getScheduledOn <em>Scheduled On</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl#getOnSurface <em>On Surface</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl#getSchedulingFeedback <em>Scheduling Feedback</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityWorkImpl extends MinimalEObjectImpl.Container implements ActivityWork {
	/**
   * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getActivity()
   * @generated
   * @ordered
   */
	protected ExploitationActivity activity;

	/**
   * The cached value of the '{@link #getScheduledOn() <em>Scheduled On</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScheduledOn()
   * @generated
   * @ordered
   */
	protected Day scheduledOn;

	/**
   * The cached value of the '{@link #getOnSurface() <em>On Surface</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOnSurface()
   * @generated
   * @ordered
   */
	protected Surface onSurface;

	/**
   * The cached value of the '{@link #getSchedulingFeedback() <em>Scheduling Feedback</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSchedulingFeedback()
   * @generated
   * @ordered
   */
	protected EList<SchedulingFeedback> schedulingFeedback;

	/**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ActivityWorkImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SimulationPackage.Literals.ACTIVITY_WORK;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExploitationActivity getActivity() {
    if (activity != null && activity.eIsProxy()) {
      InternalEObject oldActivity = (InternalEObject)activity;
      activity = (ExploitationActivity)eResolveProxy(oldActivity);
      if (activity != oldActivity) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.ACTIVITY_WORK__ACTIVITY, oldActivity, activity));
      }
    }
    return activity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExploitationActivity basicGetActivity() {
    return activity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setActivity(ExploitationActivity newActivity) {
    ExploitationActivity oldActivity = activity;
    activity = newActivity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.ACTIVITY_WORK__ACTIVITY, oldActivity, activity));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Day getScheduledOn() {
    if (scheduledOn != null && scheduledOn.eIsProxy()) {
      InternalEObject oldScheduledOn = (InternalEObject)scheduledOn;
      scheduledOn = (Day)eResolveProxy(oldScheduledOn);
      if (scheduledOn != oldScheduledOn) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.ACTIVITY_WORK__SCHEDULED_ON, oldScheduledOn, scheduledOn));
      }
    }
    return scheduledOn;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Day basicGetScheduledOn() {
    return scheduledOn;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScheduledOn(Day newScheduledOn) {
    Day oldScheduledOn = scheduledOn;
    scheduledOn = newScheduledOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.ACTIVITY_WORK__SCHEDULED_ON, oldScheduledOn, scheduledOn));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Surface getOnSurface() {
    if (onSurface != null && onSurface.eIsProxy()) {
      InternalEObject oldOnSurface = (InternalEObject)onSurface;
      onSurface = (Surface)eResolveProxy(oldOnSurface);
      if (onSurface != oldOnSurface) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.ACTIVITY_WORK__ON_SURFACE, oldOnSurface, onSurface));
      }
    }
    return onSurface;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Surface basicGetOnSurface() {
    return onSurface;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOnSurface(Surface newOnSurface) {
    Surface oldOnSurface = onSurface;
    onSurface = newOnSurface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.ACTIVITY_WORK__ON_SURFACE, oldOnSurface, onSurface));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SchedulingFeedback> getSchedulingFeedback() {
    if (schedulingFeedback == null) {
      schedulingFeedback = new EObjectContainmentEList<SchedulingFeedback>(SchedulingFeedback.class, this, SimulationPackage.ACTIVITY_WORK__SCHEDULING_FEEDBACK);
    }
    return schedulingFeedback;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration() {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration) {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.ACTIVITY_WORK__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SimulationPackage.ACTIVITY_WORK__SCHEDULING_FEEDBACK:
        return ((InternalEList<?>)getSchedulingFeedback()).basicRemove(otherEnd, msgs);
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
      case SimulationPackage.ACTIVITY_WORK__ACTIVITY:
        if (resolve) return getActivity();
        return basicGetActivity();
      case SimulationPackage.ACTIVITY_WORK__SCHEDULED_ON:
        if (resolve) return getScheduledOn();
        return basicGetScheduledOn();
      case SimulationPackage.ACTIVITY_WORK__ON_SURFACE:
        if (resolve) return getOnSurface();
        return basicGetOnSurface();
      case SimulationPackage.ACTIVITY_WORK__SCHEDULING_FEEDBACK:
        return getSchedulingFeedback();
      case SimulationPackage.ACTIVITY_WORK__DURATION:
        return getDuration();
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
      case SimulationPackage.ACTIVITY_WORK__ACTIVITY:
        setActivity((ExploitationActivity)newValue);
        return;
      case SimulationPackage.ACTIVITY_WORK__SCHEDULED_ON:
        setScheduledOn((Day)newValue);
        return;
      case SimulationPackage.ACTIVITY_WORK__ON_SURFACE:
        setOnSurface((Surface)newValue);
        return;
      case SimulationPackage.ACTIVITY_WORK__SCHEDULING_FEEDBACK:
        getSchedulingFeedback().clear();
        getSchedulingFeedback().addAll((Collection<? extends SchedulingFeedback>)newValue);
        return;
      case SimulationPackage.ACTIVITY_WORK__DURATION:
        setDuration((Integer)newValue);
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
      case SimulationPackage.ACTIVITY_WORK__ACTIVITY:
        setActivity((ExploitationActivity)null);
        return;
      case SimulationPackage.ACTIVITY_WORK__SCHEDULED_ON:
        setScheduledOn((Day)null);
        return;
      case SimulationPackage.ACTIVITY_WORK__ON_SURFACE:
        setOnSurface((Surface)null);
        return;
      case SimulationPackage.ACTIVITY_WORK__SCHEDULING_FEEDBACK:
        getSchedulingFeedback().clear();
        return;
      case SimulationPackage.ACTIVITY_WORK__DURATION:
        setDuration(DURATION_EDEFAULT);
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
      case SimulationPackage.ACTIVITY_WORK__ACTIVITY:
        return activity != null;
      case SimulationPackage.ACTIVITY_WORK__SCHEDULED_ON:
        return scheduledOn != null;
      case SimulationPackage.ACTIVITY_WORK__ON_SURFACE:
        return onSurface != null;
      case SimulationPackage.ACTIVITY_WORK__SCHEDULING_FEEDBACK:
        return schedulingFeedback != null && !schedulingFeedback.isEmpty();
      case SimulationPackage.ACTIVITY_WORK__DURATION:
        return duration != DURATION_EDEFAULT;
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
    result.append(" (duration: ");
    result.append(duration);
    result.append(')');
    return result.toString();
  }

} //ActivityWorkImpl
