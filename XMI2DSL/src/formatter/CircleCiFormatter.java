package formatter;

import circleCI_metamodel.PARAMETER_TYPES;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class CircleCiFormatter {

	public List<String> generateXtext(EObject object) {
        List<String> xtextLines = new ArrayList<>();
        generateXtextLines(object, xtextLines);
        return xtextLines;
    }

    private void generateXtextLines(EObject object, List<String> xtextLines) {
        EClass eClass = object.eClass();
        String className = eClass.getName();

        if ("Pipeline".equals(className)) {
            xtextLines.add("Pipeline");
            appendAttributesAndReferences(object, xtextLines, eClass);
        } else if ("Orb".equals(className)) {
            xtextLines.add("Orb");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } else if ("Command".equals(className)) {
            xtextLines.add("Command");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } else if ("Workflow".equals(className)) {
            xtextLines.add("Workflow");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } else if ("Job".equals(className)) {
            xtextLines.add("Job");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        }else if ("Parameter".equals(className)) {
            xtextLines.add("Parameter");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        }      
        else if ("Run".equals(className)) {
            xtextLines.add("Run");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("RestoreCache".equals(className)) {
            xtextLines.add("RestoreCache");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("PersistToWorkspace".equals(className)) {
            xtextLines.add("PersistToWorkspace");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("StoreArtifact".equals(className)) {
            xtextLines.add("StoreArtifact");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("StoreTestResults".equals(className)) {
            xtextLines.add("StoreTestResults");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("SetupRemoteDocker".equals(className)) {
            xtextLines.add("SetupRemoteDocker");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("AddSSHKeys".equals(className)) {
            xtextLines.add("AddSSHKeys");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("SaveCache".equals(className)) {
            xtextLines.add("SaveCache");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("AttachWorkspace".equals(className)) {
            xtextLines.add("AttachWorkspace");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("When_Unless".equals(className)) {
            xtextLines.add("When_Unless");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Checkout".equals(className)) {
            xtextLines.add("Checkout");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Environment".equals(className)) {
            xtextLines.add("Environment");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("RunCommand".equals(className)) {
            xtextLines.add("RunCommand");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Parameters".equals(className)) {
            xtextLines.add("Parameters");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Trigger".equals(className)) {
            xtextLines.add("Trigger");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Branch".equals(className)) {
            xtextLines.add("Branch");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("JobWorkflow".equals(className)) {
            xtextLines.add("JobWorkflow");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Matrix".equals(className)) {
            xtextLines.add("Matrix");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("MatrixParams".equals(className)) {
            xtextLines.add("MatrixParams");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Machine".equals(className)) {
            xtextLines.add("Machine");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("MacOs".equals(className)) {
            xtextLines.add("MacOs");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Docker".equals(className)) {
            xtextLines.add("Docker");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Docker_Auth".equals(className)) {
            xtextLines.add("Docker_Auth");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else if ("Docker_Aws_Auths".equals(className)) {
            xtextLines.add("Docker_Aws_Auths");
            appendBlockAttributesAndReferences(object, xtextLines, eClass);
        } 
        else {
            appendAttributesAndReferences(object, xtextLines, eClass);
        }
    }
    
    private void appendAttributesAndReferences(EObject object, List<String> xtextLines, EClass eClass) {
        for (EAttribute attribute : eClass.getEAllAttributes()) {
            String attributeName = attribute.getName();
            Object value = object.eGet(attribute);
            
            if (attributeName.equals("type")) {
            	PARAMETER_TYPES val = (PARAMETER_TYPES) value;
                xtextLines.add("    " + attributeName + " " + val.getName());
            }
            
            if (attributeName.equals("version")) {
            	String stringValue = (String) value;
                xtextLines.add(attributeName + " \"" + stringValue + "\"");
            }
            
            if(value != null) {
            	if (value instanceof String) {
            		String stringValue = (String) value;
                    if ("true".equalsIgnoreCase(stringValue)) {
                        xtextLines.add("    " + attributeName);
                    } 
	                else if (!stringValue.isEmpty()) {
	                    xtextLines.add("    " + attributeName + " \"" + stringValue + "\"");
	                }
                } else if (value instanceof List<?>) {
                    appendEnumValues(attributeName, (List<?>) value, xtextLines);
                } else if (value instanceof Boolean) {
                    Boolean booleanValue = (Boolean) value;
                    if (booleanValue) {
                        xtextLines.add("    " + attributeName);
                    }
                }
            }
        }

        for (EReference reference : eClass.getEAllReferences()) {
            Object value = object.eGet(reference);
            if (value instanceof EObject) {
                generateXtextLines((EObject) value, xtextLines);
            } else if (value instanceof List<?>) {
                for (Object item : (List<?>) value) {
                    if (item instanceof EObject) {
                        generateXtextLines((EObject) item, xtextLines);
                    }
                }
            }
        }
    }
    
    private void appendEnumValues(String attributeName, List<?> values, List<String> xtextLines) {
    	if (values.isEmpty()) {
            return;
        }
    	
        StringBuilder enumValuesString = new StringBuilder();
        for (Object value : values) {
            enumValuesString.append(value.toString()).append(", ");
        }
        String enumValues = enumValuesString.substring(0, enumValuesString.length() - 2);
        xtextLines.add("    " + attributeName + " \"" + enumValues + "\"");
    }

    private void appendBlockAttributesAndReferences(EObject object, List<String> xtextLines, EClass eClass) {
        appendAttributesAndReferences(object, xtextLines, eClass);
    }
}
