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
	 * The meta object id for the '{@link circleCI_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.PipelineImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Orb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ORB = 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__WORKFLOW = 3;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOB = 4;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.StepImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 1;

	/**
	 * The feature id for the '<em><b>When attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WHEN_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Tool framework</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TOOL_FRAMEWORK = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.Execution_EnvImpl <em>Execution Env</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.Execution_EnvImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getExecution_Env()
	 * @generated
	 */
	int EXECUTION_ENV = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV__STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV__NAME = 2;

	/**
	 * The number of structural features of the '<em>Execution Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Execution Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.DockerImpl <em>Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.DockerImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getDocker()
	 * @generated
	 */
	int DOCKER = 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__IMAGE = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.LinuxImpl <em>Linux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.LinuxImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getLinux()
	 * @generated
	 */
	int LINUX = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__IMAGE = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.MacOsImpl <em>Mac Os</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.MacOsImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getMacOs()
	 * @generated
	 */
	int MAC_OS = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Xcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__XCODE = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mac Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mac Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.WindowsOrbImpl <em>Windows Orb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.WindowsOrbImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWindowsOrb()
	 * @generated
	 */
	int WINDOWS_ORB = 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__EXECUTOR = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Windows Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Windows Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.OrbImpl <em>Orb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.OrbImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getOrb()
	 * @generated
	 */
	int ORB = 7;

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
	int COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__STEP = 1;

	/**
	 * The feature id for the '<em><b>Command params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMAND_PARAMS = 2;

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
	 * The meta object id for the '{@link circleCI_metamodel.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.WorkflowImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WHEN_UNLESS = 3;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__BRANCH = 4;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 5;

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
	int ENVIRONMENT = 10;

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
	 * The meta object id for the '{@link circleCI_metamodel.impl.Tool_FrameworkImpl <em>Tool Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.Tool_FrameworkImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getTool_Framework()
	 * @generated
	 */
	int TOOL_FRAMEWORK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tool Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tool Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.When_UnlessImpl <em>When Unless</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.When_UnlessImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWhen_Unless()
	 * @generated
	 */
	int WHEN_UNLESS = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>When step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__WHEN_STEP = 1;

	/**
	 * The feature id for the '<em><b>Unless step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__UNLESS_STEP = 2;

	/**
	 * The number of structural features of the '<em>When Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>When Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.When_AttributeImpl <em>When Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.When_AttributeImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWhen_Attribute()
	 * @generated
	 */
	int WHEN_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>When type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ATTRIBUTE__WHEN_TYPE = 0;

	/**
	 * The number of structural features of the '<em>When Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>When Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.TriggerImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 15;

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
	 * The meta object id for the '{@link circleCI_metamodel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.BranchImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Branch type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_TYPE = 1;

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
	 * The meta object id for the '{@link circleCI_metamodel.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.JobImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARALLELISM = 1;

	/**
	 * The feature id for the '<em><b>Store artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STORE_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__WHEN_UNLESS = 3;

	/**
	 * The feature id for the '<em><b>Execution env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__EXECUTION_ENV = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEP = 6;

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
	 * The meta object id for the '{@link circleCI_metamodel.impl.Store_ArtifactImpl <em>Store Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.Store_ArtifactImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStore_Artifact()
	 * @generated
	 */
	int STORE_ARTIFACT = 18;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT__PATH = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Store Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Store Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.impl.Command_ParamsImpl <em>Command Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.impl.Command_ParamsImpl
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getCommand_Params()
	 * @generated
	 */
	int COMMAND_PARAMS = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS__DEFAULT = 1;

	/**
	 * The number of structural features of the '<em>Command Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.WHEN_TYPE
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWHEN_TYPE()
	 * @generated
	 */
	int WHEN_TYPE = 20;

	/**
	 * The meta object id for the '{@link circleCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circleCI_metamodel.BRANCH_TYPE
	 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getBRANCH_TYPE()
	 * @generated
	 */
	int BRANCH_TYPE = 21;

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
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Pipeline#getOrb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orb</em>'.
	 * @see circleCI_metamodel.Pipeline#getOrb()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Orb();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Pipeline#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see circleCI_metamodel.Pipeline#getCommand()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Command();

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
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Pipeline#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see circleCI_metamodel.Pipeline#getJob()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Job();

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
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Step#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see circleCI_metamodel.Step#getParameters()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Parameters();

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
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Step#getWhen_attribute <em>When attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When attribute</em>'.
	 * @see circleCI_metamodel.Step#getWhen_attribute()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_When_attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Step#getTool_framework <em>Tool framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool framework</em>'.
	 * @see circleCI_metamodel.Step#getTool_framework()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Tool_framework();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Execution_Env <em>Execution Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Env</em>'.
	 * @see circleCI_metamodel.Execution_Env
	 * @generated
	 */
	EClass getExecution_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Execution_Env#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see circleCI_metamodel.Execution_Env#getEnvironment()
	 * @see #getExecution_Env()
	 * @generated
	 */
	EReference getExecution_Env_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Execution_Env#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see circleCI_metamodel.Execution_Env#getStep()
	 * @see #getExecution_Env()
	 * @generated
	 */
	EReference getExecution_Env_Step();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Execution_Env#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Execution_Env#getName()
	 * @see #getExecution_Env()
	 * @generated
	 */
	EAttribute getExecution_Env_Name();

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
	 * Returns the meta object for class '{@link circleCI_metamodel.Linux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux</em>'.
	 * @see circleCI_metamodel.Linux
	 * @generated
	 */
	EClass getLinux();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Linux#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see circleCI_metamodel.Linux#getImage()
	 * @see #getLinux()
	 * @generated
	 */
	EAttribute getLinux_Image();

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
	 * Returns the meta object for class '{@link circleCI_metamodel.WindowsOrb <em>Windows Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows Orb</em>'.
	 * @see circleCI_metamodel.WindowsOrb
	 * @generated
	 */
	EClass getWindowsOrb();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.WindowsOrb#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor</em>'.
	 * @see circleCI_metamodel.WindowsOrb#getExecutor()
	 * @see #getWindowsOrb()
	 * @generated
	 */
	EAttribute getWindowsOrb_Executor();

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
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Command#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see circleCI_metamodel.Command#getStep()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Step();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Command#getCommand_params <em>Command params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command params</em>'.
	 * @see circleCI_metamodel.Command#getCommand_params()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Command_params();

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
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Workflow#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see circleCI_metamodel.Workflow#getTrigger()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Trigger();

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
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Workflow#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see circleCI_metamodel.Workflow#getBranch()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Branch();

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
	 * Returns the meta object for class '{@link circleCI_metamodel.Tool_Framework <em>Tool Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Framework</em>'.
	 * @see circleCI_metamodel.Tool_Framework
	 * @generated
	 */
	EClass getTool_Framework();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Tool_Framework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circleCI_metamodel.Tool_Framework#getName()
	 * @see #getTool_Framework()
	 * @generated
	 */
	EAttribute getTool_Framework_Name();

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
	 * Returns the meta object for class '{@link circleCI_metamodel.When_Attribute <em>When Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Attribute</em>'.
	 * @see circleCI_metamodel.When_Attribute
	 * @generated
	 */
	EClass getWhen_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.When_Attribute#getWhen_type <em>When type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When type</em>'.
	 * @see circleCI_metamodel.When_Attribute#getWhen_type()
	 * @see #getWhen_Attribute()
	 * @generated
	 */
	EAttribute getWhen_Attribute_When_type();

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
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Branch#getBranch_type <em>Branch type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch type</em>'.
	 * @see circleCI_metamodel.Branch#getBranch_type()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Branch_type();

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
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Job#getStore_artifact <em>Store artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Store artifact</em>'.
	 * @see circleCI_metamodel.Job#getStore_artifact()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Store_artifact();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Job#getWhen_unless <em>When unless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When unless</em>'.
	 * @see circleCI_metamodel.Job#getWhen_unless()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_When_unless();

	/**
	 * Returns the meta object for the containment reference '{@link circleCI_metamodel.Job#getExecution_env <em>Execution env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution env</em>'.
	 * @see circleCI_metamodel.Job#getExecution_env()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Execution_env();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Job#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see circleCI_metamodel.Job#getEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link circleCI_metamodel.Job#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see circleCI_metamodel.Job#getStep()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Step();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Store_Artifact <em>Store Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Artifact</em>'.
	 * @see circleCI_metamodel.Store_Artifact
	 * @generated
	 */
	EClass getStore_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Store_Artifact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see circleCI_metamodel.Store_Artifact#getPath()
	 * @see #getStore_Artifact()
	 * @generated
	 */
	EAttribute getStore_Artifact_Path();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Store_Artifact#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see circleCI_metamodel.Store_Artifact#getDestination()
	 * @see #getStore_Artifact()
	 * @generated
	 */
	EAttribute getStore_Artifact_Destination();

	/**
	 * Returns the meta object for class '{@link circleCI_metamodel.Command_Params <em>Command Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Params</em>'.
	 * @see circleCI_metamodel.Command_Params
	 * @generated
	 */
	EClass getCommand_Params();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Command_Params#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see circleCI_metamodel.Command_Params#getType()
	 * @see #getCommand_Params()
	 * @generated
	 */
	EAttribute getCommand_Params_Type();

	/**
	 * Returns the meta object for the attribute '{@link circleCI_metamodel.Command_Params#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see circleCI_metamodel.Command_Params#getDefault()
	 * @see #getCommand_Params()
	 * @generated
	 */
	EAttribute getCommand_Params_Default();

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
	 * Returns the meta object for enum '{@link circleCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BRANCH TYPE</em>'.
	 * @see circleCI_metamodel.BRANCH_TYPE
	 * @generated
	 */
	EEnum getBRANCH_TYPE();

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
		 * The meta object literal for the '{@link circleCI_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.PipelineImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__VERSION = eINSTANCE.getPipeline_Version();

		/**
		 * The meta object literal for the '<em><b>Orb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ORB = eINSTANCE.getPipeline_Orb();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__COMMAND = eINSTANCE.getPipeline_Command();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__WORKFLOW = eINSTANCE.getPipeline_Workflow();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOB = eINSTANCE.getPipeline_Job();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARAMETERS = eINSTANCE.getStep_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>When attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__WHEN_ATTRIBUTE = eINSTANCE.getStep_When_attribute();

		/**
		 * The meta object literal for the '<em><b>Tool framework</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__TOOL_FRAMEWORK = eINSTANCE.getStep_Tool_framework();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.Execution_EnvImpl <em>Execution Env</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.Execution_EnvImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getExecution_Env()
		 * @generated
		 */
		EClass EXECUTION_ENV = eINSTANCE.getExecution_Env();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENV__ENVIRONMENT = eINSTANCE.getExecution_Env_Environment();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENV__STEP = eINSTANCE.getExecution_Env_Step();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENV__NAME = eINSTANCE.getExecution_Env_Name();

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
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__IMAGE = eINSTANCE.getDocker_Image();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.LinuxImpl <em>Linux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.LinuxImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getLinux()
		 * @generated
		 */
		EClass LINUX = eINSTANCE.getLinux();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX__IMAGE = eINSTANCE.getLinux_Image();

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
		 * The meta object literal for the '{@link circleCI_metamodel.impl.WindowsOrbImpl <em>Windows Orb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.WindowsOrbImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWindowsOrb()
		 * @generated
		 */
		EClass WINDOWS_ORB = eINSTANCE.getWindowsOrb();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_ORB__EXECUTOR = eINSTANCE.getWindowsOrb_Executor();

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
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__STEP = eINSTANCE.getCommand_Step();

		/**
		 * The meta object literal for the '<em><b>Command params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__COMMAND_PARAMS = eINSTANCE.getCommand_Command_params();

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
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TRIGGER = eINSTANCE.getWorkflow_Trigger();

		/**
		 * The meta object literal for the '<em><b>When unless</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__WHEN_UNLESS = eINSTANCE.getWorkflow_When_unless();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__BRANCH = eINSTANCE.getWorkflow_Branch();

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
		 * The meta object literal for the '{@link circleCI_metamodel.impl.Tool_FrameworkImpl <em>Tool Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.Tool_FrameworkImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getTool_Framework()
		 * @generated
		 */
		EClass TOOL_FRAMEWORK = eINSTANCE.getTool_Framework();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_FRAMEWORK__NAME = eINSTANCE.getTool_Framework_Name();

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
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_UNLESS__CONDITION = eINSTANCE.getWhen_Unless_Condition();

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
		 * The meta object literal for the '{@link circleCI_metamodel.impl.When_AttributeImpl <em>When Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.When_AttributeImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWhen_Attribute()
		 * @generated
		 */
		EClass WHEN_ATTRIBUTE = eINSTANCE.getWhen_Attribute();

		/**
		 * The meta object literal for the '<em><b>When type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_ATTRIBUTE__WHEN_TYPE = eINSTANCE.getWhen_Attribute_When_type();

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
		 * The meta object literal for the '<em><b>Branch type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_TYPE = eINSTANCE.getBranch_Branch_type();

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
		 * The meta object literal for the '<em><b>Store artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STORE_ARTIFACT = eINSTANCE.getJob_Store_artifact();

		/**
		 * The meta object literal for the '<em><b>When unless</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__WHEN_UNLESS = eINSTANCE.getJob_When_unless();

		/**
		 * The meta object literal for the '<em><b>Execution env</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__EXECUTION_ENV = eINSTANCE.getJob_Execution_env();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT = eINSTANCE.getJob_Environment();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEP = eINSTANCE.getJob_Step();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.Store_ArtifactImpl <em>Store Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.Store_ArtifactImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getStore_Artifact()
		 * @generated
		 */
		EClass STORE_ARTIFACT = eINSTANCE.getStore_Artifact();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_ARTIFACT__PATH = eINSTANCE.getStore_Artifact_Path();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_ARTIFACT__DESTINATION = eINSTANCE.getStore_Artifact_Destination();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.impl.Command_ParamsImpl <em>Command Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.impl.Command_ParamsImpl
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getCommand_Params()
		 * @generated
		 */
		EClass COMMAND_PARAMS = eINSTANCE.getCommand_Params();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMS__TYPE = eINSTANCE.getCommand_Params_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMS__DEFAULT = eINSTANCE.getCommand_Params_Default();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.WHEN_TYPE
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getWHEN_TYPE()
		 * @generated
		 */
		EEnum WHEN_TYPE = eINSTANCE.getWHEN_TYPE();

		/**
		 * The meta object literal for the '{@link circleCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circleCI_metamodel.BRANCH_TYPE
		 * @see circleCI_metamodel.impl.CircleCI_metamodelPackageImpl#getBRANCH_TYPE()
		 * @generated
		 */
		EEnum BRANCH_TYPE = eINSTANCE.getBRANCH_TYPE();

	}

} //CircleCI_metamodelPackage
