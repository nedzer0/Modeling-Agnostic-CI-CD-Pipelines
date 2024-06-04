/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restore Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.RestoreCache#getRestore_keys <em>Restore keys</em>}</li>
 *   <li>{@link gHA_metamodel.RestoreCache#isLookup_only <em>Lookup only</em>}</li>
 *   <li>{@link gHA_metamodel.RestoreCache#isFail_on_cache_miss <em>Fail on cache miss</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getRestoreCache()
 * @model
 * @generated
 */
public interface RestoreCache extends Cache {
	/**
	 * Returns the value of the '<em><b>Restore keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restore keys</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getRestoreCache_Restore_keys()
	 * @model
	 * @generated
	 */
	EList<String> getRestore_keys();

	/**
	 * Returns the value of the '<em><b>Lookup only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup only</em>' attribute.
	 * @see #setLookup_only(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getRestoreCache_Lookup_only()
	 * @model default="false"
	 * @generated
	 */
	boolean isLookup_only();

	/**
	 * Sets the value of the '{@link gHA_metamodel.RestoreCache#isLookup_only <em>Lookup only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup only</em>' attribute.
	 * @see #isLookup_only()
	 * @generated
	 */
	void setLookup_only(boolean value);

	/**
	 * Returns the value of the '<em><b>Fail on cache miss</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail on cache miss</em>' attribute.
	 * @see #setFail_on_cache_miss(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getRestoreCache_Fail_on_cache_miss()
	 * @model default="false"
	 * @generated
	 */
	boolean isFail_on_cache_miss();

	/**
	 * Sets the value of the '{@link gHA_metamodel.RestoreCache#isFail_on_cache_miss <em>Fail on cache miss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail on cache miss</em>' attribute.
	 * @see #isFail_on_cache_miss()
	 * @generated
	 */
	void setFail_on_cache_miss(boolean value);

} // RestoreCache
