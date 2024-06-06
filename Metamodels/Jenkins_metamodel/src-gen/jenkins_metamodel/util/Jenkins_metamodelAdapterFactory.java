/**
 */
package jenkins_metamodel.util;

import jenkins_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jenkins_metamodel.Jenkins_metamodelPackage
 * @generated
 */
public class Jenkins_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Jenkins_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jenkins_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Jenkins_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Jenkins_metamodelSwitch<Adapter> modelSwitch = new Jenkins_metamodelSwitch<Adapter>() {
		@Override
		public Adapter caseBuildingTag(BuildingTag object) {
			return createBuildingTagAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseAny(Any object) {
			return createAnyAdapter();
		}

		@Override
		public Adapter caseBranch(Branch object) {
			return createBranchAdapter();
		}

		@Override
		public Adapter caseChangelog(Changelog object) {
			return createChangelogAdapter();
		}

		@Override
		public Adapter caseTriggeredBy(TriggeredBy object) {
			return createTriggeredByAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseStep_Parameter(Step_Parameter object) {
			return createStep_ParameterAdapter();
		}

		@Override
		public Adapter caseChangeSet(ChangeSet object) {
			return createChangeSetAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter casePost(Post object) {
			return createPostAdapter();
		}

		@Override
		public Adapter caseAnyOf(AnyOf object) {
			return createAnyOfAdapter();
		}

		@Override
		public Adapter casePipeline(Pipeline object) {
			return createPipelineAdapter();
		}

		@Override
		public Adapter caseTag(Tag object) {
			return createTagAdapter();
		}

		@Override
		public Adapter caseWhen_Env(When_Env object) {
			return createWhen_EnvAdapter();
		}

		@Override
		public Adapter caseParameter_Directive(Parameter_Directive object) {
			return createParameter_DirectiveAdapter();
		}

		@Override
		public Adapter caseAllOf(AllOf object) {
			return createAllOfAdapter();
		}

		@Override
		public Adapter caseEquals(Equals object) {
			return createEqualsAdapter();
		}

		@Override
		public Adapter caseNone(None object) {
			return createNoneAdapter();
		}

		@Override
		public Adapter caseChangeRequest(ChangeRequest object) {
			return createChangeRequestAdapter();
		}

		@Override
		public Adapter caseDockerfile(Dockerfile object) {
			return createDockerfileAdapter();
		}

		@Override
		public Adapter caseDocker(Docker object) {
			return createDockerAdapter();
		}

		@Override
		public Adapter caseStage(Stage object) {
			return createStageAdapter();
		}

		@Override
		public Adapter caseWhen(When object) {
			return createWhenAdapter();
		}

		@Override
		public Adapter caseTool(Tool object) {
			return createToolAdapter();
		}

		@Override
		public Adapter caseEnvironment(Environment object) {
			return createEnvironmentAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter caseCron(Cron object) {
			return createCronAdapter();
		}

		@Override
		public Adapter casePollSCM(PollSCM object) {
			return createPollSCMAdapter();
		}

		@Override
		public Adapter caseUpstream(Upstream object) {
			return createUpstreamAdapter();
		}

		@Override
		public Adapter caseOption(Option object) {
			return createOptionAdapter();
		}

		@Override
		public Adapter caseBuildDiscarder(BuildDiscarder object) {
			return createBuildDiscarderAdapter();
		}

		@Override
		public Adapter caseCheckoutToSubdirectory(CheckoutToSubdirectory object) {
			return createCheckoutToSubdirectoryAdapter();
		}

		@Override
		public Adapter caseSkipStagesAfterUnstable(SkipStagesAfterUnstable object) {
			return createSkipStagesAfterUnstableAdapter();
		}

		@Override
		public Adapter caseSkipDefaultCheckout(SkipDefaultCheckout object) {
			return createSkipDefaultCheckoutAdapter();
		}

		@Override
		public Adapter caseRetry(Retry object) {
			return createRetryAdapter();
		}

		@Override
		public Adapter caseQuietPeriod(QuietPeriod object) {
			return createQuietPeriodAdapter();
		}

		@Override
		public Adapter casePreserveStashes(PreserveStashes object) {
			return createPreserveStashesAdapter();
		}

		@Override
		public Adapter caseTimeout(Timeout object) {
			return createTimeoutAdapter();
		}

		@Override
		public Adapter caseParallelsAlwaysFailFast(ParallelsAlwaysFailFast object) {
			return createParallelsAlwaysFailFastAdapter();
		}

		@Override
		public Adapter caseTimestamps(Timestamps object) {
			return createTimestampsAdapter();
		}

		@Override
		public Adapter caseDisableRestartFromStage(DisableRestartFromStage object) {
			return createDisableRestartFromStageAdapter();
		}

		@Override
		public Adapter caseDisableResume(DisableResume object) {
			return createDisableResumeAdapter();
		}

		@Override
		public Adapter caseOverrideIndexTriggers(OverrideIndexTriggers object) {
			return createOverrideIndexTriggersAdapter();
		}

		@Override
		public Adapter caseNewContainerPerStage(NewContainerPerStage object) {
			return createNewContainerPerStageAdapter();
		}

		@Override
		public Adapter caseDisableConcurrentBuilds(DisableConcurrentBuilds object) {
			return createDisableConcurrentBuildsAdapter();
		}

		@Override
		public Adapter caseStageOption(StageOption object) {
			return createStageOptionAdapter();
		}

		@Override
		public Adapter caseStringParam(StringParam object) {
			return createStringParamAdapter();
		}

		@Override
		public Adapter caseTextParam(TextParam object) {
			return createTextParamAdapter();
		}

		@Override
		public Adapter caseChoiceParam(ChoiceParam object) {
			return createChoiceParamAdapter();
		}

		@Override
		public Adapter casePasswordParam(PasswordParam object) {
			return createPasswordParamAdapter();
		}

		@Override
		public Adapter caseBooleanParam(BooleanParam object) {
			return createBooleanParamAdapter();
		}

		@Override
		public Adapter caseMatrix(Matrix object) {
			return createMatrixAdapter();
		}

		@Override
		public Adapter caseAxis(Axis object) {
			return createAxisAdapter();
		}

		@Override
		public Adapter caseLabel(Label object) {
			return createLabelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.BuildingTag <em>Building Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.BuildingTag
	 * @generated
	 */
	public Adapter createBuildingTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Changelog <em>Changelog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Changelog
	 * @generated
	 */
	public Adapter createChangelogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.TriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.TriggeredBy
	 * @generated
	 */
	public Adapter createTriggeredByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Step_Parameter <em>Step Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Step_Parameter
	 * @generated
	 */
	public Adapter createStep_ParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.ChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.ChangeSet
	 * @generated
	 */
	public Adapter createChangeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Post
	 * @generated
	 */
	public Adapter createPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.AnyOf <em>Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.AnyOf
	 * @generated
	 */
	public Adapter createAnyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.When_Env <em>When Env</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.When_Env
	 * @generated
	 */
	public Adapter createWhen_EnvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Parameter_Directive <em>Parameter Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Parameter_Directive
	 * @generated
	 */
	public Adapter createParameter_DirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.AllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.AllOf
	 * @generated
	 */
	public Adapter createAllOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Equals
	 * @generated
	 */
	public Adapter createEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.None <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.None
	 * @generated
	 */
	public Adapter createNoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.ChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.ChangeRequest
	 * @generated
	 */
	public Adapter createChangeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Dockerfile <em>Dockerfile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Dockerfile
	 * @generated
	 */
	public Adapter createDockerfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Docker
	 * @generated
	 */
	public Adapter createDockerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Stage
	 * @generated
	 */
	public Adapter createStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.When
	 * @generated
	 */
	public Adapter createWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Cron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Cron
	 * @generated
	 */
	public Adapter createCronAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.PollSCM <em>Poll SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.PollSCM
	 * @generated
	 */
	public Adapter createPollSCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Upstream <em>Upstream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Upstream
	 * @generated
	 */
	public Adapter createUpstreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.BuildDiscarder <em>Build Discarder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.BuildDiscarder
	 * @generated
	 */
	public Adapter createBuildDiscarderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.CheckoutToSubdirectory <em>Checkout To Subdirectory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.CheckoutToSubdirectory
	 * @generated
	 */
	public Adapter createCheckoutToSubdirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.SkipStagesAfterUnstable <em>Skip Stages After Unstable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.SkipStagesAfterUnstable
	 * @generated
	 */
	public Adapter createSkipStagesAfterUnstableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.SkipDefaultCheckout <em>Skip Default Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.SkipDefaultCheckout
	 * @generated
	 */
	public Adapter createSkipDefaultCheckoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Retry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Retry
	 * @generated
	 */
	public Adapter createRetryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.QuietPeriod <em>Quiet Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.QuietPeriod
	 * @generated
	 */
	public Adapter createQuietPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.PreserveStashes <em>Preserve Stashes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.PreserveStashes
	 * @generated
	 */
	public Adapter createPreserveStashesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Timeout
	 * @generated
	 */
	public Adapter createTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.ParallelsAlwaysFailFast <em>Parallels Always Fail Fast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.ParallelsAlwaysFailFast
	 * @generated
	 */
	public Adapter createParallelsAlwaysFailFastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Timestamps <em>Timestamps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Timestamps
	 * @generated
	 */
	public Adapter createTimestampsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.DisableRestartFromStage <em>Disable Restart From Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.DisableRestartFromStage
	 * @generated
	 */
	public Adapter createDisableRestartFromStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.DisableResume <em>Disable Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.DisableResume
	 * @generated
	 */
	public Adapter createDisableResumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.OverrideIndexTriggers <em>Override Index Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.OverrideIndexTriggers
	 * @generated
	 */
	public Adapter createOverrideIndexTriggersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.NewContainerPerStage <em>New Container Per Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.NewContainerPerStage
	 * @generated
	 */
	public Adapter createNewContainerPerStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.DisableConcurrentBuilds <em>Disable Concurrent Builds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.DisableConcurrentBuilds
	 * @generated
	 */
	public Adapter createDisableConcurrentBuildsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.StageOption <em>Stage Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.StageOption
	 * @generated
	 */
	public Adapter createStageOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.StringParam <em>String Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.StringParam
	 * @generated
	 */
	public Adapter createStringParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.TextParam <em>Text Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.TextParam
	 * @generated
	 */
	public Adapter createTextParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.ChoiceParam <em>Choice Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.ChoiceParam
	 * @generated
	 */
	public Adapter createChoiceParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.PasswordParam <em>Password Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.PasswordParam
	 * @generated
	 */
	public Adapter createPasswordParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.BooleanParam <em>Boolean Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.BooleanParam
	 * @generated
	 */
	public Adapter createBooleanParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Axis
	 * @generated
	 */
	public Adapter createAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jenkins_metamodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jenkins_metamodel.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Jenkins_metamodelAdapterFactory
