package com.javafee.view.utils;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Utils class for visual frames with common methods (functionality).
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.view.utils
 */
public class Utils {
	public static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
