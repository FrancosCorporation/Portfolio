package padrao;

import javax.swing.JOptionPane;

public class ClasseDeCalculo {
	private int dia, mes;
	int ano;

	public void verificarMes(int dia, int mes) {
		this.mes = mes;
		this.dia = dia;
		if (this.mes == 2) {
			if (this.dia > 29) {
				JOptionPane.showMessageDialog(null, "Voce inseriu um dia superior ao permitido para o Mes de Fevereiro ");
				verificador(1, 100000, "Infelizmente voce digitou o dia: " + dia
						+ ", mas para o mes de Fevereiro esse dia é invalido !! ", "");
			}
		}
	}

	public void verificarAno(int ano) {
		this.ano = ano;
	}

	public int verificador(int limitDown, int limitUp, String firstPharse, String secondPharse) {
		int variavel=0;
		while (variavel < limitDown || variavel > limitUp) {
			variavel = Integer.parseInt(JOptionPane.showInputDialog(null, firstPharse));
			if (variavel < limitDown || variavel > limitUp) {
				JOptionPane.showMessageDialog(null, secondPharse);
			}
		}
		return variavel;

	}

}
