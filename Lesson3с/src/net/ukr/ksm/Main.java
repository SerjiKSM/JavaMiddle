package net.ukr.ksm;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		double a;
		for (;;) {

			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			}
		}
		System.out.println(a);

	}

}
