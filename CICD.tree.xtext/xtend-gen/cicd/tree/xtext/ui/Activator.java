package cicd.tree.xtext.ui;

import cicd.tree.xtext.TreeRuntimeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.osgi.framework.BundleContext;

@SuppressWarnings("all")
public class Activator extends AbstractUIPlugin {
  private static final Logger logger = Logger.getLogger(Activator.class);

  public static final String PLUGIN_ID = "CICD.tree.xtext";

  private static Activator plugin;

  private Injector injector;

  public Activator() {
  }

  public Injector getInjector() {
    return this.injector;
  }

  private void initializeInjector() {
    TreeRuntimeModule _treeRuntimeModule = new TreeRuntimeModule();
    Modules.OverriddenModuleBuilder _override = Modules.override(_treeRuntimeModule);
    TreeUiModule _treeUiModule = new TreeUiModule(Activator.plugin);
    Modules.OverriddenModuleBuilder _override_1 = Modules.override(_override.with(_treeUiModule));
    SharedStateModule _sharedStateModule = new SharedStateModule();
    this.injector = Guice.createInjector(
      _override_1.with(_sharedStateModule));
  }

  @Override
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    Activator.plugin = this;
    try {
      this.initializeInjector();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        Activator.logger.error(e.getMessage(), e);
        throw e;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  @Override
  public void stop(final BundleContext context) throws Exception {
    Activator.plugin = null;
    this.injector = null;
    super.stop(context);
  }

  /**
   * Returns the shared instance
   * @return the shared instance
   */
  public static Activator getDefault() {
    return Activator.plugin;
  }
}
