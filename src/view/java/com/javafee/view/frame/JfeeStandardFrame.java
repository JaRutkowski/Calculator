package com.javafee.view.frame;

import javax.swing.JFrame;

import com.javafee.view.utils.Utils;

/**
 * Common visual class describing standard frame with following properties:
 * <p>
 * <ul>
 * <li>set look and feel
 * </ul>
 * <p>
 * 
 * @author JaRutkowski
 * @version 1.0, 10 Mar 2018
 * @see com.javafee.view.frame
 */
public class JfeeStandardFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public JfeeStandardFrame() {
		Utils.setLookAndFeel();
	}
}
