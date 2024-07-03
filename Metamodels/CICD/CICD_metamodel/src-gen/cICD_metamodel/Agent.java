/**
 */
package cICD_metamodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link cICD_metamodel.Agent#getContainer <em>Container</em>}</li>
 *   <li>{@link cICD_metamodel.Agent#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(DockerContainer)
	 * @see cICD_metamodel.CICD_metamodelPackage#getAgent_Container()
	 * @model containment="true"
	 * @generated
	 */
	DockerContainer getContainer();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Agent#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DockerContainer value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getAgent_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

} // Agent
