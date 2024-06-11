/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.gha.formatting2;

import com.google.inject.Inject;
import gHA_metamodel.Action;
import gHA_metamodel.Concurrency;
import gHA_metamodel.Container;
import gHA_metamodel.DefaultSetting;
import gHA_metamodel.Env;
import gHA_metamodel.Environment;
import gHA_metamodel.If;
import gHA_metamodel.Job;
import gHA_metamodel.Need;
import gHA_metamodel.Output;
import gHA_metamodel.Permission;
import gHA_metamodel.Pipeline;
import gHA_metamodel.Runs_On;
import gHA_metamodel.Secret;
import gHA_metamodel.Service;
import gHA_metamodel.Step;
import gHA_metamodel.Strategy;
import gHA_metamodel.Trigger;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.gha.services.GHAGrammarAccess;

@SuppressWarnings("all")
public class GHAFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GHAGrammarAccess _gHAGrammarAccess;

  protected void _format(final Pipeline pipeline, @Extension final IFormattableDocument document) {
    EList<Env> _envs = pipeline.getEnvs();
    for (final Env env : _envs) {
      document.<Env>format(env);
    }
    EList<Permission> _permissions = pipeline.getPermissions();
    for (final Permission permission : _permissions) {
      document.<Permission>format(permission);
    }
    document.<DefaultSetting>format(pipeline.getDefaultsetting());
    document.<Concurrency>format(pipeline.getConcurrency());
    EList<Trigger> _triggers = pipeline.getTriggers();
    for (final Trigger trigger : _triggers) {
      document.<Trigger>format(trigger);
    }
    EList<Job> _jobs = pipeline.getJobs();
    for (final Job job : _jobs) {
      document.<Job>format(job);
    }
  }

  protected void _format(final Job job, @Extension final IFormattableDocument document) {
    EList<Permission> _permissions = job.getPermissions();
    for (final Permission permission : _permissions) {
      document.<Permission>format(permission);
    }
    document.<Need>format(job.getNeed());
    document.<If>format(job.getIf());
    document.<Runs_On>format(job.getRunner());
    document.<Environment>format(job.getEnvironment());
    document.<Concurrency>format(job.getConcurrency());
    EList<Output> _outputs = job.getOutputs();
    for (final Output output : _outputs) {
      document.<Output>format(output);
    }
    EList<Env> _envs = job.getEnvs();
    for (final Env env : _envs) {
      document.<Env>format(env);
    }
    document.<DefaultSetting>format(job.getDefaultsetting());
    document.<Container>format(job.getContainer());
    EList<Service> _services = job.getServices();
    for (final Service service : _services) {
      document.<Service>format(service);
    }
    EList<Action> _actions = job.getActions();
    for (final Action action : _actions) {
      document.<Action>format(action);
    }
    EList<Secret> _secrets = job.getSecrets();
    for (final Secret secret : _secrets) {
      document.<Secret>format(secret);
    }
    document.<Strategy>format(job.getStrategy());
    EList<Step> _steps = job.getSteps();
    for (final Step step : _steps) {
      document.<Step>format(step);
    }
  }

  public void format(final Object job, final IFormattableDocument document) {
    if (job instanceof XtextResource) {
      _format((XtextResource)job, document);
      return;
    } else if (job instanceof Job) {
      _format((Job)job, document);
      return;
    } else if (job instanceof Pipeline) {
      _format((Pipeline)job, document);
      return;
    } else if (job instanceof EObject) {
      _format((EObject)job, document);
      return;
    } else if (job == null) {
      _format((Void)null, document);
      return;
    } else if (job != null) {
      _format(job, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(job, document).toString());
    }
  }
}