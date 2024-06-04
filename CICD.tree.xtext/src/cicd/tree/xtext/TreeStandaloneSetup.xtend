package cicd.tree.xtext

import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.IResourceServiceProvider
import cICD_metamodel.CICD_metamodelPackage

class TreeStandaloneSetup implements ISetup {
	
	@Inject
	FileExtensionProvider fileExtensionProvider;

	@Inject
	IResourceServiceProvider resourceServiceProvider;

	@Inject
	IResourceServiceProvider.Registry registry;
	
	override createInjectorAndDoEMFRegistration() {
		val injector = Guice.createInjector(new TreeRuntimeModule)
		injector.injectMembers(this)
		for(fileExt: fileExtensionProvider.fileExtensions) 
			registry.extensionToFactoryMap.put(fileExt, resourceServiceProvider)

		// the following implicitly registers the EPackage to the registry
		val treePackage = CICD_metamodelPackage.eINSTANCE
		
		return injector
	}
	
}