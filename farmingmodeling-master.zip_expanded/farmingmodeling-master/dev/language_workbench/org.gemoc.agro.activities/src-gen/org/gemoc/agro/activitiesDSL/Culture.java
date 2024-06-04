/**
 */
package org.gemoc.agro.activitiesDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Culture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.Culture#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.Culture#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getCulture()
 * @model
 * @generated
 */
public interface Culture extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getCulture_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.Culture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.agro.activitiesDSL.ExploitationActivity}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getCulture_Activities()
	 * @model containment="true" keys="name"
	 * @generated
	 */
  EList<ExploitationActivity> getActivities();

} // Culture
