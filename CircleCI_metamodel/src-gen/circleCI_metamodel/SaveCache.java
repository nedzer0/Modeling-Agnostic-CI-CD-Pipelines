/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Save Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.SaveCache#getPaths <em>Paths</em>}</li>
 *   <li>{@link circleCI_metamodel.SaveCache#getKey <em>Key</em>}</li>
 *   <li>{@link circleCI_metamodel.SaveCache#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getSaveCache()
 * @model
 * @generated
 */
public interface SaveCache extends Step {
	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getSaveCache_Paths()
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
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getSaveCache_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.SaveCache#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * The literals are from the enumeration {@link circleCI_metamodel.WHEN_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see #setWhen(WHEN_TYPE)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getSaveCache_When()
	 * @model
	 * @generated
	 */
	WHEN_TYPE getWhen();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.SaveCache#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(WHEN_TYPE value);

} // SaveCache
