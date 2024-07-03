/**
 */
package circleCI_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Auth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Docker_Auth#getUsername <em>Username</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker_Auth#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Auth()
 * @model
 * @generated
 */
public interface Docker_Auth extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Auth_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker_Auth#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Auth_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker_Auth#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // Docker_Auth
