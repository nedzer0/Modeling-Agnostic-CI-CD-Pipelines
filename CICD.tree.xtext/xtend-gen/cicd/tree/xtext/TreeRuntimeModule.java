package cicd.tree.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

@SuppressWarnings("all")
public class TreeRuntimeModule extends AbstractGenericResourceRuntimeModule {
  @Override
  protected String getFileExtensions() {
    return "cicd_metamodel";
  }

  @Override
  protected String getLanguageName() {
    return "cICD_metamodel.CICD_metamodel";
  }

  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return DefaultDeclarativeQualifiedNameProvider.class;
  }
}
