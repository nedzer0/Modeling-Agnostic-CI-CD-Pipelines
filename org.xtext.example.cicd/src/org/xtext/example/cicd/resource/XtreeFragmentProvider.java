package org.xtext.example.cicd.resource;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IFragmentProvider;
import org.eclipse.xtext.util.IResourceScopeCache;

public class XtreeFragmentProvider implements IFragmentProvider {

    @Inject
    private IQualifiedNameConverter qualifiedNameConverter;

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IResourceScopeCache cache;

    private static final String CACHE_KEY = "name2element";

    @Override
    public EObject getEObject(Resource resource, String fragment, Fallback fallback) {
        try {
            QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(fragment);
            return getName2ElementMap(resource).get(qualifiedName);
        } catch (Exception exc) {
            return fallback.getEObject(fragment);
        }
    }

    /**
     * Returns a map qualifiedName -> EObject that is calculated on demand and cached.
     */
    private Map<QualifiedName, EObject> getName2ElementMap(Resource resource) {
        return cache.get(CACHE_KEY, resource, () -> {
            Map<QualifiedName, EObject> name2element = new HashMap<>();
            resource.getAllContents().forEachRemaining(it -> name2element.put(qualifiedNameProvider.getFullyQualifiedName(it), it));
            return name2element;
        });
    }

    @Override
    public String getFragment(EObject obj, Fallback fallback) {
    	QualifiedName qualifiedName = qualifiedNameProvider.getFullyQualifiedName(obj);
        if (qualifiedName != null) {
            return qualifiedNameConverter.toString(qualifiedName);
        } else {
            return fallback.getFragment(obj);
        }
    }
}
