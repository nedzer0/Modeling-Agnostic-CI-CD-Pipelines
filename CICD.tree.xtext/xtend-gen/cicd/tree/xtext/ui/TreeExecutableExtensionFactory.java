package cicd.tree.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class TreeExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  protected Bundle getBundle() {
    return Activator.getDefault().getBundle();
  }

  @Override
  protected Injector getInjector() {
    return Activator.getDefault().getInjector();
  }
}
