/**
 */
package org.gemoc.agro.activitiesDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temp Of The Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getLowerTempBound <em>Lower Temp Bound</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getTempOfTheDay()
 * @model
 * @generated
 */
public interface TempOfTheDay extends Predicate
{
  /**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.agro.activitiesDSL.Comp}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparison</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see org.gemoc.agro.activitiesDSL.Comp
	 * @see #setComparison(Comp)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getTempOfTheDay_Comparison()
	 * @model
	 * @generated
	 */
  Comp getComparison();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see org.gemoc.agro.activitiesDSL.Comp
	 * @see #getComparison()
	 * @generated
	 */
  void setComparison(Comp value);

  /**
	 * Returns the value of the '<em><b>Lower Temp Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Temp Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Temp Bound</em>' attribute.
	 * @see #setLowerTempBound(int)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getTempOfTheDay_LowerTempBound()
	 * @model
	 * @generated
	 */
  int getLowerTempBound();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getLowerTempBound <em>Lower Temp Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Temp Bound</em>' attribute.
	 * @see #getLowerTempBound()
	 * @generated
	 */
  void setLowerTempBound(int value);

  /**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.agro.activitiesDSL.TempUnit}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.gemoc.agro.activitiesDSL.TempUnit
	 * @see #setUnit(TempUnit)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getTempOfTheDay_Unit()
	 * @model
	 * @generated
	 */
  TempUnit getUnit();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.gemoc.agro.activitiesDSL.TempUnit
	 * @see #getUnit()
	 * @generated
	 */
  void setUnit(TempUnit value);

} // TempOfTheDay
