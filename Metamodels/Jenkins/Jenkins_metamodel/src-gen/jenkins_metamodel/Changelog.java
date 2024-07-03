/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changelog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Changelog#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangelog()
 * @model
 * @generated
 */
public interface Changelog extends When {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangelog_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Changelog#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // Changelog
