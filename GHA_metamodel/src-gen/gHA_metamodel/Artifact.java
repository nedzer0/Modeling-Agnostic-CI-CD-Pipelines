/**
 */
package gHA_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.Artifact#getPaths <em>Paths</em>}</li>
 *   <li>{@link gHA_metamodel.Artifact#getRetention_days <em>Retention days</em>}</li>
 *   <li>{@link gHA_metamodel.Artifact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends Action {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getArtifact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getArtifact_Paths()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getPaths();

	/**
	 * Returns the value of the '<em><b>Retention days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention days</em>' attribute.
	 * @see #setRetention_days(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getArtifact_Retention_days()
	 * @model
	 * @generated
	 */
	String getRetention_days();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Artifact#getRetention_days <em>Retention days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention days</em>' attribute.
	 * @see #getRetention_days()
	 * @generated
	 */
	void setRetention_days(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gHA_metamodel.ARTIFACT_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gHA_metamodel.ARTIFACT_TYPE
	 * @see #setType(ARTIFACT_TYPE)
	 * @see gHA_metamodel.GHA_metamodelPackage#getArtifact_Type()
	 * @model
	 * @generated
	 */
	ARTIFACT_TYPE getType();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Artifact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gHA_metamodel.ARTIFACT_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(ARTIFACT_TYPE value);

} // Artifact
