/**
 */
package travisCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.Script#getParameters <em>Parameters</em>}</li>
 *   <li>{@link travisCI_metamodel.Script#getTool_framework <em>Tool framework</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool framework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool framework</em>' containment reference.
	 * @see #setTool_framework(Tool_Framework)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getScript_Tool_framework()
	 * @model containment="true"
	 * @generated
	 */
	Tool_Framework getTool_framework();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Script#getTool_framework <em>Tool framework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool framework</em>' containment reference.
	 * @see #getTool_framework()
	 * @generated
	 */
	void setTool_framework(Tool_Framework value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Parameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getScript_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

} // Script
