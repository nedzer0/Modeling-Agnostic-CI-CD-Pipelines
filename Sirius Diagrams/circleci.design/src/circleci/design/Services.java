package circleci.design;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import circleCI_metamodel.AddSSHKeys;
import circleCI_metamodel.AttachWorkspace;
import circleCI_metamodel.BRANCH_TYPE;
import circleCI_metamodel.Branch;
import circleCI_metamodel.Command;
import circleCI_metamodel.DOCKER_RESOURCE_TYPE;
import circleCI_metamodel.Docker;
import circleCI_metamodel.Docker_Auth;
import circleCI_metamodel.Docker_Aws_Auths;
import circleCI_metamodel.Environment;
import circleCI_metamodel.Executor;
import circleCI_metamodel.Job;
import circleCI_metamodel.JobWorkflow;
import circleCI_metamodel.MACHINE_RESOURCE_TYPE;
import circleCI_metamodel.MACOS_RESOURCE_TYPE;
import circleCI_metamodel.MacOs;
import circleCI_metamodel.Machine;
import circleCI_metamodel.Matrix;
import circleCI_metamodel.MatrixParams;
import circleCI_metamodel.Orb;
import circleCI_metamodel.PARAMETER_TYPES;
import circleCI_metamodel.Parameter;
import circleCI_metamodel.Parameters;
import circleCI_metamodel.PersistToWorkspace;
import circleCI_metamodel.Pipeline;
import circleCI_metamodel.RestoreCache;
import circleCI_metamodel.Run;
import circleCI_metamodel.RunCommand;
import circleCI_metamodel.SaveCache;
import circleCI_metamodel.StoreArtifact;
import circleCI_metamodel.StoreTestResults;
import circleCI_metamodel.Trigger;
import circleCI_metamodel.WHEN_TYPE;
import circleCI_metamodel.When_Unless;
import circleCI_metamodel.Workflow;



/**
 * The services class used by VSM.
 */
public class Services {
	
	public void removeSaveCachePath(SaveCache cache, List<String> selection) {
        List<String> keys = cache.getPaths();
        selection.forEach(key -> keys.remove(key));
    }
	
	public void removeRestoreCacheKey(RestoreCache cache, List<String> selection) {
        List<String> keys = cache.getKeys();
        selection.forEach(key -> keys.remove(key));
    }
	
	public void removeMatrixParamsValue(MatrixParams matrix, List<String> selection) {
        List<String> values = matrix.getValues();
        selection.forEach(val -> values.remove(val));
    }
	
	public void removeDockerEntrypoint(Docker docker, List<String> selection) {
        List<String> values = docker.getEntrypoint();
        selection.forEach(val -> values.remove(val));
    }
	
	public void removeDockerCommand(Docker docker, List<String> selection) {
        List<String> values = docker.getCommand();
        selection.forEach(val -> values.remove(val));
    }
	
	public void removeJobWorkflowRequire(JobWorkflow jw, List<String> selection) {
        List<String> values = jw.getRequires();
        selection.forEach(val -> values.remove(val));
    }
	
	public void removeJobWorkflowContext(JobWorkflow jw, List<String> selection) {
        List<String> values = jw.getContext();
        selection.forEach(val -> values.remove(val));
    }
	
	public void removeAddSSHKeysFingerprints(AddSSHKeys ssh, List<String> selection) {
        List<String> values = ssh.getFingerprints();
        selection.forEach(val -> values.remove(val));
    }
	
	public void removePersistToWorkspacePath(PersistToWorkspace pw, List<String> selection) {
        List<String> values = pw.getPaths();
        selection.forEach(val -> values.remove(val));
    }
	
	public void removeParameterEnumValue(Parameter param, List<String> selection) {
        List<String> values = param.getEnumValues();
        selection.forEach(val -> values.remove(val));
    }
	
	public List<String> getDockerResourceClass(Docker docker) {
        List<String> resourceClasses = new ArrayList<>();
        for (DOCKER_RESOURCE_TYPE type : DOCKER_RESOURCE_TYPE.VALUES) {
        	if(type.getLiteral().equals("two_xlarge")) {
        		resourceClasses.add("2xlarge");
        	}
        	else if(type.getLiteral().equals("two_xlarge_plus")) {
        		resourceClasses.add("2xlarge+");
        	}
        	else if(type.getLiteral().equals("medium_plus")) {
        		resourceClasses.add("medium+");
        	}
        	else {
        		resourceClasses.add(type.getLiteral());
        	}
        }
        return resourceClasses;
    }
	
