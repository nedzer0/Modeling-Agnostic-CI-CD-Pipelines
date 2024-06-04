/**
 */
package cICD_metamodel;

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
 *   <li>{@link cICD_metamodel.Pipeline#getJobs <em>Jobs</em>}</li>
 *   <li>{@link cICD_metamodel.Pipeline#getPipeline_environment <em>Pipeline environment</em>}</li>
 *   <li>{@link cICD_metamodel.Pipeline#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link cICD_metamodel.Pipeline#getAgents <em>Agents</em>}</li>
 *   <li>{@link cICD_metamodel.Pipeline#getName <em>Name</em>}</li>
 *   <li>{@link cICD_metamodel.Pipeline#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cICD_metamodel.Pipeline#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline_Jobs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Pipeline environment</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline environment</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline_Pipeline_environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getPipeline_environment();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.ScheduleTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScheduleTrigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getPipeline_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutput();

} // Pipeline
