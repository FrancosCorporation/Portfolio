import javax.swing.JOptionPane;

public class App {
	private static Lista lista;

	public static int Escolha() {
		int n;
		return n = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\n\t       Lista de Convidados \n" + "\n\t 1. Configurar o tamanho da lista."
						+ "\n 2. Conferir tamanho da lista." + "\n 3. Inserir Pessoa."
						+ "\n 4. Ver lista de Convidados." + "\n 5. Busca por Pessoa." + "\n 6. Retira Pessoa."
						+ "\n 7. Substituir Pessoa." + "\n 8. Ver lista em ordem Alfabética." + "\n 0. Sair.\n\n"));
	}

	public static void main(String[] args) throws Exception {
		int n = 0;
		lista = new Lista(5);
		do {
			n = Escolha();
			switch (n) {

			case 1:

				//lista = new Lista(retornaNumero(0));
				
				break;
			case 2:
				//todas as condicoes que estiverem com a Lista!=null sao para que trave a condicao e nao crash o programa, impede o usuario tentar acessar uma lista nula !!
				if (lista != null) {
					JOptionPane.showMessageDialog(null, "\n\t   A lista tem tamanho " + lista.tamanho());
					break;
				} else
					JOptionPane.showMessageDialog(null,
							"Voce nao configurou um tamanho, por esse motivo nao foi possivel conferir o tamanho !!");
				break;
			case 3:

				if (lista != null) {
					if (lista.cheia() == true) {
						JOptionPane.showMessageDialog(null, "\t  - A lista está cheia -\n");
						break;
					} else {
						lista.insere(JOptionPane.showInputDialog("Insira Pessoa: "));
					}

				} else
					JOptionPane.showMessageDialog(null,
							"Sua Lista Esta sem tamanho, tente configurar um tamanho para ela !!");
				break;
			case 4:
				if (lista != null) {
					lista.imprime();
					break;
				} else
					JOptionPane.showMessageDialog(null,
							"Sua Lista Ainda nao pode ser impressa, infelizmente voce nao selecionou o Tamanho da lista !!");
				break;
			case 5:
				if (lista != null) {
					if (lista.vazia() == true) {
						JOptionPane.showMessageDialog(null, "A lista está vazia\n");
					} else {
						if (lista.pesquisa(
								JOptionPane.showInputDialog("\nDigite um nome para verificar se existe na lista:")
										.toLowerCase()) != null) {
							JOptionPane.showMessageDialog(null, "Essa pessoa está na lista!\n");
							break;
						} else {
							JOptionPane.showMessageDialog(null, "Essa pessoa ainda não foi incluida!\n");
							break;
						}
					}
				} else
					JOptionPane.showMessageDialog(null,
							"Nao foi configurado um tamanho para a lista, Por esse motivo nao é possivel fazer a busca !!");
				break;
			case 6:

				if (lista != null) {
					if (lista.vazia() == true) {
						JOptionPane.showMessageDialog(null, "A lista está vazia!\n");
						break;
					} else {
						String nome;
						if (lista.pesquisa(nome = JOptionPane
								.showInputDialog("Digite o nome da pessoa que deseja retirar:")) == null) {
							JOptionPane.showMessageDialog(null,
									"Essa pessoa não está na lista e não pode ser retirada\n");
							break;
						} else {
							lista.retira(nome);
							JOptionPane.showMessageDialog(null, "Pessoa " + nome + " foi retirada com sucesso!\n");
							break;
						}
					}

				} else
					JOptionPane.showMessageDialog(null,
							"Talvez voce nao tenha configurado um tamanho para a lista, Talvez seja melhor Configura-lo !!");
				break;
						
			}
			
				

		} while (n != 0);
		JOptionPane.showMessageDialog(null, "Astalavista, Baby");
	}
	public static int retornaNumero(int n) {
		int nova;
		do {
			nova =Integer.parseInt(JOptionPane.showInputDialog("Informe um numero acima de: "+n+" Para configurar o tamanho !!"));
		}while(nova<=n);
		return nova;
		
	}

}