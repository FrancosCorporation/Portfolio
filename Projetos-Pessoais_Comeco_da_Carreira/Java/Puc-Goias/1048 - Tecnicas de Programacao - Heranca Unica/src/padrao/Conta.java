package padrao;

public class Conta {
	protected int agencia;
	protected int contaCorrente;
	private float saldo=0;
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setContaCorrente(char contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public void depositar(float valorDeposito) {
		this.saldo +=valorDeposito;
	}
	public float saldo() {
		return this.saldo;
		
	}
}
