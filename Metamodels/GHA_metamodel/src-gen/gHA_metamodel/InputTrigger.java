/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.InputTrigger#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getInputTrigger()
 * @model abstract="true"
 * @generated
 */
public interface InputTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getInputTrigger_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

} // InputTrigger
