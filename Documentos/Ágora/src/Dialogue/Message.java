package Dialogue;

import javax.swing.JOptionPane;

public class Message {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Digite una cadena: ");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
	}
	
}
