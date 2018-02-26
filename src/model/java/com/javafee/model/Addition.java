package com.javafee.model;

import java.util.Arrays;

/**
 * The specific class based on calculation class.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.model
 */
public class Addition extends Calculation {
	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable + secondVariable;
	}

	@Override
	public Double calculate(String firstVariable, String secondVariable) {
		Double result = null;
		try{
			result = Double.parseDouble(firstVariable) + Double.parseDouble(secondVariable);
		} catch(NullPointerException | NumberFormatException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Double calculate(Double... values) {
		Double result = null;
		if (!Arrays.asList(values).contains(null)) {
			result = new Double(0);
			for (double val : values)
				result += val;
		}
		return result;
	}
}
