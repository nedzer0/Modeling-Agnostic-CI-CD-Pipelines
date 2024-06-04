/**
 */
package org.gemoc.agro.activitiesDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.DelaySinceActivy;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Since Activy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.DelaySinceActivyImpl#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.DelaySinceActivyImpl#getDays <em>Days</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelaySinceActivyImpl extends PredicateImpl implements DelaySinceActivy
{
  /**
	 * The cached value of the '{@link #getPrerequisite() <em>Prerequisite</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPrerequisite()
	 * @generated
	 * @ordered
	 */
  protected ExploitationActivity prerequisite;

  /**
	 * The default value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
  protected static final int DAYS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
  protected int days = DAYS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DelaySinceActivyImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ActivitiesDSLPackage.Literals.DELAY_SINCE_ACTIVY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExploitationActivity getPrerequisite()
  {
		if (prerequisite != null && prerequisite.eIsProxy()) {
			InternalEObject oldPrerequisite = (InternalEObject)prerequisite;
			prerequisite = (ExploitationActivity)eResolveProxy(oldPrerequisite);
			if (prerequisite != oldPrerequisite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__PREREQUISITE, oldPrerequisite, prerequisite));
			}
		}
		return prerequisite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExploitationActivity basicGetPrerequisite()
  {
		return prerequisite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPrerequisite(ExploitationActivity newPrerequisite)
  {
		ExploitationActivity oldPrerequisite = prerequisite;
		prerequisite = newPrerequisite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__PREREQUISITE, oldPrerequisite, prerequisite));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getDays()
  {
		return days;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDays(int newDays)
  {
		int oldDays = days;
		days = newDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__DAYS, oldDays, days));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__PREREQUISITE:
				if (resolve) return getPrerequisite();
				return basicGetPrerequisite();
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__DAYS:
				return getDays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__PREREQUISITE:
				setPrerequisite((ExploitationActivity)newValue);
				return;
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__DAYS:
				setDays((Integer)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__PREREQUISITE:
				setPrerequisite((ExploitationActivity)null);
				return;
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__DAYS:
				setDays(DAYS_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__PREREQUISITE:
				return prerequisite != null;
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY__DAYS:
				return days != DAYS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (days: ");
		result.append(days);
		result.append(')');
		return result.toString();
	}

} //DelaySinceActivyImpl
