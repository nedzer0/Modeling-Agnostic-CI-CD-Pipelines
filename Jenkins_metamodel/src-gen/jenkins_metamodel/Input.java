/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Input#getMessage <em>Message</em>}</li>
 *   <li>{@link jenkins_metamodel.Input#getId <em>Id</em>}</li>
 *   <li>{@link jenkins_metamodel.Input#getOk <em>Ok</em>}</li>
 *   <li>{@link jenkins_metamodel.Input#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link jenkins_metamodel.Input#getSubmitterParameter <em>Submitter Parameter</em>}</li>
 *   <li>{@link jenkins_metamodel.Input#getParameter_directive <em>Parameter directive</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getInput_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Input#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getInput_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Input#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ok</em>' attribute.
	 * @see #setOk(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getInput_Ok()
	 * @model
	 * @generated
	 */
	String getOk();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Input#getOk <em>Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ok</em>' attribute.
	 * @see #getOk()
	 * @generated
	 */
	void setOk(String value);

	/**
	 * Returns the value of the '<em><b>Submitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitter</em>' attribute.
	 * @see #setSubmitter(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getInput_Submitter()
	 * @model
	 * @generated
	 */
	String getSubmitter();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Input#getSubmitter <em>Submitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter</em>' attribute.
	 * @see #getSubmitter()
	 * @generated
	 */
	void setSubmitter(String value);

	/**
	 * Returns the value of the '<em><b>Submitter Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitter Parameter</em>' attribute.
	 * @see #setSubmitterParameter(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getInput_SubmitterParameter()
	 * @model
	 * @generated
	 */
	String getSubmitterParameter();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Input#getSubmitterParameter <em>Submitter Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter Parameter</em>' attribute.
	 * @see #getSubmitterParameter()
	 * @generated
	 */
	void setSubmitterParameter(String value);

	/**
	 * Returns the value of the '<em><b>Parameter directive</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Parameter_Directive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter directive</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getInput_Parameter_directive()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter_Directive> getParameter_directive();

} // Input
