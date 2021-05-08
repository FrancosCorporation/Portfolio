package padrao;

import javax.swing.JOptionPane;

public class ClassePrincipal {

	public static void main(String[] args) {
		int dia, mes, ano;
		ClasseDeCalculo calculo = new ClasseDeCalculo();
		dia = calculo.verificador(1, 31, "Insira o Dia: ",
				"Infelizmente voce digitou uma data invalida, por favor Insira dnv um numero valido!!");
		
		mes = calculo.verificador(1, 12, "Insira o Mês: ",
				"Infelizmente voce digitou uma data invalida, por favor Insira dnv um numero valido!!");
		calculo.verificarMes(dia, mes);
		ano = calculo.verificador(1, 100000, "Insira o Ano: ",
				"Infelizmente voce digitou uma data invalida, por favor Insira dnv um numero valido!!");

	      
		JOptionPane.showMessageDialog(null, dia+"/"+mes+"/"+ano);
	}
}
