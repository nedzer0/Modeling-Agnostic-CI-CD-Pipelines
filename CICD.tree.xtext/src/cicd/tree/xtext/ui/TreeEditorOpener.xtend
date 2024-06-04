package cicd.tree.xtext.ui

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EReference
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener
import cICD_metamodel.presentation.CICD_metamodelEditor

class TreeEditorOpener extends LanguageSpecificURIEditorOpener {
	
	override protected void selectAndReveal(
		IEditorPart openEditor, 
		URI uri, EReference crossReference, int indexInList, 
		boolean select) {
		if (uri.fragment !== null) {
			val ecoreEditor = openEditor.getAdapter(CICD_metamodelEditor)
			if (ecoreEditor instanceof CICD_metamodelEditor) {
				val eObject = ecoreEditor.editingDomain.resourceSet.getEObject(uri, true)
				ecoreEditor.setSelectionToViewer(#[eObject])
			}
		}
	}

	override protected String getEditorId() {
		return "cICD_metamodel.presentation.CICD_metamodelEditorID"
	}
}