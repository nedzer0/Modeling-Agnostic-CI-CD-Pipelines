/**
 */
package circleCI_metamodel;

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
 *   <li>{@link circleCI_metamodel.Step#getParameters <em>Parameters</em>}</li>
 *   <li>{@link circleCI_metamodel.Step#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.Step#getWhen_attribute <em>When attribute</em>}</li>
 *   <li>{@link circleCI_metamodel.Step#getTool_framework <em>Tool framework</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Parameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getStep_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>When attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When attribute</em>' containment reference.
	 * @see #setWhen_attribute(When_Attribute)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getStep_When_attribute()
	 * @model containment="true"
	 * @generated
	 */
	When_Attribute getWhen_attribute();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Step#getWhen_attribute <em>When attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When attribute</em>' containment reference.
	 * @see #getWhen_attribute()
	 * @generated
	 */
	void setWhen_attribute(When_Attribute value);

	/**
	 * Returns the value of the '<em><b>Tool framework</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.Tool_Framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool framework</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getStep_Tool_framework()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool_Framework> getTool_framework();

} // Step
