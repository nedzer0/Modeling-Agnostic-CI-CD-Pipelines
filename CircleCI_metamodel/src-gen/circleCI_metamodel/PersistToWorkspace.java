/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persist To Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.PersistToWorkspace#getRoot <em>Root</em>}</li>
 *   <li>{@link circleCI_metamodel.PersistToWorkspace#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPersistToWorkspace()
 * @model
 * @generated
 */
public interface PersistToWorkspace extends Step {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPersistToWorkspace_Root()
	 * @model required="true"
	 * @generated
	 */
	String getRoot();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.PersistToWorkspace#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(String value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getPersistToWorkspace_Paths()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getPaths();

} // PersistToWorkspace
