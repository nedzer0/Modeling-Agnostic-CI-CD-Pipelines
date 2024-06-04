/**
 */
package org.gemoc.agro.activitiesDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.agro.activitiesDSL.*;

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
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage
 * @generated
 */
public class ActivitiesDSLSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ActivitiesDSLPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActivitiesDSLSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ActivitiesDSLPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ActivitiesDSLPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.RESOURCE_KIND: {
				ResourceKind resourceKind = (ResourceKind)theEObject;
				T result = caseResourceKind(resourceKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.CULTURE: {
				Culture culture = (Culture)theEObject;
				T result = caseCulture(culture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.EXPLOITATION_ACTIVITY: {
				ExploitationActivity exploitationActivity = (ExploitationActivity)theEObject;
				T result = caseExploitationActivity(exploitationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE: {
				ActivityResource activityResource = (ActivityResource)theEObject;
				T result = caseActivityResource(activityResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.NO_RAIN: {
				NoRain noRain = (NoRain)theEObject;
				T result = caseNoRain(noRain);
				if (result == null) result = casePredicate(noRain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY: {
				TempOfTheDay tempOfTheDay = (TempOfTheDay)theEObject;
				T result = caseTempOfTheDay(tempOfTheDay);
				if (result == null) result = casePredicate(tempOfTheDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY: {
				DelaySinceActivy delaySinceActivy = (DelaySinceActivy)theEObject;
				T result = caseDelaySinceActivy(delaySinceActivy);
				if (result == null) result = casePredicate(delaySinceActivy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.GRAIN_IS: {
				GrainIs grainIs = (GrainIs)theEObject;
				T result = caseGrainIs(grainIs);
				if (result == null) result = casePredicate(grainIs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesDSLPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseModel(Model object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Kind</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResourceKind(ResourceKind object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Culture</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Culture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCulture(Culture object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Exploitation Activity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exploitation Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExploitationActivity(ExploitationActivity object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Resource</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseActivityResource(ActivityResource object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePredicate(Predicate object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>No Rain</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Rain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNoRain(NoRain object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Temp Of The Day</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temp Of The Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTempOfTheDay(TempOfTheDay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Since Activy</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Since Activy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDelaySinceActivy(DelaySinceActivy object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Grain Is</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grain Is</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGrainIs(GrainIs object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDate(Date object)
  {
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
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ActivitiesDSLSwitch
