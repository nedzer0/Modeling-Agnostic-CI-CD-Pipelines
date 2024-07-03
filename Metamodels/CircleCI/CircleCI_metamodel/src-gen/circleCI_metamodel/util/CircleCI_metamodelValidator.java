/**
 */
package circleCI_metamodel.util;

import circleCI_metamodel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see circleCI_metamodel.CircleCI_metamodelPackage
 * @generated
 */
public class CircleCI_metamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CircleCI_metamodelValidator INSTANCE = new CircleCI_metamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "circleCI_metamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleCI_metamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CircleCI_metamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CircleCI_metamodelPackage.STEP:
			return validateStep((Step) value, diagnostics, context);
		case CircleCI_metamodelPackage.RUN:
			return validateRun((Run) value, diagnostics, context);
		case CircleCI_metamodelPackage.DOCKER_AUTH:
			return validateDocker_Auth((Docker_Auth) value, diagnostics, context);
		case CircleCI_metamodelPackage.RESTORE_CACHE:
			return validateRestoreCache((RestoreCache) value, diagnostics, context);
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS:
			return validateDocker_Aws_Auths((Docker_Aws_Auths) value, diagnostics, context);
		case CircleCI_metamodelPackage.JOB:
			return validateJob((Job) value, diagnostics, context);
		case CircleCI_metamodelPackage.MACHINE:
			return validateMachine((Machine) value, diagnostics, context);
		case CircleCI_metamodelPackage.PERSIST_TO_WORKSPACE:
			return validatePersistToWorkspace((PersistToWorkspace) value, diagnostics, context);
		case CircleCI_metamodelPackage.STORE_ARTIFACT:
			return validateStoreArtifact((StoreArtifact) value, diagnostics, context);
		case CircleCI_metamodelPackage.STORE_TEST_RESULTS:
			return validateStoreTestResults((StoreTestResults) value, diagnostics, context);
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER:
			return validateSetupRemoteDocker((SetupRemoteDocker) value, diagnostics, context);
		case CircleCI_metamodelPackage.PARAMETERS:
			return validateParameters((Parameters) value, diagnostics, context);
		case CircleCI_metamodelPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case CircleCI_metamodelPackage.MAC_OS:
			return validateMacOs((MacOs) value, diagnostics, context);
		case CircleCI_metamodelPackage.WORKFLOW:
			return validateWorkflow((Workflow) value, diagnostics, context);
		case CircleCI_metamodelPackage.ENVIRONMENT:
			return validateEnvironment((Environment) value, diagnostics, context);
		case CircleCI_metamodelPackage.DOCKER:
			return validateDocker((Docker) value, diagnostics, context);
		case CircleCI_metamodelPackage.ADD_SSH_KEYS:
			return validateAddSSHKeys((AddSSHKeys) value, diagnostics, context);
		case CircleCI_metamodelPackage.SAVE_CACHE:
			return validateSaveCache((SaveCache) value, diagnostics, context);
		case CircleCI_metamodelPackage.ATTACH_WORKSPACE:
			return validateAttachWorkspace((AttachWorkspace) value, diagnostics, context);
		case CircleCI_metamodelPackage.WHEN_UNLESS:
			return validateWhen_Unless((When_Unless) value, diagnostics, context);
		case CircleCI_metamodelPackage.BRANCH:
			return validateBranch((Branch) value, diagnostics, context);
		case CircleCI_metamodelPackage.RUN_COMMAND:
			return validateRunCommand((RunCommand) value, diagnostics, context);
		case CircleCI_metamodelPackage.TRIGGER:
			return validateTrigger((Trigger) value, diagnostics, context);
		case CircleCI_metamodelPackage.CHECKOUT:
			return validateCheckout((Checkout) value, diagnostics, context);
		case CircleCI_metamodelPackage.EXECUTOR:
			return validateExecutor((Executor) value, diagnostics, context);
		case CircleCI_metamodelPackage.PIPELINE:
			return validatePipeline((Pipeline) value, diagnostics, context);
		case CircleCI_metamodelPackage.ORB:
			return validateOrb((Orb) value, diagnostics, context);
		case CircleCI_metamodelPackage.COMMAND:
			return validateCommand((Command) value, diagnostics, context);
		case CircleCI_metamodelPackage.MATRIX:
			return validateMatrix((Matrix) value, diagnostics, context);
		case CircleCI_metamodelPackage.JOB_WORKFLOW:
			return validateJobWorkflow((JobWorkflow) value, diagnostics, context);
		case CircleCI_metamodelPackage.MATRIX_PARAMS:
			return validateMatrixParams((MatrixParams) value, diagnostics, context);
		case CircleCI_metamodelPackage.PARAMETER_TYPES:
			return validatePARAMETER_TYPES((PARAMETER_TYPES) value, diagnostics, context);
		case CircleCI_metamodelPackage.BRANCH_TYPE:
			return validateBRANCH_TYPE((BRANCH_TYPE) value, diagnostics, context);
		case CircleCI_metamodelPackage.WHEN_TYPE:
			return validateWHEN_TYPE((WHEN_TYPE) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRun(Run run, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(run, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocker_Auth(Docker_Auth docker_Auth, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(docker_Auth, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestoreCache(RestoreCache restoreCache, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restoreCache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocker_Aws_Auths(Docker_Aws_Auths docker_Aws_Auths, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(docker_Aws_Auths, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJob(Job job, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(job, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJob_nonDuplicateJobName(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJob_hasOneExecutorType(job, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJob_ExecutorExistsInJobs(job, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonDuplicateJobName constraint of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOB__NON_DUPLICATE_JOB_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Duplicate Job Name. Choose a different job name to ensure uniqueness within the pipeline.',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tPipeline.allInstances().jobs->forAll(j | j <> self implies j.name <> self.name)\n" + "}.status";

	/**
	 * Validates the nonDuplicateJobName constraint of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJob_nonDuplicateJobName(Job job, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.JOB, job, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nonDuplicateJobName",
				JOB__NON_DUPLICATE_JOB_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the hasOneExecutorType constraint of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOB__HAS_ONE_EXECUTOR_TYPE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Each job should only specify one executor type. Please ensure that each job has a unique executor type assigned.',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\t\tself.executors->collect(e | e.oclType())->asSet()->size() <= 1\n"
			+ "}.status";

	/**
	 * Validates the hasOneExecutorType constraint of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJob_hasOneExecutorType(Job job, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.JOB, job, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "hasOneExecutorType",
				JOB__HAS_ONE_EXECUTOR_TYPE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ExecutorExistsInJobs constraint of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOB__EXECUTOR_EXISTS_IN_JOBS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Ensure that the executor name matches one of the defined executors in the Pipeline\\'s configuration',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t    \t(self.reuseExecutor <> null and self.reuseExecutor->notEmpty()) implies\n"
			+ "\t\t        \t\tPipeline.allInstances().executors->exists(ex | ex.name = self.reuseExecutor)\n"
			+ "}.status";

	/**
	 * Validates the ExecutorExistsInJobs constraint of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJob_ExecutorExistsInJobs(Job job, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.JOB, job, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ExecutorExistsInJobs",
				JOB__EXECUTOR_EXISTS_IN_JOBS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMachine_invalidMachineResourceClass(machine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the invalidMachineResourceClass constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MACHINE__INVALID_MACHINE_RESOURCE_CLASS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Machine resource class only supports the following options: \"medium\", \"large\", \"xlarge\", \"2xlarge\", \"2xlarge+\"',\n"
			+ "\tstatus : Boolean = \n" + "\t\t    self.resourceClass = 'medium' or\n"
			+ "\t\t    self.resourceClass = 'large' or\n" + "\t\t    self.resourceClass = 'xlarge' or\n"
			+ "\t\t    self.resourceClass = '2xlarge' or\n" + "\t\t    self.resourceClass = '2xlarge+'\n" + "}.status";

	/**
	 * Validates the invalidMachineResourceClass constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_invalidMachineResourceClass(Machine machine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.MACHINE, machine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "invalidMachineResourceClass",
				MACHINE__INVALID_MACHINE_RESOURCE_CLASS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistToWorkspace(PersistToWorkspace persistToWorkspace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistToWorkspace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreArtifact(StoreArtifact storeArtifact, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storeArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreTestResults(StoreTestResults storeTestResults, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storeTestResults, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetupRemoteDocker(SetupRemoteDocker setupRemoteDocker, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setupRemoteDocker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameters(Parameters parameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameter_EnumValuesNotEmpty(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameter_EnumValuesEmptyForNonEnum(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameter_CheckValidBooleanDefaultValue(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameter_validParameterTypes(parameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EnumValuesNotEmpty constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__ENUM_VALUES_NOT_EMPTY__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Enum parameter must have non-empty enum values',\n" + "\tstatus : Boolean = \n"
			+ "    \t\tself.type = PARAMETER_TYPES::ENUM implies\n"
			+ "        \t\tnot self.enumValues->isEmpty() and self.enumValues->notEmpty()\n" + "}.status";

	/**
	 * Validates the EnumValuesNotEmpty constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_EnumValuesNotEmpty(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.PARAMETER, parameter, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "EnumValuesNotEmpty",
				PARAMETER__ENUM_VALUES_NOT_EMPTY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the EnumValuesEmptyForNonEnum constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__ENUM_VALUES_EMPTY_FOR_NON_ENUM__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Non-enum parameter must not have enum values. Remove enumValues entry',\n"
			+ "\tstatus : Boolean = \n" + "    \t\tself.type <> PARAMETER_TYPES::ENUM implies\n"
			+ "        \t\tself.enumValues->isEmpty() and self.enumValues->isEmpty()\n" + "}.status";

	/**
	 * Validates the EnumValuesEmptyForNonEnum constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_EnumValuesEmptyForNonEnum(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.PARAMETER, parameter, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "EnumValuesEmptyForNonEnum",
				PARAMETER__ENUM_VALUES_EMPTY_FOR_NON_ENUM__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CheckValidBooleanDefaultValue constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__CHECK_VALID_BOOLEAN_DEFAULT_VALUE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Boolean parameter must have default value as \"true\" or \"false\"',\n"
			+ "\tstatus : Boolean = \n" + "\t\t    self.type = PARAMETER_TYPES::BOOLEAN implies\n"
			+ "\t\t        (self.default = 'true' or self.default = 'false')\n" + "}.status";

	/**
	 * Validates the CheckValidBooleanDefaultValue constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_CheckValidBooleanDefaultValue(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.PARAMETER, parameter, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CheckValidBooleanDefaultValue",
				PARAMETER__CHECK_VALID_BOOLEAN_DEFAULT_VALUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the validParameterTypes constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__VALID_PARAMETER_TYPES__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Invalid parameter type. Pipeline parameters can only have types: string, boolean, integer, or enum.',\n"
			+ "\tstatus : Boolean = \n" + "\t\t        self.type = PARAMETER_TYPES::STRING or\n"
			+ "\t\t        self.type = PARAMETER_TYPES::BOOLEAN or\n"
			+ "\t\t        self.type = PARAMETER_TYPES::INTEGER or\n"
			+ "\t\t        self.type = PARAMETER_TYPES::ENUM\n" + "}.status";

	/**
	 * Validates the validParameterTypes constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_validParameterTypes(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.PARAMETER, parameter, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validParameterTypes",
				PARAMETER__VALID_PARAMETER_TYPES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacOs(MacOs macOs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(macOs, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(macOs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMacOs_invalidMacOsResourceClass(macOs, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the invalidMacOsResourceClass constraint of '<em>Mac Os</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAC_OS__INVALID_MAC_OS_RESOURCE_CLASS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'MacOs resource class only supports the following options: \"macos.x86.medium.gen2*\", \"macos.m1.medium.gen1\", \"macos.m1.large.gen1\"',\n"
			+ "\tstatus : Boolean = \n" + "\t\t    self.resourceClass = 'macos.x86.medium.gen2*' or\n"
			+ "\t\t    self.resourceClass = 'macos.m1.medium.gen1' or\n"
			+ "\t\t    self.resourceClass = 'macos.m1.large.gen1'\n" + "}.status";

	/**
	 * Validates the invalidMacOsResourceClass constraint of '<em>Mac Os</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacOs_invalidMacOsResourceClass(MacOs macOs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.MAC_OS, macOs, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "invalidMacOsResourceClass",
				MAC_OS__INVALID_MAC_OS_RESOURCE_CLASS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocker(Docker docker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(docker, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(docker, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDocker_invalidDockerResourceClass(docker, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the invalidDockerResourceClass constraint of '<em>Docker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCKER__INVALID_DOCKER_RESOURCE_CLASS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Docker resource class only supports the following options: \"small\", \"medium\", \"medium+\", \"large\", \"xlarge\", \"2xlarge\", \"2xlarge+\"',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tself.resourceClass = 'small' or\n"
			+ "\t\t    self.resourceClass = 'medium' or\n" + "\t\t    self.resourceClass = 'medium+' or\n"
			+ "\t\t    self.resourceClass = 'large' or\n" + "\t\t    self.resourceClass = 'xlarge' or\n"
			+ "\t\t    self.resourceClass = '2xlarge' or\n" + "\t\t    self.resourceClass = '2xlarge+'\n" + "}.status";

	/**
	 * Validates the invalidDockerResourceClass constraint of '<em>Docker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocker_invalidDockerResourceClass(Docker docker, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.DOCKER, docker, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "invalidDockerResourceClass",
				DOCKER__INVALID_DOCKER_RESOURCE_CLASS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddSSHKeys(AddSSHKeys addSSHKeys, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addSSHKeys, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaveCache(SaveCache saveCache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(saveCache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachWorkspace(AttachWorkspace attachWorkspace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachWorkspace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhen_Unless(When_Unless when_Unless, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(when_Unless, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunCommand(RunCommand runCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trigger, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTrigger_validCronSyntax(trigger, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validCronSyntax constraint of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRIGGER__VALID_CRON_SYNTAX__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Not a valid Cron syntax. Ensure that the pattern follows the format: [minute] [hour] [day of month] [month] [day of week], where each field is separated by a space.',\n"
			+ "\tstatus : Boolean = \n"
			+ "    \t\tself.cron.matches('(?:[0-9]|1[0-9]|2[0-3]|H|L|\\\\*|\\\\?|[0-5]?[0-9]|\\\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\\\*|L|\\\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\\\-?[0-6]|#[1-5]|\\\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\\\*|L|\\\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\\\*|L|\\\\?|\\\\*/[0-9]+) (?:[0-7]|\\\\*|L|\\\\?|#[1-5])')\n"
			+ "}.status";

	/**
	 * Validates the validCronSyntax constraint of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger_validCronSyntax(Trigger trigger, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.TRIGGER, trigger, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validCronSyntax",
				TRIGGER__VALID_CRON_SYNTAX__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckout(Checkout checkout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutor(Executor executor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pipeline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrb(Orb orb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(command, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatrix(Matrix matrix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matrix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobWorkflow(JobWorkflow jobWorkflow, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jobWorkflow, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJobWorkflow_requiredJobExists(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJobWorkflow_WorkflowJobExists(jobWorkflow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateJobWorkflow_nonDuplicateJobWorkflowName(jobWorkflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the requiredJobExists constraint of '<em>Job Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOB_WORKFLOW__REQUIRED_JOB_EXISTS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Required Job does not exist. Select an existing pipeline Job',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tself.requires->notEmpty() implies self.requires->forAll(rj | Job.allInstances()->exists(j | j.name = rj))\n"
			+ "}.status";

	/**
	 * Validates the requiredJobExists constraint of '<em>Job Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobWorkflow_requiredJobExists(JobWorkflow jobWorkflow, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW, jobWorkflow, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "requiredJobExists",
				JOB_WORKFLOW__REQUIRED_JOB_EXISTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the WorkflowJobExists constraint of '<em>Job Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOB_WORKFLOW__WORKFLOW_JOB_EXISTS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Ensure that jobs referenced in the workflow exist in Job\\'s configuration',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tPipeline.allInstances().jobs->exists(job | job.name = self.name)\n"
			+ "}.status";

	/**
	 * Validates the WorkflowJobExists constraint of '<em>Job Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobWorkflow_WorkflowJobExists(JobWorkflow jobWorkflow, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW, jobWorkflow, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "WorkflowJobExists",
				JOB_WORKFLOW__WORKFLOW_JOB_EXISTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nonDuplicateJobWorkflowName constraint of '<em>Job Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOB_WORKFLOW__NON_DUPLICATE_JOB_WORKFLOW_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Duplicate JobWorkflow Name. Choose a different jobWorkflow name to ensure uniqueness within the pipeline.',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tPipeline.allInstances().workflow.jobworkflow->forAll(jw | jw <> self implies jw.name <> self.name)\n"
			+ "}.status";

	/**
	 * Validates the nonDuplicateJobWorkflowName constraint of '<em>Job Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobWorkflow_nonDuplicateJobWorkflowName(JobWorkflow jobWorkflow, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW, jobWorkflow, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nonDuplicateJobWorkflowName",
				JOB_WORKFLOW__NON_DUPLICATE_JOB_WORKFLOW_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatrixParams(MatrixParams matrixParams, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matrixParams, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePARAMETER_TYPES(PARAMETER_TYPES parameteR_TYPES, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBRANCH_TYPE(BRANCH_TYPE brancH_TYPE, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWHEN_TYPE(WHEN_TYPE wheN_TYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CircleCI_metamodelValidator
