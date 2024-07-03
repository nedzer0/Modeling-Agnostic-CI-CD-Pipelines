/**
 */
package jenkins_metamodel.util;

import jenkins_metamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jenkins_metamodel.Jenkins_metamodelPackage
 * @generated
 */
public class Jenkins_metamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Jenkins_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jenkins_metamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = Jenkins_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Jenkins_metamodelPackage.BUILDING_TAG: {
			BuildingTag buildingTag = (BuildingTag) theEObject;
			T result = caseBuildingTag(buildingTag);
			if (result == null)
				result = caseWhen(buildingTag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseAgent(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.TRIGGER: {
			Trigger trigger = (Trigger) theEObject;
			T result = caseTrigger(trigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.ANY: {
			Any any = (Any) theEObject;
			T result = caseAny(any);
			if (result == null)
				result = caseAgent(any);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.BRANCH: {
			Branch branch = (Branch) theEObject;
			T result = caseBranch(branch);
			if (result == null)
				result = caseWhen(branch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.CHANGELOG: {
			Changelog changelog = (Changelog) theEObject;
			T result = caseChangelog(changelog);
			if (result == null)
				result = caseWhen(changelog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.TRIGGERED_BY: {
			TriggeredBy triggeredBy = (TriggeredBy) theEObject;
			T result = caseTriggeredBy(triggeredBy);
			if (result == null)
				result = caseWhen(triggeredBy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseWhen(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.STEP_PARAMETER: {
			Step_Parameter step_Parameter = (Step_Parameter) theEObject;
			T result = caseStep_Parameter(step_Parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.CHANGE_SET: {
			ChangeSet changeSet = (ChangeSet) theEObject;
			T result = caseChangeSet(changeSet);
			if (result == null)
				result = caseWhen(changeSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseWhen(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.POST: {
			Post post = (Post) theEObject;
			T result = casePost(post);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.ANY_OF: {
			AnyOf anyOf = (AnyOf) theEObject;
			T result = caseAnyOf(anyOf);
			if (result == null)
				result = caseWhen(anyOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.PIPELINE: {
			Pipeline pipeline = (Pipeline) theEObject;
			T result = casePipeline(pipeline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.TAG: {
			Tag tag = (Tag) theEObject;
			T result = caseTag(tag);
			if (result == null)
				result = caseWhen(tag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.WHEN_ENV: {
			When_Env when_Env = (When_Env) theEObject;
			T result = caseWhen_Env(when_Env);
			if (result == null)
				result = caseWhen(when_Env);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE: {
			Parameter_Directive parameter_Directive = (Parameter_Directive) theEObject;
			T result = caseParameter_Directive(parameter_Directive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.ALL_OF: {
			AllOf allOf = (AllOf) theEObject;
			T result = caseAllOf(allOf);
			if (result == null)
				result = caseWhen(allOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.EQUALS: {
			Equals equals = (Equals) theEObject;
			T result = caseEquals(equals);
			if (result == null)
				result = caseWhen(equals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.NONE: {
			None none = (None) theEObject;
			T result = caseNone(none);
			if (result == null)
				result = caseAgent(none);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.CHANGE_REQUEST: {
			ChangeRequest changeRequest = (ChangeRequest) theEObject;
			T result = caseChangeRequest(changeRequest);
			if (result == null)
				result = caseWhen(changeRequest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.DOCKERFILE: {
			Dockerfile dockerfile = (Dockerfile) theEObject;
			T result = caseDockerfile(dockerfile);
			if (result == null)
				result = caseAgent(dockerfile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.DOCKER: {
			Docker docker = (Docker) theEObject;
			T result = caseDocker(docker);
			if (result == null)
				result = caseAgent(docker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.STAGE: {
			Stage stage = (Stage) theEObject;
			T result = caseStage(stage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.WHEN: {
			When when = (When) theEObject;
			T result = caseWhen(when);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.TOOL: {
			Tool tool = (Tool) theEObject;
			T result = caseTool(tool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.ENVIRONMENT: {
			Environment environment = (Environment) theEObject;
			T result = caseEnvironment(environment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.AGENT: {
			Agent agent = (Agent) theEObject;
			T result = caseAgent(agent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.CRON: {
			Cron cron = (Cron) theEObject;
			T result = caseCron(cron);
			if (result == null)
				result = caseTrigger(cron);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.POLL_SCM: {
			PollSCM pollSCM = (PollSCM) theEObject;
			T result = casePollSCM(pollSCM);
			if (result == null)
				result = caseTrigger(pollSCM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.UPSTREAM: {
			Upstream upstream = (Upstream) theEObject;
			T result = caseUpstream(upstream);
			if (result == null)
				result = caseTrigger(upstream);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.OPTION: {
			Option option = (Option) theEObject;
			T result = caseOption(option);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.BUILD_DISCARDER: {
			BuildDiscarder buildDiscarder = (BuildDiscarder) theEObject;
			T result = caseBuildDiscarder(buildDiscarder);
			if (result == null)
				result = caseOption(buildDiscarder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.CHECKOUT_TO_SUBDIRECTORY: {
			CheckoutToSubdirectory checkoutToSubdirectory = (CheckoutToSubdirectory) theEObject;
			T result = caseCheckoutToSubdirectory(checkoutToSubdirectory);
			if (result == null)
				result = caseOption(checkoutToSubdirectory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.SKIP_STAGES_AFTER_UNSTABLE: {
			SkipStagesAfterUnstable skipStagesAfterUnstable = (SkipStagesAfterUnstable) theEObject;
			T result = caseSkipStagesAfterUnstable(skipStagesAfterUnstable);
			if (result == null)
				result = caseOption(skipStagesAfterUnstable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.SKIP_DEFAULT_CHECKOUT: {
			SkipDefaultCheckout skipDefaultCheckout = (SkipDefaultCheckout) theEObject;
			T result = caseSkipDefaultCheckout(skipDefaultCheckout);
			if (result == null)
				result = caseOption(skipDefaultCheckout);
			if (result == null)
				result = caseStageOption(skipDefaultCheckout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.RETRY: {
			Retry retry = (Retry) theEObject;
			T result = caseRetry(retry);
			if (result == null)
				result = caseOption(retry);
			if (result == null)
				result = caseStageOption(retry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.QUIET_PERIOD: {
			QuietPeriod quietPeriod = (QuietPeriod) theEObject;
			T result = caseQuietPeriod(quietPeriod);
			if (result == null)
				result = caseOption(quietPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.PRESERVE_STASHES: {
			PreserveStashes preserveStashes = (PreserveStashes) theEObject;
			T result = casePreserveStashes(preserveStashes);
			if (result == null)
				result = caseOption(preserveStashes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.TIMEOUT: {
			Timeout timeout = (Timeout) theEObject;
			T result = caseTimeout(timeout);
			if (result == null)
				result = caseOption(timeout);
			if (result == null)
				result = caseStageOption(timeout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.PARALLELS_ALWAYS_FAIL_FAST: {
			ParallelsAlwaysFailFast parallelsAlwaysFailFast = (ParallelsAlwaysFailFast) theEObject;
			T result = caseParallelsAlwaysFailFast(parallelsAlwaysFailFast);
			if (result == null)
				result = caseOption(parallelsAlwaysFailFast);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.TIMESTAMPS: {
			Timestamps timestamps = (Timestamps) theEObject;
			T result = caseTimestamps(timestamps);
			if (result == null)
				result = caseOption(timestamps);
			if (result == null)
				result = caseStageOption(timestamps);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.DISABLE_RESTART_FROM_STAGE: {
			DisableRestartFromStage disableRestartFromStage = (DisableRestartFromStage) theEObject;
			T result = caseDisableRestartFromStage(disableRestartFromStage);
			if (result == null)
				result = caseOption(disableRestartFromStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.DISABLE_RESUME: {
			DisableResume disableResume = (DisableResume) theEObject;
			T result = caseDisableResume(disableResume);
			if (result == null)
				result = caseOption(disableResume);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.OVERRIDE_INDEX_TRIGGERS: {
			OverrideIndexTriggers overrideIndexTriggers = (OverrideIndexTriggers) theEObject;
			T result = caseOverrideIndexTriggers(overrideIndexTriggers);
			if (result == null)
				result = caseOption(overrideIndexTriggers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.NEW_CONTAINER_PER_STAGE: {
			NewContainerPerStage newContainerPerStage = (NewContainerPerStage) theEObject;
			T result = caseNewContainerPerStage(newContainerPerStage);
			if (result == null)
				result = caseOption(newContainerPerStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.DISABLE_CONCURRENT_BUILDS: {
			DisableConcurrentBuilds disableConcurrentBuilds = (DisableConcurrentBuilds) theEObject;
			T result = caseDisableConcurrentBuilds(disableConcurrentBuilds);
			if (result == null)
				result = caseOption(disableConcurrentBuilds);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.STAGE_OPTION: {
			StageOption stageOption = (StageOption) theEObject;
			T result = caseStageOption(stageOption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.STRING_PARAM: {
			StringParam stringParam = (StringParam) theEObject;
			T result = caseStringParam(stringParam);
			if (result == null)
				result = caseParameter_Directive(stringParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.TEXT_PARAM: {
			TextParam textParam = (TextParam) theEObject;
			T result = caseTextParam(textParam);
			if (result == null)
				result = caseParameter_Directive(textParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.CHOICE_PARAM: {
			ChoiceParam choiceParam = (ChoiceParam) theEObject;
			T result = caseChoiceParam(choiceParam);
			if (result == null)
				result = caseParameter_Directive(choiceParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.PASSWORD_PARAM: {
			PasswordParam passwordParam = (PasswordParam) theEObject;
			T result = casePasswordParam(passwordParam);
			if (result == null)
				result = caseParameter_Directive(passwordParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.BOOLEAN_PARAM: {
			BooleanParam booleanParam = (BooleanParam) theEObject;
			T result = caseBooleanParam(booleanParam);
			if (result == null)
				result = caseParameter_Directive(booleanParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.MATRIX: {
			Matrix matrix = (Matrix) theEObject;
			T result = caseMatrix(matrix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.AXIS: {
			Axis axis = (Axis) theEObject;
			T result = caseAxis(axis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Jenkins_metamodelPackage.LABEL: {
			Label label = (Label) theEObject;
			T result = caseLabel(label);
			if (result == null)
				result = caseAgent(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingTag(BuildingTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changelog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changelog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangelog(Changelog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triggered By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triggered By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggeredBy(TriggeredBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep_Parameter(Step_Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeSet(ChangeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePost(Post object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyOf(AnyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeline(Pipeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Env</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Env</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen_Env(When_Env object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter_Directive(Parameter_Directive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllOf(AllOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNone(None object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRequest(ChangeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dockerfile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dockerfile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerfile(Dockerfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocker(Docker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStage(Stage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cron</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cron</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCron(Cron object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll SCM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll SCM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollSCM(PollSCM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upstream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upstream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpstream(Upstream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Discarder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Discarder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildDiscarder(BuildDiscarder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkout To Subdirectory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkout To Subdirectory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckoutToSubdirectory(CheckoutToSubdirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skip Stages After Unstable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skip Stages After Unstable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkipStagesAfterUnstable(SkipStagesAfterUnstable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skip Default Checkout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skip Default Checkout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkipDefaultCheckout(SkipDefaultCheckout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetry(Retry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quiet Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quiet Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuietPeriod(QuietPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preserve Stashes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preserve Stashes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreserveStashes(PreserveStashes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeout(Timeout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallels Always Fail Fast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallels Always Fail Fast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelsAlwaysFailFast(ParallelsAlwaysFailFast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestamps(Timestamps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Restart From Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Restart From Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableRestartFromStage(DisableRestartFromStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Resume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Resume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableResume(DisableResume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Override Index Triggers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Override Index Triggers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverrideIndexTriggers(OverrideIndexTriggers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Container Per Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Container Per Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewContainerPerStage(NewContainerPerStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Concurrent Builds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Concurrent Builds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableConcurrentBuilds(DisableConcurrentBuilds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageOption(StageOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringParam(StringParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextParam(TextParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceParam(ChoiceParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordParam(PasswordParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanParam(BooleanParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix(Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxis(Axis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Jenkins_metamodelSwitch
