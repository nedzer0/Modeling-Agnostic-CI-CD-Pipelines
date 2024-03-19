/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Unless</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.When_Unless#getCondition <em>Condition</em>}</li>
 *   <li>{@link circleCI_metamodel.When_Unless#getWhen_step <em>When step</em>}</li>
 *   <li>{@link circleCI_metamodel.When_Unless#getUnless_step <em>Unless step</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWhen_Unless()
 * @model
 * @generated
 */
public interface When_Unless extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWhen_Unless_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.When_Unless#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>When step</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When step</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWhen_Unless_When_step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getWhen_step();

	/**
	 * Returns the value of the '<em><b>Unless step</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unless step</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWhen_Unless_Unless_step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getUnless_step();

} // When_Unless
