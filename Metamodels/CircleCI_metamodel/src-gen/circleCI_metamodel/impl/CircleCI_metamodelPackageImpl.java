/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.AddSSHKeys;
import circleCI_metamodel.AttachWorkspace;
import circleCI_metamodel.Branch;
import circleCI_metamodel.Checkout;
import circleCI_metamodel.CircleCI_metamodelFactory;
import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Command;
import circleCI_metamodel.Docker;
import circleCI_metamodel.Docker_Auth;
import circleCI_metamodel.Docker_Aws_Auths;
import circleCI_metamodel.Environment;
import circleCI_metamodel.Executor;
import circleCI_metamodel.Job;
import circleCI_metamodel.JobWorkflow;
import circleCI_metamodel.MacOs;
import circleCI_metamodel.Machine;
import circleCI_metamodel.Matrix;
import circleCI_metamodel.MatrixParams;
import circleCI_metamodel.Orb;
import circleCI_metamodel.Parameter;
import circleCI_metamodel.Parameters;
import circleCI_metamodel.PersistToWorkspace;
import circleCI_metamodel.Pipeline;
import circleCI_metamodel.RestoreCache;
import circleCI_metamodel.Run;
import circleCI_metamodel.RunCommand;
import circleCI_metamodel.SaveCache;
import circleCI_metamodel.SetupRemoteDocker;
import circleCI_metamodel.Step;
import circleCI_metamodel.StoreArtifact;
import circleCI_metamodel.StoreTestResults;
import circleCI_metamodel.Trigger;
import circleCI_metamodel.When_Unless;
import circleCI_metamodel.Workflow;

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
public class CircleCI_metamodelPackageImpl extends EPackageImpl implements CircleCI_metamodelPackage {
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
	private EClass runEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docker_AuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restoreCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docker_Aws_AuthsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistToWorkspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeTestResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setupRemoteDockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macOsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

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
	private EClass dockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSSHKeysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saveCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachWorkspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass when_UnlessEClass = null;

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
	private EClass runCommandEClass = null;

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
	private EClass checkoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executorEClass = null;

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
	private EClass orbEClass = null;

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
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobWorkflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameteR_TYPESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brancH_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wheN_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dockeR_RESOURCE_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum macoS_RESOURCE_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum machinE_RESOURCE_TYPEEEnum = null;

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
	 * @see circleCI_metamodel.CircleCI_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CircleCI_metamodelPackageImpl() {
		super(eNS_URI, CircleCI_metamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CircleCI_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CircleCI_metamodelPackage init() {
		if (isInited)
			return (CircleCI_metamodelPackage) EPackage.Registry.INSTANCE
					.getEPackage(CircleCI_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCircleCI_metamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CircleCI_metamodelPackageImpl theCircleCI_metamodelPackage = registeredCircleCI_metamodelPackage instanceof CircleCI_metamodelPackageImpl
				? (CircleCI_metamodelPackageImpl) registeredCircleCI_metamodelPackage
				: new CircleCI_metamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCircleCI_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theCircleCI_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCircleCI_metamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CircleCI_metamodelPackage.eNS_URI, theCircleCI_metamodelPackage);
		return theCircleCI_metamodelPackage;
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
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRun() {
		return runEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRun_When() {
		return (EAttribute) runEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRun_Background() {
		return (EAttribute) runEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRun_Working_directory() {
		return (EAttribute) runEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRun_Environments() {
		return (EReference) runEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRun_No_output_timeout() {
		return (EAttribute) runEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRun_Shell() {
		return (EAttribute) runEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRun_Run_commands() {
		return (EReference) runEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRun_Parameters() {
		return (EReference) runEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocker_Auth() {
		return docker_AuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Auth_Username() {
		return (EAttribute) docker_AuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Auth_Password() {
		return (EAttribute) docker_AuthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestoreCache() {
		return restoreCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestoreCache_Key() {
		return (EAttribute) restoreCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestoreCache_Keys() {
		return (EAttribute) restoreCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocker_Aws_Auths() {
		return docker_Aws_AuthsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Aws_Auths_Aws_access_key_id() {
		return (EAttribute) docker_Aws_AuthsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Aws_Auths_Aws_secret_access_key() {
		return (EAttribute) docker_Aws_AuthsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Environments() {
		return (EReference) jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Steps() {
		return (EReference) jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Parameters() {
		return (EReference) jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Name() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Parallelism() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_ReuseExecutor() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Executors() {
		return (EReference) jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Image() {
		return (EAttribute) machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Docker_layer_caching() {
		return (EAttribute) machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_ResourceClass() {
		return (EAttribute) machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistToWorkspace() {
		return persistToWorkspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistToWorkspace_Root() {
		return (EAttribute) persistToWorkspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistToWorkspace_Paths() {
		return (EAttribute) persistToWorkspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreArtifact() {
		return storeArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreArtifact_Path() {
		return (EAttribute) storeArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreArtifact_Destination() {
		return (EAttribute) storeArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreTestResults() {
		return storeTestResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreTestResults_Path() {
		return (EAttribute) storeTestResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetupRemoteDocker() {
		return setupRemoteDockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetupRemoteDocker_Docker_layer_caching() {
		return (EAttribute) setupRemoteDockerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetupRemoteDocker_Version() {
		return (EAttribute) setupRemoteDockerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameters() {
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameters_Parameter() {
		return (EAttribute) parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Default() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Description() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_EnumValues() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMacOs() {
		return macOsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMacOs_Xcode() {
		return (EAttribute) macOsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMacOs_ResourceClass() {
		return (EAttribute) macOsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Triggers() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Branches() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_When_unless() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflow_Name() {
		return (EAttribute) workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflow_Version() {
		return (EAttribute) workflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Jobworkflow() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(5);
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
	public EClass getDocker() {
		return dockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocker_Docker_auth() {
		return (EReference) dockerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocker_Docker_aws_auth() {
		return (EReference) dockerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Image() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Entrypoint() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Command() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_User() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_ResourceClass() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddSSHKeys() {
		return addSSHKeysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddSSHKeys_Fingerprints() {
		return (EAttribute) addSSHKeysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSaveCache() {
		return saveCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaveCache_Paths() {
		return (EAttribute) saveCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaveCache_Key() {
		return (EAttribute) saveCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaveCache_When() {
		return (EAttribute) saveCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachWorkspace() {
		return attachWorkspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttachWorkspace_At() {
		return (EAttribute) attachWorkspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhen_Unless() {
		return when_UnlessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhen_Unless_When_step() {
		return (EReference) when_UnlessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhen_Unless_Unless_step() {
		return (EReference) when_UnlessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhen_Unless_Condition() {
		return (EAttribute) when_UnlessEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getBranch_Name() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Branch() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunCommand() {
		return runCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunCommand_Name() {
		return (EAttribute) runCommandEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTrigger_Cron() {
		return (EAttribute) triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckout() {
		return checkoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckout_Path() {
		return (EAttribute) checkoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutor() {
		return executorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutor_Name() {
		return (EAttribute) executorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutor_Shell() {
		return (EAttribute) executorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutor_Working_directory() {
		return (EAttribute) executorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutor_Environments() {
		return (EReference) executorEClass.getEStructuralFeatures().get(3);
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
	public EReference getPipeline_Orbs() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Commands() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Workflows() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Jobs() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Executors() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Version() {
		return (EAttribute) pipelineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Setup() {
		return (EAttribute) pipelineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrb() {
		return orbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrb_Key() {
		return (EAttribute) orbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrb_Value() {
		return (EAttribute) orbEClass.getEStructuralFeatures().get(1);
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
	public EReference getCommand_Steps() {
		return (EReference) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommand_Parameters() {
		return (EReference) commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Name() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Description() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMatrix_Alias() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Matrix_exclude() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Matrix_params() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobWorkflow() {
		return jobWorkflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobWorkflow_Name() {
		return (EAttribute) jobWorkflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobWorkflow_Requires() {
		return (EAttribute) jobWorkflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobWorkflow_Context() {
		return (EAttribute) jobWorkflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobWorkflow_ApprovalJob() {
		return (EAttribute) jobWorkflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobWorkflow_Branches() {
		return (EReference) jobWorkflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobWorkflow_Matrix() {
		return (EReference) jobWorkflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrixParams() {
		return matrixParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrixParams_Key() {
		return (EAttribute) matrixParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrixParams_Values() {
		return (EAttribute) matrixParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPARAMETER_TYPES() {
		return parameteR_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBRANCH_TYPE() {
		return brancH_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWHEN_TYPE() {
		return wheN_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDOCKER_RESOURCE_TYPE() {
		return dockeR_RESOURCE_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMACOS_RESOURCE_TYPE() {
		return macoS_RESOURCE_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMACHINE_RESOURCE_TYPE() {
		return machinE_RESOURCE_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleCI_metamodelFactory getCircleCI_metamodelFactory() {
		return (CircleCI_metamodelFactory) getEFactoryInstance();
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
		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__NAME);

		runEClass = createEClass(RUN);
		createEAttribute(runEClass, RUN__WHEN);
		createEAttribute(runEClass, RUN__BACKGROUND);
		createEAttribute(runEClass, RUN__WORKING_DIRECTORY);
		createEReference(runEClass, RUN__ENVIRONMENTS);
		createEAttribute(runEClass, RUN__NO_OUTPUT_TIMEOUT);
		createEAttribute(runEClass, RUN__SHELL);
		createEReference(runEClass, RUN__RUN_COMMANDS);
		createEReference(runEClass, RUN__PARAMETERS);

		docker_AuthEClass = createEClass(DOCKER_AUTH);
		createEAttribute(docker_AuthEClass, DOCKER_AUTH__USERNAME);
		createEAttribute(docker_AuthEClass, DOCKER_AUTH__PASSWORD);

		restoreCacheEClass = createEClass(RESTORE_CACHE);
		createEAttribute(restoreCacheEClass, RESTORE_CACHE__KEY);
		createEAttribute(restoreCacheEClass, RESTORE_CACHE__KEYS);

		docker_Aws_AuthsEClass = createEClass(DOCKER_AWS_AUTHS);
		createEAttribute(docker_Aws_AuthsEClass, DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID);
		createEAttribute(docker_Aws_AuthsEClass, DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY);

		jobEClass = createEClass(JOB);
		createEReference(jobEClass, JOB__ENVIRONMENTS);
		createEReference(jobEClass, JOB__STEPS);
		createEReference(jobEClass, JOB__PARAMETERS);
		createEAttribute(jobEClass, JOB__NAME);
		createEAttribute(jobEClass, JOB__PARALLELISM);
		createEAttribute(jobEClass, JOB__REUSE_EXECUTOR);
		createEReference(jobEClass, JOB__EXECUTORS);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__IMAGE);
		createEAttribute(machineEClass, MACHINE__DOCKER_LAYER_CACHING);
		createEAttribute(machineEClass, MACHINE__RESOURCE_CLASS);

		persistToWorkspaceEClass = createEClass(PERSIST_TO_WORKSPACE);
		createEAttribute(persistToWorkspaceEClass, PERSIST_TO_WORKSPACE__ROOT);
		createEAttribute(persistToWorkspaceEClass, PERSIST_TO_WORKSPACE__PATHS);

		storeArtifactEClass = createEClass(STORE_ARTIFACT);
		createEAttribute(storeArtifactEClass, STORE_ARTIFACT__PATH);
		createEAttribute(storeArtifactEClass, STORE_ARTIFACT__DESTINATION);

		storeTestResultsEClass = createEClass(STORE_TEST_RESULTS);
		createEAttribute(storeTestResultsEClass, STORE_TEST_RESULTS__PATH);

		setupRemoteDockerEClass = createEClass(SETUP_REMOTE_DOCKER);
		createEAttribute(setupRemoteDockerEClass, SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING);
		createEAttribute(setupRemoteDockerEClass, SETUP_REMOTE_DOCKER__VERSION);

		parametersEClass = createEClass(PARAMETERS);
		createEAttribute(parametersEClass, PARAMETERS__PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);
		createEAttribute(parameterEClass, PARAMETER__ENUM_VALUES);

		macOsEClass = createEClass(MAC_OS);
		createEAttribute(macOsEClass, MAC_OS__XCODE);
		createEAttribute(macOsEClass, MAC_OS__RESOURCE_CLASS);

		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__TRIGGERS);
		createEReference(workflowEClass, WORKFLOW__BRANCHES);
		createEReference(workflowEClass, WORKFLOW__WHEN_UNLESS);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEAttribute(workflowEClass, WORKFLOW__VERSION);
		createEReference(workflowEClass, WORKFLOW__JOBWORKFLOW);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__KEY);
		createEAttribute(environmentEClass, ENVIRONMENT__VALUE);

		dockerEClass = createEClass(DOCKER);
		createEReference(dockerEClass, DOCKER__DOCKER_AUTH);
		createEReference(dockerEClass, DOCKER__DOCKER_AWS_AUTH);
		createEAttribute(dockerEClass, DOCKER__IMAGE);
		createEAttribute(dockerEClass, DOCKER__ENTRYPOINT);
		createEAttribute(dockerEClass, DOCKER__COMMAND);
		createEAttribute(dockerEClass, DOCKER__USER);
		createEAttribute(dockerEClass, DOCKER__RESOURCE_CLASS);

		addSSHKeysEClass = createEClass(ADD_SSH_KEYS);
		createEAttribute(addSSHKeysEClass, ADD_SSH_KEYS__FINGERPRINTS);

		saveCacheEClass = createEClass(SAVE_CACHE);
		createEAttribute(saveCacheEClass, SAVE_CACHE__PATHS);
		createEAttribute(saveCacheEClass, SAVE_CACHE__KEY);
		createEAttribute(saveCacheEClass, SAVE_CACHE__WHEN);

		attachWorkspaceEClass = createEClass(ATTACH_WORKSPACE);
		createEAttribute(attachWorkspaceEClass, ATTACH_WORKSPACE__AT);

		when_UnlessEClass = createEClass(WHEN_UNLESS);
		createEReference(when_UnlessEClass, WHEN_UNLESS__WHEN_STEP);
		createEReference(when_UnlessEClass, WHEN_UNLESS__UNLESS_STEP);
		createEAttribute(when_UnlessEClass, WHEN_UNLESS__CONDITION);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__NAME);
		createEAttribute(branchEClass, BRANCH__BRANCH);

		runCommandEClass = createEClass(RUN_COMMAND);
		createEAttribute(runCommandEClass, RUN_COMMAND__NAME);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__CRON);

		checkoutEClass = createEClass(CHECKOUT);
		createEAttribute(checkoutEClass, CHECKOUT__PATH);

		executorEClass = createEClass(EXECUTOR);
		createEAttribute(executorEClass, EXECUTOR__NAME);
		createEAttribute(executorEClass, EXECUTOR__SHELL);
		createEAttribute(executorEClass, EXECUTOR__WORKING_DIRECTORY);
		createEReference(executorEClass, EXECUTOR__ENVIRONMENTS);

		pipelineEClass = createEClass(PIPELINE);
		createEReference(pipelineEClass, PIPELINE__ORBS);
		createEReference(pipelineEClass, PIPELINE__COMMANDS);
		createEReference(pipelineEClass, PIPELINE__WORKFLOWS);
		createEReference(pipelineEClass, PIPELINE__JOBS);
		createEReference(pipelineEClass, PIPELINE__EXECUTORS);
		createEAttribute(pipelineEClass, PIPELINE__VERSION);
		createEAttribute(pipelineEClass, PIPELINE__SETUP);

		orbEClass = createEClass(ORB);
		createEAttribute(orbEClass, ORB__KEY);
		createEAttribute(orbEClass, ORB__VALUE);

		commandEClass = createEClass(COMMAND);
		createEReference(commandEClass, COMMAND__STEPS);
		createEReference(commandEClass, COMMAND__PARAMETERS);
		createEAttribute(commandEClass, COMMAND__NAME);
		createEAttribute(commandEClass, COMMAND__DESCRIPTION);

		matrixEClass = createEClass(MATRIX);
		createEAttribute(matrixEClass, MATRIX__ALIAS);
		createEReference(matrixEClass, MATRIX__MATRIX_EXCLUDE);
		createEReference(matrixEClass, MATRIX__MATRIX_PARAMS);

		jobWorkflowEClass = createEClass(JOB_WORKFLOW);
		createEAttribute(jobWorkflowEClass, JOB_WORKFLOW__NAME);
		createEAttribute(jobWorkflowEClass, JOB_WORKFLOW__REQUIRES);
		createEAttribute(jobWorkflowEClass, JOB_WORKFLOW__CONTEXT);
		createEAttribute(jobWorkflowEClass, JOB_WORKFLOW__APPROVAL_JOB);
		createEReference(jobWorkflowEClass, JOB_WORKFLOW__BRANCHES);
		createEReference(jobWorkflowEClass, JOB_WORKFLOW__MATRIX);

		matrixParamsEClass = createEClass(MATRIX_PARAMS);
		createEAttribute(matrixParamsEClass, MATRIX_PARAMS__KEY);
		createEAttribute(matrixParamsEClass, MATRIX_PARAMS__VALUES);

		// Create enums
		parameteR_TYPESEEnum = createEEnum(PARAMETER_TYPES);
		brancH_TYPEEEnum = createEEnum(BRANCH_TYPE);
		wheN_TYPEEEnum = createEEnum(WHEN_TYPE);
		dockeR_RESOURCE_TYPEEEnum = createEEnum(DOCKER_RESOURCE_TYPE);
		macoS_RESOURCE_TYPEEEnum = createEEnum(MACOS_RESOURCE_TYPE);
		machinE_RESOURCE_TYPEEEnum = createEEnum(MACHINE_RESOURCE_TYPE);
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
		runEClass.getESuperTypes().add(this.getStep());
		restoreCacheEClass.getESuperTypes().add(this.getStep());
		machineEClass.getESuperTypes().add(this.getExecutor());
		persistToWorkspaceEClass.getESuperTypes().add(this.getStep());
		storeArtifactEClass.getESuperTypes().add(this.getStep());
		storeTestResultsEClass.getESuperTypes().add(this.getStep());
		setupRemoteDockerEClass.getESuperTypes().add(this.getStep());
		macOsEClass.getESuperTypes().add(this.getExecutor());
		dockerEClass.getESuperTypes().add(this.getExecutor());
		addSSHKeysEClass.getESuperTypes().add(this.getStep());
		saveCacheEClass.getESuperTypes().add(this.getStep());
		attachWorkspaceEClass.getESuperTypes().add(this.getStep());
		when_UnlessEClass.getESuperTypes().add(this.getStep());
		checkoutEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRun_When(), this.getWHEN_TYPE(), "when", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Background(), ecorePackage.getEBoolean(), "background", null, 0, 1, Run.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Working_directory(), ecorePackage.getEString(), "working_directory", ".", 0, 1, Run.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Environments(), this.getEnvironment(), null, "environments", null, 0, -1, Run.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_No_output_timeout(), ecorePackage.getEString(), "no_output_timeout", "10m", 0, 1,
				Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRun_Shell(), ecorePackage.getEString(), "shell", null, 0, 1, Run.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Run_commands(), this.getRunCommand(), null, "run_commands", null, 1, -1, Run.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Parameters(), this.getParameters(), null, "parameters", null, 0, -1, Run.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docker_AuthEClass, Docker_Auth.class, "Docker_Auth", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocker_Auth_Username(), ecorePackage.getEString(), "username", null, 1, 1, Docker_Auth.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Auth_Password(), ecorePackage.getEString(), "password", null, 1, 1, Docker_Auth.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restoreCacheEClass, RestoreCache.class, "RestoreCache", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestoreCache_Key(), ecorePackage.getEString(), "key", null, 0, 1, RestoreCache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestoreCache_Keys(), ecorePackage.getEString(), "keys", null, 0, -1, RestoreCache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docker_Aws_AuthsEClass, Docker_Aws_Auths.class, "Docker_Aws_Auths", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocker_Aws_Auths_Aws_access_key_id(), ecorePackage.getEString(), "aws_access_key_id", null, 1,
				1, Docker_Aws_Auths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Aws_Auths_Aws_secret_access_key(), ecorePackage.getEString(), "aws_secret_access_key",
				null, 1, 1, Docker_Aws_Auths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJob_Environments(), this.getEnvironment(), null, "environments", null, 0, -1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Steps(), this.getStep(), null, "steps", null, 1, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "name", null, 1, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Parallelism(), ecorePackage.getEShort(), "parallelism", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_ReuseExecutor(), ecorePackage.getEString(), "reuseExecutor", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Executors(), this.getExecutor(), null, "executors", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Image(), ecorePackage.getEString(), "image", null, 1, 1, Machine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Docker_layer_caching(), ecorePackage.getEBoolean(), "docker_layer_caching", null, 0,
				1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_ResourceClass(), this.getMACHINE_RESOURCE_TYPE(), "resourceClass", null, 1, 1,
				Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(persistToWorkspaceEClass, PersistToWorkspace.class, "PersistToWorkspace", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistToWorkspace_Root(), ecorePackage.getEString(), "root", null, 1, 1,
				PersistToWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistToWorkspace_Paths(), ecorePackage.getEString(), "paths", null, 1, -1,
				PersistToWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(storeArtifactEClass, StoreArtifact.class, "StoreArtifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoreArtifact_Path(), ecorePackage.getEString(), "path", null, 1, 1, StoreArtifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreArtifact_Destination(), ecorePackage.getEString(), "destination", null, 0, 1,
				StoreArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(storeTestResultsEClass, StoreTestResults.class, "StoreTestResults", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoreTestResults_Path(), ecorePackage.getEString(), "path", null, 1, 1,
				StoreTestResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(setupRemoteDockerEClass, SetupRemoteDocker.class, "SetupRemoteDocker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetupRemoteDocker_Docker_layer_caching(), ecorePackage.getEBoolean(), "docker_layer_caching",
				null, 0, 1, SetupRemoteDocker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetupRemoteDocker_Version(), ecorePackage.getEString(), "version", null, 0, 1,
				SetupRemoteDocker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parametersEClass, Parameters.class, "Parameters", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameters_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1, Parameters.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getPARAMETER_TYPES(), "type", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Default(), ecorePackage.getEString(), "default", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_EnumValues(), ecorePackage.getEString(), "enumValues", null, 0, -1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macOsEClass, MacOs.class, "MacOs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacOs_Xcode(), ecorePackage.getEString(), "xcode", null, 1, 1, MacOs.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacOs_ResourceClass(), this.getMACOS_RESOURCE_TYPE(), "resourceClass", null, 1, 1,
				MacOs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Branches(), this.getBranch(), null, "branches", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_When_unless(), this.getWhen_Unless(), null, "when_unless", null, 0, 1,
				Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 1, 1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Version(), ecorePackage.getEString(), "version", null, 1, 1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Jobworkflow(), this.getJobWorkflow(), null, "jobworkflow", null, 1, -1,
				Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Key(), ecorePackage.getEString(), "key", null, 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Value(), ecorePackage.getEString(), "value", null, 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerEClass, Docker.class, "Docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocker_Docker_auth(), this.getDocker_Auth(), null, "docker_auth", null, 0, 1, Docker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocker_Docker_aws_auth(), this.getDocker_Aws_Auths(), null, "docker_aws_auth", null, 0, 1,
				Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Image(), ecorePackage.getEString(), "image", null, 1, 1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Entrypoint(), ecorePackage.getEString(), "entrypoint", null, 0, -1, Docker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Command(), ecorePackage.getEString(), "command", null, 0, -1, Docker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_User(), ecorePackage.getEString(), "user", null, 0, 1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_ResourceClass(), this.getDOCKER_RESOURCE_TYPE(), "resourceClass", null, 1, 1,
				Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(addSSHKeysEClass, AddSSHKeys.class, "AddSSHKeys", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSSHKeys_Fingerprints(), ecorePackage.getEString(), "fingerprints", null, 0, -1,
				AddSSHKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(saveCacheEClass, SaveCache.class, "SaveCache", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaveCache_Paths(), ecorePackage.getEString(), "paths", null, 1, -1, SaveCache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSaveCache_Key(), ecorePackage.getEString(), "key", null, 1, 1, SaveCache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSaveCache_When(), this.getWHEN_TYPE(), "when", null, 0, 1, SaveCache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachWorkspaceEClass, AttachWorkspace.class, "AttachWorkspace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachWorkspace_At(), ecorePackage.getEString(), "at", null, 1, 1, AttachWorkspace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(when_UnlessEClass, When_Unless.class, "When_Unless", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhen_Unless_When_step(), this.getStep(), null, "when_step", null, 1, -1, When_Unless.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Unless_Unless_step(), this.getStep(), null, "unless_step", null, 0, -1,
				When_Unless.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhen_Unless_Condition(), ecorePackage.getEString(), "condition", null, 1, 1,
				When_Unless.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_Name(), ecorePackage.getEString(), "name", null, 1, 1, Branch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Branch(), this.getBRANCH_TYPE(), "branch", null, 1, 1, Branch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runCommandEClass, RunCommand.class, "RunCommand", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunCommand_Name(), ecorePackage.getEString(), "name", null, 1, 1, RunCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Cron(), ecorePackage.getEString(), "cron", null, 1, 1, Trigger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkoutEClass, Checkout.class, "Checkout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckout_Path(), ecorePackage.getEString(), "path", null, 0, 1, Checkout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executorEClass, Executor.class, "Executor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Executor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutor_Shell(), ecorePackage.getEString(), "shell", null, 0, 1, Executor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutor_Working_directory(), ecorePackage.getEString(), "working_directory", "", 0, 1,
				Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_Environments(), this.getEnvironment(), null, "environments", null, 0, -1,
				Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Orbs(), this.getOrb(), null, "orbs", null, 0, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPipeline_Commands(), this.getCommand(), null, "commands", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Workflows(), this.getWorkflow(), null, "workflows", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Jobs(), this.getJob(), null, "jobs", null, 1, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPipeline_Executors(), this.getExecutor(), null, "executors", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_Version(), ecorePackage.getEString(), "version", null, 1, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_Setup(), ecorePackage.getEBoolean(), "setup", null, 0, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbEClass, Orb.class, "Orb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrb_Key(), ecorePackage.getEString(), "key", null, 1, 1, Orb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrb_Value(), ecorePackage.getEString(), "value", null, 1, 1, Orb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommand_Steps(), this.getStep(), null, "steps", null, 1, -1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCommand_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Description(), ecorePackage.getEString(), "description", null, 0, 1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrix_Matrix_exclude(), this.getMatrixParams(), null, "matrix_exclude", null, 0, -1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrix_Matrix_params(), this.getMatrixParams(), null, "matrix_params", null, 1, -1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobWorkflowEClass, JobWorkflow.class, "JobWorkflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobWorkflow_Name(), ecorePackage.getEString(), "name", null, 1, 1, JobWorkflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobWorkflow_Requires(), ecorePackage.getEString(), "requires", null, 0, -1, JobWorkflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobWorkflow_Context(), ecorePackage.getEString(), "context", null, 0, -1, JobWorkflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobWorkflow_ApprovalJob(), ecorePackage.getEBoolean(), "approvalJob", null, 0, 1,
				JobWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getJobWorkflow_Branches(), this.getBranch(), null, "branches", null, 0, -1, JobWorkflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobWorkflow_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, JobWorkflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixParamsEClass, MatrixParams.class, "MatrixParams", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrixParams_Key(), ecorePackage.getEString(), "key", null, 1, 1, MatrixParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrixParams_Values(), ecorePackage.getEString(), "values", null, 1, -1, MatrixParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.class, "PARAMETER_TYPES");
		addEEnumLiteral(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.STRING);
		addEEnumLiteral(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.BOOLEAN);
		addEEnumLiteral(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.INTEGER);
		addEEnumLiteral(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.ENUM);
		addEEnumLiteral(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.EXECUTOR);
		addEEnumLiteral(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.STEPS);
		addEEnumLiteral(parameteR_TYPESEEnum, circleCI_metamodel.PARAMETER_TYPES.ENVIRONMENT_VARIABLE_NAME);

		initEEnum(brancH_TYPEEEnum, circleCI_metamodel.BRANCH_TYPE.class, "BRANCH_TYPE");
		addEEnumLiteral(brancH_TYPEEEnum, circleCI_metamodel.BRANCH_TYPE.ONLY);
		addEEnumLiteral(brancH_TYPEEEnum, circleCI_metamodel.BRANCH_TYPE.IGNORE);

		initEEnum(wheN_TYPEEEnum, circleCI_metamodel.WHEN_TYPE.class, "WHEN_TYPE");
		addEEnumLiteral(wheN_TYPEEEnum, circleCI_metamodel.WHEN_TYPE.ON_SUCCESS);
		addEEnumLiteral(wheN_TYPEEEnum, circleCI_metamodel.WHEN_TYPE.ALWAYS);
		addEEnumLiteral(wheN_TYPEEEnum, circleCI_metamodel.WHEN_TYPE.ON_FAIL);

		initEEnum(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.class, "DOCKER_RESOURCE_TYPE");
		addEEnumLiteral(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.SMALL);
		addEEnumLiteral(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.MEDIUM);
		addEEnumLiteral(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.MEDIUM_PLUS);
		addEEnumLiteral(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.LARGE);
		addEEnumLiteral(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.XLARGE);
		addEEnumLiteral(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.TWO_XLARGE);
		addEEnumLiteral(dockeR_RESOURCE_TYPEEEnum, circleCI_metamodel.DOCKER_RESOURCE_TYPE.TWO_XLARGE_PLUS);

		initEEnum(macoS_RESOURCE_TYPEEEnum, circleCI_metamodel.MACOS_RESOURCE_TYPE.class, "MACOS_RESOURCE_TYPE");
		addEEnumLiteral(macoS_RESOURCE_TYPEEEnum, circleCI_metamodel.MACOS_RESOURCE_TYPE.MACOS_X86_MEDIUM_GEN2);
		addEEnumLiteral(macoS_RESOURCE_TYPEEEnum, circleCI_metamodel.MACOS_RESOURCE_TYPE.MACOS_M1_MEDIUM_GEN);
		addEEnumLiteral(macoS_RESOURCE_TYPEEEnum, circleCI_metamodel.MACOS_RESOURCE_TYPE.MACOS_M1_LARGE_GEN1);

		initEEnum(machinE_RESOURCE_TYPEEEnum, circleCI_metamodel.MACHINE_RESOURCE_TYPE.class, "MACHINE_RESOURCE_TYPE");
		addEEnumLiteral(machinE_RESOURCE_TYPEEEnum, circleCI_metamodel.MACHINE_RESOURCE_TYPE.MEDIUM);
		addEEnumLiteral(machinE_RESOURCE_TYPEEEnum, circleCI_metamodel.MACHINE_RESOURCE_TYPE.LARGE);
		addEEnumLiteral(machinE_RESOURCE_TYPEEEnum, circleCI_metamodel.MACHINE_RESOURCE_TYPE.XLARGE);
		addEEnumLiteral(machinE_RESOURCE_TYPEEEnum, circleCI_metamodel.MACHINE_RESOURCE_TYPE.TWO_XLARGE);
		addEEnumLiteral(machinE_RESOURCE_TYPEEEnum, circleCI_metamodel.MACHINE_RESOURCE_TYPE.TWO_XLARGE_PLUS);

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

} //CircleCI_metamodelPackageImpl
