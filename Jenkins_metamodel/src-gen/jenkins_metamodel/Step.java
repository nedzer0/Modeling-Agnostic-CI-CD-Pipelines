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
 *   <li>{@link jenkins_metamodel.Step#getCommands <em>Commands</em>}</li>
 *   <li>{@link jenkins_metamodel.Step#getStep_parameters <em>Step parameters</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference.
	 * @see #setCommands(Command)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStep_Commands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Command getCommands();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Step#getCommands <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commands</em>' containment reference.
	 * @see #getCommands()
	 * @generated
	 */
	void setCommands(Command value);

	/**
	 * Returns the value of the '<em><b>Step parameters</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Step_Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step parameters</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStep_Step_parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step_Parameter> getStep_parameters();

} // Step
