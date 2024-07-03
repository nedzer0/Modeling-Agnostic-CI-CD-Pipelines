package org.xtext.example.plugin.popup.actions;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResourceSet;

public class DSLReader {
	
	private static int executionCount = 0;
	
	public static void convertXText2XMI (String filePath, Shell shell) {
		
        ResourceSet resourceSet = new XtextResourceSet();
        URI uri = URI.createFileURI(filePath);
        Resource resource = resourceSet.getResource(uri, true);
        
        EcoreUtil.resolveAll(resourceSet);

        URI xmiUri;
        if (executionCount == 0) {
            xmiUri = URI.createURI(uri.trimFileExtension().toString() + ".xmi");
        } else {
            xmiUri = URI.createURI(uri.trimFileExtension().toString() + "Final.xmi");
        }
        executionCount++;
        if (executionCount == 3) { executionCount = 0; }

        Resource xmiResource = resourceSet.createResource(xmiUri);
        xmiResource.getContents().addAll(resource.getContents());

        try {
            xmiResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}