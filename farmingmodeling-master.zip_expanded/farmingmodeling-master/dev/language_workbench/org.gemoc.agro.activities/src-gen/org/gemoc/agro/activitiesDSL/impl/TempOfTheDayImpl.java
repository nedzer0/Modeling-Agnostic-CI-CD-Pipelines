/**
 */
package org.gemoc.agro.activitiesDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.Comp;
import org.gemoc.agro.activitiesDSL.TempOfTheDay;
import org.gemoc.agro.activitiesDSL.TempUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temp Of The Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.TempOfTheDayImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.TempOfTheDayImpl#getLowerTempBound <em>Lower Temp Bound</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.TempOfTheDayImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TempOfTheDayImpl extends PredicateImpl implements TempOfTheDay
{
  /**
	 * The default value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
  protected static final Comp COMPARISON_EDEFAULT = Comp.MORE_THAN;

  /**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
  protected Comp comparison = COMPARISON_EDEFAULT;

  /**
	 * The default value of the '{@link #getLowerTempBound() <em>Lower Temp Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLowerTempBound()
	 * @generated
	 * @ordered
	 */
  protected static final int LOWER_TEMP_BOUND_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getLowerTempBound() <em>Lower Temp Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLowerTempBound()
	 * @generated
	 * @ordered
	 */
  protected int lowerTempBound = LOWER_TEMP_BOUND_EDEFAULT;

  /**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
  protected static final TempUnit UNIT_EDEFAULT = TempUnit.CELSIUS;

  /**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
  protected TempUnit unit = UNIT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TempOfTheDayImpl()
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
		return ActivitiesDSLPackage.Literals.TEMP_OF_THE_DAY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Comp getComparison()
  {
		return comparison;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setComparison(Comp newComparison)
  {
		Comp oldComparison = comparison;
		comparison = newComparison == null ? COMPARISON_EDEFAULT : newComparison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.TEMP_OF_THE_DAY__COMPARISON, oldComparison, comparison));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getLowerTempBound()
  {
		return lowerTempBound;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLowerTempBound(int newLowerTempBound)
  {
		int oldLowerTempBound = lowerTempBound;
		lowerTempBound = newLowerTempBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.TEMP_OF_THE_DAY__LOWER_TEMP_BOUND, oldLowerTempBound, lowerTempBound));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TempUnit getUnit()
  {
		return unit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUnit(TempUnit newUnit)
  {
		TempUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.TEMP_OF_THE_DAY__UNIT, oldUnit, unit));
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
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__COMPARISON:
				return getComparison();
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__LOWER_TEMP_BOUND:
				return getLowerTempBound();
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__UNIT:
				return getUnit();
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
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__COMPARISON:
				setComparison((Comp)newValue);
				return;
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__LOWER_TEMP_BOUND:
				setLowerTempBound((Integer)newValue);
				return;
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__UNIT:
				setUnit((TempUnit)newValue);
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
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__COMPARISON:
				setComparison(COMPARISON_EDEFAULT);
				return;
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__LOWER_TEMP_BOUND:
				setLowerTempBound(LOWER_TEMP_BOUND_EDEFAULT);
				return;
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__COMPARISON:
				return comparison != COMPARISON_EDEFAULT;
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__LOWER_TEMP_BOUND:
				return lowerTempBound != LOWER_TEMP_BOUND_EDEFAULT;
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY__UNIT:
				return unit != UNIT_EDEFAULT;
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
		result.append(" (comparison: ");
		result.append(comparison);
		result.append(", lowerTempBound: ");
		result.append(lowerTempBound);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //TempOfTheDayImpl
