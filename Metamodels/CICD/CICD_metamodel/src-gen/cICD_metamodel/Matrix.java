/**
 */
package cICD_metamodel;

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
 *   <li>{@link cICD_metamodel.Matrix#getSteps <em>Steps</em>}</li>
 *   <li>{@link cICD_metamodel.Matrix#getName <em>Name</em>}</li>
 *   <li>{@link cICD_metamodel.Matrix#getConfigs <em>Configs</em>}</li>
 *   <li>{@link cICD_metamodel.Matrix#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getMatrix_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getMatrix_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Matrix#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.MatrixConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getMatrix_Configs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MatrixConfig> getConfigs();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link cICD_metamodel.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getMatrix_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

} // Matrix
