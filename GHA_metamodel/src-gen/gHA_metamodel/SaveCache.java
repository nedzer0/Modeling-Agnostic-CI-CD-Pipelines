/**
 */
package gHA_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Save Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.SaveCache#getUpload_chunk_size <em>Upload chunk size</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getSaveCache()
 * @model
 * @generated
 */
public interface SaveCache extends Cache {
	/**
	 * Returns the value of the '<em><b>Upload chunk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload chunk size</em>' attribute.
	 * @see #setUpload_chunk_size(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getSaveCache_Upload_chunk_size()
	 * @model
	 * @generated
	 */
	String getUpload_chunk_size();

	/**
	 * Sets the value of the '{@link gHA_metamodel.SaveCache#getUpload_chunk_size <em>Upload chunk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload chunk size</em>' attribute.
	 * @see #getUpload_chunk_size()
	 * @generated
	 */
	void setUpload_chunk_size(String value);

} // SaveCache
