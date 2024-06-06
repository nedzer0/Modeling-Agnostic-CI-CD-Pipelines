/**
 */
package cICD_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.Cache#getMode <em>Mode</em>}</li>
 *   <li>{@link cICD_metamodel.Cache#getPaths <em>Paths</em>}</li>
 *   <li>{@link cICD_metamodel.Cache#getKey <em>Key</em>}</li>
 *   <li>{@link cICD_metamodel.Cache#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getCache()
 * @model
 * @generated
 */
public interface Cache extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link cICD_metamodel.CACHE_MODE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see cICD_metamodel.CACHE_MODE
	 * @see #setMode(CACHE_MODE)
	 * @see cICD_metamodel.CICD_metamodelPackage#getCache_Mode()
	 * @model required="true"
	 * @generated
	 */
	CACHE_MODE getMode();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Cache#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see cICD_metamodel.CACHE_MODE
	 * @see #getMode()
	 * @generated
	 */
	void setMode(CACHE_MODE value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getCache_Paths()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getPaths();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getCache_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Cache#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getCache_Keys()
	 * @model
	 * @generated
	 */
	EList<String> getKeys();

} // Cache
