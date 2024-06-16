/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Pipeline#getOrbs <em>Orbs</em>}</li>
 *   <li>{@link circleCI_metamodel.Pipeline#getCommands <em>Commands</em>}</li>
 *   <li>{@link circleCI_metamodel.Pipeline#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link circleCI_metamodel.Pipeline#getJobs <em>Jobs</em>}</li>
 *   <li>{@link circleCI_metamodel.Pipeline#getExecutors <em>Executors</em>}</li>
 *   <li>{@link circleCI_metamodel.Pipeline#getVersion <em>Version</em>}</li>
 *   <li>{@link circleCI_metamodel.Pipeline#isSetup <em>Setup</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Orbs</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Orb}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbs</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline_Orbs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Orb> getOrbs();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline_Workflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workflow> getWorkflows();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline_Jobs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Executors</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Executor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executors</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline_Executors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Executor> getExecutors();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Pipeline#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' attribute.
	 * @see #setSetup(boolean)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPipeline_Setup()
	 * @model
	 * @generated
	 */
	boolean isSetup();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Pipeline#isSetup <em>Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' attribute.
	 * @see #isSetup()
	 * @generated
	 */
	void setSetup(boolean value);

} // Pipeline
