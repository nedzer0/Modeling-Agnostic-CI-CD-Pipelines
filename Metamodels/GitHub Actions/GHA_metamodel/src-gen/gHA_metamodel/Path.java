/**
 */
package gHA_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Path#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.Path#isIgnore <em>Ignore</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPath_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Path#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ignore</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore</em>' attribute.
	 * @see #setIgnore(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPath_Ignore()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnore();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Path#isIgnore <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore</em>' attribute.
	 * @see #isIgnore()
	 * @generated
	 */
	void setIgnore(boolean value);

} // Path
