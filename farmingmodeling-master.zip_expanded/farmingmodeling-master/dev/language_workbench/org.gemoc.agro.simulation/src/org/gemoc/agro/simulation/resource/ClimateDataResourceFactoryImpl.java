package org.gemoc.agro.simulation.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class ClimateDataResourceFactoryImpl extends ResourceFactoryImpl {

  @Override
  public Resource createResource(URI uri) {
    return new ClimateDataResourceImpl(uri);
  }
  
}
