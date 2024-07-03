package popup.action;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class Convert implements IObjectActionDelegate {

	private Shell shell;
	private IFile selectedFile;
	
	public Convert() {
		super();
	}
	
	@Override
	public void run(IAction action) {
        if (selectedFile != null) {
            XMIReader.convertXMI2DSL(selectedFile.getLocation().toOSString(), shell);
            MessageDialog.openInformation(
                shell,
                "Plugin",
                "XMI to DSL was executed. Please refresh project.");
        } else {
            MessageDialog.openError(
                shell,
                "Error",
                "No file selected.");
        }
    }

	@Override
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

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();		
	}

}
