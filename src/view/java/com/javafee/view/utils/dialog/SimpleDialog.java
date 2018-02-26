package com.javafee.view.utils.dialog;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * Common visual class describing standard dialogs.
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see JOptionPane
 * @see com.javafee.view.utils.dialog
 */
public class SimpleDialog {
	public static void createDialog(Component frame, Object message, String title, int messageType) {
		JOptionPane.showMessageDialog(frame, message, title, messageType);
	}
}
