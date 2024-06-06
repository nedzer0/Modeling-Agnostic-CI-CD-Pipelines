/**
 */
package gHA_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Permission#getPermission <em>Permission</em>}</li>
 *   <li>{@link gHA_metamodel.Permission#getScope <em>Scope</em>}</li>
 *   <li>{@link gHA_metamodel.Permission#isReadAll <em>Read All</em>}</li>
 *   <li>{@link gHA_metamodel.Permission#isWriteAll <em>Write All</em>}</li>
 *   <li>{@link gHA_metamodel.Permission#isDisableAll <em>Disable All</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * The literals are from the enumeration {@link gHA_metamodel.PERMISSIONS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see gHA_metamodel.PERMISSIONS
	 * @see #setPermission(PERMISSIONS)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPermission_Permission()
	 * @model required="true"
	 * @generated
	 */
	PERMISSIONS getPermission();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Permission#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see gHA_metamodel.PERMISSIONS
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(PERMISSIONS value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link gHA_metamodel.PERMISSION_SCOPES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see gHA_metamodel.PERMISSION_SCOPES
	 * @see #setScope(PERMISSION_SCOPES)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPermission_Scope()
	 * @model required="true"
	 * @generated
	 */
	PERMISSION_SCOPES getScope();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Permission#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see gHA_metamodel.PERMISSION_SCOPES
	 * @see #getScope()
	 * @generated
	 */
	void setScope(PERMISSION_SCOPES value);

	/**
	 * Returns the value of the '<em><b>Read All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read All</em>' attribute.
	 * @see #setReadAll(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPermission_ReadAll()
	 * @model required="true"
	 * @generated
	 */
	boolean isReadAll();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Permission#isReadAll <em>Read All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read All</em>' attribute.
	 * @see #isReadAll()
	 * @generated
	 */
	void setReadAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Write All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write All</em>' attribute.
	 * @see #setWriteAll(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPermission_WriteAll()
	 * @model required="true"
	 * @generated
	 */
	boolean isWriteAll();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Permission#isWriteAll <em>Write All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write All</em>' attribute.
	 * @see #isWriteAll()
	 * @generated
	 */
	void setWriteAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Disable All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable All</em>' attribute.
	 * @see #setDisableAll(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPermission_DisableAll()
	 * @model required="true"
	 * @generated
	 */
	boolean isDisableAll();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Permission#isDisableAll <em>Disable All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable All</em>' attribute.
	 * @see #isDisableAll()
	 * @generated
	 */
	void setDisableAll(boolean value);

} // Permission
