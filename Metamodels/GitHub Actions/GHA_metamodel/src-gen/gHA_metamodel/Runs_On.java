/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runs On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Runs_On#getLabels <em>Labels</em>}</li>
 *   <li>{@link gHA_metamodel.Runs_On#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getRuns_On()
 * @model
 * @generated
 */
public interface Runs_On extends EObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getRuns_On_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getRuns_On_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Runs_On#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

} // Runs_On
