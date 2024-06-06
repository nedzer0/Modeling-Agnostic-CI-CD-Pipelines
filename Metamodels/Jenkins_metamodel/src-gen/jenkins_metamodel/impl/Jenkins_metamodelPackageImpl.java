/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.Agent;
import jenkins_metamodel.AllOf;
import jenkins_metamodel.Any;
import jenkins_metamodel.AnyOf;
import jenkins_metamodel.Axis;
import jenkins_metamodel.BooleanParam;
import jenkins_metamodel.Branch;
import jenkins_metamodel.BuildDiscarder;
import jenkins_metamodel.BuildingTag;
import jenkins_metamodel.ChangeRequest;
import jenkins_metamodel.ChangeSet;
import jenkins_metamodel.Changelog;
import jenkins_metamodel.CheckoutToSubdirectory;
import jenkins_metamodel.ChoiceParam;
import jenkins_metamodel.Command;
import jenkins_metamodel.Cron;
import jenkins_metamodel.DisableConcurrentBuilds;
import jenkins_metamodel.DisableRestartFromStage;
import jenkins_metamodel.DisableResume;
import jenkins_metamodel.Docker;
import jenkins_metamodel.Dockerfile;
import jenkins_metamodel.Environment;
import jenkins_metamodel.Equals;
import jenkins_metamodel.Expression;
import jenkins_metamodel.Input;
import jenkins_metamodel.Jenkins_metamodelFactory;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Label;
import jenkins_metamodel.Matrix;
import jenkins_metamodel.NewContainerPerStage;
import jenkins_metamodel.Node;
import jenkins_metamodel.None;
import jenkins_metamodel.Not;
import jenkins_metamodel.Option;
import jenkins_metamodel.OverrideIndexTriggers;
import jenkins_metamodel.ParallelsAlwaysFailFast;
import jenkins_metamodel.Parameter_Directive;
import jenkins_metamodel.PasswordParam;
import jenkins_metamodel.Pipeline;
import jenkins_metamodel.PollSCM;
import jenkins_metamodel.Post;
import jenkins_metamodel.PreserveStashes;
import jenkins_metamodel.QuietPeriod;
import jenkins_metamodel.Retry;
import jenkins_metamodel.SkipDefaultCheckout;
import jenkins_metamodel.SkipStagesAfterUnstable;
import jenkins_metamodel.Stage;
import jenkins_metamodel.StageOption;
import jenkins_metamodel.Step;
import jenkins_metamodel.Step_Parameter;
import jenkins_metamodel.StringParam;
import jenkins_metamodel.Tag;
import jenkins_metamodel.TextParam;
import jenkins_metamodel.Timeout;
import jenkins_metamodel.Timestamps;
import jenkins_metamodel.Tool;
import jenkins_metamodel.Trigger;
import jenkins_metamodel.TriggeredBy;
import jenkins_metamodel.Upstream;
import jenkins_metamodel.When;
import jenkins_metamodel.When_Env;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Jenkins_metamodelPackageImpl extends EPackageImpl implements Jenkins_metamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changelogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggeredByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass step_ParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass when_EnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameter_DirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cronEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollSCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upstreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildDiscarderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkoutToSubdirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skipStagesAfterUnstableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skipDefaultCheckoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quietPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preserveStashesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelsAlwaysFailFastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableRestartFromStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableResumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overrideIndexTriggersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newContainerPerStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableConcurrentBuildsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum posT_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tooL_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatoR_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributE_TYPEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Jenkins_metamodelPackageImpl() {
		super(eNS_URI, Jenkins_metamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Jenkins_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Jenkins_metamodelPackage init() {
		if (isInited)
			return (Jenkins_metamodelPackage) EPackage.Registry.INSTANCE.getEPackage(Jenkins_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJenkins_metamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Jenkins_metamodelPackageImpl theJenkins_metamodelPackage = registeredJenkins_metamodelPackage instanceof Jenkins_metamodelPackageImpl
				? (Jenkins_metamodelPackageImpl) registeredJenkins_metamodelPackage
				: new Jenkins_metamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJenkins_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theJenkins_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJenkins_metamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Jenkins_metamodelPackage.eNS_URI, theJenkins_metamodelPackage);
		return theJenkins_metamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildingTag() {
		return buildingTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Name() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Label() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_CustomWorkspace() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAny() {
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Pattern() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Comparator() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangelog() {
		return changelogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangelog_Expression() {
		return (EAttribute) changelogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggeredBy() {
		return triggeredByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggeredBy_Parameter() {
		return (EAttribute) triggeredByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpression_Expression() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep_Parameter() {
		return step_ParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Parameter_Parameter() {
		return (EAttribute) step_ParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeSet() {
		return changeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeSet_Pattern() {
		return (EAttribute) changeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeSet_Comparator() {
		return (EAttribute) changeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNot_When() {
		return (EReference) notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Commands() {
		return (EReference) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Step_parameters() {
		return (EReference) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPost() {
		return postEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPost_Condition() {
		return (EAttribute) postEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPost_Steps() {
		return (EReference) postEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnyOf() {
		return anyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnyOf_When() {
		return (EReference) anyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPipeline() {
		return pipelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Environments() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Stages() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Post() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Parameter_directives() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Tools() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Agents() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Triggers() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Options() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Pattern() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Comparator() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhen_Env() {
		return when_EnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhen_Env_Name() {
		return (EAttribute) when_EnvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhen_Env_Value() {
		return (EAttribute) when_EnvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter_Directive() {
		return parameter_DirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Directive_Description() {
		return (EAttribute) parameter_DirectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Directive_Name() {
		return (EAttribute) parameter_DirectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllOf() {
		return allOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllOf_When() {
		return (EReference) allOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquals() {
		return equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquals_Expected_val() {
		return (EAttribute) equalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquals_Actual_val() {
		return (EAttribute) equalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNone() {
		return noneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeRequest() {
		return changeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRequest_Attribute() {
		return (EAttribute) changeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRequest_Value() {
		return (EAttribute) changeRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRequest_Comparator() {
		return (EAttribute) changeRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDockerfile() {
		return dockerfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_Dir() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_AdditionalBuildArgs() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_RegistryUrl() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_RegistryCredentialsId() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_Label() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_CustomWorkspace() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_ReuseNode() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_Args() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerfile_Filename() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocker() {
		return dockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_RegistryUrl() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_RegistryCredentialsId() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Label() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_AlwaysPull() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_CustomWorkspace() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_ReuseNode() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Args() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Image() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Stages() {
		return (EReference) stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Agents() {
		return (EReference) stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Steps() {
		return (EReference) stageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Environments() {
		return (EReference) stageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Inputs() {
		return (EReference) stageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_When() {
		return (EReference) stageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStage_Name() {
		return (EAttribute) stageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStage_FailFast() {
		return (EAttribute) stageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStage_Parallel() {
		return (EAttribute) stageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Stage_options() {
		return (EReference) stageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Matrix() {
		return (EReference) stageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Tool() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Tool_name() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Key() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Value() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Parameter_directives() {
		return (EReference) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Message() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Id() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Ok() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Submitter() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_SubmitterParameter() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCron() {
		return cronEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCron_Timer() {
		return (EAttribute) cronEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPollSCM() {
		return pollSCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPollSCM_Timer() {
		return (EAttribute) pollSCMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpstream() {
		return upstreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstream_Jobs() {
		return (EAttribute) upstreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstream_Threshold() {
		return (EAttribute) upstreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildDiscarder() {
		return buildDiscarderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDiscarder_NumToKeepStr() {
		return (EAttribute) buildDiscarderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckoutToSubdirectory() {
		return checkoutToSubdirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckoutToSubdirectory_Directory() {
		return (EAttribute) checkoutToSubdirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkipStagesAfterUnstable() {
		return skipStagesAfterUnstableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkipDefaultCheckout() {
		return skipDefaultCheckoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetry() {
		return retryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetry_Retries() {
		return (EAttribute) retryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuietPeriod() {
		return quietPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuietPeriod_Period() {
		return (EAttribute) quietPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreserveStashes() {
		return preserveStashesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreserveStashes_BuildCount() {
		return (EAttribute) preserveStashesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeout() {
		return timeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeout_Time() {
		return (EAttribute) timeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeout_Unit() {
		return (EAttribute) timeoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelsAlwaysFailFast() {
		return parallelsAlwaysFailFastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimestamps() {
		return timestampsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisableRestartFromStage() {
		return disableRestartFromStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisableResume() {
		return disableResumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverrideIndexTriggers() {
		return overrideIndexTriggersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOverrideIndexTriggers_Override() {
		return (EAttribute) overrideIndexTriggersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNewContainerPerStage() {
		return newContainerPerStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisableConcurrentBuilds() {
		return disableConcurrentBuildsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisableConcurrentBuilds_Abort() {
		return (EAttribute) disableConcurrentBuildsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStageOption() {
		return stageOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringParam() {
		return stringParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringParam_DefaultValue() {
		return (EAttribute) stringParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextParam() {
		return textParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextParam_DefaultValue() {
		return (EAttribute) textParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoiceParam() {
		return choiceParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoiceParam_Choices() {
		return (EAttribute) choiceParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPasswordParam() {
		return passwordParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPasswordParam_DefaultValue() {
		return (EAttribute) passwordParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanParam() {
		return booleanParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanParam_DefaultValue() {
		return (EAttribute) booleanParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Axis() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Stages() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Inputs() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_When() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Environments() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Agents() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Tools() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Post() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Stage_options() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAxis() {
		return axisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAxis_Name() {
		return (EAttribute) axisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAxis_Values() {
		return (EAttribute) axisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAxis_Exclude() {
		return (EAttribute) axisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Label() {
		return (EAttribute) labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPOST_TYPE() {
		return posT_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTOOL_TYPE() {
		return tooL_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCOMPARATOR_TYPE() {
		return comparatoR_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getATTRIBUTE_TYPE() {
		return attributE_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jenkins_metamodelFactory getJenkins_metamodelFactory() {
		return (Jenkins_metamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		buildingTagEClass = createEClass(BUILDING_TAG);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__NAME);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__LABEL);
		createEAttribute(nodeEClass, NODE__CUSTOM_WORKSPACE);

		triggerEClass = createEClass(TRIGGER);

		anyEClass = createEClass(ANY);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__PATTERN);
		createEAttribute(branchEClass, BRANCH__COMPARATOR);

		changelogEClass = createEClass(CHANGELOG);
		createEAttribute(changelogEClass, CHANGELOG__EXPRESSION);

		triggeredByEClass = createEClass(TRIGGERED_BY);
		createEAttribute(triggeredByEClass, TRIGGERED_BY__PARAMETER);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__EXPRESSION);

		step_ParameterEClass = createEClass(STEP_PARAMETER);
		createEAttribute(step_ParameterEClass, STEP_PARAMETER__PARAMETER);

		changeSetEClass = createEClass(CHANGE_SET);
		createEAttribute(changeSetEClass, CHANGE_SET__PATTERN);
		createEAttribute(changeSetEClass, CHANGE_SET__COMPARATOR);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__WHEN);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__COMMANDS);
		createEReference(stepEClass, STEP__STEP_PARAMETERS);

		postEClass = createEClass(POST);
		createEAttribute(postEClass, POST__CONDITION);
		createEReference(postEClass, POST__STEPS);

		anyOfEClass = createEClass(ANY_OF);
		createEReference(anyOfEClass, ANY_OF__WHEN);

		pipelineEClass = createEClass(PIPELINE);
		createEReference(pipelineEClass, PIPELINE__ENVIRONMENTS);
		createEReference(pipelineEClass, PIPELINE__STAGES);
		createEReference(pipelineEClass, PIPELINE__POST);
		createEReference(pipelineEClass, PIPELINE__PARAMETER_DIRECTIVES);
		createEReference(pipelineEClass, PIPELINE__TOOLS);
		createEReference(pipelineEClass, PIPELINE__AGENTS);
		createEReference(pipelineEClass, PIPELINE__TRIGGERS);
		createEReference(pipelineEClass, PIPELINE__OPTIONS);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__PATTERN);
		createEAttribute(tagEClass, TAG__COMPARATOR);

		when_EnvEClass = createEClass(WHEN_ENV);
		createEAttribute(when_EnvEClass, WHEN_ENV__NAME);
		createEAttribute(when_EnvEClass, WHEN_ENV__VALUE);

		parameter_DirectiveEClass = createEClass(PARAMETER_DIRECTIVE);
		createEAttribute(parameter_DirectiveEClass, PARAMETER_DIRECTIVE__DESCRIPTION);
		createEAttribute(parameter_DirectiveEClass, PARAMETER_DIRECTIVE__NAME);

		allOfEClass = createEClass(ALL_OF);
		createEReference(allOfEClass, ALL_OF__WHEN);

		equalsEClass = createEClass(EQUALS);
		createEAttribute(equalsEClass, EQUALS__EXPECTED_VAL);
		createEAttribute(equalsEClass, EQUALS__ACTUAL_VAL);

		noneEClass = createEClass(NONE);

		changeRequestEClass = createEClass(CHANGE_REQUEST);
		createEAttribute(changeRequestEClass, CHANGE_REQUEST__ATTRIBUTE);
		createEAttribute(changeRequestEClass, CHANGE_REQUEST__VALUE);
		createEAttribute(changeRequestEClass, CHANGE_REQUEST__COMPARATOR);

		dockerfileEClass = createEClass(DOCKERFILE);
		createEAttribute(dockerfileEClass, DOCKERFILE__DIR);
		createEAttribute(dockerfileEClass, DOCKERFILE__ADDITIONAL_BUILD_ARGS);
		createEAttribute(dockerfileEClass, DOCKERFILE__REGISTRY_URL);
		createEAttribute(dockerfileEClass, DOCKERFILE__REGISTRY_CREDENTIALS_ID);
		createEAttribute(dockerfileEClass, DOCKERFILE__LABEL);
		createEAttribute(dockerfileEClass, DOCKERFILE__CUSTOM_WORKSPACE);
		createEAttribute(dockerfileEClass, DOCKERFILE__REUSE_NODE);
		createEAttribute(dockerfileEClass, DOCKERFILE__ARGS);
		createEAttribute(dockerfileEClass, DOCKERFILE__FILENAME);

		dockerEClass = createEClass(DOCKER);
		createEAttribute(dockerEClass, DOCKER__REGISTRY_URL);
		createEAttribute(dockerEClass, DOCKER__REGISTRY_CREDENTIALS_ID);
		createEAttribute(dockerEClass, DOCKER__LABEL);
		createEAttribute(dockerEClass, DOCKER__ALWAYS_PULL);
		createEAttribute(dockerEClass, DOCKER__CUSTOM_WORKSPACE);
		createEAttribute(dockerEClass, DOCKER__REUSE_NODE);
		createEAttribute(dockerEClass, DOCKER__ARGS);
		createEAttribute(dockerEClass, DOCKER__IMAGE);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__STAGES);
		createEReference(stageEClass, STAGE__AGENTS);
		createEReference(stageEClass, STAGE__STEPS);
		createEReference(stageEClass, STAGE__ENVIRONMENTS);
		createEReference(stageEClass, STAGE__INPUTS);
		createEReference(stageEClass, STAGE__WHEN);
		createEAttribute(stageEClass, STAGE__NAME);
		createEAttribute(stageEClass, STAGE__FAIL_FAST);
		createEAttribute(stageEClass, STAGE__PARALLEL);
		createEReference(stageEClass, STAGE__STAGE_OPTIONS);
		createEReference(stageEClass, STAGE__MATRIX);

		whenEClass = createEClass(WHEN);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__TOOL);
		createEAttribute(toolEClass, TOOL__TOOL_NAME);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__KEY);
		createEAttribute(environmentEClass, ENVIRONMENT__VALUE);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__PARAMETER_DIRECTIVES);
		createEAttribute(inputEClass, INPUT__MESSAGE);
		createEAttribute(inputEClass, INPUT__ID);
		createEAttribute(inputEClass, INPUT__OK);
		createEAttribute(inputEClass, INPUT__SUBMITTER);
		createEAttribute(inputEClass, INPUT__SUBMITTER_PARAMETER);

		agentEClass = createEClass(AGENT);

		cronEClass = createEClass(CRON);
		createEAttribute(cronEClass, CRON__TIMER);

		pollSCMEClass = createEClass(POLL_SCM);
		createEAttribute(pollSCMEClass, POLL_SCM__TIMER);

		upstreamEClass = createEClass(UPSTREAM);
		createEAttribute(upstreamEClass, UPSTREAM__JOBS);
		createEAttribute(upstreamEClass, UPSTREAM__THRESHOLD);

		optionEClass = createEClass(OPTION);

		buildDiscarderEClass = createEClass(BUILD_DISCARDER);
		createEAttribute(buildDiscarderEClass, BUILD_DISCARDER__NUM_TO_KEEP_STR);

		checkoutToSubdirectoryEClass = createEClass(CHECKOUT_TO_SUBDIRECTORY);
		createEAttribute(checkoutToSubdirectoryEClass, CHECKOUT_TO_SUBDIRECTORY__DIRECTORY);

		skipStagesAfterUnstableEClass = createEClass(SKIP_STAGES_AFTER_UNSTABLE);

		skipDefaultCheckoutEClass = createEClass(SKIP_DEFAULT_CHECKOUT);

		retryEClass = createEClass(RETRY);
		createEAttribute(retryEClass, RETRY__RETRIES);

		quietPeriodEClass = createEClass(QUIET_PERIOD);
		createEAttribute(quietPeriodEClass, QUIET_PERIOD__PERIOD);

		preserveStashesEClass = createEClass(PRESERVE_STASHES);
		createEAttribute(preserveStashesEClass, PRESERVE_STASHES__BUILD_COUNT);

		timeoutEClass = createEClass(TIMEOUT);
		createEAttribute(timeoutEClass, TIMEOUT__TIME);
		createEAttribute(timeoutEClass, TIMEOUT__UNIT);

		parallelsAlwaysFailFastEClass = createEClass(PARALLELS_ALWAYS_FAIL_FAST);

		timestampsEClass = createEClass(TIMESTAMPS);

		disableRestartFromStageEClass = createEClass(DISABLE_RESTART_FROM_STAGE);

		disableResumeEClass = createEClass(DISABLE_RESUME);

		overrideIndexTriggersEClass = createEClass(OVERRIDE_INDEX_TRIGGERS);
		createEAttribute(overrideIndexTriggersEClass, OVERRIDE_INDEX_TRIGGERS__OVERRIDE);

		newContainerPerStageEClass = createEClass(NEW_CONTAINER_PER_STAGE);

		disableConcurrentBuildsEClass = createEClass(DISABLE_CONCURRENT_BUILDS);
		createEAttribute(disableConcurrentBuildsEClass, DISABLE_CONCURRENT_BUILDS__ABORT);

		stageOptionEClass = createEClass(STAGE_OPTION);

		stringParamEClass = createEClass(STRING_PARAM);
		createEAttribute(stringParamEClass, STRING_PARAM__DEFAULT_VALUE);

		textParamEClass = createEClass(TEXT_PARAM);
		createEAttribute(textParamEClass, TEXT_PARAM__DEFAULT_VALUE);

		choiceParamEClass = createEClass(CHOICE_PARAM);
		createEAttribute(choiceParamEClass, CHOICE_PARAM__CHOICES);

		passwordParamEClass = createEClass(PASSWORD_PARAM);
		createEAttribute(passwordParamEClass, PASSWORD_PARAM__DEFAULT_VALUE);

		booleanParamEClass = createEClass(BOOLEAN_PARAM);
		createEAttribute(booleanParamEClass, BOOLEAN_PARAM__DEFAULT_VALUE);

		matrixEClass = createEClass(MATRIX);
		createEReference(matrixEClass, MATRIX__AXIS);
		createEReference(matrixEClass, MATRIX__STAGES);
		createEReference(matrixEClass, MATRIX__INPUTS);
		createEReference(matrixEClass, MATRIX__WHEN);
		createEReference(matrixEClass, MATRIX__ENVIRONMENTS);
		createEReference(matrixEClass, MATRIX__AGENTS);
		createEReference(matrixEClass, MATRIX__TOOLS);
		createEReference(matrixEClass, MATRIX__POST);
		createEReference(matrixEClass, MATRIX__STAGE_OPTIONS);

		axisEClass = createEClass(AXIS);
		createEAttribute(axisEClass, AXIS__NAME);
		createEAttribute(axisEClass, AXIS__VALUES);
		createEAttribute(axisEClass, AXIS__EXCLUDE);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__LABEL);

		// Create enums
		posT_TYPEEEnum = createEEnum(POST_TYPE);
		tooL_TYPEEEnum = createEEnum(TOOL_TYPE);
		comparatoR_TYPEEEnum = createEEnum(COMPARATOR_TYPE);
		attributE_TYPEEEnum = createEEnum(ATTRIBUTE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		buildingTagEClass.getESuperTypes().add(this.getWhen());
		nodeEClass.getESuperTypes().add(this.getAgent());
		anyEClass.getESuperTypes().add(this.getAgent());
		branchEClass.getESuperTypes().add(this.getWhen());
		changelogEClass.getESuperTypes().add(this.getWhen());
		triggeredByEClass.getESuperTypes().add(this.getWhen());
		expressionEClass.getESuperTypes().add(this.getWhen());
		changeSetEClass.getESuperTypes().add(this.getWhen());
		notEClass.getESuperTypes().add(this.getWhen());
		anyOfEClass.getESuperTypes().add(this.getWhen());
		tagEClass.getESuperTypes().add(this.getWhen());
		when_EnvEClass.getESuperTypes().add(this.getWhen());
		allOfEClass.getESuperTypes().add(this.getWhen());
		equalsEClass.getESuperTypes().add(this.getWhen());
		noneEClass.getESuperTypes().add(this.getAgent());
		changeRequestEClass.getESuperTypes().add(this.getWhen());
		dockerfileEClass.getESuperTypes().add(this.getAgent());
		dockerEClass.getESuperTypes().add(this.getAgent());
		cronEClass.getESuperTypes().add(this.getTrigger());
		pollSCMEClass.getESuperTypes().add(this.getTrigger());
		upstreamEClass.getESuperTypes().add(this.getTrigger());
		buildDiscarderEClass.getESuperTypes().add(this.getOption());
		checkoutToSubdirectoryEClass.getESuperTypes().add(this.getOption());
		skipStagesAfterUnstableEClass.getESuperTypes().add(this.getOption());
		skipDefaultCheckoutEClass.getESuperTypes().add(this.getOption());
		skipDefaultCheckoutEClass.getESuperTypes().add(this.getStageOption());
		retryEClass.getESuperTypes().add(this.getOption());
		retryEClass.getESuperTypes().add(this.getStageOption());
		quietPeriodEClass.getESuperTypes().add(this.getOption());
		preserveStashesEClass.getESuperTypes().add(this.getOption());
		timeoutEClass.getESuperTypes().add(this.getOption());
		timeoutEClass.getESuperTypes().add(this.getStageOption());
		parallelsAlwaysFailFastEClass.getESuperTypes().add(this.getOption());
		timestampsEClass.getESuperTypes().add(this.getOption());
		timestampsEClass.getESuperTypes().add(this.getStageOption());
		disableRestartFromStageEClass.getESuperTypes().add(this.getOption());
		disableResumeEClass.getESuperTypes().add(this.getOption());
		overrideIndexTriggersEClass.getESuperTypes().add(this.getOption());
		newContainerPerStageEClass.getESuperTypes().add(this.getOption());
		disableConcurrentBuildsEClass.getESuperTypes().add(this.getOption());
		stringParamEClass.getESuperTypes().add(this.getParameter_Directive());
		textParamEClass.getESuperTypes().add(this.getParameter_Directive());
		choiceParamEClass.getESuperTypes().add(this.getParameter_Directive());
		passwordParamEClass.getESuperTypes().add(this.getParameter_Directive());
		booleanParamEClass.getESuperTypes().add(this.getParameter_Directive());
		labelEClass.getESuperTypes().add(this.getAgent());

		// Initialize classes, features, and operations; add parameters
		initEClass(buildingTagEClass, BuildingTag.class, "BuildingTag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Label(), ecorePackage.getEString(), "label", null, 1, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_CustomWorkspace(), ecorePackage.getEString(), "customWorkspace", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyEClass, Any.class, "Any", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Comparator(), this.getCOMPARATOR_TYPE(), "comparator", null, 0, 1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changelogEClass, Changelog.class, "Changelog", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangelog_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Changelog.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggeredByEClass, TriggeredBy.class, "TriggeredBy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggeredBy_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1,
				TriggeredBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Expression(), ecorePackage.getEString(), "expression", null, 1, 1,
				Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(step_ParameterEClass, Step_Parameter.class, "Step_Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Parameter_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1,
				Step_Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(changeSetEClass, ChangeSet.class, "ChangeSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeSet_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, ChangeSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeSet_Comparator(), this.getCOMPARATOR_TYPE(), "comparator", null, 0, 1, ChangeSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_When(), this.getWhen(), null, "when", null, 1, -1, Not.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Commands(), this.getCommand(), null, "commands", null, 1, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStep_Step_parameters(), this.getStep_Parameter(), null, "step_parameters", null, 0, -1,
				Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postEClass, Post.class, "Post", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPost_Condition(), this.getPOST_TYPE(), "condition", null, 1, 1, Post.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_Steps(), this.getStep(), null, "steps", null, 1, -1, Post.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(anyOfEClass, AnyOf.class, "AnyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnyOf_When(), this.getWhen(), null, "when", null, 1, -1, AnyOf.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Environments(), this.getEnvironment(), null, "environments", null, 0, -1,
				Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Stages(), this.getStage(), null, "stages", null, 1, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Post(), this.getPost(), null, "post", null, 0, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPipeline_Parameter_directives(), this.getParameter_Directive(), null, "parameter_directives",
				null, 0, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Tools(), this.getTool(), null, "tools", null, 0, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPipeline_Agents(), this.getAgent(), null, "agents", null, 1, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Options(), this.getOption(), null, "options", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, Tag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Comparator(), this.getCOMPARATOR_TYPE(), "comparator", null, 0, 1, Tag.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(when_EnvEClass, When_Env.class, "When_Env", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhen_Env_Name(), ecorePackage.getEString(), "name", null, 1, 1, When_Env.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhen_Env_Value(), ecorePackage.getEString(), "value", null, 1, 1, When_Env.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameter_DirectiveEClass, Parameter_Directive.class, "Parameter_Directive", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Directive_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Parameter_Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Directive_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				Parameter_Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allOfEClass, AllOf.class, "AllOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllOf_When(), this.getWhen(), null, "when", null, 1, -1, AllOf.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquals_Expected_val(), ecorePackage.getEString(), "expected_val", null, 1, 1, Equals.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquals_Actual_val(), ecorePackage.getEString(), "actual_val", null, 1, 1, Equals.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noneEClass, None.class, "None", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeRequestEClass, ChangeRequest.class, "ChangeRequest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeRequest_Attribute(), this.getATTRIBUTE_TYPE(), "attribute", null, 1, 1,
				ChangeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRequest_Value(), ecorePackage.getEString(), "value", null, 1, 1, ChangeRequest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRequest_Comparator(), this.getCOMPARATOR_TYPE(), "comparator", null, 0, 1,
				ChangeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dockerfileEClass, Dockerfile.class, "Dockerfile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerfile_Dir(), ecorePackage.getEString(), "dir", null, 0, 1, Dockerfile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_AdditionalBuildArgs(), ecorePackage.getEString(), "additionalBuildArgs", null, 0,
				1, Dockerfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_RegistryUrl(), ecorePackage.getEString(), "registryUrl", null, 0, 1,
				Dockerfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_RegistryCredentialsId(), ecorePackage.getEString(), "registryCredentialsId", null,
				0, 1, Dockerfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_Label(), ecorePackage.getEString(), "label", null, 0, 1, Dockerfile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_CustomWorkspace(), ecorePackage.getEString(), "customWorkspace", null, 0, 1,
				Dockerfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_ReuseNode(), ecorePackage.getEString(), "reuseNode", null, 0, 1, Dockerfile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_Args(), ecorePackage.getEString(), "args", null, 0, 1, Dockerfile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerfile_Filename(), ecorePackage.getEString(), "filename", null, 1, 1, Dockerfile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerEClass, Docker.class, "Docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocker_RegistryUrl(), ecorePackage.getEString(), "registryUrl", null, 0, 1, Docker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_RegistryCredentialsId(), ecorePackage.getEString(), "registryCredentialsId", null, 0,
				1, Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Label(), ecorePackage.getEString(), "label", null, 0, 1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_AlwaysPull(), ecorePackage.getEBoolean(), "alwaysPull", null, 0, 1, Docker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_CustomWorkspace(), ecorePackage.getEString(), "customWorkspace", null, 0, 1,
				Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_ReuseNode(), ecorePackage.getEString(), "reuseNode", null, 0, 1, Docker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Args(), ecorePackage.getEString(), "args", null, 0, 1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Image(), ecorePackage.getEString(), "image", null, 1, 1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Stages(), this.getStage(), null, "stages", null, 0, -1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStage_Agents(), this.getAgent(), null, "agents", null, 0, -1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStage_Steps(), this.getStep(), null, "steps", null, 0, -1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStage_Environments(), this.getEnvironment(), null, "environments", null, 0, -1, Stage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_Inputs(), this.getInput(), null, "inputs", null, 0, -1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStage_When(), this.getWhen(), null, "when", null, 0, -1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStage_FailFast(), ecorePackage.getEBoolean(), "failFast", null, 0, 1, Stage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStage_Parallel(), ecorePackage.getEBoolean(), "parallel", null, 0, 1, Stage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_Stage_options(), this.getStageOption(), null, "stage_options", null, 0, -1, Stage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(whenEClass, When.class, "When", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Tool(), this.getTOOL_TYPE(), "tool", null, 1, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Tool_name(), ecorePackage.getEString(), "tool_name", null, 1, 1, Tool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Key(), ecorePackage.getEString(), "key", null, 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Value(), ecorePackage.getEString(), "value", null, 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Parameter_directives(), this.getParameter_Directive(), null, "parameter_directives",
				null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Message(), ecorePackage.getEString(), "message", null, 1, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Id(), ecorePackage.getEString(), "id", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Ok(), ecorePackage.getEString(), "ok", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Submitter(), ecorePackage.getEString(), "submitter", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_SubmitterParameter(), ecorePackage.getEString(), "submitterParameter", null, 0, 1,
				Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cronEClass, Cron.class, "Cron", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCron_Timer(), ecorePackage.getEString(), "timer", null, 1, 1, Cron.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollSCMEClass, PollSCM.class, "PollSCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollSCM_Timer(), ecorePackage.getEString(), "timer", null, 1, 1, PollSCM.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upstreamEClass, Upstream.class, "Upstream", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpstream_Jobs(), ecorePackage.getEString(), "jobs", null, 1, -1, Upstream.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpstream_Threshold(), ecorePackage.getEString(), "threshold", null, 1, 1, Upstream.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buildDiscarderEClass, BuildDiscarder.class, "BuildDiscarder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildDiscarder_NumToKeepStr(), ecorePackage.getEShort(), "numToKeepStr", null, 1, 1,
				BuildDiscarder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(checkoutToSubdirectoryEClass, CheckoutToSubdirectory.class, "CheckoutToSubdirectory", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckoutToSubdirectory_Directory(), ecorePackage.getEString(), "directory", null, 1, 1,
				CheckoutToSubdirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skipStagesAfterUnstableEClass, SkipStagesAfterUnstable.class, "SkipStagesAfterUnstable",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(skipDefaultCheckoutEClass, SkipDefaultCheckout.class, "SkipDefaultCheckout", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(retryEClass, Retry.class, "Retry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetry_Retries(), ecorePackage.getEShort(), "retries", null, 1, 1, Retry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quietPeriodEClass, QuietPeriod.class, "QuietPeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuietPeriod_Period(), ecorePackage.getEShort(), "period", null, 1, 1, QuietPeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preserveStashesEClass, PreserveStashes.class, "PreserveStashes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreserveStashes_BuildCount(), ecorePackage.getEString(), "buildCount", null, 0, 1,
				PreserveStashes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(timeoutEClass, Timeout.class, "Timeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeout_Time(), ecorePackage.getEShort(), "time", null, 1, 1, Timeout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeout_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, Timeout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelsAlwaysFailFastEClass, ParallelsAlwaysFailFast.class, "ParallelsAlwaysFailFast",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timestampsEClass, Timestamps.class, "Timestamps", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(disableRestartFromStageEClass, DisableRestartFromStage.class, "DisableRestartFromStage",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disableResumeEClass, DisableResume.class, "DisableResume", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(overrideIndexTriggersEClass, OverrideIndexTriggers.class, "OverrideIndexTriggers", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverrideIndexTriggers_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1,
				OverrideIndexTriggers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newContainerPerStageEClass, NewContainerPerStage.class, "NewContainerPerStage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disableConcurrentBuildsEClass, DisableConcurrentBuilds.class, "DisableConcurrentBuilds",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisableConcurrentBuilds_Abort(), ecorePackage.getEBoolean(), "abort", null, 0, 1,
				DisableConcurrentBuilds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageOptionEClass, StageOption.class, "StageOption", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringParamEClass, StringParam.class, "StringParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringParam_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1,
				StringParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(textParamEClass, TextParam.class, "TextParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextParam_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1,
				TextParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(choiceParamEClass, ChoiceParam.class, "ChoiceParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoiceParam_Choices(), ecorePackage.getEString(), "choices", null, 1, -1, ChoiceParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passwordParamEClass, PasswordParam.class, "PasswordParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPasswordParam_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1,
				PasswordParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(booleanParamEClass, BooleanParam.class, "BooleanParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanParam_DefaultValue(), ecorePackage.getEBoolean(), "defaultValue", null, 1, 1,
				BooleanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrix_Axis(), this.getAxis(), null, "axis", null, 1, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_Stages(), this.getStage(), null, "stages", null, 1, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_Inputs(), this.getInput(), null, "inputs", null, 0, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_When(), this.getWhen(), null, "when", null, 0, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_Environments(), this.getEnvironment(), null, "environments", null, 0, -1, Matrix.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrix_Agents(), this.getAgent(), null, "agents", null, 0, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_Tools(), this.getTool(), null, "tools", null, 0, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_Post(), this.getPost(), null, "post", null, 0, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_Stage_options(), this.getStageOption(), null, "stage_options", null, 0, -1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisEClass, Axis.class, "Axis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxis_Name(), ecorePackage.getEString(), "name", null, 1, 1, Axis.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxis_Values(), ecorePackage.getEString(), "values", null, 1, -1, Axis.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxis_Exclude(), ecorePackage.getEBoolean(), "exclude", null, 0, 1, Axis.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Label(), ecorePackage.getEString(), "label", null, 1, 1, Label.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.class, "POST_TYPE");
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.ALWAYS);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.CHANGED);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.FIXED);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.REGRESSION);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.ABORTED);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.FAILURE);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.SUCCESS);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.UNSTABLE);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.UNSUCCESSFUL);
		addEEnumLiteral(posT_TYPEEEnum, jenkins_metamodel.POST_TYPE.CLEANUP);

		initEEnum(tooL_TYPEEEnum, jenkins_metamodel.TOOL_TYPE.class, "TOOL_TYPE");
		addEEnumLiteral(tooL_TYPEEEnum, jenkins_metamodel.TOOL_TYPE.MAVEN);
		addEEnumLiteral(tooL_TYPEEEnum, jenkins_metamodel.TOOL_TYPE.JDK);
		addEEnumLiteral(tooL_TYPEEEnum, jenkins_metamodel.TOOL_TYPE.GRADLE);

		initEEnum(comparatoR_TYPEEEnum, jenkins_metamodel.COMPARATOR_TYPE.class, "COMPARATOR_TYPE");
		addEEnumLiteral(comparatoR_TYPEEEnum, jenkins_metamodel.COMPARATOR_TYPE.NONE);
		addEEnumLiteral(comparatoR_TYPEEEnum, jenkins_metamodel.COMPARATOR_TYPE.GLOB);
		addEEnumLiteral(comparatoR_TYPEEEnum, jenkins_metamodel.COMPARATOR_TYPE.REGEXP);
		addEEnumLiteral(comparatoR_TYPEEEnum, jenkins_metamodel.COMPARATOR_TYPE.EQUALS);

		initEEnum(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.class, "ATTRIBUTE_TYPE");
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.TARGET);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.BRANCH);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.FORK);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.URL);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.TITLE);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.AUTHOR);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.AUTHOR_DISPLAY_NAME);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.AUTHOR_EMAIL);
		addEEnumLiteral(attributE_TYPEEEnum, jenkins_metamodel.ATTRIBUTE_TYPE.ID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

} //Jenkins_metamodelPackageImpl
