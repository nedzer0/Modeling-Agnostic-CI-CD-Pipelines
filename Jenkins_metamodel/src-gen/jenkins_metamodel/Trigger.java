/**
 */
package jenkins_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Trigger#getTrigger_type <em>Trigger type</em>}</li>
 *   <li>{@link jenkins_metamodel.Trigger#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger type</b></em>' attribute.
	 * The literals are from the enumeration {@link jenkins_metamodel.TRIGGER_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger type</em>' attribute.
	 * @see jenkins_metamodel.TRIGGER_TYPE
	 * @see #setTrigger_type(TRIGGER_TYPE)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTrigger_Trigger_type()
	 * @model
	 * @generated
	 */
	TRIGGER_TYPE getTrigger_type();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Trigger#getTrigger_type <em>Trigger type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger type</em>' attribute.
	 * @see jenkins_metamodel.TRIGGER_TYPE
	 * @see #getTrigger_type()
	 * @generated
	 */
	void setTrigger_type(TRIGGER_TYPE value);

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #setTimer(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTrigger_Timer()
	 * @model
	 * @generated
	 */
	String getTimer();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Trigger#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(String value);

} // Trigger
