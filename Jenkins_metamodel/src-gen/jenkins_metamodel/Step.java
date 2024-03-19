/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Step#getCommand <em>Command</em>}</li>
 *   <li>{@link jenkins_metamodel.Step#getStep_parameter <em>Step parameter</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStep_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Step parameter</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Step_Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step parameter</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStep_Step_parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step_Parameter> getStep_parameter();

} // Step
