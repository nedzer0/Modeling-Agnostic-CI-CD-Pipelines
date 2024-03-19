/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.*;

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
public class Jenkins_metamodelFactoryImpl extends EFactoryImpl implements Jenkins_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Jenkins_metamodelFactory init() {
		try {
			Jenkins_metamodelFactory theJenkins_metamodelFactory = (Jenkins_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Jenkins_metamodelPackage.eNS_URI);
			if (theJenkins_metamodelFactory != null) {
				return theJenkins_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Jenkins_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jenkins_metamodelFactoryImpl() {
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
		case Jenkins_metamodelPackage.PIPELINE:
			return createPipeline();
		case Jenkins_metamodelPackage.COMMAND:
			return createCommand();
		case Jenkins_metamodelPackage.STEP_PARAMETER:
			return createStep_Parameter();
		case Jenkins_metamodelPackage.ENVIRONMENT:
			return createEnvironment();
		case Jenkins_metamodelPackage.TRIGGER:
			return createTrigger();
		case Jenkins_metamodelPackage.INPUT:
			return createInput();
		case Jenkins_metamodelPackage.STAGE:
			return createStage();
		case Jenkins_metamodelPackage.STEP:
			return createStep();
		case Jenkins_metamodelPackage.ANY:
			return createAny();
		case Jenkins_metamodelPackage.NONE:
			return createNone();
		case Jenkins_metamodelPackage.NODE:
			return createNode();
		case Jenkins_metamodelPackage.DOCKER:
			return createDocker();
		case Jenkins_metamodelPackage.DOCKERFILE:
			return createDockerfile();
		case Jenkins_metamodelPackage.POST:
			return createPost();
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE:
			return createParameter_Directive();
		case Jenkins_metamodelPackage.PARAM_VALUE:
			return createParam_Value();
		case Jenkins_metamodelPackage.TOOL:
			return createTool();
		case Jenkins_metamodelPackage.CHANGE_SET:
			return createChangeSet();
		case Jenkins_metamodelPackage.BRANCH:
			return createBranch();
		case Jenkins_metamodelPackage.BUILDING_TAG:
			return createBuildingTag();
		case Jenkins_metamodelPackage.CHANGELOG:
			return createChangelog();
		case Jenkins_metamodelPackage.WHEN_ENV:
			return createWhen_Env();
		case Jenkins_metamodelPackage.EQUALS:
			return createEquals();
		case Jenkins_metamodelPackage.CHANGE_REQUEST:
			return createChangeRequest();
		case Jenkins_metamodelPackage.NOT:
			return createNot();
		case Jenkins_metamodelPackage.TAG:
			return createTag();
		case Jenkins_metamodelPackage.ALL_OF:
			return createAllOf();
		case Jenkins_metamodelPackage.ANY_OF:
			return createAnyOf();
		case Jenkins_metamodelPackage.TRIGGERED_BY:
			return createTriggeredBy();
		case Jenkins_metamodelPackage.EXPRESSION:
			return createExpression();
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
		case Jenkins_metamodelPackage.TRIGGER_TYPE:
			return createTRIGGER_TYPEFromString(eDataType, initialValue);
		case Jenkins_metamodelPackage.CONDITION_TYPE:
			return createCONDITION_TYPEFromString(eDataType, initialValue);
		case Jenkins_metamodelPackage.POST_TYPE:
			return createPOST_TYPEFromString(eDataType, initialValue);
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
		case Jenkins_metamodelPackage.TRIGGER_TYPE:
			return convertTRIGGER_TYPEToString(eDataType, instanceValue);
		case Jenkins_metamodelPackage.CONDITION_TYPE:
			return convertCONDITION_TYPEToString(eDataType, instanceValue);
		case Jenkins_metamodelPackage.POST_TYPE:
			return convertPOST_TYPEToString(eDataType, instanceValue);
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
	public Step_Parameter createStep_Parameter() {
		Step_ParameterImpl step_Parameter = new Step_ParameterImpl();
		return step_Parameter;
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
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public None createNone() {
		NoneImpl none = new NoneImpl();
		return none;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
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
	public Dockerfile createDockerfile() {
		DockerfileImpl dockerfile = new DockerfileImpl();
		return dockerfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter_Directive createParameter_Directive() {
		Parameter_DirectiveImpl parameter_Directive = new Parameter_DirectiveImpl();
		return parameter_Directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Param_Value createParam_Value() {
		Param_ValueImpl param_Value = new Param_ValueImpl();
		return param_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeSet createChangeSet() {
		ChangeSetImpl changeSet = new ChangeSetImpl();
		return changeSet;
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
	public BuildingTag createBuildingTag() {
		BuildingTagImpl buildingTag = new BuildingTagImpl();
		return buildingTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Changelog createChangelog() {
		ChangelogImpl changelog = new ChangelogImpl();
		return changelog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When_Env createWhen_Env() {
		When_EnvImpl when_Env = new When_EnvImpl();
		return when_Env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeRequest createChangeRequest() {
		ChangeRequestImpl changeRequest = new ChangeRequestImpl();
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllOf createAllOf() {
		AllOfImpl allOf = new AllOfImpl();
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyOf createAnyOf() {
		AnyOfImpl anyOf = new AnyOfImpl();
		return anyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggeredBy createTriggeredBy() {
		TriggeredByImpl triggeredBy = new TriggeredByImpl();
		return triggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRIGGER_TYPE createTRIGGER_TYPEFromString(EDataType eDataType, String initialValue) {
		TRIGGER_TYPE result = TRIGGER_TYPE.get(initialValue);
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
	public String convertTRIGGER_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONDITION_TYPE createCONDITION_TYPEFromString(EDataType eDataType, String initialValue) {
		CONDITION_TYPE result = CONDITION_TYPE.get(initialValue);
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
	public String convertCONDITION_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POST_TYPE createPOST_TYPEFromString(EDataType eDataType, String initialValue) {
		POST_TYPE result = POST_TYPE.get(initialValue);
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
	public String convertPOST_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jenkins_metamodelPackage getJenkins_metamodelPackage() {
		return (Jenkins_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Jenkins_metamodelPackage getPackage() {
		return Jenkins_metamodelPackage.eINSTANCE;
	}

} //Jenkins_metamodelFactoryImpl
