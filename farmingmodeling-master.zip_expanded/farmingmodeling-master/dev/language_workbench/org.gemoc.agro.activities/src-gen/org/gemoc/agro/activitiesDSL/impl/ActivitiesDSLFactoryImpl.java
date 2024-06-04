/**
 */
package org.gemoc.agro.activitiesDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.agro.activitiesDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesDSLFactoryImpl extends EFactoryImpl implements ActivitiesDSLFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ActivitiesDSLFactory init()
  {
		try {
			ActivitiesDSLFactory theActivitiesDSLFactory = (ActivitiesDSLFactory)EPackage.Registry.INSTANCE.getEFactory(ActivitiesDSLPackage.eNS_URI);
			if (theActivitiesDSLFactory != null) {
				return theActivitiesDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitiesDSLFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActivitiesDSLFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ActivitiesDSLPackage.MODEL: return createModel();
			case ActivitiesDSLPackage.RESOURCE_KIND: return createResourceKind();
			case ActivitiesDSLPackage.CULTURE: return createCulture();
			case ActivitiesDSLPackage.EXPLOITATION_ACTIVITY: return createExploitationActivity();
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE: return createActivityResource();
			case ActivitiesDSLPackage.PREDICATE: return createPredicate();
			case ActivitiesDSLPackage.NO_RAIN: return createNoRain();
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY: return createTempOfTheDay();
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY: return createDelaySinceActivy();
			case ActivitiesDSLPackage.GRAIN_IS: return createGrainIs();
			case ActivitiesDSLPackage.DATE: return createDate();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case ActivitiesDSLPackage.MONTH:
				return createMonthFromString(eDataType, initialValue);
			case ActivitiesDSLPackage.COMP:
				return createCompFromString(eDataType, initialValue);
			case ActivitiesDSLPackage.TEMP_UNIT:
				return createTempUnitFromString(eDataType, initialValue);
			case ActivitiesDSLPackage.FREQUENCY:
				return createFrequencyFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case ActivitiesDSLPackage.MONTH:
				return convertMonthToString(eDataType, instanceValue);
			case ActivitiesDSLPackage.COMP:
				return convertCompToString(eDataType, instanceValue);
			case ActivitiesDSLPackage.TEMP_UNIT:
				return convertTempUnitToString(eDataType, instanceValue);
			case ActivitiesDSLPackage.FREQUENCY:
				return convertFrequencyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Model createModel()
  {
		ModelImpl model = new ModelImpl();
		return model;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResourceKind createResourceKind()
  {
		ResourceKindImpl resourceKind = new ResourceKindImpl();
		return resourceKind;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Culture createCulture()
  {
		CultureImpl culture = new CultureImpl();
		return culture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExploitationActivity createExploitationActivity()
  {
		ExploitationActivityImpl exploitationActivity = new ExploitationActivityImpl();
		return exploitationActivity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActivityResource createActivityResource()
  {
		ActivityResourceImpl activityResource = new ActivityResourceImpl();
		return activityResource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Predicate createPredicate()
  {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NoRain createNoRain()
  {
		NoRainImpl noRain = new NoRainImpl();
		return noRain;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TempOfTheDay createTempOfTheDay()
  {
		TempOfTheDayImpl tempOfTheDay = new TempOfTheDayImpl();
		return tempOfTheDay;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DelaySinceActivy createDelaySinceActivy()
  {
		DelaySinceActivyImpl delaySinceActivy = new DelaySinceActivyImpl();
		return delaySinceActivy;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GrainIs createGrainIs()
  {
		GrainIsImpl grainIs = new GrainIsImpl();
		return grainIs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date createDate()
  {
		DateImpl date = new DateImpl();
		return date;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Month createMonthFromString(EDataType eDataType, String initialValue)
  {
		Month result = Month.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMonthToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Comp createCompFromString(EDataType eDataType, String initialValue)
  {
		Comp result = Comp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertCompToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TempUnit createTempUnitFromString(EDataType eDataType, String initialValue)
  {
		TempUnit result = TempUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertTempUnitToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Frequency createFrequencyFromString(EDataType eDataType, String initialValue)
  {
		Frequency result = Frequency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertFrequencyToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActivitiesDSLPackage getActivitiesDSLPackage()
  {
		return (ActivitiesDSLPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ActivitiesDSLPackage getPackage()
  {
		return ActivitiesDSLPackage.eINSTANCE;
	}

} //ActivitiesDSLFactoryImpl
