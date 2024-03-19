/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Docker#getImage <em>Image</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getRegistryUrl <em>Registry Url</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getRegistryCredentialsId <em>Registry Credentials Id</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker()
 * @model
 * @generated
 */
public interface Docker extends Agent {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Registry Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Url</em>' attribute.
	 * @see #setRegistryUrl(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_RegistryUrl()
	 * @model
	 * @generated
	 */
	String getRegistryUrl();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#getRegistryUrl <em>Registry Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Url</em>' attribute.
	 * @see #getRegistryUrl()
	 * @generated
	 */
	void setRegistryUrl(String value);

	/**
	 * Returns the value of the '<em><b>Registry Credentials Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Credentials Id</em>' attribute.
	 * @see #setRegistryCredentialsId(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_RegistryCredentialsId()
	 * @model
	 * @generated
	 */
	String getRegistryCredentialsId();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#getRegistryCredentialsId <em>Registry Credentials Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Credentials Id</em>' attribute.
	 * @see #getRegistryCredentialsId()
	 * @generated
	 */
	void setRegistryCredentialsId(String value);

} // Docker
