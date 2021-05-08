package Objetos;

import javax.swing.JOptionPane;

public class Moto extends Item{
public void lavar(boolean motor) {
	if(motor) {
		JOptionPane.showMessageDialog(null, lavar());
	}
	else {
		lavar();
	}
}
}
