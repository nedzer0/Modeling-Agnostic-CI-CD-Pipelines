package jenkins.design;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import jenkins_metamodel.ATTRIBUTE_TYPE;
import jenkins_metamodel.Axis;
import jenkins_metamodel.BooleanParam;
import jenkins_metamodel.Branch;
import jenkins_metamodel.COMPARATOR_TYPE;
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
import jenkins_metamodel.POST_TYPE;
import jenkins_metamodel.PasswordParam;
import jenkins_metamodel.Pipeline;
import jenkins_metamodel.PollSCM;
import jenkins_metamodel.Post;
import jenkins_metamodel.Stage;
import jenkins_metamodel.Step_Parameter;
import jenkins_metamodel.StringParam;
import jenkins_metamodel.TOOL_TYPE;
import jenkins_metamodel.Tag;
import jenkins_metamodel.TextParam;
import jenkins_metamodel.Timeout;
import jenkins_metamodel.Tool;
import jenkins_metamodel.TriggeredBy;
import jenkins_metamodel.Upstream;
import jenkins_metamodel.When_Env;


/**
 * The services class used by VSM.
 */
public class Services {
    
	
	public List<String> getChangeSetTypes(ChangeSet changeSet) {
        List<String> changeSetTypes = new ArrayList<>();
        for (COMPARATOR_TYPE literal : COMPARATOR_TYPE.VALUES) {
        	changeSetTypes.add(literal.toString());
        }
        return changeSetTypes;
    }
	
	public List<String> getTagTypes(Tag tag) {
        List<String> tagTypes = new ArrayList<>();
        for (COMPARATOR_TYPE literal : COMPARATOR_TYPE.VALUES) {
        	tagTypes.add(literal.toString());
        }
        return tagTypes;
    }
	
	public List<String> getBranchTypes(Branch branch) {
        List<String> branchTypes = new ArrayList<>();
        for (COMPARATOR_TYPE literal : COMPARATOR_TYPE.VALUES) {
        	branchTypes.add(literal.toString());
        }
        return branchTypes;
    }
	
	public List<String> getChangeRequestTypes(ChangeRequest changeRequest) {
        List<String> changeRequestTypes = new ArrayList<>();
        for (COMPARATOR_TYPE literal : COMPARATOR_TYPE.VALUES) {
        	changeRequestTypes.add(literal.toString());
        }
        return changeRequestTypes;
    }
	
	public List<String> getToolTypes(Tool tool) {
        List<String> toolTypes = new ArrayList<>();
        for (TOOL_TYPE literal : TOOL_TYPE.VALUES) {
        	toolTypes.add(literal.toString());
        }
        return toolTypes;
    }
	
	public List<String> getChangeRequestAttributeTypes(ChangeRequest changeRequest) {
        List<String> changeRequestTypes = new ArrayList<>();
        for (ATTRIBUTE_TYPE literal : ATTRIBUTE_TYPE.VALUES) {
        	changeRequestTypes.add(literal.toString());
        }
        return changeRequestTypes;
    }
	
	public void clearChoices(ChoiceParam param) {
		param.getChoices().clear();
    }
	
	public void clearUpstreamJobs(Upstream upstream) {
		upstream.getJobs().clear();
    }
	
	public void clearAxisValues(Axis axis) {
		axis.getValues().clear();
    }
	
	
	public List<String> getPostTypes(Post post) {
        List<String> postTypes = new ArrayList<>();
        for (POST_TYPE literal : POST_TYPE.VALUES) {
        	postTypes.add(literal.toString());
        }
        return postTypes;
    }
	
	
	/*
	 * Validation methods
	 */
	public boolean checkValidStageDefinition(Stage stage) {
		if (stage.getMatrix() == null && stage.getStages().isEmpty() && stage.getSteps().isEmpty()) {
			return false;
        }
		return true;
    }
	
	
    public boolean checkNonDuplicateStageName(Stage stage) {
        Pipeline pipeline = getPipelineContainer(stage);
        if (pipeline != null) {
            Set<String> stageNames = new HashSet<>();
            for (Stage otherStage : pipeline.getStages()) {
                if ((!stageNames.add(otherStage.getName())) || (otherStage != stage && otherStage.getName().equals(stage.getName()))) {
                	return false;
                }
                stageNames.add(otherStage.getName());
                if (!checkSubstageNames(otherStage, stageNames)) {
                    return false; 
                }
            }
        }
        return true;
    }

    // Utility method to recursively check for duplicate names in substages
    private boolean checkSubstageNames(Stage stage, Set<String> stageNames) {
    	Set<String> substageNames = new HashSet<>();
        for (Stage substage : stage.getStages()) {
            if (!substageNames.add(substage.getName())) {
                return false;
            }
        }
        return true; 
    }

