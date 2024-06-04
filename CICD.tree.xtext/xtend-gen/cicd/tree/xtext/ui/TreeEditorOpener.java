package cicd.tree.xtext.ui;

import cICD_metamodel.presentation.CICD_metamodelEditor;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class TreeEditorOpener extends LanguageSpecificURIEditorOpener {
  @Override
  protected void selectAndReveal(final IEditorPart openEditor, final URI uri, final EReference crossReference, final int indexInList, final boolean select) {
    String _fragment = uri.fragment();
    boolean _tripleNotEquals = (_fragment != null);
    if (_tripleNotEquals) {
      final CICD_metamodelEditor ecoreEditor = openEditor.<CICD_metamodelEditor>getAdapter(CICD_metamodelEditor.class);
      if ((ecoreEditor instanceof CICD_metamodelEditor)) {
        final EObject eObject = ecoreEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
        ecoreEditor.setSelectionToViewer(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(eObject)));
      }
    }
  }

  @Override
  protected String getEditorId() {
    return "cICD_metamodel.presentation.CICD_metamodelEditorID";
  }
}