	public String getDockerCurrentResourceClass(Docker docker) {
		String literal = docker.getResourceClass().getLiteral();
		if(literal.equals("two_xlarge")) {
			return "2xlarge";
    	}
		else if(literal.equals("two_xlarge_plus")) {
			return "2xlarge+";
    	}
		else if(literal.equals("medium_plus")) {
    		return "medium+";
    	}
    	else {
    		return literal;
    	}
    }
	
	public List<String> getMachineResourceClass(Machine machine) {
        List<String> resourceClasses = new ArrayList<>();
        for (MACHINE_RESOURCE_TYPE type : MACHINE_RESOURCE_TYPE.VALUES) {
        	if(type.getLiteral().equals("two_xlarge")) {
        		resourceClasses.add("2xlarge");
        	}
        	else if(type.getLiteral().equals("two_xlarge_plus")) {
        		resourceClasses.add("2xlarge+");
        	}
        	else {
        		resourceClasses.add(type.getLiteral());
        	}
        }
        return resourceClasses;
    }
	
	public String getMachineCurrentResourceClass(Machine machine) {
		String literal = machine.getResourceClass().getLiteral();
		if(literal.equals("two_xlarge")) {
			return "2xlarge";
    	}
		else if(literal.equals("two_xlarge_plus")) {
			return "2xlarge+";
    	}
    	else {
    		return literal;
    	}
    }
	
	public List<String> getMacOsResourceClass(MacOs macOs) {
        List<String> resourceClasses = new ArrayList<>();
        for (MACOS_RESOURCE_TYPE type : MACOS_RESOURCE_TYPE.VALUES) {
        	if(type.getLiteral().equals("macos.x86.medium.gen2")) {
        		resourceClasses.add("macos.x86.medium.gen2*");
        	}
        	else {
        		resourceClasses.add(type.getLiteral());
        	}
        }
        return resourceClasses;
    }
	
	public String getMacOsCurrentResourceClass(MacOs macOs) {
		String literal = macOs.getResourceClass().getLiteral();
		if(literal.equals("macos.x86.medium.gen2")) {
			return "macos.x86.medium.gen2*";
    	}
    	else {
    		return literal;
    	}
    }
    
	public List<String> getSaveCacheTypes(SaveCache cache) {
        List<String> cacheTypes = new ArrayList<>();
        for (WHEN_TYPE type : WHEN_TYPE.VALUES) {
        	cacheTypes.add(type.getLiteral());
        }
        return cacheTypes;
    }
	
	public List<String> getRunTypes(Run run) {
        List<String> whenTypes = new ArrayList<>();
        for (WHEN_TYPE type : WHEN_TYPE.VALUES) {
        	whenTypes.add(type.getLiteral());
        }
        return whenTypes;
    }
	
	public List<String> getBranchTypes(Branch branch) {
        List<String> branchTypes = new ArrayList<>();
        for (BRANCH_TYPE type : BRANCH_TYPE.VALUES) {
        	branchTypes.add(type.getLiteral());
        }
        return branchTypes;
    }
	
	public List<String> getParameterTypes(Parameter param) {
        List<String> paramTypes = new ArrayList<>();
        for (PARAMETER_TYPES type : PARAMETER_TYPES.VALUES) {
        	paramTypes.add(type.getLiteral());
        }
        return paramTypes;
    }
	
	
	/*
	 * Validation methods
	 */
	
	public boolean checkWorkflowJobExists(JobWorkflow jobWorkflow) {
		Workflow workflow = (Workflow) jobWorkflow.eContainer();
		Pipeline pipeline = (Pipeline) workflow.eContainer();
        if (!pipeline.getJobs().stream().anyMatch(job -> job.getName().equals(jobWorkflow.getName()))) {
        	return false;
        }
        return true;
	}

	
	public boolean checkValidParameterTypes(Parameter param) {
        if (!(param.getType().equals(PARAMETER_TYPES.STRING) ||
              param.getType().equals(PARAMETER_TYPES.BOOLEAN) ||
              param.getType().equals(PARAMETER_TYPES.INTEGER) ||
              param.getType().equals(PARAMETER_TYPES.ENUM))) {
        	return false;
        }
        return true;
	}
	
