package com.javafee.view.panel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.javafee.view.utils.Constans;

import lombok.Getter;

/**
 * Common visual class describing standard button class having number buttons
 * from zero to nine, sign buttons (multiplication, division, plus, minus,
 * equal, dot) common buttons (delete and ac clearing all content) and special
 * buttons (element, percent, plus minus, inverse, square, ten to power, common
 * logarithm).
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see Constans
 * @see com.javafee.view.panel
 */
public class StandardButtonPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private @Getter JButton btnNine = null;
	private @Getter JButton btnEight = null;
	private @Getter JButton btnSeven = null;
	private @Getter JButton btnSix = null;
	private @Getter JButton btnFive = null;
	private @Getter JButton btnFour = null;
	private @Getter JButton btnThree = null;
	private @Getter JButton btnTwo = null;
	private @Getter JButton btnOne = null;
	private @Getter JButton btnZero = null;

	private @Getter JButton btnMultiplicationSign = null;
	private @Getter JButton btnDivisionSign = null;
	private @Getter JButton btnPlusSign = null;
	private @Getter JButton btnMinusSign = null;
	private @Getter JButton btnEqualSign = null;

	private @Getter JButton btnElementSign = null;
	private @Getter JButton btnPercentSign = null;
	private @Getter JButton btnPlusMinusSign = null;
	private @Getter JButton btnInverse = null;
	private @Getter JButton btnSquareSign = null;
	private @Getter JButton btnTenToPower = null;
	private @Getter JButton btnCommonLogarithm = null;
	private @Getter JButton btnDotSign = null;

	private @Getter JButton btnDelete = null;
	private @Getter JButton btnAc = null;

	public StandardButtonPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		btnNine = new JButton(Constans.NINE);
		GridBagConstraints gbc_btnNine = new GridBagConstraints();
		gbc_btnNine.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNine.insets = new Insets(0, 0, 5, 5);
		gbc_btnNine.gridx = 2;
		gbc_btnNine.gridy = 1;
		add(btnNine, gbc_btnNine);

		btnEight = new JButton(Constans.EIGHT);
		GridBagConstraints gbc_btnEight = new GridBagConstraints();
		gbc_btnEight.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEight.insets = new Insets(0, 0, 5, 5);
		gbc_btnEight.gridx = 1;
		gbc_btnEight.gridy = 1;
		add(btnEight, gbc_btnEight);

		btnSeven = new JButton(Constans.SEVEN);
		GridBagConstraints gbc_btnSeven = new GridBagConstraints();
		gbc_btnSeven.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSeven.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeven.gridx = 0;
		gbc_btnSeven.gridy = 1;
		add(btnSeven, gbc_btnSeven);

		btnSix = new JButton(Constans.SIX);
		GridBagConstraints gbc_btnSix = new GridBagConstraints();
		gbc_btnSix.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSix.insets = new Insets(0, 0, 5, 5);
		gbc_btnSix.gridx = 2;
		gbc_btnSix.gridy = 2;
		add(btnSix, gbc_btnSix);

		btnFive = new JButton(Constans.FIVE);
		GridBagConstraints gbc_btnFive = new GridBagConstraints();
		gbc_btnFive.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFive.insets = new Insets(0, 0, 5, 5);
		gbc_btnFive.gridx = 1;
		gbc_btnFive.gridy = 2;
		add(btnFive, gbc_btnFive);

		btnFour = new JButton(Constans.FOUR);
		GridBagConstraints gbc_btnFour = new GridBagConstraints();
		gbc_btnFour.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFour.insets = new Insets(0, 0, 5, 5);
		gbc_btnFour.gridx = 0;
		gbc_btnFour.gridy = 2;
		add(btnFour, gbc_btnFour);

		btnThree = new JButton(Constans.THREE);
		GridBagConstraints gbc_btnThree = new GridBagConstraints();
		gbc_btnThree.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnThree.insets = new Insets(0, 0, 5, 5);
		gbc_btnThree.gridx = 2;
		gbc_btnThree.gridy = 3;
		add(btnThree, gbc_btnThree);

		btnTwo = new JButton(Constans.TWO);
		GridBagConstraints gbc_btnTwo = new GridBagConstraints();
		gbc_btnTwo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTwo.insets = new Insets(0, 0, 5, 5);
		gbc_btnTwo.gridx = 1;
		gbc_btnTwo.gridy = 3;
		add(btnTwo, gbc_btnTwo);

		btnOne = new JButton(Constans.ONE);
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 0;
		gbc_btnOne.gridy = 3;
		add(btnOne, gbc_btnOne);

		btnZero = new JButton(Constans.ZERO);
		GridBagConstraints gbc_btnZero = new GridBagConstraints();
		gbc_btnZero.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZero.insets = new Insets(0, 0, 5, 5);
		gbc_btnZero.gridx = 0;
		gbc_btnZero.gridy = 4;
		add(btnZero, gbc_btnZero);

		btnMultiplicationSign = new JButton(Constans.MULTIPLICATION_SIGN);
		GridBagConstraints gbc_btnMultiplicationSign = new GridBagConstraints();
		gbc_btnMultiplicationSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMultiplicationSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiplicationSign.gridx = 3;
		gbc_btnMultiplicationSign.gridy = 2;
		add(btnMultiplicationSign, gbc_btnMultiplicationSign);

		btnDivisionSign = new JButton(Constans.DIVISION_SIGN);
		GridBagConstraints gbc_btnDivisionSign = new GridBagConstraints();
		gbc_btnDivisionSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDivisionSign.insets = new Insets(0, 0, 5, 0);
		gbc_btnDivisionSign.gridx = 4;
		gbc_btnDivisionSign.gridy = 2;
		add(btnDivisionSign, gbc_btnDivisionSign);

		btnPlusSign = new JButton(Constans.PLUS_SIGN);
		GridBagConstraints gbc_btnPlusSign = new GridBagConstraints();
		gbc_btnPlusSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlusSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlusSign.gridx = 3;
		gbc_btnPlusSign.gridy = 3;
		add(btnPlusSign, gbc_btnPlusSign);

		btnMinusSign = new JButton(Constans.MINUS_SIGN);
		GridBagConstraints gbc_btnMinusSign = new GridBagConstraints();
		gbc_btnMinusSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMinusSign.insets = new Insets(0, 0, 5, 0);
		gbc_btnMinusSign.gridx = 4;
		gbc_btnMinusSign.gridy = 3;
		add(btnMinusSign, gbc_btnMinusSign);

		btnEqualSign = new JButton(Constans.EQUAL_SIGN);
		GridBagConstraints gbc_btnEqualSign = new GridBagConstraints();
		gbc_btnEqualSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEqualSign.insets = new Insets(0, 0, 5, 0);
		gbc_btnEqualSign.gridx = 4;
		gbc_btnEqualSign.gridy = 4;
		add(btnEqualSign, gbc_btnEqualSign);

		btnElementSign = new JButton(Constans.ELEMENT_SIGN);
		GridBagConstraints gbc_btnElementSign = new GridBagConstraints();
		gbc_btnElementSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnElementSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnElementSign.gridx = 2;
		gbc_btnElementSign.gridy = 0;
		add(btnElementSign, gbc_btnElementSign);

		btnPercentSign = new JButton(Constans.PERCENT_SIGN);
		GridBagConstraints gbc_btnPercentSign = new GridBagConstraints();
		gbc_btnPercentSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPercentSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnPercentSign.gridx = 1;
		gbc_btnPercentSign.gridy = 0;
		add(btnPercentSign, gbc_btnPercentSign);

		btnPlusMinusSign = new JButton(Constans.PLUS_MINUS_SIGN);
		GridBagConstraints gbc_btnPlusMinusSign = new GridBagConstraints();
		gbc_btnPlusMinusSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlusMinusSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlusMinusSign.gridx = 0;
		gbc_btnPlusMinusSign.gridy = 0;
		add(btnPlusMinusSign, gbc_btnPlusMinusSign);

		btnInverse = new JButton(Constans.INVERSE_SIGN);
		GridBagConstraints gbc_btnInverse = new GridBagConstraints();
		gbc_btnInverse.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInverse.insets = new Insets(0, 0, 5, 0);
		gbc_btnInverse.gridx = 4;
		gbc_btnInverse.gridy = 0;
		add(btnInverse, gbc_btnInverse);

		btnSquareSign = new JButton(Constans.SQUARE_SIGN);
		GridBagConstraints gbc_btnSquareSign = new GridBagConstraints();
		gbc_btnSquareSign.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSquareSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnSquareSign.gridx = 3;
		gbc_btnSquareSign.gridy = 0;
		add(btnSquareSign, gbc_btnSquareSign);

		btnTenToPower = new JButton(Constans.TEN_TO_POWER_SIGN);
		GridBagConstraints gbc_btnTenToPower = new GridBagConstraints();
		gbc_btnTenToPower.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTenToPower.insets = new Insets(0, 0, 5, 5);
		gbc_btnTenToPower.gridx = 2;
		gbc_btnTenToPower.gridy = 4;
		add(btnTenToPower, gbc_btnTenToPower);

		btnCommonLogarithm = new JButton(Constans.COMMON_LOGARITHM);
		GridBagConstraints gbc_btnCommonLogarithm = new GridBagConstraints();
		gbc_btnCommonLogarithm.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCommonLogarithm.insets = new Insets(0, 0, 5, 5);
		gbc_btnCommonLogarithm.gridx = 3;
		gbc_btnCommonLogarithm.gridy = 4;
		add(btnCommonLogarithm, gbc_btnCommonLogarithm);

		btnDotSign = new JButton(Constans.DOT_SIGN);
		GridBagConstraints gbc_btnDot = new GridBagConstraints();
		gbc_btnDot.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDot.insets = new Insets(0, 0, 5, 5);
		gbc_btnDot.gridx = 1;
		gbc_btnDot.gridy = 4;
		add(btnDotSign, gbc_btnDot);

		btnDelete = new JButton(Constans.DELETE);
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelete.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelete.gridx = 3;
		gbc_btnDelete.gridy = 1;
		add(btnDelete, gbc_btnDelete);

		btnAc = new JButton(Constans.CLEAR);
		GridBagConstraints gbc_btnAc = new GridBagConstraints();
		gbc_btnAc.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAc.insets = new Insets(0, 0, 5, 0);
		gbc_btnAc.gridx = 4;
		gbc_btnAc.gridy = 1;
		add(btnAc, gbc_btnAc);
	}
}
