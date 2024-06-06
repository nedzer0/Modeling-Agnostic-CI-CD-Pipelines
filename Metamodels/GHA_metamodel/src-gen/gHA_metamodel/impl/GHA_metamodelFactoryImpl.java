/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.*;

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
public class GHA_metamodelFactoryImpl extends EFactoryImpl implements GHA_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GHA_metamodelFactory init() {
		try {
			GHA_metamodelFactory theGHA_metamodelFactory = (GHA_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(GHA_metamodelPackage.eNS_URI);
			if (theGHA_metamodelFactory != null) {
				return theGHA_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GHA_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GHA_metamodelFactoryImpl() {
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
		case GHA_metamodelPackage.PIPELINE:
			return createPipeline();
		case GHA_metamodelPackage.JOB:
			return createJob();
		case GHA_metamodelPackage.STEP:
			return createStep();
		case GHA_metamodelPackage.COMMAND:
			return createCommand();
		case GHA_metamodelPackage.PARAMETER:
			return createParameter();
		case GHA_metamodelPackage.ENVIRONMENT:
			return createEnvironment();
		case GHA_metamodelPackage.ACTION:
			return createAction();
		case GHA_metamodelPackage.SCHEDULE_TRIGGER:
			return createScheduleTrigger();
		case GHA_metamodelPackage.PUSH_TRIGGER:
			return createPushTrigger();
		case GHA_metamodelPackage.RUNS_ON:
			return createRuns_On();
		case GHA_metamodelPackage.SECRET:
			return createSecret();
		case GHA_metamodelPackage.NEED:
			return createNeed();
		case GHA_metamodelPackage.STRATEGY:
			return createStrategy();
		case GHA_metamodelPackage.ARTIFACT:
			return createArtifact();
		case GHA_metamodelPackage.IF:
			return createIf();
		case GHA_metamodelPackage.MATRIX_CONFIG:
			return createMatrixConfig();
		case GHA_metamodelPackage.CONCURRENCY:
			return createConcurrency();
		case GHA_metamodelPackage.CREDENTIALS:
			return createCredentials();
		case GHA_metamodelPackage.DEFAULT_SETTING:
			return createDefaultSetting();
		case GHA_metamodelPackage.PERMISSION:
			return createPermission();
		case GHA_metamodelPackage.OUTPUT:
			return createOutput();
		case GHA_metamodelPackage.ENV:
			return createEnv();
		case GHA_metamodelPackage.SERVICE:
			return createService();
		case GHA_metamodelPackage.INPUT_PARAMS:
			return createInputParams();
		case GHA_metamodelPackage.PULL_TRIGGER:
			return createPullTrigger();
		case GHA_metamodelPackage.STANDARD_EVENT_TRIGGER:
			return createStandardEventTrigger();
		case GHA_metamodelPackage.DOCKER:
			return createDocker();
		case GHA_metamodelPackage.WORKFLOW_CALL_TRIGGER:
			return createWorkflowCallTrigger();
		case GHA_metamodelPackage.INPUT:
			return createInput();
		case GHA_metamodelPackage.CONTAINER:
			return createContainer();
		case GHA_metamodelPackage.WORKFLOW_DISPATCH_TRIGGER:
			return createWorkflowDispatchTrigger();
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER:
			return createWorkflowRunTrigger();
		case GHA_metamodelPackage.BRANCH:
			return createBranch();
		case GHA_metamodelPackage.TAG:
			return createTag();
		case GHA_metamodelPackage.PATH:
			return createPath();
		case GHA_metamodelPackage.PULL_TARGET_TRIGGER:
			return createPullTargetTrigger();
		case GHA_metamodelPackage.RESTORE_CACHE:
			return createRestoreCache();
		case GHA_metamodelPackage.SAVE_CACHE:
			return createSaveCache();
		case GHA_metamodelPackage.INPUT_PAIR:
			return createInputPair();
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
		case GHA_metamodelPackage.EVENTS:
			return createEVENTSFromString(eDataType, initialValue);
		case GHA_metamodelPackage.WEBHOOK_ACTIVITY_TYPES:
			return createWEBHOOK_ACTIVITY_TYPESFromString(eDataType, initialValue);
		case GHA_metamodelPackage.PERMISSIONS:
			return createPERMISSIONSFromString(eDataType, initialValue);
		case GHA_metamodelPackage.PERMISSION_SCOPES:
			return createPERMISSION_SCOPESFromString(eDataType, initialValue);
		case GHA_metamodelPackage.INPUT_TYPES:
			return createINPUT_TYPESFromString(eDataType, initialValue);
		case GHA_metamodelPackage.ARTIFACT_TYPE:
			return createARTIFACT_TYPEFromString(eDataType, initialValue);
		case GHA_metamodelPackage.MATRIX_CONFIG_TYPE:
			return createMATRIX_CONFIG_TYPEFromString(eDataType, initialValue);
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
		case GHA_metamodelPackage.EVENTS:
			return convertEVENTSToString(eDataType, instanceValue);
		case GHA_metamodelPackage.WEBHOOK_ACTIVITY_TYPES:
			return convertWEBHOOK_ACTIVITY_TYPESToString(eDataType, instanceValue);
		case GHA_metamodelPackage.PERMISSIONS:
			return convertPERMISSIONSToString(eDataType, instanceValue);
		case GHA_metamodelPackage.PERMISSION_SCOPES:
			return convertPERMISSION_SCOPESToString(eDataType, instanceValue);
		case GHA_metamodelPackage.INPUT_TYPES:
			return convertINPUT_TYPESToString(eDataType, instanceValue);
		case GHA_metamodelPackage.ARTIFACT_TYPE:
			return convertARTIFACT_TYPEToString(eDataType, instanceValue);
		case GHA_metamodelPackage.MATRIX_CONFIG_TYPE:
			return convertMATRIX_CONFIG_TYPEToString(eDataType, instanceValue);
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
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
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
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
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
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduleTrigger createScheduleTrigger() {
		ScheduleTriggerImpl scheduleTrigger = new ScheduleTriggerImpl();
		return scheduleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushTrigger createPushTrigger() {
		PushTriggerImpl pushTrigger = new PushTriggerImpl();
		return pushTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runs_On createRuns_On() {
		Runs_OnImpl runs_On = new Runs_OnImpl();
		return runs_On;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Secret createSecret() {
		SecretImpl secret = new SecretImpl();
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Need createNeed() {
		NeedImpl need = new NeedImpl();
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixConfig createMatrixConfig() {
		MatrixConfigImpl matrixConfig = new MatrixConfigImpl();
		return matrixConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concurrency createConcurrency() {
		ConcurrencyImpl concurrency = new ConcurrencyImpl();
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Credentials createCredentials() {
		CredentialsImpl credentials = new CredentialsImpl();
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultSetting createDefaultSetting() {
		DefaultSettingImpl defaultSetting = new DefaultSettingImpl();
		return defaultSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env createEnv() {
		EnvImpl env = new EnvImpl();
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputParams createInputParams() {
		InputParamsImpl inputParams = new InputParamsImpl();
		return inputParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PullTrigger createPullTrigger() {
		PullTriggerImpl pullTrigger = new PullTriggerImpl();
		return pullTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardEventTrigger createStandardEventTrigger() {
		StandardEventTriggerImpl standardEventTrigger = new StandardEventTriggerImpl();
		return standardEventTrigger;
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
	public WorkflowCallTrigger createWorkflowCallTrigger() {
		WorkflowCallTriggerImpl workflowCallTrigger = new WorkflowCallTriggerImpl();
		return workflowCallTrigger;
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
	public gHA_metamodel.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowDispatchTrigger createWorkflowDispatchTrigger() {
		WorkflowDispatchTriggerImpl workflowDispatchTrigger = new WorkflowDispatchTriggerImpl();
		return workflowDispatchTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowRunTrigger createWorkflowRunTrigger() {
		WorkflowRunTriggerImpl workflowRunTrigger = new WorkflowRunTriggerImpl();
		return workflowRunTrigger;
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
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PullTargetTrigger createPullTargetTrigger() {
		PullTargetTriggerImpl pullTargetTrigger = new PullTargetTriggerImpl();
		return pullTargetTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestoreCache createRestoreCache() {
		RestoreCacheImpl restoreCache = new RestoreCacheImpl();
		return restoreCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaveCache createSaveCache() {
		SaveCacheImpl saveCache = new SaveCacheImpl();
		return saveCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPair createInputPair() {
		InputPairImpl inputPair = new InputPairImpl();
		return inputPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVENTS createEVENTSFromString(EDataType eDataType, String initialValue) {
		EVENTS result = EVENTS.get(initialValue);
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
	public String convertEVENTSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WEBHOOK_ACTIVITY_TYPES createWEBHOOK_ACTIVITY_TYPESFromString(EDataType eDataType, String initialValue) {
		WEBHOOK_ACTIVITY_TYPES result = WEBHOOK_ACTIVITY_TYPES.get(initialValue);
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
	public String convertWEBHOOK_ACTIVITY_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERMISSIONS createPERMISSIONSFromString(EDataType eDataType, String initialValue) {
		PERMISSIONS result = PERMISSIONS.get(initialValue);
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
	public String convertPERMISSIONSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERMISSION_SCOPES createPERMISSION_SCOPESFromString(EDataType eDataType, String initialValue) {
		PERMISSION_SCOPES result = PERMISSION_SCOPES.get(initialValue);
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
	public String convertPERMISSION_SCOPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INPUT_TYPES createINPUT_TYPESFromString(EDataType eDataType, String initialValue) {
		INPUT_TYPES result = INPUT_TYPES.get(initialValue);
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
	public String convertINPUT_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARTIFACT_TYPE createARTIFACT_TYPEFromString(EDataType eDataType, String initialValue) {
		ARTIFACT_TYPE result = ARTIFACT_TYPE.get(initialValue);
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
	public String convertARTIFACT_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATRIX_CONFIG_TYPE createMATRIX_CONFIG_TYPEFromString(EDataType eDataType, String initialValue) {
		MATRIX_CONFIG_TYPE result = MATRIX_CONFIG_TYPE.get(initialValue);
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
	public String convertMATRIX_CONFIG_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GHA_metamodelPackage getGHA_metamodelPackage() {
		return (GHA_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GHA_metamodelPackage getPackage() {
		return GHA_metamodelPackage.eINSTANCE;
	}

} //GHA_metamodelFactoryImpl
