/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.ChangeRequest#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link jenkins_metamodel.ChangeRequest#getValue <em>Value</em>}</li>
 *   <li>{@link jenkins_metamodel.ChangeRequest#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangeRequest()
 * @model
 * @generated
 */
public interface ChangeRequest extends When {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link jenkins_metamodel.ATTRIBUTE_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see jenkins_metamodel.ATTRIBUTE_TYPE
	 * @see #setAttribute(ATTRIBUTE_TYPE)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangeRequest_Attribute()
	 * @model required="true"
	 * @generated
	 */
	ATTRIBUTE_TYPE getAttribute();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.ChangeRequest#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see jenkins_metamodel.ATTRIBUTE_TYPE
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ATTRIBUTE_TYPE value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangeRequest_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.ChangeRequest#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The literals are from the enumeration {@link jenkins_metamodel.COMPARATOR_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see jenkins_metamodel.COMPARATOR_TYPE
	 * @see #setComparator(COMPARATOR_TYPE)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangeRequest_Comparator()
	 * @model
	 * @generated
	 */
	COMPARATOR_TYPE getComparator();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.ChangeRequest#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see jenkins_metamodel.COMPARATOR_TYPE
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(COMPARATOR_TYPE value);

} // ChangeRequest
