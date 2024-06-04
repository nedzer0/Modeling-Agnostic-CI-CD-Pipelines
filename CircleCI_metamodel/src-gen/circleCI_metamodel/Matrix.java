/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.Matrix#getAlias <em>Alias</em>}</li>
 *   <li>{@link circleCI_metamodel.Matrix#getMatrix_exclude <em>Matrix exclude</em>}</li>
 *   <li>{@link circleCI_metamodel.Matrix#getMatrix_params <em>Matrix params</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMatrix_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link circleCI_metamodel.Matrix#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Matrix exclude</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.MatrixParams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix exclude</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMatrix_Matrix_exclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatrixParams> getMatrix_exclude();

	/**
	 * Returns the value of the '<em><b>Matrix params</b></em>' containment reference list.
	 * The list contents are of type {@link circleCI_metamodel.MatrixParams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix params</em>' containment reference list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMatrix_Matrix_params()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MatrixParams> getMatrix_params();

} // Matrix
