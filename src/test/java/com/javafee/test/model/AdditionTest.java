package com.javafee.test.model;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.javafee.model.Addition;

/**
 * Test class for Addition.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see Addition
 * @see com.javafee.test.model
 */
@RunWith(Parameterized.class)
class AdditionTest {
	// private Addition addition;
	//
	// @BeforeEach
	// public void initialize() {
	// this.addition = new Addition();
	// }
	//
	// @DisplayName("Should calculate the correct sum")
	// @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
	// @MethodSource("sumProvider")
	// void sum(Double a, Double b, Double sum) {
	// assertEquals(sum, addition.calculate(a, b));
	// }
	//
	// private static Stream<Arguments> sumProvider() {
	// return Stream.of(
	// Arguments.of(1.0, 1.0, 2.0),
	// Arguments.of(2.0, 3.0, 5.0)
	// );
	// }
}
