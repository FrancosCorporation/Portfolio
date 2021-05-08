package geral;

import javax.swing.JFileChooser;

public class BackEnd {
	
	public String LerArquivo() {
		
		return null;
		
	}
	public static String EscolherArquivo() {
		JFileChooser cm = new JFileChooser();
		cm.setDialogTitle("Selecione o Caminho do arquivo. ");
		cm.showSaveDialog(null);
		String caminho = cm.getSelectedFile().getAbsolutePath();
		return caminho;
	}
	public static String EscolherPasta() {
		JFileChooser cm = new JFileChooser();
		cm.setDialogTitle("Selecione a Pasta Caminho. ");
		cm.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		cm.showSaveDialog(null);
		String pasta = cm.getSelectedFile().getAbsolutePath();
		return pasta;
	}
public static void main (String args []) {
	System.out.println(EscolherArquivo());
	System.out.println(EscolherPasta());
	
}
}
