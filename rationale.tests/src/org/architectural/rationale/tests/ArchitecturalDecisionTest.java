/**
 */
package org.architectural.rationale.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.RationaleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Architectural Decision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturalDecisionTest extends TestCase {

	/**
	 * The fixture for this Architectural Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalDecision fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArchitecturalDecisionTest.class);
	}

	/**
	 * Constructs a new Architectural Decision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalDecisionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Architectural Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ArchitecturalDecision fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Architectural Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalDecision getFixture() {
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
		setFixture(RationaleFactory.eINSTANCE.createArchitecturalDecision());
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

} //ArchitecturalDecisionTest
