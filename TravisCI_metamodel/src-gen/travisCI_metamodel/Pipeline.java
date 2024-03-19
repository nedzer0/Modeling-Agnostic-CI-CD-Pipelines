/**
 */
package travisCI_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.Pipeline#getInstall <em>Install</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getJob <em>Job</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getLanguage <em>Language</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getPipeline_environment <em>Pipeline environment</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getIf <em>If</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getBranch <em>Branch</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getStage <em>Stage</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getService <em>Service</em>}</li>
 *   <li>{@link travisCI_metamodel.Pipeline#getAllow_failure <em>Allow failure</em>}</li>
 * </ul>
 *
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Install</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Install}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Install()
	 * @model containment="true"
	 * @generated
	 */
	EList<Install> getInstall();

	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJob();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Language)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Language()
	 * @model containment="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Pipeline#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Pipeline environment</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline environment</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Pipeline_environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getPipeline_environment();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(If)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_If()
	 * @model containment="true"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Pipeline#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Branch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranch();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Stage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getStage();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link travisCI_metamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Allow failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow failure</em>' containment reference.
	 * @see #setAllow_failure(Allow_Failure)
	 * @see travisCI_metamodel.TravisCI_metamodelPackage#getPipeline_Allow_failure()
	 * @model containment="true"
	 * @generated
	 */
	Allow_Failure getAllow_failure();

	/**
	 * Sets the value of the '{@link travisCI_metamodel.Pipeline#getAllow_failure <em>Allow failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow failure</em>' containment reference.
	 * @see #getAllow_failure()
	 * @generated
	 */
	void setAllow_failure(Allow_Failure value);

} // Pipeline
