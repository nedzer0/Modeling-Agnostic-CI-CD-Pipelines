/**
 */
package circleCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup Remote Docker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.SetupRemoteDocker#isDocker_layer_caching <em>Docker layer caching</em>}</li>
 *   <li>{@link circleCI_metamodel.SetupRemoteDocker#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getSetupRemoteDocker()
 * @model
 * @generated
 */
public interface SetupRemoteDocker extends Step {
	/**
	 * Returns the value of the '<em><b>Docker layer caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker layer caching</em>' attribute.
	 * @see #setDocker_layer_caching(boolean)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getSetupRemoteDocker_Docker_layer_caching()
	 * @model
	 * @generated
	 */
	boolean isDocker_layer_caching();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.SetupRemoteDocker#isDocker_layer_caching <em>Docker layer caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker layer caching</em>' attribute.
	 * @see #isDocker_layer_caching()
	 * @generated
	 */
	void setDocker_layer_caching(boolean value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getSetupRemoteDocker_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.SetupRemoteDocker#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // SetupRemoteDocker
