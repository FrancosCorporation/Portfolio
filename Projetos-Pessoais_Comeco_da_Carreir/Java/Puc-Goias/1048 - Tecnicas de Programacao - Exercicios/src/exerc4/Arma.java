package exerc4;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

public class Arma {
	private int capacidade, quantidade;

	public Arma() {
		this.capacidade = 8;
	}

	public Arma(int capacidade) {
		this.capacidade = capacidade;
	}

	public Arma(int capacidade, int quantidade) {
		this.capacidade = capacidade;
		this.quantidade = quantidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean disparar() {
		if (quantidade > 0) {
			JOptionPane.showMessageDialog(null, "Fogo !!");
			this.capacidade--;
			return true;
		} else
			return false;

	}

	public int recarregar() {

		if (this.quantidade > 0 && this.capacidade < 8) {
			int falta = 8 - this.capacidade;
			this.capacidade += falta;
			this.quantidade -= falta;
		}
		return this.quantidade;
	}
}
