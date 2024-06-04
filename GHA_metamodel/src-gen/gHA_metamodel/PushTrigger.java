/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.PushTrigger#getBranches <em>Branches</em>}</li>
 *   <li>{@link gHA_metamodel.PushTrigger#getTags <em>Tags</em>}</li>
 *   <li>{@link gHA_metamodel.PushTrigger#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getPushTrigger()
 * @model
 * @generated
 */
public interface PushTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPushTrigger_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPushTrigger_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Path}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPushTrigger_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<Path> getPaths();

} // PushTrigger
