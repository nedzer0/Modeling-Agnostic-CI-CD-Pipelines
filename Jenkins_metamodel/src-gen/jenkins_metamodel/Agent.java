/**
 */
package jenkins_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Agent#getLabel <em>Label</em>}</li>
 *   <li>{@link jenkins_metamodel.Agent#isResuseNode <em>Resuse Node</em>}</li>
 *   <li>{@link jenkins_metamodel.Agent#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAgent()
 * @model abstract="true"
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAgent_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Agent#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Resuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resuse Node</em>' attribute.
	 * @see #setResuseNode(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAgent_ResuseNode()
	 * @model
	 * @generated
	 */
	boolean isResuseNode();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Agent#isResuseNode <em>Resuse Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resuse Node</em>' attribute.
	 * @see #isResuseNode()
	 * @generated
	 */
	void setResuseNode(boolean value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAgent_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Agent#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

} // Agent
