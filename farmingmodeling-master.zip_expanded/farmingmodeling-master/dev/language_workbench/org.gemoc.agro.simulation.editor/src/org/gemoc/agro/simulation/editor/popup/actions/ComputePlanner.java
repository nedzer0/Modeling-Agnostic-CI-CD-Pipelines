package org.gemoc.agro.simulation.editor.popup.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.gemoc.agro.simulation.Schedule;
import org.gemoc.agro.simulation.solver.ExploitationActivitiesScheduler;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class ComputePlanner implements IObjectActionDelegate {

  private Shell shell;

  private Collection<Schedule> selected = Lists.newArrayList();

  /**
   * Constructor for Action1.
   */
  public ComputePlanner() {
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
            for (final Schedule schedule : selected) {
              final Session s = SessionManager.INSTANCE.getSession(schedule);
              if (s != null) {
                s.getTransactionalEditingDomain()
                    .getCommandStack()
                    .execute(
                        new RecordingCommand(s.getTransactionalEditingDomain()) {

                          @Override
                          protected void doExecute() {
                            ExploitationActivitiesScheduler planner = new ExploitationActivitiesScheduler();
                            planner.createSchedule(schedule);
                          }
                        });
              }
            }
          }
        });

        MessageDialog.openInformation(
            shell,
            "Scheduling complete",
            "Scheduling is complete, best score found are  :\n"
                + Joiner.on("\n").join(
                    Iterables.transform(this.selected,
                        new Function<Schedule, String>() {

                          @Override
                          public String apply(Schedule input) {
                            return "hard constraints : " + input.getHardScore()
                                + " soft constraints :" + input.getSoftScore();
                          }
                        })));
      } catch (InvocationTargetException | InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try {
        ps.busyCursorWhile(new IRunnableWithProgress() {
          public void run(IProgressMonitor pm) {
            for (final Schedule schedule : selected) {
              final Session s = SessionManager.INSTANCE.getSession(schedule);
              if (s != null) {
                for (DRepresentation rep : DialectManager.INSTANCE
                    .getRepresentations(schedule, s)) {
                  if (rep.getRepresentationElements().size() > 0) {
                    DialectUIManager.INSTANCE.openEditor(s, rep, pm);
                  }
                }
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
        if (n instanceof Schedule) {
          this.selected.add((Schedule) n);
        }

      }
    }
  }

}
