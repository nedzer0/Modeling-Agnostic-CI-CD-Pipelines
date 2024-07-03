/**
 */
package cICD_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.IfStep#getIf_steps <em>If steps</em>}</li>
 *   <li>{@link cICD_metamodel.IfStep#getElse_steps <em>Else steps</em>}</li>
 *   <li>{@link cICD_metamodel.IfStep#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getIfStep()
 * @model
 * @generated
 */
public interface IfStep extends EObject {
	/**
	 * Returns the value of the '<em><b>If steps</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If steps</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getIfStep_If_steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getIf_steps();

	/**
	 * Returns the value of the '<em><b>Else steps</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else steps</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getIfStep_Else_steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getElse_steps();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getIfStep_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link cICD_metamodel.IfStep#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // IfStep
