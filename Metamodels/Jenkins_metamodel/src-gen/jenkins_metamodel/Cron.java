/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cron</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Cron#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getCron()
 * @model
 * @generated
 */
public interface Cron extends Trigger {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #setTimer(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getCron_Timer()
	 * @model required="true"
	 * @generated
	 */
	String getTimer();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Cron#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(String value);

} // Cron
