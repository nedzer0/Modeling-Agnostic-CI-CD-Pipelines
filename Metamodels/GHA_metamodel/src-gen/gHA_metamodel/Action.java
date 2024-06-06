/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Action#getUses <em>Uses</em>}</li>
 *   <li>{@link gHA_metamodel.Action#getComposite_action <em>Composite action</em>}</li>
 *   <li>{@link gHA_metamodel.Action#getWith <em>With</em>}</li>
 *   <li>{@link gHA_metamodel.Action#getWith_inputPair <em>With input Pair</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' attribute.
	 * @see #setUses(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getAction_Uses()
	 * @model required="true"
	 * @generated
	 */
	String getUses();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Action#getUses <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' attribute.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(String value);

	/**
	 * Returns the value of the '<em><b>Composite action</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite action</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getAction_Composite_action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getComposite_action();

	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.InputParams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getAction_With()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputParams> getWith();

	/**
	 * Returns the value of the '<em><b>With input Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With input Pair</em>' containment reference.
	 * @see #setWith_inputPair(InputPair)
	 * @see gHA_metamodel.GHA_metamodelPackage#getAction_With_inputPair()
	 * @model containment="true"
	 * @generated
	 */
	InputPair getWith_inputPair();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Action#getWith_inputPair <em>With input Pair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With input Pair</em>' containment reference.
	 * @see #getWith_inputPair()
	 * @generated
	 */
	void setWith_inputPair(InputPair value);

} // Action
