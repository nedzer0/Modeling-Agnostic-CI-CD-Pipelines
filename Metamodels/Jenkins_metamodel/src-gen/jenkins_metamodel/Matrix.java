/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Matrix#getAxis <em>Axis</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getStages <em>Stages</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getInputs <em>Inputs</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getWhen <em>When</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getAgents <em>Agents</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getTools <em>Tools</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.Matrix#getStage_options <em>Stage options</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Axis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Axis> getAxis();

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Stages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Inputs()
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
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<When> getWhen();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Post()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPost();

	/**
	 * Returns the value of the '<em><b>Stage options</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.StageOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage options</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getMatrix_Stage_options()
	 * @model containment="true"
	 * @generated
	 */
	EList<StageOption> getStage_options();

} // Matrix
