/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiet Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.QuietPeriod#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getQuietPeriod()
 * @model
 * @generated
 */
public interface QuietPeriod extends Option {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(short)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getQuietPeriod_Period()
	 * @model required="true"
	 * @generated
	 */
	short getPeriod();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.QuietPeriod#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(short value);

} // QuietPeriod