	public boolean checkValidCronSyntax(Trigger trigger) {
        if (!trigger.getCron().matches("(?:[0-9]|1[0-9]|2[0-3]|H|L|\\*|\\?|[0-5]?[0-9]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\*|L|\\?|\\*/[0-9]+) (?:[0-7]|\\*|L|\\?|#[1-5])")) {
        	return false;
        }
	    return true;
	}

	
    public boolean checkNonDuplicateJobName(Job job) {
        Pipeline pipeline = (Pipeline) job.eContainer();
        for (Job otherJob : pipeline.getJobs()) {
            if (otherJob != job && otherJob.getName().equals(job.getName())) {
            	return false;
            }
        }
        return true;
    }
    
	public boolean checkNonDuplicateExecutorName(Executor exec) {
		Pipeline pipeline = null;

	    EObject container = exec.eContainer();
	    if (container instanceof Job) {
	        pipeline = (Pipeline) container.eContainer();
	    } else if (container instanceof Pipeline) {
	        pipeline = (Pipeline) exec.eContainer();
	    }
        
        List<Executor> execs = new ArrayList<>();
        for (Executor c : pipeline.getExecutors()) {
        	execs.add(c);
        }
        for (Job j : pipeline.getJobs()) {
        	execs.addAll(j.getExecutors());
        }
        
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateNames = new HashSet<>();
        for (Executor e : execs) {
            if (!uniqueNames.add(e.getName())) {
                duplicateNames.add(e.getName());
            }
        }

        if (duplicateNames.contains(exec.getName())) {
        	return false;
        }
        return true;
	}
	
	
	public boolean checkNonDuplicateCommandName(Command c) {
	    Pipeline pipeline = (Pipeline) c.eContainer();
	    if (c != null && c.getName() != null) {
	        for (Command otherCommand : pipeline.getCommands()) {
	            if (otherCommand != null && otherCommand != c && c.getName().equals(otherCommand.getName())) {
	                return false;
	            }
	        }   
	    }
	    return true;
	}
	

    public boolean checkNonDuplicateParameterName(Parameter param) {
		Pipeline pipeline = null;

	    EObject container = param.eContainer();
	    if (container instanceof Command) {
	        pipeline = (Pipeline) container.eContainer();
	    } else if (container instanceof Job) {
	        pipeline = (Pipeline) container.eContainer();
	    }
        
        List<Parameter> params = new ArrayList<>();
        for (Command c : pipeline.getCommands()) {
            params.addAll(c.getParameters());
        }
        for (Job j : pipeline.getJobs()) {
            params.addAll(j.getParameters());
        }
        
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateNames = new HashSet<>();
        for (Parameter p : params) {
            if (!uniqueNames.add(p.getName())) {
                duplicateNames.add(p.getName());
            }
        }

        if (duplicateNames.contains(param.getName())) {
        	return false;
        }
        return true;
    }
    
    public boolean checkNonDuplicateJobWorkflowName(JobWorkflow jobWorkflow) {
    	Workflow workflow = (Workflow) jobWorkflow.eContainer();
    	for (JobWorkflow otherJobWorkflow : workflow.getJobworkflow()) {
	        if (otherJobWorkflow != jobWorkflow && otherJobWorkflow.getName().equals(jobWorkflow.getName())) {
	            return false;
	        }
	    }
        return true;
    }
	
	
    public boolean checkExecutorType(Job job) {
        long uniqueExecutorTypes = job.getExecutors().stream()
                .map(executor -> executor.eClass())
                .distinct()
                .count();

        if (uniqueExecutorTypes > 1) {
        	return false;
        }
        return true;
    }
	
	
    public boolean checkExecutorExistsInJobs(Job job) {
        if (job.getReuseExecutor() != null && !job.getReuseExecutor().isEmpty()) {
            Pipeline pipeline = (Pipeline) job.eContainer();
            if(!pipeline.getExecutors().stream().anyMatch(ex -> ex.getName().equals(job.getReuseExecutor()))) {
            	return false;
            }
        }
        return true;
    }

    public boolean checkCommandExistsInJobs(Job job) {
        if (job.getReuseCommand() != null && !job.getReuseCommand().isEmpty()) {
            Pipeline pipeline = (Pipeline) job.eContainer();
            if(!pipeline.getCommands().stream().anyMatch(com -> com.getName().equals(job.getReuseCommand()))) {
            	return false;
            }
        }
        return true;
    }
	
