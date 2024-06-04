/**
 */
package org.gemoc.agro.simulation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.gemoc.agro.simulation.ClimateData;
import org.gemoc.agro.simulation.SimulationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Climate Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClimateDataTest extends TestCase {

	/**
	 * The fixture for this Climate Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClimateData fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClimateDataTest.class);
	}

	/**
	 * Constructs a new Climate Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClimateDataTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Climate Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ClimateData fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Climate Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClimateData getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimulationFactory.eINSTANCE.createClimateData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ClimateDataTest
