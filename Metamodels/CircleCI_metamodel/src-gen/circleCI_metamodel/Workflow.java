/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Workflow#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link circleCI_metamodel.Workflow#getBranches <em>Branches</em>}</li>
 *   <li>{@link circleCI_metamodel.Workflow#getWhen_unless <em>When unless</em>}</li>
 *   <li>{@link circleCI_metamodel.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.Workflow#getVersion <em>Version</em>}</li>
 *   <li>{@link circleCI_metamodel.Workflow#getJobworkflow <em>Jobworkflow</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWorkflow_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWorkflow_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When unless</em>' containment reference.
	 * @see #setWhen_unless(When_Unless)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWorkflow_When_unless()
	 * @model containment="true"
	 * @generated
	 */
	When_Unless getWhen_unless();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Workflow#getWhen_unless <em>When unless</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When unless</em>' containment reference.
	 * @see #getWhen_unless()
	 * @generated
	 */
	void setWhen_unless(When_Unless value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWorkflow_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWorkflow_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Workflow#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Jobworkflow</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.JobWorkflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobworkflow</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWorkflow_Jobworkflow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JobWorkflow> getJobworkflow();

} // Workflow
