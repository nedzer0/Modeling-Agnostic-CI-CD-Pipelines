/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Job#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getStore_artifact <em>Store artifact</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getWhen_unless <em>When unless</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getExecution_env <em>Execution env</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallelism</em>' attribute.
	 * @see #setParallelism(short)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Parallelism()
	 * @model
	 * @generated
	 */
	short getParallelism();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Job#getParallelism <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallelism</em>' attribute.
	 * @see #getParallelism()
	 * @generated
	 */
	void setParallelism(short value);

	/**
	 * Returns the value of the '<em><b>Store artifact</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Store_Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store artifact</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Store_artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Store_Artifact> getStore_artifact();

	/**
	 * Returns the value of the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When unless</em>' containment reference.
	 * @see #setWhen_unless(When_Unless)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_When_unless()
	 * @model containment="true"
	 * @generated
	 */
	When_Unless getWhen_unless();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Job#getWhen_unless <em>When unless</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When unless</em>' containment reference.
	 * @see #getWhen_unless()
	 * @generated
	 */
	void setWhen_unless(When_Unless value);

	/**
	 * Returns the value of the '<em><b>Execution env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution env</em>' containment reference.
	 * @see #setExecution_env(Execution_Env)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Execution_env()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Execution_Env getExecution_env();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Job#getExecution_env <em>Execution env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution env</em>' containment reference.
	 * @see #getExecution_env()
	 * @generated
	 */
	void setExecution_env(Execution_Env value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

} // Job
