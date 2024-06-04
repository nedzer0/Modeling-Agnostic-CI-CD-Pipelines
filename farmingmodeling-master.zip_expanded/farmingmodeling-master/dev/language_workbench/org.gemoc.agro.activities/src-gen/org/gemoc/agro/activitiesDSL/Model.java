/**
 */
package org.gemoc.agro.activitiesDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.Model#getCultures <em>Cultures</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.Model#getResourceKinds <em>Resource Kinds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
	 * Returns the value of the '<em><b>Cultures</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.agro.activitiesDSL.Culture}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cultures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cultures</em>' containment reference list.
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getModel_Cultures()
	 * @model containment="true" keys="name"
	 * @generated
	 */
  EList<Culture> getCultures();

  /**
	 * Returns the value of the '<em><b>Resource Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.agro.activitiesDSL.ResourceKind}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Kinds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Kinds</em>' containment reference list.
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getModel_ResourceKinds()
	 * @model containment="true" keys="name"
	 * @generated
	 */
  EList<ResourceKind> getResourceKinds();

} // Model
