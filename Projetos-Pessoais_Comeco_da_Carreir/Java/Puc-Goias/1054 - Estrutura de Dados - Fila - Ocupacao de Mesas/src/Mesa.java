
public class Mesa {
	private boolean[] lugares;

	public Mesa() {
		lugares = new boolean[6];
	}

	public void setOcup(int l) { // seta lugar como ocupado
		if (!lugares[l]) {
			lugares[l] = true;
		}
	}

	public int numeroDeLugares() { // lugares desocupados
		return lugares.length;
	}

	public int lugaresOcupados() { // lugares ocupados na mesa
		int j = 0;
		for (int i = 0; i < lugares.length; i++) {
			j++;
		}		return j;
	}

	public boolean mesaCheia() {
		int j = 0;
		for (int i = 0; i < lugares.length; i++) {
			if (lugares[i]) {
				j++;
			}
		}
		if (j == lugares.length) {
			return true;
		}
		return false;	}

	public boolean getOcup(int l) { // ocupado ou livre?
		return lugares[l];
	}

	public String toString() {

		String str = "";
		for (int i = 0; i < lugares.length; i++) {
			str += "Lugar " + (i + 1) + ": " + ((lugares[i]) ? "ocupado" : "livre") + "\n";
		}

		return str;
	}

}
