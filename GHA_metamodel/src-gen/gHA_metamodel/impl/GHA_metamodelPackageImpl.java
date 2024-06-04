/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Action;
import gHA_metamodel.Artifact;
import gHA_metamodel.Branch;
import gHA_metamodel.Cache;
import gHA_metamodel.Command;
import gHA_metamodel.Concurrency;
import gHA_metamodel.Credentials;
import gHA_metamodel.DefaultSetting;
import gHA_metamodel.Docker;
import gHA_metamodel.Env;
import gHA_metamodel.Environment;
import gHA_metamodel.EventTrigger;
import gHA_metamodel.GHA_metamodelFactory;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.If;
import gHA_metamodel.Input;
import gHA_metamodel.InputPair;
import gHA_metamodel.InputParams;
import gHA_metamodel.InputTrigger;
import gHA_metamodel.Job;
import gHA_metamodel.MatrixConfig;
import gHA_metamodel.Need;
import gHA_metamodel.Output;
import gHA_metamodel.Parameter;
import gHA_metamodel.Path;
import gHA_metamodel.Permission;
import gHA_metamodel.Pipeline;
import gHA_metamodel.PullTargetTrigger;
import gHA_metamodel.PullTrigger;
import gHA_metamodel.PushTrigger;
import gHA_metamodel.RestoreCache;
import gHA_metamodel.Runs_On;
import gHA_metamodel.SaveCache;
import gHA_metamodel.ScheduleTrigger;
import gHA_metamodel.Secret;
import gHA_metamodel.Service;
import gHA_metamodel.StandardEventTrigger;
import gHA_metamodel.Step;
import gHA_metamodel.Strategy;
import gHA_metamodel.Tag;
import gHA_metamodel.Trigger;
import gHA_metamodel.WorkflowCallTrigger;
import gHA_metamodel.WorkflowDispatchTrigger;
import gHA_metamodel.WorkflowRunTrigger;

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
public class GHA_metamodelPackageImpl extends EPackageImpl implements GHA_metamodelPackage {
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
	private EClass jobEClass = null;

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
	private EClass stepEClass = null;

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
	private EClass parameterEClass = null;

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
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runs_OnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass needEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pullTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEventTriggerEClass = null;

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
	private EClass inputTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowCallTriggerEClass = null;

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
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowDispatchTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunTriggerEClass = null;

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
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pullTargetTriggerEClass = null;

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
	private EClass saveCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webhooK_ACTIVITY_TYPESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissioN_SCOPESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inpuT_TYPESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifacT_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matriX_CONFIG_TYPEEEnum = null;

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
	 * @see gHA_metamodel.GHA_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GHA_metamodelPackageImpl() {
		super(eNS_URI, GHA_metamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GHA_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GHA_metamodelPackage init() {
		if (isInited)
			return (GHA_metamodelPackage) EPackage.Registry.INSTANCE.getEPackage(GHA_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGHA_metamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GHA_metamodelPackageImpl theGHA_metamodelPackage = registeredGHA_metamodelPackage instanceof GHA_metamodelPackageImpl
				? (GHA_metamodelPackageImpl) registeredGHA_metamodelPackage
				: new GHA_metamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGHA_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theGHA_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGHA_metamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GHA_metamodelPackage.eNS_URI, theGHA_metamodelPackage);
		return theGHA_metamodelPackage;
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
	public EReference getPipeline_Triggers() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Jobs() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Name() {
		return (EAttribute) pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Run_name() {
		return (EAttribute) pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Permissions() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Concurrency() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Envs() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Defaultsetting() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(7);
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
	public EReference getJob_Steps() {
		return (EReference) jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Name() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_If() {
		return (EReference) jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Strategy() {
		return (EReference) jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Concurrency() {
		return (EReference) jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Environment() {
		return (EReference) jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Defaultsetting() {
		return (EReference) jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Permissions() {
		return (EReference) jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Envs() {
		return (EReference) jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Need() {
		return (EReference) jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Outputs() {
		return (EReference) jobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Timeout_minutes() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Continue_on_error() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Services() {
		return (EReference) jobEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Actions() {
		return (EReference) jobEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Secrets() {
		return (EReference) jobEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Runner() {
		return (EReference) jobEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Container() {
		return (EReference) jobEClass.getEStructuralFeatures().get(17);
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
	public EReference getStep_Parameters() {
		return (EReference) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Actions() {
		return (EReference) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Envs() {
		return (EReference) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_If() {
		return (EReference) stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Working_directory() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Shell() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Continue_on_error() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Timeout_minutes() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(9);
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
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Parameter() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getEnvironment_Name() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Url() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Uses() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Composite_action() {
		return (EReference) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_With() {
		return (EReference) actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_With_inputPair() {
		return (EReference) actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventTrigger() {
		return eventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventTrigger_ActivityType() {
		return (EAttribute) eventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduleTrigger() {
		return scheduleTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduleTrigger_Cron() {
		return (EAttribute) scheduleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPushTrigger() {
		return pushTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushTrigger_Branches() {
		return (EReference) pushTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushTrigger_Tags() {
		return (EReference) pushTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushTrigger_Paths() {
		return (EReference) pushTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuns_On() {
		return runs_OnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuns_On_Labels() {
		return (EAttribute) runs_OnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuns_On_Group() {
		return (EAttribute) runs_OnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecret() {
		return secretEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Key() {
		return (EAttribute) secretEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Value() {
		return (EAttribute) secretEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Required() {
		return (EAttribute) secretEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Name() {
		return (EAttribute) secretEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeed() {
		return needEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeed_Jobs() {
		return (EAttribute) needEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrategy_Fail_fast() {
		return (EAttribute) strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrategy_Max_parallel() {
		return (EAttribute) strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrategy_Configs() {
		return (EReference) strategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Name() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Paths() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Retention_days() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Type() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIf_Condition() {
		return (EAttribute) ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrixConfig() {
		return matrixConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrixConfig_Key() {
		return (EAttribute) matrixConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrixConfig_Values() {
		return (EAttribute) matrixConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrixConfig_Type() {
		return (EAttribute) matrixConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrency() {
		return concurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrency_Group() {
		return (EAttribute) concurrencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrency_Cancel_in_progress() {
		return (EAttribute) concurrencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCredentials() {
		return credentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCredentials_Username() {
		return (EAttribute) credentialsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCredentials_Password() {
		return (EAttribute) credentialsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultSetting() {
		return defaultSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultSetting_Shell() {
		return (EAttribute) defaultSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultSetting_WorkingDirectory() {
		return (EAttribute) defaultSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Permission() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Scope() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_ReadAll() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_WriteAll() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_DisableAll() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Name() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Value() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Description() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnv() {
		return envEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnv_Key() {
		return (EAttribute) envEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnv_Value() {
		return (EAttribute) envEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Name() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Container() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputParams() {
		return inputParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputParams_Key() {
		return (EAttribute) inputParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputParams_Value() {
		return (EAttribute) inputParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCache_Key() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCache_Paths() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPullTrigger() {
		return pullTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPullTrigger_Branches() {
		return (EReference) pullTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPullTrigger_Paths() {
		return (EReference) pullTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardEventTrigger() {
		return standardEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardEventTrigger_Event() {
		return (EAttribute) standardEventTriggerEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDocker_Image() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Pre_entrypoint() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocker_Envs() {
		return (EReference) dockerEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDocker_Post_entrypoint() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Args() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputTrigger() {
		return inputTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputTrigger_Inputs() {
		return (EReference) inputTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowCallTrigger() {
		return workflowCallTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowCallTrigger_Outputs() {
		return (EReference) workflowCallTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowCallTrigger_Secrets() {
		return (EReference) workflowCallTriggerEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getInput_Type() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_IsRequired() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Options() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Name() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Description() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Default() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Image() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Ports() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Volumes() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Options() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Credential() {
		return (EReference) containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Envs() {
		return (EReference) containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowDispatchTrigger() {
		return workflowDispatchTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowRunTrigger() {
		return workflowRunTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowRunTrigger_Workflow() {
		return (EAttribute) workflowRunTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowRunTrigger_Type() {
		return (EAttribute) workflowRunTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowRunTrigger_Branches() {
		return (EReference) workflowRunTriggerEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getBranch_Ignore() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTag_Name() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Ignore() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_Name() {
		return (EAttribute) pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_Ignore() {
		return (EAttribute) pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPullTargetTrigger() {
		return pullTargetTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPullTargetTrigger_Branches() {
		return (EReference) pullTargetTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPullTargetTrigger_Paths() {
		return (EReference) pullTargetTriggerEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRestoreCache_Restore_keys() {
		return (EAttribute) restoreCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestoreCache_Lookup_only() {
		return (EAttribute) restoreCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestoreCache_Fail_on_cache_miss() {
		return (EAttribute) restoreCacheEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSaveCache_Upload_chunk_size() {
		return (EAttribute) saveCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPair() {
		return inputPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputPair_Args() {
		return (EAttribute) inputPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputPair_Entrypoint() {
		return (EAttribute) inputPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEVENTS() {
		return eventsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWEBHOOK_ACTIVITY_TYPES() {
		return webhooK_ACTIVITY_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPERMISSIONS() {
		return permissionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPERMISSION_SCOPES() {
		return permissioN_SCOPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getINPUT_TYPES() {
		return inpuT_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getARTIFACT_TYPE() {
		return artifacT_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMATRIX_CONFIG_TYPE() {
		return matriX_CONFIG_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GHA_metamodelFactory getGHA_metamodelFactory() {
		return (GHA_metamodelFactory) getEFactoryInstance();
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
		pipelineEClass = createEClass(PIPELINE);
		createEReference(pipelineEClass, PIPELINE__TRIGGERS);
		createEReference(pipelineEClass, PIPELINE__JOBS);
		createEAttribute(pipelineEClass, PIPELINE__NAME);
		createEAttribute(pipelineEClass, PIPELINE__RUN_NAME);
		createEReference(pipelineEClass, PIPELINE__PERMISSIONS);
		createEReference(pipelineEClass, PIPELINE__CONCURRENCY);
		createEReference(pipelineEClass, PIPELINE__ENVS);
		createEReference(pipelineEClass, PIPELINE__DEFAULTSETTING);

		jobEClass = createEClass(JOB);
		createEReference(jobEClass, JOB__STEPS);
		createEAttribute(jobEClass, JOB__NAME);
		createEReference(jobEClass, JOB__IF);
		createEReference(jobEClass, JOB__STRATEGY);
		createEReference(jobEClass, JOB__CONCURRENCY);
		createEReference(jobEClass, JOB__ENVIRONMENT);
		createEReference(jobEClass, JOB__DEFAULTSETTING);
		createEReference(jobEClass, JOB__PERMISSIONS);
		createEReference(jobEClass, JOB__ENVS);
		createEReference(jobEClass, JOB__NEED);
		createEReference(jobEClass, JOB__OUTPUTS);
		createEAttribute(jobEClass, JOB__TIMEOUT_MINUTES);
		createEAttribute(jobEClass, JOB__CONTINUE_ON_ERROR);
		createEReference(jobEClass, JOB__SERVICES);
		createEReference(jobEClass, JOB__ACTIONS);
		createEReference(jobEClass, JOB__SECRETS);
		createEReference(jobEClass, JOB__RUNNER);
		createEReference(jobEClass, JOB__CONTAINER);

		triggerEClass = createEClass(TRIGGER);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__COMMANDS);
		createEReference(stepEClass, STEP__PARAMETERS);
		createEReference(stepEClass, STEP__ACTIONS);
		createEReference(stepEClass, STEP__ENVS);
		createEReference(stepEClass, STEP__IF);
		createEAttribute(stepEClass, STEP__NAME);
		createEAttribute(stepEClass, STEP__WORKING_DIRECTORY);
		createEAttribute(stepEClass, STEP__SHELL);
		createEAttribute(stepEClass, STEP__CONTINUE_ON_ERROR);
		createEAttribute(stepEClass, STEP__TIMEOUT_MINUTES);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__NAME);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__NAME);
		createEAttribute(environmentEClass, ENVIRONMENT__URL);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__USES);
		createEReference(actionEClass, ACTION__COMPOSITE_ACTION);
		createEReference(actionEClass, ACTION__WITH);
		createEReference(actionEClass, ACTION__WITH_INPUT_PAIR);

		eventTriggerEClass = createEClass(EVENT_TRIGGER);
		createEAttribute(eventTriggerEClass, EVENT_TRIGGER__ACTIVITY_TYPE);

		scheduleTriggerEClass = createEClass(SCHEDULE_TRIGGER);
		createEAttribute(scheduleTriggerEClass, SCHEDULE_TRIGGER__CRON);

		pushTriggerEClass = createEClass(PUSH_TRIGGER);
		createEReference(pushTriggerEClass, PUSH_TRIGGER__BRANCHES);
		createEReference(pushTriggerEClass, PUSH_TRIGGER__TAGS);
		createEReference(pushTriggerEClass, PUSH_TRIGGER__PATHS);

		runs_OnEClass = createEClass(RUNS_ON);
		createEAttribute(runs_OnEClass, RUNS_ON__LABELS);
		createEAttribute(runs_OnEClass, RUNS_ON__GROUP);

		secretEClass = createEClass(SECRET);
		createEAttribute(secretEClass, SECRET__KEY);
		createEAttribute(secretEClass, SECRET__VALUE);
		createEAttribute(secretEClass, SECRET__REQUIRED);
		createEAttribute(secretEClass, SECRET__NAME);

		needEClass = createEClass(NEED);
		createEAttribute(needEClass, NEED__JOBS);

		strategyEClass = createEClass(STRATEGY);
		createEAttribute(strategyEClass, STRATEGY__FAIL_FAST);
		createEAttribute(strategyEClass, STRATEGY__MAX_PARALLEL);
		createEReference(strategyEClass, STRATEGY__CONFIGS);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEAttribute(artifactEClass, ARTIFACT__PATHS);
		createEAttribute(artifactEClass, ARTIFACT__RETENTION_DAYS);
		createEAttribute(artifactEClass, ARTIFACT__TYPE);

		ifEClass = createEClass(IF);
		createEAttribute(ifEClass, IF__CONDITION);

		matrixConfigEClass = createEClass(MATRIX_CONFIG);
		createEAttribute(matrixConfigEClass, MATRIX_CONFIG__KEY);
		createEAttribute(matrixConfigEClass, MATRIX_CONFIG__VALUES);
		createEAttribute(matrixConfigEClass, MATRIX_CONFIG__TYPE);

		concurrencyEClass = createEClass(CONCURRENCY);
		createEAttribute(concurrencyEClass, CONCURRENCY__GROUP);
		createEAttribute(concurrencyEClass, CONCURRENCY__CANCEL_IN_PROGRESS);

		credentialsEClass = createEClass(CREDENTIALS);
		createEAttribute(credentialsEClass, CREDENTIALS__USERNAME);
		createEAttribute(credentialsEClass, CREDENTIALS__PASSWORD);

		defaultSettingEClass = createEClass(DEFAULT_SETTING);
		createEAttribute(defaultSettingEClass, DEFAULT_SETTING__SHELL);
		createEAttribute(defaultSettingEClass, DEFAULT_SETTING__WORKING_DIRECTORY);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__SCOPE);
		createEAttribute(permissionEClass, PERMISSION__READ_ALL);
		createEAttribute(permissionEClass, PERMISSION__WRITE_ALL);
		createEAttribute(permissionEClass, PERMISSION__DISABLE_ALL);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__NAME);
		createEAttribute(outputEClass, OUTPUT__VALUE);
		createEAttribute(outputEClass, OUTPUT__DESCRIPTION);

		envEClass = createEClass(ENV);
		createEAttribute(envEClass, ENV__KEY);
		createEAttribute(envEClass, ENV__VALUE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__CONTAINER);

		inputParamsEClass = createEClass(INPUT_PARAMS);
		createEAttribute(inputParamsEClass, INPUT_PARAMS__KEY);
		createEAttribute(inputParamsEClass, INPUT_PARAMS__VALUE);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__KEY);
		createEAttribute(cacheEClass, CACHE__PATHS);

		pullTriggerEClass = createEClass(PULL_TRIGGER);
		createEReference(pullTriggerEClass, PULL_TRIGGER__BRANCHES);
		createEReference(pullTriggerEClass, PULL_TRIGGER__PATHS);

		standardEventTriggerEClass = createEClass(STANDARD_EVENT_TRIGGER);
		createEAttribute(standardEventTriggerEClass, STANDARD_EVENT_TRIGGER__EVENT);

		dockerEClass = createEClass(DOCKER);
		createEAttribute(dockerEClass, DOCKER__IMAGE);
		createEAttribute(dockerEClass, DOCKER__PRE_ENTRYPOINT);
		createEReference(dockerEClass, DOCKER__ENVS);
		createEAttribute(dockerEClass, DOCKER__ENTRYPOINT);
		createEAttribute(dockerEClass, DOCKER__POST_ENTRYPOINT);
		createEAttribute(dockerEClass, DOCKER__ARGS);

		inputTriggerEClass = createEClass(INPUT_TRIGGER);
		createEReference(inputTriggerEClass, INPUT_TRIGGER__INPUTS);

		workflowCallTriggerEClass = createEClass(WORKFLOW_CALL_TRIGGER);
		createEReference(workflowCallTriggerEClass, WORKFLOW_CALL_TRIGGER__OUTPUTS);
		createEReference(workflowCallTriggerEClass, WORKFLOW_CALL_TRIGGER__SECRETS);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__TYPE);
		createEAttribute(inputEClass, INPUT__IS_REQUIRED);
		createEAttribute(inputEClass, INPUT__OPTIONS);
		createEAttribute(inputEClass, INPUT__NAME);
		createEAttribute(inputEClass, INPUT__DESCRIPTION);
		createEAttribute(inputEClass, INPUT__DEFAULT);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__IMAGE);
		createEAttribute(containerEClass, CONTAINER__PORTS);
		createEAttribute(containerEClass, CONTAINER__VOLUMES);
		createEAttribute(containerEClass, CONTAINER__OPTIONS);
		createEReference(containerEClass, CONTAINER__CREDENTIAL);
		createEReference(containerEClass, CONTAINER__ENVS);

		workflowDispatchTriggerEClass = createEClass(WORKFLOW_DISPATCH_TRIGGER);

		workflowRunTriggerEClass = createEClass(WORKFLOW_RUN_TRIGGER);
		createEAttribute(workflowRunTriggerEClass, WORKFLOW_RUN_TRIGGER__WORKFLOW);
		createEAttribute(workflowRunTriggerEClass, WORKFLOW_RUN_TRIGGER__TYPE);
		createEReference(workflowRunTriggerEClass, WORKFLOW_RUN_TRIGGER__BRANCHES);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__NAME);
		createEAttribute(branchEClass, BRANCH__IGNORE);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__IGNORE);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__NAME);
		createEAttribute(pathEClass, PATH__IGNORE);

		pullTargetTriggerEClass = createEClass(PULL_TARGET_TRIGGER);
		createEReference(pullTargetTriggerEClass, PULL_TARGET_TRIGGER__BRANCHES);
		createEReference(pullTargetTriggerEClass, PULL_TARGET_TRIGGER__PATHS);

		restoreCacheEClass = createEClass(RESTORE_CACHE);
		createEAttribute(restoreCacheEClass, RESTORE_CACHE__RESTORE_KEYS);
		createEAttribute(restoreCacheEClass, RESTORE_CACHE__LOOKUP_ONLY);
		createEAttribute(restoreCacheEClass, RESTORE_CACHE__FAIL_ON_CACHE_MISS);

		saveCacheEClass = createEClass(SAVE_CACHE);
		createEAttribute(saveCacheEClass, SAVE_CACHE__UPLOAD_CHUNK_SIZE);

		inputPairEClass = createEClass(INPUT_PAIR);
		createEAttribute(inputPairEClass, INPUT_PAIR__ARGS);
		createEAttribute(inputPairEClass, INPUT_PAIR__ENTRYPOINT);

		// Create enums
		eventsEEnum = createEEnum(EVENTS);
		webhooK_ACTIVITY_TYPESEEnum = createEEnum(WEBHOOK_ACTIVITY_TYPES);
		permissionsEEnum = createEEnum(PERMISSIONS);
		permissioN_SCOPESEEnum = createEEnum(PERMISSION_SCOPES);
		inpuT_TYPESEEnum = createEEnum(INPUT_TYPES);
		artifacT_TYPEEEnum = createEEnum(ARTIFACT_TYPE);
		matriX_CONFIG_TYPEEEnum = createEEnum(MATRIX_CONFIG_TYPE);
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
		eventTriggerEClass.getESuperTypes().add(this.getTrigger());
		scheduleTriggerEClass.getESuperTypes().add(this.getTrigger());
		pushTriggerEClass.getESuperTypes().add(this.getTrigger());
		artifactEClass.getESuperTypes().add(this.getAction());
		cacheEClass.getESuperTypes().add(this.getAction());
		pullTriggerEClass.getESuperTypes().add(this.getEventTrigger());
		standardEventTriggerEClass.getESuperTypes().add(this.getEventTrigger());
		dockerEClass.getESuperTypes().add(this.getAction());
		inputTriggerEClass.getESuperTypes().add(this.getTrigger());
		workflowCallTriggerEClass.getESuperTypes().add(this.getInputTrigger());
		workflowDispatchTriggerEClass.getESuperTypes().add(this.getInputTrigger());
		workflowRunTriggerEClass.getESuperTypes().add(this.getTrigger());
		pullTargetTriggerEClass.getESuperTypes().add(this.getEventTrigger());
		restoreCacheEClass.getESuperTypes().add(this.getCache());
		saveCacheEClass.getESuperTypes().add(this.getCache());

		// Initialize classes, features, and operations; add parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Jobs(), this.getJob(), null, "jobs", null, 1, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPipeline_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_Run_name(), ecorePackage.getEString(), "run_name", null, 0, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Permissions(), this.getPermission(), null, "permissions", null, 0, -1,
				Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Concurrency(), this.getConcurrency(), null, "concurrency", null, 0, 1,
				Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Envs(), this.getEnv(), null, "envs", null, 0, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPipeline_Defaultsetting(), this.getDefaultSetting(), null, "defaultsetting", null, 0, 1,
				Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJob_Steps(), this.getStep(), null, "steps", null, 1, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "name", null, 1, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_If(), this.getIf(), null, "if", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Strategy(), this.getStrategy(), null, "strategy", null, 0, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Concurrency(), this.getConcurrency(), null, "concurrency", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Defaultsetting(), this.getDefaultSetting(), null, "defaultsetting", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Envs(), this.getEnv(), null, "envs", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Need(), this.getNeed(), null, "need", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getJob_Timeout_minutes(), ecorePackage.getEInt(), "timeout_minutes", "360", 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Continue_on_error(), ecorePackage.getEString(), "continue_on_error", null, 0, 1,
				Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Services(), this.getService(), null, "services", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Actions(), this.getAction(), null, "actions", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Secrets(), this.getSecret(), null, "secrets", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Runner(), this.getRuns_On(), null, "runner", null, 0, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Container(), this.getContainer(), null, "container", null, 0, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Commands(), this.getCommand(), null, "commands", null, 1, -1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStep_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Actions(), this.getAction(), null, "actions", null, 0, -1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStep_Envs(), this.getEnv(), null, "envs", null, 0, -1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStep_If(), this.getIf(), null, "if", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Working_directory(), ecorePackage.getEString(), "working_directory", null, 0, 1,
				Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStep_Shell(), ecorePackage.getEString(), "shell", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Continue_on_error(), ecorePackage.getEBoolean(), "continue_on_error", null, 0, 1,
				Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStep_Timeout_minutes(), ecorePackage.getEShort(), "timeout_minutes", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Url(), ecorePackage.getEString(), "url", null, 0, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Uses(), ecorePackage.getEString(), "uses", null, 1, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Composite_action(), this.getStep(), null, "composite_action", null, 0, -1,
				Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_With(), this.getInputParams(), null, "with", null, 0, -1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAction_With_inputPair(), this.getInputPair(), null, "with_inputPair", null, 0, 1,
				Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTriggerEClass, EventTrigger.class, "EventTrigger", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventTrigger_ActivityType(), this.getWEBHOOK_ACTIVITY_TYPES(), "activityType", null, 0, -1,
				EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(scheduleTriggerEClass, ScheduleTrigger.class, "ScheduleTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduleTrigger_Cron(), ecorePackage.getEString(), "cron", null, 1, 1, ScheduleTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushTriggerEClass, PushTrigger.class, "PushTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPushTrigger_Branches(), this.getBranch(), null, "branches", null, 0, -1, PushTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushTrigger_Tags(), this.getTag(), null, "tags", null, 0, -1, PushTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushTrigger_Paths(), this.getPath(), null, "paths", null, 0, -1, PushTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runs_OnEClass, Runs_On.class, "Runs_On", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuns_On_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, Runs_On.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuns_On_Group(), ecorePackage.getEString(), "group", null, 0, 1, Runs_On.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretEClass, Secret.class, "Secret", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecret_Key(), ecorePackage.getEString(), "key", null, 1, 1, Secret.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecret_Value(), ecorePackage.getEString(), "value", null, 1, 1, Secret.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecret_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Secret.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecret_Name(), ecorePackage.getEString(), "name", null, 1, 1, Secret.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(needEClass, Need.class, "Need", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeed_Jobs(), ecorePackage.getEString(), "jobs", null, 1, -1, Need.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategy_Fail_fast(), ecorePackage.getEBoolean(), "fail_fast", null, 0, 1, Strategy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_Max_parallel(), ecorePackage.getEShort(), "max_parallel", null, 0, 1, Strategy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategy_Configs(), this.getMatrixConfig(), null, "configs", null, 0, -1, Strategy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Paths(), ecorePackage.getEString(), "paths", null, 1, -1, Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Retention_days(), ecorePackage.getEString(), "retention_days", null, 0, 1,
				Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Type(), this.getARTIFACT_TYPE(), "type", null, 0, 1, Artifact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIf_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixConfigEClass, MatrixConfig.class, "MatrixConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrixConfig_Key(), ecorePackage.getEString(), "key", null, 1, 1, MatrixConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrixConfig_Values(), ecorePackage.getEString(), "values", null, 1, -1, MatrixConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrixConfig_Type(), this.getMATRIX_CONFIG_TYPE(), "type", null, 0, 1, MatrixConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concurrencyEClass, Concurrency.class, "Concurrency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcurrency_Group(), ecorePackage.getEString(), "group", null, 1, 1, Concurrency.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcurrency_Cancel_in_progress(), ecorePackage.getEBoolean(), "cancel_in_progress", null, 1,
				1, Concurrency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(credentialsEClass, Credentials.class, "Credentials", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCredentials_Username(), ecorePackage.getEString(), "username", null, 1, 1, Credentials.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredentials_Password(), ecorePackage.getEString(), "password", null, 1, 1, Credentials.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultSettingEClass, DefaultSetting.class, "DefaultSetting", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultSetting_Shell(), ecorePackage.getEString(), "shell", null, 1, 1, DefaultSetting.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultSetting_WorkingDirectory(), ecorePackage.getEString(), "workingDirectory", null, 1, 1,
				DefaultSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Permission(), this.getPERMISSIONS(), "permission", null, 1, 1, Permission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Scope(), this.getPERMISSION_SCOPES(), "scope", null, 1, 1, Permission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_ReadAll(), ecorePackage.getEBoolean(), "readAll", null, 1, 1, Permission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_WriteAll(), ecorePackage.getEBoolean(), "writeAll", null, 1, 1, Permission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_DisableAll(), ecorePackage.getEBoolean(), "disableAll", null, 1, 1,
				Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Name(), ecorePackage.getEString(), "name", null, 1, 1, Output.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Value(), ecorePackage.getEString(), "value", null, 1, 1, Output.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Description(), ecorePackage.getEString(), "description", null, 0, 1, Output.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envEClass, Env.class, "Env", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnv_Key(), ecorePackage.getEString(), "key", null, 1, 1, Env.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnv_Value(), ecorePackage.getEString(), "value", null, 1, 1, Env.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Container(), this.getContainer(), null, "container", null, 1, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParamsEClass, InputParams.class, "InputParams", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputParams_Key(), ecorePackage.getEString(), "key", null, 1, 1, InputParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputParams_Value(), ecorePackage.getEString(), "value", null, 1, 1, InputParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_Key(), ecorePackage.getEString(), "key", null, 1, 1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Paths(), ecorePackage.getEString(), "paths", null, 1, -1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pullTriggerEClass, PullTrigger.class, "PullTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPullTrigger_Branches(), this.getBranch(), null, "branches", null, 0, -1, PullTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPullTrigger_Paths(), this.getPath(), null, "paths", null, 0, -1, PullTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardEventTriggerEClass, StandardEventTrigger.class, "StandardEventTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardEventTrigger_Event(), this.getEVENTS(), "event", null, 1, 1,
				StandardEventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerEClass, Docker.class, "Docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocker_Image(), ecorePackage.getEString(), "image", null, 1, 1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Pre_entrypoint(), ecorePackage.getEString(), "pre_entrypoint", null, 0, 1,
				Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDocker_Envs(), this.getEnv(), null, "envs", null, 0, -1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDocker_Entrypoint(), ecorePackage.getEString(), "entrypoint", null, 0, 1, Docker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Post_entrypoint(), ecorePackage.getEString(), "post_entrypoint", null, 0, 1,
				Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocker_Args(), ecorePackage.getEString(), "args", null, 0, -1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputTriggerEClass, InputTrigger.class, "InputTrigger", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputTrigger_Inputs(), this.getInput(), null, "inputs", null, 0, -1, InputTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowCallTriggerEClass, WorkflowCallTrigger.class, "WorkflowCallTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowCallTrigger_Outputs(), this.getOutput(), null, "outputs", null, 0, -1,
				WorkflowCallTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowCallTrigger_Secrets(), this.getSecret(), null, "secrets", null, 0, -1,
				WorkflowCallTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Type(), this.getINPUT_TYPES(), "type", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Options(), ecorePackage.getEString(), "options", null, 0, -1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 1, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Description(), ecorePackage.getEString(), "description", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Default(), ecorePackage.getEString(), "default", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, gHA_metamodel.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Image(), ecorePackage.getEString(), "image", null, 1, 1,
				gHA_metamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Ports(), ecorePackage.getEString(), "ports", null, 0, -1,
				gHA_metamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Volumes(), ecorePackage.getEString(), "volumes", null, 0, -1,
				gHA_metamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Options(), ecorePackage.getEString(), "options", null, 0, 1,
				gHA_metamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Credential(), this.getCredentials(), null, "credential", null, 0, 1,
				gHA_metamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Envs(), this.getEnv(), null, "envs", null, 0, -1, gHA_metamodel.Container.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowDispatchTriggerEClass, WorkflowDispatchTrigger.class, "WorkflowDispatchTrigger",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowRunTriggerEClass, WorkflowRunTrigger.class, "WorkflowRunTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowRunTrigger_Workflow(), ecorePackage.getEString(), "workflow", null, 1, 1,
				WorkflowRunTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowRunTrigger_Type(), ecorePackage.getEString(), "type", null, 1, 1,
				WorkflowRunTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowRunTrigger_Branches(), this.getBranch(), null, "branches", null, 0, -1,
				WorkflowRunTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_Name(), ecorePackage.getEString(), "name", null, 1, 1, Branch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Ignore(), ecorePackage.getEBoolean(), "ignore", "false", 1, 1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Ignore(), ecorePackage.getEBoolean(), "ignore", "false", 1, 1, Tag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_Name(), ecorePackage.getEString(), "name", null, 1, 1, Path.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Ignore(), ecorePackage.getEBoolean(), "ignore", "false", 1, 1, Path.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pullTargetTriggerEClass, PullTargetTrigger.class, "PullTargetTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPullTargetTrigger_Branches(), this.getBranch(), null, "branches", null, 0, -1,
				PullTargetTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPullTargetTrigger_Paths(), this.getPath(), null, "paths", null, 0, -1,
				PullTargetTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restoreCacheEClass, RestoreCache.class, "RestoreCache", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestoreCache_Restore_keys(), ecorePackage.getEString(), "restore_keys", null, 0, -1,
				RestoreCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestoreCache_Lookup_only(), ecorePackage.getEBoolean(), "lookup_only", "false", 0, 1,
				RestoreCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestoreCache_Fail_on_cache_miss(), ecorePackage.getEBoolean(), "fail_on_cache_miss", "false",
				0, 1, RestoreCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(saveCacheEClass, SaveCache.class, "SaveCache", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaveCache_Upload_chunk_size(), ecorePackage.getEString(), "upload_chunk_size", null, 0, 1,
				SaveCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(inputPairEClass, InputPair.class, "InputPair", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPair_Args(), ecorePackage.getEString(), "args", null, 0, 1, InputPair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputPair_Entrypoint(), ecorePackage.getEString(), "entrypoint", null, 0, 1, InputPair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventsEEnum, gHA_metamodel.EVENTS.class, "EVENTS");
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.BRANCH_PROTECTION_RULE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.CHECK_RUN);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.CHECK_SUITE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.CREATE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DELETE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DEPLOYMENT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DEPLOYMENT_STATUS);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DISCUSSION);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DISCUSSION_COMMENT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.FORK);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.GOLLUM);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.ISSUE_COMMENT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.ISSUES);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.LABEL);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.MERGE_GROUP);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.MILESTONE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PAGE_BUILD);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PROJECT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PROJECT_CARD);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PROJECT_COLUMN);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PUBLIC);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PULL_REQUEST_REVIEW);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PULL_REQUEST_REVIEW_COMMENT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.REGISTRY_PACKAGE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.RELEASE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.REPOSITORY_DISPATCH);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.STATUS);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.WATCH);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.BRANCH_PROTECTION_CONFIGURATION);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.CODE_SCANNING_ALERT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.COMMIT_COMMENT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.CUSTOM_PROPERTY);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.CUSTOM_PROPERTY_VALUES);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DEPENDABOT_ALERT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DEPLOY_KEY);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DEPLOYMENT_PROTECTION_RULE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.DEPLOYMENT_REVIEW);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.GITHUB_APP_AUTHORIZATION);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.INSTALLATION);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.INSTALLATION_REPOSITORIES);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.INSTALLATION_TARGET);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.MARKETPLACE_PURCHASE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.MEMBER);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.MEMBERSHIP);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.META);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.ORG_BLOCK);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.ORGANIZATION);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PACKAGE);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PERSONAL_ACCESS_TOKEN_REQUEST);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PING);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PROJECTS_V2);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PROJECTS_V2_ITEM);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PULL_REQUEST);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PULL_REQUEST_REVIEW_THREAD);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.PUSH);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.REPOSITORY_ADVISORY);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.REPOSITORY);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.REPOSITORY_IMPORT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.REPOSITORY_RULESET);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.REPOSITORY_VULNERABILITY_ALERT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.SECRET_SCANNING_ALERT);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.SECRET_SCANNING_ALERT_LOCATION);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.SECURITY_ADVISORY);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.SECURITY_AND_ANALYSIS);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.SPONSORSHIP);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.STAR);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.TEAM_ADD);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.TEAM);
		addEEnumLiteral(eventsEEnum, gHA_metamodel.EVENTS.WORKFLOW_JOB);

		initEEnum(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.class, "WEBHOOK_ACTIVITY_TYPES");
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.ASSIGNED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.AUTO_MERGE_DISABLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.AUTO_MERGE_ENABLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CLOSED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CONVERTED_TO_DRAFT);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.EDITED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.LABELED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.LOCKED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.OPENED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.READY_FOR_REVIEW);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REOPENED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REVIEW_REQUEST_REMOVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REVIEW_REQUESTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.SYNCHRONIZE);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNASSIGNED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNLABELED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNLOCKED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CREATED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DELETED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.NONE);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DISABLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.ENABLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.COMPLETED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REQUESTED_ACTION);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REREQUESTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REQUESTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.APPEARED_IN_BRANCH);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CLOSED_BY_USER);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.FIXED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REOPENED_BY_USER);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UPDATED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.AUTO_DISMISSED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.AUTO_REOPENED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DISMISSED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REINTRODUCED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.APPROVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REJECTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.ANSWERED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CATEGORY_CHANGED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PINNED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.TRANSFERED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNANSWERED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNPINNED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.NEW_PERMISSIONS_ACCEPTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.SUSPEND_UNSUSPEND);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.ADDED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REMOVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DEMILESTONED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.MILESTONED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CANCELLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CHANGED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PENDING_CHANGE);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PENDING_CHANGE_CANCELLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PURCHASED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DENIED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CHECKS_REQUESTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DESTROYED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.BLOCKED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.MEMBER_ADDED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.MEMBER_INVITED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.MEMBER_REMOVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.RENAMED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PUBLISHED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.MOVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.ARCHIVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CONVERTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REORDERED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.RESTORED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DEQUEUED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.ENQUEUED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.SUBMITTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.RESOLVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNRESOLVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PRERELEASED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.RELEASED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNPUBLISHED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REPORTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PRIVATIZED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PUBLICIZED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.TRANSFERRED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNARCHIVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.DISMISS);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REOPEN);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.RESOLVE);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REVOKED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.VALIDATED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.WITHDRAWN);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PENDING_CANCELLATION);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.PENDING_TIER_CHANGE);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.TIER_CHANGED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.ADDED_TO_REPOSITORY);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.REMOVED_FROM_REPOSITORY);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.UNBLOCKED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.CREATE);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.IN_PROGRESS);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.QUEUED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, gHA_metamodel.WEBHOOK_ACTIVITY_TYPES.WAITING);

		initEEnum(permissionsEEnum, gHA_metamodel.PERMISSIONS.class, "PERMISSIONS");
		addEEnumLiteral(permissionsEEnum, gHA_metamodel.PERMISSIONS.READ);
		addEEnumLiteral(permissionsEEnum, gHA_metamodel.PERMISSIONS.WRITE);
		addEEnumLiteral(permissionsEEnum, gHA_metamodel.PERMISSIONS.NONE);

		initEEnum(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.class, "PERMISSION_SCOPES");
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.ACTIONS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.CHECKS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.CONTENTS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.DEPLOYMENTS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.DISCUSSIONS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.ID_TOKEN);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.ISSUES);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.PACKAGES);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.PAGES);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.PULL_REQUESTS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.REPOSITORY_PROJECTS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.SECURITY_EVENTS);
		addEEnumLiteral(permissioN_SCOPESEEnum, gHA_metamodel.PERMISSION_SCOPES.STATUSES);

		initEEnum(inpuT_TYPESEEnum, gHA_metamodel.INPUT_TYPES.class, "INPUT_TYPES");
		addEEnumLiteral(inpuT_TYPESEEnum, gHA_metamodel.INPUT_TYPES.STRING);
		addEEnumLiteral(inpuT_TYPESEEnum, gHA_metamodel.INPUT_TYPES.NUMBER);
		addEEnumLiteral(inpuT_TYPESEEnum, gHA_metamodel.INPUT_TYPES.BOOLEAN);
		addEEnumLiteral(inpuT_TYPESEEnum, gHA_metamodel.INPUT_TYPES.ENVIRONMENT);
		addEEnumLiteral(inpuT_TYPESEEnum, gHA_metamodel.INPUT_TYPES.CHOICE);

		initEEnum(artifacT_TYPEEEnum, gHA_metamodel.ARTIFACT_TYPE.class, "ARTIFACT_TYPE");
		addEEnumLiteral(artifacT_TYPEEEnum, gHA_metamodel.ARTIFACT_TYPE.UPLOAD);
		addEEnumLiteral(artifacT_TYPEEEnum, gHA_metamodel.ARTIFACT_TYPE.DOWNLOAD);

		initEEnum(matriX_CONFIG_TYPEEEnum, gHA_metamodel.MATRIX_CONFIG_TYPE.class, "MATRIX_CONFIG_TYPE");
		addEEnumLiteral(matriX_CONFIG_TYPEEEnum, gHA_metamodel.MATRIX_CONFIG_TYPE.DEFAULT);
		addEEnumLiteral(matriX_CONFIG_TYPEEEnum, gHA_metamodel.MATRIX_CONFIG_TYPE.INCLUDE);
		addEEnumLiteral(matriX_CONFIG_TYPEEEnum, gHA_metamodel.MATRIX_CONFIG_TYPE.EXCLUDE);

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

} //GHA_metamodelPackageImpl
