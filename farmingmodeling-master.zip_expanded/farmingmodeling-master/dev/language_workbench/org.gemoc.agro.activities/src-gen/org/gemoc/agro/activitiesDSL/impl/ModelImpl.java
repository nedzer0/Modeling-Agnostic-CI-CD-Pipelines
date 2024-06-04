/**
 */
package org.gemoc.agro.activitiesDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.Culture;
import org.gemoc.agro.activitiesDSL.Model;
import org.gemoc.agro.activitiesDSL.ResourceKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.ModelImpl#getCultures <em>Cultures</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.ModelImpl#getResourceKinds <em>Resource Kinds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
	 * The cached value of the '{@link #getCultures() <em>Cultures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCultures()
	 * @generated
	 * @ordered
	 */
  protected EList<Culture> cultures;

  /**
	 * The cached value of the '{@link #getResourceKinds() <em>Resource Kinds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResourceKinds()
	 * @generated
	 * @ordered
	 */
  protected EList<ResourceKind> resourceKinds;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ModelImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ActivitiesDSLPackage.Literals.MODEL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Culture> getCultures()
  {
		if (cultures == null) {
			cultures = new EObjectContainmentEList<Culture>(Culture.class, this, ActivitiesDSLPackage.MODEL__CULTURES);
		}
		return cultures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ResourceKind> getResourceKinds()
  {
		if (resourceKinds == null) {
			resourceKinds = new EObjectContainmentEList<ResourceKind>(ResourceKind.class, this, ActivitiesDSLPackage.MODEL__RESOURCE_KINDS);
		}
		return resourceKinds;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.MODEL__CULTURES:
				return ((InternalEList<?>)getCultures()).basicRemove(otherEnd, msgs);
			case ActivitiesDSLPackage.MODEL__RESOURCE_KINDS:
				return ((InternalEList<?>)getResourceKinds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.MODEL__CULTURES:
				return getCultures();
			case ActivitiesDSLPackage.MODEL__RESOURCE_KINDS:
				return getResourceKinds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.MODEL__CULTURES:
				getCultures().clear();
				getCultures().addAll((Collection<? extends Culture>)newValue);
				return;
			case ActivitiesDSLPackage.MODEL__RESOURCE_KINDS:
				getResourceKinds().clear();
				getResourceKinds().addAll((Collection<? extends ResourceKind>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.MODEL__CULTURES:
				getCultures().clear();
				return;
			case ActivitiesDSLPackage.MODEL__RESOURCE_KINDS:
				getResourceKinds().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.MODEL__CULTURES:
				return cultures != null && !cultures.isEmpty();
			case ActivitiesDSLPackage.MODEL__RESOURCE_KINDS:
				return resourceKinds != null && !resourceKinds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
