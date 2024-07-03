/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Discarder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.BuildDiscarder#getNumToKeepStr <em>Num To Keep Str</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getBuildDiscarder()
 * @model
 * @generated
 */
public interface BuildDiscarder extends Option {
	/**
	 * Returns the value of the '<em><b>Num To Keep Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num To Keep Str</em>' attribute.
	 * @see #setNumToKeepStr(short)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getBuildDiscarder_NumToKeepStr()
	 * @model required="true"
	 * @generated
	 */
	short getNumToKeepStr();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.BuildDiscarder#getNumToKeepStr <em>Num To Keep Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num To Keep Str</em>' attribute.
	 * @see #getNumToKeepStr()
	 * @generated
	 */
	void setNumToKeepStr(short value);

} // BuildDiscarder
