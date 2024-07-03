package popup.action;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Shell;

import formatter.CircleCiFormatter;
import formatter.GHAFormatter;
import formatter.JenkinsFormatter;

public class XMIReader {

	public static void convertXMI2DSL(String filePath, Shell shell) {
        
		String extension = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        	br.readLine();
        	String secondLine = br.readLine();
            if (secondLine != null) {
                if (secondLine.contains("circleCI")) {
                    extension = ".circleci";
                } else if (secondLine.contains("gHA")) {
                    extension = ".gha";
                }
                else {
                	extension = ".jenkins";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
		
		ResourceSet resourceSet = new ResourceSetImpl();
        URI xmiUri = URI.createFileURI(filePath);
        Resource resource = resourceSet.getResource(xmiUri, true);

        EObject rootElement = resource.getContents().get(0);
        if (rootElement == null) {
            System.err.println("Root element not found in the XMI file.");
            return;
        }
        
        List<String> xtextLines = null;
        if(extension.contains(".circleci")) {
        	CircleCiFormatter circleFormatter = new CircleCiFormatter();
        	xtextLines = circleFormatter.generateXtext(rootElement);
        }
        
        if(extension.contains(".gha")) {
        	GHAFormatter ghaFormatter = new GHAFormatter();
        	xtextLines = ghaFormatter.generateXtext(rootElement);
        }
        
        if(extension.contains(".jenkins")) {
        	JenkinsFormatter jenkinsFormatter = new JenkinsFormatter();
        	xtextLines = jenkinsFormatter.generateXtext(rootElement);
        }
        writeXtextToFile(xtextLines, filePath, extension);
    }

    private static void writeXtextToFile(List<String> xtextLines, String filePath, String extension) {
    	String directoryPath = new File(filePath).getParent();
        String baseFileName = new File(filePath).getName();
        String fileNameWithoutExt = baseFileName.substring(0, baseFileName.lastIndexOf('.'));
        String outputPath = Paths.get(directoryPath, fileNameWithoutExt + extension).toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String line : xtextLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
