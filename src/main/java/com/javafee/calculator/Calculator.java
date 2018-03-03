package com.javafee.calculator;

import com.javafee.controller.Action;

/**
 * The main class of the project.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.calculator
 */
public class Calculator {
	/**
	 * The main method of the class which begin action.
	 * 
	 * @param args
	 *            command line arguments
	 * 
	 * @author JaRutkowski
	 * @version 1.0, 10 Mar 2018
	 * @see com.javafee.calculator
	 */
	public static void main(String[] args) {
		Action action = new Action();
		action.control();
	}
	
	private class A {
		private String test = "";

		A() {

		}

		public void dummy(int number) {
			number = 10;
			if (number == 0) {
				System.out.println("Zero");
			}
		}

	}
}
