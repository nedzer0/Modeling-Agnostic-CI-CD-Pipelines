package xtextaird;


import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.eclipse.xtext.validation.IResourceValidator;

/**
 * The DI module to configure the Xtext language services for aird models.
 *  
 * @author koehnlein
 */
public class AirdRuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "XtextAird";
	}

	@Override
	protected String getFileExtensions() {
		return "aird";
	}
	
	public IResourceValidator bindIResourceValidator() {
		return IResourceValidator.NULL;
	}
}