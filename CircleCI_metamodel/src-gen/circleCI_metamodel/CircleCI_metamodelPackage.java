/**
 */
package circleCI_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see circleCI_metamodel.CircleCI_metamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface CircleCI_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "circleCI_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/circleCI_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "circleCI_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircleCI_metamodelPackage eINSTANCE = circleCI_metamodel.impl.CircleCI_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.StepImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.RunImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__WHEN = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__BACKGROUND = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Working directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__WORKING_DIRECTORY = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__ENVIRONMENTS = STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No output timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__NO_OUTPUT_TIMEOUT = STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__SHELL = STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Run commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RUN_COMMANDS = STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__PARAMETERS = STEP_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = STEP_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.Docker_AuthImpl <em>Docker Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.Docker_AuthImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getDocker_Auth()
	 * @generated
	 */
	int DOCKER_AUTH = 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AUTH__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AUTH__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Docker Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AUTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Docker Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AUTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.RestoreCacheImpl <em>Restore Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.RestoreCacheImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getRestoreCache()
	 * @generated
	 */
	int RESTORE_CACHE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__KEY = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__KEYS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Restore Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Restore Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.Docker_Aws_AuthsImpl <em>Docker Aws Auths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.Docker_Aws_AuthsImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getDocker_Aws_Auths()
	 * @generated
	 */
	int DOCKER_AWS_AUTHS = 4;

	/**
	 * The feature id for the '<em><b>Aws access key id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID = 0;

	/**
	 * The feature id for the '<em><b>Aws secret access key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY = 1;

	/**
	 * The number of structural features of the '<em>Docker Aws Auths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AWS_AUTHS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Docker Aws Auths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AWS_AUTHS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.JobImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 5;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENTS = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 3;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARALLELISM = 4;

	/**
	 * The feature id for the '<em><b>Reuse Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__REUSE_EXECUTOR = 5;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__EXECUTORS = 6;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.ExecutorImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__RESOURCE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__SHELL = 2;

	/**
	 * The feature id for the '<em><b>Working directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__WORKING_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__ENVIRONMENTS = 4;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.MachineImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENVIRONMENTS = EXECUTOR__ENVIRONMENTS;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IMAGE = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Docker layer caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__DOCKER_LAYER_CACHING = EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.PersistToWorkspaceImpl <em>Persist To Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.PersistToWorkspaceImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPersistToWorkspace()
	 * @generated
	 */
	int PERSIST_TO_WORKSPACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE__ROOT = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE__PATHS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Persist To Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Persist To Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.StoreArtifactImpl <em>Store Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.StoreArtifactImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStoreArtifact()
	 * @generated
	 */
	int STORE_ARTIFACT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT__PATH = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT__DESTINATION = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Store Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Store Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.StoreTestResultsImpl <em>Store Test Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.StoreTestResultsImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStoreTestResults()
	 * @generated
	 */
	int STORE_TEST_RESULTS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_TEST_RESULTS__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_TEST_RESULTS__PATH = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Store Test Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_TEST_RESULTS_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Store Test Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_TEST_RESULTS_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.SetupRemoteDockerImpl <em>Setup Remote Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.SetupRemoteDockerImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getSetupRemoteDocker()
	 * @generated
	 */
	int SETUP_REMOTE_DOCKER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Docker layer caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER__VERSION = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Setup Remote Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Setup Remote Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.ParametersImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 11;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.ParameterImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Enum Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ENUM_VALUES = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.MacOsImpl <em>Mac Os</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.MacOsImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMacOs()
	 * @generated
	 */
	int MAC_OS = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__ENVIRONMENTS = EXECUTOR__ENVIRONMENTS;

	/**
	 * The feature id for the '<em><b>Xcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__XCODE = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mac Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mac Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.WorkflowImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 14;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TRIGGERS = 0;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__BRANCHES = 1;

	/**
	 * The feature id for the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WHEN_UNLESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Jobworkflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__JOBWORKFLOW = 5;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.EnvironmentImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.DockerImpl <em>Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.DockerImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getDocker()
	 * @generated
	 */
	int DOCKER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ENVIRONMENTS = EXECUTOR__ENVIRONMENTS;

	/**
	 * The feature id for the '<em><b>Docker auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__DOCKER_AUTH = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Docker aws auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__DOCKER_AWS_AUTH = EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__IMAGE = EXECUTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ENTRYPOINT = EXECUTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__COMMAND = EXECUTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__USER = EXECUTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.AddSSHKeysImpl <em>Add SSH Keys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.AddSSHKeysImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getAddSSHKeys()
	 * @generated
	 */
	int ADD_SSH_KEYS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SSH_KEYS__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Fingerprints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SSH_KEYS__FINGERPRINTS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add SSH Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SSH_KEYS_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add SSH Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SSH_KEYS_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.SaveCacheImpl <em>Save Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.SaveCacheImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getSaveCache()
	 * @generated
	 */
	int SAVE_CACHE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__PATHS = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__KEY = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__WHEN = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Save Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Save Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.AttachWorkspaceImpl <em>Attach Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.AttachWorkspaceImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getAttachWorkspace()
	 * @generated
	 */
	int ATTACH_WORKSPACE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_WORKSPACE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_WORKSPACE__AT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attach Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_WORKSPACE_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attach Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_WORKSPACE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.When_UnlessImpl <em>When Unless</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.When_UnlessImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWhen_Unless()
	 * @generated
	 */
	int WHEN_UNLESS = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>When step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__WHEN_STEP = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unless step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__UNLESS_STEP = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__CONDITION = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>When Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>When Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.BranchImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH = 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.RunCommandImpl <em>Run Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.RunCommandImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getRunCommand()
	 * @generated
	 */
	int RUN_COMMAND = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_COMMAND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Run Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Run Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.TriggerImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 23;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CRON = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.CheckoutImpl <em>Checkout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.CheckoutImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getCheckout()
	 * @generated
	 */
	int CHECKOUT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT__PATH = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Checkout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Checkout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.PipelineImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 26;

	/**
	 * The feature id for the '<em><b>Orbs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ORBS = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__WORKFLOW = 2;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOBS = 3;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__EXECUTORS = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__VERSION = 5;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SETUP = 6;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.OrbImpl <em>Orb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.OrbImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getOrb()
	 * @generated
	 */
	int ORB = 27;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.CommandImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 28;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.MatrixImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 29;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Matrix exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__MATRIX_EXCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Matrix params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__MATRIX_PARAMS = 2;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.JobWorkflowImpl <em>Job Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.JobWorkflowImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getJobWorkflow()
	 * @generated
	 */
	int JOB_WORKFLOW = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW__REQUIRES = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Approval Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW__APPROVAL_JOB = 3;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW__BRANCHES = 4;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW__MATRIX = 5;

	/**
	 * The number of structural features of the '<em>Job Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Job Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.MatrixParamsImpl <em>Matrix Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.MatrixParamsImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMatrixParams()
	 * @generated
	 */
	int MATRIX_PARAMS = 31;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMS__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Matrix Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matrix Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.PARAMETER_TYPES <em>PARAMETER TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.PARAMETER_TYPES
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPARAMETER_TYPES()
	 * @generated
	 */
	int PARAMETER_TYPES = 32;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.BRANCH_TYPE
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getBRANCH_TYPE()
	 * @generated
	 */
	int BRANCH_TYPE = 33;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWHEN_TYPE()
	 * @generated
	 */
	int WHEN_TYPE = 34;

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see circleCI_metamodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see circleCI_metamodel.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Run#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see circleCI_metamodel.Run#getWhen()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_When();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Run#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see circleCI_metamodel.Run#isBackground()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Background();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Run#getWorking_directory <em>Working directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working directory</em>'.
	 * @see circleCI_metamodel.Run#getWorking_directory()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Working_directory();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Run#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see circleCI_metamodel.Run#getEnvironments()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Environments();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Run#getNo_output_timeout <em>No output timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No output timeout</em>'.
	 * @see circleCI_metamodel.Run#getNo_output_timeout()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_No_output_timeout();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Run#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see circleCI_metamodel.Run#getShell()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Shell();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Run#getRun_commands <em>Run commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run commands</em>'.
	 * @see circleCI_metamodel.Run#getRun_commands()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Run_commands();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Run#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see circleCI_metamodel.Run#getParameters()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Parameters();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Docker_Auth <em>Docker Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Auth</em>'.
	 * @see circleCI_metamodel.Docker_Auth
	 * @generated
	 */
	EClass getDocker_Auth();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Docker_Auth#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see circleCI_metamodel.Docker_Auth#getUsername()
	 * @see #getDocker_Auth()
	 * @generated
	 */
	EAttribute getDocker_Auth_Username();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Docker_Auth#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see circleCI_metamodel.Docker_Auth#getPassword()
	 * @see #getDocker_Auth()
	 * @generated
	 */
	EAttribute getDocker_Auth_Password();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.RestoreCache <em>Restore Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restore Cache</em>'.
	 * @see circleCI_metamodel.RestoreCache
	 * @generated
	 */
	EClass getRestoreCache();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.RestoreCache#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see circleCI_metamodel.RestoreCache#getKey()
	 * @see #getRestoreCache()
	 * @generated
	 */
	EAttribute getRestoreCache_Key();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.RestoreCache#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keys</em>'.
	 * @see circleCI_metamodel.RestoreCache#getKeys()
	 * @see #getRestoreCache()
	 * @generated
	 */
	EAttribute getRestoreCache_Keys();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Docker_Aws_Auths <em>Docker Aws Auths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Aws Auths</em>'.
	 * @see circleCI_metamodel.Docker_Aws_Auths
	 * @generated
	 */
	EClass getDocker_Aws_Auths();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Docker_Aws_Auths#getAws_access_key_id <em>Aws access key id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws access key id</em>'.
	 * @see circleCI_metamodel.Docker_Aws_Auths#getAws_access_key_id()
	 * @see #getDocker_Aws_Auths()
	 * @generated
	 */
	EAttribute getDocker_Aws_Auths_Aws_access_key_id();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Docker_Aws_Auths#getAws_secret_access_key <em>Aws secret access key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws secret access key</em>'.
	 * @see circleCI_metamodel.Docker_Aws_Auths#getAws_secret_access_key()
	 * @see #getDocker_Aws_Auths()
	 * @generated
	 */
	EAttribute getDocker_Aws_Auths_Aws_secret_access_key();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see circleCI_metamodel.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Job#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see circleCI_metamodel.Job#getEnvironments()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Job#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see circleCI_metamodel.Job#getSteps()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Job#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see circleCI_metamodel.Job#getParameters()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Job#getParallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallelism</em>'.
	 * @see circleCI_metamodel.Job#getParallelism()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Parallelism();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Job#getReuseExecutor <em>Reuse Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reuse Executor</em>'.
	 * @see circleCI_metamodel.Job#getReuseExecutor()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_ReuseExecutor();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Job#getExecutors <em>Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executors</em>'.
	 * @see circleCI_metamodel.Job#getExecutors()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Executors();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see circleCI_metamodel.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Machine#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see circleCI_metamodel.Machine#getImage()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Image();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Machine#isDocker_layer_caching <em>Docker layer caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker layer caching</em>'.
	 * @see circleCI_metamodel.Machine#isDocker_layer_caching()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Docker_layer_caching();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.PersistToWorkspace <em>Persist To Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persist To Workspace</em>'.
	 * @see circleCI_metamodel.PersistToWorkspace
	 * @generated
	 */
	EClass getPersistToWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.PersistToWorkspace#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see circleCI_metamodel.PersistToWorkspace#getRoot()
	 * @see #getPersistToWorkspace()
	 * @generated
	 */
	EAttribute getPersistToWorkspace_Root();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.PersistToWorkspace#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see circleCI_metamodel.PersistToWorkspace#getPaths()
	 * @see #getPersistToWorkspace()
	 * @generated
	 */
	EAttribute getPersistToWorkspace_Paths();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.StoreArtifact <em>Store Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Artifact</em>'.
	 * @see circleCI_metamodel.StoreArtifact
	 * @generated
	 */
	EClass getStoreArtifact();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.StoreArtifact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see circleCI_metamodel.StoreArtifact#getPath()
	 * @see #getStoreArtifact()
	 * @generated
	 */
	EAttribute getStoreArtifact_Path();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.StoreArtifact#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see circleCI_metamodel.StoreArtifact#getDestination()
	 * @see #getStoreArtifact()
	 * @generated
	 */
	EAttribute getStoreArtifact_Destination();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.StoreTestResults <em>Store Test Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Test Results</em>'.
	 * @see circleCI_metamodel.StoreTestResults
	 * @generated
	 */
	EClass getStoreTestResults();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.StoreTestResults#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see circleCI_metamodel.StoreTestResults#getPath()
	 * @see #getStoreTestResults()
	 * @generated
	 */
	EAttribute getStoreTestResults_Path();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.SetupRemoteDocker <em>Setup Remote Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup Remote Docker</em>'.
	 * @see circleCI_metamodel.SetupRemoteDocker
	 * @generated
	 */
	EClass getSetupRemoteDocker();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.SetupRemoteDocker#isDocker_layer_caching <em>Docker layer caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker layer caching</em>'.
	 * @see circleCI_metamodel.SetupRemoteDocker#isDocker_layer_caching()
	 * @see #getSetupRemoteDocker()
	 * @generated
	 */
	EAttribute getSetupRemoteDocker_Docker_layer_caching();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.SetupRemoteDocker#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see circleCI_metamodel.SetupRemoteDocker#getVersion()
	 * @see #getSetupRemoteDocker()
	 * @generated
	 */
	EAttribute getSetupRemoteDocker_Version();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see circleCI_metamodel.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Parameters#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see circleCI_metamodel.Parameters#getParameter()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Parameter();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see circleCI_metamodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see circleCI_metamodel.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see circleCI_metamodel.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see circleCI_metamodel.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.Parameter#getEnumValues <em>Enum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Values</em>'.
	 * @see circleCI_metamodel.Parameter#getEnumValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_EnumValues();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.MacOs <em>Mac Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac Os</em>'.
	 * @see circleCI_metamodel.MacOs
	 * @generated
	 */
	EClass getMacOs();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.MacOs#getXcode <em>Xcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcode</em>'.
	 * @see circleCI_metamodel.MacOs#getXcode()
	 * @see #getMacOs()
	 * @generated
	 */
	EAttribute getMacOs_Xcode();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see circleCI_metamodel.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Workflow#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see circleCI_metamodel.Workflow#getTriggers()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Workflow#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see circleCI_metamodel.Workflow#getBranches()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Branches();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Workflow#getWhen_unless <em>When unless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When unless</em>'.
	 * @see circleCI_metamodel.Workflow#getWhen_unless()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_When_unless();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Workflow#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see circleCI_metamodel.Workflow#getVersion()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Workflow#getJobworkflow <em>Jobworkflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobworkflow</em>'.
	 * @see circleCI_metamodel.Workflow#getJobworkflow()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Jobworkflow();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see circleCI_metamodel.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Environment#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see circleCI_metamodel.Environment#getKey()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Key();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Environment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see circleCI_metamodel.Environment#getValue()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Value();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker</em>'.
	 * @see circleCI_metamodel.Docker
	 * @generated
	 */
	EClass getDocker();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Docker#getDocker_auth <em>Docker auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker auth</em>'.
	 * @see circleCI_metamodel.Docker#getDocker_auth()
	 * @see #getDocker()
	 * @generated
	 */
	EReference getDocker_Docker_auth();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Docker#getDocker_aws_auth <em>Docker aws auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker aws auth</em>'.
	 * @see circleCI_metamodel.Docker#getDocker_aws_auth()
	 * @see #getDocker()
	 * @generated
	 */
	EReference getDocker_Docker_aws_auth();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Docker#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see circleCI_metamodel.Docker#getImage()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Image();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.Docker#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entrypoint</em>'.
	 * @see circleCI_metamodel.Docker#getEntrypoint()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Entrypoint();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.Docker#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Command</em>'.
	 * @see circleCI_metamodel.Docker#getCommand()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Command();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Docker#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see circleCI_metamodel.Docker#getUser()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_User();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.AddSSHKeys <em>Add SSH Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add SSH Keys</em>'.
	 * @see circleCI_metamodel.AddSSHKeys
	 * @generated
	 */
	EClass getAddSSHKeys();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.AddSSHKeys#getFingerprints <em>Fingerprints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fingerprints</em>'.
	 * @see circleCI_metamodel.AddSSHKeys#getFingerprints()
	 * @see #getAddSSHKeys()
	 * @generated
	 */
	EAttribute getAddSSHKeys_Fingerprints();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.SaveCache <em>Save Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Cache</em>'.
	 * @see circleCI_metamodel.SaveCache
	 * @generated
	 */
	EClass getSaveCache();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.SaveCache#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see circleCI_metamodel.SaveCache#getPaths()
	 * @see #getSaveCache()
	 * @generated
	 */
	EAttribute getSaveCache_Paths();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.SaveCache#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see circleCI_metamodel.SaveCache#getKey()
	 * @see #getSaveCache()
	 * @generated
	 */
	EAttribute getSaveCache_Key();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.SaveCache#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see circleCI_metamodel.SaveCache#getWhen()
	 * @see #getSaveCache()
	 * @generated
	 */
	EAttribute getSaveCache_When();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.AttachWorkspace <em>Attach Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach Workspace</em>'.
	 * @see circleCI_metamodel.AttachWorkspace
	 * @generated
	 */
	EClass getAttachWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.AttachWorkspace#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At</em>'.
	 * @see circleCI_metamodel.AttachWorkspace#getAt()
	 * @see #getAttachWorkspace()
	 * @generated
	 */
	EAttribute getAttachWorkspace_At();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.When_Unless <em>When Unless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Unless</em>'.
	 * @see circleCI_metamodel.When_Unless
	 * @generated
	 */
	EClass getWhen_Unless();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.When_Unless#getWhen_step <em>When step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When step</em>'.
	 * @see circleCI_metamodel.When_Unless#getWhen_step()
	 * @see #getWhen_Unless()
	 * @generated
	 */
	EReference getWhen_Unless_When_step();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.When_Unless#getUnless_step <em>Unless step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unless step</em>'.
	 * @see circleCI_metamodel.When_Unless#getUnless_step()
	 * @see #getWhen_Unless()
	 * @generated
	 */
	EReference getWhen_Unless_Unless_step();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.When_Unless#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see circleCI_metamodel.When_Unless#getCondition()
	 * @see #getWhen_Unless()
	 * @generated
	 */
	EAttribute getWhen_Unless_Condition();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see circleCI_metamodel.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Branch#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see circleCI_metamodel.Branch#getBranch()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Branch();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.RunCommand <em>Run Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Command</em>'.
	 * @see circleCI_metamodel.RunCommand
	 * @generated
	 */
	EClass getRunCommand();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.RunCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.RunCommand#getName()
	 * @see #getRunCommand()
	 * @generated
	 */
	EAttribute getRunCommand_Name();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see circleCI_metamodel.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Trigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see circleCI_metamodel.Trigger#getCron()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Checkout <em>Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkout</em>'.
	 * @see circleCI_metamodel.Checkout
	 * @generated
	 */
	EClass getCheckout();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Checkout#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see circleCI_metamodel.Checkout#getPath()
	 * @see #getCheckout()
	 * @generated
	 */
	EAttribute getCheckout_Path();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see circleCI_metamodel.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Executor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Executor#getName()
	 * @see #getExecutor()
	 * @generated
	 */
	EAttribute getExecutor_Name();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Executor#getResourceClass <em>Resource Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Class</em>'.
	 * @see circleCI_metamodel.Executor#getResourceClass()
	 * @see #getExecutor()
	 * @generated
	 */
	EAttribute getExecutor_ResourceClass();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Executor#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see circleCI_metamodel.Executor#getShell()
	 * @see #getExecutor()
	 * @generated
	 */
	EAttribute getExecutor_Shell();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Executor#getWorking_directory <em>Working directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working directory</em>'.
	 * @see circleCI_metamodel.Executor#getWorking_directory()
	 * @see #getExecutor()
	 * @generated
	 */
	EAttribute getExecutor_Working_directory();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Executor#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see circleCI_metamodel.Executor#getEnvironments()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_Environments();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see circleCI_metamodel.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Pipeline#getOrbs <em>Orbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orbs</em>'.
	 * @see circleCI_metamodel.Pipeline#getOrbs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Orbs();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Pipeline#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see circleCI_metamodel.Pipeline#getCommands()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Commands();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Pipeline#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow</em>'.
	 * @see circleCI_metamodel.Pipeline#getWorkflow()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Workflow();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Pipeline#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see circleCI_metamodel.Pipeline#getJobs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Jobs();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Pipeline#getExecutors <em>Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executors</em>'.
	 * @see circleCI_metamodel.Pipeline#getExecutors()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Executors();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Pipeline#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see circleCI_metamodel.Pipeline#getVersion()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Version();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Pipeline#isSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setup</em>'.
	 * @see circleCI_metamodel.Pipeline#isSetup()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Setup();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Orb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orb</em>'.
	 * @see circleCI_metamodel.Orb
	 * @generated
	 */
	EClass getOrb();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Orb#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see circleCI_metamodel.Orb#getKey()
	 * @see #getOrb()
	 * @generated
	 */
	EAttribute getOrb_Key();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Orb#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see circleCI_metamodel.Orb#getValue()
	 * @see #getOrb()
	 * @generated
	 */
	EAttribute getOrb_Value();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see circleCI_metamodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Command#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see circleCI_metamodel.Command#getSteps()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Command#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see circleCI_metamodel.Command#getParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Command#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see circleCI_metamodel.Command#getDescription()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Description();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see circleCI_metamodel.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Matrix#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see circleCI_metamodel.Matrix#getAlias()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Matrix#getMatrix_exclude <em>Matrix exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix exclude</em>'.
	 * @see circleCI_metamodel.Matrix#getMatrix_exclude()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Matrix_exclude();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Matrix#getMatrix_params <em>Matrix params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix params</em>'.
	 * @see circleCI_metamodel.Matrix#getMatrix_params()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Matrix_params();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.JobWorkflow <em>Job Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Workflow</em>'.
	 * @see circleCI_metamodel.JobWorkflow
	 * @generated
	 */
	EClass getJobWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.JobWorkflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.JobWorkflow#getName()
	 * @see #getJobWorkflow()
	 * @generated
	 */
	EAttribute getJobWorkflow_Name();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.JobWorkflow#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requires</em>'.
	 * @see circleCI_metamodel.JobWorkflow#getRequires()
	 * @see #getJobWorkflow()
	 * @generated
	 */
	EAttribute getJobWorkflow_Requires();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.JobWorkflow#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context</em>'.
	 * @see circleCI_metamodel.JobWorkflow#getContext()
	 * @see #getJobWorkflow()
	 * @generated
	 */
	EAttribute getJobWorkflow_Context();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.JobWorkflow#isApprovalJob <em>Approval Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Job</em>'.
	 * @see circleCI_metamodel.JobWorkflow#isApprovalJob()
	 * @see #getJobWorkflow()
	 * @generated
	 */
	EAttribute getJobWorkflow_ApprovalJob();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.JobWorkflow#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see circleCI_metamodel.JobWorkflow#getBranches()
	 * @see #getJobWorkflow()
	 * @generated
	 */
	EReference getJobWorkflow_Branches();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.JobWorkflow#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see circleCI_metamodel.JobWorkflow#getMatrix()
	 * @see #getJobWorkflow()
	 * @generated
	 */
	EReference getJobWorkflow_Matrix();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.MatrixParams <em>Matrix Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Params</em>'.
	 * @see circleCI_metamodel.MatrixParams
	 * @generated
	 */
	EClass getMatrixParams();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.MatrixParams#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see circleCI_metamodel.MatrixParams#getKey()
	 * @see #getMatrixParams()
	 * @generated
	 */
	EAttribute getMatrixParams_Key();

	/**
	 * Returns the meta object for the attribute list '{@link circleCI_metamodel.MatrixParams#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see circleCI_metamodel.MatrixParams#getValues()
	 * @see #getMatrixParams()
	 * @generated
	 */
	EAttribute getMatrixParams_Values();

	/**
	 * Returns the meta object for enum '{@link circleCI_metamodel.PARAMETER_TYPES <em>PARAMETER TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PARAMETER TYPES</em>'.
	 * @see circleCI_metamodel.PARAMETER_TYPES
	 * @generated
	 */
	EEnum getPARAMETER_TYPES();

	/**
	 * Returns the meta object for enum '{@link circleCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BRANCH TYPE</em>'.
	 * @see circleCI_metamodel.BRANCH_TYPE
	 * @generated
	 */
	EEnum getBRANCH_TYPE();

	/**
	 * Returns the meta object for enum '{@link circleCI_metamodel.WHEN_TYPE <em>WHEN TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WHEN TYPE</em>'.
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @generated
	 */
	EEnum getWHEN_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircleCI_metamodelFactory getCircleCI_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.StepImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.RunImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__WHEN = eINSTANCE.getRun_When();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__BACKGROUND = eINSTANCE.getRun_Background();

		/**
		 * The meta object literal for the '<em><b>Working directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__WORKING_DIRECTORY = eINSTANCE.getRun_Working_directory();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__ENVIRONMENTS = eINSTANCE.getRun_Environments();

		/**
		 * The meta object literal for the '<em><b>No output timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__NO_OUTPUT_TIMEOUT = eINSTANCE.getRun_No_output_timeout();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__SHELL = eINSTANCE.getRun_Shell();

		/**
		 * The meta object literal for the '<em><b>Run commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__RUN_COMMANDS = eINSTANCE.getRun_Run_commands();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__PARAMETERS = eINSTANCE.getRun_Parameters();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.Docker_AuthImpl <em>Docker Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.Docker_AuthImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getDocker_Auth()
		 * @generated
		 */
		EClass DOCKER_AUTH = eINSTANCE.getDocker_Auth();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_AUTH__USERNAME = eINSTANCE.getDocker_Auth_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_AUTH__PASSWORD = eINSTANCE.getDocker_Auth_Password();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.RestoreCacheImpl <em>Restore Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.RestoreCacheImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getRestoreCache()
		 * @generated
		 */
		EClass RESTORE_CACHE = eINSTANCE.getRestoreCache();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTORE_CACHE__KEY = eINSTANCE.getRestoreCache_Key();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTORE_CACHE__KEYS = eINSTANCE.getRestoreCache_Keys();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.Docker_Aws_AuthsImpl <em>Docker Aws Auths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.Docker_Aws_AuthsImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getDocker_Aws_Auths()
		 * @generated
		 */
		EClass DOCKER_AWS_AUTHS = eINSTANCE.getDocker_Aws_Auths();

		/**
		 * The meta object literal for the '<em><b>Aws access key id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID = eINSTANCE.getDocker_Aws_Auths_Aws_access_key_id();

		/**
		 * The meta object literal for the '<em><b>Aws secret access key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY = eINSTANCE.getDocker_Aws_Auths_Aws_secret_access_key();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.JobImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENTS = eINSTANCE.getJob_Environments();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEPS = eINSTANCE.getJob_Steps();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PARAMETERS = eINSTANCE.getJob_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__PARALLELISM = eINSTANCE.getJob_Parallelism();

		/**
		 * The meta object literal for the '<em><b>Reuse Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__REUSE_EXECUTOR = eINSTANCE.getJob_ReuseExecutor();

		/**
		 * The meta object literal for the '<em><b>Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__EXECUTORS = eINSTANCE.getJob_Executors();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.MachineImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__IMAGE = eINSTANCE.getMachine_Image();

		/**
		 * The meta object literal for the '<em><b>Docker layer caching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__DOCKER_LAYER_CACHING = eINSTANCE.getMachine_Docker_layer_caching();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.PersistToWorkspaceImpl <em>Persist To Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.PersistToWorkspaceImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPersistToWorkspace()
		 * @generated
		 */
		EClass PERSIST_TO_WORKSPACE = eINSTANCE.getPersistToWorkspace();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSIST_TO_WORKSPACE__ROOT = eINSTANCE.getPersistToWorkspace_Root();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSIST_TO_WORKSPACE__PATHS = eINSTANCE.getPersistToWorkspace_Paths();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.StoreArtifactImpl <em>Store Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.StoreArtifactImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStoreArtifact()
		 * @generated
		 */
		EClass STORE_ARTIFACT = eINSTANCE.getStoreArtifact();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_ARTIFACT__PATH = eINSTANCE.getStoreArtifact_Path();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_ARTIFACT__DESTINATION = eINSTANCE.getStoreArtifact_Destination();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.StoreTestResultsImpl <em>Store Test Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.StoreTestResultsImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStoreTestResults()
		 * @generated
		 */
		EClass STORE_TEST_RESULTS = eINSTANCE.getStoreTestResults();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_TEST_RESULTS__PATH = eINSTANCE.getStoreTestResults_Path();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.SetupRemoteDockerImpl <em>Setup Remote Docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.SetupRemoteDockerImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getSetupRemoteDocker()
		 * @generated
		 */
		EClass SETUP_REMOTE_DOCKER = eINSTANCE.getSetupRemoteDocker();

		/**
		 * The meta object literal for the '<em><b>Docker layer caching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING = eINSTANCE.getSetupRemoteDocker_Docker_layer_caching();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_REMOTE_DOCKER__VERSION = eINSTANCE.getSetupRemoteDocker_Version();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.ParametersImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__PARAMETER = eINSTANCE.getParameters_Parameter();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.ParameterImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Enum Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ENUM_VALUES = eINSTANCE.getParameter_EnumValues();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.MacOsImpl <em>Mac Os</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.MacOsImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMacOs()
		 * @generated
		 */
		EClass MAC_OS = eINSTANCE.getMacOs();

		/**
		 * The meta object literal for the '<em><b>Xcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_OS__XCODE = eINSTANCE.getMacOs_Xcode();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.WorkflowImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TRIGGERS = eINSTANCE.getWorkflow_Triggers();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__BRANCHES = eINSTANCE.getWorkflow_Branches();

		/**
		 * The meta object literal for the '<em><b>When unless</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__WHEN_UNLESS = eINSTANCE.getWorkflow_When_unless();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__VERSION = eINSTANCE.getWorkflow_Version();

		/**
		 * The meta object literal for the '<em><b>Jobworkflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__JOBWORKFLOW = eINSTANCE.getWorkflow_Jobworkflow();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.EnvironmentImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__KEY = eINSTANCE.getEnvironment_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__VALUE = eINSTANCE.getEnvironment_Value();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.DockerImpl <em>Docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.DockerImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getDocker()
		 * @generated
		 */
		EClass DOCKER = eINSTANCE.getDocker();

		/**
		 * The meta object literal for the '<em><b>Docker auth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER__DOCKER_AUTH = eINSTANCE.getDocker_Docker_auth();

		/**
		 * The meta object literal for the '<em><b>Docker aws auth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER__DOCKER_AWS_AUTH = eINSTANCE.getDocker_Docker_aws_auth();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__IMAGE = eINSTANCE.getDocker_Image();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__ENTRYPOINT = eINSTANCE.getDocker_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__COMMAND = eINSTANCE.getDocker_Command();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__USER = eINSTANCE.getDocker_User();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.AddSSHKeysImpl <em>Add SSH Keys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.AddSSHKeysImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getAddSSHKeys()
		 * @generated
		 */
		EClass ADD_SSH_KEYS = eINSTANCE.getAddSSHKeys();

		/**
		 * The meta object literal for the '<em><b>Fingerprints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SSH_KEYS__FINGERPRINTS = eINSTANCE.getAddSSHKeys_Fingerprints();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.SaveCacheImpl <em>Save Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.SaveCacheImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getSaveCache()
		 * @generated
		 */
		EClass SAVE_CACHE = eINSTANCE.getSaveCache();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVE_CACHE__PATHS = eINSTANCE.getSaveCache_Paths();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVE_CACHE__KEY = eINSTANCE.getSaveCache_Key();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVE_CACHE__WHEN = eINSTANCE.getSaveCache_When();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.AttachWorkspaceImpl <em>Attach Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.AttachWorkspaceImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getAttachWorkspace()
		 * @generated
		 */
		EClass ATTACH_WORKSPACE = eINSTANCE.getAttachWorkspace();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACH_WORKSPACE__AT = eINSTANCE.getAttachWorkspace_At();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.When_UnlessImpl <em>When Unless</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.When_UnlessImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWhen_Unless()
		 * @generated
		 */
		EClass WHEN_UNLESS = eINSTANCE.getWhen_Unless();

		/**
		 * The meta object literal for the '<em><b>When step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_UNLESS__WHEN_STEP = eINSTANCE.getWhen_Unless_When_step();

		/**
		 * The meta object literal for the '<em><b>Unless step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_UNLESS__UNLESS_STEP = eINSTANCE.getWhen_Unless_Unless_step();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_UNLESS__CONDITION = eINSTANCE.getWhen_Unless_Condition();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.BranchImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH = eINSTANCE.getBranch_Branch();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.RunCommandImpl <em>Run Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.RunCommandImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getRunCommand()
		 * @generated
		 */
		EClass RUN_COMMAND = eINSTANCE.getRunCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_COMMAND__NAME = eINSTANCE.getRunCommand_Name();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.TriggerImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CRON = eINSTANCE.getTrigger_Cron();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.CheckoutImpl <em>Checkout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.CheckoutImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getCheckout()
		 * @generated
		 */
		EClass CHECKOUT = eINSTANCE.getCheckout();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKOUT__PATH = eINSTANCE.getCheckout_Path();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.ExecutorImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR__NAME = eINSTANCE.getExecutor_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR__RESOURCE_CLASS = eINSTANCE.getExecutor_ResourceClass();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR__SHELL = eINSTANCE.getExecutor_Shell();

		/**
		 * The meta object literal for the '<em><b>Working directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR__WORKING_DIRECTORY = eINSTANCE.getExecutor_Working_directory();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__ENVIRONMENTS = eINSTANCE.getExecutor_Environments();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.PipelineImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Orbs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ORBS = eINSTANCE.getPipeline_Orbs();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__COMMANDS = eINSTANCE.getPipeline_Commands();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__WORKFLOW = eINSTANCE.getPipeline_Workflow();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOBS = eINSTANCE.getPipeline_Jobs();

		/**
		 * The meta object literal for the '<em><b>Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__EXECUTORS = eINSTANCE.getPipeline_Executors();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__VERSION = eINSTANCE.getPipeline_Version();

		/**
		 * The meta object literal for the '<em><b>Setup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__SETUP = eINSTANCE.getPipeline_Setup();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.OrbImpl <em>Orb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.OrbImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getOrb()
		 * @generated
		 */
		EClass ORB = eINSTANCE.getOrb();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB__KEY = eINSTANCE.getOrb_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB__VALUE = eINSTANCE.getOrb_Value();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.CommandImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__STEPS = eINSTANCE.getCommand_Steps();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.MatrixImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__ALIAS = eINSTANCE.getMatrix_Alias();

		/**
		 * The meta object literal for the '<em><b>Matrix exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__MATRIX_EXCLUDE = eINSTANCE.getMatrix_Matrix_exclude();

		/**
		 * The meta object literal for the '<em><b>Matrix params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__MATRIX_PARAMS = eINSTANCE.getMatrix_Matrix_params();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.JobWorkflowImpl <em>Job Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.JobWorkflowImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getJobWorkflow()
		 * @generated
		 */
		EClass JOB_WORKFLOW = eINSTANCE.getJobWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_WORKFLOW__NAME = eINSTANCE.getJobWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_WORKFLOW__REQUIRES = eINSTANCE.getJobWorkflow_Requires();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_WORKFLOW__CONTEXT = eINSTANCE.getJobWorkflow_Context();

		/**
		 * The meta object literal for the '<em><b>Approval Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_WORKFLOW__APPROVAL_JOB = eINSTANCE.getJobWorkflow_ApprovalJob();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_WORKFLOW__BRANCHES = eINSTANCE.getJobWorkflow_Branches();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_WORKFLOW__MATRIX = eINSTANCE.getJobWorkflow_Matrix();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.MatrixParamsImpl <em>Matrix Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.MatrixParamsImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMatrixParams()
		 * @generated
		 */
		EClass MATRIX_PARAMS = eINSTANCE.getMatrixParams();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_PARAMS__KEY = eINSTANCE.getMatrixParams_Key();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_PARAMS__VALUES = eINSTANCE.getMatrixParams_Values();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.PARAMETER_TYPES <em>PARAMETER TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.PARAMETER_TYPES
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPARAMETER_TYPES()
		 * @generated
		 */
		EEnum PARAMETER_TYPES = eINSTANCE.getPARAMETER_TYPES();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.BRANCH_TYPE
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getBRANCH_TYPE()
		 * @generated
		 */
		EEnum BRANCH_TYPE = eINSTANCE.getBRANCH_TYPE();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.WHEN_TYPE
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWHEN_TYPE()
		 * @generated
		 */
		EEnum WHEN_TYPE = eINSTANCE.getWHEN_TYPE();

	}

} //CircleCI_metamodelPackage
