package exerc5;

import javax.swing.JOptionPane;

public class ControleRemoto {
	ClasseTelevisao tv = new ClasseTelevisao();

	public void aumentarVolume() {
		if (tv.getVolume() < 50) {
			tv.setVolume(tv.getVolume() + 1);
			JOptionPane.showMessageDialog(null, "O volume agr esta em: " + tv.getVolume());
		} else
			JOptionPane.showMessageDialog(null, "O limite Maximo do volume foi atingido !!");
	}

	public void diminuirVolume() {
		if (tv.getVolume() > 0) {
			tv.setVolume(tv.getVolume() - 1);
			JOptionPane.showMessageDialog(null, "O volume agr esta em: " + tv.getVolume());
		} else
			JOptionPane.showMessageDialog(null, "O limite Minimo do volume foi atingido !!");
	}

	public void aumentarCanal() {
		if (tv.getCanal() < 100) {
			tv.setCanal(tv.getCanal() + 1);
			JOptionPane.showMessageDialog(null, "O Canal agr esta em: " + tv.getCanal());
		} else
			JOptionPane.showMessageDialog(null, "O limite Maximo de Canais foi atingido !!");
	}

	public void diminuirCanal() {
		if (tv.getCanal() > 10) {
			tv.setCanal(tv.getCanal() - 1);
			JOptionPane.showMessageDialog(null, "O Canal agr esta em: " + tv.getCanal());
		} else
			JOptionPane.showMessageDialog(null, "O limite Minimo de Canais foi atingido !!");
	}

	public void insiraOCanal(int n) {
		if (n > 10 || n < 100) {
			tv.setCanal(n);
		}
	}

	public void verTudo() {
		JOptionPane.showMessageDialog(null, "O Canal agr esta em: " + tv.getCanal());
		JOptionPane.showMessageDialog(null, "O Volume agr esta em: " + tv.getVolume());
	}

}
