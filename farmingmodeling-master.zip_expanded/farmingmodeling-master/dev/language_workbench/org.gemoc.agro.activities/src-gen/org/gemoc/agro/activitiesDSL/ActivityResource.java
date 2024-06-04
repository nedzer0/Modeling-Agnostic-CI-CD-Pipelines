/**
 */
package org.gemoc.agro.activitiesDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.ActivityResource#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.ActivityResource#getResourceKind <em>Resource Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getActivityResource()
 * @model
 * @generated
 */
public interface ActivityResource extends EObject
{
  /**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getActivityResource_Quantity()
	 * @model
	 * @generated
	 */
  int getQuantity();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.ActivityResource#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
  void setQuantity(int value);

  /**
	 * Returns the value of the '<em><b>Resource Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Kind</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Kind</em>' reference.
	 * @see #setResourceKind(ResourceKind)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getActivityResource_ResourceKind()
	 * @model
	 * @generated
	 */
  ResourceKind getResourceKind();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.ActivityResource#getResourceKind <em>Resource Kind</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Kind</em>' reference.
	 * @see #getResourceKind()
	 * @generated
	 */
  void setResourceKind(ResourceKind value);

} // ActivityResource
