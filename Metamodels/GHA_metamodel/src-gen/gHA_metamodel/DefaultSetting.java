/**
 */
package gHA_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.DefaultSetting#getShell <em>Shell</em>}</li>
 *   <li>{@link gHA_metamodel.DefaultSetting#getWorkingDirectory <em>Working Directory</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getDefaultSetting()
 * @model
 * @generated
 */
public interface DefaultSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getDefaultSetting_Shell()
	 * @model required="true"
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link gHA_metamodel.DefaultSetting#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' attribute.
	 * @see #setWorkingDirectory(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getDefaultSetting_WorkingDirectory()
	 * @model required="true"
	 * @generated
	 */
	String getWorkingDirectory();

	/**
	 * Sets the value of the '{@link gHA_metamodel.DefaultSetting#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' attribute.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(String value);

} // DefaultSetting
