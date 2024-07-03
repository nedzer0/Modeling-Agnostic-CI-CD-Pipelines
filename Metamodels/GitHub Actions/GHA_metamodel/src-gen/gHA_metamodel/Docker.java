/**
 */
package gHA_metamodel;

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
 *   <li>{@link gHA_metamodel.Docker#getImage <em>Image</em>}</li>
 *   <li>{@link gHA_metamodel.Docker#getPre_entrypoint <em>Pre entrypoint</em>}</li>
 *   <li>{@link gHA_metamodel.Docker#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.Docker#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link gHA_metamodel.Docker#getPost_entrypoint <em>Post entrypoint</em>}</li>
 *   <li>{@link gHA_metamodel.Docker#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getDocker()
 * @model
 * @generated
 */
public interface Docker extends Action {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getDocker_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Docker#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Pre entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre entrypoint</em>' attribute.
	 * @see #setPre_entrypoint(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getDocker_Pre_entrypoint()
	 * @model
	 * @generated
	 */
	String getPre_entrypoint();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Docker#getPre_entrypoint <em>Pre entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre entrypoint</em>' attribute.
	 * @see #getPre_entrypoint()
	 * @generated
	 */
	void setPre_entrypoint(String value);

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getDocker_Envs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getEnvs();

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute.
	 * @see #setEntrypoint(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getDocker_Entrypoint()
	 * @model
	 * @generated
	 */
	String getEntrypoint();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Docker#getEntrypoint <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' attribute.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(String value);

	/**
	 * Returns the value of the '<em><b>Post entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post entrypoint</em>' attribute.
	 * @see #setPost_entrypoint(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getDocker_Post_entrypoint()
	 * @model
	 * @generated
	 */
	String getPost_entrypoint();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Docker#getPost_entrypoint <em>Post entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post entrypoint</em>' attribute.
	 * @see #getPost_entrypoint()
	 * @generated
	 */
	void setPost_entrypoint(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getDocker_Args()
	 * @model
	 * @generated
	 */
	EList<String> getArgs();

} // Docker
