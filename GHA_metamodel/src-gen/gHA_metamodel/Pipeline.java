/**
 */
package gHA_metamodel;

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
 *   <li>{@link gHA_metamodel.Pipeline#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link gHA_metamodel.Pipeline#getJobs <em>Jobs</em>}</li>
 *   <li>{@link gHA_metamodel.Pipeline#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.Pipeline#getRun_name <em>Run name</em>}</li>
 *   <li>{@link gHA_metamodel.Pipeline#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gHA_metamodel.Pipeline#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link gHA_metamodel.Pipeline#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.Pipeline#getDefaultsetting <em>Defaultsetting</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Jobs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Run name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run name</em>' attribute.
	 * @see #setRun_name(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Run_name()
	 * @model
	 * @generated
	 */
	String getRun_name();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Pipeline#getRun_name <em>Run name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run name</em>' attribute.
	 * @see #getRun_name()
	 * @generated
	 */
	void setRun_name(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference.
	 * @see #setConcurrency(Concurrency)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Concurrency()
	 * @model containment="true"
	 * @generated
	 */
	Concurrency getConcurrency();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Pipeline#getConcurrency <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' containment reference.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Concurrency value);

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Envs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getEnvs();

	/**
	 * Returns the value of the '<em><b>Defaultsetting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultsetting</em>' containment reference.
	 * @see #setDefaultsetting(DefaultSetting)
	 * @see gHA_metamodel.GHA_metamodelPackage#getPipeline_Defaultsetting()
	 * @model containment="true"
	 * @generated
	 */
	DefaultSetting getDefaultsetting();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Pipeline#getDefaultsetting <em>Defaultsetting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultsetting</em>' containment reference.
	 * @see #getDefaultsetting()
	 * @generated
	 */
	void setDefaultsetting(DefaultSetting value);

} // Pipeline
