/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.jenkins.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.jenkins.ui.internal.JenkinsActivator;

public class JenkinsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JenkinsActivator.getInstance().getInjector("org.xtext.example.jenkins.Jenkins");
	}

}
