/**
 */
package circleCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Machine#getImage <em>Image</em>}</li>
 *   <li>{@link circleCI_metamodel.Machine#isDocker_layer_caching <em>Docker layer caching</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends Executor {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMachine_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Machine#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Docker layer caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker layer caching</em>' attribute.
	 * @see #setDocker_layer_caching(boolean)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMachine_Docker_layer_caching()
	 * @model
	 * @generated
	 */
	boolean isDocker_layer_caching();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Machine#isDocker_layer_caching <em>Docker layer caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker layer caching</em>' attribute.
	 * @see #isDocker_layer_caching()
	 * @generated
	 */
	void setDocker_layer_caching(boolean value);

} // Machine
