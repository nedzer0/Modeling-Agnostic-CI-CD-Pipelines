/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.SchedulingFeedback#getLevel <em>Level</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.SchedulingFeedback#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedulingFeedback()
 * @model
 * @generated
 */
public interface SchedulingFeedback extends EObject {
	/**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The default value is <code>"info"</code>.
   * The literals are from the enumeration {@link org.gemoc.agro.simulation.FeedbackLevel}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see org.gemoc.agro.simulation.FeedbackLevel
   * @see #setLevel(FeedbackLevel)
   * @see org.gemoc.agro.simulation.SimulationPackage#getSchedulingFeedback_Level()
   * @model default="info" required="true"
   * @generated
   */
	FeedbackLevel getLevel();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.SchedulingFeedback#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see org.gemoc.agro.simulation.FeedbackLevel
   * @see #getLevel()
   * @generated
   */
	void setLevel(FeedbackLevel value);

	/**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.gemoc.agro.simulation.SimulationPackage#getSchedulingFeedback_Message()
   * @model
   * @generated
   */
	String getMessage();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.SchedulingFeedback#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
	void setMessage(String value);

} // SchedulingFeedback
