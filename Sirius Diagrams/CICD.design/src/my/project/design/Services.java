package my.project.design;

import java.util.ArrayList;
import java.util.List;

import cICD_metamodel.ARTIFACT_TYPE;
import cICD_metamodel.Agent;
import cICD_metamodel.Artifact;
import cICD_metamodel.CACHE_MODE;
import cICD_metamodel.Cache;
import cICD_metamodel.Command;
import cICD_metamodel.DockerContainer;
import cICD_metamodel.Environment;
import cICD_metamodel.INPUT_TYPE;
import cICD_metamodel.IfStep;
import cICD_metamodel.Input;
import cICD_metamodel.Job;
import cICD_metamodel.MATRIX_CONFIG_TYPE;
import cICD_metamodel.MatrixConfig;
import cICD_metamodel.Output;
import cICD_metamodel.Parameters;
import cICD_metamodel.Pipeline;
import cICD_metamodel.ScheduleTrigger;


/**
 * The services class used by VSM.
 */
public class Services {
    
	public void removeJobRequireJob(Job job, List<String> selection) {
        List<String> values = job.getRequireJobs();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeArtifactPath(Artifact art, List<String> selection) {
        List<String> values = art.getPath();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeAgentLabel(Agent agent, List<String> selection) {
        List<String> values = agent.getLabels();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeMatrixConfigValue(MatrixConfig config, List<String> selection) {
        List<String> values = config.getValues();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeCacheKey(Cache cache, List<String> selection) {
        List<String> values = cache.getKeys();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeCachePath(Cache cache, List<String> selection) {
        List<String> values = cache.getPaths();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeInputValue(Input input, List<String> selection) {
        List<String> values = input.getValues();
        selection.forEach(value -> values.remove(value));
    }
	
	
	
	public String getCacheLabel(Cache cache) {		
		return cache.getKey();
	}
	
	public String getJobEnvLabel(Environment env) {		
		return env.getKey();
	}
	
	public List<String> getJobsNames(Pipeline pipeline) {
		List<String> result = new ArrayList<String>();
		for(Job job : pipeline.getJobs()) {
			result.add(job.getName());
		}
		return result;
	}
	
	public List<String> getArtifactTypes(Artifact artifact) {
        List<String> artifactTypes = new ArrayList<>();
        for (ARTIFACT_TYPE type : ARTIFACT_TYPE.VALUES) {
            artifactTypes.add(type.getLiteral());
        }
        return artifactTypes;
    }
	
	public List<String> getMatrixConfigTypes(MatrixConfig config) {
        List<String> matrixConfigTypes = new ArrayList<>();
        for (MATRIX_CONFIG_TYPE type : MATRIX_CONFIG_TYPE.VALUES) {
        	matrixConfigTypes.add(type.getLiteral());
        }
        return matrixConfigTypes;
    }
	
	public List<String> getInputTypes(Input input) {
        List<String> inputTypes = new ArrayList<>();
        for (INPUT_TYPE type : INPUT_TYPE.VALUES) {
        	inputTypes.add(type.getLiteral());
        }
        return inputTypes;
    }
	
	public List<String> getCacheTypes(Cache cache) {
        List<String> cacheTypes = new ArrayList<>();
        for (CACHE_MODE type : CACHE_MODE.VALUES) {
        	cacheTypes.add(type.getLiteral());
        }
        return cacheTypes;
    }
	
	
	public boolean validateBooleanInputDefaultValue(Input input) {
		if (input.getType().getLiteral().equals("BOOLEAN") && (!input.getDefault().equals("true") && !input.getDefault().equals("false"))) {
            return false;
        }
		return true;
    }
	
	
	/*
	 * Validation methods
	 */
	public boolean checkValidCronSyntax(ScheduleTrigger trigger) {
	    if (trigger.getTimer() == null || !trigger.getTimer().matches("(?:[0-9]|1[0-9]|2[0-3]|H|L|\\*|\\?|[0-5]?[0-9]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\*|L|\\?|\\*/[0-9]+) (?:[0-7]|\\*|L|\\?|#[1-5])")) {
	    	return false;
	    }
	    return true;
	}

	
    public boolean checkValidCondition(IfStep ifCondition) {
    	if (ifCondition.getCondition() == null || (ifCondition.getCondition().contains("!") &&
                !(ifCondition.getCondition().startsWith("${{") && ifCondition.getCondition().endsWith("}}") ||
                        ifCondition.getCondition().startsWith("'") && ifCondition.getCondition().endsWith("'") ||
                        ifCondition.getCondition().startsWith("\"") && ifCondition.getCondition().endsWith("\"") ||
                        ifCondition.getCondition().startsWith("(") && ifCondition.getCondition().endsWith(")")))) {
		    return false;
		}
        return true;
    }
	
	
    public boolean checkNonDuplicateJobName(Job job) {
        if (job.eContainer() instanceof Pipeline) {
        	Pipeline pipeline = (Pipeline) job.eContainer();
	        for (Job otherJob : pipeline.getJobs()) {
	            if (otherJob != job && otherJob.getName().equals(job.getName())) {
	            	return false;
	            }
	        }
        }
		return true;
    }

	
    public boolean checkRequiredJobExists(Job job) {
        if (job.eContainer() instanceof Pipeline && !job.getRequireJobs().isEmpty()) {
        	Pipeline pipeline = (Pipeline) job.eContainer();
            for (String requireJob : job.getRequireJobs()) {
            	boolean jobExists = false;
                for (Job j : pipeline.getJobs()) {
                    if (requireJob.equals(j.getName())) {
                        jobExists = true;
                        break;
                    }
                }
                if (!jobExists) {
                	return false;
                }
            }
        }
		return true;
    }
    
    /*
     * Validators to check mandatory attributes
     */
    
    
	public boolean checkJobNameNotEmpty(Job job) {
	    return checkMandatoryStringNotEmpty(job.getName());
	}
	
	public boolean checkOutputNameNotEmpty(Output output) {
		return checkMandatoryStringNotEmpty(output.getName());
	}

	public boolean checkOutputValueNotEmpty(Output output) {
		return checkMandatoryStringNotEmpty(output.getValue());
	}
	
	public boolean checkImageNotEmpty(DockerContainer docker) {
		return checkMandatoryStringNotEmpty(docker.getImage());
	}

	
	public boolean checkCommandNameNotEmpty(Command command) {
		return checkMandatoryStringNotEmpty(command.getName());
	}
	
	public boolean checkParameterNotEmpty(Parameters parameters) {
		return checkMandatoryStringNotEmpty(parameters.getParameter());
	}

	public boolean checkMatrixNameNotEmpty(MatrixConfig matrixConfig) {
		return checkMandatoryStringNotEmpty(matrixConfig.getName());
	}

	public boolean checkMatrixValNotEmpty(MatrixConfig matrixConfig) {
		return checkMandatoryListNotEmpty(matrixConfig.getValues());
	}
	
	public boolean checkInputNameNotEmpty(Input input) {
		return checkMandatoryStringNotEmpty(input.getName());
	}

	
	public boolean checkTimerNotEmpty(ScheduleTrigger trigger) {
		return checkMandatoryStringNotEmpty(trigger.getTimer());
	}

	
	public boolean checkConditionNotEmpty(IfStep ifStep) {
		return checkMandatoryStringNotEmpty(ifStep.getCondition());
	}
    
    public boolean checkValidEnvironmentKey(Environment env) {
    	return checkMandatoryStringNotEmpty(env.getKey());
	}
	
	public boolean checkValidEnvironmentVal(Environment env) {
        return checkMandatoryStringNotEmpty(env.getValue());
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
