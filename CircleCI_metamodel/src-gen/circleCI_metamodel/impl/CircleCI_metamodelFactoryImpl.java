/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.*;

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
public class CircleCI_metamodelFactoryImpl extends EFactoryImpl implements CircleCI_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CircleCI_metamodelFactory init() {
		try {
			CircleCI_metamodelFactory theCircleCI_metamodelFactory = (CircleCI_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(CircleCI_metamodelPackage.eNS_URI);
			if (theCircleCI_metamodelFactory != null) {
				return theCircleCI_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CircleCI_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleCI_metamodelFactoryImpl() {
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
		case CircleCI_metamodelPackage.RUN:
			return createRun();
		case CircleCI_metamodelPackage.DOCKER_AUTH:
			return createDocker_Auth();
		case CircleCI_metamodelPackage.RESTORE_CACHE:
			return createRestoreCache();
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS:
			return createDocker_Aws_Auths();
		case CircleCI_metamodelPackage.JOB:
			return createJob();
		case CircleCI_metamodelPackage.MACHINE:
			return createMachine();
		case CircleCI_metamodelPackage.PERSIST_TO_WORKSPACE:
			return createPersistToWorkspace();
		case CircleCI_metamodelPackage.STORE_ARTIFACT:
			return createStoreArtifact();
		case CircleCI_metamodelPackage.STORE_TEST_RESULTS:
			return createStoreTestResults();
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER:
			return createSetupRemoteDocker();
		case CircleCI_metamodelPackage.PARAMETERS:
			return createParameters();
		case CircleCI_metamodelPackage.PARAMETER:
			return createParameter();
		case CircleCI_metamodelPackage.MAC_OS:
			return createMacOs();
		case CircleCI_metamodelPackage.WORKFLOW:
			return createWorkflow();
		case CircleCI_metamodelPackage.ENVIRONMENT:
			return createEnvironment();
		case CircleCI_metamodelPackage.DOCKER:
			return createDocker();
		case CircleCI_metamodelPackage.ADD_SSH_KEYS:
			return createAddSSHKeys();
		case CircleCI_metamodelPackage.SAVE_CACHE:
			return createSaveCache();
		case CircleCI_metamodelPackage.ATTACH_WORKSPACE:
			return createAttachWorkspace();
		case CircleCI_metamodelPackage.WHEN_UNLESS:
			return createWhen_Unless();
		case CircleCI_metamodelPackage.BRANCH:
			return createBranch();
		case CircleCI_metamodelPackage.RUN_COMMAND:
			return createRunCommand();
		case CircleCI_metamodelPackage.TRIGGER:
			return createTrigger();
		case CircleCI_metamodelPackage.CHECKOUT:
			return createCheckout();
		case CircleCI_metamodelPackage.PIPELINE:
			return createPipeline();
		case CircleCI_metamodelPackage.ORB:
			return createOrb();
		case CircleCI_metamodelPackage.COMMAND:
			return createCommand();
		case CircleCI_metamodelPackage.MATRIX:
			return createMatrix();
		case CircleCI_metamodelPackage.JOB_WORKFLOW:
			return createJobWorkflow();
		case CircleCI_metamodelPackage.MATRIX_PARAMS:
			return createMatrixParams();
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
		case CircleCI_metamodelPackage.PARAMETER_TYPES:
			return createPARAMETER_TYPESFromString(eDataType, initialValue);
		case CircleCI_metamodelPackage.BRANCH_TYPE:
			return createBRANCH_TYPEFromString(eDataType, initialValue);
		case CircleCI_metamodelPackage.WHEN_TYPE:
			return createWHEN_TYPEFromString(eDataType, initialValue);
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
		case CircleCI_metamodelPackage.PARAMETER_TYPES:
			return convertPARAMETER_TYPESToString(eDataType, instanceValue);
		case CircleCI_metamodelPackage.BRANCH_TYPE:
			return convertBRANCH_TYPEToString(eDataType, instanceValue);
		case CircleCI_metamodelPackage.WHEN_TYPE:
			return convertWHEN_TYPEToString(eDataType, instanceValue);
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
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Docker_Auth createDocker_Auth() {
		Docker_AuthImpl docker_Auth = new Docker_AuthImpl();
		return docker_Auth;
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
	public Docker_Aws_Auths createDocker_Aws_Auths() {
		Docker_Aws_AuthsImpl docker_Aws_Auths = new Docker_Aws_AuthsImpl();
		return docker_Aws_Auths;
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
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistToWorkspace createPersistToWorkspace() {
		PersistToWorkspaceImpl persistToWorkspace = new PersistToWorkspaceImpl();
		return persistToWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreArtifact createStoreArtifact() {
		StoreArtifactImpl storeArtifact = new StoreArtifactImpl();
		return storeArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreTestResults createStoreTestResults() {
		StoreTestResultsImpl storeTestResults = new StoreTestResultsImpl();
		return storeTestResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetupRemoteDocker createSetupRemoteDocker() {
		SetupRemoteDockerImpl setupRemoteDocker = new SetupRemoteDockerImpl();
		return setupRemoteDocker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
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
	public MacOs createMacOs() {
		MacOsImpl macOs = new MacOsImpl();
		return macOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
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
	public AddSSHKeys createAddSSHKeys() {
		AddSSHKeysImpl addSSHKeys = new AddSSHKeysImpl();
		return addSSHKeys;
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
	public AttachWorkspace createAttachWorkspace() {
		AttachWorkspaceImpl attachWorkspace = new AttachWorkspaceImpl();
		return attachWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When_Unless createWhen_Unless() {
		When_UnlessImpl when_Unless = new When_UnlessImpl();
		return when_Unless;
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
	public RunCommand createRunCommand() {
		RunCommandImpl runCommand = new RunCommandImpl();
		return runCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Checkout createCheckout() {
		CheckoutImpl checkout = new CheckoutImpl();
		return checkout;
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
	public Orb createOrb() {
		OrbImpl orb = new OrbImpl();
		return orb;
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
	public JobWorkflow createJobWorkflow() {
		JobWorkflowImpl jobWorkflow = new JobWorkflowImpl();
		return jobWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixParams createMatrixParams() {
		MatrixParamsImpl matrixParams = new MatrixParamsImpl();
		return matrixParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARAMETER_TYPES createPARAMETER_TYPESFromString(EDataType eDataType, String initialValue) {
		PARAMETER_TYPES result = PARAMETER_TYPES.get(initialValue);
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
	public String convertPARAMETER_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRANCH_TYPE createBRANCH_TYPEFromString(EDataType eDataType, String initialValue) {
		BRANCH_TYPE result = BRANCH_TYPE.get(initialValue);
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
	public String convertBRANCH_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WHEN_TYPE createWHEN_TYPEFromString(EDataType eDataType, String initialValue) {
		WHEN_TYPE result = WHEN_TYPE.get(initialValue);
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
	public String convertWHEN_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleCI_metamodelPackage getCircleCI_metamodelPackage() {
		return (CircleCI_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CircleCI_metamodelPackage getPackage() {
		return CircleCI_metamodelPackage.eINSTANCE;
	}

} //CircleCI_metamodelFactoryImpl
