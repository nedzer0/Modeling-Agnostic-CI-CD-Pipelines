/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Climate Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.ClimateData#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ClimateData#getDays <em>Days</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ClimateData#getStart <em>Start</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ClimateData#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getClimateData()
 * @model
 * @generated
 */
public interface ClimateData extends EObject {
	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.gemoc.agro.simulation.SimulationPackage#getClimateData_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ClimateData#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Days</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.agro.simulation.Day}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Days</em>' containment reference list.
   * @see org.gemoc.agro.simulation.SimulationPackage#getClimateData_Days()
   * @model containment="true" required="true"
   * @generated
   */
	EList<Day> getDays();

  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(String)
   * @see org.gemoc.agro.simulation.SimulationPackage#getClimateData_Start()
   * @model
   * @generated
   */
  String getStart();

  /**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ClimateData#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(String value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see org.gemoc.agro.simulation.SimulationPackage#getClimateData_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ClimateData#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

} // ClimateData
