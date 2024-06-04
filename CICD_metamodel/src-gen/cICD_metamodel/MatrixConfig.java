/**
 */
package cICD_metamodel;

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
 *   <li>{@link cICD_metamodel.MatrixConfig#getName <em>Name</em>}</li>
 *   <li>{@link cICD_metamodel.MatrixConfig#getValues <em>Values</em>}</li>
 *   <li>{@link cICD_metamodel.MatrixConfig#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getMatrixConfig()
 * @model
 * @generated
 */
public interface MatrixConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getMatrixConfig_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cICD_metamodel.MatrixConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getMatrixConfig_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cICD_metamodel.MATRIX_CONFIG_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cICD_metamodel.MATRIX_CONFIG_TYPE
	 * @see #setType(MATRIX_CONFIG_TYPE)
	 * @see cICD_metamodel.CICD_metamodelPackage#getMatrixConfig_Type()
	 * @model required="true"
	 * @generated
	 */
	MATRIX_CONFIG_TYPE getType();

	/**
	 * Sets the value of the '{@link cICD_metamodel.MatrixConfig#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cICD_metamodel.MATRIX_CONFIG_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(MATRIX_CONFIG_TYPE value);

} // MatrixConfig