    public boolean checkRequiredJobExists(JobWorkflow jobWorkflow) {
        if (!jobWorkflow.getRequires().isEmpty()) {
        	Workflow workflow = (Workflow) jobWorkflow.eContainer();
        	Pipeline pipeline = (Pipeline) workflow.eContainer();
            Set<String> existingJobNames = new HashSet<>();
            for (Job job : pipeline.getJobs()) {
                existingJobNames.add(job.getName());
            }

            for (String requiredJob : jobWorkflow.getRequires()) {
            	if (!existingJobNames.contains(requiredJob)) {
            		return false;
                }
            }
        }
        return true;
    }
	
	
    public boolean checkEnumValuesNotEmpty(Parameter parameter) {
        if (parameter.getType() == PARAMETER_TYPES.ENUM) {
            if (parameter.getEnumValues().isEmpty() || parameter.getEnumValues().stream().anyMatch(val -> val.equals(""))) {
            	return false;
            }
        }
        return true;
    }

    
    public boolean checkEnumValuesEmptyForNonEnum(Parameter parameter) {
        if (parameter.getType() != PARAMETER_TYPES.ENUM) {
            if (!parameter.getEnumValues().isEmpty()) {
            	return false;
            }
        }
        return true;
    }

    
    public boolean checkValidBooleanDefaultValue(Parameter parameter) {
        if (parameter.getType() == PARAMETER_TYPES.BOOLEAN && !parameter.getDefault().equals("false") && !parameter.getDefault().equals("true")) {
        	return false;
        }
        return true;
    }
    
    
	public boolean checkValidMatrixParamsKey(MatrixParams matrixParams) {
		Matrix matrix = (Matrix) matrixParams.eContainer();
		JobWorkflow jobWorkflow = (JobWorkflow) matrix.eContainer();
        String jobWorkflowName = jobWorkflow.getName();
        
        Pipeline pipeline = (Pipeline) jobWorkflow.eContainer().eContainer();
        
        Job matchingJob = pipeline.getJobs().stream()
                .filter(job -> jobWorkflowName.equals(job.getName()))
                .findFirst()
                .orElse(null);
		
        if (matchingJob != null) {
            boolean keyMatches = matchingJob.getParameters().stream()
                .anyMatch(param -> param.getName().equals(matrixParams.getKey()));

            if (!keyMatches) {
            	return false;
            }
        }
        return true;
	}
	
	public boolean checkValidJobExecutor(Job job) {
        if (job.getExecutors().isEmpty() && job.getReuseExecutor() == null) {
            return false;
        }
        return true;
	}
	
	public boolean checkValidRestoreCache(RestoreCache cache) {
        if ((cache.getKey() == null || cache.getKey().isEmpty()) && cache.getKeys().isEmpty()) {
        	return false;
        }
        return true;
	}
    
    
    /*
     * Validators to check mandatory attributes
     */
    
    public boolean checkJobNameNotEmpty(Job job) {
	    return checkMandatoryStringNotEmpty(job.getName());
	}
	
    
	public boolean checkParameterNameNotEmpty(Parameter parameter) {
		return checkMandatoryStringNotEmpty(parameter.getName());
	}

	
	public boolean checkParametersNotEmpty(Parameters parameters) {
		return checkMandatoryStringNotEmpty(parameters.getParameter());
	}

	
	public boolean checkSavePathsNotEmpty(SaveCache cache) {
		return checkMandatoryListNotEmpty(cache.getPaths());
	}

	public boolean checkSaveKeyNotEmpty(SaveCache cache) {
		return checkMandatoryStringNotEmpty(cache.getKey());
	}
	
	public boolean checkStoreArtPathNotEmpty(StoreArtifact artifact) {
		return checkMandatoryStringNotEmpty(artifact.getPath());
	}

	
	public boolean checkAttachAtNotEmpty(AttachWorkspace work) {
		return checkMandatoryStringNotEmpty(work.getAt());
	}

	
	public boolean checkStoreResultsPathNotEmpty(StoreTestResults results) {
		return checkMandatoryStringNotEmpty(results.getPath());
	}

	
	public boolean checkPersistPathsNotEmpty(PersistToWorkspace workspace) {
		return checkMandatoryListNotEmpty(workspace.getPaths());
	}

