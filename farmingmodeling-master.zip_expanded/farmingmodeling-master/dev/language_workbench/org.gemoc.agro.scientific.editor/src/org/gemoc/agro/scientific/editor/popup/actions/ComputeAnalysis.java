
package org.gemoc.agro.scientific.editor.popup.actions;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.gemoc.agro.scientific.ExploitationAnalysis;
import org.gemoc.agro.scientific.WaterAnalysis;

import com.google.common.collect.Lists;

public class ComputeAnalysis implements IObjectActionDelegate {

	private Shell shell;

	private Collection<ExploitationAnalysis> selected = Lists.newArrayList();

	/**
	 * Constructor for Action1.
	 */
	public ComputeAnalysis() {
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
		if (selected.size() > 0) {

			IWorkbench wb = PlatformUI.getWorkbench();
			IProgressService ps = wb.getProgressService();
			try {
				ps.busyCursorWhile(new IRunnableWithProgress() {
					public void run(IProgressMonitor pm) {
						for (final ExploitationAnalysis simulation : selected) {
							Session s = SessionManager.INSTANCE
									.getSession(simulation);
							if (s != null) {
								s.getTransactionalEditingDomain()
										.getCommandStack()
										.execute(
												new RecordingCommand(
														s.getTransactionalEditingDomain()) {

													@Override
													protected void doExecute() {
														WaterAnalysis planner = new WaterAnalysis();
														planner.compute(simulation);
													}
												});
							}
						}
					}
				});
			} catch (InvocationTargetException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		selected.clear();
		if (selection instanceof StructuredSelection) {
			Iterator<Object> it = ((StructuredSelection) selection).iterator();
			while (it.hasNext()) {
				Object n = it.next();
				if (n instanceof ExploitationAnalysis) {
					this.selected.add((ExploitationAnalysis) n);
				}

			}
		}
	}

}
