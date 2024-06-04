/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.simulation.SimulationPackage
 * @generated
 */
public interface SimulationFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	SimulationFactory eINSTANCE = org.gemoc.agro.simulation.impl.SimulationFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Schedule</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule</em>'.
   * @generated
   */
	Schedule createSchedule();

	/**
   * Returns a new object of class '<em>Activity Work</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Work</em>'.
   * @generated
   */
	ActivityWork createActivityWork();

	/**
   * Returns a new object of class '<em>Day</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Day</em>'.
   * @generated
   */
	Day createDay();

	/**
   * Returns a new object of class '<em>Climate Data</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Climate Data</em>'.
   * @generated
   */
	ClimateData createClimateData();

	/**
   * Returns a new object of class '<em>Scheduling Feedback</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheduling Feedback</em>'.
   * @generated
   */
	SchedulingFeedback createSchedulingFeedback();

	/**
   * Returns a new object of class '<em>Resource Allocation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Allocation</em>'.
   * @generated
   */
	ResourceAllocation createResourceAllocation();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	SimulationPackage getSimulationPackage();

} //SimulationFactory
