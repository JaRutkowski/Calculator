package com.javafee.view.frame;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.javafee.view.panel.StandardButtonPanel;

import lombok.Getter;

/**
 * Visual class describing main frame of the Calculator having navigation,
 * result and button panels.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.view.frame
 */
public class CalculatorFrame extends JfeeStandardFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private @Getter JTextField textFieldResult;
	private @Getter JTextField textFieldCalculationHistory;
	private @Getter StandardButtonPanel standardButtonPanel;

	public CalculatorFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 79, 87, 86, 85, 86, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 63, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		textFieldCalculationHistory = new JTextField();
		textFieldCalculationHistory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCalculationHistory.setEnabled(false);
		textFieldCalculationHistory.setEditable(false);
		textFieldCalculationHistory.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textFieldCalculationHistory = new GridBagConstraints();
		gbc_textFieldCalculationHistory.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCalculationHistory.gridwidth = 5;
		gbc_textFieldCalculationHistory.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCalculationHistory.gridx = 0;
		gbc_textFieldCalculationHistory.gridy = 0;
		contentPane.add(textFieldCalculationHistory, gbc_textFieldCalculationHistory);
		textFieldCalculationHistory.setColumns(10);

		textFieldResult = new JTextField();
		textFieldResult.setEditable(false);
		textFieldResult.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textFieldResult = new GridBagConstraints();
		gbc_textFieldResult.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldResult.gridwidth = 5;
		gbc_textFieldResult.fill = GridBagConstraints.BOTH;
		gbc_textFieldResult.gridx = 0;
		gbc_textFieldResult.gridy = 1;
		contentPane.add(textFieldResult, gbc_textFieldResult);
		textFieldResult.setColumns(10);

		standardButtonPanel = new StandardButtonPanel();
		GridBagConstraints gbc_standardButtonPanel = new GridBagConstraints();
		gbc_standardButtonPanel.gridwidth = 5;
		gbc_standardButtonPanel.fill = GridBagConstraints.BOTH;
		gbc_standardButtonPanel.gridx = 0;
		gbc_standardButtonPanel.gridy = 2;
		contentPane.add(standardButtonPanel, gbc_standardButtonPanel);
	}
}
