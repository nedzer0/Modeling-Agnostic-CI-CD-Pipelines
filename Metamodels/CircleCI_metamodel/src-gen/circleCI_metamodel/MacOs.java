/**
 */
package circleCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mac Os</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.MacOs#getXcode <em>Xcode</em>}</li>
 *   <li>{@link circleCI_metamodel.MacOs#getResourceClass <em>Resource Class</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMacOs()
 * @model
 * @generated
 */
public interface MacOs extends Executor {
	/**
	 * Returns the value of the '<em><b>Xcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xcode</em>' attribute.
	 * @see #setXcode(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMacOs_Xcode()
	 * @model required="true"
	 * @generated
	 */
	String getXcode();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.MacOs#getXcode <em>Xcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xcode</em>' attribute.
	 * @see #getXcode()
	 * @generated
	 */
	void setXcode(String value);

	/**
	 * Returns the value of the '<em><b>Resource Class</b></em>' attribute.
	 * The literals are from the enumeration {@link circleCI_metamodel.MACOS_RESOURCE_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Class</em>' attribute.
	 * @see circleCI_metamodel.MACOS_RESOURCE_TYPE
	 * @see #setResourceClass(MACOS_RESOURCE_TYPE)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMacOs_ResourceClass()
	 * @model required="true"
	 * @generated
	 */
	MACOS_RESOURCE_TYPE getResourceClass();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.MacOs#getResourceClass <em>Resource Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Class</em>' attribute.
	 * @see circleCI_metamodel.MACOS_RESOURCE_TYPE
	 * @see #getResourceClass()
	 * @generated
	 */
	void setResourceClass(MACOS_RESOURCE_TYPE value);

} // MacOs
