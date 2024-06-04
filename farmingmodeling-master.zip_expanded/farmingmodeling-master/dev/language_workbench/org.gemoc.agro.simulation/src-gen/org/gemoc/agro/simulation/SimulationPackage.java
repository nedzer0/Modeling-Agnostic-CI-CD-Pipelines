/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.simulation.SimulationFactory
 * @model kind="package"
 * @generated
 */
public interface SimulationPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "simulation";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.gemoc.org/agro/simulation";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "simulation";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	SimulationPackage eINSTANCE = org.gemoc.agro.simulation.impl.SimulationPackageImpl.init();

	/**
   * The meta object id for the '{@link org.gemoc.agro.simulation.impl.ScheduleImpl <em>Schedule</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.gemoc.agro.simulation.impl.ScheduleImpl
   * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedule()
   * @generated
   */
	int SCHEDULE = 0;

	/**
   * The feature id for the '<em><b>Exploitation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__EXPLOITATION = 0;

	/**
   * The feature id for the '<em><b>Work To Do</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__WORK_TO_DO = 1;

	/**
   * The feature id for the '<em><b>Climate Data</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__CLIMATE_DATA = 2;

	/**
   * The feature id for the '<em><b>Solver Search Seconds Spent Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__SOLVER_SEARCH_SECONDS_SPENT_LIMIT = 3;

	/**
   * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__ALLOCATIONS = 4;

	/**
   * The feature id for the '<em><b>Current Day</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__CURRENT_DAY = 5;

	/**
   * The feature id for the '<em><b>Hard Score</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__HARD_SCORE = 6;

	/**
   * The feature id for the '<em><b>Soft Score</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE__SOFT_SCORE = 7;

	/**
   * The feature id for the '<em><b>Solutions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__SOLUTIONS = 8;

  /**
   * The number of structural features of the '<em>Schedule</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE_FEATURE_COUNT = 9;

	/**
   * The number of operations of the '<em>Schedule</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl <em>Activity Work</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.gemoc.agro.simulation.impl.ActivityWorkImpl
   * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getActivityWork()
   * @generated
   */
	int ACTIVITY_WORK = 1;

	/**
   * The feature id for the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ACTIVITY_WORK__ACTIVITY = 0;

	/**
   * The feature id for the '<em><b>Scheduled On</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ACTIVITY_WORK__SCHEDULED_ON = 1;

	/**
   * The feature id for the '<em><b>On Surface</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ACTIVITY_WORK__ON_SURFACE = 2;

	/**
   * The feature id for the '<em><b>Scheduling Feedback</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ACTIVITY_WORK__SCHEDULING_FEEDBACK = 3;

	/**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_WORK__DURATION = 4;

  /**
   * The number of structural features of the '<em>Activity Work</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ACTIVITY_WORK_FEATURE_COUNT = 5;

	/**
   * The number of operations of the '<em>Activity Work</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ACTIVITY_WORK_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link org.gemoc.agro.simulation.impl.DayImpl <em>Day</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.gemoc.agro.simulation.impl.DayImpl
   * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getDay()
   * @generated
   */
	int DAY = 2;

	/**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAY__YEAR = 0;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY__MONTH = 1;

	/**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY__DAY = 2;

	/**
   * The feature id for the '<em><b>Rain</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY__RAIN = 3;

	/**
   * The feature id for the '<em><b>Ray</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY__RAY = 4;

	/**
   * The feature id for the '<em><b>ETp</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY__ETP = 5;

	/**
   * The feature id for the '<em><b>Temperature</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY__TEMPERATURE = 6;

	/**
   * The number of structural features of the '<em>Day</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY_FEATURE_COUNT = 7;

	/**
   * The number of operations of the '<em>Day</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DAY_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link org.gemoc.agro.simulation.impl.ClimateDataImpl <em>Climate Data</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.gemoc.agro.simulation.impl.ClimateDataImpl
   * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getClimateData()
   * @generated
   */
	int CLIMATE_DATA = 3;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLIMATE_DATA__NAME = 0;

	/**
   * The feature id for the '<em><b>Days</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLIMATE_DATA__DAYS = 1;

	/**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIMATE_DATA__START = 2;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIMATE_DATA__END = 3;

  /**
   * The number of structural features of the '<em>Climate Data</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLIMATE_DATA_FEATURE_COUNT = 4;

	/**
   * The number of operations of the '<em>Climate Data</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLIMATE_DATA_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl <em>Scheduling Feedback</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl
   * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedulingFeedback()
   * @generated
   */
	int SCHEDULING_FEEDBACK = 4;

	/**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULING_FEEDBACK__LEVEL = 0;

	/**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULING_FEEDBACK__MESSAGE = 1;

	/**
   * The number of structural features of the '<em>Scheduling Feedback</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULING_FEEDBACK_FEATURE_COUNT = 2;

	/**
   * The number of operations of the '<em>Scheduling Feedback</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCHEDULING_FEEDBACK_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link org.gemoc.agro.simulation.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.gemoc.agro.simulation.impl.ResourceAllocationImpl
   * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getResourceAllocation()
   * @generated
   */
	int RESOURCE_ALLOCATION = 5;

	/**
   * The feature id for the '<em><b>Work</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESOURCE_ALLOCATION__WORK = 0;

	/**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESOURCE_ALLOCATION__RESOURCE = 1;

	/**
   * The feature id for the '<em><b>Kind</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESOURCE_ALLOCATION__KIND = 2;

	/**
   * The number of structural features of the '<em>Resource Allocation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESOURCE_ALLOCATION_FEATURE_COUNT = 3;

	/**
   * The number of operations of the '<em>Resource Allocation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESOURCE_ALLOCATION_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link org.gemoc.agro.simulation.FeedbackLevel <em>Feedback Level</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.gemoc.agro.simulation.FeedbackLevel
   * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getFeedbackLevel()
   * @generated
   */
	int FEEDBACK_LEVEL = 6;


	/**
   * Returns the meta object for class '{@link org.gemoc.agro.simulation.Schedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schedule</em>'.
   * @see org.gemoc.agro.simulation.Schedule
   * @generated
   */
	EClass getSchedule();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.Schedule#getExploitation <em>Exploitation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exploitation</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getExploitation()
   * @see #getSchedule()
   * @generated
   */
	EReference getSchedule_Exploitation();

	/**
   * Returns the meta object for the containment reference list '{@link org.gemoc.agro.simulation.Schedule#getWorkToDo <em>Work To Do</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work To Do</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getWorkToDo()
   * @see #getSchedule()
   * @generated
   */
	EReference getSchedule_WorkToDo();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.Schedule#getClimateData <em>Climate Data</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Climate Data</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getClimateData()
   * @see #getSchedule()
   * @generated
   */
	EReference getSchedule_ClimateData();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Schedule#getSolverSearchSecondsSpentLimit <em>Solver Search Seconds Spent Limit</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Solver Search Seconds Spent Limit</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getSolverSearchSecondsSpentLimit()
   * @see #getSchedule()
   * @generated
   */
	EAttribute getSchedule_SolverSearchSecondsSpentLimit();

	/**
   * Returns the meta object for the containment reference list '{@link org.gemoc.agro.simulation.Schedule#getAllocations <em>Allocations</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Allocations</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getAllocations()
   * @see #getSchedule()
   * @generated
   */
	EReference getSchedule_Allocations();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.Schedule#getCurrentDay <em>Current Day</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Current Day</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getCurrentDay()
   * @see #getSchedule()
   * @generated
   */
	EReference getSchedule_CurrentDay();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Schedule#getHardScore <em>Hard Score</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hard Score</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getHardScore()
   * @see #getSchedule()
   * @generated
   */
	EAttribute getSchedule_HardScore();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Schedule#getSoftScore <em>Soft Score</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Soft Score</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getSoftScore()
   * @see #getSchedule()
   * @generated
   */
	EAttribute getSchedule_SoftScore();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Schedule#getSolutions <em>Solutions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Solutions</em>'.
   * @see org.gemoc.agro.simulation.Schedule#getSolutions()
   * @see #getSchedule()
   * @generated
   */
  EAttribute getSchedule_Solutions();

  /**
   * Returns the meta object for class '{@link org.gemoc.agro.simulation.ActivityWork <em>Activity Work</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Work</em>'.
   * @see org.gemoc.agro.simulation.ActivityWork
   * @generated
   */
	EClass getActivityWork();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ActivityWork#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activity</em>'.
   * @see org.gemoc.agro.simulation.ActivityWork#getActivity()
   * @see #getActivityWork()
   * @generated
   */
	EReference getActivityWork_Activity();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ActivityWork#getScheduledOn <em>Scheduled On</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scheduled On</em>'.
   * @see org.gemoc.agro.simulation.ActivityWork#getScheduledOn()
   * @see #getActivityWork()
   * @generated
   */
	EReference getActivityWork_ScheduledOn();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ActivityWork#getOnSurface <em>On Surface</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>On Surface</em>'.
   * @see org.gemoc.agro.simulation.ActivityWork#getOnSurface()
   * @see #getActivityWork()
   * @generated
   */
	EReference getActivityWork_OnSurface();

	/**
   * Returns the meta object for the containment reference list '{@link org.gemoc.agro.simulation.ActivityWork#getSchedulingFeedback <em>Scheduling Feedback</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scheduling Feedback</em>'.
   * @see org.gemoc.agro.simulation.ActivityWork#getSchedulingFeedback()
   * @see #getActivityWork()
   * @generated
   */
	EReference getActivityWork_SchedulingFeedback();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.ActivityWork#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.gemoc.agro.simulation.ActivityWork#getDuration()
   * @see #getActivityWork()
   * @generated
   */
  EAttribute getActivityWork_Duration();

  /**
   * Returns the meta object for class '{@link org.gemoc.agro.simulation.Day <em>Day</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Day</em>'.
   * @see org.gemoc.agro.simulation.Day
   * @generated
   */
	EClass getDay();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see org.gemoc.agro.simulation.Day#getYear()
   * @see #getDay()
   * @generated
   */
  EAttribute getDay_Year();

  /**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month</em>'.
   * @see org.gemoc.agro.simulation.Day#getMonth()
   * @see #getDay()
   * @generated
   */
	EAttribute getDay_Month();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see org.gemoc.agro.simulation.Day#getDay()
   * @see #getDay()
   * @generated
   */
	EAttribute getDay_Day();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getRain <em>Rain</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rain</em>'.
   * @see org.gemoc.agro.simulation.Day#getRain()
   * @see #getDay()
   * @generated
   */
	EAttribute getDay_Rain();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getRay <em>Ray</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ray</em>'.
   * @see org.gemoc.agro.simulation.Day#getRay()
   * @see #getDay()
   * @generated
   */
	EAttribute getDay_Ray();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getETp <em>ETp</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ETp</em>'.
   * @see org.gemoc.agro.simulation.Day#getETp()
   * @see #getDay()
   * @generated
   */
	EAttribute getDay_ETp();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getTemperature <em>Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temperature</em>'.
   * @see org.gemoc.agro.simulation.Day#getTemperature()
   * @see #getDay()
   * @generated
   */
	EAttribute getDay_Temperature();

	/**
   * Returns the meta object for class '{@link org.gemoc.agro.simulation.ClimateData <em>Climate Data</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Climate Data</em>'.
   * @see org.gemoc.agro.simulation.ClimateData
   * @generated
   */
	EClass getClimateData();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.ClimateData#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.gemoc.agro.simulation.ClimateData#getName()
   * @see #getClimateData()
   * @generated
   */
	EAttribute getClimateData_Name();

	/**
   * Returns the meta object for the containment reference list '{@link org.gemoc.agro.simulation.ClimateData#getDays <em>Days</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Days</em>'.
   * @see org.gemoc.agro.simulation.ClimateData#getDays()
   * @see #getClimateData()
   * @generated
   */
	EReference getClimateData_Days();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.ClimateData#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.gemoc.agro.simulation.ClimateData#getStart()
   * @see #getClimateData()
   * @generated
   */
  EAttribute getClimateData_Start();

  /**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.ClimateData#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.gemoc.agro.simulation.ClimateData#getEnd()
   * @see #getClimateData()
   * @generated
   */
  EAttribute getClimateData_End();

  /**
   * Returns the meta object for class '{@link org.gemoc.agro.simulation.SchedulingFeedback <em>Scheduling Feedback</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheduling Feedback</em>'.
   * @see org.gemoc.agro.simulation.SchedulingFeedback
   * @generated
   */
	EClass getSchedulingFeedback();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.SchedulingFeedback#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see org.gemoc.agro.simulation.SchedulingFeedback#getLevel()
   * @see #getSchedulingFeedback()
   * @generated
   */
	EAttribute getSchedulingFeedback_Level();

	/**
   * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.SchedulingFeedback#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.gemoc.agro.simulation.SchedulingFeedback#getMessage()
   * @see #getSchedulingFeedback()
   * @generated
   */
	EAttribute getSchedulingFeedback_Message();

	/**
   * Returns the meta object for class '{@link org.gemoc.agro.simulation.ResourceAllocation <em>Resource Allocation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Allocation</em>'.
   * @see org.gemoc.agro.simulation.ResourceAllocation
   * @generated
   */
	EClass getResourceAllocation();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ResourceAllocation#getWork <em>Work</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work</em>'.
   * @see org.gemoc.agro.simulation.ResourceAllocation#getWork()
   * @see #getResourceAllocation()
   * @generated
   */
	EReference getResourceAllocation_Work();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ResourceAllocation#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.gemoc.agro.simulation.ResourceAllocation#getResource()
   * @see #getResourceAllocation()
   * @generated
   */
	EReference getResourceAllocation_Resource();

	/**
   * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ResourceAllocation#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Kind</em>'.
   * @see org.gemoc.agro.simulation.ResourceAllocation#getKind()
   * @see #getResourceAllocation()
   * @generated
   */
	EReference getResourceAllocation_Kind();

	/**
   * Returns the meta object for enum '{@link org.gemoc.agro.simulation.FeedbackLevel <em>Feedback Level</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Feedback Level</em>'.
   * @see org.gemoc.agro.simulation.FeedbackLevel
   * @generated
   */
	EEnum getFeedbackLevel();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	SimulationFactory getSimulationFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.ScheduleImpl <em>Schedule</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.gemoc.agro.simulation.impl.ScheduleImpl
     * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedule()
     * @generated
     */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
     * The meta object literal for the '<em><b>Exploitation</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SCHEDULE__EXPLOITATION = eINSTANCE.getSchedule_Exploitation();

		/**
     * The meta object literal for the '<em><b>Work To Do</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SCHEDULE__WORK_TO_DO = eINSTANCE.getSchedule_WorkToDo();

		/**
     * The meta object literal for the '<em><b>Climate Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SCHEDULE__CLIMATE_DATA = eINSTANCE.getSchedule_ClimateData();

		/**
     * The meta object literal for the '<em><b>Solver Search Seconds Spent Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCHEDULE__SOLVER_SEARCH_SECONDS_SPENT_LIMIT = eINSTANCE.getSchedule_SolverSearchSecondsSpentLimit();

		/**
     * The meta object literal for the '<em><b>Allocations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SCHEDULE__ALLOCATIONS = eINSTANCE.getSchedule_Allocations();

		/**
     * The meta object literal for the '<em><b>Current Day</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SCHEDULE__CURRENT_DAY = eINSTANCE.getSchedule_CurrentDay();

		/**
     * The meta object literal for the '<em><b>Hard Score</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCHEDULE__HARD_SCORE = eINSTANCE.getSchedule_HardScore();

		/**
     * The meta object literal for the '<em><b>Soft Score</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCHEDULE__SOFT_SCORE = eINSTANCE.getSchedule_SoftScore();

		/**
     * The meta object literal for the '<em><b>Solutions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEDULE__SOLUTIONS = eINSTANCE.getSchedule_Solutions();

    /**
     * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl <em>Activity Work</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.gemoc.agro.simulation.impl.ActivityWorkImpl
     * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getActivityWork()
     * @generated
     */
		EClass ACTIVITY_WORK = eINSTANCE.getActivityWork();

		/**
     * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ACTIVITY_WORK__ACTIVITY = eINSTANCE.getActivityWork_Activity();

		/**
     * The meta object literal for the '<em><b>Scheduled On</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ACTIVITY_WORK__SCHEDULED_ON = eINSTANCE.getActivityWork_ScheduledOn();

		/**
     * The meta object literal for the '<em><b>On Surface</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ACTIVITY_WORK__ON_SURFACE = eINSTANCE.getActivityWork_OnSurface();

		/**
     * The meta object literal for the '<em><b>Scheduling Feedback</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ACTIVITY_WORK__SCHEDULING_FEEDBACK = eINSTANCE.getActivityWork_SchedulingFeedback();

		/**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY_WORK__DURATION = eINSTANCE.getActivityWork_Duration();

    /**
     * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.DayImpl <em>Day</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.gemoc.agro.simulation.impl.DayImpl
     * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getDay()
     * @generated
     */
		EClass DAY = eINSTANCE.getDay();

		/**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAY__YEAR = eINSTANCE.getDay_Year();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DAY__MONTH = eINSTANCE.getDay_Month();

		/**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DAY__DAY = eINSTANCE.getDay_Day();

		/**
     * The meta object literal for the '<em><b>Rain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DAY__RAIN = eINSTANCE.getDay_Rain();

		/**
     * The meta object literal for the '<em><b>Ray</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DAY__RAY = eINSTANCE.getDay_Ray();

		/**
     * The meta object literal for the '<em><b>ETp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DAY__ETP = eINSTANCE.getDay_ETp();

		/**
     * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DAY__TEMPERATURE = eINSTANCE.getDay_Temperature();

		/**
     * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.ClimateDataImpl <em>Climate Data</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.gemoc.agro.simulation.impl.ClimateDataImpl
     * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getClimateData()
     * @generated
     */
		EClass CLIMATE_DATA = eINSTANCE.getClimateData();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CLIMATE_DATA__NAME = eINSTANCE.getClimateData_Name();

		/**
     * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CLIMATE_DATA__DAYS = eINSTANCE.getClimateData_Days();

		/**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLIMATE_DATA__START = eINSTANCE.getClimateData_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLIMATE_DATA__END = eINSTANCE.getClimateData_End();

    /**
     * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl <em>Scheduling Feedback</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl
     * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedulingFeedback()
     * @generated
     */
		EClass SCHEDULING_FEEDBACK = eINSTANCE.getSchedulingFeedback();

		/**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCHEDULING_FEEDBACK__LEVEL = eINSTANCE.getSchedulingFeedback_Level();

		/**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCHEDULING_FEEDBACK__MESSAGE = eINSTANCE.getSchedulingFeedback_Message();

		/**
     * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.gemoc.agro.simulation.impl.ResourceAllocationImpl
     * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getResourceAllocation()
     * @generated
     */
		EClass RESOURCE_ALLOCATION = eINSTANCE.getResourceAllocation();

		/**
     * The meta object literal for the '<em><b>Work</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RESOURCE_ALLOCATION__WORK = eINSTANCE.getResourceAllocation_Work();

		/**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RESOURCE_ALLOCATION__RESOURCE = eINSTANCE.getResourceAllocation_Resource();

		/**
     * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RESOURCE_ALLOCATION__KIND = eINSTANCE.getResourceAllocation_Kind();

		/**
     * The meta object literal for the '{@link org.gemoc.agro.simulation.FeedbackLevel <em>Feedback Level</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.gemoc.agro.simulation.FeedbackLevel
     * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getFeedbackLevel()
     * @generated
     */
		EEnum FEEDBACK_LEVEL = eINSTANCE.getFeedbackLevel();

	}

} //SimulationPackage
