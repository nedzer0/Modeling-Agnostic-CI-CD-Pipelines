/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.jenkins;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class JenkinsStandaloneSetup extends JenkinsStandaloneSetupGenerated {

	public static void doSetup() {
		new JenkinsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
