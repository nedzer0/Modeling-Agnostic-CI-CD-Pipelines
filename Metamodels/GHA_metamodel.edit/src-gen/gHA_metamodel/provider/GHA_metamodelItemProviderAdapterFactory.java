/**
 */
package gHA_metamodel.provider;

import gHA_metamodel.util.GHA_metamodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GHA_metamodelItemProviderAdapterFactory extends GHA_metamodelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GHA_metamodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Pipeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineItemProvider pipelineItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Pipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPipelineAdapter() {
		if (pipelineItemProvider == null) {
			pipelineItemProvider = new PipelineItemProvider(this);
		}

		return pipelineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Job} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobItemProvider jobItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJobAdapter() {
		if (jobItemProvider == null) {
			jobItemProvider = new JobItemProvider(this);
		}

		return jobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Step} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepItemProvider stepItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepAdapter() {
		if (stepItemProvider == null) {
			stepItemProvider = new StepItemProvider(this);
		}

		return stepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Environment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentItemProvider environmentItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentAdapter() {
		if (environmentItemProvider == null) {
			environmentItemProvider = new EnvironmentItemProvider(this);
		}

		return environmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.ScheduleTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTriggerItemProvider scheduleTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.ScheduleTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduleTriggerAdapter() {
		if (scheduleTriggerItemProvider == null) {
			scheduleTriggerItemProvider = new ScheduleTriggerItemProvider(this);
		}

		return scheduleTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.PushTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushTriggerItemProvider pushTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.PushTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPushTriggerAdapter() {
		if (pushTriggerItemProvider == null) {
			pushTriggerItemProvider = new PushTriggerItemProvider(this);
		}

		return pushTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Runs_On} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Runs_OnItemProvider runs_OnItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Runs_On}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuns_OnAdapter() {
		if (runs_OnItemProvider == null) {
			runs_OnItemProvider = new Runs_OnItemProvider(this);
		}

		return runs_OnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Secret} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretItemProvider secretItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecretAdapter() {
		if (secretItemProvider == null) {
			secretItemProvider = new SecretItemProvider(this);
		}

		return secretItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Need} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedItemProvider needItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNeedAdapter() {
		if (needItemProvider == null) {
			needItemProvider = new NeedItemProvider(this);
		}

		return needItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Strategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyItemProvider strategyItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Strategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStrategyAdapter() {
		if (strategyItemProvider == null) {
			strategyItemProvider = new StrategyItemProvider(this);
		}

		return strategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactItemProvider artifactItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactAdapter() {
		if (artifactItemProvider == null) {
			artifactItemProvider = new ArtifactItemProvider(this);
		}

		return artifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.MatrixConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixConfigItemProvider matrixConfigItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.MatrixConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatrixConfigAdapter() {
		if (matrixConfigItemProvider == null) {
			matrixConfigItemProvider = new MatrixConfigItemProvider(this);
		}

		return matrixConfigItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Concurrency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyItemProvider concurrencyItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Concurrency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcurrencyAdapter() {
		if (concurrencyItemProvider == null) {
			concurrencyItemProvider = new ConcurrencyItemProvider(this);
		}

		return concurrencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Credentials} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CredentialsItemProvider credentialsItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Credentials}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCredentialsAdapter() {
		if (credentialsItemProvider == null) {
			credentialsItemProvider = new CredentialsItemProvider(this);
		}

		return credentialsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.DefaultSetting} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultSettingItemProvider defaultSettingItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.DefaultSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultSettingAdapter() {
		if (defaultSettingItemProvider == null) {
			defaultSettingItemProvider = new DefaultSettingItemProvider(this);
		}

		return defaultSettingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Permission} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionItemProvider permissionItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPermissionAdapter() {
		if (permissionItemProvider == null) {
			permissionItemProvider = new PermissionItemProvider(this);
		}

		return permissionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Env} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvItemProvider envItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvAdapter() {
		if (envItemProvider == null) {
			envItemProvider = new EnvItemProvider(this);
		}

		return envItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Service} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceItemProvider serviceItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceAdapter() {
		if (serviceItemProvider == null) {
			serviceItemProvider = new ServiceItemProvider(this);
		}

		return serviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.InputParams} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputParamsItemProvider inputParamsItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.InputParams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputParamsAdapter() {
		if (inputParamsItemProvider == null) {
			inputParamsItemProvider = new InputParamsItemProvider(this);
		}

		return inputParamsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.PullTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullTriggerItemProvider pullTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.PullTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPullTriggerAdapter() {
		if (pullTriggerItemProvider == null) {
			pullTriggerItemProvider = new PullTriggerItemProvider(this);
		}

		return pullTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.StandardEventTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardEventTriggerItemProvider standardEventTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.StandardEventTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStandardEventTriggerAdapter() {
		if (standardEventTriggerItemProvider == null) {
			standardEventTriggerItemProvider = new StandardEventTriggerItemProvider(this);
		}

		return standardEventTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Docker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerItemProvider dockerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Docker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDockerAdapter() {
		if (dockerItemProvider == null) {
			dockerItemProvider = new DockerItemProvider(this);
		}

		return dockerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.WorkflowCallTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowCallTriggerItemProvider workflowCallTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.WorkflowCallTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowCallTriggerAdapter() {
		if (workflowCallTriggerItemProvider == null) {
			workflowCallTriggerItemProvider = new WorkflowCallTriggerItemProvider(this);
		}

		return workflowCallTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.WorkflowDispatchTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowDispatchTriggerItemProvider workflowDispatchTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.WorkflowDispatchTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowDispatchTriggerAdapter() {
		if (workflowDispatchTriggerItemProvider == null) {
			workflowDispatchTriggerItemProvider = new WorkflowDispatchTriggerItemProvider(this);
		}

		return workflowDispatchTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.WorkflowRunTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowRunTriggerItemProvider workflowRunTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.WorkflowRunTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowRunTriggerAdapter() {
		if (workflowRunTriggerItemProvider == null) {
			workflowRunTriggerItemProvider = new WorkflowRunTriggerItemProvider(this);
		}

		return workflowRunTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Branch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchItemProvider branchItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBranchAdapter() {
		if (branchItemProvider == null) {
			branchItemProvider = new BranchItemProvider(this);
		}

		return branchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Tag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagItemProvider tagItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTagAdapter() {
		if (tagItemProvider == null) {
			tagItemProvider = new TagItemProvider(this);
		}

		return tagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.Path} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathItemProvider pathItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.Path}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathAdapter() {
		if (pathItemProvider == null) {
			pathItemProvider = new PathItemProvider(this);
		}

		return pathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.PullTargetTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullTargetTriggerItemProvider pullTargetTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.PullTargetTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPullTargetTriggerAdapter() {
		if (pullTargetTriggerItemProvider == null) {
			pullTargetTriggerItemProvider = new PullTargetTriggerItemProvider(this);
		}

		return pullTargetTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.RestoreCache} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestoreCacheItemProvider restoreCacheItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.RestoreCache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRestoreCacheAdapter() {
		if (restoreCacheItemProvider == null) {
			restoreCacheItemProvider = new RestoreCacheItemProvider(this);
		}

		return restoreCacheItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.SaveCache} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaveCacheItemProvider saveCacheItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.SaveCache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSaveCacheAdapter() {
		if (saveCacheItemProvider == null) {
			saveCacheItemProvider = new SaveCacheItemProvider(this);
		}

		return saveCacheItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gHA_metamodel.InputPair} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPairItemProvider inputPairItemProvider;

	/**
	 * This creates an adapter for a {@link gHA_metamodel.InputPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputPairAdapter() {
		if (inputPairItemProvider == null) {
			inputPairItemProvider = new InputPairItemProvider(this);
		}

		return inputPairItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (pipelineItemProvider != null)
			pipelineItemProvider.dispose();
		if (jobItemProvider != null)
			jobItemProvider.dispose();
		if (stepItemProvider != null)
			stepItemProvider.dispose();
		if (commandItemProvider != null)
			commandItemProvider.dispose();
		if (parameterItemProvider != null)
			parameterItemProvider.dispose();
		if (environmentItemProvider != null)
			environmentItemProvider.dispose();
		if (actionItemProvider != null)
			actionItemProvider.dispose();
		if (scheduleTriggerItemProvider != null)
			scheduleTriggerItemProvider.dispose();
		if (pushTriggerItemProvider != null)
			pushTriggerItemProvider.dispose();
		if (runs_OnItemProvider != null)
			runs_OnItemProvider.dispose();
		if (secretItemProvider != null)
			secretItemProvider.dispose();
		if (needItemProvider != null)
			needItemProvider.dispose();
		if (strategyItemProvider != null)
			strategyItemProvider.dispose();
		if (artifactItemProvider != null)
			artifactItemProvider.dispose();
		if (ifItemProvider != null)
			ifItemProvider.dispose();
		if (matrixConfigItemProvider != null)
			matrixConfigItemProvider.dispose();
		if (concurrencyItemProvider != null)
			concurrencyItemProvider.dispose();
		if (credentialsItemProvider != null)
			credentialsItemProvider.dispose();
		if (defaultSettingItemProvider != null)
			defaultSettingItemProvider.dispose();
		if (permissionItemProvider != null)
			permissionItemProvider.dispose();
		if (outputItemProvider != null)
			outputItemProvider.dispose();
		if (envItemProvider != null)
			envItemProvider.dispose();
		if (serviceItemProvider != null)
			serviceItemProvider.dispose();
		if (inputParamsItemProvider != null)
			inputParamsItemProvider.dispose();
		if (pullTriggerItemProvider != null)
			pullTriggerItemProvider.dispose();
		if (standardEventTriggerItemProvider != null)
			standardEventTriggerItemProvider.dispose();
		if (dockerItemProvider != null)
			dockerItemProvider.dispose();
		if (workflowCallTriggerItemProvider != null)
			workflowCallTriggerItemProvider.dispose();
		if (inputItemProvider != null)
			inputItemProvider.dispose();
		if (containerItemProvider != null)
			containerItemProvider.dispose();
		if (workflowDispatchTriggerItemProvider != null)
			workflowDispatchTriggerItemProvider.dispose();
		if (workflowRunTriggerItemProvider != null)
			workflowRunTriggerItemProvider.dispose();
		if (branchItemProvider != null)
			branchItemProvider.dispose();
		if (tagItemProvider != null)
			tagItemProvider.dispose();
		if (pathItemProvider != null)
			pathItemProvider.dispose();
		if (pullTargetTriggerItemProvider != null)
			pullTargetTriggerItemProvider.dispose();
		if (restoreCacheItemProvider != null)
			restoreCacheItemProvider.dispose();
		if (saveCacheItemProvider != null)
			saveCacheItemProvider.dispose();
		if (inputPairItemProvider != null)
			inputPairItemProvider.dispose();
	}

}