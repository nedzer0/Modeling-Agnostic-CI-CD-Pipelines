/**
 */
package org.gemoc.agro.activitiesDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grain Is</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.activitiesDSL.GrainIs#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getGrainIs()
 * @model
 * @generated
 */
public interface GrainIs extends Predicate
{
  /**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getGrainIs_State()
	 * @model
	 * @generated
	 */
  String getState();

  /**
	 * Sets the value of the '{@link org.gemoc.agro.activitiesDSL.GrainIs#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
  void setState(String value);

} // GrainIs
