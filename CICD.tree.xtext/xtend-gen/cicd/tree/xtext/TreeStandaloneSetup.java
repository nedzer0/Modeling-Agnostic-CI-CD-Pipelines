package cicd.tree.xtext;

import cICD_metamodel.CICD_metamodelPackage;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.Set;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class TreeStandaloneSetup implements ISetup {
  @Inject
  private FileExtensionProvider fileExtensionProvider;

  @Inject
  private IResourceServiceProvider resourceServiceProvider;

  @Inject
  private IResourceServiceProvider.Registry registry;

  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    TreeRuntimeModule _treeRuntimeModule = new TreeRuntimeModule();
    final Injector injector = Guice.createInjector(_treeRuntimeModule);
    injector.injectMembers(this);
    Set<String> _fileExtensions = this.fileExtensionProvider.getFileExtensions();
    for (final String fileExt : _fileExtensions) {
      this.registry.getExtensionToFactoryMap().put(fileExt, this.resourceServiceProvider);
    }
    final CICD_metamodelPackage treePackage = CICD_metamodelPackage.eINSTANCE;
    return injector;
  }
}
