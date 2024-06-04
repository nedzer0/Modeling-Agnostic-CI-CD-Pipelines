/**
 */
package org.gemoc.agro.simulation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.agro.simulation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.simulation.SimulationPackage
 * @generated
 */
public class SimulationSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SimulationPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SimulationSwitch() {
    if (modelPackage == null) {
      modelPackage = SimulationPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case SimulationPackage.SCHEDULE: {
        Schedule schedule = (Schedule)theEObject;
        T result = caseSchedule(schedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulationPackage.ACTIVITY_WORK: {
        ActivityWork activityWork = (ActivityWork)theEObject;
        T result = caseActivityWork(activityWork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulationPackage.DAY: {
        Day day = (Day)theEObject;
        T result = caseDay(day);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulationPackage.CLIMATE_DATA: {
        ClimateData climateData = (ClimateData)theEObject;
        T result = caseClimateData(climateData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulationPackage.SCHEDULING_FEEDBACK: {
        SchedulingFeedback schedulingFeedback = (SchedulingFeedback)theEObject;
        T result = caseSchedulingFeedback(schedulingFeedback);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimulationPackage.RESOURCE_ALLOCATION: {
        ResourceAllocation resourceAllocation = (ResourceAllocation)theEObject;
        T result = caseResourceAllocation(resourceAllocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSchedule(Schedule object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Activity Work</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Work</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseActivityWork(ActivityWork object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Day</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDay(Day object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Climate Data</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Climate Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClimateData(ClimateData object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scheduling Feedback</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheduling Feedback</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSchedulingFeedback(SchedulingFeedback object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Resource Allocation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Allocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResourceAllocation(ResourceAllocation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //SimulationSwitch
