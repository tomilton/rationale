/**
 */
package org.architectural.rationale.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.architectural.rationale.Consequence;
import org.architectural.rationale.RationaleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Consequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsequenceTest extends TestCase {

	/**
	 * The fixture for this Consequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Consequence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConsequenceTest.class);
	}

	/**
	 * Constructs a new Consequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Consequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Consequence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Consequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Consequence getFixture() {
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
		setFixture(RationaleFactory.eINSTANCE.createConsequence());
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

} //ConsequenceTest
