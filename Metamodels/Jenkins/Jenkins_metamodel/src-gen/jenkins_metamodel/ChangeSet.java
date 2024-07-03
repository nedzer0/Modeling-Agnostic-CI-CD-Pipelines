/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.ChangeSet#getPattern <em>Pattern</em>}</li>
 *   <li>{@link jenkins_metamodel.ChangeSet#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangeSet()
 * @model
 * @generated
 */
public interface ChangeSet extends When {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangeSet_Pattern()
	 * @model required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.ChangeSet#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The literals are from the enumeration {@link jenkins_metamodel.COMPARATOR_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see jenkins_metamodel.COMPARATOR_TYPE
	 * @see #setComparator(COMPARATOR_TYPE)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChangeSet_Comparator()
	 * @model
	 * @generated
	 */
	COMPARATOR_TYPE getComparator();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.ChangeSet#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see jenkins_metamodel.COMPARATOR_TYPE
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(COMPARATOR_TYPE value);

} // ChangeSet
