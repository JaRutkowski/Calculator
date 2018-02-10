package com.javafee.model;

import java.util.Arrays;

/**
 * The specific class based on calculation class
 * 
 * @author JaRutkowski
 */
public class Addition extends Calculation {
	@Override
	public Double calculate(Double firstVariable, Double seconVariable) {
		return firstVariable + seconVariable;
	}

	@Override
	public Double calculate(String firstVariable, String seconVariable) {
		Double result = null;
		try{
			result = Double.parseDouble(firstVariable) + Double.parseDouble(seconVariable);
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
