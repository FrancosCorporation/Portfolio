package exerc4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Arma arm = new Arma();
		arm.setQuantidade(8);
		arm.disparar();
		arm.disparar();
		arm.disparar();
		JOptionPane.showMessageDialog(null,
				"Qnt de balas: " + arm.getCapacidade() + "\n ainda sobraram: " + arm.getQuantidade());
		JOptionPane.showMessageDialog(null, "Recarregando a arma..");
		arm.recarregar();
		JOptionPane.showMessageDialog(null,
				"Qnt de balas: " + arm.getCapacidade() + "\n ainda sobraram: " + arm.getQuantidade());

	}

}
