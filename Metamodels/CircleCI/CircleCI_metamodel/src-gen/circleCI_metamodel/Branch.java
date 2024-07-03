/**
 */
package circleCI_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Branch#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.Branch#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getBranch_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * The literals are from the enumeration {@link circleCI_metamodel.BRANCH_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see circleCI_metamodel.BRANCH_TYPE
	 * @see #setBranch(BRANCH_TYPE)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getBranch_Branch()
	 * @model required="true"
	 * @generated
	 */
	BRANCH_TYPE getBranch();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Branch#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see circleCI_metamodel.BRANCH_TYPE
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(BRANCH_TYPE value);

} // Branch
