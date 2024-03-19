/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Stage#getName <em>Name</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getStage <em>Stage</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getAgent <em>Agent</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getStep <em>Step</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getTool <em>Tool</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getInput <em>Input</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getWhen <em>When</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#isFailFast <em>Fail Fast</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#isParallel <em>Parallel</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Stage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Stage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getStage();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Agent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgent();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Post()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPost();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Tool()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTool();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<When> getWhen();

	/**
	 * Returns the value of the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Fast</em>' attribute.
	 * @see #setFailFast(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_FailFast()
	 * @model
	 * @generated
	 */
	boolean isFailFast();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Stage#isFailFast <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Fast</em>' attribute.
	 * @see #isFailFast()
	 * @generated
	 */
	void setFailFast(boolean value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see #setParallel(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Parallel()
	 * @model
	 * @generated
	 */
	boolean isParallel();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Stage#isParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see #isParallel()
	 * @generated
	 */
	void setParallel(boolean value);

} // Stage
