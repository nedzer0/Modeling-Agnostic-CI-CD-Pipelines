/**
 */
package jenkins_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link jenkins_metamodel.Node#getCustomWorkspace <em>Custom Workspace</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Agent {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getNode_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Node#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Workspace</em>' attribute.
	 * @see #setCustomWorkspace(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getNode_CustomWorkspace()
	 * @model
	 * @generated
	 */
	String getCustomWorkspace();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Node#getCustomWorkspace <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Workspace</em>' attribute.
	 * @see #getCustomWorkspace()
	 * @generated
	 */
	void setCustomWorkspace(String value);

} // Node
