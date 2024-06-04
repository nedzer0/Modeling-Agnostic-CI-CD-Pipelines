/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.MatrixConfig#getKey <em>Key</em>}</li>
 *   <li>{@link gHA_metamodel.MatrixConfig#getValues <em>Values</em>}</li>
 *   <li>{@link gHA_metamodel.MatrixConfig#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getMatrixConfig()
 * @model
 * @generated
 */
public interface MatrixConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getMatrixConfig_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link gHA_metamodel.MatrixConfig#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getMatrixConfig_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gHA_metamodel.MATRIX_CONFIG_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gHA_metamodel.MATRIX_CONFIG_TYPE
	 * @see #setType(MATRIX_CONFIG_TYPE)
	 * @see gHA_metamodel.GHA_metamodelPackage#getMatrixConfig_Type()
	 * @model
	 * @generated
	 */
	MATRIX_CONFIG_TYPE getType();

	/**
	 * Sets the value of the '{@link gHA_metamodel.MatrixConfig#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gHA_metamodel.MATRIX_CONFIG_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(MATRIX_CONFIG_TYPE value);

} // MatrixConfig
