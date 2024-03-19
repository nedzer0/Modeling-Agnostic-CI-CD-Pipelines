/**
 */
package travisCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.Job#getName <em>Name</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#isFast_finish <em>Fast finish</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getStage_type <em>Stage type</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getService <em>Service</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getIf <em>If</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getJob_type <em>Job type</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getLanguage <em>Language</em>}</li>
 *   <li>{@link travisCI_metamodel.Job#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fast finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fast finish</em>' attribute.
	 * @see #setFast_finish(boolean)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Fast_finish()
	 * @model
	 * @generated
	 */
	boolean isFast_finish();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Job#isFast_finish <em>Fast finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fast finish</em>' attribute.
	 * @see #isFast_finish()
	 * @generated
	 */
	void setFast_finish(boolean value);

	/**
	 * Returns the value of the '<em><b>Stage type</b></em>' attribute.
	 * The literals are from the enumeration {@link travisCI_metamodel.STAGE_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage type</em>' attribute.
	 * @see travisCI_metamodel.STAGE_TYPE
	 * @see #setStage_type(STAGE_TYPE)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Stage_type()
	 * @model
	 * @generated
	 */
	STAGE_TYPE getStage_type();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Job#getStage_type <em>Stage type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage type</em>' attribute.
	 * @see travisCI_metamodel.STAGE_TYPE
	 * @see #getStage_type()
	 * @generated
	 */
	void setStage_type(STAGE_TYPE value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Deploy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Deploy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deploy> getDeploy();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Script}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Script()
	 * @model containment="true"
	 * @generated
	 */
	EList<Script> getScript();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(If)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_If()
	 * @model containment="true"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Job#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

	/**
	 * Returns the value of the '<em><b>Job type</b></em>' attribute.
	 * The literals are from the enumeration {@link travisCI_metamodel.JOB_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job type</em>' attribute.
	 * @see travisCI_metamodel.JOB_TYPE
	 * @see #setJob_type(JOB_TYPE)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Job_type()
	 * @model
	 * @generated
	 */
	JOB_TYPE getJob_type();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Job#getJob_type <em>Job type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job type</em>' attribute.
	 * @see travisCI_metamodel.JOB_TYPE
	 * @see #getJob_type()
	 * @generated
	 */
	void setJob_type(JOB_TYPE value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Language)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getJob_Language()
	 * @model containment="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Job#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // Job
