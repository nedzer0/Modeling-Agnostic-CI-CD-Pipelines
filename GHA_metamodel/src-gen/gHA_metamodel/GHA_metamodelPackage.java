/**
 */
package gHA_metamodel;

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
 * @see gHA_metamodel.GHA_metamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface GHA_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gHA_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gHA_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gHA_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GHA_metamodelPackage eINSTANCE = gHA_metamodel.impl.GHA_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.PipelineImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRIGGERS = 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOBS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Run name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__RUN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PERMISSIONS = 4;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__CONCURRENCY = 5;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENVS = 6;

	/**
	 * The feature id for the '<em><b>Defaultsetting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DEFAULTSETTING = 7;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.JobImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 1;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IF = 2;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STRATEGY = 3;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONCURRENCY = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Defaultsetting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DEFAULTSETTING = 6;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PERMISSIONS = 7;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVS = 8;

	/**
	 * The feature id for the '<em><b>Need</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NEED = 9;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OUTPUTS = 10;

	/**
	 * The feature id for the '<em><b>Timeout minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TIMEOUT_MINUTES = 11;

	/**
	 * The feature id for the '<em><b>Continue on error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTINUE_ON_ERROR = 12;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SERVICES = 13;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ACTIONS = 14;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SECRETS = 15;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUNNER = 16;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTAINER = 17;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.TriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.StepImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENVS = 3;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 5;

	/**
	 * The feature id for the '<em><b>Working directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WORKING_DIRECTORY = 6;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SHELL = 7;

	/**
	 * The feature id for the '<em><b>Continue on error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONTINUE_ON_ERROR = 8;

	/**
	 * The feature id for the '<em><b>Timeout minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TIMEOUT_MINUTES = 9;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.CommandImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 4;

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
	 * The meta object id for the '{@link gHA_metamodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.ParameterImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.EnvironmentImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__URL = 1;

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
	 * The meta object id for the '{@link gHA_metamodel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.ActionImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__USES = 0;

	/**
	 * The feature id for the '<em><b>Composite action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMPOSITE_ACTION = 1;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__WITH = 2;

	/**
	 * The feature id for the '<em><b>With input Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__WITH_INPUT_PAIR = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.EventTriggerImpl <em>Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.EventTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEventTrigger()
	 * @generated
	 */
	int EVENT_TRIGGER = 8;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__ACTIVITY_TYPE = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.ScheduleTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getScheduleTrigger()
	 * @generated
	 */
	int SCHEDULE_TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__CRON = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.PushTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPushTrigger()
	 * @generated
	 */
	int PUSH_TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__TAGS = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__PATHS = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.Runs_OnImpl <em>Runs On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.Runs_OnImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getRuns_On()
	 * @generated
	 */
	int RUNS_ON = 11;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS_ON__LABELS = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS_ON__GROUP = 1;

	/**
	 * The number of structural features of the '<em>Runs On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS_ON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runs On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS_ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.SecretImpl <em>Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.SecretImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getSecret()
	 * @generated
	 */
	int SECRET = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__NAME = 3;

	/**
	 * The number of structural features of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.NeedImpl <em>Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.NeedImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 13;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__JOBS = 0;

	/**
	 * The number of structural features of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.StrategyImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 14;

	/**
	 * The feature id for the '<em><b>Fail fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__FAIL_FAST = 0;

	/**
	 * The feature id for the '<em><b>Max parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__MAX_PARALLEL = 1;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONFIGS = 2;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.ArtifactImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 15;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__USES = ACTION__USES;

	/**
	 * The feature id for the '<em><b>Composite action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__COMPOSITE_ACTION = ACTION__COMPOSITE_ACTION;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__WITH = ACTION__WITH;

	/**
	 * The feature id for the '<em><b>With input Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__WITH_INPUT_PAIR = ACTION__WITH_INPUT_PAIR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATHS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Retention days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__RETENTION_DAYS = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TYPE = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.IfImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getIf()
	 * @generated
	 */
	int IF = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.MatrixConfigImpl <em>Matrix Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.MatrixConfigImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getMatrixConfig()
	 * @generated
	 */
	int MATRIX_CONFIG = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_CONFIG__KEY = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_CONFIG__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_CONFIG__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Matrix Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Matrix Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.ConcurrencyImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getConcurrency()
	 * @generated
	 */
	int CONCURRENCY = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Cancel in progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__CANCEL_IN_PROGRESS = 1;

	/**
	 * The number of structural features of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.CredentialsImpl <em>Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.CredentialsImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 19;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.DefaultSettingImpl <em>Default Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.DefaultSettingImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getDefaultSetting()
	 * @generated
	 */
	int DEFAULT_SETTING = 20;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SETTING__SHELL = 0;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SETTING__WORKING_DIRECTORY = 1;

	/**
	 * The number of structural features of the '<em>Default Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SETTING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Default Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.PermissionImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 21;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERMISSION = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Read All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__READ_ALL = 2;

	/**
	 * The feature id for the '<em><b>Write All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__WRITE_ALL = 3;

	/**
	 * The feature id for the '<em><b>Disable All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__DISABLE_ALL = 4;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.OutputImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.EnvImpl <em>Env</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.EnvImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEnv()
	 * @generated
	 */
	int ENV = 23;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.ServiceImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.InputParamsImpl <em>Input Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.InputParamsImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInputParams()
	 * @generated
	 */
	int INPUT_PARAMS = 25;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Input Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.CacheImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 26;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__USES = ACTION__USES;

	/**
	 * The feature id for the '<em><b>Composite action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__COMPOSITE_ACTION = ACTION__COMPOSITE_ACTION;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__WITH = ACTION__WITH;

	/**
	 * The feature id for the '<em><b>With input Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__WITH_INPUT_PAIR = ACTION__WITH_INPUT_PAIR;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__KEY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PATHS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.PullTriggerImpl <em>Pull Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.PullTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPullTrigger()
	 * @generated
	 */
	int PULL_TRIGGER = 27;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TRIGGER__ACTIVITY_TYPE = EVENT_TRIGGER__ACTIVITY_TYPE;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TRIGGER__BRANCHES = EVENT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TRIGGER__PATHS = EVENT_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pull Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TRIGGER_FEATURE_COUNT = EVENT_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pull Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TRIGGER_OPERATION_COUNT = EVENT_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.StandardEventTriggerImpl <em>Standard Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.StandardEventTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getStandardEventTrigger()
	 * @generated
	 */
	int STANDARD_EVENT_TRIGGER = 28;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER__ACTIVITY_TYPE = EVENT_TRIGGER__ACTIVITY_TYPE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER__EVENT = EVENT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER_FEATURE_COUNT = EVENT_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER_OPERATION_COUNT = EVENT_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.DockerImpl <em>Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.DockerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getDocker()
	 * @generated
	 */
	int DOCKER = 29;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__USES = ACTION__USES;

	/**
	 * The feature id for the '<em><b>Composite action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__COMPOSITE_ACTION = ACTION__COMPOSITE_ACTION;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__WITH = ACTION__WITH;

	/**
	 * The feature id for the '<em><b>With input Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__WITH_INPUT_PAIR = ACTION__WITH_INPUT_PAIR;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__IMAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__PRE_ENTRYPOINT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ENVS = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ENTRYPOINT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Post entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__POST_ENTRYPOINT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ARGS = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.InputTriggerImpl <em>Input Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.InputTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInputTrigger()
	 * @generated
	 */
	int INPUT_TRIGGER = 30;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TRIGGER__INPUTS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.WorkflowCallTriggerImpl <em>Workflow Call Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.WorkflowCallTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWorkflowCallTrigger()
	 * @generated
	 */
	int WORKFLOW_CALL_TRIGGER = 31;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__INPUTS = INPUT_TRIGGER__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__OUTPUTS = INPUT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__SECRETS = INPUT_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Call Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER_FEATURE_COUNT = INPUT_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workflow Call Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER_OPERATION_COUNT = INPUT_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.InputImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFAULT = 5;

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
	 * The meta object id for the '{@link gHA_metamodel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.ContainerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 33;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUMES = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CREDENTIAL = 4;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENVS = 5;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.WorkflowDispatchTriggerImpl <em>Workflow Dispatch Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.WorkflowDispatchTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWorkflowDispatchTrigger()
	 * @generated
	 */
	int WORKFLOW_DISPATCH_TRIGGER = 34;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER__INPUTS = INPUT_TRIGGER__INPUTS;

	/**
	 * The number of structural features of the '<em>Workflow Dispatch Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER_FEATURE_COUNT = INPUT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workflow Dispatch Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER_OPERATION_COUNT = INPUT_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.WorkflowRunTriggerImpl <em>Workflow Run Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.WorkflowRunTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWorkflowRunTrigger()
	 * @generated
	 */
	int WORKFLOW_RUN_TRIGGER = 35;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER__WORKFLOW = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER__TYPE = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Run Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workflow Run Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.BranchImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__IGNORE = 1;

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
	 * The meta object id for the '{@link gHA_metamodel.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.TagImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__IGNORE = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.PathImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__IGNORE = 1;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.PullTargetTriggerImpl <em>Pull Target Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.PullTargetTriggerImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPullTargetTrigger()
	 * @generated
	 */
	int PULL_TARGET_TRIGGER = 39;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TARGET_TRIGGER__ACTIVITY_TYPE = EVENT_TRIGGER__ACTIVITY_TYPE;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TARGET_TRIGGER__BRANCHES = EVENT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TARGET_TRIGGER__PATHS = EVENT_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pull Target Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TARGET_TRIGGER_FEATURE_COUNT = EVENT_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pull Target Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_TARGET_TRIGGER_OPERATION_COUNT = EVENT_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.RestoreCacheImpl <em>Restore Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.RestoreCacheImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getRestoreCache()
	 * @generated
	 */
	int RESTORE_CACHE = 40;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__USES = CACHE__USES;

	/**
	 * The feature id for the '<em><b>Composite action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__COMPOSITE_ACTION = CACHE__COMPOSITE_ACTION;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__WITH = CACHE__WITH;

	/**
	 * The feature id for the '<em><b>With input Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__WITH_INPUT_PAIR = CACHE__WITH_INPUT_PAIR;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__KEY = CACHE__KEY;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__PATHS = CACHE__PATHS;

	/**
	 * The feature id for the '<em><b>Restore keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__RESTORE_KEYS = CACHE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lookup only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__LOOKUP_ONLY = CACHE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fail on cache miss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE__FAIL_ON_CACHE_MISS = CACHE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Restore Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_FEATURE_COUNT = CACHE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Restore Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_OPERATION_COUNT = CACHE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.SaveCacheImpl <em>Save Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.SaveCacheImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getSaveCache()
	 * @generated
	 */
	int SAVE_CACHE = 41;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__USES = CACHE__USES;

	/**
	 * The feature id for the '<em><b>Composite action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__COMPOSITE_ACTION = CACHE__COMPOSITE_ACTION;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__WITH = CACHE__WITH;

	/**
	 * The feature id for the '<em><b>With input Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__WITH_INPUT_PAIR = CACHE__WITH_INPUT_PAIR;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__KEY = CACHE__KEY;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__PATHS = CACHE__PATHS;

	/**
	 * The feature id for the '<em><b>Upload chunk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE__UPLOAD_CHUNK_SIZE = CACHE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Save Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_FEATURE_COUNT = CACHE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Save Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_OPERATION_COUNT = CACHE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.impl.InputPairImpl <em>Input Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.impl.InputPairImpl
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInputPair()
	 * @generated
	 */
	int INPUT_PAIR = 42;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PAIR__ARGS = 0;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PAIR__ENTRYPOINT = 1;

	/**
	 * The number of structural features of the '<em>Input Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gHA_metamodel.EVENTS <em>EVENTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.EVENTS
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEVENTS()
	 * @generated
	 */
	int EVENTS = 43;

	/**
	 * The meta object id for the '{@link gHA_metamodel.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.WEBHOOK_ACTIVITY_TYPES
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWEBHOOK_ACTIVITY_TYPES()
	 * @generated
	 */
	int WEBHOOK_ACTIVITY_TYPES = 44;

	/**
	 * The meta object id for the '{@link gHA_metamodel.PERMISSIONS <em>PERMISSIONS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.PERMISSIONS
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPERMISSIONS()
	 * @generated
	 */
	int PERMISSIONS = 45;

	/**
	 * The meta object id for the '{@link gHA_metamodel.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.PERMISSION_SCOPES
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPERMISSION_SCOPES()
	 * @generated
	 */
	int PERMISSION_SCOPES = 46;

	/**
	 * The meta object id for the '{@link gHA_metamodel.INPUT_TYPES <em>INPUT TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.INPUT_TYPES
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getINPUT_TYPES()
	 * @generated
	 */
	int INPUT_TYPES = 47;

	/**
	 * The meta object id for the '{@link gHA_metamodel.ARTIFACT_TYPE <em>ARTIFACT TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.ARTIFACT_TYPE
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getARTIFACT_TYPE()
	 * @generated
	 */
	int ARTIFACT_TYPE = 48;

	/**
	 * The meta object id for the '{@link gHA_metamodel.MATRIX_CONFIG_TYPE <em>MATRIX CONFIG TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gHA_metamodel.MATRIX_CONFIG_TYPE
	 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getMATRIX_CONFIG_TYPE()
	 * @generated
	 */
	int MATRIX_CONFIG_TYPE = 49;

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see gHA_metamodel.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Pipeline#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see gHA_metamodel.Pipeline#getTriggers()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Pipeline#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see gHA_metamodel.Pipeline#getJobs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Jobs();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Pipeline#getRun_name <em>Run name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run name</em>'.
	 * @see gHA_metamodel.Pipeline#getRun_name()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Run_name();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Pipeline#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see gHA_metamodel.Pipeline#getPermissions()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Permissions();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Pipeline#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrency</em>'.
	 * @see gHA_metamodel.Pipeline#getConcurrency()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Concurrency();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Pipeline#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Envs</em>'.
	 * @see gHA_metamodel.Pipeline#getEnvs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Envs();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Pipeline#getDefaultsetting <em>Defaultsetting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaultsetting</em>'.
	 * @see gHA_metamodel.Pipeline#getDefaultsetting()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Defaultsetting();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see gHA_metamodel.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Job#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see gHA_metamodel.Job#getSteps()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Steps();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see gHA_metamodel.Job#getIf()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_If();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy</em>'.
	 * @see gHA_metamodel.Job#getStrategy()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Strategy();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrency</em>'.
	 * @see gHA_metamodel.Job#getConcurrency()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Concurrency();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see gHA_metamodel.Job#getEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getDefaultsetting <em>Defaultsetting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaultsetting</em>'.
	 * @see gHA_metamodel.Job#getDefaultsetting()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Defaultsetting();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Job#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see gHA_metamodel.Job#getPermissions()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Permissions();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Job#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Envs</em>'.
	 * @see gHA_metamodel.Job#getEnvs()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Envs();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getNeed <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Need</em>'.
	 * @see gHA_metamodel.Job#getNeed()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Need();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Job#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see gHA_metamodel.Job#getOutputs()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Job#getTimeout_minutes <em>Timeout minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout minutes</em>'.
	 * @see gHA_metamodel.Job#getTimeout_minutes()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Timeout_minutes();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Job#getContinue_on_error <em>Continue on error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue on error</em>'.
	 * @see gHA_metamodel.Job#getContinue_on_error()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Continue_on_error();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Job#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see gHA_metamodel.Job#getServices()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Job#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see gHA_metamodel.Job#getActions()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Job#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see gHA_metamodel.Job#getSecrets()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Secrets();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getRunner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runner</em>'.
	 * @see gHA_metamodel.Job#getRunner()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Runner();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Job#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see gHA_metamodel.Job#getContainer()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Container();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see gHA_metamodel.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see gHA_metamodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Step#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see gHA_metamodel.Step#getCommands()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Step#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see gHA_metamodel.Step#getParameters()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Step#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see gHA_metamodel.Step#getActions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Step#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Envs</em>'.
	 * @see gHA_metamodel.Step#getEnvs()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Envs();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Step#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see gHA_metamodel.Step#getIf()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_If();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Step#getWorking_directory <em>Working directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working directory</em>'.
	 * @see gHA_metamodel.Step#getWorking_directory()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Working_directory();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Step#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see gHA_metamodel.Step#getShell()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Shell();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Step#isContinue_on_error <em>Continue on error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue on error</em>'.
	 * @see gHA_metamodel.Step#isContinue_on_error()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Continue_on_error();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Step#getTimeout_minutes <em>Timeout minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout minutes</em>'.
	 * @see gHA_metamodel.Step#getTimeout_minutes()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Timeout_minutes();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see gHA_metamodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see gHA_metamodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Parameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see gHA_metamodel.Parameter#getParameter()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Parameter();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see gHA_metamodel.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Environment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see gHA_metamodel.Environment#getUrl()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Url();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see gHA_metamodel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Action#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses</em>'.
	 * @see gHA_metamodel.Action#getUses()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Action#getComposite_action <em>Composite action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite action</em>'.
	 * @see gHA_metamodel.Action#getComposite_action()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Composite_action();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Action#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>With</em>'.
	 * @see gHA_metamodel.Action#getWith()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_With();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Action#getWith_inputPair <em>With input Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>With input Pair</em>'.
	 * @see gHA_metamodel.Action#getWith_inputPair()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_With_inputPair();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.EventTrigger <em>Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Trigger</em>'.
	 * @see gHA_metamodel.EventTrigger
	 * @generated
	 */
	EClass getEventTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.EventTrigger#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Activity Type</em>'.
	 * @see gHA_metamodel.EventTrigger#getActivityType()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EAttribute getEventTrigger_ActivityType();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Trigger</em>'.
	 * @see gHA_metamodel.ScheduleTrigger
	 * @generated
	 */
	EClass getScheduleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.ScheduleTrigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see gHA_metamodel.ScheduleTrigger#getCron()
	 * @see #getScheduleTrigger()
	 * @generated
	 */
	EAttribute getScheduleTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.PushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Trigger</em>'.
	 * @see gHA_metamodel.PushTrigger
	 * @generated
	 */
	EClass getPushTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.PushTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see gHA_metamodel.PushTrigger#getBranches()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Branches();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.PushTrigger#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see gHA_metamodel.PushTrigger#getTags()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.PushTrigger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see gHA_metamodel.PushTrigger#getPaths()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Paths();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Runs_On <em>Runs On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runs On</em>'.
	 * @see gHA_metamodel.Runs_On
	 * @generated
	 */
	EClass getRuns_On();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Runs_On#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see gHA_metamodel.Runs_On#getLabels()
	 * @see #getRuns_On()
	 * @generated
	 */
	EAttribute getRuns_On_Labels();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Runs_On#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see gHA_metamodel.Runs_On#getGroup()
	 * @see #getRuns_On()
	 * @generated
	 */
	EAttribute getRuns_On_Group();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret</em>'.
	 * @see gHA_metamodel.Secret
	 * @generated
	 */
	EClass getSecret();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Secret#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see gHA_metamodel.Secret#getKey()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Key();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Secret#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gHA_metamodel.Secret#getValue()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Value();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Secret#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see gHA_metamodel.Secret#isRequired()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Required();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Secret#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Secret#getName()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Name();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Need <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Need</em>'.
	 * @see gHA_metamodel.Need
	 * @generated
	 */
	EClass getNeed();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Need#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Jobs</em>'.
	 * @see gHA_metamodel.Need#getJobs()
	 * @see #getNeed()
	 * @generated
	 */
	EAttribute getNeed_Jobs();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see gHA_metamodel.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Strategy#isFail_fast <em>Fail fast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail fast</em>'.
	 * @see gHA_metamodel.Strategy#isFail_fast()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Fail_fast();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Strategy#getMax_parallel <em>Max parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max parallel</em>'.
	 * @see gHA_metamodel.Strategy#getMax_parallel()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Max_parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Strategy#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see gHA_metamodel.Strategy#getConfigs()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Configs();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see gHA_metamodel.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Artifact#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see gHA_metamodel.Artifact#getPaths()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Paths();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Artifact#getRetention_days <em>Retention days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retention days</em>'.
	 * @see gHA_metamodel.Artifact#getRetention_days()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Retention_days();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Artifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gHA_metamodel.Artifact#getType()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Type();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see gHA_metamodel.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see gHA_metamodel.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Condition();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.MatrixConfig <em>Matrix Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Config</em>'.
	 * @see gHA_metamodel.MatrixConfig
	 * @generated
	 */
	EClass getMatrixConfig();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.MatrixConfig#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see gHA_metamodel.MatrixConfig#getKey()
	 * @see #getMatrixConfig()
	 * @generated
	 */
	EAttribute getMatrixConfig_Key();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.MatrixConfig#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see gHA_metamodel.MatrixConfig#getValues()
	 * @see #getMatrixConfig()
	 * @generated
	 */
	EAttribute getMatrixConfig_Values();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.MatrixConfig#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gHA_metamodel.MatrixConfig#getType()
	 * @see #getMatrixConfig()
	 * @generated
	 */
	EAttribute getMatrixConfig_Type();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency</em>'.
	 * @see gHA_metamodel.Concurrency
	 * @generated
	 */
	EClass getConcurrency();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Concurrency#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see gHA_metamodel.Concurrency#getGroup()
	 * @see #getConcurrency()
	 * @generated
	 */
	EAttribute getConcurrency_Group();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Concurrency#isCancel_in_progress <em>Cancel in progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel in progress</em>'.
	 * @see gHA_metamodel.Concurrency#isCancel_in_progress()
	 * @see #getConcurrency()
	 * @generated
	 */
	EAttribute getConcurrency_Cancel_in_progress();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see gHA_metamodel.Credentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Credentials#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see gHA_metamodel.Credentials#getUsername()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_Username();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Credentials#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see gHA_metamodel.Credentials#getPassword()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_Password();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.DefaultSetting <em>Default Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Setting</em>'.
	 * @see gHA_metamodel.DefaultSetting
	 * @generated
	 */
	EClass getDefaultSetting();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.DefaultSetting#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see gHA_metamodel.DefaultSetting#getShell()
	 * @see #getDefaultSetting()
	 * @generated
	 */
	EAttribute getDefaultSetting_Shell();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.DefaultSetting#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Directory</em>'.
	 * @see gHA_metamodel.DefaultSetting#getWorkingDirectory()
	 * @see #getDefaultSetting()
	 * @generated
	 */
	EAttribute getDefaultSetting_WorkingDirectory();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see gHA_metamodel.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Permission#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see gHA_metamodel.Permission#getPermission()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Permission();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Permission#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see gHA_metamodel.Permission#getScope()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Scope();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Permission#isReadAll <em>Read All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read All</em>'.
	 * @see gHA_metamodel.Permission#isReadAll()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_ReadAll();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Permission#isWriteAll <em>Write All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write All</em>'.
	 * @see gHA_metamodel.Permission#isWriteAll()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_WriteAll();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Permission#isDisableAll <em>Disable All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable All</em>'.
	 * @see gHA_metamodel.Permission#isDisableAll()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_DisableAll();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see gHA_metamodel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gHA_metamodel.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Value();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Output#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gHA_metamodel.Output#getDescription()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Description();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Env <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env</em>'.
	 * @see gHA_metamodel.Env
	 * @generated
	 */
	EClass getEnv();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Env#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see gHA_metamodel.Env#getKey()
	 * @see #getEnv()
	 * @generated
	 */
	EAttribute getEnv_Key();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Env#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gHA_metamodel.Env#getValue()
	 * @see #getEnv()
	 * @generated
	 */
	EAttribute getEnv_Value();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see gHA_metamodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Service#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see gHA_metamodel.Service#getContainer()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Container();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.InputParams <em>Input Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Params</em>'.
	 * @see gHA_metamodel.InputParams
	 * @generated
	 */
	EClass getInputParams();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.InputParams#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see gHA_metamodel.InputParams#getKey()
	 * @see #getInputParams()
	 * @generated
	 */
	EAttribute getInputParams_Key();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.InputParams#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gHA_metamodel.InputParams#getValue()
	 * @see #getInputParams()
	 * @generated
	 */
	EAttribute getInputParams_Value();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see gHA_metamodel.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Cache#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see gHA_metamodel.Cache#getKey()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Key();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Cache#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see gHA_metamodel.Cache#getPaths()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Paths();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.PullTrigger <em>Pull Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Trigger</em>'.
	 * @see gHA_metamodel.PullTrigger
	 * @generated
	 */
	EClass getPullTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.PullTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see gHA_metamodel.PullTrigger#getBranches()
	 * @see #getPullTrigger()
	 * @generated
	 */
	EReference getPullTrigger_Branches();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.PullTrigger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see gHA_metamodel.PullTrigger#getPaths()
	 * @see #getPullTrigger()
	 * @generated
	 */
	EReference getPullTrigger_Paths();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.StandardEventTrigger <em>Standard Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Event Trigger</em>'.
	 * @see gHA_metamodel.StandardEventTrigger
	 * @generated
	 */
	EClass getStandardEventTrigger();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.StandardEventTrigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see gHA_metamodel.StandardEventTrigger#getEvent()
	 * @see #getStandardEventTrigger()
	 * @generated
	 */
	EAttribute getStandardEventTrigger_Event();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker</em>'.
	 * @see gHA_metamodel.Docker
	 * @generated
	 */
	EClass getDocker();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Docker#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see gHA_metamodel.Docker#getImage()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Image();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Docker#getPre_entrypoint <em>Pre entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre entrypoint</em>'.
	 * @see gHA_metamodel.Docker#getPre_entrypoint()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Pre_entrypoint();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Docker#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Envs</em>'.
	 * @see gHA_metamodel.Docker#getEnvs()
	 * @see #getDocker()
	 * @generated
	 */
	EReference getDocker_Envs();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Docker#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entrypoint</em>'.
	 * @see gHA_metamodel.Docker#getEntrypoint()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Entrypoint();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Docker#getPost_entrypoint <em>Post entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post entrypoint</em>'.
	 * @see gHA_metamodel.Docker#getPost_entrypoint()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Post_entrypoint();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Docker#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see gHA_metamodel.Docker#getArgs()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Args();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.InputTrigger <em>Input Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Trigger</em>'.
	 * @see gHA_metamodel.InputTrigger
	 * @generated
	 */
	EClass getInputTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.InputTrigger#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see gHA_metamodel.InputTrigger#getInputs()
	 * @see #getInputTrigger()
	 * @generated
	 */
	EReference getInputTrigger_Inputs();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.WorkflowCallTrigger <em>Workflow Call Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Call Trigger</em>'.
	 * @see gHA_metamodel.WorkflowCallTrigger
	 * @generated
	 */
	EClass getWorkflowCallTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.WorkflowCallTrigger#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see gHA_metamodel.WorkflowCallTrigger#getOutputs()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.WorkflowCallTrigger#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see gHA_metamodel.WorkflowCallTrigger#getSecrets()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Secrets();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see gHA_metamodel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gHA_metamodel.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Input#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see gHA_metamodel.Input#isIsRequired()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_IsRequired();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Input#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see gHA_metamodel.Input#getOptions()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Options();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Input#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gHA_metamodel.Input#getDescription()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Description();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Input#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see gHA_metamodel.Input#getDefault()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Default();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see gHA_metamodel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Container#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see gHA_metamodel.Container#getImage()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Image();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Container#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see gHA_metamodel.Container#getPorts()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Ports();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Volumes</em>'.
	 * @see gHA_metamodel.Container#getVolumes()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Container#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see gHA_metamodel.Container#getOptions()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Options();

	/**
	 * Returns the meta object for the containment reference '{@link gHA_metamodel.Container#getCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credential</em>'.
	 * @see gHA_metamodel.Container#getCredential()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Credential();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.Container#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Envs</em>'.
	 * @see gHA_metamodel.Container#getEnvs()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Envs();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.WorkflowDispatchTrigger <em>Workflow Dispatch Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Dispatch Trigger</em>'.
	 * @see gHA_metamodel.WorkflowDispatchTrigger
	 * @generated
	 */
	EClass getWorkflowDispatchTrigger();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.WorkflowRunTrigger <em>Workflow Run Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Run Trigger</em>'.
	 * @see gHA_metamodel.WorkflowRunTrigger
	 * @generated
	 */
	EClass getWorkflowRunTrigger();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.WorkflowRunTrigger#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workflow</em>'.
	 * @see gHA_metamodel.WorkflowRunTrigger#getWorkflow()
	 * @see #getWorkflowRunTrigger()
	 * @generated
	 */
	EAttribute getWorkflowRunTrigger_Workflow();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.WorkflowRunTrigger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gHA_metamodel.WorkflowRunTrigger#getType()
	 * @see #getWorkflowRunTrigger()
	 * @generated
	 */
	EAttribute getWorkflowRunTrigger_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.WorkflowRunTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see gHA_metamodel.WorkflowRunTrigger#getBranches()
	 * @see #getWorkflowRunTrigger()
	 * @generated
	 */
	EReference getWorkflowRunTrigger_Branches();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see gHA_metamodel.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Branch#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see gHA_metamodel.Branch#isIgnore()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Ignore();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see gHA_metamodel.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Tag#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see gHA_metamodel.Tag#isIgnore()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Ignore();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see gHA_metamodel.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Path#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gHA_metamodel.Path#getName()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Name();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.Path#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see gHA_metamodel.Path#isIgnore()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Ignore();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.PullTargetTrigger <em>Pull Target Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Target Trigger</em>'.
	 * @see gHA_metamodel.PullTargetTrigger
	 * @generated
	 */
	EClass getPullTargetTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.PullTargetTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see gHA_metamodel.PullTargetTrigger#getBranches()
	 * @see #getPullTargetTrigger()
	 * @generated
	 */
	EReference getPullTargetTrigger_Branches();

	/**
	 * Returns the meta object for the containment reference list '{@link gHA_metamodel.PullTargetTrigger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see gHA_metamodel.PullTargetTrigger#getPaths()
	 * @see #getPullTargetTrigger()
	 * @generated
	 */
	EReference getPullTargetTrigger_Paths();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.RestoreCache <em>Restore Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restore Cache</em>'.
	 * @see gHA_metamodel.RestoreCache
	 * @generated
	 */
	EClass getRestoreCache();

	/**
	 * Returns the meta object for the attribute list '{@link gHA_metamodel.RestoreCache#getRestore_keys <em>Restore keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Restore keys</em>'.
	 * @see gHA_metamodel.RestoreCache#getRestore_keys()
	 * @see #getRestoreCache()
	 * @generated
	 */
	EAttribute getRestoreCache_Restore_keys();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.RestoreCache#isLookup_only <em>Lookup only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lookup only</em>'.
	 * @see gHA_metamodel.RestoreCache#isLookup_only()
	 * @see #getRestoreCache()
	 * @generated
	 */
	EAttribute getRestoreCache_Lookup_only();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.RestoreCache#isFail_on_cache_miss <em>Fail on cache miss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail on cache miss</em>'.
	 * @see gHA_metamodel.RestoreCache#isFail_on_cache_miss()
	 * @see #getRestoreCache()
	 * @generated
	 */
	EAttribute getRestoreCache_Fail_on_cache_miss();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.SaveCache <em>Save Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Cache</em>'.
	 * @see gHA_metamodel.SaveCache
	 * @generated
	 */
	EClass getSaveCache();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.SaveCache#getUpload_chunk_size <em>Upload chunk size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upload chunk size</em>'.
	 * @see gHA_metamodel.SaveCache#getUpload_chunk_size()
	 * @see #getSaveCache()
	 * @generated
	 */
	EAttribute getSaveCache_Upload_chunk_size();

	/**
	 * Returns the meta object for class '{@link gHA_metamodel.InputPair <em>Input Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pair</em>'.
	 * @see gHA_metamodel.InputPair
	 * @generated
	 */
	EClass getInputPair();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.InputPair#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see gHA_metamodel.InputPair#getArgs()
	 * @see #getInputPair()
	 * @generated
	 */
	EAttribute getInputPair_Args();

	/**
	 * Returns the meta object for the attribute '{@link gHA_metamodel.InputPair#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entrypoint</em>'.
	 * @see gHA_metamodel.InputPair#getEntrypoint()
	 * @see #getInputPair()
	 * @generated
	 */
	EAttribute getInputPair_Entrypoint();

	/**
	 * Returns the meta object for enum '{@link gHA_metamodel.EVENTS <em>EVENTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVENTS</em>'.
	 * @see gHA_metamodel.EVENTS
	 * @generated
	 */
	EEnum getEVENTS();

	/**
	 * Returns the meta object for enum '{@link gHA_metamodel.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WEBHOOK ACTIVITY TYPES</em>'.
	 * @see gHA_metamodel.WEBHOOK_ACTIVITY_TYPES
	 * @generated
	 */
	EEnum getWEBHOOK_ACTIVITY_TYPES();

	/**
	 * Returns the meta object for enum '{@link gHA_metamodel.PERMISSIONS <em>PERMISSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PERMISSIONS</em>'.
	 * @see gHA_metamodel.PERMISSIONS
	 * @generated
	 */
	EEnum getPERMISSIONS();

	/**
	 * Returns the meta object for enum '{@link gHA_metamodel.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PERMISSION SCOPES</em>'.
	 * @see gHA_metamodel.PERMISSION_SCOPES
	 * @generated
	 */
	EEnum getPERMISSION_SCOPES();

	/**
	 * Returns the meta object for enum '{@link gHA_metamodel.INPUT_TYPES <em>INPUT TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>INPUT TYPES</em>'.
	 * @see gHA_metamodel.INPUT_TYPES
	 * @generated
	 */
	EEnum getINPUT_TYPES();

	/**
	 * Returns the meta object for enum '{@link gHA_metamodel.ARTIFACT_TYPE <em>ARTIFACT TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARTIFACT TYPE</em>'.
	 * @see gHA_metamodel.ARTIFACT_TYPE
	 * @generated
	 */
	EEnum getARTIFACT_TYPE();

	/**
	 * Returns the meta object for enum '{@link gHA_metamodel.MATRIX_CONFIG_TYPE <em>MATRIX CONFIG TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MATRIX CONFIG TYPE</em>'.
	 * @see gHA_metamodel.MATRIX_CONFIG_TYPE
	 * @generated
	 */
	EEnum getMATRIX_CONFIG_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GHA_metamodelFactory getGHA_metamodelFactory();

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
		 * The meta object literal for the '{@link gHA_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.PipelineImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRIGGERS = eINSTANCE.getPipeline_Triggers();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOBS = eINSTANCE.getPipeline_Jobs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Run name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__RUN_NAME = eINSTANCE.getPipeline_Run_name();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PERMISSIONS = eINSTANCE.getPipeline_Permissions();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__CONCURRENCY = eINSTANCE.getPipeline_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Envs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ENVS = eINSTANCE.getPipeline_Envs();

		/**
		 * The meta object literal for the '<em><b>Defaultsetting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DEFAULTSETTING = eINSTANCE.getPipeline_Defaultsetting();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.JobImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEPS = eINSTANCE.getJob_Steps();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IF = eINSTANCE.getJob_If();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STRATEGY = eINSTANCE.getJob_Strategy();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONCURRENCY = eINSTANCE.getJob_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT = eINSTANCE.getJob_Environment();

		/**
		 * The meta object literal for the '<em><b>Defaultsetting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DEFAULTSETTING = eINSTANCE.getJob_Defaultsetting();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PERMISSIONS = eINSTANCE.getJob_Permissions();

		/**
		 * The meta object literal for the '<em><b>Envs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVS = eINSTANCE.getJob_Envs();

		/**
		 * The meta object literal for the '<em><b>Need</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__NEED = eINSTANCE.getJob_Need();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__OUTPUTS = eINSTANCE.getJob_Outputs();

		/**
		 * The meta object literal for the '<em><b>Timeout minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__TIMEOUT_MINUTES = eINSTANCE.getJob_Timeout_minutes();

		/**
		 * The meta object literal for the '<em><b>Continue on error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__CONTINUE_ON_ERROR = eINSTANCE.getJob_Continue_on_error();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SERVICES = eINSTANCE.getJob_Services();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ACTIONS = eINSTANCE.getJob_Actions();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SECRETS = eINSTANCE.getJob_Secrets();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__RUNNER = eINSTANCE.getJob_Runner();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONTAINER = eINSTANCE.getJob_Container();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.TriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.StepImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__COMMANDS = eINSTANCE.getStep_Commands();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARAMETERS = eINSTANCE.getStep_Parameters();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ACTIONS = eINSTANCE.getStep_Actions();

		/**
		 * The meta object literal for the '<em><b>Envs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENVS = eINSTANCE.getStep_Envs();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__IF = eINSTANCE.getStep_If();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Working directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__WORKING_DIRECTORY = eINSTANCE.getStep_Working_directory();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__SHELL = eINSTANCE.getStep_Shell();

		/**
		 * The meta object literal for the '<em><b>Continue on error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__CONTINUE_ON_ERROR = eINSTANCE.getStep_Continue_on_error();

		/**
		 * The meta object literal for the '<em><b>Timeout minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TIMEOUT_MINUTES = eINSTANCE.getStep_Timeout_minutes();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.CommandImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getCommand()
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
		 * The meta object literal for the '{@link gHA_metamodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.ParameterImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER = eINSTANCE.getParameter_Parameter();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.EnvironmentImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__URL = eINSTANCE.getEnvironment_Url();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.ActionImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__USES = eINSTANCE.getAction_Uses();

		/**
		 * The meta object literal for the '<em><b>Composite action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__COMPOSITE_ACTION = eINSTANCE.getAction_Composite_action();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__WITH = eINSTANCE.getAction_With();

		/**
		 * The meta object literal for the '<em><b>With input Pair</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__WITH_INPUT_PAIR = eINSTANCE.getAction_With_inputPair();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.EventTriggerImpl <em>Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.EventTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEventTrigger()
		 * @generated
		 */
		EClass EVENT_TRIGGER = eINSTANCE.getEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TRIGGER__ACTIVITY_TYPE = eINSTANCE.getEventTrigger_ActivityType();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.ScheduleTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getScheduleTrigger()
		 * @generated
		 */
		EClass SCHEDULE_TRIGGER = eINSTANCE.getScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TRIGGER__CRON = eINSTANCE.getScheduleTrigger_Cron();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.PushTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPushTrigger()
		 * @generated
		 */
		EClass PUSH_TRIGGER = eINSTANCE.getPushTrigger();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__BRANCHES = eINSTANCE.getPushTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__TAGS = eINSTANCE.getPushTrigger_Tags();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__PATHS = eINSTANCE.getPushTrigger_Paths();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.Runs_OnImpl <em>Runs On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.Runs_OnImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getRuns_On()
		 * @generated
		 */
		EClass RUNS_ON = eINSTANCE.getRuns_On();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNS_ON__LABELS = eINSTANCE.getRuns_On_Labels();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNS_ON__GROUP = eINSTANCE.getRuns_On_Group();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.SecretImpl <em>Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.SecretImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getSecret()
		 * @generated
		 */
		EClass SECRET = eINSTANCE.getSecret();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__KEY = eINSTANCE.getSecret_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__VALUE = eINSTANCE.getSecret_Value();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__REQUIRED = eINSTANCE.getSecret_Required();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__NAME = eINSTANCE.getSecret_Name();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.NeedImpl <em>Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.NeedImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getNeed()
		 * @generated
		 */
		EClass NEED = eINSTANCE.getNeed();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEED__JOBS = eINSTANCE.getNeed_Jobs();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.StrategyImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Fail fast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__FAIL_FAST = eINSTANCE.getStrategy_Fail_fast();

		/**
		 * The meta object literal for the '<em><b>Max parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__MAX_PARALLEL = eINSTANCE.getStrategy_Max_parallel();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__CONFIGS = eINSTANCE.getStrategy_Configs();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.ArtifactImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PATHS = eINSTANCE.getArtifact_Paths();

		/**
		 * The meta object literal for the '<em><b>Retention days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__RETENTION_DAYS = eINSTANCE.getArtifact_Retention_days();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__TYPE = eINSTANCE.getArtifact_Type();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.IfImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.MatrixConfigImpl <em>Matrix Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.MatrixConfigImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getMatrixConfig()
		 * @generated
		 */
		EClass MATRIX_CONFIG = eINSTANCE.getMatrixConfig();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_CONFIG__KEY = eINSTANCE.getMatrixConfig_Key();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_CONFIG__VALUES = eINSTANCE.getMatrixConfig_Values();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_CONFIG__TYPE = eINSTANCE.getMatrixConfig_Type();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.ConcurrencyImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getConcurrency()
		 * @generated
		 */
		EClass CONCURRENCY = eINSTANCE.getConcurrency();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY__GROUP = eINSTANCE.getConcurrency_Group();

		/**
		 * The meta object literal for the '<em><b>Cancel in progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY__CANCEL_IN_PROGRESS = eINSTANCE.getConcurrency_Cancel_in_progress();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.CredentialsImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__USERNAME = eINSTANCE.getCredentials_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__PASSWORD = eINSTANCE.getCredentials_Password();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.DefaultSettingImpl <em>Default Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.DefaultSettingImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getDefaultSetting()
		 * @generated
		 */
		EClass DEFAULT_SETTING = eINSTANCE.getDefaultSetting();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_SETTING__SHELL = eINSTANCE.getDefaultSetting_Shell();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_SETTING__WORKING_DIRECTORY = eINSTANCE.getDefaultSetting_WorkingDirectory();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.PermissionImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__PERMISSION = eINSTANCE.getPermission_Permission();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__SCOPE = eINSTANCE.getPermission_Scope();

		/**
		 * The meta object literal for the '<em><b>Read All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__READ_ALL = eINSTANCE.getPermission_ReadAll();

		/**
		 * The meta object literal for the '<em><b>Write All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__WRITE_ALL = eINSTANCE.getPermission_WriteAll();

		/**
		 * The meta object literal for the '<em><b>Disable All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__DISABLE_ALL = eINSTANCE.getPermission_DisableAll();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.OutputImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__DESCRIPTION = eINSTANCE.getOutput_Description();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.EnvImpl <em>Env</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.EnvImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEnv()
		 * @generated
		 */
		EClass ENV = eINSTANCE.getEnv();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV__KEY = eINSTANCE.getEnv_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV__VALUE = eINSTANCE.getEnv_Value();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.ServiceImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CONTAINER = eINSTANCE.getService_Container();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.InputParamsImpl <em>Input Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.InputParamsImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInputParams()
		 * @generated
		 */
		EClass INPUT_PARAMS = eINSTANCE.getInputParams();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PARAMS__KEY = eINSTANCE.getInputParams_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PARAMS__VALUE = eINSTANCE.getInputParams_Value();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.CacheImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__KEY = eINSTANCE.getCache_Key();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__PATHS = eINSTANCE.getCache_Paths();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.PullTriggerImpl <em>Pull Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.PullTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPullTrigger()
		 * @generated
		 */
		EClass PULL_TRIGGER = eINSTANCE.getPullTrigger();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_TRIGGER__BRANCHES = eINSTANCE.getPullTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_TRIGGER__PATHS = eINSTANCE.getPullTrigger_Paths();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.StandardEventTriggerImpl <em>Standard Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.StandardEventTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getStandardEventTrigger()
		 * @generated
		 */
		EClass STANDARD_EVENT_TRIGGER = eINSTANCE.getStandardEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_EVENT_TRIGGER__EVENT = eINSTANCE.getStandardEventTrigger_Event();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.DockerImpl <em>Docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.DockerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getDocker()
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
		 * The meta object literal for the '<em><b>Pre entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__PRE_ENTRYPOINT = eINSTANCE.getDocker_Pre_entrypoint();

		/**
		 * The meta object literal for the '<em><b>Envs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER__ENVS = eINSTANCE.getDocker_Envs();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__ENTRYPOINT = eINSTANCE.getDocker_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Post entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__POST_ENTRYPOINT = eINSTANCE.getDocker_Post_entrypoint();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__ARGS = eINSTANCE.getDocker_Args();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.InputTriggerImpl <em>Input Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.InputTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInputTrigger()
		 * @generated
		 */
		EClass INPUT_TRIGGER = eINSTANCE.getInputTrigger();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_TRIGGER__INPUTS = eINSTANCE.getInputTrigger_Inputs();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.WorkflowCallTriggerImpl <em>Workflow Call Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.WorkflowCallTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWorkflowCallTrigger()
		 * @generated
		 */
		EClass WORKFLOW_CALL_TRIGGER = eINSTANCE.getWorkflowCallTrigger();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__OUTPUTS = eINSTANCE.getWorkflowCallTrigger_Outputs();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__SECRETS = eINSTANCE.getWorkflowCallTrigger_Secrets();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.InputImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__IS_REQUIRED = eINSTANCE.getInput_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__OPTIONS = eINSTANCE.getInput_Options();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DESCRIPTION = eINSTANCE.getInput_Description();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DEFAULT = eINSTANCE.getInput_Default();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.ContainerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IMAGE = eINSTANCE.getContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PORTS = eINSTANCE.getContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__VOLUMES = eINSTANCE.getContainer_Volumes();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__OPTIONS = eINSTANCE.getContainer_Options();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CREDENTIAL = eINSTANCE.getContainer_Credential();

		/**
		 * The meta object literal for the '<em><b>Envs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ENVS = eINSTANCE.getContainer_Envs();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.WorkflowDispatchTriggerImpl <em>Workflow Dispatch Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.WorkflowDispatchTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWorkflowDispatchTrigger()
		 * @generated
		 */
		EClass WORKFLOW_DISPATCH_TRIGGER = eINSTANCE.getWorkflowDispatchTrigger();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.WorkflowRunTriggerImpl <em>Workflow Run Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.WorkflowRunTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWorkflowRunTrigger()
		 * @generated
		 */
		EClass WORKFLOW_RUN_TRIGGER = eINSTANCE.getWorkflowRunTrigger();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_RUN_TRIGGER__WORKFLOW = eINSTANCE.getWorkflowRunTrigger_Workflow();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_RUN_TRIGGER__TYPE = eINSTANCE.getWorkflowRunTrigger_Type();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_RUN_TRIGGER__BRANCHES = eINSTANCE.getWorkflowRunTrigger_Branches();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.BranchImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getBranch()
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
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__IGNORE = eINSTANCE.getBranch_Ignore();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.TagImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__IGNORE = eINSTANCE.getTag_Ignore();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.PathImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__NAME = eINSTANCE.getPath_Name();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__IGNORE = eINSTANCE.getPath_Ignore();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.PullTargetTriggerImpl <em>Pull Target Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.PullTargetTriggerImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPullTargetTrigger()
		 * @generated
		 */
		EClass PULL_TARGET_TRIGGER = eINSTANCE.getPullTargetTrigger();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_TARGET_TRIGGER__BRANCHES = eINSTANCE.getPullTargetTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_TARGET_TRIGGER__PATHS = eINSTANCE.getPullTargetTrigger_Paths();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.RestoreCacheImpl <em>Restore Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.RestoreCacheImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getRestoreCache()
		 * @generated
		 */
		EClass RESTORE_CACHE = eINSTANCE.getRestoreCache();

		/**
		 * The meta object literal for the '<em><b>Restore keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTORE_CACHE__RESTORE_KEYS = eINSTANCE.getRestoreCache_Restore_keys();

		/**
		 * The meta object literal for the '<em><b>Lookup only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTORE_CACHE__LOOKUP_ONLY = eINSTANCE.getRestoreCache_Lookup_only();

		/**
		 * The meta object literal for the '<em><b>Fail on cache miss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTORE_CACHE__FAIL_ON_CACHE_MISS = eINSTANCE.getRestoreCache_Fail_on_cache_miss();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.SaveCacheImpl <em>Save Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.SaveCacheImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getSaveCache()
		 * @generated
		 */
		EClass SAVE_CACHE = eINSTANCE.getSaveCache();

		/**
		 * The meta object literal for the '<em><b>Upload chunk size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVE_CACHE__UPLOAD_CHUNK_SIZE = eINSTANCE.getSaveCache_Upload_chunk_size();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.impl.InputPairImpl <em>Input Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.impl.InputPairImpl
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getInputPair()
		 * @generated
		 */
		EClass INPUT_PAIR = eINSTANCE.getInputPair();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PAIR__ARGS = eINSTANCE.getInputPair_Args();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PAIR__ENTRYPOINT = eINSTANCE.getInputPair_Entrypoint();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.EVENTS <em>EVENTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.EVENTS
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getEVENTS()
		 * @generated
		 */
		EEnum EVENTS = eINSTANCE.getEVENTS();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.WEBHOOK_ACTIVITY_TYPES
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getWEBHOOK_ACTIVITY_TYPES()
		 * @generated
		 */
		EEnum WEBHOOK_ACTIVITY_TYPES = eINSTANCE.getWEBHOOK_ACTIVITY_TYPES();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.PERMISSIONS <em>PERMISSIONS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.PERMISSIONS
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPERMISSIONS()
		 * @generated
		 */
		EEnum PERMISSIONS = eINSTANCE.getPERMISSIONS();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.PERMISSION_SCOPES
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getPERMISSION_SCOPES()
		 * @generated
		 */
		EEnum PERMISSION_SCOPES = eINSTANCE.getPERMISSION_SCOPES();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.INPUT_TYPES <em>INPUT TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.INPUT_TYPES
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getINPUT_TYPES()
		 * @generated
		 */
		EEnum INPUT_TYPES = eINSTANCE.getINPUT_TYPES();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.ARTIFACT_TYPE <em>ARTIFACT TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.ARTIFACT_TYPE
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getARTIFACT_TYPE()
		 * @generated
		 */
		EEnum ARTIFACT_TYPE = eINSTANCE.getARTIFACT_TYPE();

		/**
		 * The meta object literal for the '{@link gHA_metamodel.MATRIX_CONFIG_TYPE <em>MATRIX CONFIG TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gHA_metamodel.MATRIX_CONFIG_TYPE
		 * @see gHA_metamodel.impl.GHA_metamodelPackageImpl#getMATRIX_CONFIG_TYPE()
		 * @generated
		 */
		EEnum MATRIX_CONFIG_TYPE = eINSTANCE.getMATRIX_CONFIG_TYPE();

	}

} //GHA_metamodelPackage
