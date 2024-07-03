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
 *   <li>{@link jenkins_metamodel.Stage#getStages <em>Stages</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getAgents <em>Agents</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getSteps <em>Steps</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getInputs <em>Inputs</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getWhen <em>When</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getName <em>Name</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#isFailFast <em>Fail Fast</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#isParallel <em>Parallel</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getStage_options <em>Stage options</em>}</li>
 *   <li>{@link jenkins_metamodel.Stage#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Stages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Name()
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Stage options</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.StageOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage options</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Stage_options()
	 * @model containment="true"
	 * @generated
	 */
	EList<StageOption> getStage_options();

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(Matrix)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getStage_Matrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getMatrix();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Stage#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Matrix value);

} // Stage
