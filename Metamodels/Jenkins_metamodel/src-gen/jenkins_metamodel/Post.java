/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Post#getCondition <em>Condition</em>}</li>
 *   <li>{@link jenkins_metamodel.Post#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link jenkins_metamodel.POST_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see jenkins_metamodel.POST_TYPE
	 * @see #setCondition(POST_TYPE)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPost_Condition()
	 * @model required="true"
	 * @generated
	 */
	POST_TYPE getCondition();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Post#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see jenkins_metamodel.POST_TYPE
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(POST_TYPE value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link jenkins_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getPost_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // Post
