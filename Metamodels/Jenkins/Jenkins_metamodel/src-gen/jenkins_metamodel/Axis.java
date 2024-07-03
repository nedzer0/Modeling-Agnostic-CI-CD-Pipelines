/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Axis#getName <em>Name</em>}</li>
 *   <li>{@link jenkins_metamodel.Axis#getValues <em>Values</em>}</li>
 *   <li>{@link jenkins_metamodel.Axis#isExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAxis()
 * @model
 * @generated
 */
public interface Axis extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAxis_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Axis#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAxis_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' attribute.
	 * @see #setExclude(boolean)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getAxis_Exclude()
	 * @model
	 * @generated
	 */
	boolean isExclude();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Axis#isExclude <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' attribute.
	 * @see #isExclude()
	 * @generated
	 */
	void setExclude(boolean value);

} // Axis
