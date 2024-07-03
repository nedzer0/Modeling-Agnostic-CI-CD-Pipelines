/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Docker#getDocker_auth <em>Docker auth</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker#getDocker_aws_auth <em>Docker aws auth</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker#getImage <em>Image</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker#getCommand <em>Command</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker#getUser <em>User</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker#getResourceClass <em>Resource Class</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker()
 * @model
 * @generated
 */
public interface Docker extends Executor {
	/**
	 * Returns the value of the '<em><b>Docker auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker auth</em>' containment reference.
	 * @see #setDocker_auth(Docker_Auth)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Docker_auth()
	 * @model containment="true"
	 * @generated
	 */
	Docker_Auth getDocker_auth();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker#getDocker_auth <em>Docker auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker auth</em>' containment reference.
	 * @see #getDocker_auth()
	 * @generated
	 */
	void setDocker_auth(Docker_Auth value);

	/**
	 * Returns the value of the '<em><b>Docker aws auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker aws auth</em>' containment reference.
	 * @see #setDocker_aws_auth(Docker_Aws_Auths)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Docker_aws_auth()
	 * @model containment="true"
	 * @generated
	 */
	Docker_Aws_Auths getDocker_aws_auth();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker#getDocker_aws_auth <em>Docker aws auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker aws auth</em>' containment reference.
	 * @see #getDocker_aws_auth()
	 * @generated
	 */
	void setDocker_aws_auth(Docker_Aws_Auths value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Entrypoint()
	 * @model
	 * @generated
	 */
	EList<String> getEntrypoint();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Command()
	 * @model
	 * @generated
	 */
	EList<String> getCommand();

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Resource Class</b></em>' attribute.
	 * The literals are from the enumeration {@link circleCI_metamodel.DOCKER_RESOURCE_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Class</em>' attribute.
	 * @see circleCI_metamodel.DOCKER_RESOURCE_TYPE
	 * @see #setResourceClass(DOCKER_RESOURCE_TYPE)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_ResourceClass()
	 * @model required="true"
	 * @generated
	 */
	DOCKER_RESOURCE_TYPE getResourceClass();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker#getResourceClass <em>Resource Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Class</em>' attribute.
	 * @see circleCI_metamodel.DOCKER_RESOURCE_TYPE
	 * @see #getResourceClass()
	 * @generated
	 */
	void setResourceClass(DOCKER_RESOURCE_TYPE value);

} // Docker