	public boolean checkPersistRootNotEmpty(PersistToWorkspace workspace) {
		return checkMandatoryStringNotEmpty(workspace.getRoot());
	}
	
	public boolean checkCacheKeysNotEmpty(RestoreCache cache) {
		return checkMandatoryListNotEmpty(cache.getKeys());
	}

	public boolean checkCacheKeyNotEmpty(RestoreCache cache) {
		return checkMandatoryStringNotEmpty(cache.getKey());
	}
	
	public boolean checkBranchNameNotEmpty(Branch branch) {
		return checkMandatoryStringNotEmpty(branch.getName());
	}

	
	public boolean checkTriggerNotEmpty(Trigger trigger) {
		return checkMandatoryStringNotEmpty(trigger.getCron());
	}

	
	public boolean checkJobWorkflowNameNotEmpty(JobWorkflow jobWorkflow) {
		return checkMandatoryStringNotEmpty(jobWorkflow.getName());
	}

	
	public boolean checkWorkflowNameNotEmpty(Workflow workflow) {
		return checkMandatoryStringNotEmpty(workflow.getName());
	}

	public boolean checkWorkflowVersionNotEmpty(Workflow workflow) {
		return checkMandatoryStringNotEmpty(workflow.getVersion());
	}
	
	public boolean checkMacXcodeNotEmpty(MacOs macOs) {
		return checkMandatoryStringNotEmpty(macOs.getXcode());
	}

	public boolean checkMacNameNotEmpty(MacOs macOs) {
		return checkMandatoryStringNotEmpty(macOs.getName());
	}
	
	public boolean checkMachineImageNotEmpty(Machine machine) {
		return checkMandatoryStringNotEmpty(machine.getImage());
	}

	public boolean checkMachineNameNotEmpty(Machine machine) {
		return checkMandatoryStringNotEmpty(machine.getName());
	}
	
	public boolean checkDockerImageNotEmpty(Docker docker) {
		return checkMandatoryStringNotEmpty(docker.getImage());
	}
	
	public boolean checkDockerNameNotEmpty(Docker docker) {
		return checkMandatoryStringNotEmpty(docker.getName());
	}

	
	public boolean checkDockerAuthUsernameNotEmpty(Docker_Auth dockerAuth) {
		return checkMandatoryStringNotEmpty(dockerAuth.getUsername());
	}

	public boolean checkDockerAuthPassNotEmpty(Docker_Auth dockerAuth) {
		return checkMandatoryStringNotEmpty(dockerAuth.getPassword());
	}
	
	public boolean checkDockerAwsIdNotEmpty(Docker_Aws_Auths dockerAwsAuths) {
		return checkMandatoryStringNotEmpty(dockerAwsAuths.getAws_access_key_id());
	}

	public boolean checkDockerAwsKeyNotEmpty(Docker_Aws_Auths dockerAwsAuths) {
		return checkMandatoryStringNotEmpty(dockerAwsAuths.getAws_secret_access_key());
	}

	
	public boolean checkMatrixParamsKeyNotEmpty(MatrixParams matrixParams) {
		return checkMandatoryStringNotEmpty(matrixParams.getKey());
	}

	public boolean checkMatrixParamsValNotEmpty(MatrixParams matrixParams) {
		return checkMandatoryListNotEmpty(matrixParams.getValues());
	}
	
	public boolean checkVersionNotEmpty(Pipeline pipeline) {
		return checkMandatoryStringNotEmpty(pipeline.getVersion());
	}

	
	public boolean checkRunCommandNameNotEmpty(RunCommand runCommand) {
		return checkMandatoryStringNotEmpty(runCommand.getName());
	}

	
	public boolean checkWhenUnlessCondNotEmpty(When_Unless when_Unless) {
		return checkMandatoryStringNotEmpty(when_Unless.getCondition());
	}

	
	public boolean checkOrbKeyNotEmpty(Orb orb) {
		return checkMandatoryStringNotEmpty(orb.getKey());
	}
	
	public boolean checkOrbValNotEmpty(Orb orb) {
		return checkMandatoryStringNotEmpty(orb.getValue());
	}
    
    public boolean checkValidEnvKey(Environment env) {
    	return checkMandatoryStringNotEmpty(env.getKey());
	}
	
	public boolean checkValidEnvVal(Environment env) {
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
