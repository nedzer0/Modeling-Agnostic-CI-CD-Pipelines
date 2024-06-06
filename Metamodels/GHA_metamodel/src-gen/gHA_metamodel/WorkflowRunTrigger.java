/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Run Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.WorkflowRunTrigger#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link gHA_metamodel.WorkflowRunTrigger#getType <em>Type</em>}</li>
 *   <li>{@link gHA_metamodel.WorkflowRunTrigger#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getWorkflowRunTrigger()
 * @model
 * @generated
 */
public interface WorkflowRunTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' attribute.
	 * @see #setWorkflow(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getWorkflowRunTrigger_Workflow()
	 * @model required="true"
	 * @generated
	 */
	String getWorkflow();

	/**
	 * Sets the value of the '{@link gHA_metamodel.WorkflowRunTrigger#getWorkflow <em>Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' attribute.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getWorkflowRunTrigger_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gHA_metamodel.WorkflowRunTrigger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getWorkflowRunTrigger_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

} // WorkflowRunTrigger
