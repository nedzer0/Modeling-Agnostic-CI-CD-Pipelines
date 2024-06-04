/**
 */
package org.gemoc.agro.activitiesDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.NoRain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Rain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.NoRainImpl#getDays <em>Days</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoRainImpl extends PredicateImpl implements NoRain
{
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
  protected NoRainImpl()
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
		return ActivitiesDSLPackage.Literals.NO_RAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.NO_RAIN__DAYS, oldDays, days));
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
			case ActivitiesDSLPackage.NO_RAIN__DAYS:
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
			case ActivitiesDSLPackage.NO_RAIN__DAYS:
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
			case ActivitiesDSLPackage.NO_RAIN__DAYS:
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
			case ActivitiesDSLPackage.NO_RAIN__DAYS:
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

} //NoRainImpl
