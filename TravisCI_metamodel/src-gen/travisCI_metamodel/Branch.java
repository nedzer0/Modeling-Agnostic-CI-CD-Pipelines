/**
 */
package travisCI_metamodel;

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
 *   <li>{@link travisCI_metamodel.Branch#getName <em>Name</em>}</li>
 *   <li>{@link travisCI_metamodel.Branch#getBranch_type <em>Branch type</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getBranch()
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
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Branch type</b></em>' attribute.
	 * The literals are from the enumeration {@link travisCI_metamodel.BRANCH_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch type</em>' attribute.
	 * @see travisCI_metamodel.BRANCH_TYPE
	 * @see #setBranch_type(BRANCH_TYPE)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getBranch_Branch_type()
	 * @model
	 * @generated
	 */
	BRANCH_TYPE getBranch_type();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Branch#getBranch_type <em>Branch type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch type</em>' attribute.
	 * @see travisCI_metamodel.BRANCH_TYPE
	 * @see #getBranch_type()
	 * @generated
	 */
	void setBranch_type(BRANCH_TYPE value);

} // Branch
