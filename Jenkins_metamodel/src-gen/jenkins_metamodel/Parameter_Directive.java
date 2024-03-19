/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Parameter_Directive#getParam_type <em>Param type</em>}</li>
 *   <li>{@link jenkins_metamodel.Parameter_Directive#getParam_value <em>Param value</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getParameter_Directive()
 * @model
 * @generated
 */
public interface Parameter_Directive extends EObject {
	/**
	 * Returns the value of the '<em><b>Param type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param type</em>' attribute.
	 * @see #setParam_type(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getParameter_Directive_Param_type()
	 * @model
	 * @generated
	 */
	String getParam_type();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Parameter_Directive#getParam_type <em>Param type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param type</em>' attribute.
	 * @see #getParam_type()
	 * @generated
	 */
	void setParam_type(String value);

	/**
	 * Returns the value of the '<em><b>Param value</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Param_Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param value</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getParameter_Directive_Param_value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Param_Value> getParam_value();

} // Parameter_Directive
