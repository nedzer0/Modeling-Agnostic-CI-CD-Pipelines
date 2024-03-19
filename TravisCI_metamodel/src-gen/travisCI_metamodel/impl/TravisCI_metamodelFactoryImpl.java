/**
 */
package travisCI_metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import travisCI_metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravisCI_metamodelFactoryImpl extends EFactoryImpl implements TravisCI_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TravisCI_metamodelFactory init() {
		try {
			TravisCI_metamodelFactory theTravisCI_metamodelFactory = (TravisCI_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(TravisCI_metamodelPackage.eNS_URI);
			if (theTravisCI_metamodelFactory != null) {
				return theTravisCI_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TravisCI_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravisCI_metamodelFactoryImpl() {
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
		case TravisCI_metamodelPackage.ON:
			return createOn();
		case TravisCI_metamodelPackage.BRANCH:
			return createBranch();
		case TravisCI_metamodelPackage.RUBYGEMS:
			return createRubygems();
		case TravisCI_metamodelPackage.GIT_HUB:
			return createGitHub();
		case TravisCI_metamodelPackage.HEROKU:
			return createHeroku();
		case TravisCI_metamodelPackage.PIPELINE:
			return createPipeline();
		case TravisCI_metamodelPackage.ENVIRONMENT:
			return createEnvironment();
		case TravisCI_metamodelPackage.ALLOW_FAILURE:
			return createAllow_Failure();
		case TravisCI_metamodelPackage.INSTALL:
			return createInstall();
		case TravisCI_metamodelPackage.ARTIFACT:
			return createArtifact();
		case TravisCI_metamodelPackage.SERVICE:
			return createService();
		case TravisCI_metamodelPackage.JOB:
			return createJob();
		case TravisCI_metamodelPackage.NPM:
			return createNpm();
		case TravisCI_metamodelPackage.LANGUAGE:
			return createLanguage();
		case TravisCI_metamodelPackage.TOOL_FRAMEWORK:
			return createTool_Framework();
		case TravisCI_metamodelPackage.IF:
			return createIf();
		case TravisCI_metamodelPackage.STAGE:
			return createStage();
		case TravisCI_metamodelPackage.PARAMETERS:
			return createParameters();
		case TravisCI_metamodelPackage.SCRIPT:
			return createScript();
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
		case TravisCI_metamodelPackage.BRANCH_TYPE:
			return createBRANCH_TYPEFromString(eDataType, initialValue);
		case TravisCI_metamodelPackage.ENV_TYPE:
			return createENV_TYPEFromString(eDataType, initialValue);
		case TravisCI_metamodelPackage.STAGE_TYPE:
			return createSTAGE_TYPEFromString(eDataType, initialValue);
		case TravisCI_metamodelPackage.JOB_TYPE:
			return createJOB_TYPEFromString(eDataType, initialValue);
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
		case TravisCI_metamodelPackage.BRANCH_TYPE:
			return convertBRANCH_TYPEToString(eDataType, instanceValue);
		case TravisCI_metamodelPackage.ENV_TYPE:
			return convertENV_TYPEToString(eDataType, instanceValue);
		case TravisCI_metamodelPackage.STAGE_TYPE:
			return convertSTAGE_TYPEToString(eDataType, instanceValue);
		case TravisCI_metamodelPackage.JOB_TYPE:
			return convertJOB_TYPEToString(eDataType, instanceValue);
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
	public On createOn() {
		OnImpl on = new OnImpl();
		return on;
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
	public Rubygems createRubygems() {
		RubygemsImpl rubygems = new RubygemsImpl();
		return rubygems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GitHub createGitHub() {
		GitHubImpl gitHub = new GitHubImpl();
		return gitHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heroku createHeroku() {
		HerokuImpl heroku = new HerokuImpl();
		return heroku;
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
	public Allow_Failure createAllow_Failure() {
		Allow_FailureImpl allow_Failure = new Allow_FailureImpl();
		return allow_Failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Install createInstall() {
		InstallImpl install = new InstallImpl();
		return install;
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
	public Npm createNpm() {
		NpmImpl npm = new NpmImpl();
		return npm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
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
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
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
	public ENV_TYPE createENV_TYPEFromString(EDataType eDataType, String initialValue) {
		ENV_TYPE result = ENV_TYPE.get(initialValue);
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
	public String convertENV_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STAGE_TYPE createSTAGE_TYPEFromString(EDataType eDataType, String initialValue) {
		STAGE_TYPE result = STAGE_TYPE.get(initialValue);
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
	public String convertSTAGE_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOB_TYPE createJOB_TYPEFromString(EDataType eDataType, String initialValue) {
		JOB_TYPE result = JOB_TYPE.get(initialValue);
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
	public String convertJOB_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TravisCI_metamodelPackage getTravisCI_metamodelPackage() {
		return (TravisCI_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TravisCI_metamodelPackage getPackage() {
		return TravisCI_metamodelPackage.eINSTANCE;
	}

} //TravisCI_metamodelFactoryImpl
