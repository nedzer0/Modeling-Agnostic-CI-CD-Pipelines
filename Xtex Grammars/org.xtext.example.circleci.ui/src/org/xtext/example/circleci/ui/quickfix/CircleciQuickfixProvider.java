/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.circleci.ui.quickfix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.circleci.validation.CircleciValidator;

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class CircleciQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(CircleciValidator.JOB_NOT_FOUND_ERRORCODE)
    public void fixJobNotFound(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Fix JobWorkflow not found", "Reference an existing job.", null, new IModification() {
            public void apply(IModificationContext context) throws BadLocationException {
            	IXtextDocument xtextDocument = context.getXtextDocument();
                String documentContent = xtextDocument.get();
                List<String> jobNames = extractJobNames(documentContent);
                Integer offset = issue.getOffset();

                
                List<String> jobWorkflowNames = extractWorkflowJobs(documentContent);
                
                String missingJobName = null;
                for (String jobName : jobNames) {
                    if (!jobWorkflowNames.contains(jobName)) {
                        missingJobName = jobName;
                        break;
                    }
                }
                                
                if (missingJobName != null) {
                    xtextDocument.replace(offset, issue.getLength(), missingJobName);
                } else {
                    int lineStart = getLineStart(documentContent, offset);
                    int lineEnd = getLineEnd(documentContent, offset);
                    xtextDocument.replace(lineStart, lineEnd - lineStart, "");
                }
            }
        });
    }

	@Fix(CircleciValidator.INVALID_PARAMETER_TYPE_ERRORCODE)
	public void fixInvalidParameterType(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Change Parameter Type to STRING", "Change the parameter type to STRING.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                xtextDocument.replace(issue.getOffset(), issue.getLength(), "STRING");
	        }
	    });
	}
	
	@Fix(CircleciValidator.INVALID_PARAMETER_TYPE_ERRORCODE)
	public void fixInvalidParameterType2(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Change Parameter Type to BOOLEAN", "Change the parameter type to BOOLEAN.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                xtextDocument.replace(issue.getOffset(), issue.getLength(), "BOOLEAN");
	        }
	    });
	}
	
	@Fix(CircleciValidator.INVALID_PARAMETER_TYPE_ERRORCODE)
	public void fixInvalidParameterType3(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Change Parameter Type to INTEGER", "Change the parameter type to INTEGER.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                xtextDocument.replace(issue.getOffset(), issue.getLength(), "INTEGER");
	        }
	    });
	}
	
	@Fix(CircleciValidator.INVALID_PARAMETER_TYPE_ERRORCODE)
	public void fixInvalidParameterType4(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Change Parameter Type to ENUM", "Change the parameter type to ENUM.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                xtextDocument.replace(issue.getOffset(), issue.getLength(), "ENUM");
	        }
	    });
	}

	@Fix(CircleciValidator.INVALID_CRON_SYNTAX_ERRORCODE)
	public void fixInvalidCronSyntax(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Correct Cron Syntax", "Correct the cron syntax.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
	        	xtextDocument.replace(issue.getOffset(), issue.getLength(), "\"*/1 * * * *\"");
	        }
	    });
	}
	
	@Fix(CircleciValidator.DUPLICATE_JOB_NAME_ERRORCODE)
	public void fixDuplicateJobName(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Rename Job", "Rename the job to ensure uniqueness.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                Integer offset = issue.getOffset();
                Integer length = issue.getLength();
                String originalName = xtextDocument.get(offset, length);
                int randomInt = (int) (Math.random() * 100);
                
                if(originalName.contains("\"")) {
                    int firstQuoteIndex = originalName.indexOf("\"");
                    int lastQuoteIndex = originalName.lastIndexOf("\"");
                    
                    if (firstQuoteIndex != -1 && lastQuoteIndex != -1 && firstQuoteIndex != lastQuoteIndex) {
                        String newName = originalName.substring(0, lastQuoteIndex) + randomInt + originalName.substring(lastQuoteIndex);
                        xtextDocument.replace(offset, length, newName);
                    } else {
                        
                    }
                } else {
                    String newName = originalName + randomInt;
                    xtextDocument.replace(offset, length, newName);
                }
	        }
	    });
	}
	
	@Fix(CircleciValidator.DUPLICATE_EXECUTOR_NAME_ERRORCODE)
	public void fixDuplicateExecutorName(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Rename Executor", "Rename the Executor to ensure uniqueness.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                Integer offset = issue.getOffset();
                Integer length = issue.getLength();
                String originalName = xtextDocument.get(offset, length);
                int randomInt = (int) (Math.random() * 100);
                
                if(originalName.contains("\"")) {
                    int firstQuoteIndex = originalName.indexOf("\"");
                    int lastQuoteIndex = originalName.lastIndexOf("\"");
                    
                    if (firstQuoteIndex != -1 && lastQuoteIndex != -1 && firstQuoteIndex != lastQuoteIndex) {
                        String newName = originalName.substring(0, lastQuoteIndex) + randomInt + originalName.substring(lastQuoteIndex);
                        xtextDocument.replace(offset, length, newName);
                    } else {
                        
                    }
                } else {
                    String newName = originalName + randomInt;
                    xtextDocument.replace(offset, length, newName);
                }
	        }
	    });
	}
	
	@Fix(CircleciValidator.DUPLICATE_COMMAND_NAME_ERRORCODE)
	public void fixDuplicateCommandName(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Rename Command", "Rename the Command to ensure uniqueness.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                Integer offset = issue.getOffset();
                Integer length = issue.getLength();
                String originalName = xtextDocument.get(offset, length);
                int randomInt = (int) (Math.random() * 100);
                
                if(originalName.contains("\"")) {
                    int firstQuoteIndex = originalName.indexOf("\"");
                    int lastQuoteIndex = originalName.lastIndexOf("\"");
                    
                    if (firstQuoteIndex != -1 && lastQuoteIndex != -1 && firstQuoteIndex != lastQuoteIndex) {
                        String newName = originalName.substring(0, lastQuoteIndex) + randomInt + originalName.substring(lastQuoteIndex);
                        xtextDocument.replace(offset, length, newName);
                    } else {
                        
                    }
                } else {
                    String newName = originalName + randomInt;
                    xtextDocument.replace(offset, length, newName);
                }
	        }
	    });
	}
	
	@Fix(CircleciValidator.DUPLICATE_PARAMETER_NAME_ERRORCODE)
	public void fixDuplicateParameterName(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Rename Parameter", "Rename the Parameter to ensure uniqueness.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                Integer offset = issue.getOffset();
                Integer length = issue.getLength();
                String originalName = xtextDocument.get(offset, length);
                int randomInt = (int) (Math.random() * 100);
                
                if(originalName.contains("\"")) {
                    int firstQuoteIndex = originalName.indexOf("\"");
                    int lastQuoteIndex = originalName.lastIndexOf("\"");
                    
                    if (firstQuoteIndex != -1 && lastQuoteIndex != -1 && firstQuoteIndex != lastQuoteIndex) {
                        String newName = originalName.substring(0, lastQuoteIndex) + randomInt + originalName.substring(lastQuoteIndex);
                        xtextDocument.replace(offset, length, newName);
                    } else {
                        
                    }
                } else {
                    String newName = originalName + randomInt;
                    xtextDocument.replace(offset, length, newName);
                }
	        }
	    });
	}
	

	@Fix(CircleciValidator.DUPLICATE_JOBWORKFLOW_NAME_ERRORCODE)
	public void fixDuplicateJobWorkflowName(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Rename JobWorkflow", "Rename the job to ensure uniqueness.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                String documentContent = xtextDocument.get();
                List<String> jobNames = extractJobNames(documentContent);
                Integer offset = issue.getOffset();
                
                List<String> jobWorkflowNames = extractWorkflowJobs(documentContent);

                String currentJobName = extractCurrentJobName(documentContent, offset);
                Collections.shuffle(jobNames);
                String newJobName = jobNames.stream()
                        .filter(name -> !jobWorkflowNames.contains(name) && !name.equals(currentJobName))
                        .findFirst()
                        .orElse(null);
                
                if (newJobName != null) {
                    xtextDocument.replace(offset, issue.getLength(), newJobName);
                } else {
                    int lineStart = getLineStart(documentContent, offset);
                    int lineEnd = getLineEnd(documentContent, offset);
                    xtextDocument.replace(lineStart, lineEnd - lineStart, "");
                }
	        }
	    });
	}

	
	@Fix(CircleciValidator.MULTIPLE_EXECUTOR_TYPES_ERRORCODE)
    public void fixMultipleExecutorTypes(Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, "Remove reuseExecutor", "Remove the reuseExecutor line.", null, new IModification() {
            public void apply(IModificationContext context) throws BadLocationException {
                IXtextDocument xtextDocument = context.getXtextDocument();
                int offset = issue.getOffset();
                String documentContent = xtextDocument.get();
                int lineStart = getLineStart(documentContent, offset);
                int lineEnd = getLineEnd(documentContent, offset);
                xtextDocument.replace(lineStart, lineEnd - lineStart, "");
            }
        });
    }

	@Fix(CircleciValidator.EXECUTOR_NOT_FOUND_ERRORCODE)
	public void fixExecutorNotFound(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Fix executor not found", "Refer an existing executor.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                String documentContent = xtextDocument.get();
                List<String> executorsNames = extractExecutorsNames(documentContent);
                Integer offset = issue.getOffset();

                String currentJobName = extractCurrentJobName(documentContent, offset);
                Collections.shuffle(executorsNames);
                String newJobName = executorsNames.stream()
                                            .filter(name -> !name.equals(currentJobName))
                                            .findFirst()
                                            .orElse(null);
                
                if (newJobName != null) {
                    xtextDocument.replace(offset, issue.getLength(), newJobName);
                }
                else {
                	int lineStart = getLineStart(documentContent, offset);
                    int lineEnd = getLineEnd(documentContent, offset);
                    xtextDocument.replace(lineStart, lineEnd - lineStart, "");
                }
	        }
	    });
	}

	@Fix(CircleciValidator.REQUIRED_JOB_NOT_EXIST_ERRORCODE)
	public void fixRequiredJobNotExist(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Fix required Job not found", "Refer an existing job name.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                String documentContent = xtextDocument.get();
                List<String> jobNames = extractJobNames(documentContent);
                Integer offset = issue.getOffset();

                String currentJobName = extractCurrentJobName(documentContent, offset);
                Collections.shuffle(jobNames);
                String newJobName = jobNames.stream()
                							.filter(name -> !name.equals(currentJobName))
                                            .findFirst()
                                            .orElse(null);
                if (newJobName != null) {
                    xtextDocument.replace(offset, issue.getLength(), newJobName);
                } else {
                    int lineStart = getLineStart(documentContent, offset);
                    int lineEnd = getLineEnd(documentContent, offset);
                    xtextDocument.replace(lineStart, lineEnd - lineStart, "");
                }
	        }
	    });
	}
	
	@Fix(CircleciValidator.NULL_ENUM_VALUES_ENTRY_ERRORCODE)
	public void fixNullEnumValuesEntry(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Fix null EnumValues entry", "Define EnumValues entry when Parameter type is ENUM", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
	            String documentContent = xtextDocument.get();
	            int offset = issue.getOffset();
	            
	            int lineStart = getLineStart(documentContent, offset);
	            int currentLineStart = lineStart;
	            int lineEnd;
	            boolean foundEndOfBlock = false;

	            while (!foundEndOfBlock) {
	                lineEnd = getLineEnd(documentContent, currentLineStart);
	                String line = documentContent.substring(currentLineStart, lineEnd).trim();
	                if (line.isEmpty() || lineEnd >= documentContent.length()) {
	                    foundEndOfBlock = true;
	                    break;
	                }
	                currentLineStart = lineEnd;
	            }

	            String newEnumVal = "\t\tenumValues \"enum1\"";
	            xtextDocument.replace(currentLineStart, 0, newEnumVal + "\n");
	        }
	    });
	}
	
	@Fix(CircleciValidator.ENUM_VALUES_EMPTY_ERRORCODE)
	public void fixEnumValuesEmpty(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Add Enum Values", "Add values to the enum parameter.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
	        	xtextDocument.replace(issue.getOffset(), issue.getLength(), "enum1");
	        }
	    });
	}

	@Fix(CircleciValidator.ENUM_VALUES_NOT_EMPTY_ERRORCODE)
	public void fixEnumValuesNotEmpty(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Remove Enum Values", "Remove enum values for non-enum parameters.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
                int offset = issue.getOffset();
                String documentContent = xtextDocument.get();
                int lineStart = getLineStart(documentContent, offset);
                int lineEnd = getLineEnd(documentContent, offset);
                xtextDocument.replace(lineStart, lineEnd - lineStart, "");
	        }
	    });
	}

	@Fix(CircleciValidator.INVALID_BOOLEAN_DEFAULT_VALUE_ERRORCODE)
	public void fixInvalidBooleanDefaultValue(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Set Boolean Default Value to true", "Set the default value to 'true'.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
	        	xtextDocument.replace(issue.getOffset(), issue.getLength(), "\"true\"");
	        }
	    });
	}
	
	@Fix(CircleciValidator.INVALID_BOOLEAN_DEFAULT_VALUE_ERRORCODE)
	public void fixInvalidBooleanDefaultValue2(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Set Boolean Default Value to false", "Set the default value to 'false'.", null, new IModification() {
	        public void apply(IModificationContext context) throws BadLocationException {
	        	IXtextDocument xtextDocument = context.getXtextDocument();
	        	xtextDocument.replace(issue.getOffset(), issue.getLength(), "\"false\"");
	        }
	    });
	}
	
	
	@Fix(CircleciValidator.MANDATORY_JOB_NAME_EMPTY_ERRORCODE)
	public void fixEmptyJobName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty job name", acceptor, "\"New Job Name\"");
	}

	@Fix(CircleciValidator.MANDATORY_COMMAND_NAME_EMPTY_ERRORCODE)
	public void fixEmptyCommandName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty command name", acceptor, "\"New Command Name\"");
	}

	@Fix(CircleciValidator.MANDATORY_PARAMETER_NAME_EMPTY_ERRORCODE)
	public void fixEmptyParameterName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty parameter name", acceptor, "\"New Parameter Name\"");
	}

	@Fix(CircleciValidator.MANDATORY_PARAMETERS_PARAMETER_EMPTY_ERRORCODE)
	public void fixEmptyParametersParameter(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty parameters parameter", acceptor, "\"New Parameters Parameter\"");
	}

	@Fix(CircleciValidator.MANDATORY_ENVIRONMENT_KEY_EMPTY_ERRORCODE)
	public void fixEmptyEnvironmentKey(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty environment key", acceptor, "\"New Environment Key\"");
	}

	@Fix(CircleciValidator.MANDATORY_SAVE_CACHE_PATHS_EMPTY_ERRORCODE)
	public void fixEmptySaveCachePaths(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty SaveCache paths", acceptor, "\"New SaveCache Path\"");
	}

	@Fix(CircleciValidator.MANDATORY_STORE_ARTIFACT_PATH_EMPTY_ERRORCODE)
	public void fixEmptyStoreArtifactPath(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty StoreArtifact path", acceptor, "\"New StoreArtifact Path\"");
	}
	
	@Fix(CircleciValidator.MANDATORY_ATTACH_WORKSPACE_AT_EMPTY_ERRORCODE)
	public void fixEmptyAttachWorkspaceAt(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty AttachWorkspace at", acceptor, "\"New Workspace Location\"");
	}

	@Fix(CircleciValidator.MANDATORY_STORE_TEST_RESULTS_PATH_EMPTY_ERRORCODE)
	public void fixEmptyStoreTestResultsPath(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty StoreTestResults path", acceptor, "\"New Test Results Path\"");
	}

	@Fix(CircleciValidator.MANDATORY_PERSIST_TO_WORKSPACE_PATHS_EMPTY_ERRORCODE)
	public void fixEmptyPersistToWorkspacePaths(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty PersistToWorkspace paths", acceptor, "\"New Workspace Path\"");
	}

	@Fix(CircleciValidator.MANDATORY_PERSIST_TO_WORKSPACE_ROOT_EMPTY_ERRORCODE)
	public void fixEmptyPersistToWorkspaceRoot(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty PersistToWorkspace root", acceptor, "\"New Workspace Root\"");
	}

	@Fix(CircleciValidator.MANDATORY_RESTORE_CACHE_KEYS_EMPTY_ERRORCODE)
	public void fixEmptyRestoreCacheKeys(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty RestoreCache keys", acceptor, "\"New Cache Key\"");
	}

	@Fix(CircleciValidator.MANDATORY_RESTORE_CACHE_KEY_EMPTY_ERRORCODE)
	public void fixEmptyRestoreCacheKey(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty RestoreCache key", acceptor, "\"New Cache Key\"");
	}

	@Fix(CircleciValidator.MANDATORY_BRANCH_NAME_EMPTY_ERRORCODE)
	public void fixEmptyBranchName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty branch name", acceptor, "\"New Branch Name\"");
	}

	@Fix(CircleciValidator.MANDATORY_TRIGGER_CRON_EMPTY_ERRORCODE)
	public void fixEmptyTriggerCron(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty trigger cron", acceptor, "\"* * * * *\"");
	}

	@Fix(CircleciValidator.MANDATORY_JOB_WORKFLOW_NAME_EMPTY_ERRORCODE)
	public void fixEmptyJobWorkflowName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty JobWorkflow name", acceptor, "\"New JobWorkflow Name\"");
	}

	@Fix(CircleciValidator.MANDATORY_WORKFLOW_NAME_EMPTY_ERRORCODE)
	public void fixEmptyWorkflowName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Workflow name", acceptor, "\"New Workflow Name\"");
	}

	@Fix(CircleciValidator.MANDATORY_WORKFLOW_VERSION_EMPTY_ERRORCODE)
	public void fixEmptyWorkflowVersion(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Workflow version", acceptor, "\"1.0\"");
	}

	@Fix(CircleciValidator.MANDATORY_MACOS_XCODE_EMPTY_ERRORCODE)
	public void fixEmptyMacOsXcode(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty MacOs xcode", acceptor, "\"12.5\"");
	}
	
	@Fix(CircleciValidator.MANDATORY_MACOS_NAME_EMPTY_ERRORCODE)
	public void fixEmptyMacOsName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty MacOs name", acceptor, "\"New MacOs name\"");
	}

	@Fix(CircleciValidator.MANDATORY_MACHINE_IMAGE_EMPTY_ERRORCODE)
	public void fixEmptyMachineImage(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Machine image", acceptor, "\"New Machine Image\"");
	}
	
	@Fix(CircleciValidator.MANDATORY_MACHINE_NAME_EMPTY_ERRORCODE)
	public void fixEmptyMachineName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Machine name", acceptor, "\"New Machine name\"");
	}

	@Fix(CircleciValidator.MANDATORY_DOCKER_IMAGE_EMPTY_ERRORCODE)
	public void fixEmptyDockerImage(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Docker image", acceptor, "\"New Docker Image\"");
	}
	
	@Fix(CircleciValidator.MANDATORY_DOCKER_NAME_EMPTY_ERRORCODE)
	public void fixEmptyDockerName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Docker name", acceptor, "\"New Docker name\"");
	}

	@Fix(CircleciValidator.MANDATORY_DOCKER_AUTH_USERNAME_EMPTY_ERRORCODE)
	public void fixEmptyDockerAuthUsername(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Docker_Auth username", acceptor, "\"new_username\"");
	}

	@Fix(CircleciValidator.MANDATORY_DOCKER_AUTH_PASSWORD_EMPTY_ERRORCODE)
	public void fixEmptyDockerAuthPassword(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Docker_Auth password", acceptor, "\"new_password\"");
	}

	@Fix(CircleciValidator.MANDATORY_DOCKER_AWS_AUTHS_ACCESS_KEY_ID_EMPTY_ERRORCODE)
	public void fixEmptyDockerAwsAuthsAccessKeyId(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Docker_Aws_Auths aws_access_key_id", acceptor, "\"new_access_key_id\"");
	}

	@Fix(CircleciValidator.MANDATORY_DOCKER_AWS_AUTHS_SECRET_ACCESS_KEY_EMPTY_ERRORCODE)
	public void fixEmptyDockerAwsAuthsSecretAccessKey(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Docker_Aws_Auths aws_secret_access_key", acceptor, "\"new_secret_access_key\"");
	}

	@Fix(CircleciValidator.MANDATORY_MATRIX_PARAMS_KEY_EMPTY_ERRORCODE)
	public void fixEmptyMatrixParamsKey(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty MatrixParams key", acceptor, "\"new_key\"");
	}

	@Fix(CircleciValidator.MANDATORY_MATRIX_PARAMS_VALUES_EMPTY_ERRORCODE)
	public void fixEmptyMatrixParamsValues(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty MatrixParams values", acceptor, "\"new_value\"");
	}

	@Fix(CircleciValidator.MANDATORY_PIPELINE_VERSION_EMPTY_ERRORCODE)
	public void fixEmptyPipelineVersion(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Pipeline version", acceptor, "\"2.0\"");
	}

	@Fix(CircleciValidator.MANDATORY_RUN_COMMAND_NAME_EMPTY_ERRORCODE)
	public void fixEmptyRunCommandkName(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty RunCommand name", acceptor, "\"New RunCommand Name\"");
	}

	@Fix(CircleciValidator.MANDATORY_WHEN_UNLESS_CONDITION_EMPTY_ERRORCODE)
	public void fixEmptyWhenUnlessCondition(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty When_Unless condition", acceptor, "\"New Condition\"");
	}

	@Fix(CircleciValidator.MANDATORY_ORB_KEY_EMPTY_ERRORCODE)
	public void fixEmptyOrbKey(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Orb key", acceptor, "\"new key\"");
	}

	@Fix(CircleciValidator.MANDATORY_ORB_VALUE_EMPTY_ERRORCODE)
	public void fixEmptyOrbValue(Issue issue, IssueResolutionAcceptor acceptor) {
	    fixEmptyString(issue, "Fix empty Orb value", acceptor, "\"new value\"");
	}

	/*
	 * Auxiliary Methods
	 */
	
    private void fixEmptyString(Issue issue, String label, IssueResolutionAcceptor acceptor, String suggestion) {
        acceptor.accept(issue, label, suggestion, null, new IModification() {
            public void apply(IModificationContext context) throws BadLocationException {
                IXtextDocument xtextDocument = context.getXtextDocument();
                String newValue = suggestion; 
                xtextDocument.replace(issue.getOffset(), issue.getLength(), newValue);
            }
        });
    }
    
    private List<String> extractJobNames(String documentContent) {
        List<String> jobNames = new ArrayList<>();
        String jobKeyword = "Job";
        String nameKeyword = "name ";
        String newline = "\n";
        
        int jobIndex = documentContent.lastIndexOf(jobKeyword);
        while (jobIndex >= 0) {
            int lineStart = documentContent.lastIndexOf(newline, jobIndex) + 1;
            int lineEnd = documentContent.indexOf(newline, jobIndex);
            
            String line = documentContent.substring(lineStart, lineEnd);
            if (line.trim().startsWith(jobKeyword)) {
                int nextLineStart = lineEnd + 1;
                int nextLineEnd = documentContent.indexOf(newline, nextLineStart);
                String nextLine = documentContent.substring(nextLineStart, nextLineEnd);
                if (nextLine.contains(nameKeyword)) {
                    int nameIndex = nextLine.indexOf(nameKeyword);
                    String currentJobName = nextLine.substring(nameIndex + nameKeyword.length()).trim();
                    jobNames.add(currentJobName);
                }
            }
            jobIndex = documentContent.lastIndexOf(jobKeyword, jobIndex - 1);
        }
        
        return jobNames;
    }
    
    private List<String> extractWorkflowJobs(String documentContent) {
        List<String> jobNames = new ArrayList<>();
        String jobKeyword = "JobWorkflow";
        String nameKeyword = "name ";
        String newline = "\n";
        
        int jobIndex = documentContent.lastIndexOf(jobKeyword);
        while (jobIndex >= 0) {
            int lineStart = documentContent.lastIndexOf(newline, jobIndex) + 1;
            int lineEnd = documentContent.indexOf(newline, jobIndex);
            
            String line = documentContent.substring(lineStart, lineEnd);
            if (line.trim().startsWith(jobKeyword)) {
                int nextLineStart = lineEnd + 1;
                int nextLineEnd = documentContent.indexOf(newline, nextLineStart);
                String nextLine = documentContent.substring(nextLineStart, nextLineEnd);
                if (nextLine.contains(nameKeyword)) {
                    int nameIndex = nextLine.indexOf(nameKeyword);
                    String currentJobName = nextLine.substring(nameIndex + nameKeyword.length()).trim();
                    jobNames.add(currentJobName);
                }
            }
            jobIndex = documentContent.lastIndexOf(jobKeyword, jobIndex - 1);
        }
        
        return jobNames;
    }
    
    private List<String> extractExecutorsNames(String documentContent) {
        List<String> executorNames = new ArrayList<>();
        List<String> executorKeywords = Arrays.asList("MacOs", "Machine", "Docker");
        String nameKeyword = "name ";
        String newline = "\n";
        boolean insideJobOrWorkflow = false;

        String[] lines = documentContent.split(newline);
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();

            if (line.startsWith("Job") || line.startsWith("Workflow")) {
                insideJobOrWorkflow = true;
            } else if (line.isEmpty()) {
                insideJobOrWorkflow = false;
            }

            if (!insideJobOrWorkflow) {
                for (String keyword : executorKeywords) {
                    if (line.startsWith(keyword)) {
                        while (++i < lines.length && !lines[i].trim().startsWith(nameKeyword)) {}
                        if (i < lines.length) {
                            String nameLine = lines[i].trim();
                            int nameIndex = nameLine.indexOf(nameKeyword);
                            String currentExecutorName = nameLine.substring(nameIndex + nameKeyword.length()).trim();
                            
                            executorNames.add(currentExecutorName);
                        }
                    }
                }
            }
        }
        return executorNames;
    }

    private String extractCurrentJobName(String documentContent, int offset) {
        String nameKeyword = "name ";
        int nameIndex = documentContent.lastIndexOf(nameKeyword, offset);
        if (nameIndex >= 0) {
            int lineStart = documentContent.lastIndexOf("\n", nameIndex) + 1;
            int lineEnd = documentContent.indexOf("\n", nameIndex);
            String line = documentContent.substring(lineStart, lineEnd);
            String currentJobName = line.trim();
            if (currentJobName.startsWith(nameKeyword)) {
                currentJobName = currentJobName.substring(nameKeyword.length()).trim();
                return currentJobName;
            }
        }
        return null;
    }

    
    private int getLineStart(String documentContent, int offset) {
        int lineStart = offset;
        while (lineStart > 0 && documentContent.charAt(lineStart - 1) != '\n') {
            lineStart--;
        }
        return lineStart;
    }

    private int getLineEnd(String documentContent, int offset) {
        int lineEnd = offset;
        while (lineEnd < documentContent.length() && documentContent.charAt(lineEnd) != '\n') {
            lineEnd++;
        }
        return lineEnd + 1; // Include the newline character
    }
}