/**
 */
package gHA_metamodel;

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
 *   <li>{@link gHA_metamodel.Job#getSteps <em>Steps</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getIf <em>If</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getDefaultsetting <em>Defaultsetting</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getNeed <em>Need</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getTimeout_minutes <em>Timeout minutes</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getContinue_on_error <em>Continue on error</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getServices <em>Services</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getActions <em>Actions</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getRunner <em>Runner</em>}</li>
 *   <li>{@link gHA_metamodel.Job#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see gHA_metamodel.GHA_metamodelPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(If)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_If()
	 * @model containment="true"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference.
	 * @see #setStrategy(Strategy)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Strategy()
	 * @model containment="true"
	 * @generated
	 */
	Strategy getStrategy();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getStrategy <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' containment reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Strategy value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference.
	 * @see #setConcurrency(Concurrency)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Concurrency()
	 * @model containment="true"
	 * @generated
	 */
	Concurrency getConcurrency();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getConcurrency <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' containment reference.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Concurrency value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Defaultsetting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultsetting</em>' containment reference.
	 * @see #setDefaultsetting(DefaultSetting)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Defaultsetting()
	 * @model containment="true"
	 * @generated
	 */
	DefaultSetting getDefaultsetting();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getDefaultsetting <em>Defaultsetting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultsetting</em>' containment reference.
	 * @see #getDefaultsetting()
	 * @generated
	 */
	void setDefaultsetting(DefaultSetting value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Envs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getEnvs();

	/**
	 * Returns the value of the '<em><b>Need</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need</em>' containment reference.
	 * @see #setNeed(Need)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Need()
	 * @model containment="true"
	 * @generated
	 */
	Need getNeed();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getNeed <em>Need</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need</em>' containment reference.
	 * @see #getNeed()
	 * @generated
	 */
	void setNeed(Need value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Timeout minutes</b></em>' attribute.
	 * The default value is <code>"360"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout minutes</em>' attribute.
	 * @see #setTimeout_minutes(int)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Timeout_minutes()
	 * @model default="360"
	 * @generated
	 */
	int getTimeout_minutes();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getTimeout_minutes <em>Timeout minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout minutes</em>' attribute.
	 * @see #getTimeout_minutes()
	 * @generated
	 */
	void setTimeout_minutes(int value);

	/**
	 * Returns the value of the '<em><b>Continue on error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue on error</em>' attribute.
	 * @see #setContinue_on_error(String)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Continue_on_error()
	 * @model
	 * @generated
	 */
	String getContinue_on_error();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getContinue_on_error <em>Continue on error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue on error</em>' attribute.
	 * @see #getContinue_on_error()
	 * @generated
	 */
	void setContinue_on_error(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link gHA_metamodel.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

	/**
	 * Returns the value of the '<em><b>Runner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runner</em>' containment reference.
	 * @see #setRunner(Runs_On)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Runner()
	 * @model containment="true"
	 * @generated
	 */
	Runs_On getRunner();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getRunner <em>Runner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runner</em>' containment reference.
	 * @see #getRunner()
	 * @generated
	 */
	void setRunner(Runs_On value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(Container)
	 * @see gHA_metamodel.GHA_metamodelPackage#getJob_Container()
	 * @model containment="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link gHA_metamodel.Job#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // Job
