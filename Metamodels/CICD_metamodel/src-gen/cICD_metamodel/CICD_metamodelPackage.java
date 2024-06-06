/**
 */
package cICD_metamodel;

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
 * @see cICD_metamodel.CICD_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface CICD_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cICD_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cICD_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cICD_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CICD_metamodelPackage eINSTANCE = cICD_metamodel.impl.CICD_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.CommandImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 0;

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
	 * The meta object id for the '{@link cICD_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.EnvironmentImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 1;

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
	 * The meta object id for the '{@link cICD_metamodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.StepImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 2;

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
	 * The feature id for the '<em><b>Cache</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENVIRONMENTS = 3;

	/**
	 * The feature id for the '<em><b>If Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IF_STEP = 4;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.IfStepImpl <em>If Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.IfStepImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getIfStep()
	 * @generated
	 */
	int IF_STEP = 3;

	/**
	 * The feature id for the '<em><b>If steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STEP__IF_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Else steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STEP__ELSE_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STEP__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>If Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STEP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>If Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.ScheduleTriggerImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getScheduleTrigger()
	 * @generated
	 */
	int SCHEDULE_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__TIMER = 0;

	/**
	 * The number of structural features of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.AgentImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LABELS = 1;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.MatrixConfigImpl <em>Matrix Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.MatrixConfigImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getMatrixConfig()
	 * @generated
	 */
	int MATRIX_CONFIG = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_CONFIG__NAME = 0;

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
	 * The meta object id for the '{@link cICD_metamodel.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.ParametersImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 7;

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
	 * The meta object id for the '{@link cICD_metamodel.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.JobImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 8;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEPS = 0;

	/**
	 * The feature id for the '<em><b>If Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IF_STEP = 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARTIFACTS = 2;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENTS = 3;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOBS = 4;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__MATRIX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 6;

	/**
	 * The feature id for the '<em><b>Allow Faillure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ALLOW_FAILLURE = 7;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARALLEL = 8;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__AGENTS = 9;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OUTPUT = 10;

	/**
	 * The feature id for the '<em><b>Require Jobs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__REQUIRE_JOBS = 11;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.PipelineImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 9;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOBS = 0;

	/**
	 * The feature id for the '<em><b>Pipeline environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PIPELINE_ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRIGGERS = 2;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__AGENTS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__INPUTS = 5;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__OUTPUT = 6;

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
	 * The meta object id for the '{@link cICD_metamodel.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.MatrixImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 10;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__CONFIGS = 2;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__JOBS = 3;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.CacheImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 11;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__MODE = 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PATHS = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__KEYS = 3;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.ArtifactImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATH = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.InputImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUES = 4;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.OutputImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 14;

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
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.impl.DockerContainerImpl <em>Docker Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.impl.DockerContainerImpl
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getDockerContainer()
	 * @generated
	 */
	int DOCKER_CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__ENVIRONMENTS = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cICD_metamodel.CACHE_MODE <em>CACHE MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.CACHE_MODE
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getCACHE_MODE()
	 * @generated
	 */
	int CACHE_MODE = 16;

	/**
	 * The meta object id for the '{@link cICD_metamodel.INPUT_TYPE <em>INPUT TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.INPUT_TYPE
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getINPUT_TYPE()
	 * @generated
	 */
	int INPUT_TYPE = 17;

	/**
	 * The meta object id for the '{@link cICD_metamodel.ARTIFACT_TYPE <em>ARTIFACT TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.ARTIFACT_TYPE
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getARTIFACT_TYPE()
	 * @generated
	 */
	int ARTIFACT_TYPE = 18;

	/**
	 * The meta object id for the '{@link cICD_metamodel.MATRIX_CONFIG_TYPE <em>MATRIX CONFIG TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cICD_metamodel.MATRIX_CONFIG_TYPE
	 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getMATRIX_CONFIG_TYPE()
	 * @generated
	 */
	int MATRIX_CONFIG_TYPE = 19;

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see cICD_metamodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see cICD_metamodel.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Environment#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cICD_metamodel.Environment#getKey()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Key();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Environment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cICD_metamodel.Environment#getValue()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Value();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see cICD_metamodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Step#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see cICD_metamodel.Step#getCommands()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Step#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see cICD_metamodel.Step#getParameters()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Step#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cache</em>'.
	 * @see cICD_metamodel.Step#getCache()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Step#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see cICD_metamodel.Step#getEnvironments()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Environments();

	/**
	 * Returns the meta object for the containment reference '{@link cICD_metamodel.Step#getIfStep <em>If Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Step</em>'.
	 * @see cICD_metamodel.Step#getIfStep()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_IfStep();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.IfStep <em>If Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Step</em>'.
	 * @see cICD_metamodel.IfStep
	 * @generated
	 */
	EClass getIfStep();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.IfStep#getIf_steps <em>If steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If steps</em>'.
	 * @see cICD_metamodel.IfStep#getIf_steps()
	 * @see #getIfStep()
	 * @generated
	 */
	EReference getIfStep_If_steps();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.IfStep#getElse_steps <em>Else steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else steps</em>'.
	 * @see cICD_metamodel.IfStep#getElse_steps()
	 * @see #getIfStep()
	 * @generated
	 */
	EReference getIfStep_Else_steps();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.IfStep#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see cICD_metamodel.IfStep#getCondition()
	 * @see #getIfStep()
	 * @generated
	 */
	EAttribute getIfStep_Condition();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Trigger</em>'.
	 * @see cICD_metamodel.ScheduleTrigger
	 * @generated
	 */
	EClass getScheduleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.ScheduleTrigger#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see cICD_metamodel.ScheduleTrigger#getTimer()
	 * @see #getScheduleTrigger()
	 * @generated
	 */
	EAttribute getScheduleTrigger_Timer();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see cICD_metamodel.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference '{@link cICD_metamodel.Agent#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see cICD_metamodel.Agent#getContainer()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Container();

	/**
	 * Returns the meta object for the attribute list '{@link cICD_metamodel.Agent#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see cICD_metamodel.Agent#getLabels()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Labels();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.MatrixConfig <em>Matrix Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Config</em>'.
	 * @see cICD_metamodel.MatrixConfig
	 * @generated
	 */
	EClass getMatrixConfig();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.MatrixConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.MatrixConfig#getName()
	 * @see #getMatrixConfig()
	 * @generated
	 */
	EAttribute getMatrixConfig_Name();

	/**
	 * Returns the meta object for the attribute list '{@link cICD_metamodel.MatrixConfig#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see cICD_metamodel.MatrixConfig#getValues()
	 * @see #getMatrixConfig()
	 * @generated
	 */
	EAttribute getMatrixConfig_Values();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.MatrixConfig#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cICD_metamodel.MatrixConfig#getType()
	 * @see #getMatrixConfig()
	 * @generated
	 */
	EAttribute getMatrixConfig_Type();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see cICD_metamodel.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Parameters#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see cICD_metamodel.Parameters#getParameter()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Parameter();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see cICD_metamodel.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Job#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see cICD_metamodel.Job#getSteps()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Job#getIfStep <em>If Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Step</em>'.
	 * @see cICD_metamodel.Job#getIfStep()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_IfStep();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Job#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see cICD_metamodel.Job#getArtifacts()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Job#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see cICD_metamodel.Job#getEnvironments()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Job#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see cICD_metamodel.Job#getJobs()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Jobs();

	/**
	 * Returns the meta object for the containment reference '{@link cICD_metamodel.Job#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see cICD_metamodel.Job#getMatrix()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Matrix();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Job#getAllowFaillure <em>Allow Faillure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Faillure</em>'.
	 * @see cICD_metamodel.Job#getAllowFaillure()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_AllowFaillure();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Job#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see cICD_metamodel.Job#getParallel()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Job#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see cICD_metamodel.Job#getAgents()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Job#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see cICD_metamodel.Job#getOutput()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Output();

	/**
	 * Returns the meta object for the attribute list '{@link cICD_metamodel.Job#getRequireJobs <em>Require Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Require Jobs</em>'.
	 * @see cICD_metamodel.Job#getRequireJobs()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_RequireJobs();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see cICD_metamodel.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Pipeline#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see cICD_metamodel.Pipeline#getJobs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Jobs();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Pipeline#getPipeline_environment <em>Pipeline environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipeline environment</em>'.
	 * @see cICD_metamodel.Pipeline#getPipeline_environment()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Pipeline_environment();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Pipeline#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see cICD_metamodel.Pipeline#getTriggers()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Pipeline#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see cICD_metamodel.Pipeline#getAgents()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Agents();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Pipeline#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see cICD_metamodel.Pipeline#getInputs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Pipeline#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see cICD_metamodel.Pipeline#getOutput()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Output();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see cICD_metamodel.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Matrix#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see cICD_metamodel.Matrix#getSteps()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Steps();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Matrix#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.Matrix#getName()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Matrix#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see cICD_metamodel.Matrix#getConfigs()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Configs();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.Matrix#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see cICD_metamodel.Matrix#getJobs()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Jobs();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see cICD_metamodel.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Cache#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see cICD_metamodel.Cache#getMode()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Mode();

	/**
	 * Returns the meta object for the attribute list '{@link cICD_metamodel.Cache#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see cICD_metamodel.Cache#getPaths()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Paths();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Cache#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cICD_metamodel.Cache#getKey()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Key();

	/**
	 * Returns the meta object for the attribute list '{@link cICD_metamodel.Cache#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keys</em>'.
	 * @see cICD_metamodel.Cache#getKeys()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Keys();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see cICD_metamodel.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Artifact#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see cICD_metamodel.Artifact#getMessage()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Message();

	/**
	 * Returns the meta object for the attribute list '{@link cICD_metamodel.Artifact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see cICD_metamodel.Artifact#getPath()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Path();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Artifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cICD_metamodel.Artifact#getType()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Type();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see cICD_metamodel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cICD_metamodel.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Input#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see cICD_metamodel.Input#getDefault()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Default();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Input#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cICD_metamodel.Input#getDescription()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Description();

	/**
	 * Returns the meta object for the attribute list '{@link cICD_metamodel.Input#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see cICD_metamodel.Input#getValues()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Values();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see cICD_metamodel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cICD_metamodel.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cICD_metamodel.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Value();

	/**
	 * Returns the meta object for class '{@link cICD_metamodel.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Container</em>'.
	 * @see cICD_metamodel.DockerContainer
	 * @generated
	 */
	EClass getDockerContainer();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.DockerContainer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see cICD_metamodel.DockerContainer#getImage()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link cICD_metamodel.DockerContainer#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see cICD_metamodel.DockerContainer#getEnvironments()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Environments();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.DockerContainer#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see cICD_metamodel.DockerContainer#getUsername()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Username();

	/**
	 * Returns the meta object for the attribute '{@link cICD_metamodel.DockerContainer#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see cICD_metamodel.DockerContainer#getPassword()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Password();

	/**
	 * Returns the meta object for enum '{@link cICD_metamodel.CACHE_MODE <em>CACHE MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CACHE MODE</em>'.
	 * @see cICD_metamodel.CACHE_MODE
	 * @generated
	 */
	EEnum getCACHE_MODE();

	/**
	 * Returns the meta object for enum '{@link cICD_metamodel.INPUT_TYPE <em>INPUT TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>INPUT TYPE</em>'.
	 * @see cICD_metamodel.INPUT_TYPE
	 * @generated
	 */
	EEnum getINPUT_TYPE();

	/**
	 * Returns the meta object for enum '{@link cICD_metamodel.ARTIFACT_TYPE <em>ARTIFACT TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARTIFACT TYPE</em>'.
	 * @see cICD_metamodel.ARTIFACT_TYPE
	 * @generated
	 */
	EEnum getARTIFACT_TYPE();

	/**
	 * Returns the meta object for enum '{@link cICD_metamodel.MATRIX_CONFIG_TYPE <em>MATRIX CONFIG TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MATRIX CONFIG TYPE</em>'.
	 * @see cICD_metamodel.MATRIX_CONFIG_TYPE
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
	CICD_metamodelFactory getCICD_metamodelFactory();

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
		 * The meta object literal for the '{@link cICD_metamodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.CommandImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getCommand()
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
		 * The meta object literal for the '{@link cICD_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.EnvironmentImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getEnvironment()
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
		 * The meta object literal for the '{@link cICD_metamodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.StepImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getStep()
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
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CACHE = eINSTANCE.getStep_Cache();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENVIRONMENTS = eINSTANCE.getStep_Environments();

		/**
		 * The meta object literal for the '<em><b>If Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__IF_STEP = eINSTANCE.getStep_IfStep();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.IfStepImpl <em>If Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.IfStepImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getIfStep()
		 * @generated
		 */
		EClass IF_STEP = eINSTANCE.getIfStep();

		/**
		 * The meta object literal for the '<em><b>If steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STEP__IF_STEPS = eINSTANCE.getIfStep_If_steps();

		/**
		 * The meta object literal for the '<em><b>Else steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STEP__ELSE_STEPS = eINSTANCE.getIfStep_Else_steps();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_STEP__CONDITION = eINSTANCE.getIfStep_Condition();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.ScheduleTriggerImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getScheduleTrigger()
		 * @generated
		 */
		EClass SCHEDULE_TRIGGER = eINSTANCE.getScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TRIGGER__TIMER = eINSTANCE.getScheduleTrigger_Timer();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.AgentImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__CONTAINER = eINSTANCE.getAgent_Container();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__LABELS = eINSTANCE.getAgent_Labels();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.MatrixConfigImpl <em>Matrix Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.MatrixConfigImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getMatrixConfig()
		 * @generated
		 */
		EClass MATRIX_CONFIG = eINSTANCE.getMatrixConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_CONFIG__NAME = eINSTANCE.getMatrixConfig_Name();

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
		 * The meta object literal for the '{@link cICD_metamodel.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.ParametersImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getParameters()
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
		 * The meta object literal for the '{@link cICD_metamodel.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.JobImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getJob()
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
		 * The meta object literal for the '<em><b>If Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IF_STEP = eINSTANCE.getJob_IfStep();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ARTIFACTS = eINSTANCE.getJob_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENTS = eINSTANCE.getJob_Environments();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__JOBS = eINSTANCE.getJob_Jobs();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__MATRIX = eINSTANCE.getJob_Matrix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Allow Faillure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ALLOW_FAILLURE = eINSTANCE.getJob_AllowFaillure();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__PARALLEL = eINSTANCE.getJob_Parallel();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__AGENTS = eINSTANCE.getJob_Agents();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__OUTPUT = eINSTANCE.getJob_Output();

		/**
		 * The meta object literal for the '<em><b>Require Jobs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__REQUIRE_JOBS = eINSTANCE.getJob_RequireJobs();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.PipelineImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOBS = eINSTANCE.getPipeline_Jobs();

		/**
		 * The meta object literal for the '<em><b>Pipeline environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PIPELINE_ENVIRONMENT = eINSTANCE.getPipeline_Pipeline_environment();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRIGGERS = eINSTANCE.getPipeline_Triggers();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__AGENTS = eINSTANCE.getPipeline_Agents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__INPUTS = eINSTANCE.getPipeline_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__OUTPUT = eINSTANCE.getPipeline_Output();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.MatrixImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__STEPS = eINSTANCE.getMatrix_Steps();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NAME = eINSTANCE.getMatrix_Name();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__CONFIGS = eINSTANCE.getMatrix_Configs();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__JOBS = eINSTANCE.getMatrix_Jobs();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.CacheImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__MODE = eINSTANCE.getCache_Mode();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__PATHS = eINSTANCE.getCache_Paths();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__KEY = eINSTANCE.getCache_Key();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__KEYS = eINSTANCE.getCache_Keys();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.ArtifactImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getArtifact()
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
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__MESSAGE = eINSTANCE.getArtifact_Message();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PATH = eINSTANCE.getArtifact_Path();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__TYPE = eINSTANCE.getArtifact_Type();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.InputImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getInput()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DEFAULT = eINSTANCE.getInput_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DESCRIPTION = eINSTANCE.getInput_Description();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VALUES = eINSTANCE.getInput_Values();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.OutputImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getOutput()
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
		 * The meta object literal for the '{@link cICD_metamodel.impl.DockerContainerImpl <em>Docker Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.impl.DockerContainerImpl
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getDockerContainer()
		 * @generated
		 */
		EClass DOCKER_CONTAINER = eINSTANCE.getDockerContainer();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__IMAGE = eINSTANCE.getDockerContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__ENVIRONMENTS = eINSTANCE.getDockerContainer_Environments();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__USERNAME = eINSTANCE.getDockerContainer_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__PASSWORD = eINSTANCE.getDockerContainer_Password();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.CACHE_MODE <em>CACHE MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.CACHE_MODE
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getCACHE_MODE()
		 * @generated
		 */
		EEnum CACHE_MODE = eINSTANCE.getCACHE_MODE();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.INPUT_TYPE <em>INPUT TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.INPUT_TYPE
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getINPUT_TYPE()
		 * @generated
		 */
		EEnum INPUT_TYPE = eINSTANCE.getINPUT_TYPE();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.ARTIFACT_TYPE <em>ARTIFACT TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.ARTIFACT_TYPE
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getARTIFACT_TYPE()
		 * @generated
		 */
		EEnum ARTIFACT_TYPE = eINSTANCE.getARTIFACT_TYPE();

		/**
		 * The meta object literal for the '{@link cICD_metamodel.MATRIX_CONFIG_TYPE <em>MATRIX CONFIG TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cICD_metamodel.MATRIX_CONFIG_TYPE
		 * @see cICD_metamodel.impl.CICD_metamodelPackageImpl#getMATRIX_CONFIG_TYPE()
		 * @generated
		 */
		EEnum MATRIX_CONFIG_TYPE = eINSTANCE.getMATRIX_CONFIG_TYPE();

	}

} //CICD_metamodelPackage
