package cicd.tree.xtext

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

class TreeRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	override protected getFileExtensions() {
		'cicd_metamodel'
	}
	
	override protected getLanguageName() {
		'cICD_metamodel.CICD_metamodel'
	}
	
	override bindIQualifiedNameProvider() {
		DefaultDeclarativeQualifiedNameProvider
	}
}