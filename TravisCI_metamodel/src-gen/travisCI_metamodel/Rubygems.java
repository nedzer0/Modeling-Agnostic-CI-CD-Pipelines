/**
 */
package travisCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rubygems</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.Rubygems#getGem <em>Gem</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getRubygems()
 * @model
 * @generated
 */
public interface Rubygems extends Deploy {
	/**
	 * Returns the value of the '<em><b>Gem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gem</em>' attribute.
	 * @see #setGem(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getRubygems_Gem()
	 * @model
	 * @generated
	 */
	String getGem();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Rubygems#getGem <em>Gem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gem</em>' attribute.
	 * @see #getGem()
	 * @generated
	 */
	void setGem(String value);

} // Rubygems
