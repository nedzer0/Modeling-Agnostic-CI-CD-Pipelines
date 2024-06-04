/**
 */
package org.gemoc.agro.simulation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.agro.activitiesDSL.Month;

import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.impl.DayImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.DayImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.DayImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.DayImpl#getRain <em>Rain</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.DayImpl#getRay <em>Ray</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.DayImpl#getETp <em>ETp</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.DayImpl#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayImpl extends MinimalEObjectImpl.Container implements Day {
	/**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final int YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected int year = YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
	protected static final Month MONTH_EDEFAULT = Month.JAN;

	/**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
	protected Month month = MONTH_EDEFAULT;

	/**
   * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
	protected static final int DAY_EDEFAULT = 1;

	/**
   * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
	protected int day = DAY_EDEFAULT;

	/**
   * The default value of the '{@link #getRain() <em>Rain</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRain()
   * @generated
   * @ordered
   */
	protected static final float RAIN_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getRain() <em>Rain</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRain()
   * @generated
   * @ordered
   */
	protected float rain = RAIN_EDEFAULT;

	/**
   * The default value of the '{@link #getRay() <em>Ray</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRay()
   * @generated
   * @ordered
   */
	protected static final float RAY_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getRay() <em>Ray</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRay()
   * @generated
   * @ordered
   */
	protected float ray = RAY_EDEFAULT;

	/**
   * The default value of the '{@link #getETp() <em>ETp</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getETp()
   * @generated
   * @ordered
   */
	protected static final int ETP_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getETp() <em>ETp</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getETp()
   * @generated
   * @ordered
   */
	protected int eTp = ETP_EDEFAULT;

	/**
   * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTemperature()
   * @generated
   * @ordered
   */
	protected static final float TEMPERATURE_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTemperature()
   * @generated
   * @ordered
   */
	protected float temperature = TEMPERATURE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DayImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SimulationPackage.Literals.DAY;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYear() {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(int newYear) {
    int oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DAY__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Month getMonth() {
    return month;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMonth(Month newMonth) {
    Month oldMonth = month;
    month = newMonth == null ? MONTH_EDEFAULT : newMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DAY__MONTH, oldMonth, month));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getDay() {
    return day;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDay(int newDay) {
    int oldDay = day;
    day = newDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DAY__DAY, oldDay, day));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getRain() {
    return rain;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRain(float newRain) {
    float oldRain = rain;
    rain = newRain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DAY__RAIN, oldRain, rain));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getRay() {
    return ray;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRay(float newRay) {
    float oldRay = ray;
    ray = newRay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DAY__RAY, oldRay, ray));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getETp() {
    return eTp;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setETp(int newETp) {
    int oldETp = eTp;
    eTp = newETp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DAY__ETP, oldETp, eTp));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getTemperature() {
    return temperature;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTemperature(float newTemperature) {
    float oldTemperature = temperature;
    temperature = newTemperature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DAY__TEMPERATURE, oldTemperature, temperature));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SimulationPackage.DAY__YEAR:
        return getYear();
      case SimulationPackage.DAY__MONTH:
        return getMonth();
      case SimulationPackage.DAY__DAY:
        return getDay();
      case SimulationPackage.DAY__RAIN:
        return getRain();
      case SimulationPackage.DAY__RAY:
        return getRay();
      case SimulationPackage.DAY__ETP:
        return getETp();
      case SimulationPackage.DAY__TEMPERATURE:
        return getTemperature();
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
      case SimulationPackage.DAY__YEAR:
        setYear((Integer)newValue);
        return;
      case SimulationPackage.DAY__MONTH:
        setMonth((Month)newValue);
        return;
      case SimulationPackage.DAY__DAY:
        setDay((Integer)newValue);
        return;
      case SimulationPackage.DAY__RAIN:
        setRain((Float)newValue);
        return;
      case SimulationPackage.DAY__RAY:
        setRay((Float)newValue);
        return;
      case SimulationPackage.DAY__ETP:
        setETp((Integer)newValue);
        return;
      case SimulationPackage.DAY__TEMPERATURE:
        setTemperature((Float)newValue);
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
      case SimulationPackage.DAY__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case SimulationPackage.DAY__MONTH:
        setMonth(MONTH_EDEFAULT);
        return;
      case SimulationPackage.DAY__DAY:
        setDay(DAY_EDEFAULT);
        return;
      case SimulationPackage.DAY__RAIN:
        setRain(RAIN_EDEFAULT);
        return;
      case SimulationPackage.DAY__RAY:
        setRay(RAY_EDEFAULT);
        return;
      case SimulationPackage.DAY__ETP:
        setETp(ETP_EDEFAULT);
        return;
      case SimulationPackage.DAY__TEMPERATURE:
        setTemperature(TEMPERATURE_EDEFAULT);
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
      case SimulationPackage.DAY__YEAR:
        return year != YEAR_EDEFAULT;
      case SimulationPackage.DAY__MONTH:
        return month != MONTH_EDEFAULT;
      case SimulationPackage.DAY__DAY:
        return day != DAY_EDEFAULT;
      case SimulationPackage.DAY__RAIN:
        return rain != RAIN_EDEFAULT;
      case SimulationPackage.DAY__RAY:
        return ray != RAY_EDEFAULT;
      case SimulationPackage.DAY__ETP:
        return eTp != ETP_EDEFAULT;
      case SimulationPackage.DAY__TEMPERATURE:
        return temperature != TEMPERATURE_EDEFAULT;
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
    result.append(" (year: ");
    result.append(year);
    result.append(", month: ");
    result.append(month);
    result.append(", day: ");
    result.append(day);
    result.append(", rain: ");
    result.append(rain);
    result.append(", ray: ");
    result.append(ray);
    result.append(", ETp: ");
    result.append(eTp);
    result.append(", temperature: ");
    result.append(temperature);
    result.append(')');
    return result.toString();
  }

} //DayImpl
