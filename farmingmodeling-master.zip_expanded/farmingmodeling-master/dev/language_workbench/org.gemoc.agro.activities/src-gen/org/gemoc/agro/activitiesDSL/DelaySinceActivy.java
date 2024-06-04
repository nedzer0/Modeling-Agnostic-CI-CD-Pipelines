/**
 */
package org.gemoc.agro.activitiesDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Since Activy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy#getDays <em>Days</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getDelaySinceActivy()
 * @model
 * @generated
 */
public interface DelaySinceActivy extends Predicate
{
  /**
	 * Returns the value of the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prerequisite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisite</em>' reference.
	 * @see #setPrerequisite(ExploitationActivity)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getDelaySinceActivy_Prerequisite()
	 * @model
	 * @generated
	 */
  ExploitationActivity getPrerequisite();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy#getPrerequisite <em>Prerequisite</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisite</em>' reference.
	 * @see #getPrerequisite()
	 * @generated
	 */
  void setPrerequisite(ExploitationActivity value);

  /**
	 * Returns the value of the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Days</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' attribute.
	 * @see #setDays(int)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getDelaySinceActivy_Days()
	 * @model
	 * @generated
	 */
  int getDays();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.DelaySinceActivy#getDays <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days</em>' attribute.
	 * @see #getDays()
	 * @generated
	 */
  void setDays(int value);

} // DelaySinceActivy
