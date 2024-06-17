package formatter;

import circleCI_metamodel.DOCKER_RESOURCE_TYPE;
import circleCI_metamodel.MACHINE_RESOURCE_TYPE;
import circleCI_metamodel.MACOS_RESOURCE_TYPE;
import circleCI_metamodel.PARAMETER_TYPES;
import circleCI_metamodel.WHEN_TYPE;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class CircleCiFormatter {

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
        case "Command":
            xtextLines.add(indent + "Command");
            appendCommandAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            xtextLines.add("");
            break;
        case "Parameter":
            xtextLines.add(indent + "Parameter");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "StoreArtifact":
            xtextLines.add(indent + "StoreArtifact");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "Run":
            xtextLines.add(indent + "Run");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "SaveCache":
            xtextLines.add(indent + "SaveCache");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "RestoreCache":
            xtextLines.add(indent + "RestoreCache");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "RunCommand":
            xtextLines.add(indent + "RunCommand");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "Parameters":
            xtextLines.add(indent + "Parameters");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "Environment":
        	xtextLines.add(indent + "Environment");
        	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
        	break;
        case "Docker":
        	xtextLines.add(indent + "Docker");
        	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
        	xtextLines.add("");
        	break;
        case "Docker_Auth":
        	xtextLines.add(indent + "Docker_Auth");
        	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
        	break;
        case "Job":
            xtextLines.add(indent + "Job");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            xtextLines.add("");
            break;
        case "Workflow":
            xtextLines.add(indent + "Workflow");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "Trigger":
            xtextLines.add(indent + "Trigger");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        case "When_Unless":
            xtextLines.add(indent + "When_Unless");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            handleWhenUnlessReferences(object, xtextLines, indentLevel + 1);
            break;
        case "JobWorkflow":
            xtextLines.add(indent + "JobWorkflow");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            xtextLines.add("");
            break;
        case "Matrix":
            xtextLines.add(indent + "Matrix");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            handleMatrixReferences(object, xtextLines, indentLevel + 1);
            break;
        case "MatrixParams":
            xtextLines.add(indent + "MatrixParams");
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        default:
            appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            break;
        }
    }
    
    private void appendCommandAttributesAndReferences(EObject object, List<String> xtextLines, EClass eClass, int indentLevel) {
        String indent = "    ".repeat(indentLevel);

        for (EAttribute attribute : eClass.getEAllAttributes()) {
            String attributeName = attribute.getName();
            Object value = object.eGet(attribute);
            if (value != null && !value.toString().isEmpty()) {
                xtextLines.add(indent + attributeName + " \"" + value.toString() + "\"");
            }
        }

        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("parameters")) {
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
            if (!reference.getName().equals("parameters")) {
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
            
            if (value != null) {
                if (value instanceof PARAMETER_TYPES) {
                    xtextLines.add(indent + attributeName + " " + ((Enum<?>) value).name());
                }
                else if (value instanceof DOCKER_RESOURCE_TYPE) {
                	String val = ((Enum<?>) value).name();
                	if(val.equals("MEDIUM_PLUS")) {
                		xtextLines.add(indent + attributeName + " medium+");
                	}
                	else if(val.equals("TWO_XLARGE")) {
                		xtextLines.add(indent + attributeName + " 2xlarge");
                	}
                	else if(val.equals("TWO_XLARGE_PLUS")) {
                		xtextLines.add(indent + attributeName + " 2xlarge+");
                	}
                	else {
                		xtextLines.add(indent + attributeName + " " + ((Enum<?>) value).name().toLowerCase());
                	}
                }
                else if (value instanceof MACHINE_RESOURCE_TYPE) {
                	String val = ((Enum<?>) value).name();
                	if(val.equals("TWO_XLARGE")) {
                		xtextLines.add(indent + attributeName + " 2xlarge");
                	}
                	else if(val.equals("TWO_XLARGE_PLUS")) {
                		xtextLines.add(indent + attributeName + " 2xlarge+");
                	}
                	else {
                		xtextLines.add(indent + attributeName + " " + ((Enum<?>) value).name().toLowerCase());
                	}
                }
                else if (value instanceof MACOS_RESOURCE_TYPE) {
                	String val = ((Enum<?>) value).name();
                	if(val.equals("MACOS_X86_MEDIUM_GEN2")) {
                		xtextLines.add(indent + attributeName + " macos_x86_medium_gen2*");
                	}
                	else if(val.equals("MACOS_M1_MEDIUM_GEN")) {
                		xtextLines.add(indent + attributeName + " macos_m1_medium_gen");
                	}
                	else if(val.equals("MACOS_M1_LARGE_GEN1")) {
                		xtextLines.add(indent + attributeName + " macos_m1_large_gen1");
                	}
                	else {
                		xtextLines.add(indent + attributeName + " " + ((Enum<?>) value).name().toLowerCase());
                	}
                }
                else if(value instanceof WHEN_TYPE) {
                	if (!((Enum<?>) value).name().equalsIgnoreCase("on_success")) {
                        xtextLines.add(indent + attributeName + " " + ((Enum<?>) value).name().toLowerCase());
                    }
                }
                else if (value instanceof String) {
                    String stringValue = (String) value;
                    if ("true".equalsIgnoreCase(stringValue) && !attributeName.equals("default")) {
                        xtextLines.add(indent + attributeName);
                    } 
                    else if(stringValue.equals(".") && attributeName.equals("working_directory")) {
                    	break;
                    }
                    else if(stringValue.equals("10m") && attributeName.equals("no_output_timeout")) {
                    	break;
                    }
                    else if (!stringValue.isEmpty()) {
                    	if (stringValue.contains("\"")) {
                            stringValue = stringValue.replace("\"", "'");
                        }
                        xtextLines.add(indent + attributeName + " \"" + stringValue + "\"");
                    }
                } else if (value instanceof List<?>) {
                    appendEnumValues(attributeName, (List<?>) value, xtextLines, indentLevel);
                } else if (value instanceof Boolean) {
                    if ((Boolean) value) {
                        xtextLines.add(indent + attributeName);
                    }
                } 
                else if (value instanceof Short) {
                	Short shortValue = (Short) value;
                	if(shortValue != 0) {
                		xtextLines.add(indent + attributeName + " " + shortValue);
                	}
                }
            }
        }
        
        List<EObject> commandReferences = new ArrayList<>();
        List<EObject> dockerReferences = new ArrayList<>();
        List<EObject> jobReferences = new ArrayList<>();
        List<EObject> workflowReferences = new ArrayList<>();
        List<EObject> otherReferences = new ArrayList<>();

        for (EReference reference : eClass.getEAllReferences()) {
        	if (eClass.getName().equals("Matrix") || eClass.getName().equals("When_Unless")) {
                continue;
            }
        	
            Object value = object.eGet(reference);
            if (value instanceof EObject) {
            	addReference((EObject) value, commandReferences, dockerReferences, jobReferences, workflowReferences, otherReferences);
            } else if (value instanceof List<?>) {
                for (Object item : (List<?>) value) {
                    if (item instanceof EObject) {
                    	addReference((EObject) item, commandReferences, dockerReferences, jobReferences, workflowReferences, otherReferences);
                    }
                }
            }
        }
        
        processReferences(commandReferences, xtextLines, indentLevel);
        processReferences(dockerReferences, xtextLines, indentLevel);
        processReferences(jobReferences, xtextLines, indentLevel);
        processReferences(workflowReferences, xtextLines, indentLevel);
        processReferences(otherReferences, xtextLines, indentLevel);
    }
    
    private void addReference(EObject refObject, List<EObject> commandReferences, List<EObject> dockerReferences, List<EObject> jobReferences, List<EObject> workflowReferences, List<EObject> otherReferences) {
            String className = refObject.eClass().getName();
            if (className.equals("Command")) {
                commandReferences.add(refObject);
            }
            else if (className.equals("Docker")) {
                dockerReferences.add(refObject);
            }
            else if (className.equals("Job")) {
                jobReferences.add(refObject);
            } else if (className.equals("Workflow")) {
                workflowReferences.add(refObject);
            } else {
            	otherReferences.add(refObject);
            }
        }
    
    private void processReferences(List<EObject> references, List<String> xtextLines, int indentLevel) {
        for (EObject reference : references) {
            generateXtextLines(reference, xtextLines, indentLevel);
        }
    }
    
    private void handleMatrixReferences(EObject object, List<String> xtextLines, int indentLevel) {
        String indent = "    ".repeat(indentLevel);
        List<EObject> matrixParams = new ArrayList<>();
        List<EObject> matrixExclude = new ArrayList<>();

        for (EReference reference : object.eClass().getEAllReferences()) {
            Object value = object.eGet(reference);
            if (value instanceof List<?>) {
                for (Object item : (List<?>) value) {
                    if (item instanceof EObject) {
                        if (reference.getName().equals("matrix_params")) {
                            matrixParams.add((EObject) item);
                        } else if (reference.getName().equals("matrix_exclude")) {
                            matrixExclude.add((EObject) item);
                        }
                    }
                }
            }
        }

        if (!matrixExclude.isEmpty()) {
            xtextLines.add(indent + "matrix_exclude");
            for (EObject item : matrixExclude) {
                generateXtextLines(item, xtextLines, indentLevel + 1);
            }
        }

        if (!matrixParams.isEmpty()) {
            xtextLines.add(indent + "matrix_params");
            for (EObject item : matrixParams) {
                generateXtextLines(item, xtextLines, indentLevel + 1);
            }
        }
    }
    
    
    private void handleWhenUnlessReferences(EObject object, List<String> xtextLines, int indentLevel) {
        String indent = "    ".repeat(indentLevel);

        List<EObject> whenSteps = new ArrayList<>();
        List<EObject> unlessSteps = new ArrayList<>();

        for (EReference reference : object.eClass().getEAllReferences()) {
            Object value = object.eGet(reference);
            if (value instanceof List<?>) {
                for (Object item : (List<?>) value) {
                    if (item instanceof EObject) {
                        if (reference.getName().equals("when_step")) {
                            whenSteps.add((EObject) item);
                        } else if (reference.getName().equals("unless_step")) {
                            unlessSteps.add((EObject) item);
                        }
                    }
                }
            }
        }

        if (!whenSteps.isEmpty()) {
            xtextLines.add(indent + "when_step");
            for (EObject item : whenSteps) {
                generateXtextLines(item, xtextLines, indentLevel + 1);
            }
        }

        if (!unlessSteps.isEmpty()) {
            xtextLines.add(indent + "unless_step");
            for (EObject item : unlessSteps) {
                generateXtextLines(item, xtextLines, indentLevel + 1);
            }
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
