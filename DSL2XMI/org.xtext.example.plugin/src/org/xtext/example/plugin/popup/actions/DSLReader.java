package org.xtext.example.plugin.popup.actions;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResourceSet;



public class DSLReader {
	
	public static void convertXText2XMI (String filePath, Shell shell) {
		
        ResourceSet resourceSet = new XtextResourceSet();
        URI uri = URI.createFileURI(filePath);
        Resource resource = resourceSet.getResource(uri, true);
        
        EcoreUtil.resolveAll(resourceSet);

        URI xmiUri = URI.createURI(uri.trimFileExtension().toString() + "Final.xmi");

        Resource xmiResource = resourceSet.createResource(xmiUri);
        xmiResource.getContents().addAll(resource.getContents());

        try {
            // Save the XMI resource
            xmiResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}