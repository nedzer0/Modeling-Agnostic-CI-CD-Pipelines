/**
 */
package circleCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Windows Orb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.WindowsOrb#getExecutor <em>Executor</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWindowsOrb()
 * @model
 * @generated
 */
public interface WindowsOrb extends Execution_Env {
	/**
	 * Returns the value of the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' attribute.
	 * @see #setExecutor(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWindowsOrb_Executor()
	 * @model
	 * @generated
	 */
	String getExecutor();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.WindowsOrb#getExecutor <em>Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' attribute.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(String value);

} // WindowsOrb
