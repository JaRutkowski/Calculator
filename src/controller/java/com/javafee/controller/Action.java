package com.javafee.controller;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import com.javafee.model.Addition;
import com.javafee.model.Division;
import com.javafee.model.Multiplication;
import com.javafee.model.Substraction;
import com.javafee.view.frame.CalculatorFrame;
import com.javafee.view.utils.Constans;
import com.javafee.view.utils.dialog.SimpleDialog;

/**
 * <i>Action</i> class with actions methods connecting view with business logic.
 * Use <code>control()</code> method to initialize form.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.controller
 */
public class Action {

	private CalculatorFrame calculatorFrame;

	private StringBuilder firstVariable = new StringBuilder("");
	private StringBuilder secondVariable = new StringBuilder("");
	private StringBuilder calculationHistory = new StringBuilder("");

	private Boolean isBtnSignClicked = false;
	private String sign = "";

	/**
	 * Control method which initialize CalculatorFrame.
	 */
	public void control() {
		initializeCalculatorFrame();
	}

	/**
	 * InitializeCalculatorFrame method which initialize new CalculatorFrame.
	 * 
	 * @exception Exception
	 */
	private void initializeCalculatorFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorFrame = new CalculatorFrame();
					calculatorFrame.setVisible(true);
					
					calculatorFrame.getStandardButtonPanel().getBtnZero().addActionListener(e -> onClickBtnNumber(Constans.ZERO));
					calculatorFrame.getStandardButtonPanel().getBtnOne().addActionListener(e -> onClickBtnNumber(Constans.ONE));
					calculatorFrame.getStandardButtonPanel().getBtnTwo().addActionListener(e -> onClickBtnNumber(Constans.TWO));
					calculatorFrame.getStandardButtonPanel().getBtnThree().addActionListener(e -> onClickBtnNumber(Constans.THREE));
					calculatorFrame.getStandardButtonPanel().getBtnFour().addActionListener(e -> onClickBtnNumber(Constans.FOUR));
					calculatorFrame.getStandardButtonPanel().getBtnFive().addActionListener(e -> onClickBtnNumber(Constans.FIVE));
					calculatorFrame.getStandardButtonPanel().getBtnSix().addActionListener(e -> onClickBtnNumber(Constans.SIX));
					calculatorFrame.getStandardButtonPanel().getBtnSeven().addActionListener(e -> onClickBtnNumber(Constans.SEVEN));
					calculatorFrame.getStandardButtonPanel().getBtnEight().addActionListener(e -> onClickBtnNumber(Constans.EIGHT));
					calculatorFrame.getStandardButtonPanel().getBtnNine().addActionListener(e -> onClickBtnNumber(Constans.NINE));

					calculatorFrame.getStandardButtonPanel().getBtnPlusSign().addActionListener(e -> onClickBtnSign(Constans.PLUS_SIGN));
					calculatorFrame.getStandardButtonPanel().getBtnMinusSign().addActionListener(e -> onClickBtnSign(Constans.MINUS_SIGN));
					calculatorFrame.getStandardButtonPanel().getBtnMultiplicationSign()
							.addActionListener(e -> onClickBtnSign(Constans.MULTIPLICATION_SIGN));
					calculatorFrame.getStandardButtonPanel().getBtnDivisionSign().addActionListener(e -> onClickBtnSign(Constans.DIVISION_SIGN));

					calculatorFrame.getStandardButtonPanel().getBtnEqualSign().addActionListener(e -> onClickBtnEqual());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void reloadTextFieldResult(String text) {
		calculatorFrame.getTextFieldResult().setText(text);
	}

	private void reloadTextFieldCalculationHistory(String text) {
		calculatorFrame.getTextFieldCalculationHistory().setText(text);
	}

	private void clearTextFieldResult() {
		calculatorFrame.getTextFieldResult().setText("");
	}

	private void onClickBtnNumber(String currentNumber) {
		if (!isBtnSignClicked) {
			firstVariable.append(currentNumber);
			calculationHistory.append(firstVariable);
			this.reloadTextFieldResult(firstVariable.toString());
			this.reloadTextFieldCalculationHistory(calculationHistory.toString());
		} else {
			secondVariable.append(currentNumber);
			calculationHistory.append(secondVariable);
			this.reloadTextFieldResult(secondVariable.toString());
			this.reloadTextFieldCalculationHistory(calculationHistory.toString());
		}
	}

	private void onClickBtnSign(String sign) {
		isBtnSignClicked = true;
		this.sign = sign;
		calculationHistory.append(this.sign);
		clearTextFieldResult();
		this.reloadTextFieldCalculationHistory(calculationHistory.toString());
	}

	private void onClickBtnEqual() {
		Double result = null;
		switch (sign) {
		case Constans.PLUS_SIGN:
			result = new Addition().calculate(firstVariable.toString(), secondVariable.toString());
			break;

		case Constans.MINUS_SIGN:
			result = new Substraction().calculate(firstVariable.toString(), secondVariable.toString());
			break;

		case Constans.MULTIPLICATION_SIGN:
			result = new Multiplication().calculate(firstVariable.toString(), secondVariable.toString());
			break;

		case Constans.DIVISION_SIGN:
			result = new Division().calculate(firstVariable.toString(), secondVariable.toString());
			if (result == null)
				SimpleDialog.createDialog(calculatorFrame, "B³¹d", "B³¹d", JOptionPane.ERROR_MESSAGE);
			break;

		default:
			break;
		}
		reloadTextFieldResult(result.toString());
	}
}