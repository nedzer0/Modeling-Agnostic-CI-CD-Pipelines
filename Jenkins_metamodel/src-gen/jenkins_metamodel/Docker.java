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
 *   <li>{@link jenkins_metamodel.Docker#getRegistryUrl <em>Registry Url</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getRegistryCredentialsId <em>Registry Credentials Id</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getLabel <em>Label</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#isAlwaysPull <em>Always Pull</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getCustomWorkspace <em>Custom Workspace</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getReuseNode <em>Reuse Node</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getArgs <em>Args</em>}</li>
 *   <li>{@link jenkins_metamodel.Docker#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker()
 * @model
 * @generated
 */
public interface Docker extends Agent {
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

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Always Pull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Pull</em>' attribute.
	 * @see #setAlwaysPull(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_AlwaysPull()
	 * @model
	 * @generated
	 */
	boolean isAlwaysPull();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#isAlwaysPull <em>Always Pull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Pull</em>' attribute.
	 * @see #isAlwaysPull()
	 * @generated
	 */
	void setAlwaysPull(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Workspace</em>' attribute.
	 * @see #setCustomWorkspace(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_CustomWorkspace()
	 * @model
	 * @generated
	 */
	String getCustomWorkspace();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#getCustomWorkspace <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Workspace</em>' attribute.
	 * @see #getCustomWorkspace()
	 * @generated
	 */
	void setCustomWorkspace(String value);

	/**
	 * Returns the value of the '<em><b>Reuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse Node</em>' attribute.
	 * @see #setReuseNode(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_ReuseNode()
	 * @model
	 * @generated
	 */
	String getReuseNode();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#getReuseNode <em>Reuse Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reuse Node</em>' attribute.
	 * @see #getReuseNode()
	 * @generated
	 */
	void setReuseNode(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Docker#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDocker_Image()
	 * @model required="true"
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

} // Docker
