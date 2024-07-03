/**
 */
package cICD_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.ScheduleTrigger#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getScheduleTrigger()
 * @model
 * @generated
 */
public interface ScheduleTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #setTimer(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getScheduleTrigger_Timer()
	 * @model required="true"
	 * @generated
	 */
	String getTimer();

	/**
	 * Sets the value of the '{@link cICD_metamodel.ScheduleTrigger#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(String value);

} // ScheduleTrigger
