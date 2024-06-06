package formatter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;


public class JenkinsFormatter {
	
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
            case "Node":
                xtextLines.add(indent + "Node");
                xtextLines.add("");
                break;
            case "Any":
                xtextLines.add(indent + "Any");
                xtextLines.add("");
                break;
            case "Docker":
                xtextLines.add(indent + "Docker");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "Cron":
            	xtextLines.add(indent + "Cron");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	xtextLines.add("");
            	break;
            case "StringParam":
                xtextLines.add(indent + "StringParam");
                appendParamAttributes(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "BooleanParam":
                xtextLines.add(indent + "BooleanParam");
                appendParamAttributes(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "TextParam":
                xtextLines.add(indent + "TextParam");
                appendParamAttributes(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "ChoiceParam":
                xtextLines.add(indent + "ChoiceParam");
                appendParamAttributes(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "PasswordParam":
                xtextLines.add(indent + "PasswordParam");
                appendParamAttributes(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "Environment":
            	xtextLines.add(indent + "Environment");
            	appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
            	xtextLines.add("");
            	break;
            case "Stage":
                xtextLines.add(indent + "Stage");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                xtextLines.add("");
                break;
            case "Input":
                xtextLines.add(indent + "Input");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Matrix":
                xtextLines.add(indent + "Matrix");
                appendMatrixAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Axis":
                xtextLines.add(indent + "Axis");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Expression":
                xtextLines.add(indent + "Expression");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "When_Env":
                xtextLines.add(indent + "When_Env");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Artifact":
                xtextLines.add(indent + "Artifact");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Step":
                xtextLines.add(indent + "Step");
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
            case "Command":
                xtextLines.add(indent + "Command");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            case "Step_Parameter":
                xtextLines.add(indent + "Step_Parameter");
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
            default:
                appendAttributesAndReferences(object, xtextLines, eClass, indentLevel + 1);
                break;
        }
    }
	
	private void appendParamAttributes(EObject object, List<String> xtextLines, EClass eClass, int indentLevel) {
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

	    EAttribute descriptionAttribute = eClass.getEAllAttributes().stream()
	            .filter(attr -> attr.getName().equals("description"))
	            .findFirst()
	            .orElse(null);

	    if (descriptionAttribute != null) {
	        Object descriptionValue = object.eGet(descriptionAttribute);
	        if (descriptionValue != null && !descriptionValue.toString().isEmpty()) {
	            xtextLines.add(indent + descriptionAttribute.getName() + " \"" + descriptionValue.toString() + "\"");
	        }
	    }
	    
	    EAttribute choicesAttribute = eClass.getEAllAttributes().stream()
	            .filter(attr -> attr.getName().equals("choices"))
	            .findFirst()
	            .orElse(null);

	    if (choicesAttribute != null) {
	        Object choicesValue = object.eGet(choicesAttribute);
	        if (choicesValue != null && !choicesValue.toString().isEmpty()) {
        		appendEnumValues(choicesAttribute.getName(), (List<?>) choicesValue, xtextLines, indentLevel);
	        }
	    }
	    
	    EAttribute defaultAttribute = eClass.getEAllAttributes().stream()
	            .filter(attr -> attr.getName().equals("defaultValue"))
	            .findFirst()
	            .orElse(null);

	    if (defaultAttribute != null) {
	        Object defaulValue = object.eGet(defaultAttribute);
	        if (defaulValue != null && !defaulValue.toString().isEmpty()) {
	        	if(eClass.getName().equals("StringParam") || eClass.getName().equals("TextParam") || eClass.getName().equals("PasswordParam")) {
	        		xtextLines.add(indent + defaultAttribute.getName() + " \"" + defaulValue.toString() + "\"");
	        	}
	        	else if(eClass.getName().equals("BooleanParam")) {
	        		xtextLines.add(indent + defaultAttribute.getName() + " " + defaulValue.toString());
	        	}
	        }
	    }

	    // Append other attributes
	    for (EAttribute attribute : eClass.getEAllAttributes()) {
	        String attributeName = attribute.getName();
	        if (!attributeName.equals("name") && !attributeName.equals("description") && !attributeName.equals("choices") && !attributeName.equals("defaultValue")) {
	            Object value = object.eGet(attribute);
	            if(value != null) {
	            	if (value instanceof String) {
	            		String stringValue = (String) value;
	                    if ("true".equalsIgnoreCase(stringValue)) {
	                        xtextLines.add(indent + attributeName);
	                    } 
		                else if (!stringValue.isEmpty()) {
		                	xtextLines.add(indent + attributeName + " \"" + stringValue + "\"");
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
	
	private void appendMatrixAttributesAndReferences(EObject object, List<String> xtextLines, EClass eClass, int indentLevel) {
        String indent = "    ".repeat(indentLevel);

        for (EAttribute attribute : eClass.getEAllAttributes()) {
            String attributeName = attribute.getName();
            Object value = object.eGet(attribute);
            if (value != null && !value.toString().isEmpty()) {
                xtextLines.add(indent + attributeName + " \"" + value.toString() + "\"");
            }
        }

        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.getName().equals("axis")) {
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
            if (reference.getName().equals("stages")) {
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
            if (reference.getName().equals("when")) {
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
    }
    
    private void appendAttributesAndReferences(EObject object, List<String> xtextLines, EClass eClass, int indentLevel) {
    	String indent = "    ".repeat(indentLevel);
    	
    	for (EAttribute attribute : eClass.getEAllAttributes()) {
            String attributeName = attribute.getName();
            Object value = object.eGet(attribute);
            
            if(value != null) {
            	if (value instanceof String) {
            		String stringValue = (String) value;
                    if ("true".equalsIgnoreCase(stringValue)) {
                        xtextLines.add(indent + attributeName);
                    } 
	                else if (!stringValue.isEmpty()) {
	                	xtextLines.add(indent + attributeName + " \"" + stringValue + "\"");
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
    	
    	List<EObject> agentReferences = new ArrayList<>();
        List<EObject> triggerReferences = new ArrayList<>();
        List<EObject> paramReferences = new ArrayList<>();
        List<EObject> environmentReferences = new ArrayList<>();
        List<EObject> stagesReferences = new ArrayList<>();
        List<EObject> otherReferences = new ArrayList<>();

        for (EReference reference : eClass.getEAllReferences()) {
            Object value = object.eGet(reference);
            if (value instanceof EObject) {
                EObject refObject = (EObject) value;
                if (refObject.eClass().getName().equals("Node") || refObject.eClass().getName().equals("Any") || refObject.eClass().getName().equals("Docker")) {
                	agentReferences.add(refObject);
                }
                else if (refObject.eClass().getName().equals("Cron")) {
                	triggerReferences.add(refObject);
                }
                else if (refObject.eClass().getName().equals("StringParam") | refObject.eClass().getName().equals("TextParam") | refObject.eClass().getName().equals("ChoiceParam") | refObject.eClass().getName().equals("PasswordParam") | refObject.eClass().getName().equals("BooleanParam")) {
                	paramReferences.add(refObject);
                } else if (refObject.eClass().getName().equals("Environment")) {
                	environmentReferences.add(refObject);
                } else if (refObject.eClass().getName().equals("Stage")) {
                	stagesReferences.add(refObject);
                } 
                else {
                	otherReferences.add(refObject);
                }
            } else if (value instanceof List<?>) {
                for (Object item : (List<?>) value) {
                    if (item instanceof EObject) {
                        EObject refObject = (EObject) item;
                        if (refObject.eClass().getName().equals("Node") || refObject.eClass().getName().equals("Any") || refObject.eClass().getName().equals("Docker")) {
                        	agentReferences.add(refObject);
                        }
                        else if (refObject.eClass().getName().equals("Cron")) {
                        	triggerReferences.add(refObject);
                        }
                        else if (refObject.eClass().getName().equals("StringParam") | refObject.eClass().getName().equals("TextParam") | refObject.eClass().getName().equals("ChoiceParam") | refObject.eClass().getName().equals("PasswordParam") | refObject.eClass().getName().equals("BooleanParam")) {
                        	paramReferences.add(refObject);
                        } else if (refObject.eClass().getName().equals("Environment")) {
                        	environmentReferences.add(refObject);
                        } else if (refObject.eClass().getName().equals("Stage")) {
                        	stagesReferences.add(refObject);
                        } 
                        else {
                        	otherReferences.add(refObject);
                        }
                    }
                }
            }
        }
        
        for (EObject agent : agentReferences) {
            generateXtextLines(agent, xtextLines, indentLevel);
        }
        
        for (EObject trigger : triggerReferences) {
            generateXtextLines(trigger, xtextLines, indentLevel);
        }

        for (EObject param : paramReferences) {
            generateXtextLines(param, xtextLines, indentLevel);
        }

        for (EObject env : environmentReferences) {
            generateXtextLines(env, xtextLines, indentLevel);
        }
        
        for (EObject stage : stagesReferences) {
            generateXtextLines(stage, xtextLines, indentLevel);
        }

        for (EObject other : otherReferences) {
            generateXtextLines(other, xtextLines, indentLevel);
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
