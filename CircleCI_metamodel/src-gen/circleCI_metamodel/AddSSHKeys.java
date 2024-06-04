/**
 */
package circleCI_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add SSH Keys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.AddSSHKeys#getFingerprints <em>Fingerprints</em>}</li>
 * </ul>
 *
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getAddSSHKeys()
 * @model
 * @generated
 */
public interface AddSSHKeys extends Step {
	/**
	 * Returns the value of the '<em><b>Fingerprints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fingerprints</em>' attribute list.
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#getAddSSHKeys_Fingerprints()
	 * @model
	 * @generated
	 */
	EList<String> getFingerprints();

} // AddSSHKeys
