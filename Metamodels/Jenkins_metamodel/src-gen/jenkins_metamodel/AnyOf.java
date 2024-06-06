/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.AnyOf#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAnyOf()
 * @model
 * @generated
 */
public interface AnyOf extends When {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAnyOf_When()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<When> getWhen();

} // AnyOf
