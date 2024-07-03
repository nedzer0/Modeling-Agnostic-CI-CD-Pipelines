/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Cache#getKey <em>Key</em>}</li>
 *   <li>{@link gHA_metamodel.Cache#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getCache()
 * @model abstract="true"
 * @generated
 */
public interface Cache extends Action {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getCache_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Cache#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getCache_Paths()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getPaths();

} // Cache
