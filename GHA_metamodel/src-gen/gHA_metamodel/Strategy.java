/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Strategy#isFail_fast <em>Fail fast</em>}</li>
 *   <li>{@link gHA_metamodel.Strategy#getMax_parallel <em>Max parallel</em>}</li>
 *   <li>{@link gHA_metamodel.Strategy#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Fail fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail fast</em>' attribute.
	 * @see #setFail_fast(boolean)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStrategy_Fail_fast()
	 * @model
	 * @generated
	 */
	boolean isFail_fast();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Strategy#isFail_fast <em>Fail fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail fast</em>' attribute.
	 * @see #isFail_fast()
	 * @generated
	 */
	void setFail_fast(boolean value);

	/**
	 * Returns the value of the '<em><b>Max parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max parallel</em>' attribute.
	 * @see #setMax_parallel(short)
	 * @see gHA_metamodel.GHA_metamodelPackage#getStrategy_Max_parallel()
	 * @model
	 * @generated
	 */
	short getMax_parallel();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Strategy#getMax_parallel <em>Max parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max parallel</em>' attribute.
	 * @see #getMax_parallel()
	 * @generated
	 */
	void setMax_parallel(short value);

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.MatrixConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getStrategy_Configs()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatrixConfig> getConfigs();

} // Strategy
