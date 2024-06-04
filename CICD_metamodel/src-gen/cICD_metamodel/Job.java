/**
 */
package cICD_metamodel;

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
 *   <li>{@link cICD_metamodel.Job#getSteps <em>Steps</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getIfStep <em>If Step</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getJobs <em>Jobs</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getName <em>Name</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getAllowFaillure <em>Allow Faillure</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getParallel <em>Parallel</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getAgents <em>Agents</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getOutput <em>Output</em>}</li>
 *   <li>{@link cICD_metamodel.Job#getRequireJobs <em>Require Jobs</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>If Step</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.IfStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Step</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_IfStep()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfStep> getIfStep();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(Matrix)
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Matrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getMatrix();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Job#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Matrix value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allow Faillure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Faillure</em>' attribute.
	 * @see #setAllowFaillure(Boolean)
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_AllowFaillure()
	 * @model
	 * @generated
	 */
	Boolean getAllowFaillure();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Job#getAllowFaillure <em>Allow Faillure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Faillure</em>' attribute.
	 * @see #getAllowFaillure()
	 * @generated
	 */
	void setAllowFaillure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see #setParallel(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Parallel()
	 * @model
	 * @generated
	 */
	String getParallel();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Job#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(String value);

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Require Jobs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Jobs</em>' attribute list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getJob_RequireJobs()
	 * @model
	 * @generated
	 */
	EList<String> getRequireJobs();

} // Job
