/**
 */
package org.gemoc.agro.simulation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.agro.simulation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationFactoryImpl extends EFactoryImpl implements SimulationFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SimulationFactory init() {
    try {
      SimulationFactory theSimulationFactory = (SimulationFactory)EPackage.Registry.INSTANCE.getEFactory(SimulationPackage.eNS_URI);
      if (theSimulationFactory != null) {
        return theSimulationFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimulationFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SimulationFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case SimulationPackage.SCHEDULE: return createSchedule();
      case SimulationPackage.ACTIVITY_WORK: return createActivityWork();
      case SimulationPackage.DAY: return createDay();
      case SimulationPackage.CLIMATE_DATA: return createClimateData();
      case SimulationPackage.SCHEDULING_FEEDBACK: return createSchedulingFeedback();
      case SimulationPackage.RESOURCE_ALLOCATION: return createResourceAllocation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case SimulationPackage.FEEDBACK_LEVEL:
        return createFeedbackLevelFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case SimulationPackage.FEEDBACK_LEVEL:
        return convertFeedbackLevelToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Schedule createSchedule() {
    ScheduleImpl schedule = new ScheduleImpl();
    return schedule;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ActivityWork createActivityWork() {
    ActivityWorkImpl activityWork = new ActivityWorkImpl();
    return activityWork;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Day createDay() {
    DayImpl day = new DayImpl();
    return day;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClimateData createClimateData() {
    ClimateDataImpl climateData = new ClimateDataImpl();
    return climateData;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SchedulingFeedback createSchedulingFeedback() {
    SchedulingFeedbackImpl schedulingFeedback = new SchedulingFeedbackImpl();
    return schedulingFeedback;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResourceAllocation createResourceAllocation() {
    ResourceAllocationImpl resourceAllocation = new ResourceAllocationImpl();
    return resourceAllocation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeedbackLevel createFeedbackLevelFromString(EDataType eDataType, String initialValue) {
    FeedbackLevel result = FeedbackLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFeedbackLevelToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SimulationPackage getSimulationPackage() {
    return (SimulationPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static SimulationPackage getPackage() {
    return SimulationPackage.eINSTANCE;
  }

} //SimulationFactoryImpl
