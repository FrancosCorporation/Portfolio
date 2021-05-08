import javax.swing.JOptionPane;

public class Casa {
	private Mesa[] mesas;
	private int quantMesas = 100;

	public int getQuantMesas() {
		return quantMesas;
	}

	public Casa() {
		mesas = new Mesa[quantMesas];
		for (int i = 0; i < mesas.length; i++) {
			mesas[i] = new Mesa();
		}
		// popula array mesas com 100 mesas
	}

	public boolean reservar(int mesa, int lugares) {
		if (mesa <= 0 || mesa > quantMesas) {
			JOptionPane.showMessageDialog(null,"Numero da mesa nao corresponde a uma mesa existente !!");
			return false;
			// numero de mesas acima do estipulado
		}

		else if (lugares <= 0 || lugares > 6) {
			JOptionPane.showMessageDialog(null,"Numero de lugares nao corresponde ao que existe em uma mesa !!");
			return false;
			// numero de lugares acima do estipulado
		}

		Mesa m = mesas[mesa - 1]; // escolhe mesa

		if (m.mesaCheia()) {
			// se estiver totalmente ocupada retorna falso e não usar
			return false;

		} else {

			int[] aux = new int[m.lugaresOcupados()];
			// aux é um vetor de auxilio

			for (int i = 0; i < aux.length; i++) {
				aux[i] = -1;
				// vetor de auxilio inicializado com -1
			}

			int aux2 = 0;
			// outro vetor de auxilio]

			for (int i = 0; i < m.lugaresOcupados(); i++) {
				if (aux2 == lugares) {
					// se o vetor auxiliar2 ter o mesmo numero de lugares,
					break;
					// para aqui pois ela consegue receber a quantidade de lugares solicitadas
				} else {
					if (!m.getOcup(i)) {
						// se cadeira estiver livre
						aux[i] = i;  
						// salva posicao da mesa
						aux2 ++;
					}
				}
			}
			if (lugares == aux2) { // se o numero de lugares for o mesmo das cadeiras desocupadas
				for (int i = 0; i < aux.length; i++) {
					if(aux[i] != -1) {
						m.setOcup(aux[i]);
					}
				}
				return true;
			}
			return false;
		}
	}


	public String toString() {
		String str = "";
		for (int i = 0; i < mesas.length; i++) {
			str += "Mesa "+(i+1)+":"+"\n";
			str += mesas[i].toString();
		}
		return str;
	}
	
	
}
