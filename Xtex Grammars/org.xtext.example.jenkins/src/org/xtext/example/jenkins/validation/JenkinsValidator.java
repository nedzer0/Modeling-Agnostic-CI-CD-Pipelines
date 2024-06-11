/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.jenkins.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;


import jenkins_metamodel.Axis;
import jenkins_metamodel.BooleanParam;
import jenkins_metamodel.Branch;
import jenkins_metamodel.ChangeRequest;
import jenkins_metamodel.ChangeSet;
import jenkins_metamodel.Changelog;
import jenkins_metamodel.CheckoutToSubdirectory;
import jenkins_metamodel.ChoiceParam;
import jenkins_metamodel.Command;
import jenkins_metamodel.Cron;
import jenkins_metamodel.Docker;
import jenkins_metamodel.Dockerfile;
import jenkins_metamodel.Environment;
import jenkins_metamodel.Equals;
import jenkins_metamodel.Expression;
import jenkins_metamodel.Input;
import jenkins_metamodel.Label;
import jenkins_metamodel.Matrix;
import jenkins_metamodel.Node;
import jenkins_metamodel.PasswordParam;
import jenkins_metamodel.Pipeline;
import jenkins_metamodel.PollSCM;
import jenkins_metamodel.Stage;
import jenkins_metamodel.Step_Parameter;
import jenkins_metamodel.StringParam;
import jenkins_metamodel.Tag;
import jenkins_metamodel.TextParam;
import jenkins_metamodel.Timeout;
import jenkins_metamodel.Tool;
import jenkins_metamodel.TriggeredBy;
import jenkins_metamodel.Upstream;
import jenkins_metamodel.When_Env;



