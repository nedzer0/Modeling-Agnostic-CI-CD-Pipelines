/**
 */
package circleCI_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Aws Auths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Docker_Aws_Auths#getAws_access_key_id <em>Aws access key id</em>}</li>
 *   <li>{@link circleCI_metamodel.Docker_Aws_Auths#getAws_secret_access_key <em>Aws secret access key</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Aws_Auths()
 * @model
 * @generated
 */
public interface Docker_Aws_Auths extends EObject {
	/**
	 * Returns the value of the '<em><b>Aws access key id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aws access key id</em>' attribute.
	 * @see #setAws_access_key_id(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Aws_Auths_Aws_access_key_id()
	 * @model required="true"
	 * @generated
	 */
	String getAws_access_key_id();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker_Aws_Auths#getAws_access_key_id <em>Aws access key id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws access key id</em>' attribute.
	 * @see #getAws_access_key_id()
	 * @generated
	 */
	void setAws_access_key_id(String value);

	/**
	 * Returns the value of the '<em><b>Aws secret access key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aws secret access key</em>' attribute.
	 * @see #setAws_secret_access_key(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getDocker_Aws_Auths_Aws_secret_access_key()
	 * @model required="true"
	 * @generated
	 */
	String getAws_secret_access_key();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Docker_Aws_Auths#getAws_secret_access_key <em>Aws secret access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws secret access key</em>' attribute.
	 * @see #getAws_secret_access_key()
	 * @generated
	 */
	void setAws_secret_access_key(String value);

} // Docker_Aws_Auths
