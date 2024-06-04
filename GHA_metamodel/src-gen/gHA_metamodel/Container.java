/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Container#getImage <em>Image</em>}</li>
 *   <li>{@link gHA_metamodel.Container#getPorts <em>Ports</em>}</li>
 *   <li>{@link gHA_metamodel.Container#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link gHA_metamodel.Container#getOptions <em>Options</em>}</li>
 *   <li>{@link gHA_metamodel.Container#getCredential <em>Credential</em>}</li>
 *   <li>{@link gHA_metamodel.Container#getEnvs <em>Envs</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getContainer_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Container#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getContainer_Ports()
	 * @model
	 * @generated
	 */
	EList<String> getPorts();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getContainer_Volumes()
	 * @model
	 * @generated
	 */
	EList<String> getVolumes();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getContainer_Options()
	 * @model
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Container#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

	/**
	 * Returns the value of the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential</em>' containment reference.
	 * @see #setCredential(Credentials)
	 * @see gHA_metamodel.GHA_metamodelPackage#getContainer_Credential()
	 * @model containment="true"
	 * @generated
	 */
	Credentials getCredential();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Container#getCredential <em>Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential</em>' containment reference.
	 * @see #getCredential()
	 * @generated
	 */
	void setCredential(Credentials value);

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getContainer_Envs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getEnvs();

} // Container
