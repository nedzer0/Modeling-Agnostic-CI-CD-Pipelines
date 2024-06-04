/**
 */
package org.gemoc.agro.scientific.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.agro.scientific.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScientificFactoryImpl extends EFactoryImpl implements ScientificFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScientificFactory init() {
		try {
			ScientificFactory theScientificFactory = (ScientificFactory)EPackage.Registry.INSTANCE.getEFactory(ScientificPackage.eNS_URI);
			if (theScientificFactory != null) {
				return theScientificFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScientificFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScientificFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScientificPackage.SURFACE_DATA: return createSurfaceData();
			case ScientificPackage.BIOMASS_MODEL: return createBiomassModel();
			case ScientificPackage.EXPLOITATION_ANALYSIS: return createExploitationAnalysis();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceData createSurfaceData() {
		SurfaceDataImpl surfaceData = new SurfaceDataImpl();
		return surfaceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiomassModel createBiomassModel() {
		BiomassModelImpl biomassModel = new BiomassModelImpl();
		return biomassModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExploitationAnalysis createExploitationAnalysis() {
		ExploitationAnalysisImpl exploitationAnalysis = new ExploitationAnalysisImpl();
		return exploitationAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScientificPackage getScientificPackage() {
		return (ScientificPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScientificPackage getPackage() {
		return ScientificPackage.eINSTANCE;
	}

} //ScientificFactoryImpl
