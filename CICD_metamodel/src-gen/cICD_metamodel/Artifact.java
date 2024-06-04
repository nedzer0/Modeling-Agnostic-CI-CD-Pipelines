/**
 */
package cICD_metamodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link cICD_metamodel.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link cICD_metamodel.Artifact#getMessage <em>Message</em>}</li>
 *   <li>{@link cICD_metamodel.Artifact#getPath <em>Path</em>}</li>
 *   <li>{@link cICD_metamodel.Artifact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cICD_metamodel.CICD_metamodelPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getArtifact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see cICD_metamodel.CICD_metamodelPackage#getArtifact_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Artifact#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute list.
	 * @see cICD_metamodel.CICD_metamodelPackage#getArtifact_Path()
	 * @model
	 * @generated
	 */
	EList<String> getPath();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cICD_metamodel.ARTIFACT_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cICD_metamodel.ARTIFACT_TYPE
	 * @see #setType(ARTIFACT_TYPE)
	 * @see cICD_metamodel.CICD_metamodelPackage#getArtifact_Type()
	 * @model
	 * @generated
	 */
	ARTIFACT_TYPE getType();

	/**
	 * Sets the value of the '{@link cICD_metamodel.Artifact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cICD_metamodel.ARTIFACT_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(ARTIFACT_TYPE value);

} // Artifact
