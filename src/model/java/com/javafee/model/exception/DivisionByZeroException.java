package com.javafee.model.exception;

/**
 * Exception class for handling division by zero.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.model.exception
 */
public class DivisionByZeroException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace() {
		System.err.println("Cannot divide by zero.");
	}
}
