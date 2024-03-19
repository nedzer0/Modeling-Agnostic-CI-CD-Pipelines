/**
 */
package jenkins_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Tool#getTool <em>Tool</em>}</li>
 *   <li>{@link jenkins_metamodel.Tool#getTool_name <em>Tool name</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see #setTool(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTool_Tool()
	 * @model
	 * @generated
	 */
	String getTool();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Tool#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(String value);

	/**
	 * Returns the value of the '<em><b>Tool name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool name</em>' attribute.
	 * @see #setTool_name(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTool_Tool_name()
	 * @model
	 * @generated
	 */
	String getTool_name();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Tool#getTool_name <em>Tool name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool name</em>' attribute.
	 * @see #getTool_name()
	 * @generated
	 */
	void setTool_name(String value);

} // Tool
