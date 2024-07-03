/**
 */
package circleCI_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.AttachWorkspace#getAt <em>At</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getAttachWorkspace()
 * @model
 * @generated
 */
public interface AttachWorkspace extends Step {
	/**
	 * Returns the value of the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At</em>' attribute.
	 * @see #setAt(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getAttachWorkspace_At()
	 * @model required="true"
	 * @generated
	 */
	String getAt();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.AttachWorkspace#getAt <em>At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At</em>' attribute.
	 * @see #getAt()
	 * @generated
	 */
	void setAt(String value);

} // AttachWorkspace
