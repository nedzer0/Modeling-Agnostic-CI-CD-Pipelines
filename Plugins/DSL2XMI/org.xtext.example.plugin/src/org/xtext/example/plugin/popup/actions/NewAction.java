package org.xtext.example.plugin.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class NewAction implements IObjectActionDelegate {

	private Shell shell;
	private IFile selectedFile;
	
	/**
	 * Constructor for Action1.
	 */
	public NewAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
        if (selectedFile != null) {
            DSLReader.convertXText2XMI(selectedFile.getLocation().toOSString(), shell);
            MessageDialog.openInformation(
                shell,
                "Plugin",
                "DSL to XMI was executed. Please refresh project.");
        } else {
            MessageDialog.openError(
                shell,
                "Error",
                "No file selected.");
        }
    }

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection.isEmpty())
            return;

        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
                selectedFile = (IFile) firstElement;
            }
        }
	}

}
