/**
 */
package org.architectural.rationale.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.architectural.rationale.Justification;
import org.architectural.rationale.RationaleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JustificationTest extends TestCase {

	/**
	 * The fixture for this Justification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Justification fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JustificationTest.class);
	}

	/**
	 * Constructs a new Justification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustificationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Justification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Justification fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Justification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Justification getFixture() {
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
		setFixture(RationaleFactory.eINSTANCE.createJustification());
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

} //JustificationTest
