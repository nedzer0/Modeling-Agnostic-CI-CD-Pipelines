/**
 */
package circleCI_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.When_Attribute#getWhen_type <em>When type</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWhen_Attribute()
 * @model
 * @generated
 */
public interface When_Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>When type</b></em>' attribute.
	 * The literals are from the enumeration {@link circleCI_metamodel.WHEN_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When type</em>' attribute.
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see #setWhen_type(WHEN_TYPE)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getWhen_Attribute_When_type()
	 * @model
	 * @generated
	 */
	WHEN_TYPE getWhen_type();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.When_Attribute#getWhen_type <em>When type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When type</em>' attribute.
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see #getWhen_type()
	 * @generated
	 */
	void setWhen_type(WHEN_TYPE value);

} // When_Attribute
