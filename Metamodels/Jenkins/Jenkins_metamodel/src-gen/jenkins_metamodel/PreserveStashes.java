/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preserve Stashes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.PreserveStashes#getBuildCount <em>Build Count</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPreserveStashes()
 * @model
 * @generated
 */
public interface PreserveStashes extends Option {
	/**
	 * Returns the value of the '<em><b>Build Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Count</em>' attribute.
	 * @see #setBuildCount(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPreserveStashes_BuildCount()
	 * @model
	 * @generated
	 */
	String getBuildCount();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.PreserveStashes#getBuildCount <em>Build Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Count</em>' attribute.
	 * @see #getBuildCount()
	 * @generated
	 */
	void setBuildCount(String value);

} // PreserveStashes
