package com.javafee.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalculatorFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textFieldResult;
	private JButton btnCE;
	private JButton btnBackspace;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn1;
	private JButton btn4;
	private JButton btn0;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btn6;
	private JButton btn3;
	private JButton btnPlusMinus;
	private JButton btnPlusSign;
	private JButton btnPercent;
	private JButton btnMultiplicationSign;
	private JButton btnMinusSign;
	private JButton btnEqualSign;
	private JButton btnDivisionSign;
	private JButton btnSquare;

	public CalculatorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{79, 87, 86, 85, 86, 0};
		gbl_contentPane.rowHeights = new int[]{63, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textFieldResult = new JTextField();
		textFieldResult.setEditable(false);
		textFieldResult.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textFieldResult, gbc_textField);
		textFieldResult.setColumns(10);
		
		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.gridwidth = 2;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 0;
		gbc_btnC.gridy = 1;
		contentPane.add(btnC, gbc_btnC);
		
		btnCE = new JButton("CE");
		GridBagConstraints gbc_btnCE = new GridBagConstraints();
		gbc_btnCE.fill = GridBagConstraints.BOTH;
		gbc_btnCE.gridwidth = 2;
		gbc_btnCE.insets = new Insets(0, 0, 5, 5);
		gbc_btnCE.gridx = 2;
		gbc_btnCE.gridy = 1;
		contentPane.add(btnCE, gbc_btnCE);
		
		btnBackspace = new JButton("\u2190");
		GridBagConstraints gbc_btnBackspace = new GridBagConstraints();
		gbc_btnBackspace.fill = GridBagConstraints.BOTH;
		gbc_btnBackspace.insets = new Insets(0, 0, 5, 0);
		gbc_btnBackspace.gridx = 4;
		gbc_btnBackspace.gridy = 1;
		contentPane.add(btnBackspace, gbc_btnBackspace);
		
		btn7 = new JButton("7");
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 0;
		gbc_btn7.gridy = 2;
		contentPane.add(btn7, gbc_btn7);
		
		btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 2;
		contentPane.add(btn8, gbc_btn8);
		
		btn9 = new JButton("9");
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 2;
		gbc_btn9.gridy = 2;
		contentPane.add(btn9, gbc_btn9);
		
		btnSquare = new JButton("\u221A");
		GridBagConstraints gbc_btnSquare = new GridBagConstraints();
		gbc_btnSquare.fill = GridBagConstraints.BOTH;
		gbc_btnSquare.insets = new Insets(0, 0, 5, 0);
		gbc_btnSquare.gridx = 4;
		gbc_btnSquare.gridy = 2;
		contentPane.add(btnSquare, gbc_btnSquare);
		
		btnPercent = new JButton("%");
		GridBagConstraints gbc_btnPercent = new GridBagConstraints();
		gbc_btnPercent.fill = GridBagConstraints.BOTH;
		gbc_btnPercent.insets = new Insets(0, 0, 5, 5);
		gbc_btnPercent.gridx = 3;
		gbc_btnPercent.gridy = 2;
		contentPane.add(btnPercent, gbc_btnPercent);

		
		btn4 = new JButton("4");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 3;
		contentPane.add(btn4, gbc_btn4);
		
		btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 1;
		gbc_btn5.gridy = 3;
		contentPane.add(btn5, gbc_btn5);
		
		btn6 = new JButton("6");
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 2;
		gbc_btn6.gridy = 3;
		contentPane.add(btn6, gbc_btn6);
		
		btnMultiplicationSign = new JButton("X");
		GridBagConstraints gbc_btnMultiplicationSign = new GridBagConstraints();
		gbc_btnMultiplicationSign.fill = GridBagConstraints.BOTH;
		gbc_btnMultiplicationSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiplicationSign.gridx = 3;
		gbc_btnMultiplicationSign.gridy = 3;
		contentPane.add(btnMultiplicationSign, gbc_btnMultiplicationSign);
		
		btnDivisionSign = new JButton("/");
		GridBagConstraints gbc_btnDivisionSign = new GridBagConstraints();
		gbc_btnDivisionSign.fill = GridBagConstraints.BOTH;
		gbc_btnDivisionSign.insets = new Insets(0, 0, 5, 0);
		gbc_btnDivisionSign.gridx = 4;
		gbc_btnDivisionSign.gridy = 3;
		contentPane.add(btnDivisionSign, gbc_btnDivisionSign);
		
		btn1 = new JButton("1");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 4;
		contentPane.add(btn1, gbc_btn1);
		
		btn2 = new JButton("2");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 4;
		contentPane.add(btn2, gbc_btn2);
		
		btn3 = new JButton("3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 4;
		contentPane.add(btn3, gbc_btn3);
		
		btnMinusSign = new JButton("-");
		GridBagConstraints gbc_btnMinusSign = new GridBagConstraints();
		gbc_btnMinusSign.fill = GridBagConstraints.BOTH;
		gbc_btnMinusSign.insets = new Insets(0, 0, 5, 0);
		gbc_btnMinusSign.gridx = 4;
		gbc_btnMinusSign.gridy = 4;
		contentPane.add(btnMinusSign, gbc_btnMinusSign);
		
		btn0 = new JButton("0");
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 0;
		gbc_btn0.gridy = 5;
		contentPane.add(btn0, gbc_btn0);
		
		btnDot = new JButton(".");
		GridBagConstraints gbc_btnDot = new GridBagConstraints();
		gbc_btnDot.fill = GridBagConstraints.BOTH;
		gbc_btnDot.insets = new Insets(0, 0, 0, 5);
		gbc_btnDot.gridx = 1;
		gbc_btnDot.gridy = 5;
		contentPane.add(btnDot, gbc_btnDot);
		
		btnPlusMinus = new JButton("+/-");
		GridBagConstraints gbc_btnPlusMinus = new GridBagConstraints();
		gbc_btnPlusMinus.fill = GridBagConstraints.BOTH;
		gbc_btnPlusMinus.insets = new Insets(0, 0, 0, 5);
		gbc_btnPlusMinus.gridx = 2;
		gbc_btnPlusMinus.gridy = 5;
		contentPane.add(btnPlusMinus, gbc_btnPlusMinus);
		
		btnPlusSign = new JButton("+");
		GridBagConstraints gbc_btnPlusSign = new GridBagConstraints();
		gbc_btnPlusSign.fill = GridBagConstraints.BOTH;
		gbc_btnPlusSign.gridheight = 2;
		gbc_btnPlusSign.insets = new Insets(0, 0, 0, 5);
		gbc_btnPlusSign.gridx = 3;
		gbc_btnPlusSign.gridy = 4;
		contentPane.add(btnPlusSign, gbc_btnPlusSign);
		
		btnEqualSign = new JButton("=");
		GridBagConstraints gbc_btnEqualSign = new GridBagConstraints();
		gbc_btnEqualSign.fill = GridBagConstraints.BOTH;
		gbc_btnEqualSign.gridx = 4;
		gbc_btnEqualSign.gridy = 5;
		contentPane.add(btnEqualSign, gbc_btnEqualSign);
	}

	public JTextField getTextFieldResult() {
		return textFieldResult;
	}
	
	public JButton getBtnCE() {
		return btnCE;
	}

	public JButton getBtnBackspace() {
		return btnBackspace;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JButton getBtn9() {
		return btn9;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn0() {
		return btn0;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtnDot() {
		return btnDot;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtnPlusMinus() {
		return btnPlusMinus;
	}

	public JButton getBtnPlusSign() {
		return btnPlusSign;
	}

	public JButton getBtnPercent() {
		return btnPercent;
	}

	public JButton getBtnMultiplicationSign() {
		return btnMultiplicationSign;
	}

	public JButton getBtnMinusSign() {
		return btnMinusSign;
	}

	public JButton getBtnEqualSign() {
		return btnEqualSign;
	}

	public JButton getBtnDivisionSign() {
		return btnDivisionSign;
	}

	public JButton getBtnSquare() {
		return btnSquare;
	}

	
}
