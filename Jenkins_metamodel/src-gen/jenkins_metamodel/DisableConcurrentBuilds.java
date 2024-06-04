/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disable Concurrent Builds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.DisableConcurrentBuilds#isAbort <em>Abort</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDisableConcurrentBuilds()
 * @model
 * @generated
 */
public interface DisableConcurrentBuilds extends Option {
	/**
	 * Returns the value of the '<em><b>Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abort</em>' attribute.
	 * @see #setAbort(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDisableConcurrentBuilds_Abort()
	 * @model
	 * @generated
	 */
	boolean isAbort();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.DisableConcurrentBuilds#isAbort <em>Abort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abort</em>' attribute.
	 * @see #isAbort()
	 * @generated
	 */
	void setAbort(boolean value);

} // DisableConcurrentBuilds
