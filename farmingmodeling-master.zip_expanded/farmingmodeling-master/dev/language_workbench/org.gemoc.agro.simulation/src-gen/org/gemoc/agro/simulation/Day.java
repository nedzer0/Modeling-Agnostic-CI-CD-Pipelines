/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.agro.activitiesDSL.Month;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.Day#getYear <em>Year</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Day#getMonth <em>Month</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Day#getDay <em>Day</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Day#getRain <em>Rain</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Day#getRay <em>Ray</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Day#getETp <em>ETp</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Day#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getDay()
 * @model
 * @generated
 */

public interface Day extends EObject {
	/**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(int)
   * @see org.gemoc.agro.simulation.SimulationPackage#getDay_Year()
   * @model
   * @generated
   */
  int getYear();

  /**
   * Sets the value of the '{@link org.gemoc.agro.simulation.Day#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(int value);

  /**
   * Returns the value of the '<em><b>Month</b></em>' attribute.
   * The literals are from the enumeration {@link org.gemoc.agro.activitiesDSL.Month}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Month</em>' attribute.
   * @see org.gemoc.agro.activitiesDSL.Month
   * @see #setMonth(Month)
   * @see org.gemoc.agro.simulation.SimulationPackage#getDay_Month()
   * @model
   * @generated
   */
	Month getMonth();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.Day#getMonth <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Month</em>' attribute.
   * @see org.gemoc.agro.activitiesDSL.Month
   * @see #getMonth()
   * @generated
   */
	void setMonth(Month value);

	/**
   * Returns the value of the '<em><b>Day</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Day</em>' attribute.
   * @see #setDay(int)
   * @see org.gemoc.agro.simulation.SimulationPackage#getDay_Day()
   * @model default="1"
   * @generated
   */
	int getDay();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.Day#getDay <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Day</em>' attribute.
   * @see #getDay()
   * @generated
   */
	void setDay(int value);

	/**
   * Returns the value of the '<em><b>Rain</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Rain</em>' attribute.
   * @see #setRain(float)
   * @see org.gemoc.agro.simulation.SimulationPackage#getDay_Rain()
   * @model
   * @generated
   */
	float getRain();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.Day#getRain <em>Rain</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rain</em>' attribute.
   * @see #getRain()
   * @generated
   */
	void setRain(float value);

	/**
   * Returns the value of the '<em><b>Ray</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ray</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ray</em>' attribute.
   * @see #setRay(float)
   * @see org.gemoc.agro.simulation.SimulationPackage#getDay_Ray()
   * @model
   * @generated
   */
	float getRay();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.Day#getRay <em>Ray</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ray</em>' attribute.
   * @see #getRay()
   * @generated
   */
	void setRay(float value);

	/**
   * Returns the value of the '<em><b>ETp</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ETp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>ETp</em>' attribute.
   * @see #setETp(int)
   * @see org.gemoc.agro.simulation.SimulationPackage#getDay_ETp()
   * @model
   * @generated
   */
	int getETp();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.Day#getETp <em>ETp</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>ETp</em>' attribute.
   * @see #getETp()
   * @generated
   */
	void setETp(int value);

	/**
   * Returns the value of the '<em><b>Temperature</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Temperature</em>' attribute.
   * @see #setTemperature(float)
   * @see org.gemoc.agro.simulation.SimulationPackage#getDay_Temperature()
   * @model
   * @generated
   */
	float getTemperature();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.Day#getTemperature <em>Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temperature</em>' attribute.
   * @see #getTemperature()
   * @generated
   */
	void setTemperature(float value);

} // Day
