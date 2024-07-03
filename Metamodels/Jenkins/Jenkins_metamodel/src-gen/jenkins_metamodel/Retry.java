/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Retry#getRetries <em>Retries</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getRetry()
 * @model
 * @generated
 */
public interface Retry extends Option, StageOption {
	/**
	 * Returns the value of the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' attribute.
	 * @see #setRetries(short)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getRetry_Retries()
	 * @model required="true"
	 * @generated
	 */
	short getRetries();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Retry#getRetries <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries</em>' attribute.
	 * @see #getRetries()
	 * @generated
	 */
	void setRetries(short value);

} // Retry
