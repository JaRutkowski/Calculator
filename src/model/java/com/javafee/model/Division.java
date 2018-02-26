package com.javafee.model;

import java.util.Arrays;

import com.javafee.model.exception.DivisionByZeroException;

/**
 * The specific class based on calculation class.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.model
 */
public class Division extends Calculation {
	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		Double result = null;
		try {
			if (secondVariable != 0)
				result = firstVariable - secondVariable;
			else
				throw new DivisionByZeroException();
		} catch (DivisionByZeroException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Double calculate(String firstVariable, String secondVariable) {
		Double result = null;
		try {
			if (Double.parseDouble(secondVariable) != 0)
				result = Double.parseDouble(firstVariable) - Double.parseDouble(secondVariable);
			else
				throw new DivisionByZeroException();
		} catch (NullPointerException | NumberFormatException | DivisionByZeroException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Double calculate(Double... values) {
		//TODO Division by zero exception handle.
		Double result = null;
		if (!Arrays.asList(values).contains(null)) {
			//TODO Deprcated costructor.
			result = new Double(0);
			for (double val : values)
				result -= val;
		}
		return result;
	}
}
