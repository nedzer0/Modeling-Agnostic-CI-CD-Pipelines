/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Need#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getNeed_Jobs()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getJobs();

} // Need
