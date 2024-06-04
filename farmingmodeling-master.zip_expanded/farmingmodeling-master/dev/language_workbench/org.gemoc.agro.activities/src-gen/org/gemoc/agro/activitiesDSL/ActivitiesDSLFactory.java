/**
 */
package org.gemoc.agro.activitiesDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage
 * @generated
 */
public interface ActivitiesDSLFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ActivitiesDSLFactory eINSTANCE = org.gemoc.agro.activitiesDSL.impl.ActivitiesDSLFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
  Model createModel();

  /**
	 * Returns a new object of class '<em>Resource Kind</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Kind</em>'.
	 * @generated
	 */
  ResourceKind createResourceKind();

  /**
	 * Returns a new object of class '<em>Culture</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Culture</em>'.
	 * @generated
	 */
  Culture createCulture();

  /**
	 * Returns a new object of class '<em>Exploitation Activity</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exploitation Activity</em>'.
	 * @generated
	 */
  ExploitationActivity createExploitationActivity();

  /**
	 * Returns a new object of class '<em>Activity Resource</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Resource</em>'.
	 * @generated
	 */
  ActivityResource createActivityResource();

  /**
	 * Returns a new object of class '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate</em>'.
	 * @generated
	 */
  Predicate createPredicate();

  /**
	 * Returns a new object of class '<em>No Rain</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Rain</em>'.
	 * @generated
	 */
  NoRain createNoRain();

  /**
	 * Returns a new object of class '<em>Temp Of The Day</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temp Of The Day</em>'.
	 * @generated
	 */
  TempOfTheDay createTempOfTheDay();

  /**
	 * Returns a new object of class '<em>Delay Since Activy</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Since Activy</em>'.
	 * @generated
	 */
  DelaySinceActivy createDelaySinceActivy();

  /**
	 * Returns a new object of class '<em>Grain Is</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grain Is</em>'.
	 * @generated
	 */
  GrainIs createGrainIs();

  /**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
  Date createDate();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ActivitiesDSLPackage getActivitiesDSLPackage();

} //ActivitiesDSLFactory
