package GHA.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import gHA_metamodel.ARTIFACT_TYPE;
import gHA_metamodel.Action;
import gHA_metamodel.Artifact;
import gHA_metamodel.Branch;
import gHA_metamodel.Command;
import gHA_metamodel.Concurrency;
import gHA_metamodel.Container;
import gHA_metamodel.Credentials;
import gHA_metamodel.DefaultSetting;
import gHA_metamodel.Docker;
import gHA_metamodel.EVENTS;
import gHA_metamodel.Env;
import gHA_metamodel.Environment;
import gHA_metamodel.INPUT_TYPES;
import gHA_metamodel.If;
import gHA_metamodel.Input;
import gHA_metamodel.InputPair;
import gHA_metamodel.InputParams;
import gHA_metamodel.Job;
import gHA_metamodel.MATRIX_CONFIG_TYPE;
import gHA_metamodel.MatrixConfig;
import gHA_metamodel.Need;
import gHA_metamodel.Output;
import gHA_metamodel.PERMISSIONS;
import gHA_metamodel.PERMISSION_SCOPES;
import gHA_metamodel.Parameter;
import gHA_metamodel.Path;
import gHA_metamodel.Permission;
import gHA_metamodel.Pipeline;
import gHA_metamodel.RestoreCache;
import gHA_metamodel.Runs_On;
import gHA_metamodel.SaveCache;
import gHA_metamodel.ScheduleTrigger;
import gHA_metamodel.Secret;
import gHA_metamodel.Service;
import gHA_metamodel.StandardEventTrigger;
import gHA_metamodel.Tag;
import gHA_metamodel.Trigger;
import gHA_metamodel.WEBHOOK_ACTIVITY_TYPES;
import gHA_metamodel.WorkflowRunTrigger;

/**
 * The services class used by VSM.
 */
public class Services {
	