    // Utility method to get the pipeline container
    private Pipeline getPipelineContainer(Stage stage) {
        if (stage.eContainer() instanceof Pipeline) {
            return (Pipeline) stage.eContainer();
        } else if (stage.eContainer() instanceof Stage) {
            return getPipelineContainer((Stage) stage.eContainer());
        } else {
            // If the container is not a Pipeline or a Stage, return null
            return null;
        }
    }
	
	
    public boolean checkValidCronSyntax(Cron cron) {
        if (cron.getTimer() == null || !cron.getTimer().matches("(?:[0-9]|1[0-9]|2[0-3]|H|L|\\*|\\?|[0-5]?[0-9]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\*|L|\\?|\\*/[0-9]+) (?:[0-7]|\\*|L|\\?|#[1-5])")) {
        	return false;
        }
    	return true;
    }
	
	
    public boolean checkValidCronSyntax(PollSCM poll) {
        if (poll.getTimer() == null || !poll.getTimer().matches("(?:[0-9]|1[0-9]|2[0-3]|H|L|\\*|\\?|[0-5]?[0-9]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\*|L|\\?|\\*/[0-9]+) (?:[0-7]|\\*|L|\\?|#[1-5])")) {
        	return false;
        }
    		return true;
    }
	
	
    public boolean atLeastOneAxis(Matrix matrix) {
        if(matrix.getAxis().isEmpty())
        	return true;
        return false;
    }
    
    public boolean atLeastOneIncludeAxis(Matrix matrix) {
        for (Axis axis : matrix.getAxis()) {
            if (!axis.isExclude()) {
                return true;
            }
        }
        return false;
    }
	
	
	public boolean checkUpstreamJobExists(Upstream upstream) {
		Pipeline pipeline = (Pipeline) upstream.eContainer();
        for (String uj : upstream.getJobs()) {
            if (!pipeline.getStages().stream().anyMatch(job -> job.getName().equals(uj))) {
            	return false;
            }
        }
        return true;
	}
	
	
    public boolean checkParallelExecutionInSubstages(Stage stage) {
    	EObject container = stage.eContainer();
    	if(container instanceof Pipeline) {
    		for (Stage pipelineStage : ((Pipeline) container).getStages()) {
    			if (!pipelineStage.getStages().isEmpty() && pipelineStage.isParallel()) {
    				return false;
    			}
    		}
    	}
        return true;
    }
	
	
    public boolean checkNotParallelWhenNoSubstage(Stage stage) {
    	EObject container = stage.eContainer();
    	if(container instanceof Pipeline) {
    		for (Stage pipelineStage : ((Pipeline) container).getStages()) {
    			if (pipelineStage.getStages().isEmpty() && pipelineStage.isParallel()) {
                	return false;
                }
    		}
    	}
        return true;
    }

    
    public boolean checkParallelStages(Stage stage) {
    	EObject container = stage.eContainer();
    	if(container instanceof Stage && !stage.isParallel()) {
    		return false;
    	}
        return true;
    }
    
    
    
    /*
     * Validators to check mandatory attributes
     */
	
    
    public boolean checkToolNameNotEmpty(Tool tool) {
        return checkMandatoryStringNotEmpty(tool.getTool_name());
    }

    
    public boolean checkCommandNameNotEmpty(Command command) {
    	return checkMandatoryStringNotEmpty(command.getName());
    }

    
    public boolean checkNodeLabelNotEmpty(Node node) {
    	return checkMandatoryStringNotEmpty(node.getLabel());
    }

    
    public boolean checkStageNameNotEmpty(Stage stage) {
    	return checkMandatoryStringNotEmpty(stage.getName());
    }

    
    public boolean checkEnvironmentKeyNotEmpty(Environment environment) {
    	return checkMandatoryStringNotEmpty(environment.getKey());
    }

    public boolean checkEnvironmentValueNotEmpty(Environment environment) {
    	return checkMandatoryStringNotEmpty(environment.getValue());
    }
    
    public boolean checkDockerfileFilenameNotEmpty(Dockerfile dockerfile) {
    	return checkMandatoryStringNotEmpty(dockerfile.getFilename());
    }

    
    public boolean checkLabelLabelNotEmpty(Label label) {
    	return checkMandatoryStringNotEmpty(label.getLabel());
    }

    
    public boolean checkInputMessageNotEmpty(Input input) {
    	return checkMandatoryStringNotEmpty(input.getMessage());
    }

    
    public boolean checkStep_ParameterNotEmpty(Step_Parameter stepParameter) {
    	return checkMandatoryStringNotEmpty(stepParameter.getParameter());
    }

	
	public boolean checkAxisNameNotEmpty(Axis axis) {
		return checkMandatoryStringNotEmpty(axis.getName());
	}

