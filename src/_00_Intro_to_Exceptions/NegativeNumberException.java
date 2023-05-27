package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{
	public static void scaryPopUp() {
		JOptionPane.showMessageDialog(null, "You have run into a critical error");
	}
}