	public void removeInputOption(Input input, List<String> selection) {
        List<String> values = input.getOptions();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeRuns_OnLabel(Runs_On runs, List<String> selection) {
        List<String> values = runs.getLabels();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeNeedJob(Need need, List<String> selection) {
        List<String> values = need.getJobs();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeArtifactPath(Artifact art, List<String> selection) {
        List<String> values = art.getPaths();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeRestoreCachePath(RestoreCache cache, List<String> selection) {
        List<String> values = cache.getPaths();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeRestoreCacheKey(RestoreCache cache, List<String> selection) {
        List<String> values = cache.getRestore_keys();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeSaveCachePath(SaveCache cache, List<String> selection) {
        List<String> values = cache.getPaths();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeContainerPort(Container cont, List<String> selection) {
        List<String> values = cont.getPorts();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeContainerVolume(Container cont, List<String> selection) {
        List<String> values = cont.getVolumes();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeMatrixConfigValue(MatrixConfig config, List<String> selection) {
        List<String> values = config.getValues();
        selection.forEach(value -> values.remove(value));
    }
	
	public void removeDockerArg(Docker docker, List<String> selection) {
        List<String> values = docker.getArgs();
        selection.forEach(value -> values.remove(value));
    }
	
    
	public List<String> getEventTypes(StandardEventTrigger event) {
        List<String> eventTypes = new ArrayList<>();
        for (EVENTS literal : EVENTS.VALUES) {
        	eventTypes.add(literal.toString());
        }
        return eventTypes;
    }
	
	public List<WEBHOOK_ACTIVITY_TYPES> getActivityTypes(StandardEventTrigger event) {
        return WEBHOOK_ACTIVITY_TYPES.VALUES;
    }
	
	public List<String> getTriggerActivityTypes(StandardEventTrigger event) {
		List<String> eventTypes = new ArrayList<>();
        for (WEBHOOK_ACTIVITY_TYPES literal : event.getActivityType()) {
        	eventTypes.add(literal.getLiteral());
        }
        return eventTypes;
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
        for (INPUT_TYPES type : INPUT_TYPES.VALUES) {
        	inputTypes.add(type.getLiteral());
        }
        return inputTypes;
    }
	
	public List<String> getScopePermissionTypes(Permission permission) {
        List<String> scopeTypes = new ArrayList<>();
        for (PERMISSION_SCOPES type : PERMISSION_SCOPES.VALUES) {
        	scopeTypes.add(type.getLiteral());
        }
        return scopeTypes;
    }
	
	public List<String> getPermissionTypes(Permission permission) {
        List<String> permissionTypes = new ArrayList<>();
        for (PERMISSIONS type : PERMISSIONS.VALUES) {
        	permissionTypes.add(type.getLiteral());
        }
        return permissionTypes;
    }

	
	/*
	 * Validation methods
	 */
    public boolean checkUniquePermissionInstance(Permission perm) {
		int count = 0;
		EObject container = perm.eContainer();
		
		if(container instanceof Pipeline) {
			for (Permission permission : ((Pipeline) container).getPermissions()) {
				if (permission.isReadAll() || permission.isWriteAll() || permission.isDisableAll()) {
					count++;
					if (count > 1) {
						return false;
					}
				}
			}
		}
		
		if(container instanceof Job) {
			for (Permission permission : ((Job) container).getPermissions()) {
				if (permission.isReadAll() || permission.isWriteAll() || permission.isDisableAll()) {
					count++;
					if (count > 1) {
						return false;
					}
				}
			}
		}
        return true;
    }
	
	
    public boolean checkUniqueTriggerTypes(Trigger trigger) {
        if (!(trigger instanceof ScheduleTrigger)) {
            int count = 0;
            Pipeline pipeline = (Pipeline) trigger.eContainer();
            for (Trigger t : pipeline.getTriggers()) {
                if (t.getClass().equals(trigger.getClass())) {
                    count++;
                }
            }
            if (count > 1) {
            	return false;
            }
        }
        return true;
    }

	
    public boolean checkNoConflictingPermissions(Permission permission) {
        boolean readAll = permission.isReadAll();
        boolean writeAll = permission.isWriteAll();
        boolean disableAll = permission.isDisableAll();
        
        if (readAll && (writeAll || disableAll)) {
        	return false;
        }
        
        if (writeAll && (readAll || disableAll)) {
        	return false;
        }
        
        if (disableAll && (readAll || writeAll)) {
        	return false;
        }
        return true;
    }
	
	
    public boolean checkLabelsAndGroupNotNull(Runs_On runsOn) {
		if (runsOn.getGroup() == null && runsOn.getLabels() == null) {
			return false;
        }
		return true;
    }

	
    public boolean checkLabelsAndGroupNotEmpty(Runs_On runsOn) {
        
        if (runsOn.getGroup().isEmpty() && runsOn.getLabels().isEmpty()) {
        	return false;
        }
        
        if (runsOn.getGroup().isEmpty() && runsOn.getLabels().stream().anyMatch(label -> label.isEmpty())) {
        	return false;
        }      
        return true;
    }
	
	
    public boolean checkArgsAndEntrypointNotNull(InputPair inputPair) {
		if (inputPair.getArgs() == null && inputPair.getEntrypoint() == null) {
			return false;
        }
		return true;
    }

	
    public boolean checkArgsAndEntrypointNotEmpty(InputPair inputPair) {
		if (inputPair.getArgs().isEmpty() && inputPair.getEntrypoint().isEmpty()) {
			return false;
		}
		return true;
    }

	
    public boolean checkValidCronSyntax(ScheduleTrigger scheduleTrigger) {
        if (scheduleTrigger.getCron() == null || !scheduleTrigger.getCron().matches("(?:[0-9]|1[0-9]|2[0-3]|H|L|\\*|\\?|[0-5]?[0-9]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]|\\*/[0-9]+) (?:[0-9]|1[0-9]|2[0-3]|\\*|L|\\?|[01]?[0-9]|2[0-9]|3[01]|W|L\\-?[0-6]|#[1-5]) (?:[0-9]|1[0-2]|\\*|L|\\?|\\*/[0-9]+) (?:[0-7]|\\*|L|\\?|#[1-5])")) {
            return false;
        }
        return true;
    }
    
    public boolean checkJobsExist(Need need) {
    	Job job = (Job) need.eContainer();
    	Pipeline pipeline = (Pipeline) job.eContainer();
        for (String jobName : need.getJobs()) {
            if (pipeline.getJobs().stream().noneMatch(j -> j.getName().equals(jobName))) {
            	return false;
            }
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
    
    public boolean checkValidCondition(If ifCondition) {
    	if (ifCondition.getCondition().contains("!") &&
                !(ifCondition.getCondition().startsWith("${{") && ifCondition.getCondition().endsWith("}}") ||
                        ifCondition.getCondition().startsWith("'") && ifCondition.getCondition().endsWith("'") ||
                        ifCondition.getCondition().startsWith("\"") && ifCondition.getCondition().endsWith("\"") ||
                        ifCondition.getCondition().startsWith("(") && ifCondition.getCondition().endsWith(")"))) {
		    return false;
		}
        return true;
    }

    
	public boolean checkValidEventActivityType(StandardEventTrigger trigger) {
	    EVENTS event = trigger.getEvent();
	    List<WEBHOOK_ACTIVITY_TYPES> activityTypes = trigger.getActivityType();

	    if (event == EVENTS.BRANCH_PROTECTION_CONFIGURATION) {
            for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
                if (activity != WEBHOOK_ACTIVITY_TYPES.DISABLED && activity != WEBHOOK_ACTIVITY_TYPES.ENABLED) {
                	return false;
                }
            }
	    } 
	    else if (event == EVENTS.BRANCH_PROTECTION_RULE) {
           for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED) {
	            	return false;
	            }
            }
        } else if (event == EVENTS.CHECK_RUN) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.COMPLETED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.REQUESTED_ACTION && activity != WEBHOOK_ACTIVITY_TYPES.REREQUESTED) {
	            	return false;
	            }
            }
        } else if (event == EVENTS.CHECK_SUITE) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.COMPLETED && activity != WEBHOOK_ACTIVITY_TYPES.REQUESTED && activity != WEBHOOK_ACTIVITY_TYPES.REREQUESTED) {
	            	return false;
	            }
            }
        } else if (event == EVENTS.CODE_SCANNING_ALERT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.APPEARED_IN_BRANCH && activity != WEBHOOK_ACTIVITY_TYPES.CLOSED_BY_USER && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.FIXED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED_BY_USER) {
	            	return false;
	            }
            }
        } else if (event == EVENTS.CUSTOM_PROPERTY) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.UPDATED) {
	            	return false;
	            }
            }
        } else if (event == EVENTS.DEPENDABOT_ALERT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.AUTO_DISMISSED && activity != WEBHOOK_ACTIVITY_TYPES.AUTO_REOPENED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DISMISSED && activity != WEBHOOK_ACTIVITY_TYPES.FIXED && activity != WEBHOOK_ACTIVITY_TYPES.REINTRODUCED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.DEPLOY_KEY) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.DEPLOYMENT_REVIEW) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.APPROVED && activity != WEBHOOK_ACTIVITY_TYPES.REJECTED && activity != WEBHOOK_ACTIVITY_TYPES.REQUESTED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.DISCUSSION) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ANSWERED && activity != WEBHOOK_ACTIVITY_TYPES.CATEGORY_CHANGED && activity != WEBHOOK_ACTIVITY_TYPES.CLOSED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.LABELED && activity != WEBHOOK_ACTIVITY_TYPES.PINNED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED && activity != WEBHOOK_ACTIVITY_TYPES.TRANSFERRED && activity != WEBHOOK_ACTIVITY_TYPES.UNANSWERED && activity != WEBHOOK_ACTIVITY_TYPES.UNLABELED && activity != WEBHOOK_ACTIVITY_TYPES.UNLOCKED && activity != WEBHOOK_ACTIVITY_TYPES.UNPINNED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.DISCUSSION_COMMENT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.INSTALLATION) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.NEW_PERMISSIONS_ACCEPTED && activity != WEBHOOK_ACTIVITY_TYPES.SUSPEND_UNSUSPEND) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.INSTALLATION_REPOSITORIES) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ADDED && activity != WEBHOOK_ACTIVITY_TYPES.REMOVED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.ISSUE_COMMENT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.ISSUES) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ASSIGNED && activity != WEBHOOK_ACTIVITY_TYPES.CLOSED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.DEMILESTONED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.LABELED && activity != WEBHOOK_ACTIVITY_TYPES.LOCKED && activity != WEBHOOK_ACTIVITY_TYPES.MILESTONED && activity != WEBHOOK_ACTIVITY_TYPES.OPENED && activity != WEBHOOK_ACTIVITY_TYPES.PINNED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED && activity != WEBHOOK_ACTIVITY_TYPES.TRANSFERRED && activity != WEBHOOK_ACTIVITY_TYPES.UNASSIGNED && activity != WEBHOOK_ACTIVITY_TYPES.UNLABELED && activity != WEBHOOK_ACTIVITY_TYPES.UNLOCKED && activity != WEBHOOK_ACTIVITY_TYPES.UNPINNED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.LABEL) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.MARKETPLACE_PURCHASE) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CANCELLED && activity != WEBHOOK_ACTIVITY_TYPES.CHANGED && activity != WEBHOOK_ACTIVITY_TYPES.PENDING_CHANGE && activity != WEBHOOK_ACTIVITY_TYPES.PENDING_CHANGE_CANCELLED && activity != WEBHOOK_ACTIVITY_TYPES.PURCHASED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.MEMBER) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ADDED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.REMOVED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.MEMBERSHIP) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ADDED && activity != WEBHOOK_ACTIVITY_TYPES.REMOVED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.MERGE_GROUP) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CHECKS_REQUESTED && activity != WEBHOOK_ACTIVITY_TYPES.DESTROYED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.MILESTONE) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CLOSED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.OPENED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.ORG_BLOCK) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.BLOCKED && activity != WEBHOOK_ACTIVITY_TYPES.UNBLOCKED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.ORGANIZATION) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.MEMBER_ADDED && activity != WEBHOOK_ACTIVITY_TYPES.MEMBER_INVITED && activity != WEBHOOK_ACTIVITY_TYPES.MEMBER_REMOVED && activity != WEBHOOK_ACTIVITY_TYPES.RENAMED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PACKAGE) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.PUBLISHED && activity != WEBHOOK_ACTIVITY_TYPES.UPDATED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PERSONAL_ACCESS_TOKEN_REQUEST) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.APPROVED && activity != WEBHOOK_ACTIVITY_TYPES.CANCELLED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DENIED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PROJECT_CARD) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CONVERTED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.MOVED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PROJECT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CLOSED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PROJECT_COLUMN) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.MOVED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PROJECTS_V2) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.CLOSED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PROJECTS_V2_ITEM) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.ARCHIVED && activity != WEBHOOK_ACTIVITY_TYPES.CONVERTED && activity != WEBHOOK_ACTIVITY_TYPES.REORDERED && activity != WEBHOOK_ACTIVITY_TYPES.RESTORED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PULL_REQUEST) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ASSIGNED && activity != WEBHOOK_ACTIVITY_TYPES.AUTO_MERGE_DISABLED && activity != WEBHOOK_ACTIVITY_TYPES.AUTO_MERGE_ENABLED && activity != WEBHOOK_ACTIVITY_TYPES.CLOSED && activity != WEBHOOK_ACTIVITY_TYPES.CONVERTED_TO_DRAFT && activity != WEBHOOK_ACTIVITY_TYPES.DEMILESTONED && activity != WEBHOOK_ACTIVITY_TYPES.DEQUEUED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.ENQUEUED && activity != WEBHOOK_ACTIVITY_TYPES.LABELED && activity != WEBHOOK_ACTIVITY_TYPES.LOCKED && activity != WEBHOOK_ACTIVITY_TYPES.MILESTONED && activity != WEBHOOK_ACTIVITY_TYPES.OPENED && activity != WEBHOOK_ACTIVITY_TYPES.READY_FOR_REVIEW && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED && activity != WEBHOOK_ACTIVITY_TYPES.REVIEW_REQUEST_REMOVED && activity != WEBHOOK_ACTIVITY_TYPES.REVIEW_REQUESTED && activity != WEBHOOK_ACTIVITY_TYPES.SYNCHRONIZE && activity != WEBHOOK_ACTIVITY_TYPES.UNASSIGNED && activity != WEBHOOK_ACTIVITY_TYPES.UNLABELED && activity != WEBHOOK_ACTIVITY_TYPES.UNLOCKED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PULL_REQUEST_REVIEW_COMMENT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PULL_REQUEST_REVIEW) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.DISMISSED && activity != WEBHOOK_ACTIVITY_TYPES.SUBMITTED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.PULL_REQUEST_REVIEW_THREAD) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.RESOLVED && activity != WEBHOOK_ACTIVITY_TYPES.UNRESOLVED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.REGISTRY_PACKAGE) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.PUBLISHED && activity != WEBHOOK_ACTIVITY_TYPES.UPDATED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.RELEASE) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.PRERELEASED && activity != WEBHOOK_ACTIVITY_TYPES.PUBLISHED && activity != WEBHOOK_ACTIVITY_TYPES.RELEASED && activity != WEBHOOK_ACTIVITY_TYPES.UNPUBLISHED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.REPOSITORY_ADVISORY) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.PUBLISHED && activity != WEBHOOK_ACTIVITY_TYPES.REPORTED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.REPOSITORY) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ARCHIVED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.PRIVATIZED && activity != WEBHOOK_ACTIVITY_TYPES.PUBLICIZED && activity != WEBHOOK_ACTIVITY_TYPES.RENAMED && activity != WEBHOOK_ACTIVITY_TYPES.TRANSFERRED && activity != WEBHOOK_ACTIVITY_TYPES.UNARCHIVED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.REPOSITORY_RULESET) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.REPOSITORY_VULNERABILITY_ALERT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATE && activity != WEBHOOK_ACTIVITY_TYPES.DISMISS && activity != WEBHOOK_ACTIVITY_TYPES.REOPEN && activity != WEBHOOK_ACTIVITY_TYPES.RESOLVE) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.SECRET_SCANNING_ALERT) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.REOPENED && activity != WEBHOOK_ACTIVITY_TYPES.RESOLVED && activity != WEBHOOK_ACTIVITY_TYPES.REVOKED && activity != WEBHOOK_ACTIVITY_TYPES.VALIDATED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.SECURITY_ADVISORY) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.PUBLISHED && activity != WEBHOOK_ACTIVITY_TYPES.UPDATED && activity != WEBHOOK_ACTIVITY_TYPES.WITHDRAWN) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.SPONSORSHIP) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CANCELLED && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.PENDING_CANCELLATION && activity != WEBHOOK_ACTIVITY_TYPES.PENDING_TIER_CHANGE && activity != WEBHOOK_ACTIVITY_TYPES.TIER_CHANGED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.STAR) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.TEAM) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.ADDED_TO_REPOSITORY && activity != WEBHOOK_ACTIVITY_TYPES.CREATED && activity != WEBHOOK_ACTIVITY_TYPES.EDITED && activity != WEBHOOK_ACTIVITY_TYPES.DELETED && activity != WEBHOOK_ACTIVITY_TYPES.REMOVED_FROM_REPOSITORY) {
	            	return false;
	                
	            }
            }
        } else if (event == EVENTS.WORKFLOW_JOB) {
        	for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	            if (activity != WEBHOOK_ACTIVITY_TYPES.COMPLETED && activity != WEBHOOK_ACTIVITY_TYPES.IN_PROGRESS && activity != WEBHOOK_ACTIVITY_TYPES.QUEUED && activity != WEBHOOK_ACTIVITY_TYPES.WAITING) {
	            	return false;
	                
	            }
            }
        } else {
	            for (WEBHOOK_ACTIVITY_TYPES activity : activityTypes) {
	                if (activity != WEBHOOK_ACTIVITY_TYPES.NONE) {
	                	return false;
	                    
	                }
	            }
	        }
	    return true;
	}
	
	/*
     * Validators to check mandatory attributes
     */
	
	
    public boolean checkCredUsernameNotEmpty(Credentials credentials) {
    	return checkMandatoryStringNotEmpty(credentials.getUsername());
    }

    public boolean checkCredPassNotEmpty(Credentials credentials) {
    	return checkMandatoryStringNotEmpty(credentials.getPassword());
    }
    
    public boolean checkJobNameNotEmpty(Job job) {
    	return checkMandatoryStringNotEmpty(job.getName());
    }

    
    public boolean checkDockerImNotEmpty(Docker docker) {
    	return checkMandatoryStringNotEmpty(docker.getImage());
    }
    
    public boolean checkDockerUsesNotEmpty(Docker docker) {
    	return checkMandatoryStringNotEmpty(docker.getUses());
    }

    
    public boolean checkServiceNameNotEmpty(Service service) {
    	return checkMandatoryStringNotEmpty(service.getName());
    }

    
    public boolean checkCommandNameNotEmpty(Command command) {
    	return checkMandatoryStringNotEmpty(command.getName());
    }

    
    public boolean checkParameterNotEmpty(Parameter parameter) {
    	return checkMandatoryStringNotEmpty(parameter.getParameter());
    }

    public boolean checkArtifactPathsNotEmpty(Artifact artifact) {
    	return checkMandatoryListNotEmpty(artifact.getPaths());
    }
    
    public boolean checkArtifactUsesNotEmpty(Artifact artifact) {
    	return checkMandatoryStringNotEmpty(artifact.getUses());
    }
    
    public boolean checkRestorePathsNotEmpty(RestoreCache cache) {
    	return checkMandatoryListNotEmpty(cache.getPaths());
    }

    public boolean checkRestoreUsesNotEmpty(RestoreCache cache) {
    	return checkMandatoryStringNotEmpty(cache.getUses());
    }
    
    public boolean checkRestoreKeyNotEmpty(RestoreCache cache) {
    	return checkMandatoryStringNotEmpty(cache.getKey());
    }
    
    public boolean checkSavePathsNotEmpty(SaveCache cache) {
    	return checkMandatoryListNotEmpty(cache.getPaths());
    }
    
    public boolean checkSaveUsesNotEmpty(SaveCache cache) {
    	return checkMandatoryStringNotEmpty(cache.getUses());
    }
    
    public boolean checkSaveKeyNotEmpty(SaveCache cache) {
    	return checkMandatoryStringNotEmpty(cache.getKey());
    }
    
    public boolean checkEnvironmentNameNotEmpty(Environment environment) {
    	return checkMandatoryStringNotEmpty(environment.getName());
    }
    
    public boolean checkActionUsesNotEmpty(Action action) {
    	return checkMandatoryStringNotEmpty(action.getUses());
    }
    
    public boolean checkOutputNameNotEmpty(Output output) {
    	return checkMandatoryStringNotEmpty(output.getName());
    }

    public boolean checkOutputValueNotEmpty(Output output) {
    	return checkMandatoryStringNotEmpty(output.getValue());
    }
    
    public boolean checkScheduleTriggerNotEmpty(ScheduleTrigger trigger) {
    	return checkMandatoryStringNotEmpty(trigger.getCron());
    }
   
    public boolean checkSecretKeyNotEmpty(Secret secret) {
    	return checkMandatoryStringNotEmpty(secret.getKey());
    }

    public boolean checkSecretValueNotEmpty(Secret secret) {
    	return checkMandatoryStringNotEmpty(secret.getValue());
    }
    
    public boolean checkSecretNameNotEmpty(Secret secret) {
    	return checkMandatoryStringNotEmpty(secret.getName());
    }
    
    public boolean checkEnvKeyNotEmpty(Env env) {
    	return checkMandatoryStringNotEmpty(env.getKey());
    }

    public boolean checkEnvValNotEmpty(Env env) {
    	return checkMandatoryStringNotEmpty(env.getValue());
    }
    
    public boolean checkConcurrencyNotEmpty(Concurrency concurrency) {
    	return checkMandatoryStringNotEmpty(concurrency.getGroup());
    }
    
    public boolean checkIfNotEmpty(If ifCondition) {
    	return checkMandatoryStringNotEmpty(ifCondition.getCondition());
    }
    
    public boolean checkMatrixConfigKeyNotEmpty(MatrixConfig matrixConfig) {
    	return checkMandatoryStringNotEmpty(matrixConfig.getKey());
    }

    public boolean checkMatrixConfigValuesNotEmpty(MatrixConfig matrixConfig) {
    	return checkMandatoryListNotEmpty(matrixConfig.getValues());
    }
    
    public boolean checkInputParamsKeyNotEmpty(InputParams params) {
    	return checkMandatoryStringNotEmpty(params.getKey());
    }

    public boolean checkInputParamsValueNotEmpty(InputParams params) {
    	return checkMandatoryStringNotEmpty(params.getValue());
    }
    
    public boolean checkDefaultSettingShellNotEmpty(DefaultSetting defaultSetting) {
    	return checkMandatoryStringNotEmpty(defaultSetting.getShell());
    }

    public boolean checkDefaultSettingWorkingDirNotEmpty(DefaultSetting defaultSetting) {
    	return checkMandatoryStringNotEmpty(defaultSetting.getWorkingDirectory());
    }
    
    public boolean checkPathNameNotEmpty(Path path) {
    	return checkMandatoryStringNotEmpty(path.getName());
    }

    
    public boolean checkBranchNameNotEmpty(Branch branch) {
    	return checkMandatoryStringNotEmpty(branch.getName());
    }

    
    public boolean checkTagNameNotEmpty(Tag tag) {
    	return checkMandatoryStringNotEmpty(tag.getName());
    }
    
    public boolean checkWorkflowRunTriggerNotEmpty(WorkflowRunTrigger trigger) {
    	return checkMandatoryStringNotEmpty(trigger.getWorkflow());
    }

    public boolean checkWorkflowRunTriggerTypeNotEmpty(WorkflowRunTrigger trigger) {
    	return checkMandatoryStringNotEmpty(trigger.getType());
    }
    
    public boolean checkContainerImageNotEmpty(Container container) {
    	return checkMandatoryStringNotEmpty(container.getImage());
    }

    
    public boolean checkInputNameNotEmpty(Input input) {
        return checkMandatoryStringNotEmpty(input.getName());
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
