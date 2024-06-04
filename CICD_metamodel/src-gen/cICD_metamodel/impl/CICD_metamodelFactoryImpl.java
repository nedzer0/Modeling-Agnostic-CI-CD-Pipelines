/**
 */
package cICD_metamodel.impl;

import cICD_metamodel.*;

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
public class CICD_metamodelFactoryImpl extends EFactoryImpl implements CICD_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CICD_metamodelFactory init() {
		try {
			CICD_metamodelFactory theCICD_metamodelFactory = (CICD_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(CICD_metamodelPackage.eNS_URI);
			if (theCICD_metamodelFactory != null) {
				return theCICD_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CICD_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICD_metamodelFactoryImpl() {
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
		case CICD_metamodelPackage.COMMAND:
			return createCommand();
		case CICD_metamodelPackage.ENVIRONMENT:
			return createEnvironment();
		case CICD_metamodelPackage.STEP:
			return createStep();
		case CICD_metamodelPackage.IF_STEP:
			return createIfStep();
		case CICD_metamodelPackage.SCHEDULE_TRIGGER:
			return createScheduleTrigger();
		case CICD_metamodelPackage.AGENT:
			return createAgent();
		case CICD_metamodelPackage.MATRIX_CONFIG:
			return createMatrixConfig();
		case CICD_metamodelPackage.PARAMETERS:
			return createParameters();
		case CICD_metamodelPackage.JOB:
			return createJob();
		case CICD_metamodelPackage.PIPELINE:
			return createPipeline();
		case CICD_metamodelPackage.MATRIX:
			return createMatrix();
		case CICD_metamodelPackage.CACHE:
			return createCache();
		case CICD_metamodelPackage.ARTIFACT:
			return createArtifact();
		case CICD_metamodelPackage.INPUT:
			return createInput();
		case CICD_metamodelPackage.OUTPUT:
			return createOutput();
		case CICD_metamodelPackage.DOCKER_CONTAINER:
			return createDockerContainer();
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
		case CICD_metamodelPackage.CACHE_MODE:
			return createCACHE_MODEFromString(eDataType, initialValue);
		case CICD_metamodelPackage.INPUT_TYPE:
			return createINPUT_TYPEFromString(eDataType, initialValue);
		case CICD_metamodelPackage.ARTIFACT_TYPE:
			return createARTIFACT_TYPEFromString(eDataType, initialValue);
		case CICD_metamodelPackage.MATRIX_CONFIG_TYPE:
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
		case CICD_metamodelPackage.CACHE_MODE:
			return convertCACHE_MODEToString(eDataType, instanceValue);
		case CICD_metamodelPackage.INPUT_TYPE:
			return convertINPUT_TYPEToString(eDataType, instanceValue);
		case CICD_metamodelPackage.ARTIFACT_TYPE:
			return convertARTIFACT_TYPEToString(eDataType, instanceValue);
		case CICD_metamodelPackage.MATRIX_CONFIG_TYPE:
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
	public IfStep createIfStep() {
		IfStepImpl ifStep = new IfStepImpl();
		return ifStep;
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
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
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
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
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
	public DockerContainer createDockerContainer() {
		DockerContainerImpl dockerContainer = new DockerContainerImpl();
		return dockerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CACHE_MODE createCACHE_MODEFromString(EDataType eDataType, String initialValue) {
		CACHE_MODE result = CACHE_MODE.get(initialValue);
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
	public String convertCACHE_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INPUT_TYPE createINPUT_TYPEFromString(EDataType eDataType, String initialValue) {
		INPUT_TYPE result = INPUT_TYPE.get(initialValue);
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
	public String convertINPUT_TYPEToString(EDataType eDataType, Object instanceValue) {
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
	public CICD_metamodelPackage getCICD_metamodelPackage() {
		return (CICD_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CICD_metamodelPackage getPackage() {
		return CICD_metamodelPackage.eINSTANCE;
	}

} //CICD_metamodelFactoryImpl
