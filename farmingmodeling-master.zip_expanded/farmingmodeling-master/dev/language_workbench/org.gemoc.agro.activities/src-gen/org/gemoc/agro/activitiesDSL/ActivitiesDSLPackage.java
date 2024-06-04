/**
 */
package org.gemoc.agro.activitiesDSL;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitiesDSLPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "activitiesDSL";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.gemoc.org/agro/ActivitiesDSL";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "activitiesDSL";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ActivitiesDSLPackage eINSTANCE = org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.ModelImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getModel()
	 * @generated
	 */
  int MODEL = 0;

  /**
	 * The feature id for the '<em><b>Cultures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__CULTURES = 0;

  /**
	 * The feature id for the '<em><b>Resource Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__RESOURCE_KINDS = 1;

  /**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.ResourceKindImpl <em>Resource Kind</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.ResourceKindImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getResourceKind()
	 * @generated
	 */
  int RESOURCE_KIND = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE_KIND__NAME = 0;

  /**
	 * The number of structural features of the '<em>Resource Kind</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE_KIND_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.CultureImpl <em>Culture</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.CultureImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getCulture()
	 * @generated
	 */
  int CULTURE = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CULTURE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CULTURE__ACTIVITIES = 1;

  /**
	 * The number of structural features of the '<em>Culture</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CULTURE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.ExploitationActivityImpl <em>Exploitation Activity</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.ExploitationActivityImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getExploitationActivity()
	 * @generated
	 */
  int EXPLOITATION_ACTIVITY = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITATION_ACTIVITY__NAME = 0;

  /**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITATION_ACTIVITY__FREQUENCY = 1;

  /**
	 * The feature id for the '<em><b>Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITATION_ACTIVITY__START_DATE = 2;

  /**
	 * The feature id for the '<em><b>End Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITATION_ACTIVITY__END_DATE = 3;

  /**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITATION_ACTIVITY__PREDICATES = 4;

  /**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITATION_ACTIVITY__USES = 5;

  /**
	 * The number of structural features of the '<em>Exploitation Activity</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITATION_ACTIVITY_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.ActivityResourceImpl <em>Activity Resource</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivityResourceImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getActivityResource()
	 * @generated
	 */
  int ACTIVITY_RESOURCE = 4;

  /**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_RESOURCE__QUANTITY = 0;

  /**
	 * The feature id for the '<em><b>Resource Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_RESOURCE__RESOURCE_KIND = 1;

  /**
	 * The number of structural features of the '<em>Activity Resource</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_RESOURCE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.PredicateImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getPredicate()
	 * @generated
	 */
  int PREDICATE = 5;

  /**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PREDICATE_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.NoRainImpl <em>No Rain</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.NoRainImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getNoRain()
	 * @generated
	 */
  int NO_RAIN = 6;

  /**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NO_RAIN__DAYS = PREDICATE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>No Rain</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NO_RAIN_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.TempOfTheDayImpl <em>Temp Of The Day</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.TempOfTheDayImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getTempOfTheDay()
	 * @generated
	 */
  int TEMP_OF_THE_DAY = 7;

  /**
	 * The feature id for the '<em><b>Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMP_OF_THE_DAY__COMPARISON = PREDICATE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Lower Temp Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMP_OF_THE_DAY__LOWER_TEMP_BOUND = PREDICATE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMP_OF_THE_DAY__UNIT = PREDICATE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Temp Of The Day</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMP_OF_THE_DAY_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.DelaySinceActivyImpl <em>Delay Since Activy</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.DelaySinceActivyImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getDelaySinceActivy()
	 * @generated
	 */
  int DELAY_SINCE_ACTIVY = 8;

  /**
	 * The feature id for the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DELAY_SINCE_ACTIVY__PREREQUISITE = PREDICATE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DELAY_SINCE_ACTIVY__DAYS = PREDICATE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Delay Since Activy</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DELAY_SINCE_ACTIVY_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.GrainIsImpl <em>Grain Is</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.GrainIsImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getGrainIs()
	 * @generated
	 */
  int GRAIN_IS = 9;

  /**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAIN_IS__STATE = PREDICATE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Grain Is</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAIN_IS_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.impl.DateImpl
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getDate()
	 * @generated
	 */
  int DATE = 10;

  /**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__DAY = 0;

  /**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__MONTH = 1;

  /**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.Month <em>Month</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.Month
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getMonth()
	 * @generated
	 */
  int MONTH = 11;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.Comp <em>Comp</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.Comp
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getComp()
	 * @generated
	 */
  int COMP = 12;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.TempUnit <em>Temp Unit</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.TempUnit
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getTempUnit()
	 * @generated
	 */
  int TEMP_UNIT = 13;

  /**
	 * The meta object id for the '{@link org.gemoc.agro.activitiesDSL.Frequency <em>Frequency</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.gemoc.agro.activitiesDSL.Frequency
	 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getFrequency()
	 * @generated
	 */
  int FREQUENCY = 14;


  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Model
	 * @generated
	 */
  EClass getModel();

  /**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.activitiesDSL.Model#getCultures <em>Cultures</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cultures</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Model#getCultures()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Cultures();

  /**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.activitiesDSL.Model#getResourceKinds <em>Resource Kinds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Kinds</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Model#getResourceKinds()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_ResourceKinds();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.ResourceKind <em>Resource Kind</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Kind</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ResourceKind
	 * @generated
	 */
  EClass getResourceKind();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.ResourceKind#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ResourceKind#getName()
	 * @see #getResourceKind()
	 * @generated
	 */
  EAttribute getResourceKind_Name();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.Culture <em>Culture</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Culture</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Culture
	 * @generated
	 */
  EClass getCulture();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.Culture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Culture#getName()
	 * @see #getCulture()
	 * @generated
	 */
  EAttribute getCulture_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.activitiesDSL.Culture#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Culture#getActivities()
	 * @see #getCulture()
	 * @generated
	 */
  EReference getCulture_Activities();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity <em>Exploitation Activity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exploitation Activity</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity
	 * @generated
	 */
  EClass getExploitationActivity();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity#getName()
	 * @see #getExploitationActivity()
	 * @generated
	 */
  EAttribute getExploitationActivity_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity#getFrequency()
	 * @see #getExploitationActivity()
	 * @generated
	 */
  EAttribute getExploitationActivity_Frequency();

  /**
	 * Returns the meta object for the containment reference '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Date</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity#getStartDate()
	 * @see #getExploitationActivity()
	 * @generated
	 */
  EReference getExploitationActivity_StartDate();

  /**
	 * Returns the meta object for the containment reference '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Date</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity#getEndDate()
	 * @see #getExploitationActivity()
	 * @generated
	 */
  EReference getExploitationActivity_EndDate();

  /**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity#getPredicates()
	 * @see #getExploitationActivity()
	 * @generated
	 */
  EReference getExploitationActivity_Predicates();

  /**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity#getUses()
	 * @see #getExploitationActivity()
	 * @generated
	 */
  EReference getExploitationActivity_Uses();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.ActivityResource <em>Activity Resource</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Resource</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ActivityResource
	 * @generated
	 */
  EClass getActivityResource();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.ActivityResource#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ActivityResource#getQuantity()
	 * @see #getActivityResource()
	 * @generated
	 */
  EAttribute getActivityResource_Quantity();

  /**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.activitiesDSL.ActivityResource#getResourceKind <em>Resource Kind</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Kind</em>'.
	 * @see org.gemoc.agro.activitiesDSL.ActivityResource#getResourceKind()
	 * @see #getActivityResource()
	 * @generated
	 */
  EReference getActivityResource_ResourceKind();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Predicate
	 * @generated
	 */
  EClass getPredicate();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.NoRain <em>No Rain</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Rain</em>'.
	 * @see org.gemoc.agro.activitiesDSL.NoRain
	 * @generated
	 */
  EClass getNoRain();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.NoRain#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see org.gemoc.agro.activitiesDSL.NoRain#getDays()
	 * @see #getNoRain()
	 * @generated
	 */
  EAttribute getNoRain_Days();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay <em>Temp Of The Day</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp Of The Day</em>'.
	 * @see org.gemoc.agro.activitiesDSL.TempOfTheDay
	 * @generated
	 */
  EClass getTempOfTheDay();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison</em>'.
	 * @see org.gemoc.agro.activitiesDSL.TempOfTheDay#getComparison()
	 * @see #getTempOfTheDay()
	 * @generated
	 */
  EAttribute getTempOfTheDay_Comparison();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getLowerTempBound <em>Lower Temp Bound</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Temp Bound</em>'.
	 * @see org.gemoc.agro.activitiesDSL.TempOfTheDay#getLowerTempBound()
	 * @see #getTempOfTheDay()
	 * @generated
	 */
  EAttribute getTempOfTheDay_LowerTempBound();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.gemoc.agro.activitiesDSL.TempOfTheDay#getUnit()
	 * @see #getTempOfTheDay()
	 * @generated
	 */
  EAttribute getTempOfTheDay_Unit();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy <em>Delay Since Activy</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Since Activy</em>'.
	 * @see org.gemoc.agro.activitiesDSL.DelaySinceActivy
	 * @generated
	 */
  EClass getDelaySinceActivy();

  /**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy#getPrerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prerequisite</em>'.
	 * @see org.gemoc.agro.activitiesDSL.DelaySinceActivy#getPrerequisite()
	 * @see #getDelaySinceActivy()
	 * @generated
	 */
  EReference getDelaySinceActivy_Prerequisite();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see org.gemoc.agro.activitiesDSL.DelaySinceActivy#getDays()
	 * @see #getDelaySinceActivy()
	 * @generated
	 */
  EAttribute getDelaySinceActivy_Days();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.GrainIs <em>Grain Is</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grain Is</em>'.
	 * @see org.gemoc.agro.activitiesDSL.GrainIs
	 * @generated
	 */
  EClass getGrainIs();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.GrainIs#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.gemoc.agro.activitiesDSL.GrainIs#getState()
	 * @see #getGrainIs()
	 * @generated
	 */
  EAttribute getGrainIs_State();

  /**
	 * Returns the meta object for class '{@link org.gemoc.agro.activitiesDSL.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Date
	 * @generated
	 */
  EClass getDate();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
  EAttribute getDate_Day();

  /**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.activitiesDSL.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
  EAttribute getDate_Month();

  /**
	 * Returns the meta object for enum '{@link org.gemoc.agro.activitiesDSL.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Month
	 * @generated
	 */
  EEnum getMonth();

  /**
	 * Returns the meta object for enum '{@link org.gemoc.agro.activitiesDSL.Comp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comp</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Comp
	 * @generated
	 */
  EEnum getComp();

  /**
	 * Returns the meta object for enum '{@link org.gemoc.agro.activitiesDSL.TempUnit <em>Temp Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temp Unit</em>'.
	 * @see org.gemoc.agro.activitiesDSL.TempUnit
	 * @generated
	 */
  EEnum getTempUnit();

  /**
	 * Returns the meta object for enum '{@link org.gemoc.agro.activitiesDSL.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency</em>'.
	 * @see org.gemoc.agro.activitiesDSL.Frequency
	 * @generated
	 */
  EEnum getFrequency();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  ActivitiesDSLFactory getActivitiesDSLFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.ModelImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getModel()
		 * @generated
		 */
    EClass MODEL = eINSTANCE.getModel();

    /**
		 * The meta object literal for the '<em><b>Cultures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODEL__CULTURES = eINSTANCE.getModel_Cultures();

    /**
		 * The meta object literal for the '<em><b>Resource Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODEL__RESOURCE_KINDS = eINSTANCE.getModel_ResourceKinds();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.ResourceKindImpl <em>Resource Kind</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.ResourceKindImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getResourceKind()
		 * @generated
		 */
    EClass RESOURCE_KIND = eINSTANCE.getResourceKind();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESOURCE_KIND__NAME = eINSTANCE.getResourceKind_Name();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.CultureImpl <em>Culture</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.CultureImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getCulture()
		 * @generated
		 */
    EClass CULTURE = eINSTANCE.getCulture();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CULTURE__NAME = eINSTANCE.getCulture_Name();

    /**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CULTURE__ACTIVITIES = eINSTANCE.getCulture_Activities();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.ExploitationActivityImpl <em>Exploitation Activity</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.ExploitationActivityImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getExploitationActivity()
		 * @generated
		 */
    EClass EXPLOITATION_ACTIVITY = eINSTANCE.getExploitationActivity();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPLOITATION_ACTIVITY__NAME = eINSTANCE.getExploitationActivity_Name();

    /**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPLOITATION_ACTIVITY__FREQUENCY = eINSTANCE.getExploitationActivity_Frequency();

    /**
		 * The meta object literal for the '<em><b>Start Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPLOITATION_ACTIVITY__START_DATE = eINSTANCE.getExploitationActivity_StartDate();

    /**
		 * The meta object literal for the '<em><b>End Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPLOITATION_ACTIVITY__END_DATE = eINSTANCE.getExploitationActivity_EndDate();

    /**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPLOITATION_ACTIVITY__PREDICATES = eINSTANCE.getExploitationActivity_Predicates();

    /**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPLOITATION_ACTIVITY__USES = eINSTANCE.getExploitationActivity_Uses();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.ActivityResourceImpl <em>Activity Resource</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivityResourceImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getActivityResource()
		 * @generated
		 */
    EClass ACTIVITY_RESOURCE = eINSTANCE.getActivityResource();

    /**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACTIVITY_RESOURCE__QUANTITY = eINSTANCE.getActivityResource_Quantity();

    /**
		 * The meta object literal for the '<em><b>Resource Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY_RESOURCE__RESOURCE_KIND = eINSTANCE.getActivityResource_ResourceKind();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.PredicateImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getPredicate()
		 * @generated
		 */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.NoRainImpl <em>No Rain</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.NoRainImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getNoRain()
		 * @generated
		 */
    EClass NO_RAIN = eINSTANCE.getNoRain();

    /**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NO_RAIN__DAYS = eINSTANCE.getNoRain_Days();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.TempOfTheDayImpl <em>Temp Of The Day</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.TempOfTheDayImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getTempOfTheDay()
		 * @generated
		 */
    EClass TEMP_OF_THE_DAY = eINSTANCE.getTempOfTheDay();

    /**
		 * The meta object literal for the '<em><b>Comparison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEMP_OF_THE_DAY__COMPARISON = eINSTANCE.getTempOfTheDay_Comparison();

    /**
		 * The meta object literal for the '<em><b>Lower Temp Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEMP_OF_THE_DAY__LOWER_TEMP_BOUND = eINSTANCE.getTempOfTheDay_LowerTempBound();

    /**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEMP_OF_THE_DAY__UNIT = eINSTANCE.getTempOfTheDay_Unit();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.DelaySinceActivyImpl <em>Delay Since Activy</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.DelaySinceActivyImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getDelaySinceActivy()
		 * @generated
		 */
    EClass DELAY_SINCE_ACTIVY = eINSTANCE.getDelaySinceActivy();

    /**
		 * The meta object literal for the '<em><b>Prerequisite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DELAY_SINCE_ACTIVY__PREREQUISITE = eINSTANCE.getDelaySinceActivy_Prerequisite();

    /**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DELAY_SINCE_ACTIVY__DAYS = eINSTANCE.getDelaySinceActivy_Days();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.GrainIsImpl <em>Grain Is</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.GrainIsImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getGrainIs()
		 * @generated
		 */
    EClass GRAIN_IS = eINSTANCE.getGrainIs();

    /**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRAIN_IS__STATE = eINSTANCE.getGrainIs_State();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.impl.DateImpl
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getDate()
		 * @generated
		 */
    EClass DATE = eINSTANCE.getDate();

    /**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__DAY = eINSTANCE.getDate_Day();

    /**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.Month <em>Month</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.Month
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getMonth()
		 * @generated
		 */
    EEnum MONTH = eINSTANCE.getMonth();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.Comp <em>Comp</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.Comp
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getComp()
		 * @generated
		 */
    EEnum COMP = eINSTANCE.getComp();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.TempUnit <em>Temp Unit</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.TempUnit
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getTempUnit()
		 * @generated
		 */
    EEnum TEMP_UNIT = eINSTANCE.getTempUnit();

    /**
		 * The meta object literal for the '{@link org.gemoc.agro.activitiesDSL.Frequency <em>Frequency</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.gemoc.agro.activitiesDSL.Frequency
		 * @see org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLPackageImpl#getFrequency()
		 * @generated
		 */
    EEnum FREQUENCY = eINSTANCE.getFrequency();

  }

} //ActivitiesDSLPackage
