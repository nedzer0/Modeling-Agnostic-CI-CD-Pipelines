/**
 */
package org.gemoc.agro.simulation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.exploitation.ExploitationPackage;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.ClimateData;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.FeedbackLevel;
import org.gemoc.agro.simulation.ResourceAllocation;
import org.gemoc.agro.simulation.Schedule;
import org.gemoc.agro.simulation.SchedulingFeedback;
import org.gemoc.agro.simulation.SimulationFactory;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationPackageImpl extends EPackageImpl implements SimulationPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass scheduleEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass activityWorkEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass dayEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass climateDataEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass schedulingFeedbackEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass resourceAllocationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum feedbackLevelEEnum = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.gemoc.agro.simulation.SimulationPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private SimulationPackageImpl() {
    super(eNS_URI, SimulationFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SimulationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static SimulationPackage init() {
    if (isInited) return (SimulationPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationPackage.eNS_URI);

    // Obtain or create and register package
    SimulationPackageImpl theSimulationPackage = (SimulationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulationPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ExploitationPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSimulationPackage.createPackageContents();

    // Initialize created meta-data
    theSimulationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimulationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimulationPackage.eNS_URI, theSimulationPackage);
    return theSimulationPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSchedule() {
    return scheduleEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSchedule_Exploitation() {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSchedule_WorkToDo() {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSchedule_ClimateData() {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSchedule_SolverSearchSecondsSpentLimit() {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSchedule_Allocations() {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSchedule_CurrentDay() {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSchedule_HardScore() {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(6);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSchedule_SoftScore() {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(7);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchedule_Solutions() {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getActivityWork() {
    return activityWorkEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getActivityWork_Activity() {
    return (EReference)activityWorkEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getActivityWork_ScheduledOn() {
    return (EReference)activityWorkEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getActivityWork_OnSurface() {
    return (EReference)activityWorkEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getActivityWork_SchedulingFeedback() {
    return (EReference)activityWorkEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivityWork_Duration() {
    return (EAttribute)activityWorkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDay() {
    return dayEClass;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDay_Year() {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDay_Month() {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDay_Day() {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDay_Rain() {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDay_Ray() {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDay_ETp() {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDay_Temperature() {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(6);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClimateData() {
    return climateDataEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getClimateData_Name() {
    return (EAttribute)climateDataEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getClimateData_Days() {
    return (EReference)climateDataEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClimateData_Start() {
    return (EAttribute)climateDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClimateData_End() {
    return (EAttribute)climateDataEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSchedulingFeedback() {
    return schedulingFeedbackEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSchedulingFeedback_Level() {
    return (EAttribute)schedulingFeedbackEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSchedulingFeedback_Message() {
    return (EAttribute)schedulingFeedbackEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getResourceAllocation() {
    return resourceAllocationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getResourceAllocation_Work() {
    return (EReference)resourceAllocationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getResourceAllocation_Resource() {
    return (EReference)resourceAllocationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getResourceAllocation_Kind() {
    return (EReference)resourceAllocationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getFeedbackLevel() {
    return feedbackLevelEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SimulationFactory getSimulationFactory() {
    return (SimulationFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    scheduleEClass = createEClass(SCHEDULE);
    createEReference(scheduleEClass, SCHEDULE__EXPLOITATION);
    createEReference(scheduleEClass, SCHEDULE__WORK_TO_DO);
    createEReference(scheduleEClass, SCHEDULE__CLIMATE_DATA);
    createEAttribute(scheduleEClass, SCHEDULE__SOLVER_SEARCH_SECONDS_SPENT_LIMIT);
    createEReference(scheduleEClass, SCHEDULE__ALLOCATIONS);
    createEReference(scheduleEClass, SCHEDULE__CURRENT_DAY);
    createEAttribute(scheduleEClass, SCHEDULE__HARD_SCORE);
    createEAttribute(scheduleEClass, SCHEDULE__SOFT_SCORE);
    createEAttribute(scheduleEClass, SCHEDULE__SOLUTIONS);

    activityWorkEClass = createEClass(ACTIVITY_WORK);
    createEReference(activityWorkEClass, ACTIVITY_WORK__ACTIVITY);
    createEReference(activityWorkEClass, ACTIVITY_WORK__SCHEDULED_ON);
    createEReference(activityWorkEClass, ACTIVITY_WORK__ON_SURFACE);
    createEReference(activityWorkEClass, ACTIVITY_WORK__SCHEDULING_FEEDBACK);
    createEAttribute(activityWorkEClass, ACTIVITY_WORK__DURATION);

    dayEClass = createEClass(DAY);
    createEAttribute(dayEClass, DAY__YEAR);
    createEAttribute(dayEClass, DAY__MONTH);
    createEAttribute(dayEClass, DAY__DAY);
    createEAttribute(dayEClass, DAY__RAIN);
    createEAttribute(dayEClass, DAY__RAY);
    createEAttribute(dayEClass, DAY__ETP);
    createEAttribute(dayEClass, DAY__TEMPERATURE);

    climateDataEClass = createEClass(CLIMATE_DATA);
    createEAttribute(climateDataEClass, CLIMATE_DATA__NAME);
    createEReference(climateDataEClass, CLIMATE_DATA__DAYS);
    createEAttribute(climateDataEClass, CLIMATE_DATA__START);
    createEAttribute(climateDataEClass, CLIMATE_DATA__END);

    schedulingFeedbackEClass = createEClass(SCHEDULING_FEEDBACK);
    createEAttribute(schedulingFeedbackEClass, SCHEDULING_FEEDBACK__LEVEL);
    createEAttribute(schedulingFeedbackEClass, SCHEDULING_FEEDBACK__MESSAGE);

    resourceAllocationEClass = createEClass(RESOURCE_ALLOCATION);
    createEReference(resourceAllocationEClass, RESOURCE_ALLOCATION__WORK);
    createEReference(resourceAllocationEClass, RESOURCE_ALLOCATION__RESOURCE);
    createEReference(resourceAllocationEClass, RESOURCE_ALLOCATION__KIND);

    // Create enums
    feedbackLevelEEnum = createEEnum(FEEDBACK_LEVEL);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ExploitationPackage theExploitationPackage = (ExploitationPackage)EPackage.Registry.INSTANCE.getEPackage(ExploitationPackage.eNS_URI);
    ActivitiesDSLPackage theActivitiesDSLPackage = (ActivitiesDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesDSLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchedule_Exploitation(), theExploitationPackage.getExploitation(), null, "exploitation", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchedule_WorkToDo(), this.getActivityWork(), null, "workToDo", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchedule_ClimateData(), this.getClimateData(), null, "climateData", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_SolverSearchSecondsSpentLimit(), ecorePackage.getEInt(), "solverSearchSecondsSpentLimit", "5", 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchedule_Allocations(), this.getResourceAllocation(), null, "allocations", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchedule_CurrentDay(), this.getDay(), null, "currentDay", null, 0, 1, Schedule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_HardScore(), ecorePackage.getEInt(), "hardScore", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_SoftScore(), ecorePackage.getEInt(), "softScore", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_Solutions(), ecorePackage.getEInt(), "solutions", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityWorkEClass, ActivityWork.class, "ActivityWork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityWork_Activity(), theActivitiesDSLPackage.getExploitationActivity(), null, "activity", null, 1, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityWork_ScheduledOn(), this.getDay(), null, "scheduledOn", null, 0, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityWork_OnSurface(), theExploitationPackage.getSurface(), null, "onSurface", null, 0, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityWork_SchedulingFeedback(), this.getSchedulingFeedback(), null, "schedulingFeedback", null, 0, -1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivityWork_Duration(), ecorePackage.getEInt(), "duration", "1", 0, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dayEClass, Day.class, "Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDay_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDay_Month(), theActivitiesDSLPackage.getMonth(), "month", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDay_Day(), ecorePackage.getEInt(), "day", "1", 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDay_Rain(), ecorePackage.getEFloat(), "rain", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDay_Ray(), ecorePackage.getEFloat(), "ray", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDay_ETp(), ecorePackage.getEInt(), "ETp", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDay_Temperature(), ecorePackage.getEFloat(), "temperature", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(climateDataEClass, ClimateData.class, "ClimateData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClimateData_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClimateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClimateData_Days(), this.getDay(), null, "days", null, 1, -1, ClimateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClimateData_Start(), ecorePackage.getEString(), "start", null, 0, 1, ClimateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClimateData_End(), ecorePackage.getEString(), "end", null, 0, 1, ClimateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schedulingFeedbackEClass, SchedulingFeedback.class, "SchedulingFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchedulingFeedback_Level(), this.getFeedbackLevel(), "level", "info", 1, 1, SchedulingFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedulingFeedback_Message(), ecorePackage.getEString(), "message", null, 0, 1, SchedulingFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceAllocationEClass, ResourceAllocation.class, "ResourceAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceAllocation_Work(), this.getActivityWork(), null, "work", null, 1, 1, ResourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAllocation_Resource(), theExploitationPackage.getResource(), null, "resource", null, 1, 1, ResourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAllocation_Kind(), theActivitiesDSLPackage.getResourceKind(), null, "kind", null, 1, 1, ResourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(feedbackLevelEEnum, FeedbackLevel.class, "FeedbackLevel");
    addEEnumLiteral(feedbackLevelEEnum, FeedbackLevel.INFO);
    addEEnumLiteral(feedbackLevelEEnum, FeedbackLevel.WARNING);
    addEEnumLiteral(feedbackLevelEEnum, FeedbackLevel.ERROR);

    // Create resource
    createResource(eNS_URI);
  }

} //SimulationPackageImpl
