/**
 */
package jenkins_metamodel;

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
 *   <li>{@link jenkins_metamodel.Pipeline#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getStages <em>Stages</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getParameter_directives <em>Parameter directives</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getTools <em>Tools</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getAgents <em>Agents</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Stages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Post()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPost();

	/**
	 * Returns the value of the '<em><b>Parameter directives</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Parameter_Directive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter directives</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Parameter_directives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter_Directive> getParameter_directives();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Agents()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // Pipeline
