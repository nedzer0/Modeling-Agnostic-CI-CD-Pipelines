/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Step#getCommands <em>Commands</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getParameters <em>Parameters</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getActions <em>Actions</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getIf <em>If</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getWorking_directory <em>Working directory</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getShell <em>Shell</em>}</li>
 *   <li>{@link gHA_metamodel.Step#isContinue_on_error <em>Continue on error</em>}</li>
 *   <li>{@link gHA_metamodel.Step#getTimeout_minutes <em>Timeout minutes</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Commands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Envs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getEnvs();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(If)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_If()
	 * @model containment="true"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Step#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Working directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working directory</em>' attribute.
	 * @see #setWorking_directory(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Working_directory()
	 * @model
	 * @generated
	 */
	String getWorking_directory();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Step#getWorking_directory <em>Working directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working directory</em>' attribute.
	 * @see #getWorking_directory()
	 * @generated
	 */
	void setWorking_directory(String value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Shell()
	 * @model
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Step#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

	/**
	 * Returns the value of the '<em><b>Continue on error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue on error</em>' attribute.
	 * @see #setContinue_on_error(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Continue_on_error()
	 * @model
	 * @generated
	 */
	boolean isContinue_on_error();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Step#isContinue_on_error <em>Continue on error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue on error</em>' attribute.
	 * @see #isContinue_on_error()
	 * @generated
	 */
	void setContinue_on_error(boolean value);

	/**
	 * Returns the value of the '<em><b>Timeout minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout minutes</em>' attribute.
	 * @see #setTimeout_minutes(short)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStep_Timeout_minutes()
	 * @model
	 * @generated
	 */
	short getTimeout_minutes();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Step#getTimeout_minutes <em>Timeout minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout minutes</em>' attribute.
	 * @see #getTimeout_minutes()
	 * @generated
	 */
	void setTimeout_minutes(short value);

} // Step
