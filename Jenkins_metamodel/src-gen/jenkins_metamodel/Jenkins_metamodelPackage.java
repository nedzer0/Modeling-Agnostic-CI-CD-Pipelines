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
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
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
	 * The meta object id for the '{@link jenkins_metamodel.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.WhenImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 26;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.BuildingTagImpl <em>Building Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.BuildingTagImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBuildingTag()
	 * @generated
	 */
	int BUILDING_TAG = 0;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AgentImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 30;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.NodeImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CUSTOM_WORKSPACE = AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TriggerImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 3;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AnyImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 4;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.BranchImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 5;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.ChangelogImpl <em>Changelog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ChangelogImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangelog()
	 * @generated
	 */
	int CHANGELOG = 6;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.TriggeredByImpl <em>Triggered By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TriggeredByImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTriggeredBy()
	 * @generated
	 */
	int TRIGGERED_BY = 7;

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
	int EXPRESSION = 8;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.Step_ParameterImpl <em>Step Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.Step_ParameterImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStep_Parameter()
	 * @generated
	 */
	int STEP_PARAMETER = 9;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.ChangeSetImpl <em>Change Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ChangeSetImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangeSet()
	 * @generated
	 */
	int CHANGE_SET = 10;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.NotImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 11;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.StepImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 12;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Step parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_PARAMETERS = 1;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.PostImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPost()
	 * @generated
	 */
	int POST = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__STEPS = 1;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.AnyOfImpl <em>Any Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AnyOfImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAnyOf()
	 * @generated
	 */
	int ANY_OF = 14;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.PipelineImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 15;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENVIRONMENTS = 0;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STAGES = 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__POST = 2;

	/**
	 * The feature id for the '<em><b>Parameter directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PARAMETER_DIRECTIVES = 3;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TOOLS = 4;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__AGENTS = 5;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRIGGERS = 6;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__OPTIONS = 7;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TagImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 16;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.When_EnvImpl <em>When Env</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.When_EnvImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getWhen_Env()
	 * @generated
	 */
	int WHEN_ENV = 17;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.Parameter_DirectiveImpl <em>Parameter Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.Parameter_DirectiveImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParameter_Directive()
	 * @generated
	 */
	int PARAMETER_DIRECTIVE = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DIRECTIVE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DIRECTIVE__NAME = 1;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.AllOfImpl <em>All Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AllOfImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAllOf()
	 * @generated
	 */
	int ALL_OF = 19;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.EqualsImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 20;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.NoneImpl <em>None</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.NoneImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNone()
	 * @generated
	 */
	int NONE = 21;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.ChangeRequestImpl <em>Change Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ChangeRequestImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChangeRequest()
	 * @generated
	 */
	int CHANGE_REQUEST = 22;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.DockerfileImpl <em>Dockerfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.DockerfileImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDockerfile()
	 * @generated
	 */
	int DOCKERFILE = 23;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__DIR = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Build Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__ADDITIONAL_BUILD_ARGS = AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registry Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__REGISTRY_URL = AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registry Credentials Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__REGISTRY_CREDENTIALS_ID = AGENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__LABEL = AGENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__CUSTOM_WORKSPACE = AGENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__REUSE_NODE = AGENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__ARGS = AGENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__FILENAME = AGENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Dockerfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE_FEATURE_COUNT = AGENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Dockerfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.DockerImpl <em>Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.DockerImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDocker()
	 * @generated
	 */
	int DOCKER = 24;

	/**
	 * The feature id for the '<em><b>Registry Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__REGISTRY_URL = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry Credentials Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__REGISTRY_CREDENTIALS_ID = AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__LABEL = AGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Always Pull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ALWAYS_PULL = AGENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__CUSTOM_WORKSPACE = AGENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reuse Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__REUSE_NODE = AGENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ARGS = AGENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__IMAGE = AGENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_FEATURE_COUNT = AGENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.StageImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 25;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STAGES = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__AGENTS = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STEPS = 2;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ENVIRONMENTS = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__INPUTS = 4;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__WHEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__FAIL_FAST = 7;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__PARALLEL = 8;

	/**
	 * The feature id for the '<em><b>Stage options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STAGE_OPTIONS = 9;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__MATRIX = 10;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ToolImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 27;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.EnvironmentImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 28;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.InputImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 29;

	/**
	 * The feature id for the '<em><b>Parameter directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PARAMETER_DIRECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = 2;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OK = 3;

	/**
	 * The feature id for the '<em><b>Submitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SUBMITTER = 4;

	/**
	 * The feature id for the '<em><b>Submitter Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SUBMITTER_PARAMETER = 5;

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
	 * The meta object id for the '{@link jenkins_metamodel.impl.CronImpl <em>Cron</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.CronImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCron()
	 * @generated
	 */
	int CRON = 31;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON__TIMER = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.PollSCMImpl <em>Poll SCM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.PollSCMImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPollSCM()
	 * @generated
	 */
	int POLL_SCM = 32;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SCM__TIMER = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Poll SCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SCM_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Poll SCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SCM_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.UpstreamImpl <em>Upstream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.UpstreamImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getUpstream()
	 * @generated
	 */
	int UPSTREAM = 33;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM__JOBS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM__THRESHOLD = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Upstream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Upstream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.OptionImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 34;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.BuildDiscarderImpl <em>Build Discarder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.BuildDiscarderImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBuildDiscarder()
	 * @generated
	 */
	int BUILD_DISCARDER = 35;

	/**
	 * The feature id for the '<em><b>Num To Keep Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DISCARDER__NUM_TO_KEEP_STR = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Discarder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DISCARDER_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Build Discarder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DISCARDER_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.CheckoutToSubdirectoryImpl <em>Checkout To Subdirectory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.CheckoutToSubdirectoryImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCheckoutToSubdirectory()
	 * @generated
	 */
	int CHECKOUT_TO_SUBDIRECTORY = 36;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_TO_SUBDIRECTORY__DIRECTORY = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Checkout To Subdirectory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_TO_SUBDIRECTORY_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Checkout To Subdirectory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_TO_SUBDIRECTORY_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.SkipStagesAfterUnstableImpl <em>Skip Stages After Unstable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.SkipStagesAfterUnstableImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getSkipStagesAfterUnstable()
	 * @generated
	 */
	int SKIP_STAGES_AFTER_UNSTABLE = 37;

	/**
	 * The number of structural features of the '<em>Skip Stages After Unstable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STAGES_AFTER_UNSTABLE_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Skip Stages After Unstable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STAGES_AFTER_UNSTABLE_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.SkipDefaultCheckoutImpl <em>Skip Default Checkout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.SkipDefaultCheckoutImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getSkipDefaultCheckout()
	 * @generated
	 */
	int SKIP_DEFAULT_CHECKOUT = 38;

	/**
	 * The number of structural features of the '<em>Skip Default Checkout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_DEFAULT_CHECKOUT_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Skip Default Checkout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_DEFAULT_CHECKOUT_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.RetryImpl <em>Retry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.RetryImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getRetry()
	 * @generated
	 */
	int RETRY = 39;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__RETRIES = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Retry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.QuietPeriodImpl <em>Quiet Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.QuietPeriodImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getQuietPeriod()
	 * @generated
	 */
	int QUIET_PERIOD = 40;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIET_PERIOD__PERIOD = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quiet Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIET_PERIOD_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quiet Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIET_PERIOD_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.PreserveStashesImpl <em>Preserve Stashes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.PreserveStashesImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPreserveStashes()
	 * @generated
	 */
	int PRESERVE_STASHES = 41;

	/**
	 * The feature id for the '<em><b>Build Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVE_STASHES__BUILD_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Preserve Stashes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVE_STASHES_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Preserve Stashes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVE_STASHES_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.TimeoutImpl <em>Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TimeoutImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTimeout()
	 * @generated
	 */
	int TIMEOUT = 42;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__TIME = OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__UNIT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FEATURE_COUNT = OPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.ParallelsAlwaysFailFastImpl <em>Parallels Always Fail Fast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ParallelsAlwaysFailFastImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParallelsAlwaysFailFast()
	 * @generated
	 */
	int PARALLELS_ALWAYS_FAIL_FAST = 43;

	/**
	 * The number of structural features of the '<em>Parallels Always Fail Fast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLELS_ALWAYS_FAIL_FAST_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallels Always Fail Fast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLELS_ALWAYS_FAIL_FAST_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.TimestampsImpl <em>Timestamps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TimestampsImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTimestamps()
	 * @generated
	 */
	int TIMESTAMPS = 44;

	/**
	 * The number of structural features of the '<em>Timestamps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPS_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timestamps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPS_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.DisableRestartFromStageImpl <em>Disable Restart From Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.DisableRestartFromStageImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDisableRestartFromStage()
	 * @generated
	 */
	int DISABLE_RESTART_FROM_STAGE = 45;

	/**
	 * The number of structural features of the '<em>Disable Restart From Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_RESTART_FROM_STAGE_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disable Restart From Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_RESTART_FROM_STAGE_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.DisableResumeImpl <em>Disable Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.DisableResumeImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDisableResume()
	 * @generated
	 */
	int DISABLE_RESUME = 46;

	/**
	 * The number of structural features of the '<em>Disable Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_RESUME_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disable Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_RESUME_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.OverrideIndexTriggersImpl <em>Override Index Triggers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.OverrideIndexTriggersImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getOverrideIndexTriggers()
	 * @generated
	 */
	int OVERRIDE_INDEX_TRIGGERS = 47;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_INDEX_TRIGGERS__OVERRIDE = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Override Index Triggers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_INDEX_TRIGGERS_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Override Index Triggers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_INDEX_TRIGGERS_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.NewContainerPerStageImpl <em>New Container Per Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.NewContainerPerStageImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNewContainerPerStage()
	 * @generated
	 */
	int NEW_CONTAINER_PER_STAGE = 48;

	/**
	 * The number of structural features of the '<em>New Container Per Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER_PER_STAGE_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>New Container Per Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER_PER_STAGE_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.DisableConcurrentBuildsImpl <em>Disable Concurrent Builds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.DisableConcurrentBuildsImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDisableConcurrentBuilds()
	 * @generated
	 */
	int DISABLE_CONCURRENT_BUILDS = 49;

	/**
	 * The feature id for the '<em><b>Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_CONCURRENT_BUILDS__ABORT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disable Concurrent Builds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_CONCURRENT_BUILDS_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disable Concurrent Builds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_CONCURRENT_BUILDS_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.StageOptionImpl <em>Stage Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.StageOptionImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStageOption()
	 * @generated
	 */
	int STAGE_OPTION = 50;

	/**
	 * The number of structural features of the '<em>Stage Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stage Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.StringParamImpl <em>String Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.StringParamImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStringParam()
	 * @generated
	 */
	int STRING_PARAM = 51;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM__DESCRIPTION = PARAMETER_DIRECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM__NAME = PARAMETER_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM__DEFAULT_VALUE = PARAMETER_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM_FEATURE_COUNT = PARAMETER_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM_OPERATION_COUNT = PARAMETER_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.TextParamImpl <em>Text Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.TextParamImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTextParam()
	 * @generated
	 */
	int TEXT_PARAM = 52;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAM__DESCRIPTION = PARAMETER_DIRECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAM__NAME = PARAMETER_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAM__DEFAULT_VALUE = PARAMETER_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAM_FEATURE_COUNT = PARAMETER_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAM_OPERATION_COUNT = PARAMETER_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.ChoiceParamImpl <em>Choice Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.ChoiceParamImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChoiceParam()
	 * @generated
	 */
	int CHOICE_PARAM = 53;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_PARAM__DESCRIPTION = PARAMETER_DIRECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_PARAM__NAME = PARAMETER_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_PARAM__CHOICES = PARAMETER_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_PARAM_FEATURE_COUNT = PARAMETER_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_PARAM_OPERATION_COUNT = PARAMETER_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.PasswordParamImpl <em>Password Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.PasswordParamImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPasswordParam()
	 * @generated
	 */
	int PASSWORD_PARAM = 54;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_PARAM__DESCRIPTION = PARAMETER_DIRECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_PARAM__NAME = PARAMETER_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_PARAM__DEFAULT_VALUE = PARAMETER_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Password Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_PARAM_FEATURE_COUNT = PARAMETER_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Password Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_PARAM_OPERATION_COUNT = PARAMETER_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.BooleanParamImpl <em>Boolean Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.BooleanParamImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBooleanParam()
	 * @generated
	 */
	int BOOLEAN_PARAM = 55;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__DESCRIPTION = PARAMETER_DIRECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__NAME = PARAMETER_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM__DEFAULT_VALUE = PARAMETER_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM_FEATURE_COUNT = PARAMETER_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAM_OPERATION_COUNT = PARAMETER_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.MatrixImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 56;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__AXIS = 0;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__STAGES = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__WHEN = 3;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__ENVIRONMENTS = 4;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__AGENTS = 5;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__TOOLS = 6;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__POST = 7;

	/**
	 * The feature id for the '<em><b>Stage options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__STAGE_OPTIONS = 8;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.AxisImpl <em>Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.AxisImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__EXCLUDE = 2;

	/**
	 * The number of structural features of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.impl.LabelImpl
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 58;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LABEL = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.POST_TYPE <em>POST TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.POST_TYPE
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPOST_TYPE()
	 * @generated
	 */
	int POST_TYPE = 59;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.TOOL_TYPE <em>TOOL TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.TOOL_TYPE
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTOOL_TYPE()
	 * @generated
	 */
	int TOOL_TYPE = 60;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.COMPARATOR_TYPE <em>COMPARATOR TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.COMPARATOR_TYPE
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCOMPARATOR_TYPE()
	 * @generated
	 */
	int COMPARATOR_TYPE = 61;

	/**
	 * The meta object id for the '{@link jenkins_metamodel.ATTRIBUTE_TYPE <em>ATTRIBUTE TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jenkins_metamodel.ATTRIBUTE_TYPE
	 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getATTRIBUTE_TYPE()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 62;

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see jenkins_metamodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jenkins_metamodel.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Node#getCustomWorkspace <em>Custom Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Workspace</em>'.
	 * @see jenkins_metamodel.Node#getCustomWorkspace()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_CustomWorkspace();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see jenkins_metamodel.Any
	 * @generated
	 */
	EClass getAny();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see jenkins_metamodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference '{@link jenkins_metamodel.Step#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commands</em>'.
	 * @see jenkins_metamodel.Step#getCommands()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Step#getStep_parameters <em>Step parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step parameters</em>'.
	 * @see jenkins_metamodel.Step#getStep_parameters()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Step_parameters();

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
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Post#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see jenkins_metamodel.Post#getSteps()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Steps();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see jenkins_metamodel.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see jenkins_metamodel.Pipeline#getEnvironments()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see jenkins_metamodel.Pipeline#getStages()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Stages();

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
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getParameter_directives <em>Parameter directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter directives</em>'.
	 * @see jenkins_metamodel.Pipeline#getParameter_directives()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Parameter_directives();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see jenkins_metamodel.Pipeline#getTools()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tools();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see jenkins_metamodel.Pipeline#getAgents()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see jenkins_metamodel.Pipeline#getTriggers()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Pipeline#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see jenkins_metamodel.Pipeline#getOptions()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Options();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Parameter_Directive <em>Parameter Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Directive</em>'.
	 * @see jenkins_metamodel.Parameter_Directive
	 * @generated
	 */
	EClass getParameter_Directive();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Parameter_Directive#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jenkins_metamodel.Parameter_Directive#getDescription()
	 * @see #getParameter_Directive()
	 * @generated
	 */
	EAttribute getParameter_Directive_Description();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Parameter_Directive#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jenkins_metamodel.Parameter_Directive#getName()
	 * @see #getParameter_Directive()
	 * @generated
	 */
	EAttribute getParameter_Directive_Name();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.None <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None</em>'.
	 * @see jenkins_metamodel.None
	 * @generated
	 */
	EClass getNone();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Dockerfile <em>Dockerfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dockerfile</em>'.
	 * @see jenkins_metamodel.Dockerfile
	 * @generated
	 */
	EClass getDockerfile();

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
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jenkins_metamodel.Dockerfile#getLabel()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_Label();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getCustomWorkspace <em>Custom Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Workspace</em>'.
	 * @see jenkins_metamodel.Dockerfile#getCustomWorkspace()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_CustomWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getReuseNode <em>Reuse Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reuse Node</em>'.
	 * @see jenkins_metamodel.Dockerfile#getReuseNode()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_ReuseNode();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Dockerfile#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see jenkins_metamodel.Dockerfile#getArgs()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_Args();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker</em>'.
	 * @see jenkins_metamodel.Docker
	 * @generated
	 */
	EClass getDocker();

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
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jenkins_metamodel.Docker#getLabel()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Label();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#isAlwaysPull <em>Always Pull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Always Pull</em>'.
	 * @see jenkins_metamodel.Docker#isAlwaysPull()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_AlwaysPull();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#getCustomWorkspace <em>Custom Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Workspace</em>'.
	 * @see jenkins_metamodel.Docker#getCustomWorkspace()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_CustomWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#getReuseNode <em>Reuse Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reuse Node</em>'.
	 * @see jenkins_metamodel.Docker#getReuseNode()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_ReuseNode();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Docker#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see jenkins_metamodel.Docker#getArgs()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Args();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see jenkins_metamodel.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see jenkins_metamodel.Stage#getStages()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Stages();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see jenkins_metamodel.Stage#getAgents()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see jenkins_metamodel.Stage#getSteps()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see jenkins_metamodel.Stage#getEnvironments()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see jenkins_metamodel.Stage#getInputs()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Inputs();

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
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Stage#getStage_options <em>Stage options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage options</em>'.
	 * @see jenkins_metamodel.Stage#getStage_options()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Stage_options();

	/**
	 * Returns the meta object for the containment reference '{@link jenkins_metamodel.Stage#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see jenkins_metamodel.Stage#getMatrix()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Matrix();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see jenkins_metamodel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Input#getParameter_directives <em>Parameter directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter directives</em>'.
	 * @see jenkins_metamodel.Input#getParameter_directives()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Parameter_directives();

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
	 * Returns the meta object for class '{@link jenkins_metamodel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see jenkins_metamodel.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Cron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron</em>'.
	 * @see jenkins_metamodel.Cron
	 * @generated
	 */
	EClass getCron();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Cron#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see jenkins_metamodel.Cron#getTimer()
	 * @see #getCron()
	 * @generated
	 */
	EAttribute getCron_Timer();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.PollSCM <em>Poll SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll SCM</em>'.
	 * @see jenkins_metamodel.PollSCM
	 * @generated
	 */
	EClass getPollSCM();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.PollSCM#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see jenkins_metamodel.PollSCM#getTimer()
	 * @see #getPollSCM()
	 * @generated
	 */
	EAttribute getPollSCM_Timer();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Upstream <em>Upstream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upstream</em>'.
	 * @see jenkins_metamodel.Upstream
	 * @generated
	 */
	EClass getUpstream();

	/**
	 * Returns the meta object for the attribute list '{@link jenkins_metamodel.Upstream#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Jobs</em>'.
	 * @see jenkins_metamodel.Upstream#getJobs()
	 * @see #getUpstream()
	 * @generated
	 */
	EAttribute getUpstream_Jobs();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Upstream#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see jenkins_metamodel.Upstream#getThreshold()
	 * @see #getUpstream()
	 * @generated
	 */
	EAttribute getUpstream_Threshold();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see jenkins_metamodel.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.BuildDiscarder <em>Build Discarder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Discarder</em>'.
	 * @see jenkins_metamodel.BuildDiscarder
	 * @generated
	 */
	EClass getBuildDiscarder();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.BuildDiscarder#getNumToKeepStr <em>Num To Keep Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num To Keep Str</em>'.
	 * @see jenkins_metamodel.BuildDiscarder#getNumToKeepStr()
	 * @see #getBuildDiscarder()
	 * @generated
	 */
	EAttribute getBuildDiscarder_NumToKeepStr();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.CheckoutToSubdirectory <em>Checkout To Subdirectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkout To Subdirectory</em>'.
	 * @see jenkins_metamodel.CheckoutToSubdirectory
	 * @generated
	 */
	EClass getCheckoutToSubdirectory();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.CheckoutToSubdirectory#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see jenkins_metamodel.CheckoutToSubdirectory#getDirectory()
	 * @see #getCheckoutToSubdirectory()
	 * @generated
	 */
	EAttribute getCheckoutToSubdirectory_Directory();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.SkipStagesAfterUnstable <em>Skip Stages After Unstable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip Stages After Unstable</em>'.
	 * @see jenkins_metamodel.SkipStagesAfterUnstable
	 * @generated
	 */
	EClass getSkipStagesAfterUnstable();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.SkipDefaultCheckout <em>Skip Default Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip Default Checkout</em>'.
	 * @see jenkins_metamodel.SkipDefaultCheckout
	 * @generated
	 */
	EClass getSkipDefaultCheckout();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Retry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry</em>'.
	 * @see jenkins_metamodel.Retry
	 * @generated
	 */
	EClass getRetry();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Retry#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retries</em>'.
	 * @see jenkins_metamodel.Retry#getRetries()
	 * @see #getRetry()
	 * @generated
	 */
	EAttribute getRetry_Retries();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.QuietPeriod <em>Quiet Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiet Period</em>'.
	 * @see jenkins_metamodel.QuietPeriod
	 * @generated
	 */
	EClass getQuietPeriod();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.QuietPeriod#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see jenkins_metamodel.QuietPeriod#getPeriod()
	 * @see #getQuietPeriod()
	 * @generated
	 */
	EAttribute getQuietPeriod_Period();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.PreserveStashes <em>Preserve Stashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preserve Stashes</em>'.
	 * @see jenkins_metamodel.PreserveStashes
	 * @generated
	 */
	EClass getPreserveStashes();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.PreserveStashes#getBuildCount <em>Build Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Count</em>'.
	 * @see jenkins_metamodel.PreserveStashes#getBuildCount()
	 * @see #getPreserveStashes()
	 * @generated
	 */
	EAttribute getPreserveStashes_BuildCount();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout</em>'.
	 * @see jenkins_metamodel.Timeout
	 * @generated
	 */
	EClass getTimeout();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Timeout#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see jenkins_metamodel.Timeout#getTime()
	 * @see #getTimeout()
	 * @generated
	 */
	EAttribute getTimeout_Time();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Timeout#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see jenkins_metamodel.Timeout#getUnit()
	 * @see #getTimeout()
	 * @generated
	 */
	EAttribute getTimeout_Unit();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.ParallelsAlwaysFailFast <em>Parallels Always Fail Fast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallels Always Fail Fast</em>'.
	 * @see jenkins_metamodel.ParallelsAlwaysFailFast
	 * @generated
	 */
	EClass getParallelsAlwaysFailFast();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Timestamps <em>Timestamps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamps</em>'.
	 * @see jenkins_metamodel.Timestamps
	 * @generated
	 */
	EClass getTimestamps();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.DisableRestartFromStage <em>Disable Restart From Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disable Restart From Stage</em>'.
	 * @see jenkins_metamodel.DisableRestartFromStage
	 * @generated
	 */
	EClass getDisableRestartFromStage();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.DisableResume <em>Disable Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disable Resume</em>'.
	 * @see jenkins_metamodel.DisableResume
	 * @generated
	 */
	EClass getDisableResume();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.OverrideIndexTriggers <em>Override Index Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Override Index Triggers</em>'.
	 * @see jenkins_metamodel.OverrideIndexTriggers
	 * @generated
	 */
	EClass getOverrideIndexTriggers();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.OverrideIndexTriggers#isOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override</em>'.
	 * @see jenkins_metamodel.OverrideIndexTriggers#isOverride()
	 * @see #getOverrideIndexTriggers()
	 * @generated
	 */
	EAttribute getOverrideIndexTriggers_Override();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.NewContainerPerStage <em>New Container Per Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Container Per Stage</em>'.
	 * @see jenkins_metamodel.NewContainerPerStage
	 * @generated
	 */
	EClass getNewContainerPerStage();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.DisableConcurrentBuilds <em>Disable Concurrent Builds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disable Concurrent Builds</em>'.
	 * @see jenkins_metamodel.DisableConcurrentBuilds
	 * @generated
	 */
	EClass getDisableConcurrentBuilds();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.DisableConcurrentBuilds#isAbort <em>Abort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abort</em>'.
	 * @see jenkins_metamodel.DisableConcurrentBuilds#isAbort()
	 * @see #getDisableConcurrentBuilds()
	 * @generated
	 */
	EAttribute getDisableConcurrentBuilds_Abort();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.StageOption <em>Stage Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Option</em>'.
	 * @see jenkins_metamodel.StageOption
	 * @generated
	 */
	EClass getStageOption();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.StringParam <em>String Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Param</em>'.
	 * @see jenkins_metamodel.StringParam
	 * @generated
	 */
	EClass getStringParam();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.StringParam#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see jenkins_metamodel.StringParam#getDefaultValue()
	 * @see #getStringParam()
	 * @generated
	 */
	EAttribute getStringParam_DefaultValue();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.TextParam <em>Text Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Param</em>'.
	 * @see jenkins_metamodel.TextParam
	 * @generated
	 */
	EClass getTextParam();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.TextParam#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see jenkins_metamodel.TextParam#getDefaultValue()
	 * @see #getTextParam()
	 * @generated
	 */
	EAttribute getTextParam_DefaultValue();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.ChoiceParam <em>Choice Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Param</em>'.
	 * @see jenkins_metamodel.ChoiceParam
	 * @generated
	 */
	EClass getChoiceParam();

	/**
	 * Returns the meta object for the attribute list '{@link jenkins_metamodel.ChoiceParam#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choices</em>'.
	 * @see jenkins_metamodel.ChoiceParam#getChoices()
	 * @see #getChoiceParam()
	 * @generated
	 */
	EAttribute getChoiceParam_Choices();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.PasswordParam <em>Password Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Param</em>'.
	 * @see jenkins_metamodel.PasswordParam
	 * @generated
	 */
	EClass getPasswordParam();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.PasswordParam#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see jenkins_metamodel.PasswordParam#getDefaultValue()
	 * @see #getPasswordParam()
	 * @generated
	 */
	EAttribute getPasswordParam_DefaultValue();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.BooleanParam <em>Boolean Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Param</em>'.
	 * @see jenkins_metamodel.BooleanParam
	 * @generated
	 */
	EClass getBooleanParam();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.BooleanParam#isDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see jenkins_metamodel.BooleanParam#isDefaultValue()
	 * @see #getBooleanParam()
	 * @generated
	 */
	EAttribute getBooleanParam_DefaultValue();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see jenkins_metamodel.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axis</em>'.
	 * @see jenkins_metamodel.Matrix#getAxis()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Axis();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see jenkins_metamodel.Matrix#getStages()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Stages();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see jenkins_metamodel.Matrix#getInputs()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see jenkins_metamodel.Matrix#getWhen()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_When();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see jenkins_metamodel.Matrix#getEnvironments()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see jenkins_metamodel.Matrix#getAgents()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see jenkins_metamodel.Matrix#getTools()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Tools();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see jenkins_metamodel.Matrix#getPost()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Post();

	/**
	 * Returns the meta object for the containment reference list '{@link jenkins_metamodel.Matrix#getStage_options <em>Stage options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage options</em>'.
	 * @see jenkins_metamodel.Matrix#getStage_options()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Stage_options();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis</em>'.
	 * @see jenkins_metamodel.Axis
	 * @generated
	 */
	EClass getAxis();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Axis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jenkins_metamodel.Axis#getName()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_Name();

	/**
	 * Returns the meta object for the attribute list '{@link jenkins_metamodel.Axis#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see jenkins_metamodel.Axis#getValues()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_Values();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Axis#isExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see jenkins_metamodel.Axis#isExclude()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_Exclude();

	/**
	 * Returns the meta object for class '{@link jenkins_metamodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see jenkins_metamodel.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link jenkins_metamodel.Label#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jenkins_metamodel.Label#getLabel()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Label();

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
	 * Returns the meta object for enum '{@link jenkins_metamodel.TOOL_TYPE <em>TOOL TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TOOL TYPE</em>'.
	 * @see jenkins_metamodel.TOOL_TYPE
	 * @generated
	 */
	EEnum getTOOL_TYPE();

	/**
	 * Returns the meta object for enum '{@link jenkins_metamodel.COMPARATOR_TYPE <em>COMPARATOR TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COMPARATOR TYPE</em>'.
	 * @see jenkins_metamodel.COMPARATOR_TYPE
	 * @generated
	 */
	EEnum getCOMPARATOR_TYPE();

	/**
	 * Returns the meta object for enum '{@link jenkins_metamodel.ATTRIBUTE_TYPE <em>ATTRIBUTE TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ATTRIBUTE TYPE</em>'.
	 * @see jenkins_metamodel.ATTRIBUTE_TYPE
	 * @generated
	 */
	EEnum getATTRIBUTE_TYPE();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.BuildingTagImpl <em>Building Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.BuildingTagImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBuildingTag()
		 * @generated
		 */
		EClass BUILDING_TAG = eINSTANCE.getBuildingTag();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.NodeImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Custom Workspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CUSTOM_WORKSPACE = eINSTANCE.getNode_CustomWorkspace();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.AnyImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.StepImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__COMMANDS = eINSTANCE.getStep_Commands();

		/**
		 * The meta object literal for the '<em><b>Step parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STEP_PARAMETERS = eINSTANCE.getStep_Step_parameters();

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
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__STEPS = eINSTANCE.getPost_Steps();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.PipelineImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ENVIRONMENTS = eINSTANCE.getPipeline_Environments();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STAGES = eINSTANCE.getPipeline_Stages();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__POST = eINSTANCE.getPipeline_Post();

		/**
		 * The meta object literal for the '<em><b>Parameter directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PARAMETER_DIRECTIVES = eINSTANCE.getPipeline_Parameter_directives();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TOOLS = eINSTANCE.getPipeline_Tools();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__AGENTS = eINSTANCE.getPipeline_Agents();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRIGGERS = eINSTANCE.getPipeline_Triggers();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__OPTIONS = eINSTANCE.getPipeline_Options();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.Parameter_DirectiveImpl <em>Parameter Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.Parameter_DirectiveImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParameter_Directive()
		 * @generated
		 */
		EClass PARAMETER_DIRECTIVE = eINSTANCE.getParameter_Directive();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DIRECTIVE__DESCRIPTION = eINSTANCE.getParameter_Directive_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DIRECTIVE__NAME = eINSTANCE.getParameter_Directive_Name();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.NoneImpl <em>None</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.NoneImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNone()
		 * @generated
		 */
		EClass NONE = eINSTANCE.getNone();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.DockerfileImpl <em>Dockerfile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.DockerfileImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDockerfile()
		 * @generated
		 */
		EClass DOCKERFILE = eINSTANCE.getDockerfile();

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
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__LABEL = eINSTANCE.getDockerfile_Label();

		/**
		 * The meta object literal for the '<em><b>Custom Workspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__CUSTOM_WORKSPACE = eINSTANCE.getDockerfile_CustomWorkspace();

		/**
		 * The meta object literal for the '<em><b>Reuse Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__REUSE_NODE = eINSTANCE.getDockerfile_ReuseNode();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__ARGS = eINSTANCE.getDockerfile_Args();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__FILENAME = eINSTANCE.getDockerfile_Filename();

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
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__LABEL = eINSTANCE.getDocker_Label();

		/**
		 * The meta object literal for the '<em><b>Always Pull</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__ALWAYS_PULL = eINSTANCE.getDocker_AlwaysPull();

		/**
		 * The meta object literal for the '<em><b>Custom Workspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__CUSTOM_WORKSPACE = eINSTANCE.getDocker_CustomWorkspace();

		/**
		 * The meta object literal for the '<em><b>Reuse Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__REUSE_NODE = eINSTANCE.getDocker_ReuseNode();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__ARGS = eINSTANCE.getDocker_Args();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__IMAGE = eINSTANCE.getDocker_Image();

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
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STAGES = eINSTANCE.getStage_Stages();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__AGENTS = eINSTANCE.getStage_Agents();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STEPS = eINSTANCE.getStage_Steps();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__ENVIRONMENTS = eINSTANCE.getStage_Environments();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__INPUTS = eINSTANCE.getStage_Inputs();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__WHEN = eINSTANCE.getStage_When();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

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
		 * The meta object literal for the '<em><b>Stage options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STAGE_OPTIONS = eINSTANCE.getStage_Stage_options();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__MATRIX = eINSTANCE.getStage_Matrix();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.InputImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Parameter directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__PARAMETER_DIRECTIVES = eINSTANCE.getInput_Parameter_directives();

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
		 * The meta object literal for the '{@link jenkins_metamodel.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.AgentImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.CronImpl <em>Cron</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.CronImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCron()
		 * @generated
		 */
		EClass CRON = eINSTANCE.getCron();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON__TIMER = eINSTANCE.getCron_Timer();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.PollSCMImpl <em>Poll SCM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.PollSCMImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPollSCM()
		 * @generated
		 */
		EClass POLL_SCM = eINSTANCE.getPollSCM();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SCM__TIMER = eINSTANCE.getPollSCM_Timer();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.UpstreamImpl <em>Upstream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.UpstreamImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getUpstream()
		 * @generated
		 */
		EClass UPSTREAM = eINSTANCE.getUpstream();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM__JOBS = eINSTANCE.getUpstream_Jobs();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM__THRESHOLD = eINSTANCE.getUpstream_Threshold();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.OptionImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.BuildDiscarderImpl <em>Build Discarder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.BuildDiscarderImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBuildDiscarder()
		 * @generated
		 */
		EClass BUILD_DISCARDER = eINSTANCE.getBuildDiscarder();

		/**
		 * The meta object literal for the '<em><b>Num To Keep Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_DISCARDER__NUM_TO_KEEP_STR = eINSTANCE.getBuildDiscarder_NumToKeepStr();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.CheckoutToSubdirectoryImpl <em>Checkout To Subdirectory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.CheckoutToSubdirectoryImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCheckoutToSubdirectory()
		 * @generated
		 */
		EClass CHECKOUT_TO_SUBDIRECTORY = eINSTANCE.getCheckoutToSubdirectory();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKOUT_TO_SUBDIRECTORY__DIRECTORY = eINSTANCE.getCheckoutToSubdirectory_Directory();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.SkipStagesAfterUnstableImpl <em>Skip Stages After Unstable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.SkipStagesAfterUnstableImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getSkipStagesAfterUnstable()
		 * @generated
		 */
		EClass SKIP_STAGES_AFTER_UNSTABLE = eINSTANCE.getSkipStagesAfterUnstable();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.SkipDefaultCheckoutImpl <em>Skip Default Checkout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.SkipDefaultCheckoutImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getSkipDefaultCheckout()
		 * @generated
		 */
		EClass SKIP_DEFAULT_CHECKOUT = eINSTANCE.getSkipDefaultCheckout();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.RetryImpl <em>Retry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.RetryImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getRetry()
		 * @generated
		 */
		EClass RETRY = eINSTANCE.getRetry();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY__RETRIES = eINSTANCE.getRetry_Retries();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.QuietPeriodImpl <em>Quiet Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.QuietPeriodImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getQuietPeriod()
		 * @generated
		 */
		EClass QUIET_PERIOD = eINSTANCE.getQuietPeriod();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIET_PERIOD__PERIOD = eINSTANCE.getQuietPeriod_Period();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.PreserveStashesImpl <em>Preserve Stashes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.PreserveStashesImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPreserveStashes()
		 * @generated
		 */
		EClass PRESERVE_STASHES = eINSTANCE.getPreserveStashes();

		/**
		 * The meta object literal for the '<em><b>Build Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESERVE_STASHES__BUILD_COUNT = eINSTANCE.getPreserveStashes_BuildCount();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.TimeoutImpl <em>Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.TimeoutImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTimeout()
		 * @generated
		 */
		EClass TIMEOUT = eINSTANCE.getTimeout();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT__TIME = eINSTANCE.getTimeout_Time();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT__UNIT = eINSTANCE.getTimeout_Unit();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.ParallelsAlwaysFailFastImpl <em>Parallels Always Fail Fast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.ParallelsAlwaysFailFastImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getParallelsAlwaysFailFast()
		 * @generated
		 */
		EClass PARALLELS_ALWAYS_FAIL_FAST = eINSTANCE.getParallelsAlwaysFailFast();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.TimestampsImpl <em>Timestamps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.TimestampsImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTimestamps()
		 * @generated
		 */
		EClass TIMESTAMPS = eINSTANCE.getTimestamps();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.DisableRestartFromStageImpl <em>Disable Restart From Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.DisableRestartFromStageImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDisableRestartFromStage()
		 * @generated
		 */
		EClass DISABLE_RESTART_FROM_STAGE = eINSTANCE.getDisableRestartFromStage();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.DisableResumeImpl <em>Disable Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.DisableResumeImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDisableResume()
		 * @generated
		 */
		EClass DISABLE_RESUME = eINSTANCE.getDisableResume();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.OverrideIndexTriggersImpl <em>Override Index Triggers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.OverrideIndexTriggersImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getOverrideIndexTriggers()
		 * @generated
		 */
		EClass OVERRIDE_INDEX_TRIGGERS = eINSTANCE.getOverrideIndexTriggers();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_INDEX_TRIGGERS__OVERRIDE = eINSTANCE.getOverrideIndexTriggers_Override();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.NewContainerPerStageImpl <em>New Container Per Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.NewContainerPerStageImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getNewContainerPerStage()
		 * @generated
		 */
		EClass NEW_CONTAINER_PER_STAGE = eINSTANCE.getNewContainerPerStage();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.DisableConcurrentBuildsImpl <em>Disable Concurrent Builds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.DisableConcurrentBuildsImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getDisableConcurrentBuilds()
		 * @generated
		 */
		EClass DISABLE_CONCURRENT_BUILDS = eINSTANCE.getDisableConcurrentBuilds();

		/**
		 * The meta object literal for the '<em><b>Abort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISABLE_CONCURRENT_BUILDS__ABORT = eINSTANCE.getDisableConcurrentBuilds_Abort();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.StageOptionImpl <em>Stage Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.StageOptionImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStageOption()
		 * @generated
		 */
		EClass STAGE_OPTION = eINSTANCE.getStageOption();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.StringParamImpl <em>String Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.StringParamImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getStringParam()
		 * @generated
		 */
		EClass STRING_PARAM = eINSTANCE.getStringParam();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PARAM__DEFAULT_VALUE = eINSTANCE.getStringParam_DefaultValue();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.TextParamImpl <em>Text Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.TextParamImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTextParam()
		 * @generated
		 */
		EClass TEXT_PARAM = eINSTANCE.getTextParam();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PARAM__DEFAULT_VALUE = eINSTANCE.getTextParam_DefaultValue();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.ChoiceParamImpl <em>Choice Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.ChoiceParamImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getChoiceParam()
		 * @generated
		 */
		EClass CHOICE_PARAM = eINSTANCE.getChoiceParam();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_PARAM__CHOICES = eINSTANCE.getChoiceParam_Choices();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.PasswordParamImpl <em>Password Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.PasswordParamImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPasswordParam()
		 * @generated
		 */
		EClass PASSWORD_PARAM = eINSTANCE.getPasswordParam();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSWORD_PARAM__DEFAULT_VALUE = eINSTANCE.getPasswordParam_DefaultValue();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.BooleanParamImpl <em>Boolean Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.BooleanParamImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getBooleanParam()
		 * @generated
		 */
		EClass BOOLEAN_PARAM = eINSTANCE.getBooleanParam();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PARAM__DEFAULT_VALUE = eINSTANCE.getBooleanParam_DefaultValue();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.MatrixImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__AXIS = eINSTANCE.getMatrix_Axis();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__STAGES = eINSTANCE.getMatrix_Stages();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__INPUTS = eINSTANCE.getMatrix_Inputs();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__WHEN = eINSTANCE.getMatrix_When();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__ENVIRONMENTS = eINSTANCE.getMatrix_Environments();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__AGENTS = eINSTANCE.getMatrix_Agents();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__TOOLS = eINSTANCE.getMatrix_Tools();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__POST = eINSTANCE.getMatrix_Post();

		/**
		 * The meta object literal for the '<em><b>Stage options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__STAGE_OPTIONS = eINSTANCE.getMatrix_Stage_options();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.AxisImpl <em>Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.AxisImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getAxis()
		 * @generated
		 */
		EClass AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__NAME = eINSTANCE.getAxis_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__VALUES = eINSTANCE.getAxis_Values();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__EXCLUDE = eINSTANCE.getAxis_Exclude();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.impl.LabelImpl
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__LABEL = eINSTANCE.getLabel_Label();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.POST_TYPE <em>POST TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.POST_TYPE
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getPOST_TYPE()
		 * @generated
		 */
		EEnum POST_TYPE = eINSTANCE.getPOST_TYPE();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.TOOL_TYPE <em>TOOL TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.TOOL_TYPE
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getTOOL_TYPE()
		 * @generated
		 */
		EEnum TOOL_TYPE = eINSTANCE.getTOOL_TYPE();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.COMPARATOR_TYPE <em>COMPARATOR TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.COMPARATOR_TYPE
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getCOMPARATOR_TYPE()
		 * @generated
		 */
		EEnum COMPARATOR_TYPE = eINSTANCE.getCOMPARATOR_TYPE();

		/**
		 * The meta object literal for the '{@link jenkins_metamodel.ATTRIBUTE_TYPE <em>ATTRIBUTE TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jenkins_metamodel.ATTRIBUTE_TYPE
		 * @see jenkins_metamodel.impl.Jenkins_metamodelPackageImpl#getATTRIBUTE_TYPE()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getATTRIBUTE_TYPE();

	}

} //Jenkins_metamodelPackage
