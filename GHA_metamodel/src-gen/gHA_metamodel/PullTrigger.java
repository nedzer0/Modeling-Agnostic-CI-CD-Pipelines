/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pull Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.PullTrigger#getBranches <em>Branches</em>}</li>
 *   <li>{@link gHA_metamodel.PullTrigger#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getPullTrigger()
 * @model
 * @generated
 */
public interface PullTrigger extends EventTrigger {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPullTrigger_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Path}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPullTrigger_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<Path> getPaths();

} // PullTrigger
