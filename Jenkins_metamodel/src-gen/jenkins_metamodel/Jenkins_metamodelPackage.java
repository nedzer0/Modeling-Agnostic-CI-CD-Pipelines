/**
 */
package jenkins_metamodel;

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
 * @see jenkins_metamodel.Jenkins_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Jenkins_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jenkins_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/jenkins_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jenkins_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Jenkins_metamodelPackage eINSTANCE = jenkins_metamodel.impl.Jenkins_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.PipelineImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STAGE = 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__POST = 2;

	/**
	 * The feature id for the '<em><b>Parameter directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PARAMETER_DIRECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TOOL = 5;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__AGENT = 6;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.CommandImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.Step_ParameterImpl <em>Step Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.Step_ParameterImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStep_Parameter()
	 * @generated
	 */
	int STEP_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Step Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.EnvironmentImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 3;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TriggerImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Trigger type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TRIGGER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TIMER = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.InputImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 5;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = 1;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OK = 2;

	/**
	 * The feature id for the '<em><b>Submitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SUBMITTER = 3;

	/**
	 * The feature id for the '<em><b>Submitter Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SUBMITTER_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Parameter directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PARAMETER_DIRECTIVE = 5;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.StageImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STAGE = 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__AGENT = 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__POST = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STEP = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__TOOL = 6;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__INPUT = 7;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__WHEN = 8;

	/**
	 * The feature id for the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__FAIL_FAST = 9;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__PARALLEL = 10;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.StepImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 7;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Step parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.WhenImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 8;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AgentImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Resuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__RESUSE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ARGS = 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AnyImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Resuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__RESUSE_NODE = AGENT__RESUSE_NODE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ARGS = AGENT__ARGS;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.NoneImpl <em>None</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.NoneImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNone()
	 * @generated
	 */
	int NONE = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Resuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE__RESUSE_NODE = AGENT__RESUSE_NODE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE__ARGS = AGENT__ARGS;

	/**
	 * The number of structural features of the '<em>None</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>None</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.NodeImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Resuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RESUSE_NODE = AGENT__RESUSE_NODE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ARGS = AGENT__ARGS;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.DockerImpl <em>Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.DockerImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDocker()
	 * @generated
	 */
	int DOCKER = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Resuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__RESUSE_NODE = AGENT__RESUSE_NODE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ARGS = AGENT__ARGS;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__IMAGE = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__REGISTRY_URL = AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registry Credentials Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__REGISTRY_CREDENTIALS_ID = AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_FEATURE_COUNT = AGENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.DockerfileImpl <em>Dockerfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.DockerfileImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDockerfile()
	 * @generated
	 */
	int DOCKERFILE = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Resuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__RESUSE_NODE = AGENT__RESUSE_NODE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__ARGS = AGENT__ARGS;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__FILENAME = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__DIR = AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Build Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__ADDITIONAL_BUILD_ARGS = AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registry Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__REGISTRY_URL = AGENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Registry Credentials Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__REGISTRY_CREDENTIALS_ID = AGENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dockerfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE_FEATURE_COUNT = AGENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dockerfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.PostImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPost()
	 * @generated
	 */
	int POST = 15;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__STEP = 1;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.Parameter_DirectiveImpl <em>Parameter Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.Parameter_DirectiveImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParameter_Directive()
	 * @generated
	 */
	int PARAMETER_DIRECTIVE = 16;

	/**
	 * The feature id for the '<em><b>Param type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DIRECTIVE__PARAM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Param value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DIRECTIVE__PARAM_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DIRECTIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DIRECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.Param_ValueImpl <em>Param Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.Param_ValueImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParam_Value()
	 * @generated
	 */
	int PARAM_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Param Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ToolImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 18;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Tool name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TOOL_NAME = 1;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.ChangeSetImpl <em>Change Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ChangeSetImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangeSet()
	 * @generated
	 */
	int CHANGE_SET = 19;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__PATTERN = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__COMPARATOR = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.BranchImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 20;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PATTERN = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__COMPARATOR = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.BuildingTagImpl <em>Building Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.BuildingTagImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBuildingTag()
	 * @generated
	 */
	int BUILDING_TAG = 21;

	/**
	 * The number of structural features of the '<em>Building Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TAG_FEATURE_COUNT = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Building Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TAG_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.ChangelogImpl <em>Changelog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ChangelogImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangelog()
	 * @generated
	 */
	int CHANGELOG = 22;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG__EXPRESSION = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Changelog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_FEATURE_COUNT = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Changelog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.When_EnvImpl <em>When Env</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.When_EnvImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getWhen_Env()
	 * @generated
	 */
	int WHEN_ENV = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENV__NAME = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENV__VALUE = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENV_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>When Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENV_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.EqualsImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 24;

	/**
	 * The feature id for the '<em><b>Expected val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__EXPECTED_VAL = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__ACTUAL_VAL = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.ChangeRequestImpl <em>Change Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ChangeRequestImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangeRequest()
	 * @generated
	 */
	int CHANGE_REQUEST = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__ATTRIBUTE = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__VALUE = WHEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__COMPARATOR = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_FEATURE_COUNT = WHEN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.NotImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 26;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__WHEN = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TagImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 27;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__PATTERN = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__COMPARATOR = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.AllOfImpl <em>All Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AllOfImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAllOf()
	 * @generated
	 */
	int ALL_OF = 28;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF__WHEN = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_FEATURE_COUNT = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.AnyOfImpl <em>Any Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AnyOfImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAnyOf()
	 * @generated
	 */
	int ANY_OF = 29;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF__WHEN = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF_FEATURE_COUNT = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.TriggeredByImpl <em>Triggered By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TriggeredByImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTriggeredBy()
	 * @generated
	 */
	int TRIGGERED_BY = 30;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BY__PARAMETER = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triggered By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BY_FEATURE_COUNT = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Triggered By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BY_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ExpressionImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.TRIGGER_TYPE <em>TRIGGER TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.TRIGGER_TYPE
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTRIGGER_TYPE()
	 * @generated
	 */
	int TRIGGER_TYPE = 32;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.CONDITION_TYPE <em>CONDITION TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.CONDITION_TYPE
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCONDITION_TYPE()
	 * @generated
	 */
	int CONDITION_TYPE = 33;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.POST_TYPE <em>POST TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.POST_TYPE
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPOST_TYPE()
	 * @generated
	 */
	int POST_TYPE = 34;

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see jenkins_metamodel.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see jenkins_metamodel.Pipeline#getEnvironment()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage</em>'.
	 * @see jenkins_metamodel.Pipeline#getStage()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Stage();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see jenkins_metamodel.Pipeline#getPost()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Post();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getParameter_directive <em>Parameter directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter directive</em>'.
	 * @see jenkins_metamodel.Pipeline#getParameter_directive()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Parameter_directive();

	/**
	 * Returns the meta object for the containment reference '{@link jenkins_metamodel.Pipeline#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see jenkins_metamodel.Pipeline#getTrigger()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see jenkins_metamodel.Pipeline#getTool()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tool();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see jenkins_metamodel.Pipeline#getAgent()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Agent();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see jenkins_metamodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jenkins_metamodel.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Step_Parameter <em>Step Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Parameter</em>'.
	 * @see jenkins_metamodel.Step_Parameter
	 * @generated
	 */
	EClass getStep_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Step_Parameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see jenkins_metamodel.Step_Parameter#getParameter()
	 * @see #getStep_Parameter()
	 * @generated
	 */
	EAttribute getStep_Parameter_Parameter();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see jenkins_metamodel.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Environment#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jenkins_metamodel.Environment#getKey()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Key();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Environment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jenkins_metamodel.Environment#getValue()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Value();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see jenkins_metamodel.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Trigger#getTrigger_type <em>Trigger type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger type</em>'.
	 * @see jenkins_metamodel.Trigger#getTrigger_type()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Trigger_type();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Trigger#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see jenkins_metamodel.Trigger#getTimer()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Timer();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see jenkins_metamodel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Input#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see jenkins_metamodel.Input#getMessage()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Message();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Input#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jenkins_metamodel.Input#getId()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Id();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Input#getOk <em>Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ok</em>'.
	 * @see jenkins_metamodel.Input#getOk()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Ok();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Input#getSubmitter <em>Submitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submitter</em>'.
	 * @see jenkins_metamodel.Input#getSubmitter()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Submitter();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Input#getSubmitterParameter <em>Submitter Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submitter Parameter</em>'.
	 * @see jenkins_metamodel.Input#getSubmitterParameter()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_SubmitterParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Input#getParameter_directive <em>Parameter directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter directive</em>'.
	 * @see jenkins_metamodel.Input#getParameter_directive()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Parameter_directive();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see jenkins_metamodel.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Stage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jenkins_metamodel.Stage#getName()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage</em>'.
	 * @see jenkins_metamodel.Stage#getStage()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Stage();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see jenkins_metamodel.Stage#getAgent()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see jenkins_metamodel.Stage#getPost()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Post();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see jenkins_metamodel.Stage#getStep()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see jenkins_metamodel.Stage#getEnvironment()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see jenkins_metamodel.Stage#getTool()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Tool();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see jenkins_metamodel.Stage#getInput()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see jenkins_metamodel.Stage#getWhen()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_When();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Stage#isFailFast <em>Fail Fast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail Fast</em>'.
	 * @see jenkins_metamodel.Stage#isFailFast()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_FailFast();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Stage#isParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see jenkins_metamodel.Stage#isParallel()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Parallel();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see jenkins_metamodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Step#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see jenkins_metamodel.Step#getCommand()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Step#getStep_parameter <em>Step parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step parameter</em>'.
	 * @see jenkins_metamodel.Step#getStep_parameter()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Step_parameter();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see jenkins_metamodel.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see jenkins_metamodel.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Agent#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jenkins_metamodel.Agent#getLabel()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Label();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Agent#isResuseNode <em>Resuse Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resuse Node</em>'.
	 * @see jenkins_metamodel.Agent#isResuseNode()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_ResuseNode();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Agent#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see jenkins_metamodel.Agent#getArgs()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Args();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see jenkins_metamodel.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.None <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None</em>'.
	 * @see jenkins_metamodel.None
	 * @generated
	 */
	EClass getNone();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see jenkins_metamodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker</em>'.
	 * @see jenkins_metamodel.Docker
	 * @generated
	 */
	EClass getDocker();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see jenkins_metamodel.Docker#getImage()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Image();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#getRegistryUrl <em>Registry Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Url</em>'.
	 * @see jenkins_metamodel.Docker#getRegistryUrl()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_RegistryUrl();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#getRegistryCredentialsId <em>Registry Credentials Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Credentials Id</em>'.
	 * @see jenkins_metamodel.Docker#getRegistryCredentialsId()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_RegistryCredentialsId();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Dockerfile <em>Dockerfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dockerfile</em>'.
	 * @see jenkins_metamodel.Dockerfile
	 * @generated
	 */
	EClass getDockerfile();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see jenkins_metamodel.Dockerfile#getFilename()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_Filename();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see jenkins_metamodel.Dockerfile#getDir()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_Dir();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getAdditionalBuildArgs <em>Additional Build Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Build Args</em>'.
	 * @see jenkins_metamodel.Dockerfile#getAdditionalBuildArgs()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_AdditionalBuildArgs();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getRegistryUrl <em>Registry Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Url</em>'.
	 * @see jenkins_metamodel.Dockerfile#getRegistryUrl()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_RegistryUrl();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getRegistryCredentialsId <em>Registry Credentials Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Credentials Id</em>'.
	 * @see jenkins_metamodel.Dockerfile#getRegistryCredentialsId()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_RegistryCredentialsId();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see jenkins_metamodel.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Post#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see jenkins_metamodel.Post#getCondition()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Post#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see jenkins_metamodel.Post#getStep()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Step();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Parameter_Directive <em>Parameter Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Directive</em>'.
	 * @see jenkins_metamodel.Parameter_Directive
	 * @generated
	 */
	EClass getParameter_Directive();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Parameter_Directive#getParam_type <em>Param type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param type</em>'.
	 * @see jenkins_metamodel.Parameter_Directive#getParam_type()
	 * @see #getParameter_Directive()
	 * @generated
	 */
	EAttribute getParameter_Directive_Param_type();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Parameter_Directive#getParam_value <em>Param value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param value</em>'.
	 * @see jenkins_metamodel.Parameter_Directive#getParam_value()
	 * @see #getParameter_Directive()
	 * @generated
	 */
	EReference getParameter_Directive_Param_value();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Param_Value <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Value</em>'.
	 * @see jenkins_metamodel.Param_Value
	 * @generated
	 */
	EClass getParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Param_Value#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jenkins_metamodel.Param_Value#getKey()
	 * @see #getParam_Value()
	 * @generated
	 */
	EAttribute getParam_Value_Key();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Param_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jenkins_metamodel.Param_Value#getValue()
	 * @see #getParam_Value()
	 * @generated
	 */
	EAttribute getParam_Value_Value();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see jenkins_metamodel.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Tool#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see jenkins_metamodel.Tool#getTool()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Tool();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Tool#getTool_name <em>Tool name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool name</em>'.
	 * @see jenkins_metamodel.Tool#getTool_name()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Tool_name();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.ChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Set</em>'.
	 * @see jenkins_metamodel.ChangeSet
	 * @generated
	 */
	EClass getChangeSet();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.ChangeSet#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see jenkins_metamodel.ChangeSet#getPattern()
	 * @see #getChangeSet()
	 * @generated
	 */
	EAttribute getChangeSet_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.ChangeSet#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see jenkins_metamodel.ChangeSet#getComparator()
	 * @see #getChangeSet()
	 * @generated
	 */
	EAttribute getChangeSet_Comparator();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see jenkins_metamodel.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Branch#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see jenkins_metamodel.Branch#getPattern()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Branch#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see jenkins_metamodel.Branch#getComparator()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Comparator();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.BuildingTag <em>Building Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Tag</em>'.
	 * @see jenkins_metamodel.BuildingTag
	 * @generated
	 */
	EClass getBuildingTag();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Changelog <em>Changelog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Changelog</em>'.
	 * @see jenkins_metamodel.Changelog
	 * @generated
	 */
	EClass getChangelog();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Changelog#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see jenkins_metamodel.Changelog#getExpression()
	 * @see #getChangelog()
	 * @generated
	 */
	EAttribute getChangelog_Expression();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.When_Env <em>When Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Env</em>'.
	 * @see jenkins_metamodel.When_Env
	 * @generated
	 */
	EClass getWhen_Env();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.When_Env#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jenkins_metamodel.When_Env#getName()
	 * @see #getWhen_Env()
	 * @generated
	 */
	EAttribute getWhen_Env_Name();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.When_Env#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jenkins_metamodel.When_Env#getValue()
	 * @see #getWhen_Env()
	 * @generated
	 */
	EAttribute getWhen_Env_Value();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see jenkins_metamodel.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Equals#getExpected_val <em>Expected val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected val</em>'.
	 * @see jenkins_metamodel.Equals#getExpected_val()
	 * @see #getEquals()
	 * @generated
	 */
	EAttribute getEquals_Expected_val();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Equals#getActual_val <em>Actual val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual val</em>'.
	 * @see jenkins_metamodel.Equals#getActual_val()
	 * @see #getEquals()
	 * @generated
	 */
	EAttribute getEquals_Actual_val();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.ChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Request</em>'.
	 * @see jenkins_metamodel.ChangeRequest
	 * @generated
	 */
	EClass getChangeRequest();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.ChangeRequest#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see jenkins_metamodel.ChangeRequest#getAttribute()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.ChangeRequest#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jenkins_metamodel.ChangeRequest#getValue()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_Value();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.ChangeRequest#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see jenkins_metamodel.ChangeRequest#getComparator()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_Comparator();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see jenkins_metamodel.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Not#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see jenkins_metamodel.Not#getWhen()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_When();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see jenkins_metamodel.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Tag#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see jenkins_metamodel.Tag#getPattern()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Tag#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see jenkins_metamodel.Tag#getComparator()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Comparator();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.AllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Of</em>'.
	 * @see jenkins_metamodel.AllOf
	 * @generated
	 */
	EClass getAllOf();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.AllOf#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see jenkins_metamodel.AllOf#getWhen()
	 * @see #getAllOf()
	 * @generated
	 */
	EReference getAllOf_When();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.AnyOf <em>Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Of</em>'.
	 * @see jenkins_metamodel.AnyOf
	 * @generated
	 */
	EClass getAnyOf();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.AnyOf#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see jenkins_metamodel.AnyOf#getWhen()
	 * @see #getAnyOf()
	 * @generated
	 */
	EReference getAnyOf_When();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.TriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggered By</em>'.
	 * @see jenkins_metamodel.TriggeredBy
	 * @generated
	 */
	EClass getTriggeredBy();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.TriggeredBy#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see jenkins_metamodel.TriggeredBy#getParameter()
	 * @see #getTriggeredBy()
	 * @generated
	 */
	EAttribute getTriggeredBy_Parameter();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see jenkins_metamodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Expression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see jenkins_metamodel.Expression#getExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Expression();

	/**
	 * Returns the meta object for enum '{@link jenkins_metamodel.TRIGGER_TYPE <em>TRIGGER TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRIGGER TYPE</em>'.
	 * @see jenkins_metamodel.TRIGGER_TYPE
	 * @generated
	 */
	EEnum getTRIGGER_TYPE();

	/**
	 * Returns the meta object for enum '{@link jenkins_metamodel.CONDITION_TYPE <em>CONDITION TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CONDITION TYPE</em>'.
	 * @see jenkins_metamodel.CONDITION_TYPE
	 * @generated
	 */
	EEnum getCONDITION_TYPE();

	/**
	 * Returns the meta object for enum '{@link jenkins_metamodel.POST_TYPE <em>POST TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>POST TYPE</em>'.
	 * @see jenkins_metamodel.POST_TYPE
	 * @generated
	 */
	EEnum getPOST_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Jenkins_metamodelFactory getJenkins_metamodelFactory();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.PipelineImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ENVIRONMENT = eINSTANCE.getPipeline_Environment();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STAGE = eINSTANCE.getPipeline_Stage();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__POST = eINSTANCE.getPipeline_Post();

		/**
		 * The meta object literal for the '<em><b>Parameter directive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PARAMETER_DIRECTIVE = eINSTANCE.getPipeline_Parameter_directive();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRIGGER = eINSTANCE.getPipeline_Trigger();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TOOL = eINSTANCE.getPipeline_Tool();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__AGENT = eINSTANCE.getPipeline_Agent();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.CommandImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCommand()
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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.Step_ParameterImpl <em>Step Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.Step_ParameterImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStep_Parameter()
		 * @generated
		 */
		EClass STEP_PARAMETER = eINSTANCE.getStep_Parameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_PARAMETER__PARAMETER = eINSTANCE.getStep_Parameter_Parameter();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.EnvironmentImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getEnvironment()
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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.TriggerImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TRIGGER_TYPE = eINSTANCE.getTrigger_Trigger_type();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TIMER = eINSTANCE.getTrigger_Timer();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.InputImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__MESSAGE = eINSTANCE.getInput_Message();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__ID = eINSTANCE.getInput_Id();

		/**
		 * The meta object literal for the '<em><b>Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__OK = eINSTANCE.getInput_Ok();

		/**
		 * The meta object literal for the '<em><b>Submitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SUBMITTER = eINSTANCE.getInput_Submitter();

		/**
		 * The meta object literal for the '<em><b>Submitter Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SUBMITTER_PARAMETER = eINSTANCE.getInput_SubmitterParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter directive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__PARAMETER_DIRECTIVE = eINSTANCE.getInput_Parameter_directive();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.StageImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STAGE = eINSTANCE.getStage_Stage();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__AGENT = eINSTANCE.getStage_Agent();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__POST = eINSTANCE.getStage_Post();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STEP = eINSTANCE.getStage_Step();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__ENVIRONMENT = eINSTANCE.getStage_Environment();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__TOOL = eINSTANCE.getStage_Tool();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__INPUT = eINSTANCE.getStage_Input();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__WHEN = eINSTANCE.getStage_When();

		/**
		 * The meta object literal for the '<em><b>Fail Fast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__FAIL_FAST = eINSTANCE.getStage_FailFast();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__PARALLEL = eINSTANCE.getStage_Parallel();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.StepImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__COMMAND = eINSTANCE.getStep_Command();

		/**
		 * The meta object literal for the '<em><b>Step parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STEP_PARAMETER = eINSTANCE.getStep_Step_parameter();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.WhenImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.AgentImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__LABEL = eINSTANCE.getAgent_Label();

		/**
		 * The meta object literal for the '<em><b>Resuse Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__RESUSE_NODE = eINSTANCE.getAgent_ResuseNode();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__ARGS = eINSTANCE.getAgent_Args();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.AnyImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.NoneImpl <em>None</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.NoneImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNone()
		 * @generated
		 */
		EClass NONE = eINSTANCE.getNone();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.NodeImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.DockerImpl <em>Docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.DockerImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDocker()
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
		 * The meta object literal for the '<em><b>Registry Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__REGISTRY_URL = eINSTANCE.getDocker_RegistryUrl();

		/**
		 * The meta object literal for the '<em><b>Registry Credentials Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__REGISTRY_CREDENTIALS_ID = eINSTANCE.getDocker_RegistryCredentialsId();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.DockerfileImpl <em>Dockerfile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.DockerfileImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDockerfile()
		 * @generated
		 */
		EClass DOCKERFILE = eINSTANCE.getDockerfile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__FILENAME = eINSTANCE.getDockerfile_Filename();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__DIR = eINSTANCE.getDockerfile_Dir();

		/**
		 * The meta object literal for the '<em><b>Additional Build Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__ADDITIONAL_BUILD_ARGS = eINSTANCE.getDockerfile_AdditionalBuildArgs();

		/**
		 * The meta object literal for the '<em><b>Registry Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__REGISTRY_URL = eINSTANCE.getDockerfile_RegistryUrl();

		/**
		 * The meta object literal for the '<em><b>Registry Credentials Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__REGISTRY_CREDENTIALS_ID = eINSTANCE.getDockerfile_RegistryCredentialsId();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.PostImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__CONDITION = eINSTANCE.getPost_Condition();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__STEP = eINSTANCE.getPost_Step();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.Parameter_DirectiveImpl <em>Parameter Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.Parameter_DirectiveImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParameter_Directive()
		 * @generated
		 */
		EClass PARAMETER_DIRECTIVE = eINSTANCE.getParameter_Directive();

		/**
		 * The meta object literal for the '<em><b>Param type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DIRECTIVE__PARAM_TYPE = eINSTANCE.getParameter_Directive_Param_type();

		/**
		 * The meta object literal for the '<em><b>Param value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DIRECTIVE__PARAM_VALUE = eINSTANCE.getParameter_Directive_Param_value();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.Param_ValueImpl <em>Param Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.Param_ValueImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParam_Value()
		 * @generated
		 */
		EClass PARAM_VALUE = eINSTANCE.getParam_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE__KEY = eINSTANCE.getParam_Value_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE__VALUE = eINSTANCE.getParam_Value_Value();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.ToolImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__TOOL = eINSTANCE.getTool_Tool();

		/**
		 * The meta object literal for the '<em><b>Tool name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__TOOL_NAME = eINSTANCE.getTool_Tool_name();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.ChangeSetImpl <em>Change Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.ChangeSetImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangeSet()
		 * @generated
		 */
		EClass CHANGE_SET = eINSTANCE.getChangeSet();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_SET__PATTERN = eINSTANCE.getChangeSet_Pattern();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_SET__COMPARATOR = eINSTANCE.getChangeSet_Comparator();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.BranchImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__PATTERN = eINSTANCE.getBranch_Pattern();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__COMPARATOR = eINSTANCE.getBranch_Comparator();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.BuildingTagImpl <em>Building Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.BuildingTagImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBuildingTag()
		 * @generated
		 */
		EClass BUILDING_TAG = eINSTANCE.getBuildingTag();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.ChangelogImpl <em>Changelog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.ChangelogImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangelog()
		 * @generated
		 */
		EClass CHANGELOG = eINSTANCE.getChangelog();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG__EXPRESSION = eINSTANCE.getChangelog_Expression();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.When_EnvImpl <em>When Env</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.When_EnvImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getWhen_Env()
		 * @generated
		 */
		EClass WHEN_ENV = eINSTANCE.getWhen_Env();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_ENV__NAME = eINSTANCE.getWhen_Env_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_ENV__VALUE = eINSTANCE.getWhen_Env_Value();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.EqualsImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '<em><b>Expected val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALS__EXPECTED_VAL = eINSTANCE.getEquals_Expected_val();

		/**
		 * The meta object literal for the '<em><b>Actual val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALS__ACTUAL_VAL = eINSTANCE.getEquals_Actual_val();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.ChangeRequestImpl <em>Change Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.ChangeRequestImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangeRequest()
		 * @generated
		 */
		EClass CHANGE_REQUEST = eINSTANCE.getChangeRequest();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__ATTRIBUTE = eINSTANCE.getChangeRequest_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__VALUE = eINSTANCE.getChangeRequest_Value();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__COMPARATOR = eINSTANCE.getChangeRequest_Comparator();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.NotImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__WHEN = eINSTANCE.getNot_When();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.TagImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__PATTERN = eINSTANCE.getTag_Pattern();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__COMPARATOR = eINSTANCE.getTag_Comparator();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.AllOfImpl <em>All Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.AllOfImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAllOf()
		 * @generated
		 */
		EClass ALL_OF = eINSTANCE.getAllOf();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_OF__WHEN = eINSTANCE.getAllOf_When();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.AnyOfImpl <em>Any Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.AnyOfImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAnyOf()
		 * @generated
		 */
		EClass ANY_OF = eINSTANCE.getAnyOf();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_OF__WHEN = eINSTANCE.getAnyOf_When();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.TriggeredByImpl <em>Triggered By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.TriggeredByImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTriggeredBy()
		 * @generated
		 */
		EClass TRIGGERED_BY = eINSTANCE.getTriggeredBy();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGERED_BY__PARAMETER = eINSTANCE.getTriggeredBy_Parameter();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.ExpressionImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.TRIGGER_TYPE <em>TRIGGER TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.TRIGGER_TYPE
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTRIGGER_TYPE()
		 * @generated
		 */
		EEnum TRIGGER_TYPE = eINSTANCE.getTRIGGER_TYPE();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.CONDITION_TYPE <em>CONDITION TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.CONDITION_TYPE
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCONDITION_TYPE()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getCONDITION_TYPE();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.POST_TYPE <em>POST TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.POST_TYPE
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPOST_TYPE()
		 * @generated
		 */
		EEnum POST_TYPE = eINSTANCE.getPOST_TYPE();

	}

} //Jenkins_metamodelPackage
