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
 *   <li>{@link circleCI_metamodel.Job#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getSteps <em>Steps</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getParameters <em>Parameters</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getReuseExecutor <em>Reuse Executor</em>}</li>
 *   <li>{@link circleCI_metamodel.Job#getExecutors <em>Executors</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Name()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Reuse Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse Executor</em>' attribute.
	 * @see #setReuseExecutor(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_ReuseExecutor()
	 * @model required="true"
	 * @generated
	 */
	String getReuseExecutor();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Job#getReuseExecutor <em>Reuse Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reuse Executor</em>' attribute.
	 * @see #getReuseExecutor()
	 * @generated
	 */
	void setReuseExecutor(String value);

	/**
	 * Returns the value of the '<em><b>Executors</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Executor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executors</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getJob_Executors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Executor> getExecutors();

} // Job
