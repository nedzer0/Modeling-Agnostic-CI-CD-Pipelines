/**
 */
package org.gemoc.agro.activitiesDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.ActivityResource;
import org.gemoc.agro.activitiesDSL.ResourceKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.ActivityResourceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.impl.ActivityResourceImpl#getResourceKind <em>Resource Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityResourceImpl extends MinimalEObjectImpl.Container implements ActivityResource
{
  /**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
  protected static final int QUANTITY_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
  protected int quantity = QUANTITY_EDEFAULT;

  /**
	 * The cached value of the '{@link #getResourceKind() <em>Resource Kind</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResourceKind()
	 * @generated
	 * @ordered
	 */
  protected ResourceKind resourceKind;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ActivityResourceImpl()
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
		return ActivitiesDSLPackage.Literals.ACTIVITY_RESOURCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getQuantity()
  {
		return quantity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setQuantity(int newQuantity)
  {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.ACTIVITY_RESOURCE__QUANTITY, oldQuantity, quantity));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResourceKind getResourceKind()
  {
		if (resourceKind != null && resourceKind.eIsProxy()) {
			InternalEObject oldResourceKind = (InternalEObject)resourceKind;
			resourceKind = (ResourceKind)eResolveProxy(oldResourceKind);
			if (resourceKind != oldResourceKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesDSLPackage.ACTIVITY_RESOURCE__RESOURCE_KIND, oldResourceKind, resourceKind));
			}
		}
		return resourceKind;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResourceKind basicGetResourceKind()
  {
		return resourceKind;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResourceKind(ResourceKind newResourceKind)
  {
		ResourceKind oldResourceKind = resourceKind;
		resourceKind = newResourceKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesDSLPackage.ACTIVITY_RESOURCE__RESOURCE_KIND, oldResourceKind, resourceKind));
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
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__QUANTITY:
				return getQuantity();
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__RESOURCE_KIND:
				if (resolve) return getResourceKind();
				return basicGetResourceKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__RESOURCE_KIND:
				setResourceKind((ResourceKind)newValue);
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
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__RESOURCE_KIND:
				setResourceKind((ResourceKind)null);
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
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE__RESOURCE_KIND:
				return resourceKind != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //ActivityResourceImpl
