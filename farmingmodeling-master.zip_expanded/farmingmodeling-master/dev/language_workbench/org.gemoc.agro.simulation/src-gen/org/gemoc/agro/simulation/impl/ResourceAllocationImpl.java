/**
 */
package org.gemoc.agro.simulation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.gemoc.agro.activitiesDSL.ResourceKind;
import org.gemoc.agro.exploitation.Resource;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.ResourceAllocation;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.impl.ResourceAllocationImpl#getWork <em>Work</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.ResourceAllocationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.ResourceAllocationImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceAllocationImpl extends MinimalEObjectImpl.Container implements ResourceAllocation {
	/**
   * The cached value of the '{@link #getWork() <em>Work</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWork()
   * @generated
   * @ordered
   */
	protected ActivityWork work;

	/**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
	protected Resource resource;

	/**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
	protected ResourceKind kind;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResourceAllocationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SimulationPackage.Literals.RESOURCE_ALLOCATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ActivityWork getWork() {
    if (work != null && work.eIsProxy()) {
      InternalEObject oldWork = (InternalEObject)work;
      work = (ActivityWork)eResolveProxy(oldWork);
      if (work != oldWork) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.RESOURCE_ALLOCATION__WORK, oldWork, work));
      }
    }
    return work;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ActivityWork basicGetWork() {
    return work;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWork(ActivityWork newWork) {
    ActivityWork oldWork = work;
    work = newWork;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.RESOURCE_ALLOCATION__WORK, oldWork, work));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Resource getResource() {
    if (resource != null && resource.eIsProxy()) {
      InternalEObject oldResource = (InternalEObject)resource;
      resource = (Resource)eResolveProxy(oldResource);
      if (resource != oldResource) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.RESOURCE_ALLOCATION__RESOURCE, oldResource, resource));
      }
    }
    return resource;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Resource basicGetResource() {
    return resource;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResource(Resource newResource) {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.RESOURCE_ALLOCATION__RESOURCE, oldResource, resource));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResourceKind getKind() {
    if (kind != null && kind.eIsProxy()) {
      InternalEObject oldKind = (InternalEObject)kind;
      kind = (ResourceKind)eResolveProxy(oldKind);
      if (kind != oldKind) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.RESOURCE_ALLOCATION__KIND, oldKind, kind));
      }
    }
    return kind;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResourceKind basicGetKind() {
    return kind;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setKind(ResourceKind newKind) {
    ResourceKind oldKind = kind;
    kind = newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.RESOURCE_ALLOCATION__KIND, oldKind, kind));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SimulationPackage.RESOURCE_ALLOCATION__WORK:
        if (resolve) return getWork();
        return basicGetWork();
      case SimulationPackage.RESOURCE_ALLOCATION__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
      case SimulationPackage.RESOURCE_ALLOCATION__KIND:
        if (resolve) return getKind();
        return basicGetKind();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case SimulationPackage.RESOURCE_ALLOCATION__WORK:
        setWork((ActivityWork)newValue);
        return;
      case SimulationPackage.RESOURCE_ALLOCATION__RESOURCE:
        setResource((Resource)newValue);
        return;
      case SimulationPackage.RESOURCE_ALLOCATION__KIND:
        setKind((ResourceKind)newValue);
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
	public void eUnset(int featureID) {
    switch (featureID) {
      case SimulationPackage.RESOURCE_ALLOCATION__WORK:
        setWork((ActivityWork)null);
        return;
      case SimulationPackage.RESOURCE_ALLOCATION__RESOURCE:
        setResource((Resource)null);
        return;
      case SimulationPackage.RESOURCE_ALLOCATION__KIND:
        setKind((ResourceKind)null);
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
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case SimulationPackage.RESOURCE_ALLOCATION__WORK:
        return work != null;
      case SimulationPackage.RESOURCE_ALLOCATION__RESOURCE:
        return resource != null;
      case SimulationPackage.RESOURCE_ALLOCATION__KIND:
        return kind != null;
    }
    return super.eIsSet(featureID);
  }

} //ResourceAllocationImpl
