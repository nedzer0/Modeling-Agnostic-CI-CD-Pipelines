/**
 */
package gHA_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.ScheduleTrigger#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getScheduleTrigger()
 * @model
 * @generated
 */
public interface ScheduleTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron</em>' attribute.
	 * @see #setCron(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getScheduleTrigger_Cron()
	 * @model required="true"
	 * @generated
	 */
	String getCron();

	/**
	 * Sets the value of the '{@link gHA_metamodel.ScheduleTrigger#getCron <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cron</em>' attribute.
	 * @see #getCron()
	 * @generated
	 */
	void setCron(String value);

} // ScheduleTrigger
