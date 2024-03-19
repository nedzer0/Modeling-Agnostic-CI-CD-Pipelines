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
 *   <li>{@link jenkins_metamodel.Pipeline#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getStage <em>Stage</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getParameter_directive <em>Parameter directive</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getTool <em>Tool</em>}</li>
 *   <li>{@link jenkins_metamodel.Pipeline#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Stage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Stage> getStage();

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
	 * Returns the value of the '<em><b>Parameter directive</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Parameter_Directive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter directive</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Parameter_directive()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter_Directive> getParameter_directive();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(Trigger)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Pipeline#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Tool()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTool();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPipeline_Agent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgent();

} // Pipeline
