/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Run#getWhen <em>When</em>}</li>
 *   <li>{@link circleCI_metamodel.Run#isBackground <em>Background</em>}</li>
 *   <li>{@link circleCI_metamodel.Run#getWorking_directory <em>Working directory</em>}</li>
 *   <li>{@link circleCI_metamodel.Run#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link circleCI_metamodel.Run#getNo_output_timeout <em>No output timeout</em>}</li>
 *   <li>{@link circleCI_metamodel.Run#getShell <em>Shell</em>}</li>
 *   <li>{@link circleCI_metamodel.Run#getRun_commands <em>Run commands</em>}</li>
 *   <li>{@link circleCI_metamodel.Run#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends Step {
	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * The literals are from the enumeration {@link circleCI_metamodel.WHEN_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see #setWhen(WHEN_TYPE)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_When()
	 * @model
	 * @generated
	 */
	WHEN_TYPE getWhen();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Run#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(WHEN_TYPE value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(boolean)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_Background()
	 * @model
	 * @generated
	 */
	boolean isBackground();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Run#isBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #isBackground()
	 * @generated
	 */
	void setBackground(boolean value);

	/**
	 * Returns the value of the '<em><b>Working directory</b></em>' attribute.
	 * The default value is <code>"."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working directory</em>' attribute.
	 * @see #setWorking_directory(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_Working_directory()
	 * @model default="."
	 * @generated
	 */
	String getWorking_directory();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Run#getWorking_directory <em>Working directory</em>}' attribute.
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
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>No output timeout</b></em>' attribute.
	 * The default value is <code>"10m"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No output timeout</em>' attribute.
	 * @see #setNo_output_timeout(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_No_output_timeout()
	 * @model default="10m"
	 * @generated
	 */
	String getNo_output_timeout();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Run#getNo_output_timeout <em>No output timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No output timeout</em>' attribute.
	 * @see #getNo_output_timeout()
	 * @generated
	 */
	void setNo_output_timeout(String value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_Shell()
	 * @model
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Run#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

	/**
	 * Returns the value of the '<em><b>Run commands</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.RunCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run commands</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_Run_commands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RunCommand> getRun_commands();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Parameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getRun_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

} // Run
