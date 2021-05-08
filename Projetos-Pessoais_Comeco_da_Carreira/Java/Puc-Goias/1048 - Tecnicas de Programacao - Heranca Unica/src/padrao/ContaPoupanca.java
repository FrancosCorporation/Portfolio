package padrao;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {
	private int diaDeposito;
	private Cliente cliente;
	private Agencia ag;

	protected ContaPoupanca() {
	}

	protected ContaPoupanca(int n, String estado) {
		ag = new Agencia(estado);
		super.contaCorrente = n;
		this.diaDeposito = 0;
		super.agencia = ag.getAgencia();
	}

	public int getDiaDeposito() {
		return diaDeposito;
	}

	public void setDiaDeposito(int diaDeposito) {
		this.diaDeposito = diaDeposito;
	}

	public void verLucro() {
		if (this.diaDeposito != 0) {
			JOptionPane.showMessageDialog(null, super.saldo() * 0.05 * this.getDiaDeposito());

		} else
			JOptionPane.showMessageDialog(null, "Nenhum lucro, pelo dia definido nao rendeu lucro !!");

	}

	public int getcontaCorrente() {
		return super.contaCorrente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public float verSaldo() {
		return super.saldo();
	}

	public void setCliente(String cpf, String nome, String telefone) {
		this.cliente = new Cliente();
		this.cliente.setNome(nome);
		this.cliente.setTelefone(telefone);
		this.cliente.setCpf(cpf);
	}

}
