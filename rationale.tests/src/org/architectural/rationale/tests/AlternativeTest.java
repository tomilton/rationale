/**
 */
package org.architectural.rationale.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.architectural.rationale.Alternative;
import org.architectural.rationale.RationaleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlternativeTest extends TestCase {

	/**
	 * The fixture for this Alternative test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alternative fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlternativeTest.class);
	}

	/**
	 * Constructs a new Alternative test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Alternative test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Alternative fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Alternative test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alternative getFixture() {
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
		setFixture(RationaleFactory.eINSTANCE.createAlternative());
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

} //AlternativeTest
