package backEnd;

import javax.swing.JOptionPane;

public class LogicaClinica {

	public boolean retornapergunta(String message) {
		boolean resposta = false;
		Object[] options = { "Confirmar", "Cancelar" };
		int op = JOptionPane.showOptionDialog(null, message, "Atenção",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, 0);
		if (op == 0) {
			return resposta = true;
		} else {
			return resposta;
		}

	}
}