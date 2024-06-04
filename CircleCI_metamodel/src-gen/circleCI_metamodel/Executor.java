/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Executor#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.Executor#getResourceClass <em>Resource Class</em>}</li>
 *   <li>{@link circleCI_metamodel.Executor#getShell <em>Shell</em>}</li>
 *   <li>{@link circleCI_metamodel.Executor#getWorking_directory <em>Working directory</em>}</li>
 *   <li>{@link circleCI_metamodel.Executor#getEnvironments <em>Environments</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getExecutor()
 * @model abstract="true"
 * @generated
 */
public interface Executor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getExecutor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Executor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Class</em>' attribute.
	 * @see #setResourceClass(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getExecutor_ResourceClass()
	 * @model required="true"
	 * @generated
	 */
	String getResourceClass();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Executor#getResourceClass <em>Resource Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Class</em>' attribute.
	 * @see #getResourceClass()
	 * @generated
	 */
	void setResourceClass(String value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getExecutor_Shell()
	 * @model
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Executor#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

	/**
	 * Returns the value of the '<em><b>Working directory</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working directory</em>' attribute.
	 * @see #setWorking_directory(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getExecutor_Working_directory()
	 * @model default=""
	 * @generated
	 */
	String getWorking_directory();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Executor#getWorking_directory <em>Working directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working directory</em>' attribute.
	 * @see #getWorking_directory()
	 * @generated
	 */
	void setWorking_directory(String value);

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getExecutor_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

} // Executor
