/**
 */
package devOps;

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
 *   <li>{@link devOps.Job#getName1 <em>Name1</em>}</li>
 *   <li>{@link devOps.Job#getTool_framework_job <em>Tool framework job</em>}</li>
 *   <li>{@link devOps.Job#getOutput <em>Output</em>}</li>
 *   <li>{@link devOps.Job#getCommand <em>Command</em>}</li>
 *   <li>{@link devOps.Job#getIfthenelse <em>Ifthenelse</em>}</li>
 *   <li>{@link devOps.Job#isAllow_faillure <em>Allow faillure</em>}</li>
 *   <li>{@link devOps.Job#getInput <em>Input</em>}</li>
 *   <li>{@link devOps.Job#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link devOps.Job#getDescription1 <em>Description1</em>}</li>
 *   <li>{@link devOps.Job#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name1</em>' attribute.
	 * @see #setName1(String)
	 * @see devOps.DevOpsPackage#getJob_Name1()
	 * @model
	 * @generated
	 */
	String getName1();

	/**
	 * Sets the value of the '{@link devOps.Job#getName1 <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name1</em>' attribute.
	 * @see #getName1()
	 * @generated
	 */
	void setName1(String value);

	/**
	 * Returns the value of the '<em><b>Tool framework job</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Tool_Framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool framework job</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getJob_Tool_framework_job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool_Framework> getTool_framework_job();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link devOps.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see devOps.DevOpsPackage#getJob_Output()
	 * @model
	 * @generated
	 */
	EList<Artifact> getOutput();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getJob_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Ifthenelse</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifthenelse</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getJob_Ifthenelse()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfThenElse> getIfthenelse();

	/**
	 * Returns the value of the '<em><b>Allow faillure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow faillure</em>' attribute.
	 * @see #setAllow_faillure(boolean)
	 * @see devOps.DevOpsPackage#getJob_Allow_faillure()
	 * @model
	 * @generated
	 */
	boolean isAllow_faillure();

	/**
	 * Sets the value of the '{@link devOps.Job#isAllow_faillure <em>Allow faillure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow faillure</em>' attribute.
	 * @see #isAllow_faillure()
	 * @generated
	 */
	void setAllow_faillure(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getJob_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getInput();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getJob_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description1</em>' attribute.
	 * @see #setDescription1(String)
	 * @see devOps.DevOpsPackage#getJob_Description1()
	 * @model
	 * @generated
	 */
	String getDescription1();

	/**
	 * Sets the value of the '{@link devOps.Job#getDescription1 <em>Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description1</em>' attribute.
	 * @see #getDescription1()
	 * @generated
	 */
	void setDescription1(String value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getJob_Permission()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermission();

} // Job
