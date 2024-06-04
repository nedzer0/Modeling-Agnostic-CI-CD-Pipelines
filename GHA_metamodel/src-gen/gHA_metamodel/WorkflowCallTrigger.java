/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Call Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.WorkflowCallTrigger#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link gHA_metamodel.WorkflowCallTrigger#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getWorkflowCallTrigger()
 * @model
 * @generated
 */
public interface WorkflowCallTrigger extends InputTrigger {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getWorkflowCallTrigger_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getWorkflowCallTrigger_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

} // WorkflowCallTrigger
