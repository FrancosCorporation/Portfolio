package exerc2;

import java.util.Random;

import javax.swing.JOptionPane;

public class AdivinhaNumero {
	private int numero;

	public AdivinhaNumero() {
		sorteiaNumero();
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	 public void sorteiaNumero() {
		Random gerador = new Random();
		numero = gerador.nextInt(100) + 1;
	}
	 public boolean dica(int tentativa) {
		 if(tentativa == numero) {
			JOptionPane.showMessageDialog(null, "Acertou");
			return true;
		 }
		 else if(tentativa>numero)
			 JOptionPane.showMessageDialog(null, "O numero eh Menor !!");
			
		 else
			 JOptionPane.showMessageDialog(null, "O numero eh Maior !!");
		 return false;
		 }
		
	 }

