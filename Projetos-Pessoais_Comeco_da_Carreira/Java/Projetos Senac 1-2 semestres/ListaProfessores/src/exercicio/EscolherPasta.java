package exercicio;

import javax.swing.JFileChooser;

public class EscolherPasta {
	public String escolherPasta() {
		JFileChooser cm = new JFileChooser();
		cm.setDialogTitle("Selecione a Pasta Caminho. ");
		cm.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		cm.showSaveDialog(null);
		String nomearq = cm.getSelectedFile().getAbsolutePath();
		return nomearq;
	}
}
