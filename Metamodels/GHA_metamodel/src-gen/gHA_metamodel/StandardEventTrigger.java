/**
 */
package gHA_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.StandardEventTrigger#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getStandardEventTrigger()
 * @model
 * @generated
 */
public interface StandardEventTrigger extends EventTrigger {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link gHA_metamodel.EVENTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see gHA_metamodel.EVENTS
	 * @see #setEvent(EVENTS)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStandardEventTrigger_Event()
	 * @model required="true"
	 * @generated
	 */
	EVENTS getEvent();

	/**
	 * Sets the value of the '{@link gHA_metamodel.StandardEventTrigger#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see gHA_metamodel.EVENTS
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EVENTS value);

} // StandardEventTrigger