	public boolean checkAxisValuesNotEmpty(Axis axis) {
		return checkMandatoryListNotEmpty(axis.getValues());
	}

	
	public boolean checkCronNotEmpty(Cron cron) {
		return checkMandatoryStringNotEmpty(cron.getTimer());
	}

	
	public boolean checkPollSCMNotEmpty(PollSCM pollSCM) {
		return checkMandatoryStringNotEmpty(pollSCM.getTimer());
	}

	
	public boolean checkDockerImageeNotEmpty(Docker docker) {
		return checkMandatoryStringNotEmpty(docker.getImage());
	}

	
	public boolean checkTriggeredByParameterNotEmpty(TriggeredBy trigger) {
		return checkMandatoryStringNotEmpty(trigger.getParameter());
	}

	
	public boolean checkChangelogExpressionNotEmpty(Changelog changelog) {
		return checkMandatoryStringNotEmpty(changelog.getExpression());
	}

	
	public boolean checkEqualsExpectedNotEmpty(Equals equals) {
		return checkMandatoryStringNotEmpty(equals.getExpected_val());
	}

	public boolean checkEqualsActualNotEmpty(Equals equals) {
		return checkMandatoryStringNotEmpty(equals.getActual_val());
	}
	
	public boolean checkWhen_EnvNameNotEmpty(When_Env whenEnv) {
		return checkMandatoryStringNotEmpty(whenEnv.getName());
	}

	public boolean checkWhen_EnvValueNotEmpty(When_Env whenEnv) {
		return checkMandatoryStringNotEmpty(whenEnv.getValue());
	}
	
	public boolean checkExpressionNotEmpty(Expression expression) {
		return checkMandatoryStringNotEmpty(expression.getExpression());
	}

	
	public boolean checkTagPatternNotEmpty(Tag tag) {
		return checkMandatoryStringNotEmpty(tag.getPattern());
	}

	
	public boolean checkChangeSetPatternNotEmpty(ChangeSet changeSet) {
		return checkMandatoryStringNotEmpty(changeSet.getPattern());
	}

	
	public boolean checkBranchPatternNotEmpty(Branch branch) {
		return checkMandatoryStringNotEmpty(branch.getPattern());
	}

	
	public boolean checkChangeRequestValueNotEmpty(ChangeRequest changeRequest) {
		return checkMandatoryStringNotEmpty(changeRequest.getValue());
	}

	
	public boolean checkBooleanParamNameNotEmpty(BooleanParam param) {
		return checkMandatoryStringNotEmpty(param.getName());
	}

	
	public boolean checkChoiceParamNameNotEmpty(ChoiceParam param) {
		return checkMandatoryStringNotEmpty(param.getName());
	}

	public boolean checkChoiceChoicesNotEmpty(ChoiceParam param) {
		return checkMandatoryListNotEmpty(param.getChoices());
	}
	
	public boolean checkTextParamNameNotEmpty(TextParam param) {
		return checkMandatoryStringNotEmpty(param.getName());
	}
	
	public boolean checkTextParamDefaultNotEmpty(TextParam param) {
		return checkMandatoryStringNotEmpty(param.getDefaultValue());
	}
	
	public boolean checkPasswordParamNameNotEmpty(PasswordParam param) {
		return checkMandatoryStringNotEmpty(param.getName());
	}
	
	public boolean checkPasswordParamDefaultNotEmpty(PasswordParam param) {
		return checkMandatoryStringNotEmpty(param.getDefaultValue());
	}
	
	public boolean checkStringParamNameNotEmpty(StringParam param) {
		return checkMandatoryStringNotEmpty(param.getName());
	}

	public boolean checkStringParamDefaultNotEmpty(StringParam param) {
		return checkMandatoryStringNotEmpty(param.getDefaultValue());
	}
	
	public boolean checkTimeoutUnitNotEmpty(Timeout timeout) {
		return checkMandatoryStringNotEmpty(timeout.getUnit());
	}

	public boolean checkDirectoryNotEmpty(CheckoutToSubdirectory checkoutToSubdirectory) {
		return checkMandatoryStringNotEmpty(checkoutToSubdirectory.getDirectory());
	}
	
	private boolean checkMandatoryStringNotEmpty(String value) {
        if (value == null || value.trim().isEmpty()) {
        	return false;
        }
        return true;
    }
	
	private boolean checkMandatoryListNotEmpty(List<String> values) {
        if (values.isEmpty() || values.stream().anyMatch(value -> value.equals(""))) {
        	return false;
        }
        return true;
    }
}
