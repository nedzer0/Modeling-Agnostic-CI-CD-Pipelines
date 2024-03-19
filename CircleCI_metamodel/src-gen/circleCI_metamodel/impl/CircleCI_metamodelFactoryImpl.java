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
		case CircleCI_metamodelPackage.PIPELINE:
			return createPipeline();
		case CircleCI_metamodelPackage.STEP:
			return createStep();
		case CircleCI_metamodelPackage.DOCKER:
			return createDocker();
		case CircleCI_metamodelPackage.LINUX:
			return createLinux();
		case CircleCI_metamodelPackage.MAC_OS:
			return createMacOs();
		case CircleCI_metamodelPackage.WINDOWS_ORB:
			return createWindowsOrb();
		case CircleCI_metamodelPackage.ORB:
			return createOrb();
		case CircleCI_metamodelPackage.COMMAND:
			return createCommand();
		case CircleCI_metamodelPackage.WORKFLOW:
			return createWorkflow();
		case CircleCI_metamodelPackage.ENVIRONMENT:
			return createEnvironment();
		case CircleCI_metamodelPackage.PARAMETERS:
			return createParameters();
		case CircleCI_metamodelPackage.TOOL_FRAMEWORK:
			return createTool_Framework();
		case CircleCI_metamodelPackage.WHEN_UNLESS:
			return createWhen_Unless();
		case CircleCI_metamodelPackage.WHEN_ATTRIBUTE:
			return createWhen_Attribute();
		case CircleCI_metamodelPackage.TRIGGER:
			return createTrigger();
		case CircleCI_metamodelPackage.BRANCH:
			return createBranch();
		case CircleCI_metamodelPackage.JOB:
			return createJob();
		case CircleCI_metamodelPackage.STORE_ARTIFACT:
			return createStore_Artifact();
		case CircleCI_metamodelPackage.COMMAND_PARAMS:
			return createCommand_Params();
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
		case CircleCI_metamodelPackage.WHEN_TYPE:
			return createWHEN_TYPEFromString(eDataType, initialValue);
		case CircleCI_metamodelPackage.BRANCH_TYPE:
			return createBRANCH_TYPEFromString(eDataType, initialValue);
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
		case CircleCI_metamodelPackage.WHEN_TYPE:
			return convertWHEN_TYPEToString(eDataType, instanceValue);
		case CircleCI_metamodelPackage.BRANCH_TYPE:
			return convertBRANCH_TYPEToString(eDataType, instanceValue);
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
	public Linux createLinux() {
		LinuxImpl linux = new LinuxImpl();
		return linux;
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
	public WindowsOrb createWindowsOrb() {
		WindowsOrbImpl windowsOrb = new WindowsOrbImpl();
		return windowsOrb;
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
	public Tool_Framework createTool_Framework() {
		Tool_FrameworkImpl tool_Framework = new Tool_FrameworkImpl();
		return tool_Framework;
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
	public When_Attribute createWhen_Attribute() {
		When_AttributeImpl when_Attribute = new When_AttributeImpl();
		return when_Attribute;
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
	public Store_Artifact createStore_Artifact() {
		Store_ArtifactImpl store_Artifact = new Store_ArtifactImpl();
		return store_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command_Params createCommand_Params() {
		Command_ParamsImpl command_Params = new Command_ParamsImpl();
		return command_Params;
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
