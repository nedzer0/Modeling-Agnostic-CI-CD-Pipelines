/**
 */
package org.gemoc.agro.scientific;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.scientific.ScientificPackage
 * @generated
 */
public interface ScientificFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScientificFactory eINSTANCE = org.gemoc.agro.scientific.impl.ScientificFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Surface Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface Data</em>'.
	 * @generated
	 */
	SurfaceData createSurfaceData();

	/**
	 * Returns a new object of class '<em>Biomass Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biomass Model</em>'.
	 * @generated
	 */
	BiomassModel createBiomassModel();

	/**
	 * Returns a new object of class '<em>Exploitation Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exploitation Analysis</em>'.
	 * @generated
	 */
	ExploitationAnalysis createExploitationAnalysis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScientificPackage getScientificPackage();

} //ScientificFactory
