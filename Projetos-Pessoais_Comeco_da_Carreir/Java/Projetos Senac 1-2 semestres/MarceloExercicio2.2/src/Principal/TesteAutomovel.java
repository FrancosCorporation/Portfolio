package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import carros.*;

public class TesteAutomovel {

	public static void main(String[] args) {
		int i = 0;
		ArrayList<Automovel> listaAutomoveis = new ArrayList<Automovel>();
		while (true) {
			System.out.println("Digite o modelo do automovel: ");
			String modelo = new Scanner(System.in).nextLine();
			int id = 1;
			String fabricante = "loko";
			String cor = "azul";
			String placa = "oxv-1346";
			String chassi = "";
			int ano = 2019;
			Automovel carronovo = new Automovel(id, fabricante, modelo, cor, placa, chassi, ano);
			if (modelo.equalsIgnoreCase("0")) {
				break;
			}
			carronovo.setModelo(modelo);
			listaAutomoveis.add(carronovo);
			i++;
		}
		i = 0;
		while (i < listaAutomoveis.size()) {
			System.out.println(listaAutomoveis.get(i));
			i++;

		}

	}

}
