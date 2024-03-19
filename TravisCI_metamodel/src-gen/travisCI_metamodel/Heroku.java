/**
 */
package travisCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heroku</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.Heroku#getApp <em>App</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getHeroku()
 * @model
 * @generated
 */
public interface Heroku extends Deploy {
	/**
	 * Returns the value of the '<em><b>App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' attribute.
	 * @see #setApp(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getHeroku_App()
	 * @model
	 * @generated
	 */
	String getApp();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Heroku#getApp <em>App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' attribute.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(String value);

} // Heroku
