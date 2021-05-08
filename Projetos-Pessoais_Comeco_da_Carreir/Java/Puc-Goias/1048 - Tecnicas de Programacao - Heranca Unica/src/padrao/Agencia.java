package padrao;

public class Agencia {
	private int agencia;

	public int getAgencia() {
		return agencia;
	}

	public Agencia(String estado) {
		if(estado.equalsIgnoreCase("go")) {
			this.agencia = 1764;
		}
		else if(estado.equalsIgnoreCase("go")) {
			this.agencia = 3457;
		}
	}
}
