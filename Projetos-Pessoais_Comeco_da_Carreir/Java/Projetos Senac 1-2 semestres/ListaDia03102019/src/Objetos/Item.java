package Objetos;

import javax.swing.JOptionPane;

public class Item {
private String nome;

public void lavar() {
	JOptionPane.showMessageDialog(null, "Lavando ");
}
public void encerrar() {
	
}
public void aspirrar() {
	
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

}
