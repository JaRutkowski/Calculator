package com.javafee.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.javafee.model.Addition;

/**
 * Test class for Addition.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see Addition
 * @see com.javafee.test.model
 */
class AdditionTest {
	private Addition addition = new Addition();

	@BeforeEach
	public void init() {
		addition.setFirstVariable(5.0);
		addition.setSecondVariable(5.0);
	}

	/**
	 * Test method for two variables in type Double.
	 * {@link com.javafee.model.Addition#calculate(java.lang.Double, java.lang.Double)}.
	 */
	@Test
	void testCalculateDoubleDouble() {
		assertEquals(Double.valueOf(10.0),
				addition.calculate(addition.getFirstVariable(), addition.getSecondVariable()));
	}

	/**
	 * Test method for variable in type null.
	 * {@link com.javafee.model.Addition#calculate(java.lang.Double, java.lang.Double)}.
	 */
	// @Test
	// void testCalculateNull() {
	// addition.setFirtVariable(null);
	// addition.setSecondVariable(null);
	// assertNotNull("null", addition.calculate(addition.getFirtVariable(),
	// addition.getSecondVariable()));
	// }

	// /**
	// * Test method for
	// * {@link com.javafee.model.Addition#calculate(java.lang.Double[])}.
	// */
	// @Test
	// void testCalculateDoubleArray() {
	// fail("Not yet implemented");
	// }

	// /**
	// * Test method for
	// * {@link com.javafee.model.Addition#calculate(java.lang.String,
	// java.lang.String)}.
	// */
	// @Test
	// void testCalculateStringString() {
	// fail("Not yet implemented");
	// }
}