/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class JenkinsValidator extends AbstractJenkinsValidator {
	
	public static final String INVALID_STAGE_DEFINITION = "Invalid Stage definition. A stage must have one and only one of steps, stages or matrix.";
	public static final String DUPLICATE_STAGE_NAME = "Duplicate Stage name found: %s. Choose a different name for the stage to ensure uniqueness within the pipeline.";
	public static final String INVALID_CRON_SYNTAX = "Not a valid Cron syntax. Ensure that the pattern follows the format: [minute] [hour] [day of month] [month] [day of week], where each field is separated by a space.";
	public static final String AT_LEAST_ONE_AXIS = "Matrix must have at least one axis";
	public static final String AT_LEAST_ONE_INCLUDE_AXIS = "At least one axis must have exclude set to false";
	public static final String UPSTREAM_JOB_NOT_EXIST = "Job referenced in Upstream with name '%s' does not exist in the Stage's configuration";
	public static final String PARALLEL_IN_SUBSTAGES = "Only sub-stages are allowed to have parallel execution.";
	public static final String NOT_PARALLEL_NO_SUBSTAGE = "Parallel execution is only allowed if sub-stages are defined.";
	public static final String NOT_ALL_SUBSTAGES_PARALLEL = "All sub-stages must have parallel set to true.";
	public static final String MANDATORY_STRING_EMPTY = "%s cannot be empty";
	
	// Error codes
	public static final String INVALID_STAGE_DEFINITION_ERRORCODE = "INVALID_STAGE_DEFINITION";
	public static final String DUPLICATE_STAGE_NAME_ERRORCODE = "DUPLICATE_STAGE_NAME";
    public static final String INVALID_CRON_SYNTAX_ERRORCODE = "INVALID_CRON_SYNTAX";
    public static final String INVALID_POLL_CRON_SYNTAX_ERRORCODE = "INVALID_POLL_CRON_SYNTAX";
    public static final String AT_LEAST_ONE_AXIS_ERRORCODE = "AT_LEAST_ONE_AXIS";
    public static final String AT_LEAST_ONE_INCLUDE_AXIS_ERRORCODE = "AT_LEAST_ONE_INCLUDE_AXIS";
    public static final String UPSTREAM_JOB_NOT_EXIST_ERRORCODE = "UPSTREAM_JOB_NOT_EXIST";
    public static final String PARALLEL_IN_SUBSTAGES_ERRORCODE = "PARALLEL_IN_SUBSTAGES";
    public static final String NOT_PARALLEL_NO_SUBSTAGE_ERRORCODE = "NOT_PARALLEL_NO_SUBSTAGE";
    public static final String NOT_ALL_SUBSTAGES_PARALLEL_ERRORCODE = "NOT_ALL_SUBSTAGES_PARALLEL";
    public static final String MANDATORY_STRING_EMPTY_ERRORCODE = "MANDATORY_STRING_EMPTY";
	
    public static final String MANDATORY_TOOL_NAME_EMPTY_ERRORCODE = "MANDATORY_TOOL_NAME_EMPTY";
    public static final String MANDATORY_COMMAND_NAME_EMPTY_ERRORCODE = "MANDATORY_COMMAND_NAME_EMPTY";
    public static final String MANDATORY_NODE_LABEL_EMPTY_ERRORCODE = "MANDATORY_NODE_LABEL_EMPTY";
    public static final String MANDATORY_STAGE_NAME_EMPTY_ERRORCODE = "MANDATORY_STAGE_NAME_EMPTY";
    public static final String MANDATORY_ENVIRONMENT_KEY_EMPTY_ERRORCODE = "MANDATORY_ENVIRONMENT_KEY_EMPTY";
    public static final String MANDATORY_ENVIRONMENT_VALUE_EMPTY_ERRORCODE = "MANDATORY_ENVIRONMENT_VALUE_EMPTY";
    public static final String MANDATORY_DOCKERFILE_FILENAME_EMPTY_ERRORCODE = "MANDATORY_DOCKERFILE_FILENAME_EMPTY";
    public static final String MANDATORY_LABEL_NAME_EMPTY_ERRORCODE = "MANDATORY_LABEL_NAME_EMPTY";
    public static final String MANDATORY_INPUT_MESSAGE_EMPTY_ERRORCODE = "MANDATORY_INPUT_MESSAGE_EMPTY";
    public static final String MANDATORY_STEP_PARAMETER_EMPTY_ERRORCODE = "MANDATORY_STEP_PARAMETER_EMPTY";
    public static final String MANDATORY_AXIS_NAME_EMPTY_ERRORCODE = "MANDATORY_AXIS_NAME_EMPTY";
    public static final String MANDATORY_AXIS_VALUES_EMPTY_ERRORCODE = "MANDATORY_AXIS_VALUES_EMPTY";
    public static final String MANDATORY_CRON_TIMER_EMPTY_ERRORCODE = "MANDATORY_CRON_TIMER_EMPTY";
    public static final String MANDATORY_POLLSCM_TIMER_EMPTY_ERRORCODE = "MANDATORY_POLLSCM_TIMER_EMPTY";
    public static final String MANDATORY_UPSTREAM_JOBS_EMPTY_ERRORCODE = "MANDATORY_UPSTREAM_JOBS_EMPTY";
    public static final String MANDATORY_DOCKER_IMAGE_EMPTY_ERRORCODE = "MANDATORY_DOCKER_IMAGE_EMPTY";
    public static final String MANDATORY_TRIGGEREDBY_PARAMETER_EMPTY_ERRORCODE = "MANDATORY_TRIGGEREDBY_PARAMETER_EMPTY";
    public static final String MANDATORY_CHANGELOG_EXPRESSION_EMPTY_ERRORCODE = "MANDATORY_CHANGELOG_EXPRESSION_EMPTY";
    public static final String MANDATORY_EQUALS_EXPECTED_VAL_EMPTY_ERRORCODE = "MANDATORY_EQUALS_EXPECTED_VAL_EMPTY";
    public static final String MANDATORY_EQUALS_ACTUAL_VAL_EMPTY_ERRORCODE = "MANDATORY_EQUALS_ACTUAL_VAL_EMPTY";
    public static final String MANDATORY_WHEN_ENV_NAME_EMPTY_ERRORCODE = "MANDATORY_WHEN_ENV_NAME_EMPTY";
    public static final String MANDATORY_WHEN_ENV_VALUE_EMPTY_ERRORCODE = "MANDATORY_WHEN_ENV_VALUE_EMPTY";
    public static final String MANDATORY_EXPRESSION_EXPRESSION_EMPTY_ERRORCODE = "MANDATORY_EXPRESSION_EXPRESSION_EMPTY";
    public static final String MANDATORY_TAG_PATTERN_EMPTY_ERRORCODE = "MANDATORY_TAG_PATTERN_EMPTY";
    public static final String MANDATORY_CHANGESET_PATTERN_EMPTY_ERRORCODE = "MANDATORY_CHANGESET_PATTERN_EMPTY";
    public static final String MANDATORY_BRANCH_PATTERN_EMPTY_ERRORCODE = "MANDATORY_BRANCH_PATTERN_EMPTY";
    public static final String MANDATORY_CHANGEREQUEST_VALUE_EMPTY_ERRORCODE = "MANDATORY_CHANGEREQUEST_VALUE_EMPTY";
    public static final String MANDATORY_BOOLEANPARAM_NAME_EMPTY_ERRORCODE = "MANDATORY_BOOLEANPARAM_NAME_EMPTY";
    public static final String MANDATORY_CHOICEPARAM_NAME_EMPTY_ERRORCODE = "MANDATORY_CHOICEPARAM_NAME_EMPTY";
    public static final String MANDATORY_CHOICEPARAM_CHOICES_EMPTY_ERRORCODE = "MANDATORY_CHOICEPARAM_CHOICES_EMPTY";
    public static final String MANDATORY_TEXTPARAM_NAME_EMPTY_ERRORCODE = "MANDATORY_TEXTPARAM_NAME_EMPTY";
    public static final String MANDATORY_TEXTPARAM_DEFAULTVALUE_EMPTY_ERRORCODE = "MANDATORY_TEXTPARAM_DEFAULTVALUE_EMPTY";
    public static final String MANDATORY_PASSWORDPARAM_NAME_EMPTY_ERRORCODE = "MANDATORY_PASSWORDPARAM_NAME_EMPTY";
    public static final String MANDATORY_PASSWORDPARAM_DEFAULTVALUE_EMPTY_ERRORCODE = "MANDATORY_PASSWORDPARAM_DEFAULTVALUE_EMPTY";
    public static final String MANDATORY_STRINGPARAM_NAME_EMPTY_ERRORCODE = "MANDATORY_STRINGPARAM_NAME_EMPTY";
    public static final String MANDATORY_STRINGPARAM_DEFAULTVALUE_EMPTY_ERRORCODE = "MANDATORY_STRINGPARAM_DEFAULTVALUE_EMPTY";
    public static final String MANDATORY_TIMEOUT_UNIT_EMPTY_ERRORCODE = "MANDATORY_TIMEOUT_UNIT_EMPTY";
    public static final String MANDATORY_CHECKOUTTOSUBDIRECTORY_DIRECTORY_EMPTY_ERRORCODE = "MANDATORY_CHECKOUTTOSUBDIRECTORY_DIRECTORY_EMPTY";
    
    
    @Check
    public void checkValidStageDefinition(Stage stage) {
        if (stage.getMatrix() == null && stage.getStages().isEmpty() && stage.getSteps().isEmpty()) {
            error(INVALID_STAGE_DEFINITION, stage, null, INVALID_STAGE_DEFINITION_ERRORCODE);
        }
    }
    
    
    @Check
    public void checkNonDuplicateStageName(Stage stage) {
        Pipeline pipeline = getPipelineContainer(stage);
        if (pipeline != null) {
            Set<String> stageNames = new HashSet<>();
            for (Stage otherStage : pipeline.getStages()) {
                if ((!stageNames.add(otherStage.getName())) || (otherStage != stage && otherStage.getName().equals(stage.getName()))) {
                    EStructuralFeature nameFeature = otherStage.eClass().getEStructuralFeature("name");
                    error(String.format(DUPLICATE_STAGE_NAME, otherStage.getName()), otherStage, nameFeature, DUPLICATE_STAGE_NAME_ERRORCODE);
                    return;
                }
                stageNames.add(otherStage.getName());
                checkSubstageNames(otherStage, stageNames);
            }
        }
    }


    @Check
    public void checkValidCronSyntax(Cron cron) {
        if (!cron.getTimer().matches("(?:[0-9]|1[0-9]|2[0-3]|H|L|\\*|\\?|[0-5]?[0-9]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\*|L|\\?|\\*/[0-9]+) (?:[0-7]|\\*|L|\\?|#[1-5])")) {
            EStructuralFeature timerFeature = cron.eClass().getEStructuralFeature("timer");
            error(INVALID_CRON_SYNTAX, cron, timerFeature, INVALID_CRON_SYNTAX_ERRORCODE);
        }
    }
    
    @Check
    public void checkValidPollSyntax(PollSCM poll) {
        if (!poll.getTimer().matches("(?:[0-9]|1[0-9]|2[0-3]|H|L|\\*|\\?|[0-5]?[0-9]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\*|L|\\?|\\*/[0-9]+) (?:[0-7]|\\*|L|\\?|#[1-5])")) {
            EStructuralFeature timerFeature = poll.eClass().getEStructuralFeature("timer");
            error(INVALID_CRON_SYNTAX, poll, timerFeature, INVALID_POLL_CRON_SYNTAX_ERRORCODE);
        }
    }
    
    @Check
    public void atLeastOneAxis(Matrix matrix) {
    	for (Axis axis : matrix.getAxis()) {
            if (!axis.isExclude()) {
            	return;
            }
        }
    	error(AT_LEAST_ONE_INCLUDE_AXIS, matrix, null, AT_LEAST_ONE_INCLUDE_AXIS_ERRORCODE);
    }


	@Check
	public void checkUpstreamJobExists(Upstream upstream) {
	    Pipeline pipeline = (Pipeline) upstream.eContainer();
	    for (String uj : upstream.getJobs()) {
	        if (!pipeline.getStages().stream().anyMatch(job -> job.getName().equals(uj))) {
	        	int index = upstream.getJobs().indexOf(uj);
	        	EStructuralFeature jobsFeature = upstream.eClass().getEStructuralFeature("jobs");
	            error(String.format(UPSTREAM_JOB_NOT_EXIST, uj), upstream, jobsFeature, index, UPSTREAM_JOB_NOT_EXIST_ERRORCODE);
	        }
	    }
	}

	@Check
	public void checkParallelExecutionInSubstages(Pipeline pipeline) {
	    for (Stage pipelineStage : pipeline.getStages()) {
	        if (!pipelineStage.getStages().isEmpty() && pipelineStage.isParallel()) {
	            EStructuralFeature parallelFeature = pipelineStage.eClass().getEStructuralFeature("parallel");
	            error(PARALLEL_IN_SUBSTAGES, pipelineStage, parallelFeature, PARALLEL_IN_SUBSTAGES_ERRORCODE);
	        }
	    }
	}

	@Check
	public void checkNotParallelWhenNoSubstage(Pipeline pipeline) {
	    for (Stage pipelineStage : pipeline.getStages()) {
	        if (pipelineStage.getStages().isEmpty() && pipelineStage.isParallel()) {
	            EStructuralFeature parallelFeature = pipelineStage.eClass().getEStructuralFeature("parallel");
	            error(NOT_PARALLEL_NO_SUBSTAGE, pipelineStage, parallelFeature, NOT_PARALLEL_NO_SUBSTAGE_ERRORCODE);
	        }
	    }
	}

	@Check
	public void checkParallelStages(Stage stage) {
	    if (!stage.getStages().isEmpty()) {
	        for (Stage subStage : stage.getStages()) {
	            if (!subStage.isParallel()) {
	                EStructuralFeature parallelFeature = stage.eClass().getEStructuralFeature("parallel");
	                error(NOT_ALL_SUBSTAGES_PARALLEL, subStage, parallelFeature, NOT_ALL_SUBSTAGES_PARALLEL_ERRORCODE);
	            }
	        }
	    }
	}
    
    /*
	 * Validators to check mandatory attributes
	 */	
    
	@Check
    public void checkNameNotEmpty(Tool tool) {
        checkMandatoryStringNotEmpty(tool.getTool_name(), String.format(MANDATORY_STRING_EMPTY, "Tool name"), tool, "tool_name", MANDATORY_TOOL_NAME_EMPTY_ERRORCODE);
    }

    @Check
    public void checkNameNotEmpty(Command command) {
        checkMandatoryStringNotEmpty(command.getName(), String.format(MANDATORY_STRING_EMPTY, "Command name"), command, "name", MANDATORY_COMMAND_NAME_EMPTY_ERRORCODE);
    }

    @Check
    public void checkLabelNotEmpty(Node node) {
        checkMandatoryStringNotEmpty(node.getLabel(), String.format(MANDATORY_STRING_EMPTY, "Node label"), node, "label", MANDATORY_NODE_LABEL_EMPTY_ERRORCODE);
    }

    @Check
    public void checkNameNotEmpty(Stage stage) {
        checkMandatoryStringNotEmpty(stage.getName(), String.format(MANDATORY_STRING_EMPTY, "Stage name"), stage, "name", MANDATORY_STAGE_NAME_EMPTY_ERRORCODE);
    }

    @Check
    public void checkKeyAndValueNotEmpty(Environment environment) {
        checkMandatoryStringNotEmpty(environment.getKey(), String.format(MANDATORY_STRING_EMPTY, "Environment key"), environment, "key", MANDATORY_ENVIRONMENT_KEY_EMPTY_ERRORCODE);
        checkMandatoryStringNotEmpty(environment.getValue(), String.format(MANDATORY_STRING_EMPTY, "Environment value"), environment, "value", MANDATORY_ENVIRONMENT_VALUE_EMPTY_ERRORCODE);
    }

    @Check
    public void checkDirectoryNotEmpty(Dockerfile dockerfile) {
        checkMandatoryStringNotEmpty(dockerfile.getFilename(), String.format(MANDATORY_STRING_EMPTY, "Dockerfile filename"), dockerfile, "filename", MANDATORY_DOCKERFILE_FILENAME_EMPTY_ERRORCODE);
    }

    @Check
    public void checkNameNotEmpty(Label label) {
        checkMandatoryStringNotEmpty(label.getLabel(), String.format(MANDATORY_STRING_EMPTY, "Label name"), label, "label", MANDATORY_LABEL_NAME_EMPTY_ERRORCODE);
    }

    @Check
    public void checkMessageNotEmpty(Input input) {
        checkMandatoryStringNotEmpty(input.getMessage(), String.format(MANDATORY_STRING_EMPTY, "Input message"), input, "message", MANDATORY_INPUT_MESSAGE_EMPTY_ERRORCODE);
    }

    @Check
    public void checkParameterNotEmpty(Step_Parameter stepParameter) {
        checkMandatoryStringNotEmpty(stepParameter.getParameter(), String.format(MANDATORY_STRING_EMPTY, "Step parameter"), stepParameter, "parameter", MANDATORY_STEP_PARAMETER_EMPTY_ERRORCODE);
    }


	@Check
	public void checkNameNotEmpty(Axis axis) {
	    checkMandatoryStringNotEmpty(axis.getName(), String.format(MANDATORY_STRING_EMPTY, "Axis name"), axis, "name", MANDATORY_AXIS_NAME_EMPTY_ERRORCODE);
	    checkMandatoryListNotEmpty(axis.getValues(), String.format(MANDATORY_STRING_EMPTY, "Axis values"), axis, "values", MANDATORY_AXIS_VALUES_EMPTY_ERRORCODE);
	}

	@Check
	public void checkTimerNotEmpty(Cron cron) {
	    checkMandatoryStringNotEmpty(cron.getTimer(), String.format(MANDATORY_STRING_EMPTY, "Cron timer"), cron, "timer", MANDATORY_CRON_TIMER_EMPTY_ERRORCODE);
	}

	@Check
	public void checkTimerNotEmpty(PollSCM pollSCM) {
	    checkMandatoryStringNotEmpty(pollSCM.getTimer(), String.format(MANDATORY_STRING_EMPTY, "PollSCM timer"), pollSCM, "timer", MANDATORY_POLLSCM_TIMER_EMPTY_ERRORCODE);
	}

	@Check
	public void checkRegistryNotEmpty(Docker docker) {
	    checkMandatoryStringNotEmpty(docker.getImage(), String.format(MANDATORY_STRING_EMPTY, "Docker image"), docker, "image", MANDATORY_DOCKER_IMAGE_EMPTY_ERRORCODE);
	}

	@Check
	public void checkNameNotEmpty(TriggeredBy trigger) {
	    checkMandatoryStringNotEmpty(trigger.getParameter(), String.format(MANDATORY_STRING_EMPTY, "TriggeredBy parameter"), trigger, "parameter", MANDATORY_TRIGGEREDBY_PARAMETER_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(Changelog changelog) {
	    checkMandatoryStringNotEmpty(changelog.getExpression(), String.format(MANDATORY_STRING_EMPTY, "Changelog expression"), changelog, "expression", MANDATORY_CHANGELOG_EXPRESSION_EMPTY_ERRORCODE);
	}

	@Check
	public void checkNameNotEmpty(Equals equals) {
	    checkMandatoryStringNotEmpty(equals.getExpected_val(), String.format(MANDATORY_STRING_EMPTY, "Equals expected_val"), equals, "expected_val", MANDATORY_EQUALS_EXPECTED_VAL_EMPTY_ERRORCODE);
	    checkMandatoryStringNotEmpty(equals.getActual_val(), String.format(MANDATORY_STRING_EMPTY, "Equals actual_val"), equals, "actual_val", MANDATORY_EQUALS_ACTUAL_VAL_EMPTY_ERRORCODE);
	}

	@Check
	public void checkNameNotEmpty(When_Env whenEnv) {
	    checkMandatoryStringNotEmpty(whenEnv.getName(), String.format(MANDATORY_STRING_EMPTY, "When_Env name"), whenEnv, "name", MANDATORY_WHEN_ENV_NAME_EMPTY_ERRORCODE);
	    checkMandatoryStringNotEmpty(whenEnv.getValue(), String.format(MANDATORY_STRING_EMPTY, "When_Env value"), whenEnv, "value", MANDATORY_WHEN_ENV_VALUE_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(Expression expression) {
	    checkMandatoryStringNotEmpty(expression.getExpression(), String.format(MANDATORY_STRING_EMPTY, "Expression expression"), expression, "expression", MANDATORY_EXPRESSION_EXPRESSION_EMPTY_ERRORCODE);
	}

	@Check
	public void checkTimerNotEmpty(Tag tag) {
	    checkMandatoryStringNotEmpty(tag.getPattern(), String.format(MANDATORY_STRING_EMPTY, "Tag pattern"), tag, "pattern", MANDATORY_TAG_PATTERN_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(ChangeSet changeSet) {
	    checkMandatoryStringNotEmpty(changeSet.getPattern(), String.format(MANDATORY_STRING_EMPTY, "ChangeSet pattern"), changeSet, "pattern", MANDATORY_CHANGESET_PATTERN_EMPTY_ERRORCODE);
	}

	@Check
	public void checkPatternNotEmpty(Branch branch) {
	    checkMandatoryStringNotEmpty(branch.getPattern(), String.format(MANDATORY_STRING_EMPTY, "Branch pattern"), branch, "pattern", MANDATORY_BRANCH_PATTERN_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(ChangeRequest changeRequest) {
	    checkMandatoryStringNotEmpty(changeRequest.getValue(), String.format(MANDATORY_STRING_EMPTY, "ChangeRequest value"), changeRequest, "value", MANDATORY_CHANGEREQUEST_VALUE_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(BooleanParam param) {
	    checkMandatoryStringNotEmpty(param.getName(), String.format(MANDATORY_STRING_EMPTY, "BooleanParam name"), param, "name", MANDATORY_BOOLEANPARAM_NAME_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(ChoiceParam param) {
	    checkMandatoryStringNotEmpty(param.getName(), String.format(MANDATORY_STRING_EMPTY, "ChoiceParam name"), param, "name", MANDATORY_CHOICEPARAM_NAME_EMPTY_ERRORCODE);
	    checkMandatoryListNotEmpty(param.getChoices(), String.format(MANDATORY_STRING_EMPTY, "ChoiceParam choices"), param, "choices", MANDATORY_CHOICEPARAM_CHOICES_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(TextParam param) {
	    checkMandatoryStringNotEmpty(param.getName(), String.format(MANDATORY_STRING_EMPTY, "TextParam name"), param, "name", MANDATORY_TEXTPARAM_NAME_EMPTY_ERRORCODE);
	    checkMandatoryStringNotEmpty(param.getDefaultValue(), String.format(MANDATORY_STRING_EMPTY, "TextParam defaultValue"), param, "defaultValue", MANDATORY_TEXTPARAM_DEFAULTVALUE_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(PasswordParam param) {
	    checkMandatoryStringNotEmpty(param.getName(), String.format(MANDATORY_STRING_EMPTY, "PasswordParam name"), param, "name", MANDATORY_PASSWORDPARAM_NAME_EMPTY_ERRORCODE);
	    checkMandatoryStringNotEmpty(param.getDefaultValue(), String.format(MANDATORY_STRING_EMPTY, "PasswordParam defaultValue"), param, "defaultValue", MANDATORY_PASSWORDPARAM_DEFAULTVALUE_EMPTY_ERRORCODE);
	}

	@Check
	public void checkExpressionNotEmpty(StringParam param) {
	    checkMandatoryStringNotEmpty(param.getName(), String.format(MANDATORY_STRING_EMPTY, "StringParam name"), param, "name", MANDATORY_STRINGPARAM_NAME_EMPTY_ERRORCODE);
	    checkMandatoryStringNotEmpty(param.getDefaultValue(), String.format(MANDATORY_STRING_EMPTY, "StringParam defaultValue"), param, "defaultValue", MANDATORY_STRINGPARAM_DEFAULTVALUE_EMPTY_ERRORCODE);
	}

	@Check
	public void checkNameNotEmpty(Timeout timeout) {
	    checkMandatoryStringNotEmpty(timeout.getUnit(), String.format(MANDATORY_STRING_EMPTY, "Timeout unit"), timeout, "unit", MANDATORY_TIMEOUT_UNIT_EMPTY_ERRORCODE);
	}

	@Check
	public void checkDirectoryNotEmpty(CheckoutToSubdirectory checkoutToSubdirectory) {
	    checkMandatoryStringNotEmpty(checkoutToSubdirectory.getDirectory(), String.format(MANDATORY_STRING_EMPTY, "CheckoutToSubdirectory directory"), checkoutToSubdirectory, "directory", MANDATORY_CHECKOUTTOSUBDIRECTORY_DIRECTORY_EMPTY_ERRORCODE);
	}
    
    
    
    /*
     * Auxiliary methods
     */
    
    private void checkMandatoryStringNotEmpty(String value, String errorMessage, Object object, String featureName, String errorCode) {
        if (value == null || value.trim().isEmpty()) {
            EStructuralFeature feature = ((EObject) object).eClass().getEStructuralFeature(featureName);
            error(errorMessage, (EObject) object, feature, errorCode);
        }
    }
    
    private void checkMandatoryListNotEmpty(List<String> values, String errorMessage, Object object, String featureName, String errorCode) {
        if (values.isEmpty() || values.stream().anyMatch(value -> value.equals(""))) {
            EStructuralFeature feature = ((EObject) object).eClass().getEStructuralFeature(featureName);
            error(errorMessage, (EObject) object, feature, errorCode);
        }
    }
    
    private void checkSubstageNames(Stage stage, Set<String> stageNames) {
        Set<String> substageNames = new HashSet<>();
        for (Stage substage : stage.getStages()) {
            if (!substageNames.add(substage.getName())) {
                EStructuralFeature nameFeature = substage.eClass().getEStructuralFeature("name");
                error(String.format(DUPLICATE_STAGE_NAME, substage.getName()), substage, nameFeature, DUPLICATE_STAGE_NAME_ERRORCODE);
            }
            substageNames.add(substage.getName());
            checkSubstageNames(substage, substageNames);
        }
    }

    private Pipeline getPipelineContainer(Stage stage) {
        if (stage.eContainer() instanceof Pipeline) {
            return (Pipeline) stage.eContainer();
        } else if (stage.eContainer() instanceof Stage) {
            return getPipelineContainer((Stage) stage.eContainer());
        } else {
            return null;
        }
    }
}