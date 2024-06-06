/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /CircleCI_metamodel/model/circleCI_metamodel.ecore
 * using:
 *   /CircleCI_metamodel/model/circleCI_metamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package circleCI_metamodel;

// import circleCI_metamodel.CircleCI_metamodelTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;

/**
 * CircleCI_metamodelTables provides the dispatch tables for the circleCI_metamodel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CircleCI_metamodelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CircleCI_metamodelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CircleCI_metamodelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AddSSHKeys = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.ADD_SSH_KEYS, PACKAGE, 0);
		public static final EcoreExecutorType _AttachWorkspace = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.ATTACH_WORKSPACE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _BRANCH_TYPE = new EcoreExecutorEnumeration(CircleCI_metamodelPackage.Literals.BRANCH_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Branch = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.BRANCH, PACKAGE, 0);
		public static final EcoreExecutorType _Checkout = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.CHECKOUT, PACKAGE, 0);
		public static final EcoreExecutorType _Command = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.COMMAND, PACKAGE, 0);
		public static final EcoreExecutorType _Docker = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.DOCKER, PACKAGE, 0);
		public static final EcoreExecutorType _Docker_Auth = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.DOCKER_AUTH, PACKAGE, 0);
		public static final EcoreExecutorType _Docker_Aws_Auths = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.DOCKER_AWS_AUTHS, PACKAGE, 0);
		public static final EcoreExecutorType _Environment = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.ENVIRONMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Executor = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.EXECUTOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Job = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.JOB, PACKAGE, 0);
		public static final EcoreExecutorType _JobWorkflow = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW, PACKAGE, 0);
		public static final EcoreExecutorType _MacOs = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.MAC_OS, PACKAGE, 0);
		public static final EcoreExecutorType _Machine = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.MACHINE, PACKAGE, 0);
		public static final EcoreExecutorType _Matrix = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.MATRIX, PACKAGE, 0);
		public static final EcoreExecutorType _MatrixParams = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.MATRIX_PARAMS, PACKAGE, 0);
		public static final EcoreExecutorType _Orb = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.ORB, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PARAMETER_TYPES = new EcoreExecutorEnumeration(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _Parameters = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.PARAMETERS, PACKAGE, 0);
		public static final EcoreExecutorType _PersistToWorkspace = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.PERSIST_TO_WORKSPACE, PACKAGE, 0);
		public static final EcoreExecutorType _Pipeline = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.PIPELINE, PACKAGE, 0);
		public static final EcoreExecutorType _RestoreCache = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.RESTORE_CACHE, PACKAGE, 0);
		public static final EcoreExecutorType _Run = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.RUN, PACKAGE, 0);
		public static final EcoreExecutorType _RunCommand = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.RUN_COMMAND, PACKAGE, 0);
		public static final EcoreExecutorType _SaveCache = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.SAVE_CACHE, PACKAGE, 0);
		public static final EcoreExecutorType _SetupRemoteDocker = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.SETUP_REMOTE_DOCKER, PACKAGE, 0);
		public static final EcoreExecutorType _Step = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.STEP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _StoreArtifact = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.STORE_ARTIFACT, PACKAGE, 0);
		public static final EcoreExecutorType _StoreTestResults = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.STORE_TEST_RESULTS, PACKAGE, 0);
		public static final EcoreExecutorType _Trigger = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _WHEN_TYPE = new EcoreExecutorEnumeration(CircleCI_metamodelPackage.Literals.WHEN_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _When_Unless = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.WHEN_UNLESS, PACKAGE, 0);
		public static final EcoreExecutorType _Workflow = new EcoreExecutorType(CircleCI_metamodelPackage.Literals.WORKFLOW, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AddSSHKeys,
			_AttachWorkspace,
			_BRANCH_TYPE,
			_Branch,
			_Checkout,
			_Command,
			_Docker,
			_Docker_Auth,
			_Docker_Aws_Auths,
			_Environment,
			_Executor,
			_Job,
			_JobWorkflow,
			_MacOs,
			_Machine,
			_Matrix,
			_MatrixParams,
			_Orb,
			_PARAMETER_TYPES,
			_Parameter,
			_Parameters,
			_PersistToWorkspace,
			_Pipeline,
			_RestoreCache,
			_Run,
			_RunCommand,
			_SaveCache,
			_SetupRemoteDocker,
			_Step,
			_StoreArtifact,
			_StoreTestResults,
			_Trigger,
			_WHEN_TYPE,
			_When_Unless,
			_Workflow
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AddSSHKeys__AddSSHKeys = new ExecutorFragment(Types._AddSSHKeys, CircleCI_metamodelTables.Types._AddSSHKeys);
		private static final ExecutorFragment _AddSSHKeys__OclAny = new ExecutorFragment(Types._AddSSHKeys, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AddSSHKeys__OclElement = new ExecutorFragment(Types._AddSSHKeys, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AddSSHKeys__Step = new ExecutorFragment(Types._AddSSHKeys, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _AttachWorkspace__AttachWorkspace = new ExecutorFragment(Types._AttachWorkspace, CircleCI_metamodelTables.Types._AttachWorkspace);
		private static final ExecutorFragment _AttachWorkspace__OclAny = new ExecutorFragment(Types._AttachWorkspace, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AttachWorkspace__OclElement = new ExecutorFragment(Types._AttachWorkspace, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AttachWorkspace__Step = new ExecutorFragment(Types._AttachWorkspace, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _BRANCH_TYPE__BRANCH_TYPE = new ExecutorFragment(Types._BRANCH_TYPE, CircleCI_metamodelTables.Types._BRANCH_TYPE);
		private static final ExecutorFragment _BRANCH_TYPE__OclAny = new ExecutorFragment(Types._BRANCH_TYPE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BRANCH_TYPE__OclElement = new ExecutorFragment(Types._BRANCH_TYPE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BRANCH_TYPE__OclEnumeration = new ExecutorFragment(Types._BRANCH_TYPE, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _BRANCH_TYPE__OclType = new ExecutorFragment(Types._BRANCH_TYPE, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Branch__Branch = new ExecutorFragment(Types._Branch, CircleCI_metamodelTables.Types._Branch);
		private static final ExecutorFragment _Branch__OclAny = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Branch__OclElement = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Checkout__Checkout = new ExecutorFragment(Types._Checkout, CircleCI_metamodelTables.Types._Checkout);
		private static final ExecutorFragment _Checkout__OclAny = new ExecutorFragment(Types._Checkout, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Checkout__OclElement = new ExecutorFragment(Types._Checkout, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Checkout__Step = new ExecutorFragment(Types._Checkout, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _Command__Command = new ExecutorFragment(Types._Command, CircleCI_metamodelTables.Types._Command);
		private static final ExecutorFragment _Command__OclAny = new ExecutorFragment(Types._Command, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Command__OclElement = new ExecutorFragment(Types._Command, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Docker__Docker = new ExecutorFragment(Types._Docker, CircleCI_metamodelTables.Types._Docker);
		private static final ExecutorFragment _Docker__Executor = new ExecutorFragment(Types._Docker, CircleCI_metamodelTables.Types._Executor);
		private static final ExecutorFragment _Docker__OclAny = new ExecutorFragment(Types._Docker, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Docker__OclElement = new ExecutorFragment(Types._Docker, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Docker_Auth__Docker_Auth = new ExecutorFragment(Types._Docker_Auth, CircleCI_metamodelTables.Types._Docker_Auth);
		private static final ExecutorFragment _Docker_Auth__OclAny = new ExecutorFragment(Types._Docker_Auth, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Docker_Auth__OclElement = new ExecutorFragment(Types._Docker_Auth, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Docker_Aws_Auths__Docker_Aws_Auths = new ExecutorFragment(Types._Docker_Aws_Auths, CircleCI_metamodelTables.Types._Docker_Aws_Auths);
		private static final ExecutorFragment _Docker_Aws_Auths__OclAny = new ExecutorFragment(Types._Docker_Aws_Auths, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Docker_Aws_Auths__OclElement = new ExecutorFragment(Types._Docker_Aws_Auths, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Environment__Environment = new ExecutorFragment(Types._Environment, CircleCI_metamodelTables.Types._Environment);
		private static final ExecutorFragment _Environment__OclAny = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Environment__OclElement = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Executor__Executor = new ExecutorFragment(Types._Executor, CircleCI_metamodelTables.Types._Executor);
		private static final ExecutorFragment _Executor__OclAny = new ExecutorFragment(Types._Executor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Executor__OclElement = new ExecutorFragment(Types._Executor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Job__Job = new ExecutorFragment(Types._Job, CircleCI_metamodelTables.Types._Job);
		private static final ExecutorFragment _Job__OclAny = new ExecutorFragment(Types._Job, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Job__OclElement = new ExecutorFragment(Types._Job, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _JobWorkflow__JobWorkflow = new ExecutorFragment(Types._JobWorkflow, CircleCI_metamodelTables.Types._JobWorkflow);
		private static final ExecutorFragment _JobWorkflow__OclAny = new ExecutorFragment(Types._JobWorkflow, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _JobWorkflow__OclElement = new ExecutorFragment(Types._JobWorkflow, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MacOs__Executor = new ExecutorFragment(Types._MacOs, CircleCI_metamodelTables.Types._Executor);
		private static final ExecutorFragment _MacOs__MacOs = new ExecutorFragment(Types._MacOs, CircleCI_metamodelTables.Types._MacOs);
		private static final ExecutorFragment _MacOs__OclAny = new ExecutorFragment(Types._MacOs, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MacOs__OclElement = new ExecutorFragment(Types._MacOs, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Machine__Executor = new ExecutorFragment(Types._Machine, CircleCI_metamodelTables.Types._Executor);
		private static final ExecutorFragment _Machine__Machine = new ExecutorFragment(Types._Machine, CircleCI_metamodelTables.Types._Machine);
		private static final ExecutorFragment _Machine__OclAny = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Machine__OclElement = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Matrix__Matrix = new ExecutorFragment(Types._Matrix, CircleCI_metamodelTables.Types._Matrix);
		private static final ExecutorFragment _Matrix__OclAny = new ExecutorFragment(Types._Matrix, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Matrix__OclElement = new ExecutorFragment(Types._Matrix, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MatrixParams__MatrixParams = new ExecutorFragment(Types._MatrixParams, CircleCI_metamodelTables.Types._MatrixParams);
		private static final ExecutorFragment _MatrixParams__OclAny = new ExecutorFragment(Types._MatrixParams, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MatrixParams__OclElement = new ExecutorFragment(Types._MatrixParams, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Orb__OclAny = new ExecutorFragment(Types._Orb, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Orb__OclElement = new ExecutorFragment(Types._Orb, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Orb__Orb = new ExecutorFragment(Types._Orb, CircleCI_metamodelTables.Types._Orb);

		private static final ExecutorFragment _PARAMETER_TYPES__OclAny = new ExecutorFragment(Types._PARAMETER_TYPES, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PARAMETER_TYPES__OclElement = new ExecutorFragment(Types._PARAMETER_TYPES, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PARAMETER_TYPES__OclEnumeration = new ExecutorFragment(Types._PARAMETER_TYPES, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PARAMETER_TYPES__OclType = new ExecutorFragment(Types._PARAMETER_TYPES, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PARAMETER_TYPES__PARAMETER_TYPES = new ExecutorFragment(Types._PARAMETER_TYPES, CircleCI_metamodelTables.Types._PARAMETER_TYPES);

		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, CircleCI_metamodelTables.Types._Parameter);

		private static final ExecutorFragment _Parameters__OclAny = new ExecutorFragment(Types._Parameters, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameters__OclElement = new ExecutorFragment(Types._Parameters, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameters__Parameters = new ExecutorFragment(Types._Parameters, CircleCI_metamodelTables.Types._Parameters);

		private static final ExecutorFragment _PersistToWorkspace__OclAny = new ExecutorFragment(Types._PersistToWorkspace, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PersistToWorkspace__OclElement = new ExecutorFragment(Types._PersistToWorkspace, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PersistToWorkspace__PersistToWorkspace = new ExecutorFragment(Types._PersistToWorkspace, CircleCI_metamodelTables.Types._PersistToWorkspace);
		private static final ExecutorFragment _PersistToWorkspace__Step = new ExecutorFragment(Types._PersistToWorkspace, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _Pipeline__OclAny = new ExecutorFragment(Types._Pipeline, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Pipeline__OclElement = new ExecutorFragment(Types._Pipeline, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Pipeline__Pipeline = new ExecutorFragment(Types._Pipeline, CircleCI_metamodelTables.Types._Pipeline);

		private static final ExecutorFragment _RestoreCache__OclAny = new ExecutorFragment(Types._RestoreCache, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RestoreCache__OclElement = new ExecutorFragment(Types._RestoreCache, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RestoreCache__RestoreCache = new ExecutorFragment(Types._RestoreCache, CircleCI_metamodelTables.Types._RestoreCache);
		private static final ExecutorFragment _RestoreCache__Step = new ExecutorFragment(Types._RestoreCache, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _Run__OclAny = new ExecutorFragment(Types._Run, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Run__OclElement = new ExecutorFragment(Types._Run, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Run__Run = new ExecutorFragment(Types._Run, CircleCI_metamodelTables.Types._Run);
		private static final ExecutorFragment _Run__Step = new ExecutorFragment(Types._Run, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _RunCommand__OclAny = new ExecutorFragment(Types._RunCommand, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RunCommand__OclElement = new ExecutorFragment(Types._RunCommand, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RunCommand__RunCommand = new ExecutorFragment(Types._RunCommand, CircleCI_metamodelTables.Types._RunCommand);

		private static final ExecutorFragment _SaveCache__OclAny = new ExecutorFragment(Types._SaveCache, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SaveCache__OclElement = new ExecutorFragment(Types._SaveCache, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SaveCache__SaveCache = new ExecutorFragment(Types._SaveCache, CircleCI_metamodelTables.Types._SaveCache);
		private static final ExecutorFragment _SaveCache__Step = new ExecutorFragment(Types._SaveCache, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _SetupRemoteDocker__OclAny = new ExecutorFragment(Types._SetupRemoteDocker, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SetupRemoteDocker__OclElement = new ExecutorFragment(Types._SetupRemoteDocker, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SetupRemoteDocker__SetupRemoteDocker = new ExecutorFragment(Types._SetupRemoteDocker, CircleCI_metamodelTables.Types._SetupRemoteDocker);
		private static final ExecutorFragment _SetupRemoteDocker__Step = new ExecutorFragment(Types._SetupRemoteDocker, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, CircleCI_metamodelTables.Types._Step);

		private static final ExecutorFragment _StoreArtifact__OclAny = new ExecutorFragment(Types._StoreArtifact, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StoreArtifact__OclElement = new ExecutorFragment(Types._StoreArtifact, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StoreArtifact__Step = new ExecutorFragment(Types._StoreArtifact, CircleCI_metamodelTables.Types._Step);
		private static final ExecutorFragment _StoreArtifact__StoreArtifact = new ExecutorFragment(Types._StoreArtifact, CircleCI_metamodelTables.Types._StoreArtifact);

		private static final ExecutorFragment _StoreTestResults__OclAny = new ExecutorFragment(Types._StoreTestResults, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StoreTestResults__OclElement = new ExecutorFragment(Types._StoreTestResults, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StoreTestResults__Step = new ExecutorFragment(Types._StoreTestResults, CircleCI_metamodelTables.Types._Step);
		private static final ExecutorFragment _StoreTestResults__StoreTestResults = new ExecutorFragment(Types._StoreTestResults, CircleCI_metamodelTables.Types._StoreTestResults);

		private static final ExecutorFragment _Trigger__OclAny = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Trigger__OclElement = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Trigger__Trigger = new ExecutorFragment(Types._Trigger, CircleCI_metamodelTables.Types._Trigger);

		private static final ExecutorFragment _WHEN_TYPE__OclAny = new ExecutorFragment(Types._WHEN_TYPE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WHEN_TYPE__OclElement = new ExecutorFragment(Types._WHEN_TYPE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WHEN_TYPE__OclEnumeration = new ExecutorFragment(Types._WHEN_TYPE, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _WHEN_TYPE__OclType = new ExecutorFragment(Types._WHEN_TYPE, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _WHEN_TYPE__WHEN_TYPE = new ExecutorFragment(Types._WHEN_TYPE, CircleCI_metamodelTables.Types._WHEN_TYPE);

		private static final ExecutorFragment _When_Unless__OclAny = new ExecutorFragment(Types._When_Unless, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _When_Unless__OclElement = new ExecutorFragment(Types._When_Unless, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _When_Unless__Step = new ExecutorFragment(Types._When_Unless, CircleCI_metamodelTables.Types._Step);
		private static final ExecutorFragment _When_Unless__When_Unless = new ExecutorFragment(Types._When_Unless, CircleCI_metamodelTables.Types._When_Unless);

		private static final ExecutorFragment _Workflow__OclAny = new ExecutorFragment(Types._Workflow, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Workflow__OclElement = new ExecutorFragment(Types._Workflow, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Workflow__Workflow = new ExecutorFragment(Types._Workflow, CircleCI_metamodelTables.Types._Workflow);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AddSSHKeys__fingerprints = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.ADD_SSH_KEYS__FINGERPRINTS, Types._AddSSHKeys, 0);

		public static final ExecutorProperty _AttachWorkspace__at = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.ATTACH_WORKSPACE__AT, Types._AttachWorkspace, 0);

		public static final ExecutorProperty _Branch__branch = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.BRANCH__BRANCH, Types._Branch, 0);
		public static final ExecutorProperty _Branch__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.BRANCH__NAME, Types._Branch, 1);
		public static final ExecutorProperty _Branch__JobWorkflow__branches = new ExecutorPropertyWithImplementation("JobWorkflow", Types._Branch, 2, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__BRANCHES));
		public static final ExecutorProperty _Branch__Workflow__branches = new ExecutorPropertyWithImplementation("Workflow", Types._Branch, 3, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__BRANCHES));

		public static final ExecutorProperty _Checkout__path = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.CHECKOUT__PATH, Types._Checkout, 0);

		public static final ExecutorProperty _Command__description = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.COMMAND__DESCRIPTION, Types._Command, 0);
		public static final ExecutorProperty _Command__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.COMMAND__NAME, Types._Command, 1);
		public static final ExecutorProperty _Command__parameters = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.COMMAND__PARAMETERS, Types._Command, 2);
		public static final ExecutorProperty _Command__steps = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.COMMAND__STEPS, Types._Command, 3);
		public static final ExecutorProperty _Command__Pipeline__commands = new ExecutorPropertyWithImplementation("Pipeline", Types._Command, 4, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.PIPELINE__COMMANDS));

		public static final ExecutorProperty _Docker__command = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER__COMMAND, Types._Docker, 0);
		public static final ExecutorProperty _Docker__docker_auth = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER__DOCKER_AUTH, Types._Docker, 1);
		public static final ExecutorProperty _Docker__docker_aws_auth = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER__DOCKER_AWS_AUTH, Types._Docker, 2);
		public static final ExecutorProperty _Docker__entrypoint = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER__ENTRYPOINT, Types._Docker, 3);
		public static final ExecutorProperty _Docker__image = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER__IMAGE, Types._Docker, 4);
		public static final ExecutorProperty _Docker__user = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER__USER, Types._Docker, 5);

		public static final ExecutorProperty _Docker_Auth__password = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER_AUTH__PASSWORD, Types._Docker_Auth, 0);
		public static final ExecutorProperty _Docker_Auth__username = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER_AUTH__USERNAME, Types._Docker_Auth, 1);
		public static final ExecutorProperty _Docker_Auth__Docker__docker_auth = new ExecutorPropertyWithImplementation("Docker", Types._Docker_Auth, 2, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.DOCKER__DOCKER_AUTH));

		public static final ExecutorProperty _Docker_Aws_Auths__aws_access_key_id = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID, Types._Docker_Aws_Auths, 0);
		public static final ExecutorProperty _Docker_Aws_Auths__aws_secret_access_key = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY, Types._Docker_Aws_Auths, 1);
		public static final ExecutorProperty _Docker_Aws_Auths__Docker__docker_aws_auth = new ExecutorPropertyWithImplementation("Docker", Types._Docker_Aws_Auths, 2, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.DOCKER__DOCKER_AWS_AUTH));

		public static final ExecutorProperty _Environment__key = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.ENVIRONMENT__KEY, Types._Environment, 0);
		public static final ExecutorProperty _Environment__value = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.ENVIRONMENT__VALUE, Types._Environment, 1);
		public static final ExecutorProperty _Environment__Executor__environments = new ExecutorPropertyWithImplementation("Executor", Types._Environment, 2, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.EXECUTOR__ENVIRONMENTS));
		public static final ExecutorProperty _Environment__Job__environments = new ExecutorPropertyWithImplementation("Job", Types._Environment, 3, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.JOB__ENVIRONMENTS));
		public static final ExecutorProperty _Environment__Run__environments = new ExecutorPropertyWithImplementation("Run", Types._Environment, 4, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.RUN__ENVIRONMENTS));

		public static final ExecutorProperty _Executor__environments = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.EXECUTOR__ENVIRONMENTS, Types._Executor, 0);
		public static final ExecutorProperty _Executor__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.EXECUTOR__NAME, Types._Executor, 1);
		public static final ExecutorProperty _Executor__resourceClass = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.EXECUTOR__RESOURCE_CLASS, Types._Executor, 2);
		public static final ExecutorProperty _Executor__shell = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.EXECUTOR__SHELL, Types._Executor, 3);
		public static final ExecutorProperty _Executor__working_directory = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.EXECUTOR__WORKING_DIRECTORY, Types._Executor, 4);
		public static final ExecutorProperty _Executor__Job__executors = new ExecutorPropertyWithImplementation("Job", Types._Executor, 5, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.JOB__EXECUTORS));
		public static final ExecutorProperty _Executor__Pipeline__executors = new ExecutorPropertyWithImplementation("Pipeline", Types._Executor, 6, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.PIPELINE__EXECUTORS));

		public static final ExecutorProperty _Job__environments = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB__ENVIRONMENTS, Types._Job, 0);
		public static final ExecutorProperty _Job__executors = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB__EXECUTORS, Types._Job, 1);
		public static final ExecutorProperty _Job__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB__NAME, Types._Job, 2);
		public static final ExecutorProperty _Job__parallelism = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB__PARALLELISM, Types._Job, 3);
		public static final ExecutorProperty _Job__parameters = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB__PARAMETERS, Types._Job, 4);
		public static final ExecutorProperty _Job__reuseExecutor = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB__REUSE_EXECUTOR, Types._Job, 5);
		public static final ExecutorProperty _Job__steps = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB__STEPS, Types._Job, 6);
		public static final ExecutorProperty _Job__Pipeline__jobs = new ExecutorPropertyWithImplementation("Pipeline", Types._Job, 7, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.PIPELINE__JOBS));

		public static final ExecutorProperty _JobWorkflow__approvalJob = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__APPROVAL_JOB, Types._JobWorkflow, 0);
		public static final ExecutorProperty _JobWorkflow__branches = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__BRANCHES, Types._JobWorkflow, 1);
		public static final ExecutorProperty _JobWorkflow__context = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__CONTEXT, Types._JobWorkflow, 2);
		public static final ExecutorProperty _JobWorkflow__matrix = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__MATRIX, Types._JobWorkflow, 3);
		public static final ExecutorProperty _JobWorkflow__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__NAME, Types._JobWorkflow, 4);
		public static final ExecutorProperty _JobWorkflow__requires = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__REQUIRES, Types._JobWorkflow, 5);
		public static final ExecutorProperty _JobWorkflow__Workflow__jobworkflow = new ExecutorPropertyWithImplementation("Workflow", Types._JobWorkflow, 6, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__JOBWORKFLOW));

		public static final ExecutorProperty _MacOs__xcode = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MAC_OS__XCODE, Types._MacOs, 0);

		public static final ExecutorProperty _Machine__docker_layer_caching = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MACHINE__DOCKER_LAYER_CACHING, Types._Machine, 0);
		public static final ExecutorProperty _Machine__image = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MACHINE__IMAGE, Types._Machine, 1);

		public static final ExecutorProperty _Matrix__alias = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MATRIX__ALIAS, Types._Matrix, 0);
		public static final ExecutorProperty _Matrix__matrix_exclude = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MATRIX__MATRIX_EXCLUDE, Types._Matrix, 1);
		public static final ExecutorProperty _Matrix__matrix_params = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MATRIX__MATRIX_PARAMS, Types._Matrix, 2);
		public static final ExecutorProperty _Matrix__JobWorkflow__matrix = new ExecutorPropertyWithImplementation("JobWorkflow", Types._Matrix, 3, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.JOB_WORKFLOW__MATRIX));

		public static final ExecutorProperty _MatrixParams__key = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MATRIX_PARAMS__KEY, Types._MatrixParams, 0);
		public static final ExecutorProperty _MatrixParams__values = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.MATRIX_PARAMS__VALUES, Types._MatrixParams, 1);
		public static final ExecutorProperty _MatrixParams__Matrix__matrix_exclude = new ExecutorPropertyWithImplementation("Matrix", Types._MatrixParams, 2, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.MATRIX__MATRIX_EXCLUDE));
		public static final ExecutorProperty _MatrixParams__Matrix__matrix_params = new ExecutorPropertyWithImplementation("Matrix", Types._MatrixParams, 3, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.MATRIX__MATRIX_PARAMS));

		public static final ExecutorProperty _Orb__key = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.ORB__KEY, Types._Orb, 0);
		public static final ExecutorProperty _Orb__value = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.ORB__VALUE, Types._Orb, 1);
		public static final ExecutorProperty _Orb__Pipeline__orbs = new ExecutorPropertyWithImplementation("Pipeline", Types._Orb, 2, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.PIPELINE__ORBS));

		public static final ExecutorProperty _Parameter__default = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PARAMETER__DEFAULT, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__description = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PARAMETER__DESCRIPTION, Types._Parameter, 1);
		public static final ExecutorProperty _Parameter__enumValues = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PARAMETER__ENUM_VALUES, Types._Parameter, 2);
		public static final ExecutorProperty _Parameter__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PARAMETER__NAME, Types._Parameter, 3);
		public static final ExecutorProperty _Parameter__type = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PARAMETER__TYPE, Types._Parameter, 4);
		public static final ExecutorProperty _Parameter__Command__parameters = new ExecutorPropertyWithImplementation("Command", Types._Parameter, 5, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.COMMAND__PARAMETERS));
		public static final ExecutorProperty _Parameter__Job__parameters = new ExecutorPropertyWithImplementation("Job", Types._Parameter, 6, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.JOB__PARAMETERS));

		public static final ExecutorProperty _Parameters__parameter = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PARAMETERS__PARAMETER, Types._Parameters, 0);
		public static final ExecutorProperty _Parameters__Run__parameters = new ExecutorPropertyWithImplementation("Run", Types._Parameters, 1, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.RUN__PARAMETERS));

		public static final ExecutorProperty _PersistToWorkspace__paths = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PERSIST_TO_WORKSPACE__PATHS, Types._PersistToWorkspace, 0);
		public static final ExecutorProperty _PersistToWorkspace__root = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PERSIST_TO_WORKSPACE__ROOT, Types._PersistToWorkspace, 1);

		public static final ExecutorProperty _Pipeline__commands = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PIPELINE__COMMANDS, Types._Pipeline, 0);
		public static final ExecutorProperty _Pipeline__executors = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PIPELINE__EXECUTORS, Types._Pipeline, 1);
		public static final ExecutorProperty _Pipeline__jobs = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PIPELINE__JOBS, Types._Pipeline, 2);
		public static final ExecutorProperty _Pipeline__orbs = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PIPELINE__ORBS, Types._Pipeline, 3);
		public static final ExecutorProperty _Pipeline__setup = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PIPELINE__SETUP, Types._Pipeline, 4);
		public static final ExecutorProperty _Pipeline__version = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PIPELINE__VERSION, Types._Pipeline, 5);
		public static final ExecutorProperty _Pipeline__workflow = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.PIPELINE__WORKFLOW, Types._Pipeline, 6);

		public static final ExecutorProperty _RestoreCache__key = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RESTORE_CACHE__KEY, Types._RestoreCache, 0);
		public static final ExecutorProperty _RestoreCache__keys = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RESTORE_CACHE__KEYS, Types._RestoreCache, 1);

		public static final ExecutorProperty _Run__background = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__BACKGROUND, Types._Run, 0);
		public static final ExecutorProperty _Run__environments = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__ENVIRONMENTS, Types._Run, 1);
		public static final ExecutorProperty _Run__no_output_timeout = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__NO_OUTPUT_TIMEOUT, Types._Run, 2);
		public static final ExecutorProperty _Run__parameters = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__PARAMETERS, Types._Run, 3);
		public static final ExecutorProperty _Run__run_commands = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__RUN_COMMANDS, Types._Run, 4);
		public static final ExecutorProperty _Run__shell = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__SHELL, Types._Run, 5);
		public static final ExecutorProperty _Run__when = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__WHEN, Types._Run, 6);
		public static final ExecutorProperty _Run__working_directory = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN__WORKING_DIRECTORY, Types._Run, 7);

		public static final ExecutorProperty _RunCommand__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.RUN_COMMAND__NAME, Types._RunCommand, 0);
		public static final ExecutorProperty _RunCommand__Run__run_commands = new ExecutorPropertyWithImplementation("Run", Types._RunCommand, 1, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.RUN__RUN_COMMANDS));

		public static final ExecutorProperty _SaveCache__key = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.SAVE_CACHE__KEY, Types._SaveCache, 0);
		public static final ExecutorProperty _SaveCache__paths = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.SAVE_CACHE__PATHS, Types._SaveCache, 1);
		public static final ExecutorProperty _SaveCache__when = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.SAVE_CACHE__WHEN, Types._SaveCache, 2);

		public static final ExecutorProperty _SetupRemoteDocker__docker_layer_caching = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING, Types._SetupRemoteDocker, 0);
		public static final ExecutorProperty _SetupRemoteDocker__version = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.SETUP_REMOTE_DOCKER__VERSION, Types._SetupRemoteDocker, 1);

		public static final ExecutorProperty _Step__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.STEP__NAME, Types._Step, 0);
		public static final ExecutorProperty _Step__Command__steps = new ExecutorPropertyWithImplementation("Command", Types._Step, 1, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.COMMAND__STEPS));
		public static final ExecutorProperty _Step__Job__steps = new ExecutorPropertyWithImplementation("Job", Types._Step, 2, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.JOB__STEPS));
		public static final ExecutorProperty _Step__When_Unless__unless_step = new ExecutorPropertyWithImplementation("When_Unless", Types._Step, 3, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.WHEN_UNLESS__UNLESS_STEP));
		public static final ExecutorProperty _Step__When_Unless__when_step = new ExecutorPropertyWithImplementation("When_Unless", Types._Step, 4, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.WHEN_UNLESS__WHEN_STEP));

		public static final ExecutorProperty _StoreArtifact__destination = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.STORE_ARTIFACT__DESTINATION, Types._StoreArtifact, 0);
		public static final ExecutorProperty _StoreArtifact__path = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.STORE_ARTIFACT__PATH, Types._StoreArtifact, 1);

		public static final ExecutorProperty _StoreTestResults__path = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.STORE_TEST_RESULTS__PATH, Types._StoreTestResults, 0);

		public static final ExecutorProperty _Trigger__cron = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.TRIGGER__CRON, Types._Trigger, 0);
		public static final ExecutorProperty _Trigger__Workflow__triggers = new ExecutorPropertyWithImplementation("Workflow", Types._Trigger, 1, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__TRIGGERS));

		public static final ExecutorProperty _When_Unless__condition = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WHEN_UNLESS__CONDITION, Types._When_Unless, 0);
		public static final ExecutorProperty _When_Unless__unless_step = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WHEN_UNLESS__UNLESS_STEP, Types._When_Unless, 1);
		public static final ExecutorProperty _When_Unless__when_step = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WHEN_UNLESS__WHEN_STEP, Types._When_Unless, 2);
		public static final ExecutorProperty _When_Unless__Workflow__when_unless = new ExecutorPropertyWithImplementation("Workflow", Types._When_Unless, 3, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__WHEN_UNLESS));

		public static final ExecutorProperty _Workflow__branches = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__BRANCHES, Types._Workflow, 0);
		public static final ExecutorProperty _Workflow__jobworkflow = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__JOBWORKFLOW, Types._Workflow, 1);
		public static final ExecutorProperty _Workflow__name = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__NAME, Types._Workflow, 2);
		public static final ExecutorProperty _Workflow__triggers = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__TRIGGERS, Types._Workflow, 3);
		public static final ExecutorProperty _Workflow__version = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__VERSION, Types._Workflow, 4);
		public static final ExecutorProperty _Workflow__when_unless = new EcoreExecutorProperty(CircleCI_metamodelPackage.Literals.WORKFLOW__WHEN_UNLESS, Types._Workflow, 5);
		public static final ExecutorProperty _Workflow__Pipeline__workflow = new ExecutorPropertyWithImplementation("Pipeline", Types._Workflow, 6, new EcoreLibraryOppositeProperty(CircleCI_metamodelPackage.Literals.PIPELINE__WORKFLOW));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AddSSHKeys =
			{
				Fragments._AddSSHKeys__OclAny /* 0 */,
				Fragments._AddSSHKeys__OclElement /* 1 */,
				Fragments._AddSSHKeys__Step /* 2 */,
				Fragments._AddSSHKeys__AddSSHKeys /* 3 */
			};
		private static final int /*@NonNull*/ [] __AddSSHKeys = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AttachWorkspace =
			{
				Fragments._AttachWorkspace__OclAny /* 0 */,
				Fragments._AttachWorkspace__OclElement /* 1 */,
				Fragments._AttachWorkspace__Step /* 2 */,
				Fragments._AttachWorkspace__AttachWorkspace /* 3 */
			};
		private static final int /*@NonNull*/ [] __AttachWorkspace = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BRANCH_TYPE =
			{
				Fragments._BRANCH_TYPE__OclAny /* 0 */,
				Fragments._BRANCH_TYPE__OclElement /* 1 */,
				Fragments._BRANCH_TYPE__OclType /* 2 */,
				Fragments._BRANCH_TYPE__OclEnumeration /* 3 */,
				Fragments._BRANCH_TYPE__BRANCH_TYPE /* 4 */
			};
		private static final int /*@NonNull*/ [] __BRANCH_TYPE = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Branch =
			{
				Fragments._Branch__OclAny /* 0 */,
				Fragments._Branch__OclElement /* 1 */,
				Fragments._Branch__Branch /* 2 */
			};
		private static final int /*@NonNull*/ [] __Branch = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Checkout =
			{
				Fragments._Checkout__OclAny /* 0 */,
				Fragments._Checkout__OclElement /* 1 */,
				Fragments._Checkout__Step /* 2 */,
				Fragments._Checkout__Checkout /* 3 */
			};
		private static final int /*@NonNull*/ [] __Checkout = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Command =
			{
				Fragments._Command__OclAny /* 0 */,
				Fragments._Command__OclElement /* 1 */,
				Fragments._Command__Command /* 2 */
			};
		private static final int /*@NonNull*/ [] __Command = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Docker =
			{
				Fragments._Docker__OclAny /* 0 */,
				Fragments._Docker__OclElement /* 1 */,
				Fragments._Docker__Executor /* 2 */,
				Fragments._Docker__Docker /* 3 */
			};
		private static final int /*@NonNull*/ [] __Docker = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Docker_Auth =
			{
				Fragments._Docker_Auth__OclAny /* 0 */,
				Fragments._Docker_Auth__OclElement /* 1 */,
				Fragments._Docker_Auth__Docker_Auth /* 2 */
			};
		private static final int /*@NonNull*/ [] __Docker_Auth = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Docker_Aws_Auths =
			{
				Fragments._Docker_Aws_Auths__OclAny /* 0 */,
				Fragments._Docker_Aws_Auths__OclElement /* 1 */,
				Fragments._Docker_Aws_Auths__Docker_Aws_Auths /* 2 */
			};
		private static final int /*@NonNull*/ [] __Docker_Aws_Auths = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Environment =
			{
				Fragments._Environment__OclAny /* 0 */,
				Fragments._Environment__OclElement /* 1 */,
				Fragments._Environment__Environment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Environment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Executor =
			{
				Fragments._Executor__OclAny /* 0 */,
				Fragments._Executor__OclElement /* 1 */,
				Fragments._Executor__Executor /* 2 */
			};
		private static final int /*@NonNull*/ [] __Executor = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Job =
			{
				Fragments._Job__OclAny /* 0 */,
				Fragments._Job__OclElement /* 1 */,
				Fragments._Job__Job /* 2 */
			};
		private static final int /*@NonNull*/ [] __Job = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _JobWorkflow =
			{
				Fragments._JobWorkflow__OclAny /* 0 */,
				Fragments._JobWorkflow__OclElement /* 1 */,
				Fragments._JobWorkflow__JobWorkflow /* 2 */
			};
		private static final int /*@NonNull*/ [] __JobWorkflow = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MacOs =
			{
				Fragments._MacOs__OclAny /* 0 */,
				Fragments._MacOs__OclElement /* 1 */,
				Fragments._MacOs__Executor /* 2 */,
				Fragments._MacOs__MacOs /* 3 */
			};
		private static final int /*@NonNull*/ [] __MacOs = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Machine =
			{
				Fragments._Machine__OclAny /* 0 */,
				Fragments._Machine__OclElement /* 1 */,
				Fragments._Machine__Executor /* 2 */,
				Fragments._Machine__Machine /* 3 */
			};
		private static final int /*@NonNull*/ [] __Machine = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Matrix =
			{
				Fragments._Matrix__OclAny /* 0 */,
				Fragments._Matrix__OclElement /* 1 */,
				Fragments._Matrix__Matrix /* 2 */
			};
		private static final int /*@NonNull*/ [] __Matrix = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MatrixParams =
			{
				Fragments._MatrixParams__OclAny /* 0 */,
				Fragments._MatrixParams__OclElement /* 1 */,
				Fragments._MatrixParams__MatrixParams /* 2 */
			};
		private static final int /*@NonNull*/ [] __MatrixParams = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Orb =
			{
				Fragments._Orb__OclAny /* 0 */,
				Fragments._Orb__OclElement /* 1 */,
				Fragments._Orb__Orb /* 2 */
			};
		private static final int /*@NonNull*/ [] __Orb = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PARAMETER_TYPES =
			{
				Fragments._PARAMETER_TYPES__OclAny /* 0 */,
				Fragments._PARAMETER_TYPES__OclElement /* 1 */,
				Fragments._PARAMETER_TYPES__OclType /* 2 */,
				Fragments._PARAMETER_TYPES__OclEnumeration /* 3 */,
				Fragments._PARAMETER_TYPES__PARAMETER_TYPES /* 4 */
			};
		private static final int /*@NonNull*/ [] __PARAMETER_TYPES = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__Parameter /* 2 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameters =
			{
				Fragments._Parameters__OclAny /* 0 */,
				Fragments._Parameters__OclElement /* 1 */,
				Fragments._Parameters__Parameters /* 2 */
			};
		private static final int /*@NonNull*/ [] __Parameters = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PersistToWorkspace =
			{
				Fragments._PersistToWorkspace__OclAny /* 0 */,
				Fragments._PersistToWorkspace__OclElement /* 1 */,
				Fragments._PersistToWorkspace__Step /* 2 */,
				Fragments._PersistToWorkspace__PersistToWorkspace /* 3 */
			};
		private static final int /*@NonNull*/ [] __PersistToWorkspace = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Pipeline =
			{
				Fragments._Pipeline__OclAny /* 0 */,
				Fragments._Pipeline__OclElement /* 1 */,
				Fragments._Pipeline__Pipeline /* 2 */
			};
		private static final int /*@NonNull*/ [] __Pipeline = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RestoreCache =
			{
				Fragments._RestoreCache__OclAny /* 0 */,
				Fragments._RestoreCache__OclElement /* 1 */,
				Fragments._RestoreCache__Step /* 2 */,
				Fragments._RestoreCache__RestoreCache /* 3 */
			};
		private static final int /*@NonNull*/ [] __RestoreCache = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Run =
			{
				Fragments._Run__OclAny /* 0 */,
				Fragments._Run__OclElement /* 1 */,
				Fragments._Run__Step /* 2 */,
				Fragments._Run__Run /* 3 */
			};
		private static final int /*@NonNull*/ [] __Run = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RunCommand =
			{
				Fragments._RunCommand__OclAny /* 0 */,
				Fragments._RunCommand__OclElement /* 1 */,
				Fragments._RunCommand__RunCommand /* 2 */
			};
		private static final int /*@NonNull*/ [] __RunCommand = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SaveCache =
			{
				Fragments._SaveCache__OclAny /* 0 */,
				Fragments._SaveCache__OclElement /* 1 */,
				Fragments._SaveCache__Step /* 2 */,
				Fragments._SaveCache__SaveCache /* 3 */
			};
		private static final int /*@NonNull*/ [] __SaveCache = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SetupRemoteDocker =
			{
				Fragments._SetupRemoteDocker__OclAny /* 0 */,
				Fragments._SetupRemoteDocker__OclElement /* 1 */,
				Fragments._SetupRemoteDocker__Step /* 2 */,
				Fragments._SetupRemoteDocker__SetupRemoteDocker /* 3 */
			};
		private static final int /*@NonNull*/ [] __SetupRemoteDocker = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Step =
			{
				Fragments._Step__OclAny /* 0 */,
				Fragments._Step__OclElement /* 1 */,
				Fragments._Step__Step /* 2 */
			};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StoreArtifact =
			{
				Fragments._StoreArtifact__OclAny /* 0 */,
				Fragments._StoreArtifact__OclElement /* 1 */,
				Fragments._StoreArtifact__Step /* 2 */,
				Fragments._StoreArtifact__StoreArtifact /* 3 */
			};
		private static final int /*@NonNull*/ [] __StoreArtifact = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StoreTestResults =
			{
				Fragments._StoreTestResults__OclAny /* 0 */,
				Fragments._StoreTestResults__OclElement /* 1 */,
				Fragments._StoreTestResults__Step /* 2 */,
				Fragments._StoreTestResults__StoreTestResults /* 3 */
			};
		private static final int /*@NonNull*/ [] __StoreTestResults = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Trigger =
			{
				Fragments._Trigger__OclAny /* 0 */,
				Fragments._Trigger__OclElement /* 1 */,
				Fragments._Trigger__Trigger /* 2 */
			};
		private static final int /*@NonNull*/ [] __Trigger = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WHEN_TYPE =
			{
				Fragments._WHEN_TYPE__OclAny /* 0 */,
				Fragments._WHEN_TYPE__OclElement /* 1 */,
				Fragments._WHEN_TYPE__OclType /* 2 */,
				Fragments._WHEN_TYPE__OclEnumeration /* 3 */,
				Fragments._WHEN_TYPE__WHEN_TYPE /* 4 */
			};
		private static final int /*@NonNull*/ [] __WHEN_TYPE = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _When_Unless =
			{
				Fragments._When_Unless__OclAny /* 0 */,
				Fragments._When_Unless__OclElement /* 1 */,
				Fragments._When_Unless__Step /* 2 */,
				Fragments._When_Unless__When_Unless /* 3 */
			};
		private static final int /*@NonNull*/ [] __When_Unless = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Workflow =
			{
				Fragments._Workflow__OclAny /* 0 */,
				Fragments._Workflow__OclElement /* 1 */,
				Fragments._Workflow__Workflow /* 2 */
			};
		private static final int /*@NonNull*/ [] __Workflow = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AddSSHKeys.initFragments(_AddSSHKeys, __AddSSHKeys);
			Types._AttachWorkspace.initFragments(_AttachWorkspace, __AttachWorkspace);
			Types._BRANCH_TYPE.initFragments(_BRANCH_TYPE, __BRANCH_TYPE);
			Types._Branch.initFragments(_Branch, __Branch);
			Types._Checkout.initFragments(_Checkout, __Checkout);
			Types._Command.initFragments(_Command, __Command);
			Types._Docker.initFragments(_Docker, __Docker);
			Types._Docker_Auth.initFragments(_Docker_Auth, __Docker_Auth);
			Types._Docker_Aws_Auths.initFragments(_Docker_Aws_Auths, __Docker_Aws_Auths);
			Types._Environment.initFragments(_Environment, __Environment);
			Types._Executor.initFragments(_Executor, __Executor);
			Types._Job.initFragments(_Job, __Job);
			Types._JobWorkflow.initFragments(_JobWorkflow, __JobWorkflow);
			Types._MacOs.initFragments(_MacOs, __MacOs);
			Types._Machine.initFragments(_Machine, __Machine);
			Types._Matrix.initFragments(_Matrix, __Matrix);
			Types._MatrixParams.initFragments(_MatrixParams, __MatrixParams);
			Types._Orb.initFragments(_Orb, __Orb);
			Types._PARAMETER_TYPES.initFragments(_PARAMETER_TYPES, __PARAMETER_TYPES);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._Parameters.initFragments(_Parameters, __Parameters);
			Types._PersistToWorkspace.initFragments(_PersistToWorkspace, __PersistToWorkspace);
			Types._Pipeline.initFragments(_Pipeline, __Pipeline);
			Types._RestoreCache.initFragments(_RestoreCache, __RestoreCache);
			Types._Run.initFragments(_Run, __Run);
			Types._RunCommand.initFragments(_RunCommand, __RunCommand);
			Types._SaveCache.initFragments(_SaveCache, __SaveCache);
			Types._SetupRemoteDocker.initFragments(_SetupRemoteDocker, __SetupRemoteDocker);
			Types._Step.initFragments(_Step, __Step);
			Types._StoreArtifact.initFragments(_StoreArtifact, __StoreArtifact);
			Types._StoreTestResults.initFragments(_StoreTestResults, __StoreTestResults);
			Types._Trigger.initFragments(_Trigger, __Trigger);
			Types._WHEN_TYPE.initFragments(_WHEN_TYPE, __WHEN_TYPE);
			Types._When_Unless.initFragments(_When_Unless, __When_Unless);
			Types._Workflow.initFragments(_Workflow, __Workflow);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AddSSHKeys__AddSSHKeys = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AddSSHKeys__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AddSSHKeys__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AddSSHKeys__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _AttachWorkspace__AttachWorkspace = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttachWorkspace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttachWorkspace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttachWorkspace__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _BRANCH_TYPE__BRANCH_TYPE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BRANCH_TYPE__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BRANCH_TYPE__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BRANCH_TYPE__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BRANCH_TYPE__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Branch__Branch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Checkout__Checkout = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Checkout__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Checkout__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Checkout__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Command__Command = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Command__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Command__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Docker__Docker = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Docker__Executor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Docker__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Docker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Docker_Auth__Docker_Auth = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Docker_Auth__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Docker_Auth__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Docker_Aws_Auths__Docker_Aws_Auths = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Docker_Aws_Auths__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Docker_Aws_Auths__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Environment__Environment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Executor__Executor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Executor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Executor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Job__Job = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Job__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Job__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _JobWorkflow__JobWorkflow = {};
		private static final ExecutorOperation /*@NonNull*/ [] _JobWorkflow__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _JobWorkflow__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MacOs__MacOs = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MacOs__Executor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MacOs__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MacOs__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Machine__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Machine__Executor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Machine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Machine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Matrix__Matrix = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Matrix__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Matrix__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MatrixParams__MatrixParams = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MatrixParams__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MatrixParams__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Orb__Orb = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Orb__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Orb__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PARAMETER_TYPES__PARAMETER_TYPES = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PARAMETER_TYPES__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PARAMETER_TYPES__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PARAMETER_TYPES__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PARAMETER_TYPES__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameters__Parameters = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameters__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameters__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PersistToWorkspace__PersistToWorkspace = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistToWorkspace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistToWorkspace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistToWorkspace__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__Pipeline = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RestoreCache__RestoreCache = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RestoreCache__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RestoreCache__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RestoreCache__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Run__Run = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Run__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Run__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Run__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _RunCommand__RunCommand = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RunCommand__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RunCommand__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SaveCache__SaveCache = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SaveCache__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SaveCache__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SaveCache__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SetupRemoteDocker__SetupRemoteDocker = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SetupRemoteDocker__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SetupRemoteDocker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SetupRemoteDocker__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StoreArtifact__StoreArtifact = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoreArtifact__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoreArtifact__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoreArtifact__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StoreTestResults__StoreTestResults = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoreTestResults__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoreTestResults__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoreTestResults__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__Trigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WHEN_TYPE__WHEN_TYPE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WHEN_TYPE__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WHEN_TYPE__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WHEN_TYPE__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WHEN_TYPE__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _When_Unless__When_Unless = {};
		private static final ExecutorOperation /*@NonNull*/ [] _When_Unless__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _When_Unless__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _When_Unless__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__Workflow = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AddSSHKeys__AddSSHKeys.initOperations(_AddSSHKeys__AddSSHKeys);
			Fragments._AddSSHKeys__OclAny.initOperations(_AddSSHKeys__OclAny);
			Fragments._AddSSHKeys__OclElement.initOperations(_AddSSHKeys__OclElement);
			Fragments._AddSSHKeys__Step.initOperations(_AddSSHKeys__Step);

			Fragments._AttachWorkspace__AttachWorkspace.initOperations(_AttachWorkspace__AttachWorkspace);
			Fragments._AttachWorkspace__OclAny.initOperations(_AttachWorkspace__OclAny);
			Fragments._AttachWorkspace__OclElement.initOperations(_AttachWorkspace__OclElement);
			Fragments._AttachWorkspace__Step.initOperations(_AttachWorkspace__Step);

			Fragments._BRANCH_TYPE__BRANCH_TYPE.initOperations(_BRANCH_TYPE__BRANCH_TYPE);
			Fragments._BRANCH_TYPE__OclAny.initOperations(_BRANCH_TYPE__OclAny);
			Fragments._BRANCH_TYPE__OclElement.initOperations(_BRANCH_TYPE__OclElement);
			Fragments._BRANCH_TYPE__OclEnumeration.initOperations(_BRANCH_TYPE__OclEnumeration);
			Fragments._BRANCH_TYPE__OclType.initOperations(_BRANCH_TYPE__OclType);

			Fragments._Branch__Branch.initOperations(_Branch__Branch);
			Fragments._Branch__OclAny.initOperations(_Branch__OclAny);
			Fragments._Branch__OclElement.initOperations(_Branch__OclElement);

			Fragments._Checkout__Checkout.initOperations(_Checkout__Checkout);
			Fragments._Checkout__OclAny.initOperations(_Checkout__OclAny);
			Fragments._Checkout__OclElement.initOperations(_Checkout__OclElement);
			Fragments._Checkout__Step.initOperations(_Checkout__Step);

			Fragments._Command__Command.initOperations(_Command__Command);
			Fragments._Command__OclAny.initOperations(_Command__OclAny);
			Fragments._Command__OclElement.initOperations(_Command__OclElement);

			Fragments._Docker__Docker.initOperations(_Docker__Docker);
			Fragments._Docker__Executor.initOperations(_Docker__Executor);
			Fragments._Docker__OclAny.initOperations(_Docker__OclAny);
			Fragments._Docker__OclElement.initOperations(_Docker__OclElement);

			Fragments._Docker_Auth__Docker_Auth.initOperations(_Docker_Auth__Docker_Auth);
			Fragments._Docker_Auth__OclAny.initOperations(_Docker_Auth__OclAny);
			Fragments._Docker_Auth__OclElement.initOperations(_Docker_Auth__OclElement);

			Fragments._Docker_Aws_Auths__Docker_Aws_Auths.initOperations(_Docker_Aws_Auths__Docker_Aws_Auths);
			Fragments._Docker_Aws_Auths__OclAny.initOperations(_Docker_Aws_Auths__OclAny);
			Fragments._Docker_Aws_Auths__OclElement.initOperations(_Docker_Aws_Auths__OclElement);

			Fragments._Environment__Environment.initOperations(_Environment__Environment);
			Fragments._Environment__OclAny.initOperations(_Environment__OclAny);
			Fragments._Environment__OclElement.initOperations(_Environment__OclElement);

			Fragments._Executor__Executor.initOperations(_Executor__Executor);
			Fragments._Executor__OclAny.initOperations(_Executor__OclAny);
			Fragments._Executor__OclElement.initOperations(_Executor__OclElement);

			Fragments._Job__Job.initOperations(_Job__Job);
			Fragments._Job__OclAny.initOperations(_Job__OclAny);
			Fragments._Job__OclElement.initOperations(_Job__OclElement);

			Fragments._JobWorkflow__JobWorkflow.initOperations(_JobWorkflow__JobWorkflow);
			Fragments._JobWorkflow__OclAny.initOperations(_JobWorkflow__OclAny);
			Fragments._JobWorkflow__OclElement.initOperations(_JobWorkflow__OclElement);

			Fragments._MacOs__Executor.initOperations(_MacOs__Executor);
			Fragments._MacOs__MacOs.initOperations(_MacOs__MacOs);
			Fragments._MacOs__OclAny.initOperations(_MacOs__OclAny);
			Fragments._MacOs__OclElement.initOperations(_MacOs__OclElement);

			Fragments._Machine__Executor.initOperations(_Machine__Executor);
			Fragments._Machine__Machine.initOperations(_Machine__Machine);
			Fragments._Machine__OclAny.initOperations(_Machine__OclAny);
			Fragments._Machine__OclElement.initOperations(_Machine__OclElement);

			Fragments._Matrix__Matrix.initOperations(_Matrix__Matrix);
			Fragments._Matrix__OclAny.initOperations(_Matrix__OclAny);
			Fragments._Matrix__OclElement.initOperations(_Matrix__OclElement);

			Fragments._MatrixParams__MatrixParams.initOperations(_MatrixParams__MatrixParams);
			Fragments._MatrixParams__OclAny.initOperations(_MatrixParams__OclAny);
			Fragments._MatrixParams__OclElement.initOperations(_MatrixParams__OclElement);

			Fragments._Orb__OclAny.initOperations(_Orb__OclAny);
			Fragments._Orb__OclElement.initOperations(_Orb__OclElement);
			Fragments._Orb__Orb.initOperations(_Orb__Orb);

			Fragments._PARAMETER_TYPES__OclAny.initOperations(_PARAMETER_TYPES__OclAny);
			Fragments._PARAMETER_TYPES__OclElement.initOperations(_PARAMETER_TYPES__OclElement);
			Fragments._PARAMETER_TYPES__OclEnumeration.initOperations(_PARAMETER_TYPES__OclEnumeration);
			Fragments._PARAMETER_TYPES__OclType.initOperations(_PARAMETER_TYPES__OclType);
			Fragments._PARAMETER_TYPES__PARAMETER_TYPES.initOperations(_PARAMETER_TYPES__PARAMETER_TYPES);

			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._Parameters__OclAny.initOperations(_Parameters__OclAny);
			Fragments._Parameters__OclElement.initOperations(_Parameters__OclElement);
			Fragments._Parameters__Parameters.initOperations(_Parameters__Parameters);

			Fragments._PersistToWorkspace__OclAny.initOperations(_PersistToWorkspace__OclAny);
			Fragments._PersistToWorkspace__OclElement.initOperations(_PersistToWorkspace__OclElement);
			Fragments._PersistToWorkspace__PersistToWorkspace.initOperations(_PersistToWorkspace__PersistToWorkspace);
			Fragments._PersistToWorkspace__Step.initOperations(_PersistToWorkspace__Step);

			Fragments._Pipeline__OclAny.initOperations(_Pipeline__OclAny);
			Fragments._Pipeline__OclElement.initOperations(_Pipeline__OclElement);
			Fragments._Pipeline__Pipeline.initOperations(_Pipeline__Pipeline);

			Fragments._RestoreCache__OclAny.initOperations(_RestoreCache__OclAny);
			Fragments._RestoreCache__OclElement.initOperations(_RestoreCache__OclElement);
			Fragments._RestoreCache__RestoreCache.initOperations(_RestoreCache__RestoreCache);
			Fragments._RestoreCache__Step.initOperations(_RestoreCache__Step);

			Fragments._Run__OclAny.initOperations(_Run__OclAny);
			Fragments._Run__OclElement.initOperations(_Run__OclElement);
			Fragments._Run__Run.initOperations(_Run__Run);
			Fragments._Run__Step.initOperations(_Run__Step);

			Fragments._RunCommand__OclAny.initOperations(_RunCommand__OclAny);
			Fragments._RunCommand__OclElement.initOperations(_RunCommand__OclElement);
			Fragments._RunCommand__RunCommand.initOperations(_RunCommand__RunCommand);

			Fragments._SaveCache__OclAny.initOperations(_SaveCache__OclAny);
			Fragments._SaveCache__OclElement.initOperations(_SaveCache__OclElement);
			Fragments._SaveCache__SaveCache.initOperations(_SaveCache__SaveCache);
			Fragments._SaveCache__Step.initOperations(_SaveCache__Step);

			Fragments._SetupRemoteDocker__OclAny.initOperations(_SetupRemoteDocker__OclAny);
			Fragments._SetupRemoteDocker__OclElement.initOperations(_SetupRemoteDocker__OclElement);
			Fragments._SetupRemoteDocker__SetupRemoteDocker.initOperations(_SetupRemoteDocker__SetupRemoteDocker);
			Fragments._SetupRemoteDocker__Step.initOperations(_SetupRemoteDocker__Step);

			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._StoreArtifact__OclAny.initOperations(_StoreArtifact__OclAny);
			Fragments._StoreArtifact__OclElement.initOperations(_StoreArtifact__OclElement);
			Fragments._StoreArtifact__Step.initOperations(_StoreArtifact__Step);
			Fragments._StoreArtifact__StoreArtifact.initOperations(_StoreArtifact__StoreArtifact);

			Fragments._StoreTestResults__OclAny.initOperations(_StoreTestResults__OclAny);
			Fragments._StoreTestResults__OclElement.initOperations(_StoreTestResults__OclElement);
			Fragments._StoreTestResults__Step.initOperations(_StoreTestResults__Step);
			Fragments._StoreTestResults__StoreTestResults.initOperations(_StoreTestResults__StoreTestResults);

			Fragments._Trigger__OclAny.initOperations(_Trigger__OclAny);
			Fragments._Trigger__OclElement.initOperations(_Trigger__OclElement);
			Fragments._Trigger__Trigger.initOperations(_Trigger__Trigger);

			Fragments._WHEN_TYPE__OclAny.initOperations(_WHEN_TYPE__OclAny);
			Fragments._WHEN_TYPE__OclElement.initOperations(_WHEN_TYPE__OclElement);
			Fragments._WHEN_TYPE__OclEnumeration.initOperations(_WHEN_TYPE__OclEnumeration);
			Fragments._WHEN_TYPE__OclType.initOperations(_WHEN_TYPE__OclType);
			Fragments._WHEN_TYPE__WHEN_TYPE.initOperations(_WHEN_TYPE__WHEN_TYPE);

			Fragments._When_Unless__OclAny.initOperations(_When_Unless__OclAny);
			Fragments._When_Unless__OclElement.initOperations(_When_Unless__OclElement);
			Fragments._When_Unless__Step.initOperations(_When_Unless__Step);
			Fragments._When_Unless__When_Unless.initOperations(_When_Unless__When_Unless);

			Fragments._Workflow__OclAny.initOperations(_Workflow__OclAny);
			Fragments._Workflow__OclElement.initOperations(_Workflow__OclElement);
			Fragments._Workflow__Workflow.initOperations(_Workflow__Workflow);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AddSSHKeys = {
			CircleCI_metamodelTables.Properties._AddSSHKeys__fingerprints,
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AttachWorkspace = {
			CircleCI_metamodelTables.Properties._AttachWorkspace__at,
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BRANCH_TYPE = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Branch = {
			CircleCI_metamodelTables.Properties._Branch__branch,
			CircleCI_metamodelTables.Properties._Branch__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Checkout = {
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Checkout__path
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Command = {
			CircleCI_metamodelTables.Properties._Command__description,
			CircleCI_metamodelTables.Properties._Command__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Command__parameters,
			CircleCI_metamodelTables.Properties._Command__steps
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Docker = {
			CircleCI_metamodelTables.Properties._Docker__command,
			CircleCI_metamodelTables.Properties._Docker__docker_auth,
			CircleCI_metamodelTables.Properties._Docker__docker_aws_auth,
			CircleCI_metamodelTables.Properties._Docker__entrypoint,
			CircleCI_metamodelTables.Properties._Executor__environments,
			CircleCI_metamodelTables.Properties._Docker__image,
			CircleCI_metamodelTables.Properties._Executor__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Executor__resourceClass,
			CircleCI_metamodelTables.Properties._Executor__shell,
			CircleCI_metamodelTables.Properties._Docker__user,
			CircleCI_metamodelTables.Properties._Executor__working_directory
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Docker_Auth = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Docker_Auth__password,
			CircleCI_metamodelTables.Properties._Docker_Auth__username
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Docker_Aws_Auths = {
			CircleCI_metamodelTables.Properties._Docker_Aws_Auths__aws_access_key_id,
			CircleCI_metamodelTables.Properties._Docker_Aws_Auths__aws_secret_access_key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Environment = {
			CircleCI_metamodelTables.Properties._Environment__key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Environment__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Executor = {
			CircleCI_metamodelTables.Properties._Executor__environments,
			CircleCI_metamodelTables.Properties._Executor__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Executor__resourceClass,
			CircleCI_metamodelTables.Properties._Executor__shell,
			CircleCI_metamodelTables.Properties._Executor__working_directory
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Job = {
			CircleCI_metamodelTables.Properties._Job__environments,
			CircleCI_metamodelTables.Properties._Job__executors,
			CircleCI_metamodelTables.Properties._Job__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Job__parallelism,
			CircleCI_metamodelTables.Properties._Job__parameters,
			CircleCI_metamodelTables.Properties._Job__reuseExecutor,
			CircleCI_metamodelTables.Properties._Job__steps
		};

		private static final ExecutorProperty /*@NonNull*/ [] _JobWorkflow = {
			CircleCI_metamodelTables.Properties._JobWorkflow__approvalJob,
			CircleCI_metamodelTables.Properties._JobWorkflow__branches,
			CircleCI_metamodelTables.Properties._JobWorkflow__context,
			CircleCI_metamodelTables.Properties._JobWorkflow__matrix,
			CircleCI_metamodelTables.Properties._JobWorkflow__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._JobWorkflow__requires
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MacOs = {
			CircleCI_metamodelTables.Properties._Executor__environments,
			CircleCI_metamodelTables.Properties._Executor__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Executor__resourceClass,
			CircleCI_metamodelTables.Properties._Executor__shell,
			CircleCI_metamodelTables.Properties._Executor__working_directory,
			CircleCI_metamodelTables.Properties._MacOs__xcode
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Machine = {
			CircleCI_metamodelTables.Properties._Machine__docker_layer_caching,
			CircleCI_metamodelTables.Properties._Executor__environments,
			CircleCI_metamodelTables.Properties._Machine__image,
			CircleCI_metamodelTables.Properties._Executor__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Executor__resourceClass,
			CircleCI_metamodelTables.Properties._Executor__shell,
			CircleCI_metamodelTables.Properties._Executor__working_directory
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Matrix = {
			CircleCI_metamodelTables.Properties._Matrix__alias,
			CircleCI_metamodelTables.Properties._Matrix__matrix_exclude,
			CircleCI_metamodelTables.Properties._Matrix__matrix_params,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MatrixParams = {
			CircleCI_metamodelTables.Properties._MatrixParams__key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._MatrixParams__values
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Orb = {
			CircleCI_metamodelTables.Properties._Orb__key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Orb__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PARAMETER_TYPES = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			CircleCI_metamodelTables.Properties._Parameter__default,
			CircleCI_metamodelTables.Properties._Parameter__description,
			CircleCI_metamodelTables.Properties._Parameter__enumValues,
			CircleCI_metamodelTables.Properties._Parameter__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Parameter__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameters = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Parameters__parameter
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PersistToWorkspace = {
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._PersistToWorkspace__paths,
			CircleCI_metamodelTables.Properties._PersistToWorkspace__root
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Pipeline = {
			CircleCI_metamodelTables.Properties._Pipeline__commands,
			CircleCI_metamodelTables.Properties._Pipeline__executors,
			CircleCI_metamodelTables.Properties._Pipeline__jobs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Pipeline__orbs,
			CircleCI_metamodelTables.Properties._Pipeline__setup,
			CircleCI_metamodelTables.Properties._Pipeline__version,
			CircleCI_metamodelTables.Properties._Pipeline__workflow
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RestoreCache = {
			CircleCI_metamodelTables.Properties._RestoreCache__key,
			CircleCI_metamodelTables.Properties._RestoreCache__keys,
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Run = {
			CircleCI_metamodelTables.Properties._Run__background,
			CircleCI_metamodelTables.Properties._Run__environments,
			CircleCI_metamodelTables.Properties._Step__name,
			CircleCI_metamodelTables.Properties._Run__no_output_timeout,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Run__parameters,
			CircleCI_metamodelTables.Properties._Run__run_commands,
			CircleCI_metamodelTables.Properties._Run__shell,
			CircleCI_metamodelTables.Properties._Run__when,
			CircleCI_metamodelTables.Properties._Run__working_directory
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RunCommand = {
			CircleCI_metamodelTables.Properties._RunCommand__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SaveCache = {
			CircleCI_metamodelTables.Properties._SaveCache__key,
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._SaveCache__paths,
			CircleCI_metamodelTables.Properties._SaveCache__when
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SetupRemoteDocker = {
			CircleCI_metamodelTables.Properties._SetupRemoteDocker__docker_layer_caching,
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._SetupRemoteDocker__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Step = {
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StoreArtifact = {
			CircleCI_metamodelTables.Properties._StoreArtifact__destination,
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._StoreArtifact__path
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StoreTestResults = {
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._StoreTestResults__path
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Trigger = {
			CircleCI_metamodelTables.Properties._Trigger__cron,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WHEN_TYPE = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _When_Unless = {
			CircleCI_metamodelTables.Properties._When_Unless__condition,
			CircleCI_metamodelTables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._When_Unless__unless_step,
			CircleCI_metamodelTables.Properties._When_Unless__when_step
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Workflow = {
			CircleCI_metamodelTables.Properties._Workflow__branches,
			CircleCI_metamodelTables.Properties._Workflow__jobworkflow,
			CircleCI_metamodelTables.Properties._Workflow__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CircleCI_metamodelTables.Properties._Workflow__triggers,
			CircleCI_metamodelTables.Properties._Workflow__version,
			CircleCI_metamodelTables.Properties._Workflow__when_unless
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AddSSHKeys__AddSSHKeys.initProperties(_AddSSHKeys);
			Fragments._AttachWorkspace__AttachWorkspace.initProperties(_AttachWorkspace);
			Fragments._BRANCH_TYPE__BRANCH_TYPE.initProperties(_BRANCH_TYPE);
			Fragments._Branch__Branch.initProperties(_Branch);
			Fragments._Checkout__Checkout.initProperties(_Checkout);
			Fragments._Command__Command.initProperties(_Command);
			Fragments._Docker__Docker.initProperties(_Docker);
			Fragments._Docker_Auth__Docker_Auth.initProperties(_Docker_Auth);
			Fragments._Docker_Aws_Auths__Docker_Aws_Auths.initProperties(_Docker_Aws_Auths);
			Fragments._Environment__Environment.initProperties(_Environment);
			Fragments._Executor__Executor.initProperties(_Executor);
			Fragments._Job__Job.initProperties(_Job);
			Fragments._JobWorkflow__JobWorkflow.initProperties(_JobWorkflow);
			Fragments._MacOs__MacOs.initProperties(_MacOs);
			Fragments._Machine__Machine.initProperties(_Machine);
			Fragments._Matrix__Matrix.initProperties(_Matrix);
			Fragments._MatrixParams__MatrixParams.initProperties(_MatrixParams);
			Fragments._Orb__Orb.initProperties(_Orb);
			Fragments._PARAMETER_TYPES__PARAMETER_TYPES.initProperties(_PARAMETER_TYPES);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._Parameters__Parameters.initProperties(_Parameters);
			Fragments._PersistToWorkspace__PersistToWorkspace.initProperties(_PersistToWorkspace);
			Fragments._Pipeline__Pipeline.initProperties(_Pipeline);
			Fragments._RestoreCache__RestoreCache.initProperties(_RestoreCache);
			Fragments._Run__Run.initProperties(_Run);
			Fragments._RunCommand__RunCommand.initProperties(_RunCommand);
			Fragments._SaveCache__SaveCache.initProperties(_SaveCache);
			Fragments._SetupRemoteDocker__SetupRemoteDocker.initProperties(_SetupRemoteDocker);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._StoreArtifact__StoreArtifact.initProperties(_StoreArtifact);
			Fragments._StoreTestResults__StoreTestResults.initProperties(_StoreTestResults);
			Fragments._Trigger__Trigger.initProperties(_Trigger);
			Fragments._WHEN_TYPE__WHEN_TYPE.initProperties(_WHEN_TYPE);
			Fragments._When_Unless__When_Unless.initProperties(_When_Unless);
			Fragments._Workflow__Workflow.initProperties(_Workflow);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _BRANCH_TYPE__only = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.BRANCH_TYPE.getEEnumLiteral("only"), Types._BRANCH_TYPE, 0);
		public static final EcoreExecutorEnumerationLiteral _BRANCH_TYPE__ignore = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.BRANCH_TYPE.getEEnumLiteral("ignore"), Types._BRANCH_TYPE, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _BRANCH_TYPE = {
			_BRANCH_TYPE__only,
			_BRANCH_TYPE__ignore
		};

		public static final EcoreExecutorEnumerationLiteral _PARAMETER_TYPES__STRING = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES.getEEnumLiteral("STRING"), Types._PARAMETER_TYPES, 0);
		public static final EcoreExecutorEnumerationLiteral _PARAMETER_TYPES__BOOLEAN = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES.getEEnumLiteral("BOOLEAN"), Types._PARAMETER_TYPES, 1);
		public static final EcoreExecutorEnumerationLiteral _PARAMETER_TYPES__INTEGER = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES.getEEnumLiteral("INTEGER"), Types._PARAMETER_TYPES, 2);
		public static final EcoreExecutorEnumerationLiteral _PARAMETER_TYPES__ENUM = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES.getEEnumLiteral("ENUM"), Types._PARAMETER_TYPES, 3);
		public static final EcoreExecutorEnumerationLiteral _PARAMETER_TYPES__EXECUTOR = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES.getEEnumLiteral("EXECUTOR"), Types._PARAMETER_TYPES, 4);
		public static final EcoreExecutorEnumerationLiteral _PARAMETER_TYPES__STEPS = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES.getEEnumLiteral("STEPS"), Types._PARAMETER_TYPES, 5);
		public static final EcoreExecutorEnumerationLiteral _PARAMETER_TYPES__ENVIRONMENT_VARIABLE_NAME = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.PARAMETER_TYPES.getEEnumLiteral("ENVIRONMENT_VARIABLE_NAME"), Types._PARAMETER_TYPES, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PARAMETER_TYPES = {
			_PARAMETER_TYPES__STRING,
			_PARAMETER_TYPES__BOOLEAN,
			_PARAMETER_TYPES__INTEGER,
			_PARAMETER_TYPES__ENUM,
			_PARAMETER_TYPES__EXECUTOR,
			_PARAMETER_TYPES__STEPS,
			_PARAMETER_TYPES__ENVIRONMENT_VARIABLE_NAME
		};

		public static final EcoreExecutorEnumerationLiteral _WHEN_TYPE__on_success = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.WHEN_TYPE.getEEnumLiteral("on_success"), Types._WHEN_TYPE, 0);
		public static final EcoreExecutorEnumerationLiteral _WHEN_TYPE__always = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.WHEN_TYPE.getEEnumLiteral("always"), Types._WHEN_TYPE, 1);
		public static final EcoreExecutorEnumerationLiteral _WHEN_TYPE__on_fail = new EcoreExecutorEnumerationLiteral(CircleCI_metamodelPackage.Literals.WHEN_TYPE.getEEnumLiteral("on_fail"), Types._WHEN_TYPE, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _WHEN_TYPE = {
			_WHEN_TYPE__on_success,
			_WHEN_TYPE__always,
			_WHEN_TYPE__on_fail
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._BRANCH_TYPE.initLiterals(_BRANCH_TYPE);
			Types._PARAMETER_TYPES.initLiterals(_PARAMETER_TYPES);
			Types._WHEN_TYPE.initLiterals(_WHEN_TYPE);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CircleCI_metamodelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new CircleCI_metamodelTables();
	}

	private CircleCI_metamodelTables() {
		super(CircleCI_metamodelPackage.eNS_URI);
	}
}
