package cicd.tree.xtext.ui

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory
import org.osgi.framework.Bundle
import com.google.inject.Injector

class TreeExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected Bundle getBundle() {
		return Activator.getDefault().getBundle()
	}

	override protected Injector getInjector() {
		return Activator.getDefault().getInjector()
	}
	
}