package gui;

import javax.swing.*;

public class Login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame loginFrame;
	Login(){
		this.loginFrame = new JFrame();
	}

	public static void main(String args[]) {
		new Login().setVisible(true);
	}
}
