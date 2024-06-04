/**
 */
package circleCI_metamodel.util;

import circleCI_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see circleCI_metamodel.CircleCI_metamodelPackage
 * @generated
 */
public class CircleCI_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CircleCI_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleCI_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CircleCI_metamodelPackage.eINSTANCE;
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
	protected CircleCI_metamodelSwitch<Adapter> modelSwitch = new CircleCI_metamodelSwitch<Adapter>() {
		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseRun(Run object) {
			return createRunAdapter();
		}

		@Override
		public Adapter caseDocker_Auth(Docker_Auth object) {
			return createDocker_AuthAdapter();
		}

		@Override
		public Adapter caseRestoreCache(RestoreCache object) {
			return createRestoreCacheAdapter();
		}

		@Override
		public Adapter caseDocker_Aws_Auths(Docker_Aws_Auths object) {
			return createDocker_Aws_AuthsAdapter();
		}

		@Override
		public Adapter caseJob(Job object) {
			return createJobAdapter();
		}

		@Override
		public Adapter caseMachine(Machine object) {
			return createMachineAdapter();
		}

		@Override
		public Adapter casePersistToWorkspace(PersistToWorkspace object) {
			return createPersistToWorkspaceAdapter();
		}

		@Override
		public Adapter caseStoreArtifact(StoreArtifact object) {
			return createStoreArtifactAdapter();
		}

		@Override
		public Adapter caseStoreTestResults(StoreTestResults object) {
			return createStoreTestResultsAdapter();
		}

		@Override
		public Adapter caseSetupRemoteDocker(SetupRemoteDocker object) {
			return createSetupRemoteDockerAdapter();
		}

		@Override
		public Adapter caseParameters(Parameters object) {
			return createParametersAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseMacOs(MacOs object) {
			return createMacOsAdapter();
		}

		@Override
		public Adapter caseWorkflow(Workflow object) {
			return createWorkflowAdapter();
		}

		@Override
		public Adapter caseEnvironment(Environment object) {
			return createEnvironmentAdapter();
		}

		@Override
		public Adapter caseDocker(Docker object) {
			return createDockerAdapter();
		}

		@Override
		public Adapter caseAddSSHKeys(AddSSHKeys object) {
			return createAddSSHKeysAdapter();
		}

		@Override
		public Adapter caseSaveCache(SaveCache object) {
			return createSaveCacheAdapter();
		}

		@Override
		public Adapter caseAttachWorkspace(AttachWorkspace object) {
			return createAttachWorkspaceAdapter();
		}

		@Override
		public Adapter caseWhen_Unless(When_Unless object) {
			return createWhen_UnlessAdapter();
		}

		@Override
		public Adapter caseBranch(Branch object) {
			return createBranchAdapter();
		}

		@Override
		public Adapter caseRunCommand(RunCommand object) {
			return createRunCommandAdapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseCheckout(Checkout object) {
			return createCheckoutAdapter();
		}

		@Override
		public Adapter caseExecutor(Executor object) {
			return createExecutorAdapter();
		}

		@Override
		public Adapter casePipeline(Pipeline object) {
			return createPipelineAdapter();
		}

		@Override
		public Adapter caseOrb(Orb object) {
			return createOrbAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseMatrix(Matrix object) {
			return createMatrixAdapter();
		}

		@Override
		public Adapter caseJobWorkflow(JobWorkflow object) {
			return createJobWorkflowAdapter();
		}

		@Override
		public Adapter caseMatrixParams(MatrixParams object) {
			return createMatrixParamsAdapter();
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
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Run
	 * @generated
	 */
	public Adapter createRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Docker_Auth <em>Docker Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Docker_Auth
	 * @generated
	 */
	public Adapter createDocker_AuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.RestoreCache <em>Restore Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.RestoreCache
	 * @generated
	 */
	public Adapter createRestoreCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Docker_Aws_Auths <em>Docker Aws Auths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Docker_Aws_Auths
	 * @generated
	 */
	public Adapter createDocker_Aws_AuthsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.PersistToWorkspace <em>Persist To Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.PersistToWorkspace
	 * @generated
	 */
	public Adapter createPersistToWorkspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.StoreArtifact <em>Store Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.StoreArtifact
	 * @generated
	 */
	public Adapter createStoreArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.StoreTestResults <em>Store Test Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.StoreTestResults
	 * @generated
	 */
	public Adapter createStoreTestResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.SetupRemoteDocker <em>Setup Remote Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.SetupRemoteDocker
	 * @generated
	 */
	public Adapter createSetupRemoteDockerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.MacOs <em>Mac Os</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.MacOs
	 * @generated
	 */
	public Adapter createMacOsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Docker
	 * @generated
	 */
	public Adapter createDockerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.AddSSHKeys <em>Add SSH Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.AddSSHKeys
	 * @generated
	 */
	public Adapter createAddSSHKeysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.SaveCache <em>Save Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.SaveCache
	 * @generated
	 */
	public Adapter createSaveCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.AttachWorkspace <em>Attach Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.AttachWorkspace
	 * @generated
	 */
	public Adapter createAttachWorkspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.When_Unless <em>When Unless</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.When_Unless
	 * @generated
	 */
	public Adapter createWhen_UnlessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.RunCommand <em>Run Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.RunCommand
	 * @generated
	 */
	public Adapter createRunCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Checkout <em>Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Checkout
	 * @generated
	 */
	public Adapter createCheckoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Executor
	 * @generated
	 */
	public Adapter createExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Orb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Orb
	 * @generated
	 */
	public Adapter createOrbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.JobWorkflow <em>Job Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.JobWorkflow
	 * @generated
	 */
	public Adapter createJobWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circleCI_metamodel.MatrixParams <em>Matrix Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circleCI_metamodel.MatrixParams
	 * @generated
	 */
	public Adapter createMatrixParamsAdapter() {
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

} //CircleCI_metamodelAdapterFactory
