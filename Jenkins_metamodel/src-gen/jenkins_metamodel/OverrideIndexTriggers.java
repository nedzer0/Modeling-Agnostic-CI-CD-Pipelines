/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Override Index Triggers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.OverrideIndexTriggers#isOverride <em>Override</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getOverrideIndexTriggers()
 * @model
 * @generated
 */
public interface OverrideIndexTriggers extends Option {
	/**
	 * Returns the value of the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' attribute.
	 * @see #setOverride(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getOverrideIndexTriggers_Override()
	 * @model
	 * @generated
	 */
	boolean isOverride();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.OverrideIndexTriggers#isOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #isOverride()
	 * @generated
	 */
	void setOverride(boolean value);

} // OverrideIndexTriggers
