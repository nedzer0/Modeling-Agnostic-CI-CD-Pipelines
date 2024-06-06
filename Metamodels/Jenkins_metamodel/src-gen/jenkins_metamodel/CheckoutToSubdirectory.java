/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkout To Subdirectory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.CheckoutToSubdirectory#getDirectory <em>Directory</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getCheckoutToSubdirectory()
 * @model
 * @generated
 */
public interface CheckoutToSubdirectory extends Option {
	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getCheckoutToSubdirectory_Directory()
	 * @model required="true"
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.CheckoutToSubdirectory#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

} // CheckoutToSubdirectory
