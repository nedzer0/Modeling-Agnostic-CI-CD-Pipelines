/**
 */
package org.gemoc.agro.simulation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.gemoc.agro.simulation.SchedulingFeedback;
import org.gemoc.agro.simulation.SimulationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scheduling Feedback</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingFeedbackTest extends TestCase {

	/**
	 * The fixture for this Scheduling Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingFeedback fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SchedulingFeedbackTest.class);
	}

	/**
	 * Constructs a new Scheduling Feedback test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingFeedbackTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scheduling Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SchedulingFeedback fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scheduling Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingFeedback getFixture() {
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
		setFixture(SimulationFactory.eINSTANCE.createSchedulingFeedback());
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

} //SchedulingFeedbackTest
