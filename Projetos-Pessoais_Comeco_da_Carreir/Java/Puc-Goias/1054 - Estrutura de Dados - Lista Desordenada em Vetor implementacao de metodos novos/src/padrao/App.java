package padrao;
import javax.swing.JOptionPane;

public class App {
	static public int menu() {
		return Integer.parseInt(JOptionPane.showInputDialog(
				"1. Adicionar\n" + "2. Retirar\n" + "3. Consultar\n" + "4. Modificar\n" + "5. Sair\n" + "Digite:"));
	}

	public static void main(String[] args) {
		Lista lista = new Lista();
		int n;
		Item novo = null;
		//funcao tamanho da lista
	    lista.setTamanhoLista();
	    
	    //switch para o menu
		do {
			n = menu(); // recebe o valor do menu
			switch (n) {
			case 1:
				if (lista.adicionanaFila(lista.addItem())) {
					JOptionPane.showMessageDialog(null, "Sucesso!");
				} else
					JOptionPane.showMessageDialog(null, "Lista cheia");
				break;

			// retirar e consultar pede novamente descrição, quantidade e prioridade //
			// não retira e não faz consulta //

			case 2: // bug
				
				if (!lista.retira(lista.verificaItem())) {
					JOptionPane.showMessageDialog(null, "Insucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Item retirado com sucesso !!");
					break;
				}
			case 3: // bug
				novo = lista.verificaItem();
				if (novo == null) {
					JOptionPane.showMessageDialog(null, "Insucesso!");
				break;}
				else
					JOptionPane.showMessageDialog(null, novo.getItem());
				break;

			case 4:
				if (!lista.modificarItem(lista.verificaItem()))
					JOptionPane.showMessageDialog(null, "Voce Cancelou a operação !!");
				else
					JOptionPane.showMessageDialog(null, "Modificado com Sucesso !!");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Vejo Voce Em Uma Proxima !!");

			}
		} while (n != 5);
	}
}
