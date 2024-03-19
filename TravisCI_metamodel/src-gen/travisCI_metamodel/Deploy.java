/**
 */
package travisCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.Deploy#getProvider <em>Provider</em>}</li>
 *   <li>{@link travisCI_metamodel.Deploy#getApi_key <em>Api key</em>}</li>
 *   <li>{@link travisCI_metamodel.Deploy#isSkip_cleanup <em>Skip cleanup</em>}</li>
 *   <li>{@link travisCI_metamodel.Deploy#getOn <em>On</em>}</li>
 *   <li>{@link travisCI_metamodel.Deploy#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getDeploy()
 * @model abstract="true"
 * @generated
 */
public interface Deploy extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getDeploy_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Deploy#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api key</em>' attribute.
	 * @see #setApi_key(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getDeploy_Api_key()
	 * @model
	 * @generated
	 */
	String getApi_key();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Deploy#getApi_key <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api key</em>' attribute.
	 * @see #getApi_key()
	 * @generated
	 */
	void setApi_key(String value);

	/**
	 * Returns the value of the '<em><b>Skip cleanup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip cleanup</em>' attribute.
	 * @see #setSkip_cleanup(boolean)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getDeploy_Skip_cleanup()
	 * @model
	 * @generated
	 */
	boolean isSkip_cleanup();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Deploy#isSkip_cleanup <em>Skip cleanup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip cleanup</em>' attribute.
	 * @see #isSkip_cleanup()
	 * @generated
	 */
	void setSkip_cleanup(boolean value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Script}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getDeploy_Script()
	 * @model containment="true"
	 * @generated
	 */
	EList<Script> getScript();

	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.On}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getDeploy_On()
	 * @model containment="true"
	 * @generated
	 */
	EList<On> getOn();

} // Deploy
