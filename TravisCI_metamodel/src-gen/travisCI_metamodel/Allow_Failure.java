/**
 */
package travisCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allow Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.Allow_Failure#getKey <em>Key</em>}</li>
 *   <li>{@link travisCI_metamodel.Allow_Failure#getValue <em>Value</em>}</li>
 *   <li>{@link travisCI_metamodel.Allow_Failure#getIf <em>If</em>}</li>
 *   <li>{@link travisCI_metamodel.Allow_Failure#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getAllow_Failure()
 * @model
 * @generated
 */
public interface Allow_Failure extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getAllow_Failure_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Allow_Failure#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getAllow_Failure_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Allow_Failure#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(If)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getAllow_Failure_If()
	 * @model containment="true"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Allow_Failure#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getAllow_Failure_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

} // Allow_Failure
