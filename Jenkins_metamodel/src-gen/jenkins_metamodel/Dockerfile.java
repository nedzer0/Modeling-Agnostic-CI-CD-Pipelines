/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dockerfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Dockerfile#getDir <em>Dir</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getAdditionalBuildArgs <em>Additional Build Args</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getRegistryUrl <em>Registry Url</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getRegistryCredentialsId <em>Registry Credentials Id</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getLabel <em>Label</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getCustomWorkspace <em>Custom Workspace</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getReuseNode <em>Reuse Node</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getArgs <em>Args</em>}</li>
 *   <li>{@link jenkins_metamodel.Dockerfile#getFilename <em>Filename</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile()
 * @model
 * @generated
 */
public interface Dockerfile extends Agent {
	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see #setDir(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_Dir()
	 * @model
	 * @generated
	 */
	String getDir();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(String value);

	/**
	 * Returns the value of the '<em><b>Additional Build Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Build Args</em>' attribute.
	 * @see #setAdditionalBuildArgs(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_AdditionalBuildArgs()
	 * @model
	 * @generated
	 */
	String getAdditionalBuildArgs();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getAdditionalBuildArgs <em>Additional Build Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Build Args</em>' attribute.
	 * @see #getAdditionalBuildArgs()
	 * @generated
	 */
	void setAdditionalBuildArgs(String value);

	/**
	 * Returns the value of the '<em><b>Registry Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Url</em>' attribute.
	 * @see #setRegistryUrl(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_RegistryUrl()
	 * @model
	 * @generated
	 */
	String getRegistryUrl();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getRegistryUrl <em>Registry Url</em>}' attribute.
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
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_RegistryCredentialsId()
	 * @model
	 * @generated
	 */
	String getRegistryCredentialsId();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getRegistryCredentialsId <em>Registry Credentials Id</em>}' attribute.
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
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Workspace</em>' attribute.
	 * @see #setCustomWorkspace(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_CustomWorkspace()
	 * @model
	 * @generated
	 */
	String getCustomWorkspace();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getCustomWorkspace <em>Custom Workspace</em>}' attribute.
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
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_ReuseNode()
	 * @model
	 * @generated
	 */
	String getReuseNode();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getReuseNode <em>Reuse Node</em>}' attribute.
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
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getDockerfile_Filename()
	 * @model required="true"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Dockerfile#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // Dockerfile
