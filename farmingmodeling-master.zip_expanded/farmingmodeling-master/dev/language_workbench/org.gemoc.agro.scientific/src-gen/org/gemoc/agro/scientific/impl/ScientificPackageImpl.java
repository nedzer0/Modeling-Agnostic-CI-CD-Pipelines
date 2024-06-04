/**
 */
package org.gemoc.agro.scientific.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.exploitation.ExploitationPackage;
import org.gemoc.agro.scientific.BiomassModel;
import org.gemoc.agro.scientific.ExploitationAnalysis;
import org.gemoc.agro.scientific.ScientificFactory;
import org.gemoc.agro.scientific.ScientificPackage;
import org.gemoc.agro.scientific.SurfaceData;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScientificPackageImpl extends EPackageImpl implements ScientificPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biomassModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exploitationAnalysisEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.agro.scientific.ScientificPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScientificPackageImpl() {
		super(eNS_URI, ScientificFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScientificPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScientificPackage init() {
		if (isInited) return (ScientificPackage)EPackage.Registry.INSTANCE.getEPackage(ScientificPackage.eNS_URI);

		// Obtain or create and register package
		ScientificPackageImpl theScientificPackage = (ScientificPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScientificPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScientificPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimulationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScientificPackage.createPackageContents();

		// Initialize created meta-data
		theScientificPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScientificPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScientificPackage.eNS_URI, theScientificPackage);
		return theScientificPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceData() {
		return surfaceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceData_Biomass() {
		return (EAttribute)surfaceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceData_LAI() {
		return (EAttribute)surfaceDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceData_HydroDeficit() {
		return (EAttribute)surfaceDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceData_ExtraWater() {
		return (EAttribute)surfaceDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceData_Surface() {
		return (EReference)surfaceDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceData_Day() {
		return (EReference)surfaceDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiomassModel() {
		return biomassModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiomassModel_Eb() {
		return (EAttribute)biomassModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiomassModel_Eimax() {
		return (EAttribute)biomassModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiomassModel_K() {
		return (EAttribute)biomassModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiomassModel_Lmax() {
		return (EAttribute)biomassModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiomassModel_TI() {
		return (EAttribute)biomassModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiomassModel_A() {
		return (EAttribute)biomassModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiomassModel_B() {
		return (EAttribute)biomassModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiomassModel_Culture() {
		return (EReference)biomassModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExploitationAnalysis() {
		return exploitationAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploitationAnalysis_BiomassModels() {
		return (EReference)exploitationAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploitationAnalysis_SurfaceDatas() {
		return (EReference)exploitationAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploitationAnalysis_Schedule() {
		return (EReference)exploitationAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExploitationAnalysis_LimitBeforeWatering() {
		return (EAttribute)exploitationAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExploitationAnalysis_WateringQuantity() {
		return (EAttribute)exploitationAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExploitationAnalysis_KDaysToConsider() {
		return (EAttribute)exploitationAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScientificFactory getScientificFactory() {
		return (ScientificFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		surfaceDataEClass = createEClass(SURFACE_DATA);
		createEAttribute(surfaceDataEClass, SURFACE_DATA__BIOMASS);
		createEAttribute(surfaceDataEClass, SURFACE_DATA__LAI);
		createEAttribute(surfaceDataEClass, SURFACE_DATA__HYDRO_DEFICIT);
		createEAttribute(surfaceDataEClass, SURFACE_DATA__EXTRA_WATER);
		createEReference(surfaceDataEClass, SURFACE_DATA__SURFACE);
		createEReference(surfaceDataEClass, SURFACE_DATA__DAY);

		biomassModelEClass = createEClass(BIOMASS_MODEL);
		createEAttribute(biomassModelEClass, BIOMASS_MODEL__EB);
		createEAttribute(biomassModelEClass, BIOMASS_MODEL__EIMAX);
		createEAttribute(biomassModelEClass, BIOMASS_MODEL__K);
		createEAttribute(biomassModelEClass, BIOMASS_MODEL__LMAX);
		createEAttribute(biomassModelEClass, BIOMASS_MODEL__TI);
		createEAttribute(biomassModelEClass, BIOMASS_MODEL__A);
		createEAttribute(biomassModelEClass, BIOMASS_MODEL__B);
		createEReference(biomassModelEClass, BIOMASS_MODEL__CULTURE);

		exploitationAnalysisEClass = createEClass(EXPLOITATION_ANALYSIS);
		createEReference(exploitationAnalysisEClass, EXPLOITATION_ANALYSIS__BIOMASS_MODELS);
		createEReference(exploitationAnalysisEClass, EXPLOITATION_ANALYSIS__SURFACE_DATAS);
		createEReference(exploitationAnalysisEClass, EXPLOITATION_ANALYSIS__SCHEDULE);
		createEAttribute(exploitationAnalysisEClass, EXPLOITATION_ANALYSIS__LIMIT_BEFORE_WATERING);
		createEAttribute(exploitationAnalysisEClass, EXPLOITATION_ANALYSIS__WATERING_QUANTITY);
		createEAttribute(exploitationAnalysisEClass, EXPLOITATION_ANALYSIS__KDAYS_TO_CONSIDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExploitationPackage theExploitationPackage = (ExploitationPackage)EPackage.Registry.INSTANCE.getEPackage(ExploitationPackage.eNS_URI);
		SimulationPackage theSimulationPackage = (SimulationPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationPackage.eNS_URI);
		ActivitiesDSLPackage theActivitiesDSLPackage = (ActivitiesDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesDSLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(surfaceDataEClass, SurfaceData.class, "SurfaceData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurfaceData_Biomass(), ecorePackage.getEBigDecimal(), "biomass", null, 0, 1, SurfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceData_LAI(), ecorePackage.getEBigDecimal(), "LAI", null, 0, 1, SurfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceData_HydroDeficit(), ecorePackage.getEDouble(), "hydroDeficit", null, 0, 1, SurfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceData_ExtraWater(), ecorePackage.getEDouble(), "extraWater", null, 0, 1, SurfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurfaceData_Surface(), theExploitationPackage.getSurface(), null, "surface", null, 0, 1, SurfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurfaceData_Day(), theSimulationPackage.getDay(), null, "day", null, 0, 1, SurfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biomassModelEClass, BiomassModel.class, "BiomassModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiomassModel_Eb(), ecorePackage.getEFloat(), "Eb", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiomassModel_Eimax(), ecorePackage.getEFloat(), "Eimax", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiomassModel_K(), ecorePackage.getEFloat(), "K", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiomassModel_Lmax(), ecorePackage.getEFloat(), "Lmax", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiomassModel_TI(), ecorePackage.getEFloat(), "TI", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiomassModel_A(), ecorePackage.getEFloat(), "A", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiomassModel_B(), ecorePackage.getEFloat(), "B", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiomassModel_Culture(), theActivitiesDSLPackage.getCulture(), null, "culture", null, 0, 1, BiomassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exploitationAnalysisEClass, ExploitationAnalysis.class, "ExploitationAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExploitationAnalysis_BiomassModels(), this.getBiomassModel(), null, "biomassModels", null, 1, -1, ExploitationAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploitationAnalysis_SurfaceDatas(), this.getSurfaceData(), null, "surfaceDatas", null, 0, -1, ExploitationAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploitationAnalysis_Schedule(), theSimulationPackage.getSchedule(), null, "schedule", null, 0, 1, ExploitationAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExploitationAnalysis_LimitBeforeWatering(), ecorePackage.getEDouble(), "limitBeforeWatering", "-60", 0, 1, ExploitationAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExploitationAnalysis_WateringQuantity(), ecorePackage.getEDouble(), "wateringQuantity", "40", 0, 1, ExploitationAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExploitationAnalysis_KDaysToConsider(), ecorePackage.getEInt(), "kDaysToConsider", "15", 0, 1, ExploitationAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ScientificPackageImpl
