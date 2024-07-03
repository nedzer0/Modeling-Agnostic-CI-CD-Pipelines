/**
 */
package cICD_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.Step#getCommands <em>Commands</em>}</li>
 *   <li>{@link cICD_metamodel.Step#getParameters <em>Parameters</em>}</li>
 *   <li>{@link cICD_metamodel.Step#getCache <em>Cache</em>}</li>
 *   <li>{@link cICD_metamodel.Step#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link cICD_metamodel.Step#getIfStep <em>If Step</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getStep_Commands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Parameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getStep_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getStep_Cache()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cache> getCache();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getStep_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>If Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Step</em>' containment reference.
	 * @see #setIfStep(IfStep)
	 * @see cICD_metamodel.CICD_metamodelPackage#getStep_IfStep()
	 * @model containment="true"
	 * @generated
	 */
	IfStep getIfStep();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Step#getIfStep <em>If Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Step</em>' containment reference.
	 * @see #getIfStep()
	 * @generated
	 */
	void setIfStep(IfStep value);

} // Step
