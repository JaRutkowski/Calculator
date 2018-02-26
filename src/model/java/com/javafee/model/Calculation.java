package com.javafee.model;

import com.javafee.model.exception.DivisionByZeroException;

import lombok.Getter;
import lombok.Setter;

/**
 * The base class for specific calculation classes having base method like
 * <code>calculate()</calculate> and getters, setter for <code>firtVariable</code>
 * and <code>secondVariable</code>.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see Addition
 * @see Substraction
 * @see Multiplication
 * @see Division
 * @see com.javafee.model
 */
public abstract class Calculation {
	private @Getter @Setter Double firstVariable = null;
	private @Getter @Setter Double secondVariable = null;

	public abstract Double calculate(Double firstVariable, Double secondVariable);

	public Double calculate(Double... values) {
		return null;
	}

	public Double calculate(String... values) {
		return null;
	}

	public Double calculate(String firstVariable, String secondVariable) throws DivisionByZeroException {
		return null;
	}
}
