/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.EventTrigger#getActivityType <em>Activity Type</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getEventTrigger()
 * @model abstract="true"
 * @generated
 */
public interface EventTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Activity Type</b></em>' attribute list.
	 * The list contents are of type {@link gHA_metamodel.WEBHOOK_ACTIVITY_TYPES}.
	 * The literals are from the enumeration {@link gHA_metamodel.WEBHOOK_ACTIVITY_TYPES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Type</em>' attribute list.
	 * @see gHA_metamodel.WEBHOOK_ACTIVITY_TYPES
	 * @see gHA_metamodel.GHA_metamodelPackage#getEventTrigger_ActivityType()
	 * @model id="true"
	 * @generated
	 */
	EList<WEBHOOK_ACTIVITY_TYPES> getActivityType();

} // EventTrigger
