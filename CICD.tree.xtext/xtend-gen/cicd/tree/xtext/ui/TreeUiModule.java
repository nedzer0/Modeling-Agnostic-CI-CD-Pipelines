package cicd.tree.xtext.ui;

import com.google.inject.Binder;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

@SuppressWarnings("all")
public class TreeUiModule extends EmfUiModule {
  public TreeUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }

  @Override
  public void configureLanguageSpecificURIEditorOpener(final Binder binder) {
    binder.<IURIEditorOpener>bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(TreeEditorOpener.class);
  }
}
