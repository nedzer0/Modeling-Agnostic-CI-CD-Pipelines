/**
 */
package devOps;

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
 *   <li>{@link devOps.Pipeline#getWhen <em>When</em>}</li>
 *   <li>{@link devOps.Pipeline#getJob <em>Job</em>}</li>
 *   <li>{@link devOps.Pipeline#getName0 <em>Name0</em>}</li>
 *   <li>{@link devOps.Pipeline#getPipeline_tool_framework <em>Pipeline tool framework</em>}</li>
 *   <li>{@link devOps.Pipeline#getPipeline_environment <em>Pipeline environment</em>}</li>
 *   <li>{@link devOps.Pipeline#getPermission <em>Permission</em>}</li>
 *   <li>{@link devOps.Pipeline#getParallel <em>Parallel</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getPipeline_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<When> getWhen();

	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getPipeline_Job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJob();

	/**
	 * Returns the value of the '<em><b>Name0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name0</em>' attribute.
	 * @see #setName0(String)
	 * @see devOps.DevOpsPackage#getPipeline_Name0()
	 * @model
	 * @generated
	 */
	String getName0();

	/**
	 * Sets the value of the '{@link devOps.Pipeline#getName0 <em>Name0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name0</em>' attribute.
	 * @see #getName0()
	 * @generated
	 */
	void setName0(String value);

	/**
	 * Returns the value of the '<em><b>Pipeline tool framework</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Tool_Framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline tool framework</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getPipeline_Pipeline_tool_framework()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool_Framework> getPipeline_tool_framework();

	/**
	 * Returns the value of the '<em><b>Pipeline environment</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline environment</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getPipeline_Pipeline_environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getPipeline_environment();

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getPipeline_Permission()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermission();

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Parallel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getPipeline_Parallel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parallel> getParallel();

} // Pipeline
