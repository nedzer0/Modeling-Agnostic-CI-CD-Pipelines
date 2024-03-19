/**
 */
package devOps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.IfThenElse#getCondition <em>Condition</em>}</li>
 *   <li>{@link devOps.IfThenElse#getIf <em>If</em>}</li>
 *   <li>{@link devOps.IfThenElse#getElse <em>Else</em>}</li>
 *   <li>{@link devOps.IfThenElse#getIfelse <em>Ifelse</em>}</li>
 *   <li>{@link devOps.IfThenElse#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see devOps.DevOpsPackage#getIfThenElse_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link devOps.IfThenElse#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getIfThenElse_If()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getIf();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getIfThenElse_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getElse();

	/**
	 * Returns the value of the '<em><b>Ifelse</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifelse</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getIfThenElse_Ifelse()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfThenElse> getIfelse();

	/**
	 * Returns the value of the '<em><b>Elseif</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getIfThenElse_Elseif()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfThenElse> getElseif();

} // IfThenElse
