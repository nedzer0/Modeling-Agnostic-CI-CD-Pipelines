/**
 */
package devOps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.Artifact#getName3 <em>Name3</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Name3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name3</em>' attribute.
	 * @see #setName3(String)
	 * @see devOps.DevOpsPackage#getArtifact_Name3()
	 * @model
	 * @generated
	 */
	String getName3();

	/**
	 * Sets the value of the '{@link devOps.Artifact#getName3 <em>Name3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name3</em>' attribute.
	 * @see #getName3()
	 * @generated
	 */
	void setName3(String value);

} // Artifact
