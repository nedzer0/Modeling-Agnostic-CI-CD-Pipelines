/**
 */
package org.gemoc.agro.activitiesDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.agro.activitiesDSL.ActivitiesDSLFactory;
import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.ActivityResource;
import org.gemoc.agro.activitiesDSL.Comp;
import org.gemoc.agro.activitiesDSL.Culture;
import org.gemoc.agro.activitiesDSL.Date;
import org.gemoc.agro.activitiesDSL.DelaySinceActivy;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.activitiesDSL.Frequency;
import org.gemoc.agro.activitiesDSL.GrainIs;
import org.gemoc.agro.activitiesDSL.Model;
import org.gemoc.agro.activitiesDSL.Month;
import org.gemoc.agro.activitiesDSL.NoRain;
import org.gemoc.agro.activitiesDSL.Predicate;
import org.gemoc.agro.activitiesDSL.ResourceKind;
import org.gemoc.agro.activitiesDSL.TempOfTheDay;
import org.gemoc.agro.activitiesDSL.TempUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesDSLPackageImpl extends EPackageImpl implements ActivitiesDSLPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass modelEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass resourceKindEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cultureEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass exploitationActivityEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass activityResourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass predicateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass noRainEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tempOfTheDayEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass delaySinceActivyEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass grainIsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum monthEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum compEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum tempUnitEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum frequencyEEnum = null;

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
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ActivitiesDSLPackageImpl()
  {
		super(eNS_URI, ActivitiesDSLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitiesDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ActivitiesDSLPackage init()
  {
		if (isInited) return (ActivitiesDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesDSLPackage.eNS_URI);

		// Obtain or create and register package
		ActivitiesDSLPackageImpl theActivitiesDSLPackage = (ActivitiesDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitiesDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitiesDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theActivitiesDSLPackage.createPackageContents();

		// Initialize created meta-data
		theActivitiesDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitiesDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitiesDSLPackage.eNS_URI, theActivitiesDSLPackage);
		return theActivitiesDSLPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getModel()
  {
		return modelEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getModel_Cultures()
  {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getModel_ResourceKinds()
  {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResourceKind()
  {
		return resourceKindEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getResourceKind_Name()
  {
		return (EAttribute)resourceKindEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCulture()
  {
		return cultureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCulture_Name()
  {
		return (EAttribute)cultureEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCulture_Activities()
  {
		return (EReference)cultureEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getExploitationActivity()
  {
		return exploitationActivityEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExploitationActivity_Name()
  {
		return (EAttribute)exploitationActivityEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExploitationActivity_Frequency()
  {
		return (EAttribute)exploitationActivityEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExploitationActivity_StartDate()
  {
		return (EReference)exploitationActivityEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExploitationActivity_EndDate()
  {
		return (EReference)exploitationActivityEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExploitationActivity_Predicates()
  {
		return (EReference)exploitationActivityEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExploitationActivity_Uses()
  {
		return (EReference)exploitationActivityEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getActivityResource()
  {
		return activityResourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getActivityResource_Quantity()
  {
		return (EAttribute)activityResourceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActivityResource_ResourceKind()
  {
		return (EReference)activityResourceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPredicate()
  {
		return predicateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNoRain()
  {
		return noRainEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNoRain_Days()
  {
		return (EAttribute)noRainEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTempOfTheDay()
  {
		return tempOfTheDayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTempOfTheDay_Comparison()
  {
		return (EAttribute)tempOfTheDayEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTempOfTheDay_LowerTempBound()
  {
		return (EAttribute)tempOfTheDayEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTempOfTheDay_Unit()
  {
		return (EAttribute)tempOfTheDayEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDelaySinceActivy()
  {
		return delaySinceActivyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDelaySinceActivy_Prerequisite()
  {
		return (EReference)delaySinceActivyEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDelaySinceActivy_Days()
  {
		return (EAttribute)delaySinceActivyEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGrainIs()
  {
		return grainIsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGrainIs_State()
  {
		return (EAttribute)grainIsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDate()
  {
		return dateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDate_Day()
  {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDate_Month()
  {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getMonth()
  {
		return monthEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getComp()
  {
		return compEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getTempUnit()
  {
		return tempUnitEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getFrequency()
  {
		return frequencyEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActivitiesDSLFactory getActivitiesDSLFactory()
  {
		return (ActivitiesDSLFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CULTURES);
		createEReference(modelEClass, MODEL__RESOURCE_KINDS);

		resourceKindEClass = createEClass(RESOURCE_KIND);
		createEAttribute(resourceKindEClass, RESOURCE_KIND__NAME);

		cultureEClass = createEClass(CULTURE);
		createEAttribute(cultureEClass, CULTURE__NAME);
		createEReference(cultureEClass, CULTURE__ACTIVITIES);

		exploitationActivityEClass = createEClass(EXPLOITATION_ACTIVITY);
		createEAttribute(exploitationActivityEClass, EXPLOITATION_ACTIVITY__NAME);
		createEAttribute(exploitationActivityEClass, EXPLOITATION_ACTIVITY__FREQUENCY);
		createEReference(exploitationActivityEClass, EXPLOITATION_ACTIVITY__START_DATE);
		createEReference(exploitationActivityEClass, EXPLOITATION_ACTIVITY__END_DATE);
		createEReference(exploitationActivityEClass, EXPLOITATION_ACTIVITY__PREDICATES);
		createEReference(exploitationActivityEClass, EXPLOITATION_ACTIVITY__USES);

		activityResourceEClass = createEClass(ACTIVITY_RESOURCE);
		createEAttribute(activityResourceEClass, ACTIVITY_RESOURCE__QUANTITY);
		createEReference(activityResourceEClass, ACTIVITY_RESOURCE__RESOURCE_KIND);

		predicateEClass = createEClass(PREDICATE);

		noRainEClass = createEClass(NO_RAIN);
		createEAttribute(noRainEClass, NO_RAIN__DAYS);

		tempOfTheDayEClass = createEClass(TEMP_OF_THE_DAY);
		createEAttribute(tempOfTheDayEClass, TEMP_OF_THE_DAY__COMPARISON);
		createEAttribute(tempOfTheDayEClass, TEMP_OF_THE_DAY__LOWER_TEMP_BOUND);
		createEAttribute(tempOfTheDayEClass, TEMP_OF_THE_DAY__UNIT);

		delaySinceActivyEClass = createEClass(DELAY_SINCE_ACTIVY);
		createEReference(delaySinceActivyEClass, DELAY_SINCE_ACTIVY__PREREQUISITE);
		createEAttribute(delaySinceActivyEClass, DELAY_SINCE_ACTIVY__DAYS);

		grainIsEClass = createEClass(GRAIN_IS);
		createEAttribute(grainIsEClass, GRAIN_IS__STATE);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__DAY);
		createEAttribute(dateEClass, DATE__MONTH);

		// Create enums
		monthEEnum = createEEnum(MONTH);
		compEEnum = createEEnum(COMP);
		tempUnitEEnum = createEEnum(TEMP_UNIT);
		frequencyEEnum = createEEnum(FREQUENCY);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		noRainEClass.getESuperTypes().add(this.getPredicate());
		tempOfTheDayEClass.getESuperTypes().add(this.getPredicate());
		delaySinceActivyEClass.getESuperTypes().add(this.getPredicate());
		grainIsEClass.getESuperTypes().add(this.getPredicate());

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Cultures(), this.getCulture(), null, "cultures", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModel_Cultures().getEKeys().add(this.getCulture_Name());
		initEReference(getModel_ResourceKinds(), this.getResourceKind(), null, "resourceKinds", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModel_ResourceKinds().getEKeys().add(this.getResourceKind_Name());

		initEClass(resourceKindEClass, ResourceKind.class, "ResourceKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceKind_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cultureEClass, Culture.class, "Culture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCulture_Name(), ecorePackage.getEString(), "name", null, 0, 1, Culture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCulture_Activities(), this.getExploitationActivity(), null, "activities", null, 0, -1, Culture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCulture_Activities().getEKeys().add(this.getExploitationActivity_Name());

		initEClass(exploitationActivityEClass, ExploitationActivity.class, "ExploitationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExploitationActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExploitationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExploitationActivity_Frequency(), this.getFrequency(), "frequency", null, 0, 1, ExploitationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploitationActivity_StartDate(), this.getDate(), null, "startDate", null, 0, 1, ExploitationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploitationActivity_EndDate(), this.getDate(), null, "endDate", null, 0, 1, ExploitationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploitationActivity_Predicates(), this.getPredicate(), null, "predicates", null, 0, -1, ExploitationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploitationActivity_Uses(), this.getActivityResource(), null, "uses", null, 0, -1, ExploitationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityResourceEClass, ActivityResource.class, "ActivityResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityResource_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, ActivityResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityResource_ResourceKind(), this.getResourceKind(), null, "resourceKind", null, 0, 1, ActivityResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noRainEClass, NoRain.class, "NoRain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoRain_Days(), ecorePackage.getEInt(), "days", null, 0, 1, NoRain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tempOfTheDayEClass, TempOfTheDay.class, "TempOfTheDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTempOfTheDay_Comparison(), this.getComp(), "comparison", null, 0, 1, TempOfTheDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTempOfTheDay_LowerTempBound(), ecorePackage.getEInt(), "lowerTempBound", null, 0, 1, TempOfTheDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTempOfTheDay_Unit(), this.getTempUnit(), "unit", null, 0, 1, TempOfTheDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delaySinceActivyEClass, DelaySinceActivy.class, "DelaySinceActivy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelaySinceActivy_Prerequisite(), this.getExploitationActivity(), null, "prerequisite", null, 0, 1, DelaySinceActivy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelaySinceActivy_Days(), ecorePackage.getEInt(), "days", null, 0, 1, DelaySinceActivy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grainIsEClass, GrainIs.class, "GrainIs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrainIs_State(), ecorePackage.getEString(), "state", null, 0, 1, GrainIs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Month(), this.getMonth(), "month", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(monthEEnum, Month.class, "Month");
		addEEnumLiteral(monthEEnum, Month.JAN);
		addEEnumLiteral(monthEEnum, Month.FEB);
		addEEnumLiteral(monthEEnum, Month.MAR);
		addEEnumLiteral(monthEEnum, Month.APR);
		addEEnumLiteral(monthEEnum, Month.MAY);
		addEEnumLiteral(monthEEnum, Month.JUN);
		addEEnumLiteral(monthEEnum, Month.JUL);
		addEEnumLiteral(monthEEnum, Month.AUG);
		addEEnumLiteral(monthEEnum, Month.SEPT);
		addEEnumLiteral(monthEEnum, Month.OCT);
		addEEnumLiteral(monthEEnum, Month.NOV);
		addEEnumLiteral(monthEEnum, Month.DEC);

		initEEnum(compEEnum, Comp.class, "Comp");
		addEEnumLiteral(compEEnum, Comp.MORE_THAN);
		addEEnumLiteral(compEEnum, Comp.LESS_THAN);

		initEEnum(tempUnitEEnum, TempUnit.class, "TempUnit");
		addEEnumLiteral(tempUnitEEnum, TempUnit.CELSIUS);
		addEEnumLiteral(tempUnitEEnum, TempUnit.FARENHEIT);

		initEEnum(frequencyEEnum, Frequency.class, "Frequency");
		addEEnumLiteral(frequencyEEnum, Frequency.ONCE);
		addEEnumLiteral(frequencyEEnum, Frequency.DAILY);
		addEEnumLiteral(frequencyEEnum, Frequency.WEEKLY);
		addEEnumLiteral(frequencyEEnum, Frequency.MONTHLY);
		addEEnumLiteral(frequencyEEnum, Frequency.QUATERLY);
		addEEnumLiteral(frequencyEEnum, Frequency.YEARLY);

		// Create resource
		createResource(eNS_URI);
	}

} //ActivitiesDSLPackageImpl
