/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.BooleanParam#isDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getBooleanParam()
 * @model
 * @generated
 */
public interface BooleanParam extends Parameter_Directive {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getBooleanParam_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	boolean isDefaultValue();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.BooleanParam#isDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isDefaultValue()
	 * @generated
	 */
	void setDefaultValue(boolean value);

} // BooleanParam
