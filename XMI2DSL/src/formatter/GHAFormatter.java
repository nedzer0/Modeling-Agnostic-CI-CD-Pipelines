package formatter;

import gHA_metamodel.ARTIFACT_TYPE;
import gHA_metamodel.INPUT_TYPES;
import gHA_metamodel.MATRIX_CONFIG_TYPE;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class GHAFormatter {
	
	public List<String> generateXtext(EObject object) {
        List<String> xtextLines = new ArrayList<>();
        generateXtextLines(object, xtextLines, 0);
        return xtextLines;
    }

	private void generateXtextLines(EObject object, List<String> xtextLines, int indentLevel) {
        EClass eClass = object.eClass();
        String className = eClass.getName();
        String indent = "    ".repeat(indentLevel);

        switch (className) {
            case "Pipeline":
                xtextLines.add(indent + "Pipeline");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel);
                break;
            case "Job":
                xtextLines.add(indent + "Job");
                appendJobAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "Need":
            	xtextLines.add(indent + "Need");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	break;
            case "If":
            	xtextLines.add(indent + "If");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	break;
            case "Output":
            	xtextLines.add(indent + "Output");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	break;
            case "Env":
                xtextLines.add(indent + "Env");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "Container":
            	xtextLines.add(indent + "Container");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	xtextLines.add("");
            	break;
            case "Service":
                xtextLines.add(indent + "Service");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Artifact":
            	xtextLines.add(indent + "Artifact");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	break;
            case "RestoreCache":
            	xtextLines.add(indent + "RestoreCache");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	break;
            case "SaveCache":
            	xtextLines.add(indent + "SaveCache");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	break;
            case "Strategy":
            	xtextLines.add(indent + "Strategy");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	break;
            case "Step":
                xtextLines.add(indent + "Step");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Command":
                xtextLines.add(indent + "Command");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Parameter":
                xtextLines.add(indent + "Parameter");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "ScheduleTrigger":
                xtextLines.add(indent + "ScheduleTrigger");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "WorkflowCallTrigger":
                xtextLines.add(indent + "WorkflowCallTrigger");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "Input":
                xtextLines.add(indent + "Input");
                appendInputAttributes(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Credentials":
                xtextLines.add(indent + "Credentials");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "MatrixConfig":
                xtextLines.add(indent + "MatrixConfig");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            default:
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
        }
    }
	
	private void appendInputAttributes(EObject object, List<String> xtextLines, EClass eClass, int indentLevel) {
	    String indent = "    ".repeat(indentLevel);

	    EAttribute nameAttribute = eClass.getEAllAttributes().stream()
	            .filter(attr -> attr.getName().equals("name"))
	            .findFirst()
	            .orElse(null);

	    if (nameAttribute != null) {
	        Object nameValue = object.eGet(nameAttribute);
	        if (nameValue != null && !nameValue.toString().isEmpty()) {
	            xtextLines.add(indent + nameAttribute.getName() + " \"" + nameValue.toString() + "\"");
	        }
	    }

	    EAttribute typeAttribute = eClass.getEAllAttributes().stream()
	            .filter(attr -> attr.getName().equals("type"))
	            .findFirst()
	            .orElse(null);

	    if (typeAttribute != null) {
	        Object typeValue = object.eGet(typeAttribute);
	        if (typeValue != null && !typeValue.toString().isEmpty()) {
	            xtextLines.add(indent + typeAttribute.getName() + " " + typeValue.toString().toUpperCase());
	        }
	    }

	    for (EAttribute attribute : eClass.getEAllAttributes()) {
	        String attributeName = attribute.getName();
	        if (!attributeName.equals("name") && !attributeName.equals("type")) {
	            Object value = object.eGet(attribute);
	            if(value != null) {
	            	if(value instanceof MATRIX_CONFIG_TYPE || value instanceof INPUT_TYPES || value instanceof ARTIFACT_TYPE) {
	            		xtextLines.add(indent + attributeName + " " + ((Enum<?>) value).name());
	            	}
	            	else if (value instanceof String) {
	            		String stringValue = (String) value;
	                    if ("true".equalsIgnoreCase(stringValue) && (attributeName.equals("readAll") || attributeName.equals("writeAll") || attributeName.equals("disableAll") || attributeName.equals("cancel_in_progress") || attributeName.equals("ignore") || attributeName.equals("isRequired") || attributeName.equals("required") || attributeName.equals("continue_on_error") || attributeName.equals("fail_fast") || attributeName.equals("fail_on_cache_miss"))) {
	                        xtextLines.add(indent + attributeName);
	                    } 
		                else if (!stringValue.isEmpty()) {
		                	if (eClass.getName().equals("Pipeline") && (attributeName.equals("name") || attributeName.equals("run-name"))) {
		                		xtextLines.add(attributeName + " \"" + stringValue + "\"");
		                    }
		                	if (stringValue.contains("\"")) {
	                            stringValue = stringValue.replace("\"", "'");
	                        }
		                	else{
		                		if(!eClass.getName().equals("Pipeline")) {
		                			xtextLines.add(indent + attributeName + " \"" + stringValue + "\"");
		                		}
		                	}
		                }
	                } else if (value instanceof List<?>) {
	                    appendEnumValues(attributeName, (List<?>) value, xtextLines, indentLevel);
	                } else if (value instanceof Boolean) {
	                    Boolean booleanValue = (Boolean) value;
	                    if (booleanValue) {
	                        xtextLines.add(indent + attributeName);
	                    }
	                }
	            }
	        }
	    }
	}
	
	private void appendJobAttributesAndReferences(EObject object, List<String> xtextLines, EClass eClass, int indentLevel) {
        String indent = "    ".repeat(indentLevel);

        for (EAttribute attribute : eClass.getEAllAttributes()) {
            String attributeName = attribute.getName();
            Object value = object.eGet(attribute);
            if (value != null && !value.toString().isEmpty()) {
            	if(!(attributeName.equals("timeout_minutes") && value.equals(360))) {
            		xtextLines.add(indent + attributeName + " \"" + value.toString() + "\"");
            	}
            }
        }

        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("need")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }
        
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("if")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }
        
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("outputs")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }
        
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("envs")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }
        
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("container")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }
        
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("services")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }
        
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("actions")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }
        
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("strategy")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
                break;
            }
        }

        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("steps")) {
                Object value = object.eGet(reference);
                if (value instanceof EObject) {
                    generateXtextLines((EObject) value, xtextLines, indentLevel);
                } else if (value instanceof List<?>) {
                    for (Object item : (List<?>) value) {
                        if (item instanceof EObject) {
                            generateXtextLines((EObject) item, xtextLines, indentLevel);
                        }
                    }
                }
            }
        }
    }
    
    private void appendAttributesAndReferences(EObject object, List<String> xtextLines, EClass eClass, int indentLevel) {
    	String indent = "    ".repeat(indentLevel);
    	
    	for (EAttribute attribute : eClass.getEAllAttributes()) {
            String attributeName = attribute.getName();
            Object value = object.eGet(attribute);
            
            if(value != null) {
            	if(value instanceof MATRIX_CONFIG_TYPE || value instanceof INPUT_TYPES || value instanceof ARTIFACT_TYPE) {
            		xtextLines.add(indent + attributeName + " " + ((Enum<?>) value).name());
            	}
            	else if (value instanceof String) {
            		String stringValue = (String) value;
                    if ("true".equalsIgnoreCase(stringValue) && (attributeName.equals("readAll") || attributeName.equals("writeAll") || attributeName.equals("disableAll") || attributeName.equals("cancel_in_progress") || attributeName.equals("ignore") || attributeName.equals("isRequired") || attributeName.equals("required") || (attributeName.equals("continue_on_error") && eClass.getName().equals("Step")) || attributeName.equals("fail_fast") || attributeName.equals("fail_on_cache_miss"))) {
                        xtextLines.add(indent + attributeName);
                    } 
	                else if (!stringValue.isEmpty()) {
	                	if (eClass.getName().equals("Pipeline") && (attributeName.equals("name") || attributeName.equals("run-name"))) {
	                		xtextLines.add(attributeName + " \"" + stringValue + "\"");
	                    }
	                	if (stringValue.contains("\"")) {
                            stringValue = stringValue.replace("\"", "'");
                        }
	                	else {
	                		if(!eClass.getName().equals("Pipeline")) {
	                			xtextLines.add(indent + attributeName + " \"" + stringValue + "\"");
	                		}
	                	}
	                }
                } else if (value instanceof List<?>) {
                    appendEnumValues(attributeName, (List<?>) value, xtextLines, indentLevel);
                } else if (value instanceof Boolean) {
                    Boolean booleanValue = (Boolean) value;
                    if (booleanValue) {
                        xtextLines.add(indent + attributeName);
                    }
                }
                else if (value instanceof Short) {
                	Short shortValue = (Short) value;
                	xtextLines.add(indent + attributeName + " " + shortValue);
                }
            }
        }

    	List<EObject> envReferences = new ArrayList<>();
        List<EObject> scheduleReferences = new ArrayList<>();
        List<EObject> workflowcallReferences = new ArrayList<>();
        List<EObject> jobReferences = new ArrayList<>();
        List<EObject> otherReferences = new ArrayList<>();

        for (EReference reference : eClass.getEAllReferences()) {
            Object value = object.eGet(reference);
            if (value instanceof EObject) {
                addReference((EObject) value, envReferences, scheduleReferences, workflowcallReferences, jobReferences, otherReferences);
            } else if (value instanceof List<?>) {
                for (Object item : (List<?>) value) {
                    if (item instanceof EObject) {
                    	addReference((EObject) item, envReferences, scheduleReferences, workflowcallReferences, jobReferences, otherReferences);
                    }
                }
            }
        }
        
        processReferences(envReferences, xtextLines, indentLevel);
        processReferences(scheduleReferences, xtextLines, indentLevel);
        processReferences(workflowcallReferences, xtextLines, indentLevel);
        processReferences(jobReferences, xtextLines, indentLevel);
        processReferences(otherReferences, xtextLines, indentLevel);
    }

    private void addReference(EObject refObject, List<EObject> envReferences, List<EObject> scheduleReferences, List<EObject> workflowcallReferences, List<EObject> jobReferences, List<EObject> otherReferences) {
    	String className = refObject.eClass().getName();
    	if (className.equals("Env")) {
        	envReferences.add(refObject);
        }
        else if (className.equals("ScheduleTrigger")) {
        	scheduleReferences.add(refObject);
        }
        else if (className.equals("WorkflowCallTrigger")) {
            workflowcallReferences.add(refObject);
        } else if (className.equals("Job")) {
        	jobReferences.add(refObject);
        } 
        else {
            otherReferences.add(refObject);
        }
    }
    
    private void processReferences(List<EObject> references, List<String> xtextLines, int indentLevel) {
        for (EObject reference : references) {
            generateXtextLines(reference, xtextLines, indentLevel);
        }
    }
    
    private void appendEnumValues(String attributeName, List<?> values, List<String> xtextLines, int indentLevel) {
    	if (values.isEmpty()) {
            return;
        }
    	
    	String indent = "    ".repeat(indentLevel);
        StringBuilder enumValuesString = new StringBuilder();
        for (Object value : values) {
        	enumValuesString.append("\"").append(value.toString()).append("\", ");
        }
        enumValuesString.setLength(enumValuesString.length() - 2);
        xtextLines.add(indent + attributeName + " " + enumValuesString.toString());
    }
}
