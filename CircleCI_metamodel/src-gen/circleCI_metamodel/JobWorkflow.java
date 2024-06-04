/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.JobWorkflow#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.JobWorkflow#getRequires <em>Requires</em>}</li>
 *   <li>{@link circleCI_metamodel.JobWorkflow#getContext <em>Context</em>}</li>
 *   <li>{@link circleCI_metamodel.JobWorkflow#isApprovalJob <em>Approval Job</em>}</li>
 *   <li>{@link circleCI_metamodel.JobWorkflow#getBranches <em>Branches</em>}</li>
 *   <li>{@link circleCI_metamodel.JobWorkflow#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJobWorkflow()
 * @model
 * @generated
 */
public interface JobWorkflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJobWorkflow_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.JobWorkflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' attribute list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJobWorkflow_Requires()
	 * @model
	 * @generated
	 */
	EList<String> getRequires();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJobWorkflow_Context()
	 * @model
	 * @generated
	 */
	EList<String> getContext();

	/**
	 * Returns the value of the '<em><b>Approval Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Job</em>' attribute.
	 * @see #setApprovalJob(boolean)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJobWorkflow_ApprovalJob()
	 * @model
	 * @generated
	 */
	boolean isApprovalJob();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.JobWorkflow#isApprovalJob <em>Approval Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Job</em>' attribute.
	 * @see #isApprovalJob()
	 * @generated
	 */
	void setApprovalJob(boolean value);

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJobWorkflow_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(Matrix)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJobWorkflow_Matrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getMatrix();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.JobWorkflow#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Matrix value);

} // JobWorkflow
