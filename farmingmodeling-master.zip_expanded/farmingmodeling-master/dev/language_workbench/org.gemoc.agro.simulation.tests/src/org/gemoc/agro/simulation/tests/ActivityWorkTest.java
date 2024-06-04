/**
 */
package org.gemoc.agro.simulation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.SimulationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Work</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityWorkTest extends TestCase {

	/**
	 * The fixture for this Activity Work test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityWork fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityWorkTest.class);
	}

	/**
	 * Constructs a new Activity Work test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityWorkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Activity Work test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActivityWork fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Activity Work test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityWork getFixture() {
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
		setFixture(SimulationFactory.eINSTANCE.createActivityWork());
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

} //ActivityWorkTest
