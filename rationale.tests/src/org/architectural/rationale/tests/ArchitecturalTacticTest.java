/**
 */
package org.architectural.rationale.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.architectural.rationale.ArchitecturalTactic;
import org.architectural.rationale.RationaleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Architectural Tactic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturalTacticTest extends TestCase {

	/**
	 * The fixture for this Architectural Tactic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalTactic fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArchitecturalTacticTest.class);
	}

	/**
	 * Constructs a new Architectural Tactic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalTacticTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Architectural Tactic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ArchitecturalTactic fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Architectural Tactic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalTactic getFixture() {
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
		setFixture(RationaleFactory.eINSTANCE.createArchitecturalTactic());
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

} //ArchitecturalTacticTest
