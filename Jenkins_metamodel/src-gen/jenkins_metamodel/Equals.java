/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Equals#getExpected_val <em>Expected val</em>}</li>
 *   <li>{@link jenkins_metamodel.Equals#getActual_val <em>Actual val</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getEquals()
 * @model
 * @generated
 */
public interface Equals extends When {
	/**
	 * Returns the value of the '<em><b>Expected val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected val</em>' attribute.
	 * @see #setExpected_val(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getEquals_Expected_val()
	 * @model
	 * @generated
	 */
	String getExpected_val();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Equals#getExpected_val <em>Expected val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected val</em>' attribute.
	 * @see #getExpected_val()
	 * @generated
	 */
	void setExpected_val(String value);

	/**
	 * Returns the value of the '<em><b>Actual val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual val</em>' attribute.
	 * @see #setActual_val(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getEquals_Actual_val()
	 * @model
	 * @generated
	 */
	String getActual_val();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Equals#getActual_val <em>Actual val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual val</em>' attribute.
	 * @see #getActual_val()
	 * @generated
	 */
	void setActual_val(String value);

} // Equals
