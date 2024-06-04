/**
 */
package org.gemoc.agro.activitiesDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.agro.activitiesDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage
 * @generated
 */
public class ActivitiesDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ActivitiesDSLPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActivitiesDSLAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ActivitiesDSLPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ActivitiesDSLSwitch<Adapter> modelSwitch =
    new ActivitiesDSLSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseResourceKind(ResourceKind object) {
				return createResourceKindAdapter();
			}
			@Override
			public Adapter caseCulture(Culture object) {
				return createCultureAdapter();
			}
			@Override
			public Adapter caseExploitationActivity(ExploitationActivity object) {
				return createExploitationActivityAdapter();
			}
			@Override
			public Adapter caseActivityResource(ActivityResource object) {
				return createActivityResourceAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseNoRain(NoRain object) {
				return createNoRainAdapter();
			}
			@Override
			public Adapter caseTempOfTheDay(TempOfTheDay object) {
				return createTempOfTheDayAdapter();
			}
			@Override
			public Adapter caseDelaySinceActivy(DelaySinceActivy object) {
				return createDelaySinceActivyAdapter();
			}
			@Override
			public Adapter caseGrainIs(GrainIs object) {
				return createGrainIsAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.Model
	 * @generated
	 */
  public Adapter createModelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.ResourceKind <em>Resource Kind</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.ResourceKind
	 * @generated
	 */
  public Adapter createResourceKindAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.Culture <em>Culture</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.Culture
	 * @generated
	 */
  public Adapter createCultureAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.ExploitationActivity <em>Exploitation Activity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.ExploitationActivity
	 * @generated
	 */
  public Adapter createExploitationActivityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.ActivityResource <em>Activity Resource</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.ActivityResource
	 * @generated
	 */
  public Adapter createActivityResourceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.Predicate
	 * @generated
	 */
  public Adapter createPredicateAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.NoRain <em>No Rain</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.NoRain
	 * @generated
	 */
  public Adapter createNoRainAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.TempOfTheDay <em>Temp Of The Day</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.TempOfTheDay
	 * @generated
	 */
  public Adapter createTempOfTheDayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy <em>Delay Since Activy</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.DelaySinceActivy
	 * @generated
	 */
  public Adapter createDelaySinceActivyAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.GrainIs <em>Grain Is</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.GrainIs
	 * @generated
	 */
  public Adapter createGrainIsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.gemoc.agro.activitiesDSL.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.agro.activitiesDSL.Date
	 * @generated
	 */
  public Adapter createDateAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //ActivitiesDSLAdapterFactory
