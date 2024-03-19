/**
 */
package travisCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.GitHub#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getGitHub()
 * @model
 * @generated
 */
public interface GitHub extends Deploy {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getGitHub_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.GitHub#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

} // GitHub
