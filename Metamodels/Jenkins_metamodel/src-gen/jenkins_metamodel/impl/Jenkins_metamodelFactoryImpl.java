/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Jenkins_metamodelFactoryImpl extends EFactoryImpl implements Jenkins_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Jenkins_metamodelFactory init() {
		try {
			Jenkins_metamodelFactory theJenkins_metamodelFactory = (Jenkins_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Jenkins_metamodelPackage.eNS_URI);
			if (theJenkins_metamodelFactory != null) {
				return theJenkins_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Jenkins_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jenkins_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Jenkins_metamodelPackage.BUILDING_TAG:
			return createBuildingTag();
		case Jenkins_metamodelPackage.COMMAND:
			return createCommand();
		case Jenkins_metamodelPackage.NODE:
			return createNode();
		case Jenkins_metamodelPackage.ANY:
			return createAny();
		case Jenkins_metamodelPackage.BRANCH:
			return createBranch();
		case Jenkins_metamodelPackage.CHANGELOG:
			return createChangelog();
		case Jenkins_metamodelPackage.TRIGGERED_BY:
			return createTriggeredBy();
		case Jenkins_metamodelPackage.EXPRESSION:
			return createExpression();
		case Jenkins_metamodelPackage.STEP_PARAMETER:
			return createStep_Parameter();
		case Jenkins_metamodelPackage.CHANGE_SET:
			return createChangeSet();
		case Jenkins_metamodelPackage.NOT:
			return createNot();
		case Jenkins_metamodelPackage.STEP:
			return createStep();
		case Jenkins_metamodelPackage.POST:
			return createPost();
		case Jenkins_metamodelPackage.ANY_OF:
			return createAnyOf();
		case Jenkins_metamodelPackage.PIPELINE:
			return createPipeline();
		case Jenkins_metamodelPackage.TAG:
			return createTag();
		case Jenkins_metamodelPackage.WHEN_ENV:
			return createWhen_Env();
		case Jenkins_metamodelPackage.ALL_OF:
			return createAllOf();
		case Jenkins_metamodelPackage.EQUALS:
			return createEquals();
		case Jenkins_metamodelPackage.NONE:
			return createNone();
		case Jenkins_metamodelPackage.CHANGE_REQUEST:
			return createChangeRequest();
		case Jenkins_metamodelPackage.DOCKERFILE:
			return createDockerfile();
		case Jenkins_metamodelPackage.DOCKER:
			return createDocker();
		case Jenkins_metamodelPackage.STAGE:
			return createStage();
		case Jenkins_metamodelPackage.TOOL:
			return createTool();
		case Jenkins_metamodelPackage.ENVIRONMENT:
			return createEnvironment();
		case Jenkins_metamodelPackage.INPUT:
			return createInput();
		case Jenkins_metamodelPackage.CRON:
			return createCron();
		case Jenkins_metamodelPackage.POLL_SCM:
			return createPollSCM();
		case Jenkins_metamodelPackage.UPSTREAM:
			return createUpstream();
		case Jenkins_metamodelPackage.BUILD_DISCARDER:
			return createBuildDiscarder();
		case Jenkins_metamodelPackage.CHECKOUT_TO_SUBDIRECTORY:
			return createCheckoutToSubdirectory();
		case Jenkins_metamodelPackage.SKIP_STAGES_AFTER_UNSTABLE:
			return createSkipStagesAfterUnstable();
		case Jenkins_metamodelPackage.SKIP_DEFAULT_CHECKOUT:
			return createSkipDefaultCheckout();
		case Jenkins_metamodelPackage.RETRY:
			return createRetry();
		case Jenkins_metamodelPackage.QUIET_PERIOD:
			return createQuietPeriod();
		case Jenkins_metamodelPackage.PRESERVE_STASHES:
			return createPreserveStashes();
		case Jenkins_metamodelPackage.TIMEOUT:
			return createTimeout();
		case Jenkins_metamodelPackage.PARALLELS_ALWAYS_FAIL_FAST:
			return createParallelsAlwaysFailFast();
		case Jenkins_metamodelPackage.TIMESTAMPS:
			return createTimestamps();
		case Jenkins_metamodelPackage.DISABLE_RESTART_FROM_STAGE:
			return createDisableRestartFromStage();
		case Jenkins_metamodelPackage.DISABLE_RESUME:
			return createDisableResume();
		case Jenkins_metamodelPackage.OVERRIDE_INDEX_TRIGGERS:
			return createOverrideIndexTriggers();
		case Jenkins_metamodelPackage.NEW_CONTAINER_PER_STAGE:
			return createNewContainerPerStage();
		case Jenkins_metamodelPackage.DISABLE_CONCURRENT_BUILDS:
			return createDisableConcurrentBuilds();
		case Jenkins_metamodelPackage.STRING_PARAM:
			return createStringParam();
		case Jenkins_metamodelPackage.TEXT_PARAM:
			return createTextParam();
		case Jenkins_metamodelPackage.CHOICE_PARAM:
			return createChoiceParam();
		case Jenkins_metamodelPackage.PASSWORD_PARAM:
			return createPasswordParam();
		case Jenkins_metamodelPackage.BOOLEAN_PARAM:
			return createBooleanParam();
		case Jenkins_metamodelPackage.MATRIX:
			return createMatrix();
		case Jenkins_metamodelPackage.AXIS:
			return createAxis();
		case Jenkins_metamodelPackage.LABEL:
			return createLabel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Jenkins_metamodelPackage.POST_TYPE:
			return createPOST_TYPEFromString(eDataType, initialValue);
		case Jenkins_metamodelPackage.TOOL_TYPE:
			return createTOOL_TYPEFromString(eDataType, initialValue);
		case Jenkins_metamodelPackage.COMPARATOR_TYPE:
			return createCOMPARATOR_TYPEFromString(eDataType, initialValue);
		case Jenkins_metamodelPackage.ATTRIBUTE_TYPE:
			return createATTRIBUTE_TYPEFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Jenkins_metamodelPackage.POST_TYPE:
			return convertPOST_TYPEToString(eDataType, instanceValue);
		case Jenkins_metamodelPackage.TOOL_TYPE:
			return convertTOOL_TYPEToString(eDataType, instanceValue);
		case Jenkins_metamodelPackage.COMPARATOR_TYPE:
			return convertCOMPARATOR_TYPEToString(eDataType, instanceValue);
		case Jenkins_metamodelPackage.ATTRIBUTE_TYPE:
			return convertATTRIBUTE_TYPEToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildingTag createBuildingTag() {
		BuildingTagImpl buildingTag = new BuildingTagImpl();
		return buildingTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Changelog createChangelog() {
		ChangelogImpl changelog = new ChangelogImpl();
		return changelog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggeredBy createTriggeredBy() {
		TriggeredByImpl triggeredBy = new TriggeredByImpl();
		return triggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step_Parameter createStep_Parameter() {
		Step_ParameterImpl step_Parameter = new Step_ParameterImpl();
		return step_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeSet createChangeSet() {
		ChangeSetImpl changeSet = new ChangeSetImpl();
		return changeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyOf createAnyOf() {
		AnyOfImpl anyOf = new AnyOfImpl();
		return anyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When_Env createWhen_Env() {
		When_EnvImpl when_Env = new When_EnvImpl();
		return when_Env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllOf createAllOf() {
		AllOfImpl allOf = new AllOfImpl();
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public None createNone() {
		NoneImpl none = new NoneImpl();
		return none;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeRequest createChangeRequest() {
		ChangeRequestImpl changeRequest = new ChangeRequestImpl();
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dockerfile createDockerfile() {
		DockerfileImpl dockerfile = new DockerfileImpl();
		return dockerfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Docker createDocker() {
		DockerImpl docker = new DockerImpl();
		return docker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cron createCron() {
		CronImpl cron = new CronImpl();
		return cron;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollSCM createPollSCM() {
		PollSCMImpl pollSCM = new PollSCMImpl();
		return pollSCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Upstream createUpstream() {
		UpstreamImpl upstream = new UpstreamImpl();
		return upstream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildDiscarder createBuildDiscarder() {
		BuildDiscarderImpl buildDiscarder = new BuildDiscarderImpl();
		return buildDiscarder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckoutToSubdirectory createCheckoutToSubdirectory() {
		CheckoutToSubdirectoryImpl checkoutToSubdirectory = new CheckoutToSubdirectoryImpl();
		return checkoutToSubdirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkipStagesAfterUnstable createSkipStagesAfterUnstable() {
		SkipStagesAfterUnstableImpl skipStagesAfterUnstable = new SkipStagesAfterUnstableImpl();
		return skipStagesAfterUnstable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkipDefaultCheckout createSkipDefaultCheckout() {
		SkipDefaultCheckoutImpl skipDefaultCheckout = new SkipDefaultCheckoutImpl();
		return skipDefaultCheckout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Retry createRetry() {
		RetryImpl retry = new RetryImpl();
		return retry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuietPeriod createQuietPeriod() {
		QuietPeriodImpl quietPeriod = new QuietPeriodImpl();
		return quietPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreserveStashes createPreserveStashes() {
		PreserveStashesImpl preserveStashes = new PreserveStashesImpl();
		return preserveStashes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timeout createTimeout() {
		TimeoutImpl timeout = new TimeoutImpl();
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelsAlwaysFailFast createParallelsAlwaysFailFast() {
		ParallelsAlwaysFailFastImpl parallelsAlwaysFailFast = new ParallelsAlwaysFailFastImpl();
		return parallelsAlwaysFailFast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamps createTimestamps() {
		TimestampsImpl timestamps = new TimestampsImpl();
		return timestamps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisableRestartFromStage createDisableRestartFromStage() {
		DisableRestartFromStageImpl disableRestartFromStage = new DisableRestartFromStageImpl();
		return disableRestartFromStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisableResume createDisableResume() {
		DisableResumeImpl disableResume = new DisableResumeImpl();
		return disableResume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverrideIndexTriggers createOverrideIndexTriggers() {
		OverrideIndexTriggersImpl overrideIndexTriggers = new OverrideIndexTriggersImpl();
		return overrideIndexTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewContainerPerStage createNewContainerPerStage() {
		NewContainerPerStageImpl newContainerPerStage = new NewContainerPerStageImpl();
		return newContainerPerStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisableConcurrentBuilds createDisableConcurrentBuilds() {
		DisableConcurrentBuildsImpl disableConcurrentBuilds = new DisableConcurrentBuildsImpl();
		return disableConcurrentBuilds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringParam createStringParam() {
		StringParamImpl stringParam = new StringParamImpl();
		return stringParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextParam createTextParam() {
		TextParamImpl textParam = new TextParamImpl();
		return textParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoiceParam createChoiceParam() {
		ChoiceParamImpl choiceParam = new ChoiceParamImpl();
		return choiceParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PasswordParam createPasswordParam() {
		PasswordParamImpl passwordParam = new PasswordParamImpl();
		return passwordParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanParam createBooleanParam() {
		BooleanParamImpl booleanParam = new BooleanParamImpl();
		return booleanParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Axis createAxis() {
		AxisImpl axis = new AxisImpl();
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POST_TYPE createPOST_TYPEFromString(EDataType eDataType, String initialValue) {
		POST_TYPE result = POST_TYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOST_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOOL_TYPE createTOOL_TYPEFromString(EDataType eDataType, String initialValue) {
		TOOL_TYPE result = TOOL_TYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTOOL_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMPARATOR_TYPE createCOMPARATOR_TYPEFromString(EDataType eDataType, String initialValue) {
		COMPARATOR_TYPE result = COMPARATOR_TYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOMPARATOR_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTE_TYPE createATTRIBUTE_TYPEFromString(EDataType eDataType, String initialValue) {
		ATTRIBUTE_TYPE result = ATTRIBUTE_TYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertATTRIBUTE_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jenkins_metamodelPackage getJenkins_metamodelPackage() {
		return (Jenkins_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Jenkins_metamodelPackage getPackage() {
		return Jenkins_metamodelPackage.eINSTANCE;
	}

} //Jenkins_metamodelFactoryImpl
