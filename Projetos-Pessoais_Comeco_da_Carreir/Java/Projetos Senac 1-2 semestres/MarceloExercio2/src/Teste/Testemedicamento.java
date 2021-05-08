package Teste;

import java.util.Date;

import remedio.*;

public class Testemedicamento {

	public static void main(String[] args) {
		Medicamento md= new Medicamento();
		Date datamedicamento1 = new Date(120,11,31,10,30,00);
		md.setDataValidade(datamedicamento1);
		Medicamento md1= new Medicamento(15, "DorFlex", "Dor de cabeça", "12 comprimidos", 500, md.getDataValidade());
		System.out.println(md1.getNome()+"\n"+md1.getId()+"\n"+md1.getPrincipioAtivo()+"\n"+md1.getUnd()+"\n"+md1.getQtdeEstoque()+"\n"+md1.getDataValidade());
	}

}
