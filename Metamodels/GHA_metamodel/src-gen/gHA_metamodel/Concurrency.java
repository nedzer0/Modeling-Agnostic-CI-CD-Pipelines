/**
 */
package gHA_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Concurrency#getGroup <em>Group</em>}</li>
 *   <li>{@link gHA_metamodel.Concurrency#isCancel_in_progress <em>Cancel in progress</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getConcurrency()
 * @model
 * @generated
 */
public interface Concurrency extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getConcurrency_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Concurrency#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Cancel in progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel in progress</em>' attribute.
	 * @see #setCancel_in_progress(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getConcurrency_Cancel_in_progress()
	 * @model required="true"
	 * @generated
	 */
	boolean isCancel_in_progress();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Concurrency#isCancel_in_progress <em>Cancel in progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel in progress</em>' attribute.
	 * @see #isCancel_in_progress()
	 * @generated
	 */
	void setCancel_in_progress(boolean value);

} // Concurrency
